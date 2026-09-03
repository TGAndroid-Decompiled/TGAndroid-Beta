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
    public final pv0 f33438a;
    public Paint f33439b;
    public int f33440c;
    public final boolean d;
    public final boolean f33441e;
    public final Rect f33442f;

    public y9(Context context, pv0 pv0Var) {
        super(context);
        this.f33440c = 0;
        this.d = true;
        this.f33441e = true;
        this.f33442f = new Rect();
        this.f33438a = pv0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f33438a != null && this.f33441e && this.f33440c != 0) {
            if (this.f33439b == null) {
                this.f33439b = new Paint();
            }
            this.f33439b.setColor(this.f33440c);
            this.f33442f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f10 = 0.0f;
            View view = this;
            while (true) {
                pv0 pv0Var = this.f33438a;
                if (view != pv0Var) {
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
                    pv0Var.J(canvas2, f10, this.f33442f, this.f33439b, this.d);
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
        if (SharedConfig.chatBlurEnabled() && (pv0Var = this.f33438a) != null) {
            pv0Var.Q.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        pv0 pv0Var = this.f33438a;
        if (pv0Var != null) {
            pv0Var.Q.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f33438a != null) {
            this.f33440c = i10;
        } else {
            super.setBackgroundColor(i10);
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
