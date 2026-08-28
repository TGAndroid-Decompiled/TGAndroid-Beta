package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public abstract class y9 extends FrameLayout {
    public final xu0 f34897a;
    public Paint f34898b;
    public int f34899c;
    public final boolean d;
    public final boolean f34900e;
    public final Rect f34901f;

    public y9(Context context, xu0 xu0Var) {
        super(context);
        this.f34899c = 0;
        this.d = true;
        this.f34900e = true;
        this.f34901f = new Rect();
        this.f34897a = xu0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f34897a != null && this.f34900e && this.f34899c != 0) {
            if (this.f34898b == null) {
                this.f34898b = new Paint();
            }
            this.f34898b.setColor(this.f34899c);
            this.f34901f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f10 = 0.0f;
            View view = this;
            while (true) {
                xu0 xu0Var = this.f34897a;
                if (view != xu0Var) {
                    f10 += view.getY();
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        super.dispatchDraw(canvas);
                        return;
                    }
                } else {
                    canvas2 = canvas;
                    xu0Var.J(canvas2, f10, this.f34901f, this.f34898b, this.d);
                    break;
                }
            }
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public void onAttachedToWindow() {
        xu0 xu0Var;
        if (SharedConfig.chatBlurEnabled() && (xu0Var = this.f34897a) != null) {
            xu0Var.P.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        xu0 xu0Var = this.f34897a;
        if (xu0Var != null) {
            xu0Var.P.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i9) {
        if (SharedConfig.chatBlurEnabled() && this.f34897a != null) {
            this.f34899c = i9;
        } else {
            super.setBackgroundColor(i9);
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
