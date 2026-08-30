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
    public final qv0 f30948a;
    public Paint f30949b;
    public int f30950c;
    public final boolean d;
    public final boolean e;
    public final Rect f30951f;

    public y9(Context context, qv0 qv0Var) {
        super(context);
        this.f30950c = 0;
        this.d = true;
        this.e = true;
        this.f30951f = new Rect();
        this.f30948a = qv0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f30948a != null && this.e && this.f30950c != 0) {
            if (this.f30949b == null) {
                this.f30949b = new Paint();
            }
            this.f30949b.setColor(this.f30950c);
            this.f30951f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f10 = 0.0f;
            View view = this;
            while (true) {
                qv0 qv0Var = this.f30948a;
                if (view != qv0Var) {
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
                    qv0Var.J(canvas2, f10, this.f30951f, this.f30949b, this.d);
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
        qv0 qv0Var;
        if (SharedConfig.chatBlurEnabled() && (qv0Var = this.f30948a) != null) {
            qv0Var.Q.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        qv0 qv0Var = this.f30948a;
        if (qv0Var != null) {
            qv0Var.Q.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f30948a != null) {
            this.f30950c = i10;
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
