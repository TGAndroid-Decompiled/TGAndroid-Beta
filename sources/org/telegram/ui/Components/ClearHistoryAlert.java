package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.internal.mlkit_vision_common.zzkc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline1;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;

public class ClearHistoryAlert extends BottomSheet {
    private boolean autoDeleteOnly;
    private CheckBoxCell cell;
    private int currentTimer;
    private ClearHistoryAlertDelegate delegate;
    private boolean dismissedDelayed;
    private LinearLayout linearLayout;
    private int[] location;
    private int newTimer;
    private int scrollOffsetY;
    private BottomSheetCell setTimerButton;
    private Drawable shadowDrawable;

    public static class BottomSheetCell extends FrameLayout {
        private View background;
        private LinearLayout linearLayout;
        private final Theme.ResourcesProvider resourcesProvider;
        private TextView textView;

        public BottomSheetCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            View view = new View(context);
            this.background = view;
            int iDp = AndroidUtilities.dp(4.0f);
            int themedColor = getThemedColor(Theme.key_featuredStickers_addButton);
            int themedColor2 = getThemedColor(Theme.key_featuredStickers_addButtonPressed);
            view.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, themedColor, themedColor2, themedColor2));
            addView(this.background, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setLines(1);
            this.textView.setSingleLine(true);
            this.textView.setGravity(1);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setGravity(17);
            this.textView.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
            this.textView.setTextSize(1, 14.0f);
            this.textView.setTypeface(AndroidUtilities.bold());
            addView(this.textView, LayoutHelper.createFrame(-2, -2, 17));
        }

        public int getThemedColor(int i) {
            return Theme.getColor(i, this.resourcesProvider);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }
    }

    public ClearHistoryAlert(Context context, TLRPC.User user, TLRPC.Chat chat, boolean z, Theme.ResourcesProvider resourcesProvider) {
        int i;
        super(context, false, false, resourcesProvider);
        final int i2 = 0;
        this.location = new int[2];
        final int i3 = 1;
        this.autoDeleteOnly = !z;
        setApplyBottomPadding(false);
        if (user != null) {
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(user.id);
            if (userFull != null) {
                i = userFull.ttl_period;
            } else {
                i = 0;
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.id);
            if (chatFull != null) {
                i = chatFull.ttl_period;
            } else {
                i = 0;
            }
        }
        if (i == 0) {
            this.currentTimer = 0;
            this.newTimer = 0;
        } else if (i == 86400) {
            this.currentTimer = 1;
            this.newTimer = 1;
        } else if (i == 604800) {
            this.currentTimer = 2;
            this.newTimer = 2;
        } else {
            this.currentTimer = 3;
            this.newTimer = 3;
        }
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        int i4 = Theme.key_dialogBackground;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i4), PorterDuff.Mode.MULTIPLY));
        final NestedScrollView nestedScrollView = new NestedScrollView(context) {
            private boolean ignoreLayout;

            @Override
            public void onDraw(Canvas canvas) {
                int scrollY = (int) ((getScrollY() + (ClearHistoryAlert.this.scrollOffsetY - ((BottomSheet) ClearHistoryAlert.this).backgroundPaddingTop)) - getTranslationY());
                ClearHistoryAlert.this.shadowDrawable.setBounds(0, scrollY, getMeasuredWidth(), AndroidUtilities.dp(19.0f) + ((BottomSheet) ClearHistoryAlert.this).backgroundPaddingTop + ClearHistoryAlert.this.linearLayout.getMeasuredHeight() + scrollY);
                ClearHistoryAlert.this.shadowDrawable.draw(canvas);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || ClearHistoryAlert.this.scrollOffsetY == 0 || motionEvent.getY() >= ClearHistoryAlert.this.scrollOffsetY) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                ClearHistoryAlert.this.lambda$showGiftOfferSheet$15();
                return true;
            }

            @Override
            public void onLayout(boolean z2, int i5, int i6, int i7, int i8) {
                super.onLayout(z2, i5, i6, i7, i8);
                ClearHistoryAlert.this.updateLayout();
            }

            @Override
            public void onMeasure(int i5, int i6) {
                int size = View.MeasureSpec.getSize(i6);
                measureChildWithMargins(ClearHistoryAlert.this.linearLayout, i5, 0, i6, 0);
                int measuredHeight = ClearHistoryAlert.this.linearLayout.getMeasuredHeight();
                int i7 = (size / 5) * 3;
                int i8 = size - i7;
                if (ClearHistoryAlert.this.autoDeleteOnly || measuredHeight - i8 < AndroidUtilities.dp(90.0f)) {
                    i7 = size - measuredHeight;
                } else if (measuredHeight < AndroidUtilities.dp(90.0f) + (size / 2) || i8 < (measuredHeight = (measuredHeight / 2) + AndroidUtilities.dp(108.0f))) {
                    i7 = size - measuredHeight;
                }
                if (getPaddingTop() != i7) {
                    this.ignoreLayout = true;
                    setPadding(0, i7, 0, 0);
                    this.ignoreLayout = false;
                }
                super.onMeasure(i5, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            }

            @Override
            public void onScrollChanged(int i5, int i6, int i7, int i8) {
                super.onScrollChanged(i5, i6, i7, i8);
                ClearHistoryAlert.this.updateLayout();
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !ClearHistoryAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                ClearHistoryAlert.this.updateLayout();
            }
        };
        nestedScrollView.setFillViewport(true);
        nestedScrollView.setWillNotDraw(false);
        nestedScrollView.setClipToPadding(false);
        int i5 = this.backgroundPaddingLeft;
        nestedScrollView.setPadding(i5, 0, i5, 0);
        this.containerView = nestedScrollView;
        LinearLayout linearLayout = new LinearLayout(context) {
            @Override
            public void onLayout(boolean z2, int i6, int i7, int i8, int i9) {
                super.onLayout(z2, i6, i7, i8, i9);
                ClearHistoryAlert.this.updateLayout();
            }
        };
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        nestedScrollView.addView(this.linearLayout, LayoutHelper.createScroll(-1, -2, 80));
        setCustomView(this.linearLayout);
        boolean z2 = user != null && (user != null && !user.bot && (user.id > UserConfig.getInstance(this.currentAccount).getClientUserId() ? 1 : (user.id == UserConfig.getInstance(this.currentAccount).getClientUserId() ? 0 : -1)) != 0 && MessagesController.getInstance(this.currentAccount).canRevokePmInbox) && (user != null ? MessagesController.getInstance(this.currentAccount).revokeTimePmLimit : MessagesController.getInstance(this.currentAccount).revokeTimeLimit) == Integer.MAX_VALUE;
        boolean[] zArr = {false};
        if (this.autoDeleteOnly) {
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            rLottieImageView.setAutoRepeat(false);
            rLottieImageView.setAnimation(R.raw.utyan_private, 120, 120);
            rLottieImageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
            rLottieImageView.playAnimation();
            this.linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(160, 160, 49, 17, 0, 17, 0));
            TextView textView = new TextView(context);
            AccountFrozenAlert$$ExternalSyntheticOutline1.m(24.0f, 1, textView);
            textView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
            textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
            TextView textViewM = zzkc.m(this.linearLayout, textView, LayoutHelper.createLinear(-2, -2, 49, 17, 18, 17, 0), context);
            textViewM.setTextSize(1, 14.0f);
            textViewM.setTextColor(getThemedColor(Theme.key_dialogTextGray3));
            textViewM.setGravity(1);
            if (user != null) {
                textViewM.setText(LocaleController.formatString("AutoDeleteAlertUserInfo", R.string.AutoDeleteAlertUserInfo, UserObject.getFirstName(user)));
            } else if (!ChatObject.isChannel(chat) || chat.megagroup) {
                textViewM.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
            } else {
                textViewM.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
            }
            this.linearLayout.addView(textViewM, LayoutHelper.createLinear(-2, -2, 49, 30, 22, 30, 20));
        } else {
            TextView textView2 = new TextView(context);
            AccountFrozenAlert$$ExternalSyntheticOutline1.m(20.0f, 1, textView2);
            int i6 = Theme.key_dialogTextBlack;
            textView2.setTextColor(getThemedColor(i6));
            textView2.setText(LocaleController.getString(R.string.ClearHistory));
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            this.linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 51, 23, 20, 23, 0));
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(getThemedColor(i6));
            textView3.setTextSize(1, 16.0f);
            textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView3.setLinkTextColor(getThemedColor(Theme.key_dialogTextLink));
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            this.linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 51, 23, 16, 23, 5));
            if (user != null) {
                textView3.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithUser", R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
            } else if (!ChatObject.isChannel(chat) || (chat.megagroup && !ChatObject.isPublic(chat))) {
                textView3.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChat", R.string.AreYouSureClearHistoryWithChat, chat.title)));
            } else if (chat.megagroup) {
                textView3.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
            } else {
                textView3.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
            }
            if (z2 && !UserObject.isDeleted(user)) {
                CheckBoxCell checkBoxCell = new CheckBoxCell(context, 1, 17, false, resourcesProvider);
                this.cell = checkBoxCell;
                checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                this.cell.setText(LocaleController.formatString("ClearHistoryOptionAlso", R.string.ClearHistoryOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                this.cell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(5.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(5.0f) : AndroidUtilities.dp(16.0f), 0);
                this.linearLayout.addView(this.cell, LayoutHelper.createLinear(-1, 48, 51, 0, 0, 0, 0));
                this.cell.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda21(zArr, 6));
            }
            BottomSheetCell bottomSheetCell = new BottomSheetCell(context, resourcesProvider);
            bottomSheetCell.setBackground(null);
            bottomSheetCell.setText(LocaleController.getString(R.string.AlertClearHistory));
            bottomSheetCell.background.setOnClickListener(new View.OnClickListener(this) {
                public final ClearHistoryAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$new$1(view);
                            break;
                        default:
                            this.f$0.lambda$new$2(view);
                            break;
                    }
                }
            });
            this.linearLayout.addView(bottomSheetCell, LayoutHelper.createLinear(-1, 50, 51, 0, 0, 0, 0));
            View shadowSectionCell = new ShadowSectionCell(context, null, 0);
            CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
            combinedDrawable.setFullsize(true);
            shadowSectionCell.setBackgroundDrawable(combinedDrawable);
            this.linearLayout.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
            HeaderCell headerCell = new HeaderCell(context, resourcesProvider);
            headerCell.setText(LocaleController.getString(R.string.AutoDeleteHeader));
            this.linearLayout.addView(headerCell, LayoutHelper.createLinear(-1, -2, 1.0f, this.autoDeleteOnly ? 20.0f : 0.0f, 1.0f, 0.0f));
        }
        SlideChooseView slideChooseView = new SlideChooseView(context, resourcesProvider);
        slideChooseView.setCallback(new SlideChooseView.Callback() {
            @Override
            public void onOptionSelected(int i7) {
                ClearHistoryAlert.this.newTimer = i7;
                ClearHistoryAlert.this.updateTimerButton(true);
            }

            @Override
            public void onTouchEnd() {
                nestedScrollView.smoothScrollTo(0, ClearHistoryAlert.this.linearLayout.getMeasuredHeight());
            }
        });
        slideChooseView.setOptions(this.currentTimer, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        this.linearLayout.addView(slideChooseView, LayoutHelper.createLinear(-1, -2, 0.0f, 8.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        CombinedDrawable combinedDrawable2 = new CombinedDrawable(new ColorDrawable(getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
        combinedDrawable2.setFullsize(true);
        frameLayout.setBackgroundDrawable(combinedDrawable2);
        this.linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, resourcesProvider);
        textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(textInfoPrivacyCell);
        BottomSheetCell bottomSheetCell2 = new BottomSheetCell(context, resourcesProvider);
        this.setTimerButton = bottomSheetCell2;
        bottomSheetCell2.setBackgroundColor(getThemedColor(i4));
        if (this.autoDeleteOnly) {
            this.setTimerButton.setText(LocaleController.getString(R.string.AutoDeleteSet));
        } else if (z && this.currentTimer == 0) {
            this.setTimerButton.setText(LocaleController.getString(R.string.EnableAutoDelete));
        } else {
            this.setTimerButton.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        }
        this.setTimerButton.background.setOnClickListener(new View.OnClickListener(this) {
            public final ClearHistoryAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$new$1(view);
                        break;
                    default:
                        this.f$0.lambda$new$2(view);
                        break;
                }
            }
        });
        frameLayout.addView(this.setTimerButton);
        updateTimerButton(false);
    }

    public static void lambda$new$0(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public void lambda$new$1(View view) {
        if (this.dismissedDelayed) {
            return;
        }
        ClearHistoryAlertDelegate clearHistoryAlertDelegate = this.delegate;
        CheckBoxCell checkBoxCell = this.cell;
        clearHistoryAlertDelegate.onClearHistory(checkBoxCell != null && checkBoxCell.isChecked());
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$2(View view) {
        int i;
        if (this.dismissedDelayed) {
            return;
        }
        int i2 = this.newTimer;
        if (i2 != this.currentTimer) {
            this.dismissedDelayed = true;
            int i3 = 70;
            if (i2 == 3) {
                i = 2678400;
            } else if (i2 == 2) {
                i = 604800;
            } else if (i2 == 1) {
                i = 86400;
            } else {
                i = 0;
                i3 = 71;
            }
            this.delegate.onAutoDeleteHistory(i, i3);
        }
        if (this.dismissedDelayed) {
            AndroidUtilities.runOnUIThread(new GroupCallPip$$ExternalSyntheticLambda2(this, 6), 200L);
        } else {
            lambda$showGiftOfferSheet$15();
        }
    }

    public void updateLayout() {
        this.linearLayout.getChildAt(0).getLocationInWindow(this.location);
        int iMax = Math.max(this.location[1] - AndroidUtilities.dp(this.autoDeleteOnly ? 6.0f : 19.0f), 0);
        if (this.scrollOffsetY != iMax) {
            this.scrollOffsetY = iMax;
            this.containerView.invalidate();
        }
    }

    public void updateTimerButton(boolean z) {
        if (this.currentTimer != this.newTimer || this.autoDeleteOnly) {
            this.setTimerButton.setVisibility(0);
            if (z) {
                this.setTimerButton.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                this.setTimerButton.setAlpha(1.0f);
                return;
            }
        }
        if (z) {
            this.setTimerButton.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            this.setTimerButton.setVisibility(4);
            this.setTimerButton.setAlpha(0.0f);
        }
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    public void setDelegate(ClearHistoryAlertDelegate clearHistoryAlertDelegate) {
        this.delegate = clearHistoryAlertDelegate;
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    public interface ClearHistoryAlertDelegate {
        void onAutoDeleteHistory(int i, int i2);

        void onClearHistory(boolean z);

        public abstract class CC {
            public static void $default$onClearHistory(ClearHistoryAlertDelegate clearHistoryAlertDelegate, boolean z) {
            }

            public static void $default$onAutoDeleteHistory(ClearHistoryAlertDelegate clearHistoryAlertDelegate, int i, int i2) {
            }
        }
    }
}
