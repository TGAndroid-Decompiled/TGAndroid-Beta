package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;

public final class BlurredLinearLayout extends LinearLayout {
    public int backgroundColor;
    public Paint backgroundPaint;
    public final Rect blurBounds;
    public final boolean drawBlur;
    public final boolean isTopView;
    public final SizeNotifierFrameLayout sizeNotifierFrameLayout;

    public BlurredLinearLayout(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout) {
        super(context);
        this.backgroundColor = 0;
        this.isTopView = true;
        this.drawBlur = true;
        this.blurBounds = new Rect();
        this.sizeNotifierFrameLayout = sizeNotifierFrameLayout;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        SizeNotifierFrameLayout sizeNotifierFrameLayout;
        if (!SharedConfig.chatBlurEnabled() || this.sizeNotifierFrameLayout == null || !this.drawBlur || this.backgroundColor == 0) {
            canvas2 = canvas;
        } else {
            if (this.backgroundPaint == null) {
                this.backgroundPaint = new Paint();
            }
            this.backgroundPaint.setColor(this.backgroundColor);
            this.blurBounds.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float y = 0.0f;
            View view = this;
            while (true) {
                sizeNotifierFrameLayout = this.sizeNotifierFrameLayout;
                if (view == sizeNotifierFrameLayout) {
                    break;
                }
                y += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            sizeNotifierFrameLayout.drawBlurRect(canvas2, y, this.blurBounds, this.backgroundPaint, this.isTopView);
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        SizeNotifierFrameLayout sizeNotifierFrameLayout;
        if (SharedConfig.chatBlurEnabled() && (sizeNotifierFrameLayout = this.sizeNotifierFrameLayout) != null) {
            sizeNotifierFrameLayout.blurBehindViews.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierFrameLayout;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.blurBehindViews.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i) {
        if (!SharedConfig.chatBlurEnabled() || this.sizeNotifierFrameLayout == null) {
            super.setBackgroundColor(i);
        } else {
            this.backgroundColor = i;
        }
    }
}
