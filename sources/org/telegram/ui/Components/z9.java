package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class z9 extends LinearLayout {
    public final xu0 f35247a;
    public Paint f35248b;
    public int f35249c;
    public final boolean d;
    public final boolean f35250e;
    public final Rect f35251f;

    public z9(Context context, xu0 xu0Var) {
        super(context);
        this.f35249c = 0;
        this.d = true;
        this.f35250e = true;
        this.f35251f = new Rect();
        this.f35247a = xu0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        xu0 xu0Var;
        if (SharedConfig.chatBlurEnabled() && this.f35247a != null && this.f35250e && this.f35249c != 0) {
            if (this.f35248b == null) {
                this.f35248b = new Paint();
            }
            this.f35248b.setColor(this.f35249c);
            this.f35251f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f10 = 0.0f;
            View view = this;
            while (true) {
                xu0Var = this.f35247a;
                if (view == xu0Var) {
                    break;
                }
                f10 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            xu0Var.J(canvas2, f10, this.f35251f, this.f35248b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        xu0 xu0Var;
        if (SharedConfig.chatBlurEnabled() && (xu0Var = this.f35247a) != null) {
            xu0Var.P.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        xu0 xu0Var = this.f35247a;
        if (xu0Var != null) {
            xu0Var.P.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i9) {
        if (SharedConfig.chatBlurEnabled() && this.f35247a != null) {
            this.f35249c = i9;
        } else {
            super.setBackgroundColor(i9);
        }
    }
}
