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
    public final yw0 f27092a;
    public Paint f27093b;
    public int f27094c;
    public final boolean d;
    public final boolean f27095e;
    public final Rect f27096f;

    public ia(Context context, yw0 yw0Var) {
        super(context);
        this.f27094c = 0;
        this.d = true;
        this.f27095e = true;
        this.f27096f = new Rect();
        this.f27092a = yw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f27092a != null && this.f27095e && this.f27094c != 0) {
            if (this.f27093b == null) {
                this.f27093b = new Paint();
            }
            this.f27093b.setColor(this.f27094c);
            this.f27096f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                yw0 yw0Var = this.f27092a;
                if (view != yw0Var) {
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
                    yw0Var.J(canvas2, f7, this.f27096f, this.f27093b, this.d);
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
        yw0 yw0Var;
        if (SharedConfig.chatBlurEnabled() && (yw0Var = this.f27092a) != null) {
            yw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        yw0 yw0Var = this.f27092a;
        if (yw0Var != null) {
            yw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f27092a != null) {
            this.f27094c = i10;
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
