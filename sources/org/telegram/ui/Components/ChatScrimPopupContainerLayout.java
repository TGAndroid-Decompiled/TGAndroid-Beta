package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;

public class ChatScrimPopupContainerLayout extends LinearLayout {
    private View bottomView;
    private float bottomViewReactionsOffset;
    private float bottomViewYOffset;
    private float expandSize;
    private int maxHeight;
    private float popupLayoutLeftOffset;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout popupWindowLayout;
    private float progressToSwipeBack;
    private ReactionsContainerLayout reactionsLayout;

    public ChatScrimPopupContainerLayout(Context context) {
        super(context);
        setOrientation(1);
    }

    public void lambda$setPopupWindowLayout$0(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        if (this.bottomView != null) {
            this.bottomViewYOffset = actionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindowLayout.getMeasuredHeight();
            updateBottomViewPosition();
        }
    }

    public void lambda$setPopupWindowLayout$1(PopupSwipeBackLayout popupSwipeBackLayout, float f, float f2) {
        View view = this.bottomView;
        if (view != null) {
            view.setAlpha(1.0f - f2);
        }
        this.progressToSwipeBack = f2;
        updatePopupTranslation();
    }

    private void updateBottomViewPosition() {
        View view = this.bottomView;
        if (view != null) {
            view.setTranslationY(this.bottomViewYOffset + this.expandSize + this.bottomViewReactionsOffset);
        }
    }

    private void updatePopupTranslation() {
        float f = (1.0f - this.progressToSwipeBack) * this.popupLayoutLeftOffset;
        this.popupWindowLayout.setTranslationX(f);
        View view = this.bottomView;
        if (view != null) {
            view.setTranslationX(f);
        }
    }

    public void applyViewBottom(FrameLayout frameLayout) {
        this.bottomView = frameLayout;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override
    public void onMeasure(int i, int i2) {
        float f;
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
            this.reactionsLayout.measureHint();
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
                f = 16.0f;
            } else if (totalWidth > iDp) {
                int iDp2 = ((iDp - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int iDp3 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * iDp2);
                f = 16.0f;
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > iDp3) {
                    iDp3 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (iDp3 <= totalWidth && iDp2 != this.reactionsLayout.getItemsCount()) {
                    totalWidth = iDp3;
                }
                this.reactionsLayout.getLayoutParams().width = totalWidth;
            } else {
                f = 16.0f;
                this.reactionsLayout.getLayoutParams().width = -2;
            }
            if (this.reactionsLayout.getMeasuredWidth() == measuredWidth && this.reactionsLayout.showCustomEmojiReaction()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.popupLayoutLeftOffset = measuredWidth2;
                ReactionsContainerLayout reactionsContainerLayout2 = this.reactionsLayout;
                int i5 = (int) (reactionsContainerLayout2.bigCircleOffset - measuredWidth2);
                reactionsContainerLayout2.bigCircleOffset = i5;
                if (i5 < AndroidUtilities.dp(36.0f)) {
                    this.popupLayoutLeftOffset = 0.0f;
                    this.reactionsLayout.bigCircleOffset = AndroidUtilities.dp(36.0f);
                }
                updatePopupTranslation();
            } else {
                int measuredWidth3 = this.popupWindowLayout.getSwipeBack() != null ? this.popupWindowLayout.getSwipeBack().getMeasuredWidth() - this.popupWindowLayout.getSwipeBack().getChildAt(0).getMeasuredWidth() : 0;
                if (this.reactionsLayout.getLayoutParams().width != -2 && this.reactionsLayout.getLayoutParams().width + measuredWidth3 > measuredWidth) {
                    measuredWidth3 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.reactionsLayout.getLayoutParams().width);
                }
                i4 = measuredWidth3 >= 0 ? measuredWidth3 : 0;
                ((LinearLayout.LayoutParams) this.reactionsLayout.getLayoutParams()).rightMargin = i4;
                this.popupLayoutLeftOffset = 0.0f;
                updatePopupTranslation();
            }
            if (this.bottomView != null) {
                if (this.reactionsLayout.showCustomEmojiReaction()) {
                    this.bottomView.getLayoutParams().width = AndroidUtilities.dp(f) + childAt.getMeasuredWidth();
                    updatePopupTranslation();
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
        updateBottomViewPosition();
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public void setPopupAlpha(float f) {
        this.popupWindowLayout.setAlpha(f);
        View view = this.bottomView;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        this.popupWindowLayout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setOnSizeChangedListener(new AIEditorAlert$$ExternalSyntheticLambda34(23, this, actionBarPopupWindowLayout));
        if (actionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindowLayout.getSwipeBack().addOnSwipeBackProgressListener(new PopupSwipeBackLayout.OnSwipeBackProgressListener() {
                @Override
                public final void onSwipeBackProgress(PopupSwipeBackLayout popupSwipeBackLayout, float f, float f2) {
                    this.f$0.lambda$setPopupWindowLayout$1(popupSwipeBackLayout, f, f2);
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
        View view = this.bottomView;
        if (view != null) {
            view.setAlpha(f);
            float f2 = (f * 0.5f) + 0.5f;
            View view2 = this.bottomView;
            view2.setPivotX(view2.getMeasuredWidth());
            this.bottomView.setPivotY(0.0f);
            this.bottomViewReactionsOffset = (1.0f - f) * (-this.popupWindowLayout.getMeasuredHeight());
            updateBottomViewPosition();
            this.bottomView.setScaleX(f2);
            this.bottomView.setScaleY(f2);
        }
    }
}
