package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

public class BlurredRecyclerView extends RecyclerListView {
    public int additionalClipBottom;
    public int blurTopPadding;
    boolean globalIgnoreLayout;
    int topPadding;

    public BlurredRecyclerView(Context context) {
        super(context);
    }

    @Override
    public void onMeasure(int i, int i2) {
        this.globalIgnoreLayout = true;
        updateTopPadding();
        super.setPadding(getPaddingLeft(), this.topPadding + this.blurTopPadding, getPaddingRight(), getPaddingBottom());
        this.globalIgnoreLayout = false;
        super.onMeasure(i, i2);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateTopPadding();
    }

    private void updateTopPadding() {
        if (getLayoutParams() != null) {
            if (SharedConfig.chatBlurEnabled()) {
                this.blurTopPadding = AndroidUtilities.m34dp(203.0f);
                ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.blurTopPadding;
                return;
            }
            this.blurTopPadding = 0;
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
        }
    }

    @Override
    public void requestLayout() {
        if (!this.globalIgnoreLayout) {
            super.requestLayout();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i = this.blurTopPadding;
        if (i != 0) {
            canvas.clipRect(0, i, getMeasuredWidth(), getMeasuredHeight() + this.additionalClipBottom);
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view.getY() + view.getMeasuredHeight() < this.blurTopPadding) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public void setPadding(int i, int i2, int i3, int i4) {
        this.topPadding = i2;
        super.setPadding(i, i2 + this.blurTopPadding, i3, i4);
    }
}
