package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public abstract class da extends FrameLayout {
    public final hv0 f27723a;
    public Paint f27724b;
    public int f27725c;
    public final boolean d;
    public final boolean f27726e;
    public final Rect f27727f;

    public da(Context context, hv0 hv0Var) {
        super(context);
        this.f27725c = 0;
        this.d = true;
        this.f27726e = true;
        this.f27727f = new Rect();
        this.f27723a = hv0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f27723a != null && this.f27726e && this.f27725c != 0) {
            if (this.f27724b == null) {
                this.f27724b = new Paint();
            }
            this.f27724b.setColor(this.f27725c);
            this.f27727f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f9 = 0.0f;
            View view = this;
            while (true) {
                hv0 hv0Var = this.f27723a;
                if (view != hv0Var) {
                    f9 += view.getY();
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        super.dispatchDraw(canvas);
                        return;
                    }
                } else {
                    canvas2 = canvas;
                    hv0Var.J(canvas2, f9, this.f27727f, this.f27724b, this.d);
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
        hv0 hv0Var;
        if (SharedConfig.chatBlurEnabled() && (hv0Var = this.f27723a) != null) {
            hv0Var.P.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        hv0 hv0Var = this.f27723a;
        if (hv0Var != null) {
            hv0Var.P.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f27723a != null) {
            this.f27725c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override
    public void setTranslationY(float f9) {
        if (SharedConfig.chatBlurEnabled() && f9 != getTranslationY()) {
            invalidate();
        }
        super.setTranslationY(f9);
    }
}
