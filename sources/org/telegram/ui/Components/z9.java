package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class z9 extends LinearLayout {
    public final qv0 f31308a;
    public Paint f31309b;
    public int f31310c;
    public final boolean d;
    public final boolean e;
    public final Rect f31311f;

    public z9(Context context, qv0 qv0Var) {
        super(context);
        this.f31310c = 0;
        this.d = true;
        this.e = true;
        this.f31311f = new Rect();
        this.f31308a = qv0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        qv0 qv0Var;
        if (SharedConfig.chatBlurEnabled() && this.f31308a != null && this.e && this.f31310c != 0) {
            if (this.f31309b == null) {
                this.f31309b = new Paint();
            }
            this.f31309b.setColor(this.f31310c);
            this.f31311f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f10 = 0.0f;
            View view = this;
            while (true) {
                qv0Var = this.f31308a;
                if (view == qv0Var) {
                    break;
                }
                f10 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            qv0Var.J(canvas2, f10, this.f31311f, this.f31309b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        qv0 qv0Var;
        if (SharedConfig.chatBlurEnabled() && (qv0Var = this.f31308a) != null) {
            qv0Var.Q.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        qv0 qv0Var = this.f31308a;
        if (qv0Var != null) {
            qv0Var.Q.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f31308a != null) {
            this.f31310c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
