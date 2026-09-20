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
    public final aw0 f24059a;
    public Paint f24060b;
    public int f24061c;
    public final boolean d;
    public final boolean e;
    public final Rect f24062f;

    public fa(Context context, aw0 aw0Var) {
        super(context);
        this.f24061c = 0;
        this.d = true;
        this.e = true;
        this.f24062f = new Rect();
        this.f24059a = aw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f24059a != null && this.e && this.f24061c != 0) {
            if (this.f24060b == null) {
                this.f24060b = new Paint();
            }
            this.f24060b.setColor(this.f24061c);
            this.f24062f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                aw0 aw0Var = this.f24059a;
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
                    aw0Var.J(canvas2, f7, this.f24062f, this.f24060b, this.d);
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
        if (SharedConfig.chatBlurEnabled() && (aw0Var = this.f24059a) != null) {
            aw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        aw0 aw0Var = this.f24059a;
        if (aw0Var != null) {
            aw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f24059a != null) {
            this.f24061c = i10;
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
