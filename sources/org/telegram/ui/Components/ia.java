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
    public final ow0 f25612a;
    public Paint f25613b;
    public int f25614c;
    public final boolean d;
    public final boolean e;
    public final Rect f25615f;

    public ia(Context context, ow0 ow0Var) {
        super(context);
        this.f25614c = 0;
        this.d = true;
        this.e = true;
        this.f25615f = new Rect();
        this.f25612a = ow0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f25612a != null && this.e && this.f25614c != 0) {
            if (this.f25613b == null) {
                this.f25613b = new Paint();
            }
            this.f25613b.setColor(this.f25614c);
            this.f25615f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                ow0 ow0Var = this.f25612a;
                if (view != ow0Var) {
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
                    ow0Var.J(canvas2, f7, this.f25615f, this.f25613b, this.d);
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
        ow0 ow0Var;
        if (SharedConfig.chatBlurEnabled() && (ow0Var = this.f25612a) != null) {
            ow0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        ow0 ow0Var = this.f25612a;
        if (ow0Var != null) {
            ow0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f25612a != null) {
            this.f25614c = i10;
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
