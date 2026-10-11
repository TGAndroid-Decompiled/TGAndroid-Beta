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
    public final tw0 f27379a;
    public Paint f27380b;
    public int f27381c;
    public final boolean d;
    public final boolean f27382e;
    public final Rect f27383f;

    public ia(Context context, tw0 tw0Var) {
        super(context);
        this.f27381c = 0;
        this.d = true;
        this.f27382e = true;
        this.f27383f = new Rect();
        this.f27379a = tw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f27379a != null && this.f27382e && this.f27381c != 0) {
            if (this.f27380b == null) {
                this.f27380b = new Paint();
            }
            this.f27380b.setColor(this.f27381c);
            this.f27383f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                tw0 tw0Var = this.f27379a;
                if (view != tw0Var) {
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
                    tw0Var.J(canvas2, f7, this.f27383f, this.f27380b, this.d);
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
        tw0 tw0Var;
        if (SharedConfig.chatBlurEnabled() && (tw0Var = this.f27379a) != null) {
            tw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        tw0 tw0Var = this.f27379a;
        if (tw0Var != null) {
            tw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f27379a != null) {
            this.f27381c = i10;
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
