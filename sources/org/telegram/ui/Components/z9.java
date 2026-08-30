package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class z9 extends LinearLayout {
    public final qv0 f31288a;
    public Paint f31289b;
    public int f31290c;
    public final boolean d;
    public final boolean e;
    public final Rect f31291f;

    public z9(Context context, qv0 qv0Var) {
        super(context);
        this.f31290c = 0;
        this.d = true;
        this.e = true;
        this.f31291f = new Rect();
        this.f31288a = qv0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        qv0 qv0Var;
        if (SharedConfig.chatBlurEnabled() && this.f31288a != null && this.e && this.f31290c != 0) {
            if (this.f31289b == null) {
                this.f31289b = new Paint();
            }
            this.f31289b.setColor(this.f31290c);
            this.f31291f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f10 = 0.0f;
            View view = this;
            while (true) {
                qv0Var = this.f31288a;
                if (view == qv0Var) {
                    break;
                }
                f10 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            qv0Var.J(canvas2, f10, this.f31291f, this.f31289b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        qv0 qv0Var;
        if (SharedConfig.chatBlurEnabled() && (qv0Var = this.f31288a) != null) {
            qv0Var.Q.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        qv0 qv0Var = this.f31288a;
        if (qv0Var != null) {
            qv0Var.Q.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f31288a != null) {
            this.f31290c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
