package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ha extends LinearLayout {
    public final cw0 f24751a;
    public Paint f24752b;
    public int f24753c;
    public final boolean d;
    public final boolean e;
    public final Rect f24754f;

    public ha(Context context, cw0 cw0Var) {
        super(context);
        this.f24753c = 0;
        this.d = true;
        this.e = true;
        this.f24754f = new Rect();
        this.f24751a = cw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        cw0 cw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f24751a != null && this.e && this.f24753c != 0) {
            if (this.f24752b == null) {
                this.f24752b = new Paint();
            }
            this.f24752b.setColor(this.f24753c);
            this.f24754f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                cw0Var = this.f24751a;
                if (view == cw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            cw0Var.J(canvas2, f7, this.f24754f, this.f24752b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        cw0 cw0Var;
        if (SharedConfig.chatBlurEnabled() && (cw0Var = this.f24751a) != null) {
            cw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        cw0 cw0Var = this.f24751a;
        if (cw0Var != null) {
            cw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f24751a != null) {
            this.f24753c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
