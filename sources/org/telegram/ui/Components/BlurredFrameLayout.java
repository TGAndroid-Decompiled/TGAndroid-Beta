package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

public class BlurredFrameLayout extends FrameLayout {
    public int backgroundPaddingBottom;
    public int backgroundPaddingTop;
    protected Paint backgroundPaint;
    private final SizeNotifierFrameLayout sizeNotifierFrameLayout;
    public int backgroundColor = 0;
    public boolean isTopView = true;
    public boolean drawBlur = true;

    public BlurredFrameLayout(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout) {
        super(context);
        this.sizeNotifierFrameLayout = sizeNotifierFrameLayout;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        SizeNotifierFrameLayout sizeNotifierFrameLayout;
        if (SharedConfig.chatBlurEnabled() && this.sizeNotifierFrameLayout != null && this.drawBlur && this.backgroundColor != 0) {
            if (this.backgroundPaint == null) {
                this.backgroundPaint = new Paint();
            }
            this.backgroundPaint.setColor(this.backgroundColor);
            AndroidUtilities.rectTmp2.set(0, this.backgroundPaddingTop, getMeasuredWidth(), getMeasuredHeight() - this.backgroundPaddingBottom);
            float f = 0.0f;
            View view = this;
            while (true) {
                sizeNotifierFrameLayout = this.sizeNotifierFrameLayout;
                if (view == sizeNotifierFrameLayout) {
                    break;
                }
                f += view.getY();
                view = (View) view.getParent();
            }
            sizeNotifierFrameLayout.drawBlurRect(canvas, f, AndroidUtilities.rectTmp2, this.backgroundPaint, this.isTopView);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public void setBackgroundColor(int i) {
        if (!SharedConfig.chatBlurEnabled() || this.sizeNotifierFrameLayout == null) {
            super.setBackgroundColor(i);
        } else {
            this.backgroundColor = i;
        }
    }

    @Override
    protected void onAttachedToWindow() {
        SizeNotifierFrameLayout sizeNotifierFrameLayout;
        if (SharedConfig.chatBlurEnabled() && (sizeNotifierFrameLayout = this.sizeNotifierFrameLayout) != null) {
            sizeNotifierFrameLayout.blurBehindViews.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierFrameLayout;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.blurBehindViews.remove(this);
        }
        super.onDetachedFromWindow();
    }
}
