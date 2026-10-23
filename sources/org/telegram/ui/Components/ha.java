package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ha extends LinearLayout {
    public final lw0 f26843a;
    public Paint f26844b;
    public int f26845c;
    public final boolean d;
    public final boolean e;
    public final Rect f26846f;

    public ha(Context context, lw0 lw0Var) {
        super(context);
        this.f26845c = 0;
        this.d = true;
        this.e = true;
        this.f26846f = new Rect();
        this.f26843a = lw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        lw0 lw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f26843a != null && this.e && this.f26845c != 0) {
            if (this.f26844b == null) {
                this.f26844b = new Paint();
            }
            this.f26844b.setColor(this.f26845c);
            this.f26846f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                lw0Var = this.f26843a;
                if (view == lw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            lw0Var.J(canvas2, f7, this.f26846f, this.f26844b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        lw0 lw0Var;
        if (SharedConfig.chatBlurEnabled() && (lw0Var = this.f26843a) != null) {
            lw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        lw0 lw0Var = this.f26843a;
        if (lw0Var != null) {
            lw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f26843a != null) {
            this.f26845c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
