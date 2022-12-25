package org.telegram.p009ui.Components;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

@SuppressLint({"ViewConstructor"})
public class BlurredLinearLayout extends LinearLayout {
    public int backgroundColor;
    public int backgroundPaddingBottom;
    public int backgroundPaddingTop;
    protected Paint backgroundPaint;
    public boolean drawBlur;
    public boolean isTopView;
    private final SizeNotifierFrameLayout sizeNotifierFrameLayout;

    public BlurredLinearLayout(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout) {
        super(context);
        this.backgroundColor = 0;
        this.isTopView = true;
        this.drawBlur = true;
        this.sizeNotifierFrameLayout = sizeNotifierFrameLayout;
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
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
        if (SharedConfig.chatBlurEnabled() && this.sizeNotifierFrameLayout != null) {
            this.backgroundColor = i;
        } else {
            super.setBackgroundColor(i);
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
