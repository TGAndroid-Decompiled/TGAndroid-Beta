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
    public final bw0 f24347a;
    public Paint f24348b;
    public int f24349c;
    public final boolean d;
    public final boolean e;
    public final Rect f24350f;

    public ga(Context context, bw0 bw0Var) {
        super(context);
        this.f24349c = 0;
        this.d = true;
        this.e = true;
        this.f24350f = new Rect();
        this.f24347a = bw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f24347a != null && this.e && this.f24349c != 0) {
            if (this.f24348b == null) {
                this.f24348b = new Paint();
            }
            this.f24348b.setColor(this.f24349c);
            this.f24350f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                bw0 bw0Var = this.f24347a;
                if (view != bw0Var) {
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
                    bw0Var.J(canvas2, f7, this.f24350f, this.f24348b, this.d);
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
        bw0 bw0Var;
        if (SharedConfig.chatBlurEnabled() && (bw0Var = this.f24347a) != null) {
            bw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        bw0 bw0Var = this.f24347a;
        if (bw0Var != null) {
            bw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f24347a != null) {
            this.f24349c = i10;
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
