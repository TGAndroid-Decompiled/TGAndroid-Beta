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
    public final lw0 f27084a;
    public Paint f27085b;
    public int f27086c;
    public final boolean d;
    public final boolean f27087e;
    public final Rect f27088f;

    public ha(Context context, lw0 lw0Var) {
        super(context);
        this.f27086c = 0;
        this.d = true;
        this.f27087e = true;
        this.f27088f = new Rect();
        this.f27084a = lw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f27084a != null && this.f27087e && this.f27086c != 0) {
            if (this.f27085b == null) {
                this.f27085b = new Paint();
            }
            this.f27085b.setColor(this.f27086c);
            this.f27088f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                lw0 lw0Var = this.f27084a;
                if (view != lw0Var) {
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
                    lw0Var.J(canvas2, f7, this.f27088f, this.f27085b, this.d);
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
        lw0 lw0Var;
        if (SharedConfig.chatBlurEnabled() && (lw0Var = this.f27084a) != null) {
            lw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        lw0 lw0Var = this.f27084a;
        if (lw0Var != null) {
            lw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f27084a != null) {
            this.f27086c = i10;
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
