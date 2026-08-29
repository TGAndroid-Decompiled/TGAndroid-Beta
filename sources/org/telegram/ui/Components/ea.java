package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ea extends LinearLayout {
    public final hv0 f27982a;
    public Paint f27983b;
    public int f27984c;
    public final boolean d;
    public final boolean f27985e;
    public final Rect f27986f;

    public ea(Context context, hv0 hv0Var) {
        super(context);
        this.f27984c = 0;
        this.d = true;
        this.f27985e = true;
        this.f27986f = new Rect();
        this.f27982a = hv0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        hv0 hv0Var;
        if (SharedConfig.chatBlurEnabled() && this.f27982a != null && this.f27985e && this.f27984c != 0) {
            if (this.f27983b == null) {
                this.f27983b = new Paint();
            }
            this.f27983b.setColor(this.f27984c);
            this.f27986f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f9 = 0.0f;
            View view = this;
            while (true) {
                hv0Var = this.f27982a;
                if (view == hv0Var) {
                    break;
                }
                f9 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            hv0Var.J(canvas2, f9, this.f27986f, this.f27983b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        hv0 hv0Var;
        if (SharedConfig.chatBlurEnabled() && (hv0Var = this.f27982a) != null) {
            hv0Var.P.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        hv0 hv0Var = this.f27982a;
        if (hv0Var != null) {
            hv0Var.P.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f27982a != null) {
            this.f27984c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
