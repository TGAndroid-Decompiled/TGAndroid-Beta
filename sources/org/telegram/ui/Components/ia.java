package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ia extends LinearLayout {
    public final lw0 f27347a;
    public Paint f27348b;
    public int f27349c;
    public final boolean d;
    public final boolean f27350e;
    public final Rect f27351f;

    public ia(Context context, lw0 lw0Var) {
        super(context);
        this.f27349c = 0;
        this.d = true;
        this.f27350e = true;
        this.f27351f = new Rect();
        this.f27347a = lw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        lw0 lw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f27347a != null && this.f27350e && this.f27349c != 0) {
            if (this.f27348b == null) {
                this.f27348b = new Paint();
            }
            this.f27348b.setColor(this.f27349c);
            this.f27351f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                lw0Var = this.f27347a;
                if (view == lw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            lw0Var.J(canvas2, f7, this.f27351f, this.f27348b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        lw0 lw0Var;
        if (SharedConfig.chatBlurEnabled() && (lw0Var = this.f27347a) != null) {
            lw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        lw0 lw0Var = this.f27347a;
        if (lw0Var != null) {
            lw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f27347a != null) {
            this.f27349c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
