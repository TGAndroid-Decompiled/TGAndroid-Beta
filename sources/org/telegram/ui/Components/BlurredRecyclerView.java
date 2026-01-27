package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

public class BlurredRecyclerView extends RecyclerListView {
    public int additionalClipBottom;
    public boolean alwaysDrawChild;
    public int blurTopPadding;
    public int bottomPadding;
    boolean globalIgnoreLayout;
    public int topPadding;

    public BlurredRecyclerView(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        this.globalIgnoreLayout = true;
        updateTopPadding();
        super.setPadding(getPaddingLeft(), this.topPadding + this.blurTopPadding, getPaddingRight(), getPaddingBottom());
        this.globalIgnoreLayout = false;
        super.onMeasure(i, i2);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateTopPadding();
    }

    private void updateTopPadding() {
        if (getLayoutParams() == null) {
            return;
        }
        if (SharedConfig.chatBlurEnabled()) {
            this.blurTopPadding = measureBlurTopPadding();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.blurTopPadding;
        } else {
            this.blurTopPadding = 0;
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
        }
    }

    protected int measureBlurTopPadding() {
        return AndroidUtilities.dp(203.0f);
    }

    @Override
    public void requestLayout() {
        if (this.globalIgnoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (this.blurTopPadding != 0 && !hasActiveEdgeEffects()) {
            canvas.clipRect(0, this.blurTopPadding, getMeasuredWidth(), getMeasuredHeight() + this.additionalClipBottom);
            super.dispatchDraw(canvas);
        } else {
            super.dispatchDraw(canvas);
        }
    }

    @Override
    public void capture(Canvas canvas, RectF rectF) {
        this.alwaysDrawChild = true;
        super.capture(canvas, rectF);
        this.alwaysDrawChild = false;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view.getY() + view.getMeasuredHeight() >= this.blurTopPadding || this.alwaysDrawChild || hasActiveEdgeEffects()) {
            return super.drawChild(canvas, view, j);
        }
        return true;
    }

    @Override
    public void setPadding(int i, int i2, int i3, int i4) {
        this.topPadding = i2;
        this.bottomPadding = i4;
        super.setPadding(i, i2 + this.blurTopPadding, i3, i4);
    }
}
