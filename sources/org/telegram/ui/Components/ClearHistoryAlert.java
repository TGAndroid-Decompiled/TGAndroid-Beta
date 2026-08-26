package org.telegram.ui.Components;

import android.app.Activity;
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
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.ChannelAdminLogActivity;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;

public final class ClearHistoryAlert extends BottomSheet {
    public final boolean autoDeleteOnly;
    public final int currentTimer;
    public ChannelAdminLogActivity.AnonymousClass13 delegate;
    public boolean dismissedDelayed;
    public final AnonymousClass2 linearLayout;
    public final int[] location;
    public int newTimer;
    public int scrollOffsetY;
    public final BottomSheetCell setTimerButton;
    public final Drawable shadowDrawable;

    public final class BottomSheetCell extends FrameLayout {
        public final View background;
        public final TextView textView;

        public BottomSheetCell(Activity activity) {
            super(activity);
            View view = new View(activity);
            this.background = view;
            int iDp = AndroidUtilities.dp(4.0f);
            int color = Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
            int color2 = Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
            view.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, color2, color2));
            addView(view, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
            TextView textView = new TextView(activity);
            this.textView = textView;
            textView.setLines(1);
            textView.setSingleLine(true);
            textView.setGravity(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity(17);
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(14.0f, Theme.getColor(null, Theme.key_featuredStickers_buttonText, false), 1, textView);
            addView(textView, LayoutHelper.createFrame(-2, -2, 17));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }
    }

