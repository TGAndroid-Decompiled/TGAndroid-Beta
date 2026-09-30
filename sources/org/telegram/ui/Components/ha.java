package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public abstract class ha extends FrameLayout {
    public final dw0 f24795a;
    public Paint f24796b;
    public int f24797c;
    public final boolean d;
    public final boolean e;
    public final Rect f24798f;

    public ha(Context context, dw0 dw0Var) {
        super(context);
        this.f24797c = 0;
        this.d = true;
        this.e = true;
        this.f24798f = new Rect();
        this.f24795a = dw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f24795a != null && this.e && this.f24797c != 0) {
            if (this.f24796b == null) {
                this.f24796b = new Paint();
            }
            this.f24796b.setColor(this.f24797c);
            this.f24798f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                dw0 dw0Var = this.f24795a;
                if (view != dw0Var) {
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
                    dw0Var.J(canvas2, f7, this.f24798f, this.f24796b, this.d);
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
        dw0 dw0Var;
        if (SharedConfig.chatBlurEnabled() && (dw0Var = this.f24795a) != null) {
            dw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        dw0 dw0Var = this.f24795a;
        if (dw0Var != null) {
            dw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f24795a != null) {
            this.f24797c = i10;
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
