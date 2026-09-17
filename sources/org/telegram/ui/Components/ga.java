package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;
public abstract class ga extends FrameLayout {
    public final ov0 f26328a;
    public Paint f26329b;
    public int f26330c;
    public final boolean d;
    public final boolean f26331e;
    public final Rect f26332f;

    public ga(Context context, ov0 ov0Var) {
        super(context);
        this.f26330c = 0;
        this.d = true;
        this.f26331e = true;
        this.f26332f = new Rect();
        this.f26328a = ov0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f26328a != null && this.f26331e && this.f26330c != 0) {
            if (this.f26329b == null) {
                this.f26329b = new Paint();
            }
            this.f26329b.setColor(this.f26330c);
            this.f26332f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                ov0 ov0Var = this.f26328a;
                if (view != ov0Var) {
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
                    ov0Var.J(canvas2, f7, this.f26332f, this.f26329b, this.d);
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
        ov0 ov0Var;
        if (SharedConfig.chatBlurEnabled() && (ov0Var = this.f26328a) != null) {
            ov0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        ov0 ov0Var = this.f26328a;
        if (ov0Var != null) {
            ov0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f26328a != null) {
            this.f26330c = i10;
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
