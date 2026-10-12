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
    public final yw0 f27107a;
    public Paint f27108b;
    public int f27109c;
    public final boolean d;
    public final boolean f27110e;
    public final Rect f27111f;

    public ia(Context context, yw0 yw0Var) {
        super(context);
        this.f27109c = 0;
        this.d = true;
        this.f27110e = true;
        this.f27111f = new Rect();
        this.f27107a = yw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f27107a != null && this.f27110e && this.f27109c != 0) {
            if (this.f27108b == null) {
                this.f27108b = new Paint();
            }
            this.f27108b.setColor(this.f27109c);
            this.f27111f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                yw0 yw0Var = this.f27107a;
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
                    yw0Var.J(canvas2, f7, this.f27111f, this.f27108b, this.d);
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
        if (SharedConfig.chatBlurEnabled() && (yw0Var = this.f27107a) != null) {
            yw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        yw0 yw0Var = this.f27107a;
        if (yw0Var != null) {
            yw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f27107a != null) {
            this.f27109c = i10;
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
