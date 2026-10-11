package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ja extends LinearLayout {
    public final uw0 f27634a;
    public Paint f27635b;
    public int f27636c;
    public final boolean d;
    public final boolean f27637e;
    public final Rect f27638f;

    public ja(Context context, uw0 uw0Var) {
        super(context);
        this.f27636c = 0;
        this.d = true;
        this.f27637e = true;
        this.f27638f = new Rect();
        this.f27634a = uw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        uw0 uw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f27634a != null && this.f27637e && this.f27636c != 0) {
            if (this.f27635b == null) {
                this.f27635b = new Paint();
            }
            this.f27635b.setColor(this.f27636c);
            this.f27638f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                uw0Var = this.f27634a;
                if (view == uw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            uw0Var.J(canvas2, f7, this.f27638f, this.f27635b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        uw0 uw0Var;
        if (SharedConfig.chatBlurEnabled() && (uw0Var = this.f27634a) != null) {
            uw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        uw0 uw0Var = this.f27634a;
        if (uw0Var != null) {
            uw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f27634a != null) {
            this.f27636c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