    public ClearHistoryAlert(Activity activity, TLRPC.Chat chat) {
        super(activity, null, false, false);
        this.location = new int[2];
        this.autoDeleteOnly = true;
        setApplyBottomPadding(false);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.id);
        int i = chatFull != null ? chatFull.ttl_period : 0;
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
        Drawable drawableMutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        int i2 = Theme.key_dialogBackground;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i2), PorterDuff.Mode.MULTIPLY));
        final ?? r5 = new NestedScrollView(activity) {
            public boolean ignoreLayout;

            @Override
            public final void onDraw(Canvas canvas) {
                ClearHistoryAlert clearHistoryAlert = ClearHistoryAlert.this;
                int scrollY = (int) ((getScrollY() + (clearHistoryAlert.scrollOffsetY - ((BottomSheet) clearHistoryAlert).backgroundPaddingTop)) - getTranslationY());
                int measuredWidth = getMeasuredWidth();
                int iDp = AndroidUtilities.dp(19.0f) + ((BottomSheet) clearHistoryAlert).backgroundPaddingTop + clearHistoryAlert.linearLayout.getMeasuredHeight() + scrollY;
                Drawable drawable = clearHistoryAlert.shadowDrawable;
                drawable.setBounds(0, scrollY, measuredWidth, iDp);
                drawable.draw(canvas);
            }

            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    ClearHistoryAlert clearHistoryAlert = ClearHistoryAlert.this;
                    if (clearHistoryAlert.scrollOffsetY != 0 && motionEvent.getY() < clearHistoryAlert.scrollOffsetY) {
                        clearHistoryAlert.lambda$showGiftOfferSheet$15();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public final void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                super.onLayout(z, i3, i4, i5, i6);
                ClearHistoryAlert.access$100(ClearHistoryAlert.this);
            }

            @Override
            public final void onMeasure(int i3, int i4) {
                int size = View.MeasureSpec.getSize(i4);
                ClearHistoryAlert clearHistoryAlert = ClearHistoryAlert.this;
                measureChildWithMargins(clearHistoryAlert.linearLayout, i3, 0, i4, 0);
                int measuredHeight = clearHistoryAlert.linearLayout.getMeasuredHeight();
                int i5 = (size / 5) * 3;
                int i6 = size - i5;
                if (clearHistoryAlert.autoDeleteOnly || measuredHeight - i6 < AndroidUtilities.dp(90.0f)) {
                    i5 = size - measuredHeight;
                } else if (measuredHeight < AndroidUtilities.dp(90.0f) + (size / 2) || i6 < (measuredHeight = (measuredHeight / 2) + AndroidUtilities.dp(108.0f))) {
                    i5 = size - measuredHeight;
                }
                if (getPaddingTop() != i5) {
                    this.ignoreLayout = true;
                    setPadding(0, i5, 0, 0);
                    this.ignoreLayout = false;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            }

            @Override
            public final void onScrollChanged(int i3, int i4, int i5, int i6) {
                super.onScrollChanged(i3, i4, i5, i6);
                ClearHistoryAlert.access$100(ClearHistoryAlert.this);
            }

            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                return !ClearHistoryAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            public final void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            @Override
            public final void setTranslationY(float f) {
                super.setTranslationY(f);
                ClearHistoryAlert.access$100(ClearHistoryAlert.this);
            }
        };
        r5.setFillViewport(true);
        r5.setWillNotDraw(false);
        r5.setClipToPadding(false);
        int i3 = this.backgroundPaddingLeft;
        r5.setPadding(i3, 0, i3, 0);
        this.containerView = r5;
        ?? r7 = new LinearLayout(activity) {
            @Override
            public final void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                super.onLayout(z, i4, i5, i6, i7);
                ClearHistoryAlert.access$100(ClearHistoryAlert.this);
            }
        };
        this.linearLayout = r7;
        r7.setOrientation(1);
        r5.addView(r7, LayoutHelper.createScroll(-1, -2, 80));
        setCustomView(r7);
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        int i4 = MessagesController.getInstance(this.currentAccount).revokeTimeLimit;
        RLottieImageView rLottieImageView = new RLottieImageView(activity);
        rLottieImageView.setAutoRepeat(false);
        rLottieImageView.setAnimation(R.raw.utyan_private, 120, 120, null);
        rLottieImageView.setPadding(0, AndroidUtilities.dp(20.0f), 0, 0);
        rLottieImageView.playAnimation();
        r7.addView(rLottieImageView, LayoutHelper.createLinear(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        zzkh.m(24.0f, textView);
        textView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
        textView.setText(LocaleController.getString(R.string.AutoDeleteAlertTitle));
        r7.addView(textView, LayoutHelper.createLinear(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(Theme.key_dialogTextGray3));
        textView2.setGravity(1);
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertGroupInfo));
        } else {
            textView2.setText(LocaleController.getString(R.string.AutoDeleteAlertChannelInfo));
        }
        r7.addView(textView2, LayoutHelper.createLinear(-2, -2, 49, 30, 22, 30, 20));
        SlideChooseView slideChooseView = new SlideChooseView(activity, null);
        slideChooseView.setCallback(new SlideChooseView.Callback() {
            @Override
            public final void onOptionSelected(int i5) {
                ClearHistoryAlert clearHistoryAlert = ClearHistoryAlert.this;
                clearHistoryAlert.newTimer = i5;
                clearHistoryAlert.updateTimerButton(true);
            }

            @Override
            public final void onTouchEnd() {
                int measuredHeight = getMeasuredHeight();
                AnonymousClass1 anonymousClass1 = r5;
                anonymousClass1.smoothScrollBy(0 - anonymousClass1.getScrollX(), measuredHeight - anonymousClass1.getScrollY(), false);
            }
        });
        slideChooseView.setOptions(this.currentTimer, null, LocaleController.getString(R.string.AutoDeleteNever), LocaleController.getString(R.string.AutoDelete24Hours), LocaleController.getString(R.string.AutoDelete7Days), LocaleController.getString(R.string.AutoDelete1Month));
        r7.addView(slideChooseView, LayoutHelper.createLinear(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(activity, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
        combinedDrawable.fullSize = true;
        frameLayout.setBackgroundDrawable(combinedDrawable);
        r7.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(activity, 24, null);
        textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoDeleteInfo));
        frameLayout.addView(textInfoPrivacyCell);
        BottomSheetCell bottomSheetCell = new BottomSheetCell(activity);
        this.setTimerButton = bottomSheetCell;
        bottomSheetCell.setBackgroundColor(getThemedColor(i2));
        bottomSheetCell.setText(LocaleController.getString(R.string.AutoDeleteSet));
        bottomSheetCell.background.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 12));
        frameLayout.addView(bottomSheetCell);
        updateTimerButton(false);
    }

    public static void access$100(ClearHistoryAlert clearHistoryAlert) {
        View childAt = clearHistoryAlert.linearLayout.getChildAt(0);
        int[] iArr = clearHistoryAlert.location;
        childAt.getLocationInWindow(iArr);
        int iMax = Math.max(iArr[1] - AndroidUtilities.dp(clearHistoryAlert.autoDeleteOnly ? 6.0f : 19.0f), 0);
        if (clearHistoryAlert.scrollOffsetY != iMax) {
            clearHistoryAlert.scrollOffsetY = iMax;
            clearHistoryAlert.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void updateTimerButton(boolean z) {
        int i = this.newTimer;
        int i2 = this.currentTimer;
        BottomSheetCell bottomSheetCell = this.setTimerButton;
        if (i2 != i || this.autoDeleteOnly) {
            bottomSheetCell.setVisibility(0);
            if (z) {
                bottomSheetCell.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                bottomSheetCell.setAlpha(1.0f);
                return;
            }
        }
        if (z) {
            bottomSheetCell.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            bottomSheetCell.setVisibility(4);
            bottomSheetCell.setAlpha(0.0f);
        }
    }
}
