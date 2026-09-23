package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ha extends LinearLayout {
    public final pv0 f24622a;
    public Paint f24623b;
    public int f24624c;
    public final boolean d;
    public final boolean e;
    public final Rect f24625f;

    public ha(Context context, pv0 pv0Var) {
        super(context);
        this.f24624c = 0;
        this.d = true;
        this.e = true;
        this.f24625f = new Rect();
        this.f24622a = pv0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        pv0 pv0Var;
        if (SharedConfig.chatBlurEnabled() && this.f24622a != null && this.e && this.f24624c != 0) {
            if (this.f24623b == null) {
                this.f24623b = new Paint();
            }
            this.f24623b.setColor(this.f24624c);
            this.f24625f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                pv0Var = this.f24622a;
                if (view == pv0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            pv0Var.J(canvas2, f7, this.f24625f, this.f24623b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        pv0 pv0Var;
        if (SharedConfig.chatBlurEnabled() && (pv0Var = this.f24622a) != null) {
            pv0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        pv0 pv0Var = this.f24622a;
        if (pv0Var != null) {
            pv0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f24622a != null) {
            this.f24624c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
