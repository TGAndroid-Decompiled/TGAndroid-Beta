package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Components.PopupSwipeBackLayout;

public class ChatScrimPopupContainerLayout extends LinearLayout {
    private View bottomView;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout popupWindowLayout;
    private ReactionsContainerLayout reactionsLayout;

    public ChatScrimPopupContainerLayout(Context context) {
        super(context);
        setOrientation(1);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.reactionsLayout == null || this.popupWindowLayout == null) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
        int totalWidth = this.reactionsLayout.getTotalWidth();
        int i3 = 0;
        int measuredWidth = (this.popupWindowLayout.getSwipeBack() != null ? this.popupWindowLayout.getSwipeBack() : this.popupWindowLayout).getChildAt(0).getMeasuredWidth() + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(36.0f);
        if (totalWidth > measuredWidth) {
            int dp = ((measuredWidth - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
            int dp2 = ((AndroidUtilities.dp(36.0f) * dp) + AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(8.0f);
            if (dp2 <= totalWidth && dp != this.reactionsLayout.getItemsCount()) {
                totalWidth = dp2;
            }
            this.reactionsLayout.getLayoutParams().width = totalWidth;
        } else {
            this.reactionsLayout.getLayoutParams().width = -2;
        }
        if (this.popupWindowLayout.getSwipeBack() != null) {
            i3 = this.popupWindowLayout.getSwipeBack().getMeasuredWidth() - this.popupWindowLayout.getSwipeBack().getChildAt(0).getMeasuredWidth();
        }
        if (this.reactionsLayout.getLayoutParams().width != -2 && this.reactionsLayout.getLayoutParams().width + i3 > getMeasuredWidth()) {
            i3 = (getMeasuredWidth() - this.reactionsLayout.getLayoutParams().width) + AndroidUtilities.dp(8.0f);
        }
        ((LinearLayout.LayoutParams) this.reactionsLayout.getLayoutParams()).rightMargin = i3;
        if (this.bottomView != null) {
            if (this.popupWindowLayout.getSwipeBack() != null) {
                ((LinearLayout.LayoutParams) this.bottomView.getLayoutParams()).rightMargin = i3 + AndroidUtilities.dp(36.0f);
            } else {
                ((LinearLayout.LayoutParams) this.bottomView.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
            }
        }
        super.onMeasure(i, i2);
    }

    public void applyViewBottom(FrameLayout frameLayout) {
        this.bottomView = frameLayout;
    }

    public void setReactionsLayout(ReactionsContainerLayout reactionsContainerLayout) {
        this.reactionsLayout = reactionsContainerLayout;
    }

    public void setPopupWindowLayout(final ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        this.popupWindowLayout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setOnSizeChangedListener(new ActionBarPopupWindow.onSizeChangedListener() {
            @Override
            public void onSizeChanged() {
                if (ChatScrimPopupContainerLayout.this.bottomView != null) {
                    ChatScrimPopupContainerLayout.this.bottomView.setTranslationY(actionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindowLayout.getMeasuredHeight());
                }
            }
        });
        if (actionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindowLayout.getSwipeBack().addOnSwipeBackProgressListener(new PopupSwipeBackLayout.OnSwipeBackProgressListener() {
                @Override
                public void onSwipeBackProgress(PopupSwipeBackLayout popupSwipeBackLayout, float f, float f2) {
                    if (ChatScrimPopupContainerLayout.this.bottomView != null) {
                        ChatScrimPopupContainerLayout.this.bottomView.setAlpha(1.0f - f2);
                    }
                }
            });
        }
    }
}
