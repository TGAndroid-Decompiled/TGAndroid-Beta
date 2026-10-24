package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public abstract class ea extends FrameLayout {
    public final nw0 f26007a;
    public Paint f26008b;
    public int f26009c;
    public final boolean d;
    public final boolean e;
    public final Rect f26010f;

    public ea(Context context, nw0 nw0Var) {
        super(context);
        this.f26009c = 0;
        this.d = true;
        this.e = true;
        this.f26010f = new Rect();
        this.f26007a = nw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f26007a != null && this.e && this.f26009c != 0) {
            if (this.f26008b == null) {
                this.f26008b = new Paint();
            }
            this.f26008b.setColor(this.f26009c);
            this.f26010f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                nw0 nw0Var = this.f26007a;
                if (view != nw0Var) {
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
                    nw0Var.I(canvas2, f7, this.f26010f, this.f26008b, this.d);
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
        nw0 nw0Var;
        if (SharedConfig.chatBlurEnabled() && (nw0Var = this.f26007a) != null) {
            nw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        nw0 nw0Var = this.f26007a;
        if (nw0Var != null) {
            nw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f26007a != null) {
            this.f26009c = i10;
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
