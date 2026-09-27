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
    public final cw0 f24518a;
    public Paint f24519b;
    public int f24520c;
    public final boolean d;
    public final boolean e;
    public final Rect f24521f;

    public ga(Context context, cw0 cw0Var) {
        super(context);
        this.f24520c = 0;
        this.d = true;
        this.e = true;
        this.f24521f = new Rect();
        this.f24518a = cw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f24518a != null && this.e && this.f24520c != 0) {
            if (this.f24519b == null) {
                this.f24519b = new Paint();
            }
            this.f24519b.setColor(this.f24520c);
            this.f24521f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                cw0 cw0Var = this.f24518a;
                if (view != cw0Var) {
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
                    cw0Var.J(canvas2, f7, this.f24521f, this.f24519b, this.d);
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
        cw0 cw0Var;
        if (SharedConfig.chatBlurEnabled() && (cw0Var = this.f24518a) != null) {
            cw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        cw0 cw0Var = this.f24518a;
        if (cw0Var != null) {
            cw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f24518a != null) {
            this.f24520c = i10;
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
