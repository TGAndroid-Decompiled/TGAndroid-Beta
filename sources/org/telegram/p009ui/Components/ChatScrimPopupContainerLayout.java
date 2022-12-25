package org.telegram.p009ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.ActionBar.ActionBarPopupWindow;
import org.telegram.p009ui.Components.PopupSwipeBackLayout;

public class ChatScrimPopupContainerLayout extends LinearLayout {
    private View bottomView;
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

    @Override
    protected void onMeasure(int i, int i2) {
        int i3 = this.maxHeight;
        if (i3 != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsLayout;
        if (reactionsContainerLayout != null && this.popupWindowLayout != null) {
            reactionsContainerLayout.getLayoutParams().width = -2;
            ((LinearLayout.LayoutParams) this.reactionsLayout.getLayoutParams()).rightMargin = 0;
            this.popupLayoutLeftOffset = 0.0f;
            super.onMeasure(i, i2);
            int measuredWidth = this.reactionsLayout.getMeasuredWidth();
            if (this.popupWindowLayout.getSwipeBack() != null && this.popupWindowLayout.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.popupWindowLayout.getSwipeBack().getMeasuredWidth();
            }
            if (this.popupWindowLayout.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.popupWindowLayout.getMeasuredWidth();
            }
            if (this.reactionsLayout.showCustomEmojiReaction()) {
                i = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            int totalWidth = this.reactionsLayout.getTotalWidth();
            View childAt = (this.popupWindowLayout.getSwipeBack() != null ? this.popupWindowLayout.getSwipeBack() : this.popupWindowLayout).getChildAt(0);
            int measuredWidth2 = childAt.getMeasuredWidth() + AndroidUtilities.m35dp(16.0f) + AndroidUtilities.m35dp(16.0f) + AndroidUtilities.m35dp(36.0f);
            if (measuredWidth2 > measuredWidth) {
                measuredWidth2 = measuredWidth;
            }
            this.reactionsLayout.bigCircleOffset = AndroidUtilities.m35dp(36.0f);
            if (this.reactionsLayout.showCustomEmojiReaction()) {
                this.reactionsLayout.getLayoutParams().width = totalWidth;
                this.reactionsLayout.bigCircleOffset = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.m35dp(36.0f), AndroidUtilities.m35dp(36.0f));
            } else if (totalWidth > measuredWidth2) {
                int m35dp = ((measuredWidth2 - AndroidUtilities.m35dp(16.0f)) / AndroidUtilities.m35dp(36.0f)) + 1;
                int m35dp2 = ((AndroidUtilities.m35dp(36.0f) * m35dp) + AndroidUtilities.m35dp(16.0f)) - AndroidUtilities.m35dp(8.0f);
                if (m35dp2 <= totalWidth && m35dp != this.reactionsLayout.getItemsCount()) {
                    totalWidth = m35dp2;
                }
                this.reactionsLayout.getLayoutParams().width = totalWidth;
            } else {
                this.reactionsLayout.getLayoutParams().width = -2;
            }
            if (this.reactionsLayout.getMeasuredWidth() != measuredWidth || !this.reactionsLayout.showCustomEmojiReaction()) {
                int measuredWidth3 = this.popupWindowLayout.getSwipeBack() != null ? this.popupWindowLayout.getSwipeBack().getMeasuredWidth() - this.popupWindowLayout.getSwipeBack().getChildAt(0).getMeasuredWidth() : 0;
                if (this.reactionsLayout.getLayoutParams().width != -2 && this.reactionsLayout.getLayoutParams().width + measuredWidth3 > measuredWidth) {
                    measuredWidth3 = (measuredWidth - this.reactionsLayout.getLayoutParams().width) + AndroidUtilities.m35dp(8.0f);
                }
                r2 = measuredWidth3 >= 0 ? measuredWidth3 : 0;
                ((LinearLayout.LayoutParams) this.reactionsLayout.getLayoutParams()).rightMargin = r2;
                this.popupLayoutLeftOffset = 0.0f;
                updatePopupTranslation();
            } else {
                float measuredWidth4 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.popupLayoutLeftOffset = measuredWidth4;
                ReactionsContainerLayout reactionsContainerLayout2 = this.reactionsLayout;
                int i4 = (int) (reactionsContainerLayout2.bigCircleOffset - measuredWidth4);
                reactionsContainerLayout2.bigCircleOffset = i4;
                if (i4 < AndroidUtilities.m35dp(36.0f)) {
                    this.popupLayoutLeftOffset = 0.0f;
                    this.reactionsLayout.bigCircleOffset = AndroidUtilities.m35dp(36.0f);
                }
                updatePopupTranslation();
            }
            if (this.bottomView != null) {
                if (this.reactionsLayout.showCustomEmojiReaction()) {
                    this.bottomView.getLayoutParams().width = childAt.getMeasuredWidth() + AndroidUtilities.m35dp(16.0f);
                    updatePopupTranslation();
                } else {
                    this.bottomView.getLayoutParams().width = -1;
                }
                if (this.popupWindowLayout.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.bottomView.getLayoutParams()).rightMargin = r2 + AndroidUtilities.m35dp(36.0f);
                } else {
                    ((LinearLayout.LayoutParams) this.bottomView.getLayoutParams()).rightMargin = AndroidUtilities.m35dp(36.0f);
                }
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
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

    public void setReactionsLayout(ReactionsContainerLayout reactionsContainerLayout) {
        this.reactionsLayout = reactionsContainerLayout;
        if (reactionsContainerLayout != null) {
            reactionsContainerLayout.setChatScrimView(this);
        }
    }

    public void setPopupWindowLayout(final ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        this.popupWindowLayout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setOnSizeChangedListener(new ActionBarPopupWindow.onSizeChangedListener() {
            @Override
            public final void onSizeChanged() {
                ChatScrimPopupContainerLayout.this.lambda$setPopupWindowLayout$0(actionBarPopupWindowLayout);
            }
        });
        if (actionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindowLayout.getSwipeBack().addOnSwipeBackProgressListener(new PopupSwipeBackLayout.OnSwipeBackProgressListener() {
                @Override
                public final void onSwipeBackProgress(PopupSwipeBackLayout popupSwipeBackLayout, float f, float f2) {
                    ChatScrimPopupContainerLayout.this.lambda$setPopupWindowLayout$1(popupSwipeBackLayout, f, f2);
                }
            });
        }
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
            view.setTranslationY(this.bottomViewYOffset + this.expandSize);
        }
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public void setExpandSize(float f) {
        this.popupWindowLayout.setTranslationY(f);
        this.expandSize = f;
        updateBottomViewPosition();
    }

    public void setPopupAlpha(float f) {
        this.popupWindowLayout.setAlpha(f);
        View view = this.bottomView;
        if (view != null) {
            view.setAlpha(f);
        }
    }
}
