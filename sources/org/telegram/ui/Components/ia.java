package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public abstract class ia extends FrameLayout {
    public final uw0 f27227a;
    public Paint f27228b;
    public int f27229c;
    public final boolean d;
    public final boolean f27230e;
    public final Rect f27231f;

    public ia(Context context, uw0 uw0Var) {
        super(context);
        this.f27229c = 0;
        this.d = true;
        this.f27230e = true;
        this.f27231f = new Rect();
        this.f27227a = uw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f27227a != null && this.f27230e && this.f27229c != 0) {
            if (this.f27228b == null) {
                this.f27228b = new Paint();
            }
            this.f27228b.setColor(this.f27229c);
            this.f27231f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                uw0 uw0Var = this.f27227a;
                if (view != uw0Var) {
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
                    uw0Var.J(canvas2, f7, this.f27231f, this.f27228b, this.d);
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
        uw0 uw0Var;
        if (SharedConfig.chatBlurEnabled() && (uw0Var = this.f27227a) != null) {
            uw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        uw0 uw0Var = this.f27227a;
        if (uw0Var != null) {
            uw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f27227a != null) {
            this.f27229c = i10;
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
