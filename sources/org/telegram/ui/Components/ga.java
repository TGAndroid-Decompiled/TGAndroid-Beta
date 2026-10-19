package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public abstract class ga extends FrameLayout {
    public final kw0 f26558a;
    public Paint f26559b;
    public int f26560c;
    public final boolean d;
    public final boolean e;
    public final Rect f26561f;

    public ga(Context context, kw0 kw0Var) {
        super(context);
        this.f26560c = 0;
        this.d = true;
        this.e = true;
        this.f26561f = new Rect();
        this.f26558a = kw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f26558a != null && this.e && this.f26560c != 0) {
            if (this.f26559b == null) {
                this.f26559b = new Paint();
            }
            this.f26559b.setColor(this.f26560c);
            this.f26561f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                kw0 kw0Var = this.f26558a;
                if (view != kw0Var) {
                    f7 += view.getY();
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        super.dispatchDraw(canvas);
                        return;
                    }
                } else {
                    canvas2 = canvas;
                    kw0Var.J(canvas2, f7, this.f26561f, this.f26559b, this.d);
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
        kw0 kw0Var;
        if (SharedConfig.chatBlurEnabled() && (kw0Var = this.f26558a) != null) {
            kw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        kw0 kw0Var = this.f26558a;
        if (kw0Var != null) {
            kw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f26558a != null) {
            this.f26560c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override
    public void setTranslationY(float f7) {
        if (SharedConfig.chatBlurEnabled() && f7 != getTranslationY()) {
            invalidate();
        }
        super.setTranslationY(f7);
    }
}
