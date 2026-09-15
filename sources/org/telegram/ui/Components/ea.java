package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public abstract class ea extends FrameLayout {
    public final pv0 f23609a;
    public Paint f23610b;
    public int f23611c;
    public final boolean d;
    public final boolean e;
    public final Rect f23612f;

    public ea(Context context, pv0 pv0Var) {
        super(context);
        this.f23611c = 0;
        this.d = true;
        this.e = true;
        this.f23612f = new Rect();
        this.f23609a = pv0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f23609a != null && this.e && this.f23611c != 0) {
            if (this.f23610b == null) {
                this.f23610b = new Paint();
            }
            this.f23610b.setColor(this.f23611c);
            this.f23612f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                pv0 pv0Var = this.f23609a;
                if (view != pv0Var) {
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
                    pv0Var.J(canvas2, f7, this.f23612f, this.f23610b, this.d);
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
        pv0 pv0Var;
        if (SharedConfig.chatBlurEnabled() && (pv0Var = this.f23609a) != null) {
            pv0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        pv0 pv0Var = this.f23609a;
        if (pv0Var != null) {
            pv0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f23609a != null) {
            this.f23611c = i10;
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
