package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class fa extends LinearLayout {
    public final qv0 f23856a;
    public Paint f23857b;
    public int f23858c;
    public final boolean d;
    public final boolean e;
    public final Rect f23859f;

    public fa(Context context, qv0 qv0Var) {
        super(context);
        this.f23858c = 0;
        this.d = true;
        this.e = true;
        this.f23859f = new Rect();
        this.f23856a = qv0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        qv0 qv0Var;
        if (SharedConfig.chatBlurEnabled() && this.f23856a != null && this.e && this.f23858c != 0) {
            if (this.f23857b == null) {
                this.f23857b = new Paint();
            }
            this.f23857b.setColor(this.f23858c);
            this.f23859f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                qv0Var = this.f23856a;
                if (view == qv0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            qv0Var.J(canvas2, f7, this.f23859f, this.f23857b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        qv0 qv0Var;
        if (SharedConfig.chatBlurEnabled() && (qv0Var = this.f23856a) != null) {
            qv0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        qv0 qv0Var = this.f23856a;
        if (qv0Var != null) {
            qv0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f23856a != null) {
            this.f23858c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
