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
    public final qv0 f23526a;
    public Paint f23527b;
    public int f23528c;
    public final boolean d;
    public final boolean e;
    public final Rect f23529f;

    public ea(Context context, qv0 qv0Var) {
        super(context);
        this.f23528c = 0;
        this.d = true;
        this.e = true;
        this.f23529f = new Rect();
        this.f23526a = qv0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f23526a != null && this.e && this.f23528c != 0) {
            if (this.f23527b == null) {
                this.f23527b = new Paint();
            }
            this.f23527b.setColor(this.f23528c);
            this.f23529f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                qv0 qv0Var = this.f23526a;
                if (view != qv0Var) {
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
                    qv0Var.J(canvas2, f7, this.f23529f, this.f23527b, this.d);
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
        if (SharedConfig.chatBlurEnabled() && (qv0Var = this.f23526a) != null) {
            qv0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        qv0 qv0Var = this.f23526a;
        if (qv0Var != null) {
            qv0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f23526a != null) {
            this.f23528c = i10;
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
