package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class z9 extends LinearLayout {
    public final qv0 f33831a;
    public Paint f33832b;
    public int f33833c;
    public final boolean d;
    public final boolean f33834e;
    public final Rect f33835f;

    public z9(Context context, qv0 qv0Var) {
        super(context);
        this.f33833c = 0;
        this.d = true;
        this.f33834e = true;
        this.f33835f = new Rect();
        this.f33831a = qv0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        qv0 qv0Var;
        if (SharedConfig.chatBlurEnabled() && this.f33831a != null && this.f33834e && this.f33833c != 0) {
            if (this.f33832b == null) {
                this.f33832b = new Paint();
            }
            this.f33832b.setColor(this.f33833c);
            this.f33835f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f10 = 0.0f;
            View view = this;
            while (true) {
                qv0Var = this.f33831a;
                if (view == qv0Var) {
                    break;
                }
                f10 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            qv0Var.J(canvas2, f10, this.f33835f, this.f33832b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        qv0 qv0Var;
        if (SharedConfig.chatBlurEnabled() && (qv0Var = this.f33831a) != null) {
            qv0Var.Q.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        qv0 qv0Var = this.f33831a;
        if (qv0Var != null) {
            qv0Var.Q.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f33831a != null) {
            this.f33833c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
