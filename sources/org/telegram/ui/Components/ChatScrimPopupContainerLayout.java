package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.HintView2;

public abstract class ChatScrimPopupContainerLayout extends LinearLayout {
    public FrameLayout bottomView;
    public float bottomViewReactionsOffset;
    public float bottomViewYOffset;
    public float expandSize;
    public int maxHeight;
    public float popupLayoutLeftOffset;
    public ActionBarPopupWindow.ActionBarPopupWindowLayout popupWindowLayout;
    public float progressToSwipeBack;
    public ReactionsContainerLayout reactionsLayout;

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = i;
        int i3 = this.maxHeight;
        int iMakeMeasureSpec2 = i3 != 0 ? View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE) : i2;
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsLayout;
        if (reactionsContainerLayout == null || this.popupWindowLayout == null) {
            super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        } else {
            reactionsContainerLayout.getLayoutParams().width = -2;
            int i4 = 0;
            ((LinearLayout.LayoutParams) this.reactionsLayout.getLayoutParams()).rightMargin = 0;
            this.popupLayoutLeftOffset = 0.0f;
            super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = this.reactionsLayout.getMeasuredWidth();
            if (this.popupWindowLayout.getSwipeBack() != null && this.popupWindowLayout.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.popupWindowLayout.getSwipeBack().getMeasuredWidth();
            }
            if (this.popupWindowLayout.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.popupWindowLayout.getMeasuredWidth();
            }
            if (this.reactionsLayout.showCustomEmojiReaction()) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            ReactionsContainerLayout reactionsContainerLayout2 = this.reactionsLayout;
            if (!reactionsContainerLayout2.hintMeasured && reactionsContainerLayout2.hasHint && reactionsContainerLayout2.getMeasuredWidth() > 0) {
                int iMin = Math.min(AndroidUtilities.dp(320.0f), reactionsContainerLayout2.getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                StaticLayout staticLayout = new StaticLayout(reactionsContainerLayout2.hintView.getText(), reactionsContainerLayout2.hintView.getPaint(), iMin, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                reactionsContainerLayout2.hintViewHeight = staticLayout.getHeight();
                reactionsContainerLayout2.hintViewWidth = 0;
                for (int i5 = 0; i5 < staticLayout.getLineCount(); i5++) {
                    reactionsContainerLayout2.hintViewWidth = Math.max(reactionsContainerLayout2.hintViewWidth, (int) Math.ceil(staticLayout.getLineWidth(i5)));
                }
                if (staticLayout.getLineCount() <= 1 || reactionsContainerLayout2.hintView.getText().toString().contains("\n")) {
                    reactionsContainerLayout2.hintView.setWidth(AndroidUtilities.dp(16.0f) + iMin);
                } else {
                    int iCutInFancyHalf = HintView2.cutInFancyHalf(reactionsContainerLayout2.hintView.getText(), reactionsContainerLayout2.hintView.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(reactionsContainerLayout2.hintView.getText(), reactionsContainerLayout2.hintView.getPaint(), iCutInFancyHalf, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    reactionsContainerLayout2.hintViewHeight = staticLayout2.getHeight();
                    reactionsContainerLayout2.hintViewWidth = 0;
                    for (int i6 = 0; i6 < staticLayout2.getLineCount(); i6++) {
                        reactionsContainerLayout2.hintViewWidth = Math.max(reactionsContainerLayout2.hintViewWidth, (int) Math.ceil(staticLayout2.getLineWidth(i6)));
                    }
                    reactionsContainerLayout2.hintView.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    reactionsContainerLayout2.hintView.setWidth(AndroidUtilities.dp(48.0f) + iCutInFancyHalf);
                }
                int iMax = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + reactionsContainerLayout2.hintViewHeight);
                int i7 = reactionsContainerLayout2.type;
                if (i7 == 1 || i7 == 2) {
                    iMax = AndroidUtilities.dp(20.0f);
                } else {
                    reactionsContainerLayout2.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + iMax;
                }
                ((FrameLayout.LayoutParams) reactionsContainerLayout2.nextRecentReaction.getLayoutParams()).topMargin = iMax;
                ((FrameLayout.LayoutParams) reactionsContainerLayout2.recyclerListView.getLayoutParams()).topMargin = iMax;
                reactionsContainerLayout2.hintMeasured = true;
            }
            int totalWidth = this.reactionsLayout.getTotalWidth();
            View childAt = (this.popupWindowLayout.getSwipeBack() != null ? this.popupWindowLayout.getSwipeBack() : this.popupWindowLayout).getChildAt(0);
            int iDp = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int hintTextWidth = this.reactionsLayout.getHintTextWidth();
            if (hintTextWidth > iDp) {
                iDp = hintTextWidth;
            } else if (iDp > measuredWidth) {
                iDp = measuredWidth;
            }
            this.reactionsLayout.bigCircleOffset = AndroidUtilities.dp(36.0f);
            if (this.reactionsLayout.showCustomEmojiReaction()) {
                this.reactionsLayout.getLayoutParams().width = totalWidth;
                this.reactionsLayout.bigCircleOffset = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > iDp) {
                int iDp2 = ((iDp - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int iDp3 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * iDp2);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > iDp3) {
                    iDp3 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (iDp3 <= totalWidth && iDp2 != this.reactionsLayout.getItemsCount()) {
                    totalWidth = iDp3;
                }
                this.reactionsLayout.getLayoutParams().width = totalWidth;
            } else {
                this.reactionsLayout.getLayoutParams().width = -2;
            }
            if (this.reactionsLayout.getMeasuredWidth() == measuredWidth && this.reactionsLayout.showCustomEmojiReaction()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.popupLayoutLeftOffset = measuredWidth2;
                ReactionsContainerLayout reactionsContainerLayout3 = this.reactionsLayout;
                int i8 = (int) (reactionsContainerLayout3.bigCircleOffset - measuredWidth2);
                reactionsContainerLayout3.bigCircleOffset = i8;
                if (i8 < AndroidUtilities.dp(36.0f)) {
                    this.popupLayoutLeftOffset = 0.0f;
                    this.reactionsLayout.bigCircleOffset = AndroidUtilities.dp(36.0f);
                }
                float f = (1.0f - this.progressToSwipeBack) * this.popupLayoutLeftOffset;
                this.popupWindowLayout.setTranslationX(f);
                FrameLayout frameLayout = this.bottomView;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(f);
                }
            } else {
                int measuredWidth3 = this.popupWindowLayout.getSwipeBack() != null ? this.popupWindowLayout.getSwipeBack().getMeasuredWidth() - this.popupWindowLayout.getSwipeBack().getChildAt(0).getMeasuredWidth() : 0;
                if (this.reactionsLayout.getLayoutParams().width != -2 && this.reactionsLayout.getLayoutParams().width + measuredWidth3 > measuredWidth) {
                    measuredWidth3 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.reactionsLayout.getLayoutParams().width);
                }
                i4 = measuredWidth3 >= 0 ? measuredWidth3 : 0;
                ((LinearLayout.LayoutParams) this.reactionsLayout.getLayoutParams()).rightMargin = i4;
                this.popupLayoutLeftOffset = 0.0f;
                float f2 = (1.0f - this.progressToSwipeBack) * 0.0f;
                this.popupWindowLayout.setTranslationX(f2);
                FrameLayout frameLayout2 = this.bottomView;
                if (frameLayout2 != null) {
                    frameLayout2.setTranslationX(f2);
                }
            }
            if (this.bottomView != null) {
                if (this.reactionsLayout.showCustomEmojiReaction()) {
                    this.bottomView.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    float f3 = (1.0f - this.progressToSwipeBack) * this.popupLayoutLeftOffset;
                    this.popupWindowLayout.setTranslationX(f3);
                    FrameLayout frameLayout3 = this.bottomView;
                    if (frameLayout3 != null) {
                        frameLayout3.setTranslationX(f3);
                    }
                } else {
                    this.bottomView.getLayoutParams().width = -1;
                }
                if (this.popupWindowLayout.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.bottomView.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i4;
                } else {
                    ((LinearLayout.LayoutParams) this.bottomView.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        this.maxHeight = getMeasuredHeight();
    }

    public void setExpandSize(float f) {
        this.popupWindowLayout.setTranslationY(f);
        this.expandSize = f;
        FrameLayout frameLayout = this.bottomView;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.bottomViewYOffset + f + this.bottomViewReactionsOffset);
        }
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public void setPopupAlpha(float f) {
        this.popupWindowLayout.setAlpha(f);
        FrameLayout frameLayout = this.bottomView;
        if (frameLayout != null) {
            frameLayout.setAlpha(f);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        this.popupWindowLayout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setOnSizeChangedListener(new RateCallLayout$$ExternalSyntheticLambda1(3, this, actionBarPopupWindowLayout));
        if (actionBarPopupWindowLayout.getSwipeBack() != null) {
            PopupSwipeBackLayout swipeBack = actionBarPopupWindowLayout.getSwipeBack();
            swipeBack.onSwipeBackProgressListeners.add(new PopupSwipeBackLayout.OnSwipeBackProgressListener() {
                @Override
                public final void onSwipeBackProgress(float f, float f2) {
                    ChatScrimPopupContainerLayout chatScrimPopupContainerLayout = this.f$0;
                    FrameLayout frameLayout = chatScrimPopupContainerLayout.bottomView;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f2);
                    }
                    chatScrimPopupContainerLayout.progressToSwipeBack = f2;
                    float f3 = (1.0f - f2) * chatScrimPopupContainerLayout.popupLayoutLeftOffset;
                    chatScrimPopupContainerLayout.popupWindowLayout.setTranslationX(f3);
                    FrameLayout frameLayout2 = chatScrimPopupContainerLayout.bottomView;
                    if (frameLayout2 != null) {
                        frameLayout2.setTranslationX(f3);
                    }
                }
            });
        }
    }

    public void setReactionsLayout(ReactionsContainerLayout reactionsContainerLayout) {
        this.reactionsLayout = reactionsContainerLayout;
        if (reactionsContainerLayout != null) {
            reactionsContainerLayout.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f) {
        this.popupWindowLayout.setReactionsTransitionProgress(f);
        FrameLayout frameLayout = this.bottomView;
        if (frameLayout != null) {
            frameLayout.setAlpha(f);
            float f2 = (f * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.bottomView;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.bottomView.setPivotY(0.0f);
            float f3 = (1.0f - f) * (-this.popupWindowLayout.getMeasuredHeight());
            this.bottomViewReactionsOffset = f3;
            FrameLayout frameLayout3 = this.bottomView;
            if (frameLayout3 != null) {
                frameLayout3.setTranslationY(this.bottomViewYOffset + this.expandSize + f3);
            }
            this.bottomView.setScaleX(f2);
            this.bottomView.setScaleY(f2);
        }
    }
}
