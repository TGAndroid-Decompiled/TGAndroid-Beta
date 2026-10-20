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
    public final lw0 f26552a;
    public Paint f26553b;
    public int f26554c;
    public final boolean d;
    public final boolean e;
    public final Rect f26555f;

    public ga(Context context, lw0 lw0Var) {
        super(context);
        this.f26554c = 0;
        this.d = true;
        this.e = true;
        this.f26555f = new Rect();
        this.f26552a = lw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f26552a != null && this.e && this.f26554c != 0) {
            if (this.f26553b == null) {
                this.f26553b = new Paint();
            }
            this.f26553b.setColor(this.f26554c);
            this.f26555f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                lw0 lw0Var = this.f26552a;
                if (view != lw0Var) {
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
                    lw0Var.J(canvas2, f7, this.f26555f, this.f26553b, this.d);
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
        lw0 lw0Var;
        if (SharedConfig.chatBlurEnabled() && (lw0Var = this.f26552a) != null) {
            lw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        lw0 lw0Var = this.f26552a;
        if (lw0Var != null) {
            lw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f26552a != null) {
            this.f26554c = i10;
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
