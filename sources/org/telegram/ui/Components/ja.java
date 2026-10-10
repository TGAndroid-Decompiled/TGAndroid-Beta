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
    public final tw0 f27626a;
    public Paint f27627b;
    public int f27628c;
    public final boolean d;
    public final boolean f27629e;
    public final Rect f27630f;

    public ja(Context context, tw0 tw0Var) {
        super(context);
        this.f27628c = 0;
        this.d = true;
        this.f27629e = true;
        this.f27630f = new Rect();
        this.f27626a = tw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f27626a != null && this.f27629e && this.f27628c != 0) {
            if (this.f27627b == null) {
                this.f27627b = new Paint();
            }
            this.f27627b.setColor(this.f27628c);
            this.f27630f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                tw0 tw0Var = this.f27626a;
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
                    tw0Var.J(canvas2, f7, this.f27630f, this.f27627b, this.d);
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
        if (SharedConfig.chatBlurEnabled() && (tw0Var = this.f27626a) != null) {
            tw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        tw0 tw0Var = this.f27626a;
        if (tw0Var != null) {
            tw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f27626a != null) {
            this.f27628c = i10;
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
