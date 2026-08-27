package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;

public final class x9 extends LinearLayout {

    public final zu0 f34554a;

    public Paint f34555b;

    public int f34556c;
    public final boolean d;

    public final boolean f34557e;

    public final Rect f34558f;

    public x9(Context context, zu0 zu0Var) {
        super(context);
        this.f34556c = 0;
        this.d = true;
        this.f34557e = true;
        this.f34558f = new Rect();
        this.f34554a = zu0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        zu0 zu0Var;
        if (!SharedConfig.chatBlurEnabled() || this.f34554a == null || !this.f34557e || this.f34556c == 0) {
            canvas2 = canvas;
        } else {
            if (this.f34555b == null) {
                this.f34555b = new Paint();
            }
            this.f34555b.setColor(this.f34556c);
            this.f34558f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float y10 = 0.0f;
            View view = this;
            while (true) {
                zu0Var = this.f34554a;
                if (view == zu0Var) {
                    break;
                }
                y10 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            zu0Var.J(canvas2, y10, this.f34558f, this.f34555b, this.d);
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        zu0 zu0Var;
        if (SharedConfig.chatBlurEnabled() && (zu0Var = this.f34554a) != null) {
            zu0Var.P.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        zu0 zu0Var = this.f34554a;
        if (zu0Var != null) {
            zu0Var.P.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (!SharedConfig.chatBlurEnabled() || this.f34554a == null) {
            super.setBackgroundColor(i10);
        } else {
            this.f34556c = i10;
        }
    }
}
