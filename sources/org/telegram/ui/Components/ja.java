package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public abstract class ja extends FrameLayout {
    public final sw0 f27664a;
    public Paint f27665b;
    public int f27666c;
    public final boolean d;
    public final boolean f27667e;
    public final Rect f27668f;

    public ja(Context context, sw0 sw0Var) {
        super(context);
        this.f27666c = 0;
        this.d = true;
        this.f27667e = true;
        this.f27668f = new Rect();
        this.f27664a = sw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f27664a != null && this.f27667e && this.f27666c != 0) {
            if (this.f27665b == null) {
                this.f27665b = new Paint();
            }
            this.f27665b.setColor(this.f27666c);
            this.f27668f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                sw0 sw0Var = this.f27664a;
                if (view != sw0Var) {
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
                    sw0Var.J(canvas2, f7, this.f27668f, this.f27665b, this.d);
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
        sw0 sw0Var;
        if (SharedConfig.chatBlurEnabled() && (sw0Var = this.f27664a) != null) {
            sw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        sw0 sw0Var = this.f27664a;
        if (sw0Var != null) {
            sw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f27664a != null) {
            this.f27666c = i10;
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
