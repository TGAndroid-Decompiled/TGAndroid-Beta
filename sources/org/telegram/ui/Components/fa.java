package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public abstract class fa extends FrameLayout {
    public final aw0 f22959a;
    public Paint f22960b;
    public int f22961c;
    public final boolean d;
    public final boolean e;
    public final Rect f22962f;

    public fa(Context context, aw0 aw0Var) {
        super(context);
        this.f22961c = 0;
        this.d = true;
        this.e = true;
        this.f22962f = new Rect();
        this.f22959a = aw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f22959a != null && this.e && this.f22961c != 0) {
            if (this.f22960b == null) {
                this.f22960b = new Paint();
            }
            this.f22960b.setColor(this.f22961c);
            this.f22962f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                aw0 aw0Var = this.f22959a;
                if (view != aw0Var) {
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
                    aw0Var.J(canvas2, f7, this.f22962f, this.f22960b, this.d);
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
        aw0 aw0Var;
        if (SharedConfig.chatBlurEnabled() && (aw0Var = this.f22959a) != null) {
            aw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        aw0 aw0Var = this.f22959a;
        if (aw0Var != null) {
            aw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f22959a != null) {
            this.f22961c = i10;
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
