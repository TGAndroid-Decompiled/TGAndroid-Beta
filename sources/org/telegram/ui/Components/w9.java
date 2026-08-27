package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;

public abstract class w9 extends FrameLayout {

    public final zu0 f34144a;

    public Paint f34145b;

    public int f34146c;
    public final boolean d;

    public final boolean f34147e;

    public final Rect f34148f;

    public w9(Context context, zu0 zu0Var) {
        super(context);
        this.f34146c = 0;
        this.d = true;
        this.f34147e = true;
        this.f34148f = new Rect();
        this.f34144a = zu0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (!SharedConfig.chatBlurEnabled() || this.f34144a == null || !this.f34147e || this.f34146c == 0) {
            canvas2 = canvas;
        } else {
            if (this.f34145b == null) {
                this.f34145b = new Paint();
            }
            this.f34145b.setColor(this.f34146c);
            this.f34148f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float y10 = 0.0f;
            View view = this;
            while (true) {
                zu0 zu0Var = this.f34144a;
                if (view != zu0Var) {
                    y10 += view.getY();
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        super.dispatchDraw(canvas);
                        return;
                    }
                    view = (View) parent;
                } else {
                    canvas2 = canvas;
                    zu0Var.J(canvas2, y10, this.f34148f, this.f34145b, this.d);
                }
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public void onAttachedToWindow() {
        zu0 zu0Var;
        if (SharedConfig.chatBlurEnabled() && (zu0Var = this.f34144a) != null) {
            zu0Var.P.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        zu0 zu0Var = this.f34144a;
        if (zu0Var != null) {
            zu0Var.P.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (!SharedConfig.chatBlurEnabled() || this.f34144a == null) {
            super.setBackgroundColor(i10);
        } else {
            this.f34146c = i10;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        if (SharedConfig.chatBlurEnabled() && f10 != getTranslationY()) {
            invalidate();
        }
        super.setTranslationY(f10);
    }
}
