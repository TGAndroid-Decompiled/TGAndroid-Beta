package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ja extends LinearLayout {
    public final ow0 f26300a;
    public Paint f26301b;
    public int f26302c;
    public final boolean d;
    public final boolean e;
    public final Rect f26303f;

    public ja(Context context, ow0 ow0Var) {
        super(context);
        this.f26302c = 0;
        this.d = true;
        this.e = true;
        this.f26303f = new Rect();
        this.f26300a = ow0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        ow0 ow0Var;
        if (SharedConfig.chatBlurEnabled() && this.f26300a != null && this.e && this.f26302c != 0) {
            if (this.f26301b == null) {
                this.f26301b = new Paint();
            }
            this.f26301b.setColor(this.f26302c);
            this.f26303f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                ow0Var = this.f26300a;
                if (view == ow0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            ow0Var.J(canvas2, f7, this.f26303f, this.f26301b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        ow0 ow0Var;
        if (SharedConfig.chatBlurEnabled() && (ow0Var = this.f26300a) != null) {
            ow0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        ow0 ow0Var = this.f26300a;
        if (ow0Var != null) {
            ow0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f26300a != null) {
            this.f26302c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
