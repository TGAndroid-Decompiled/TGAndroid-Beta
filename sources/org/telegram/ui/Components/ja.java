package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ja extends LinearLayout {
    public final ow0 f25941a;
    public Paint f25942b;
    public int f25943c;
    public final boolean d;
    public final boolean e;
    public final Rect f25944f;

    public ja(Context context, ow0 ow0Var) {
        super(context);
        this.f25943c = 0;
        this.d = true;
        this.e = true;
        this.f25944f = new Rect();
        this.f25941a = ow0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        ow0 ow0Var;
        if (SharedConfig.chatBlurEnabled() && this.f25941a != null && this.e && this.f25943c != 0) {
            if (this.f25942b == null) {
                this.f25942b = new Paint();
            }
            this.f25942b.setColor(this.f25943c);
            this.f25944f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                ow0Var = this.f25941a;
                if (view == ow0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            ow0Var.J(canvas2, f7, this.f25944f, this.f25942b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        ow0 ow0Var;
        if (SharedConfig.chatBlurEnabled() && (ow0Var = this.f25941a) != null) {
            ow0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        ow0 ow0Var = this.f25941a;
        if (ow0Var != null) {
            ow0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f25941a != null) {
            this.f25943c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
