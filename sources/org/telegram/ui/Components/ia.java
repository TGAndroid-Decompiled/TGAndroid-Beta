package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ia extends LinearLayout {
    public final dw0 f25051a;
    public Paint f25052b;
    public int f25053c;
    public final boolean d;
    public final boolean e;
    public final Rect f25054f;

    public ia(Context context, dw0 dw0Var) {
        super(context);
        this.f25053c = 0;
        this.d = true;
        this.e = true;
        this.f25054f = new Rect();
        this.f25051a = dw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        dw0 dw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f25051a != null && this.e && this.f25053c != 0) {
            if (this.f25052b == null) {
                this.f25052b = new Paint();
            }
            this.f25052b.setColor(this.f25053c);
            this.f25054f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                dw0Var = this.f25051a;
                if (view == dw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            dw0Var.J(canvas2, f7, this.f25054f, this.f25052b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        dw0 dw0Var;
        if (SharedConfig.chatBlurEnabled() && (dw0Var = this.f25051a) != null) {
            dw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        dw0 dw0Var = this.f25051a;
        if (dw0Var != null) {
            dw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f25051a != null) {
            this.f25053c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
