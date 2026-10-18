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
    public final jw0 f26536a;
    public Paint f26537b;
    public int f26538c;
    public final boolean d;
    public final boolean e;
    public final Rect f26539f;

    public ga(Context context, jw0 jw0Var) {
        super(context);
        this.f26538c = 0;
        this.d = true;
        this.e = true;
        this.f26539f = new Rect();
        this.f26536a = jw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f26536a != null && this.e && this.f26538c != 0) {
            if (this.f26537b == null) {
                this.f26537b = new Paint();
            }
            this.f26537b.setColor(this.f26538c);
            this.f26539f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                jw0 jw0Var = this.f26536a;
                if (view != jw0Var) {
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
                    jw0Var.J(canvas2, f7, this.f26539f, this.f26537b, this.d);
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
        jw0 jw0Var;
        if (SharedConfig.chatBlurEnabled() && (jw0Var = this.f26536a) != null) {
            jw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        jw0 jw0Var = this.f26536a;
        if (jw0Var != null) {
            jw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f26536a != null) {
            this.f26538c = i10;
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
