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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
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

    public interface ClearHistoryAlertDelegate {

        public abstract class CC {
            public static void $default$onClearHistory(ClearHistoryAlertDelegate clearHistoryAlertDelegate, boolean z) {
            }
        }

        void onAutoDeleteHistory(int i, int i2);

        void onClearHistory(boolean z);
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    public static class BottomSheetCell extends FrameLayout {
        private View background;
        private final Theme.ResourcesProvider resourcesProvider;
        private TextView textView;

        public BottomSheetCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            View view = new View(context);
            this.background = view;
            view.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(4.0f), getThemedColor(Theme.key_featuredStickers_addButton), getThemedColor(Theme.key_featuredStickers_addButtonPressed)));
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

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }

        protected int getThemedColor(int i) {
            return Theme.getColor(i, this.resourcesProvider);
        }
    }

    public ClearHistoryAlert(Context context, TLRPC.User user, TLRPC.Chat chat, boolean z, Theme.ResourcesProvider resourcesProvider) {
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        final boolean[] zArr;
        TextView textView;
        TextView textView2;
        int i4;
        float f;
        int iDp;
        int iDp2;
        super(context, false, resourcesProvider);
        this.location = new int[2];
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
        int i5 = Theme.key_dialogBackground;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i5), PorterDuff.Mode.MULTIPLY));
        final NestedScrollView nestedScrollView = new NestedScrollView(context) {
            private boolean ignoreLayout;

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && ClearHistoryAlert.this.scrollOffsetY != 0 && motionEvent.getY() < ClearHistoryAlert.this.scrollOffsetY) {
                    ClearHistoryAlert.this.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !ClearHistoryAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            public void setTranslationY(float f2) {
                super.setTranslationY(f2);
                ClearHistoryAlert.this.updateLayout();
            }

            @Override
            protected void onMeasure(int i6, int i7) {
                int size = View.MeasureSpec.getSize(i7);
                measureChildWithMargins(ClearHistoryAlert.this.linearLayout, i6, 0, i7, 0);
                int measuredHeight = ClearHistoryAlert.this.linearLayout.getMeasuredHeight();
                int i8 = (size / 5) * 3;
                int i9 = size - i8;
                if (ClearHistoryAlert.this.autoDeleteOnly || measuredHeight - i9 < AndroidUtilities.dp(90.0f) || measuredHeight < (size / 2) + AndroidUtilities.dp(90.0f) || i9 < (measuredHeight = (measuredHeight / 2) + AndroidUtilities.dp(108.0f))) {
                    i8 = size - measuredHeight;
                }
                if (getPaddingTop() != i8) {
                    this.ignoreLayout = true;
                    setPadding(0, i8, 0, 0);
                    this.ignoreLayout = false;
                }
                super.onMeasure(i6, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            }

            @Override
            protected void onLayout(boolean z4, int i6, int i7, int i8, int i9) {
                super.onLayout(z4, i6, i7, i8, i9);
                ClearHistoryAlert.this.updateLayout();
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            @Override
            protected void onDraw(Canvas canvas) {
                int scrollY = (int) (((ClearHistoryAlert.this.scrollOffsetY - ((BottomSheet) ClearHistoryAlert.this).backgroundPaddingTop) + getScrollY()) - getTranslationY());
                ClearHistoryAlert.this.shadowDrawable.setBounds(0, scrollY, getMeasuredWidth(), ClearHistoryAlert.this.linearLayout.getMeasuredHeight() + scrollY + ((BottomSheet) ClearHistoryAlert.this).backgroundPaddingTop + AndroidUtilities.dp(19.0f));
                ClearHistoryAlert.this.shadowDrawable.draw(canvas);
            }

            @Override
            protected void onScrollChanged(int i6, int i7, int i8, int i9) {
                super.onScrollChanged(i6, i7, i8, i9);
                ClearHistoryAlert.this.updateLayout();
            }
        };
        nestedScrollView.setFillViewport(true);
        nestedScrollView.setWillNotDraw(false);
        nestedScrollView.setClipToPadding(false);
        int i6 = this.backgroundPaddingLeft;
        nestedScrollView.setPadding(i6, 0, i6, 0);
        this.containerView = nestedScrollView;
        LinearLayout linearLayout = new LinearLayout(context) {
            @Override
            protected void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
                super.onLayout(z4, i7, i8, i9, i10);
                ClearHistoryAlert.this.updateLayout();
            }
        };
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        nestedScrollView.addView(this.linearLayout, LayoutHelper.createScroll(-1, -2, 80));
        setCustomView(this.linearLayout);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if (user != null && !user.bot) {
            i2 = i5;
            if (user.id != clientUserId && MessagesController.getInstance(this.currentAccount).canRevokePmInbox) {
                z2 = true;
            }
            if (user != null) {
                i3 = MessagesController.getInstance(this.currentAccount).revokeTimePmLimit;
            } else {
                i3 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
            }
            if (user == null && z2 && i3 == Integer.MAX_VALUE) {
                z3 = true;
            } else {
                z3 = false;
            }
            zArr = new boolean[]{false};
            if (!this.autoDeleteOnly) {
                TextView textView3 = new TextView(context);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setTextSize(1, 20.0f);
                int i7 = Theme.key_dialogTextBlack;
                textView3.setTextColor(getThemedColor(i7));
                textView3.setText(LocaleController.getString(R.string.ClearHistory));
                textView3.setSingleLine(true);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                this.linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 51, 23, 20, 23, 0));
                textView2 = new TextView(getContext());
                textView2.setTextColor(getThemedColor(i7));
                textView2.setTextSize(1, 16.0f);
                textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                textView2.setLinkTextColor(getThemedColor(Theme.key_dialogTextLink));
                if (LocaleController.isRTL) {
                    i4 = 5;
                } else {
                    i4 = 3;
                }
                textView2.setGravity(i4 | 48);
                this.linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 51, 23, 16, 23, 5));
                if (user != null) {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithUser", R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
                } else if (ChatObject.isChannel(chat) || (chat.megagroup && !ChatObject.isPublic(chat))) {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChat", R.string.AreYouSureClearHistoryWithChat, chat.title)));
                } else if (chat.megagroup) {
                    textView2.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
                } else {
                    textView2.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
                }
                if (z3 && !UserObject.isDeleted(user)) {
                    CheckBoxCell checkBoxCell = new CheckBoxCell(context, 1, resourcesProvider);
                    this.cell = checkBoxCell;
                    checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    this.cell.setText(LocaleController.formatString("ClearHistoryOptionAlso", R.string.ClearHistoryOptionAlso, UserObject.getFirstName(user)), "", false, false);
                    CheckBoxCell checkBoxCell2 = this.cell;
                    if (LocaleController.isRTL) {
                        iDp = AndroidUtilities.dp(16.0f);
                    } else {
                        iDp = AndroidUtilities.dp(5.0f);
                    }
                    if (LocaleController.isRTL) {
                        iDp2 = AndroidUtilities.dp(5.0f);
                    } else {
                        iDp2 = AndroidUtilities.dp(16.0f);
                    }
                    checkBoxCell2.setPadding(iDp, 0, iDp2, 0);
                    this.linearLayout.addView(this.cell, LayoutHelper.createLinear(-1, 48, 51, 0, 0, 0, 0));
                    this.cell.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ClearHistoryAlert.$r8$lambda$EZ1C5bzlmLE_6knIy35pvM4pXbU(zArr, view);
                        }
                    });
                }
                BottomSheetCell bottomSheetCell = new BottomSheetCell(context, resourcesProvider);
                bottomSheetCell.setBackground(null);
                bottomSheetCell.setText(LocaleController.getString(R.string.AlertClearHistory));
                bottomSheetCell.background.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ClearHistoryAlert.$r8$lambda$kcPCgmpdf1VgK6LwK17dsZfE_tc(this.f$0, view);
                    }
                });
                this.linearLayout.addView(bottomSheetCell, LayoutHelper.createLinear(-1, 50, 51, 0, 0, 0, 0));
                View shadowSectionCell = new ShadowSectionCell(context);
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                combinedDrawable.setFullsize(true);
                shadowSectionCell.setBackgroundDrawable(combinedDrawable);
                this.linearLayout.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
                HeaderCell headerCell = new HeaderCell(context, resourcesProvider);
                headerCell.setText(LocaleController.getString(R.string.AutoDeleteHeader));
                LinearLayout linearLayout2 = this.linearLayout;
                if (this.autoDeleteOnly) {
                    f = 20.0f;
                } else {
                    f = 0.0f;
                }
                linearLayout2.addView(headerCell, LayoutHelper.createLinear(-1, -2, 1.0f, f, 1.0f, 0.0f));
            } else {
                RLottieImageView rLottieImageView = new RLottieImageView(context);
                rLottieImageView.setAutoRepeat(false);
                rLottieImageView.setAnimation(R.raw.utyan_private, 120, 120);
                rLottieImageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
                rLottieImageView.playAnimation();
                this.linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(160, 160, 49, 17, 0, 17, 0));
                TextView textView4 = new TextView(context);
                textView4.setTypeface(AndroidUtilities.bold());
                textView4.setTextSize(1, 24.0f);
                textView4.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
                textView4.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
                this.linearLayout.addView(textView4, LayoutHelper.createLinear(-2, -2, 49, 17, 18, 17, 0));
                textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(getThemedColor(Theme.key_dialogTextGray3));
                textView.setGravity(1);
                if (user != null) {
                    textView.setText(LocaleController.formatString("AutoDeleteAlertUserInfo", R.string.AutoDeleteAlertUserInfo, UserObject.getFirstName(user)));
                } else if (!ChatObject.isChannel(chat) && !chat.megagroup) {
                    textView.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
                } else {
                    textView.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
                }
                this.linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 49, 30, 22, 30, 20));
            }
            SlideChooseView slideChooseView = new SlideChooseView(context, resourcesProvider);
            slideChooseView.setCallback(new SlideChooseView.Callback() {
                @Override
                public void onOptionSelected(int i8) {
                    ClearHistoryAlert.this.newTimer = i8;
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
            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, resourcesProvider);
            textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoDeleteInfo));
            frameLayout.addView(textInfoPrivacyCell);
            BottomSheetCell bottomSheetCell2 = new BottomSheetCell(context, resourcesProvider);
            this.setTimerButton = bottomSheetCell2;
            bottomSheetCell2.setBackgroundColor(getThemedColor(i2));
            if (this.autoDeleteOnly) {
                this.setTimerButton.setText(LocaleController.getString(R.string.AutoDeleteSet));
            } else if (!z && this.currentTimer == 0) {
                this.setTimerButton.setText(LocaleController.getString(R.string.EnableAutoDelete));
            } else {
                this.setTimerButton.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
            }
            this.setTimerButton.background.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ClearHistoryAlert.$r8$lambda$f8dWEbOUtv_zIMtgz_WpgOxrUbI(this.f$0, view);
                }
            });
            frameLayout.addView(this.setTimerButton);
            updateTimerButton(false);
        }
        i2 = i5;
        z2 = false;
        if (user != null) {
            i3 = MessagesController.getInstance(this.currentAccount).revokeTimePmLimit;
        } else {
            i3 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        }
        if (user == null) {
            z3 = false;
        } else {
            z3 = false;
        }
        zArr = new boolean[]{false};
        if (!this.autoDeleteOnly) {
            TextView textView5 = new TextView(context);
            textView5.setTypeface(AndroidUtilities.bold());
            textView5.setTextSize(1, 20.0f);
            int i8 = Theme.key_dialogTextBlack;
            textView5.setTextColor(getThemedColor(i8));
            textView5.setText(LocaleController.getString(R.string.ClearHistory));
            textView5.setSingleLine(true);
            textView5.setEllipsize(TextUtils.TruncateAt.END);
            this.linearLayout.addView(textView5, LayoutHelper.createLinear(-2, -2, 51, 23, 20, 23, 0));
            textView2 = new TextView(getContext());
            textView2.setTextColor(getThemedColor(i8));
            textView2.setTextSize(1, 16.0f);
            textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView2.setLinkTextColor(getThemedColor(Theme.key_dialogTextLink));
            if (LocaleController.isRTL) {
                i4 = 5;
            } else {
                i4 = 3;
            }
            textView2.setGravity(i4 | 48);
            this.linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 51, 23, 16, 23, 5));
            if (user != null) {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithUser", R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
            } else if (ChatObject.isChannel(chat)) {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChat", R.string.AreYouSureClearHistoryWithChat, chat.title)));
            } else {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChat", R.string.AreYouSureClearHistoryWithChat, chat.title)));
            }
            if (z3) {
                CheckBoxCell checkBoxCell3 = new CheckBoxCell(context, 1, resourcesProvider);
                this.cell = checkBoxCell3;
                checkBoxCell3.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                this.cell.setText(LocaleController.formatString("ClearHistoryOptionAlso", R.string.ClearHistoryOptionAlso, UserObject.getFirstName(user)), "", false, false);
                CheckBoxCell checkBoxCell4 = this.cell;
                if (LocaleController.isRTL) {
                    iDp = AndroidUtilities.dp(16.0f);
                } else {
                    iDp = AndroidUtilities.dp(5.0f);
                }
                if (LocaleController.isRTL) {
                    iDp2 = AndroidUtilities.dp(5.0f);
                } else {
                    iDp2 = AndroidUtilities.dp(16.0f);
                }
                checkBoxCell4.setPadding(iDp, 0, iDp2, 0);
                this.linearLayout.addView(this.cell, LayoutHelper.createLinear(-1, 48, 51, 0, 0, 0, 0));
                this.cell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ClearHistoryAlert.$r8$lambda$EZ1C5bzlmLE_6knIy35pvM4pXbU(zArr, view);
                    }
                });
            }
            BottomSheetCell bottomSheetCell3 = new BottomSheetCell(context, resourcesProvider);
            bottomSheetCell3.setBackground(null);
            bottomSheetCell3.setText(LocaleController.getString(R.string.AlertClearHistory));
            bottomSheetCell3.background.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ClearHistoryAlert.$r8$lambda$kcPCgmpdf1VgK6LwK17dsZfE_tc(this.f$0, view);
                }
            });
            this.linearLayout.addView(bottomSheetCell3, LayoutHelper.createLinear(-1, 50, 51, 0, 0, 0, 0));
            View shadowSectionCell2 = new ShadowSectionCell(context);
            CombinedDrawable combinedDrawable3 = new CombinedDrawable(new ColorDrawable(getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
            combinedDrawable3.setFullsize(true);
            shadowSectionCell2.setBackgroundDrawable(combinedDrawable3);
            this.linearLayout.addView(shadowSectionCell2, LayoutHelper.createLinear(-1, -2));
            HeaderCell headerCell2 = new HeaderCell(context, resourcesProvider);
            headerCell2.setText(LocaleController.getString(R.string.AutoDeleteHeader));
            LinearLayout linearLayout3 = this.linearLayout;
            if (this.autoDeleteOnly) {
                f = 20.0f;
            } else {
                f = 0.0f;
            }
            linearLayout3.addView(headerCell2, LayoutHelper.createLinear(-1, -2, 1.0f, f, 1.0f, 0.0f));
        } else {
            RLottieImageView rLottieImageView2 = new RLottieImageView(context);
            rLottieImageView2.setAutoRepeat(false);
            rLottieImageView2.setAnimation(R.raw.utyan_private, 120, 120);
            rLottieImageView2.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
            rLottieImageView2.playAnimation();
            this.linearLayout.addView(rLottieImageView2, LayoutHelper.createLinear(160, 160, 49, 17, 0, 17, 0));
            TextView textView6 = new TextView(context);
            textView6.setTypeface(AndroidUtilities.bold());
            textView6.setTextSize(1, 24.0f);
            textView6.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
            textView6.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
            this.linearLayout.addView(textView6, LayoutHelper.createLinear(-2, -2, 49, 17, 18, 17, 0));
            textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(getThemedColor(Theme.key_dialogTextGray3));
            textView.setGravity(1);
            if (user != null) {
                textView.setText(LocaleController.formatString("AutoDeleteAlertUserInfo", R.string.AutoDeleteAlertUserInfo, UserObject.getFirstName(user)));
            } else if (!ChatObject.isChannel(chat)) {
                textView.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
            } else {
                textView.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
            }
            this.linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 49, 30, 22, 30, 20));
        }
        SlideChooseView slideChooseView2 = new SlideChooseView(context, resourcesProvider);
        slideChooseView2.setCallback(new SlideChooseView.Callback() {
            @Override
            public void onOptionSelected(int i9) {
                ClearHistoryAlert.this.newTimer = i9;
                ClearHistoryAlert.this.updateTimerButton(true);
            }

            @Override
            public void onTouchEnd() {
                nestedScrollView.smoothScrollTo(0, ClearHistoryAlert.this.linearLayout.getMeasuredHeight());
            }
        });
        slideChooseView2.setOptions(this.currentTimer, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        this.linearLayout.addView(slideChooseView2, LayoutHelper.createLinear(-1, -2, 0.0f, 8.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        CombinedDrawable combinedDrawable4 = new CombinedDrawable(new ColorDrawable(getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
        combinedDrawable4.setFullsize(true);
        frameLayout2.setBackgroundDrawable(combinedDrawable4);
        this.linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2));
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, resourcesProvider);
        textInfoPrivacyCell2.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout2.addView(textInfoPrivacyCell2);
        BottomSheetCell bottomSheetCell4 = new BottomSheetCell(context, resourcesProvider);
        this.setTimerButton = bottomSheetCell4;
        bottomSheetCell4.setBackgroundColor(getThemedColor(i2));
        if (this.autoDeleteOnly) {
            this.setTimerButton.setText(LocaleController.getString(R.string.AutoDeleteSet));
        } else if (!z) {
            this.setTimerButton.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        } else {
            this.setTimerButton.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        }
        this.setTimerButton.background.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ClearHistoryAlert.$r8$lambda$f8dWEbOUtv_zIMtgz_WpgOxrUbI(this.f$0, view);
            }
        });
        frameLayout2.addView(this.setTimerButton);
        updateTimerButton(false);
    }

    public static void $r8$lambda$EZ1C5bzlmLE_6knIy35pvM4pXbU(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void $r8$lambda$kcPCgmpdf1VgK6LwK17dsZfE_tc(ClearHistoryAlert clearHistoryAlert, View view) {
        if (clearHistoryAlert.dismissedDelayed) {
            return;
        }
        ClearHistoryAlertDelegate clearHistoryAlertDelegate = clearHistoryAlert.delegate;
        CheckBoxCell checkBoxCell = clearHistoryAlert.cell;
        clearHistoryAlertDelegate.onClearHistory(checkBoxCell != null && checkBoxCell.isChecked());
        clearHistoryAlert.dismiss();
    }

    public static void $r8$lambda$f8dWEbOUtv_zIMtgz_WpgOxrUbI(final ClearHistoryAlert clearHistoryAlert, View view) {
        int i;
        if (clearHistoryAlert.dismissedDelayed) {
            return;
        }
        int i2 = clearHistoryAlert.newTimer;
        if (i2 != clearHistoryAlert.currentTimer) {
            clearHistoryAlert.dismissedDelayed = true;
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
            clearHistoryAlert.delegate.onAutoDeleteHistory(i, i3);
        }
        if (clearHistoryAlert.dismissedDelayed) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.dismiss();
                }
            }, 200L);
        } else {
            clearHistoryAlert.dismiss();
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

    public void updateLayout() {
        this.linearLayout.getChildAt(0).getLocationInWindow(this.location);
        int iMax = Math.max(this.location[1] - AndroidUtilities.dp(this.autoDeleteOnly ? 6.0f : 19.0f), 0);
        if (this.scrollOffsetY != iMax) {
            this.scrollOffsetY = iMax;
            this.containerView.invalidate();
        }
    }

    public void setDelegate(ClearHistoryAlertDelegate clearHistoryAlertDelegate) {
        this.delegate = clearHistoryAlertDelegate;
    }
}
