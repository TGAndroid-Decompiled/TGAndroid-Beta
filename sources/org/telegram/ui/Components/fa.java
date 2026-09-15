package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class fa extends LinearLayout {
    public final pv0 f23877a;
    public Paint f23878b;
    public int f23879c;
    public final boolean d;
    public final boolean e;
    public final Rect f23880f;

    public fa(Context context, pv0 pv0Var) {
        super(context);
        this.f23879c = 0;
        this.d = true;
        this.e = true;
        this.f23880f = new Rect();
        this.f23877a = pv0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        pv0 pv0Var;
        if (SharedConfig.chatBlurEnabled() && this.f23877a != null && this.e && this.f23879c != 0) {
            if (this.f23878b == null) {
                this.f23878b = new Paint();
            }
            this.f23878b.setColor(this.f23879c);
            this.f23880f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                pv0Var = this.f23877a;
                if (view == pv0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            pv0Var.J(canvas2, f7, this.f23880f, this.f23878b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        pv0 pv0Var;
        if (SharedConfig.chatBlurEnabled() && (pv0Var = this.f23877a) != null) {
            pv0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        pv0 pv0Var = this.f23877a;
        if (pv0Var != null) {
            pv0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f23877a != null) {
            this.f23879c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
