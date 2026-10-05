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
    public final mw0 f27176a;
    public Paint f27177b;
    public int f27178c;
    public final boolean d;
    public final boolean f27179e;
    public final Rect f27180f;

    public ha(Context context, mw0 mw0Var) {
        super(context);
        this.f27178c = 0;
        this.d = true;
        this.f27179e = true;
        this.f27180f = new Rect();
        this.f27176a = mw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (SharedConfig.chatBlurEnabled() && this.f27176a != null && this.f27179e && this.f27178c != 0) {
            if (this.f27177b == null) {
                this.f27177b = new Paint();
            }
            this.f27177b.setColor(this.f27178c);
            this.f27180f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                mw0 mw0Var = this.f27176a;
                if (view != mw0Var) {
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
                    mw0Var.J(canvas2, f7, this.f27180f, this.f27177b, this.d);
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
        mw0 mw0Var;
        if (SharedConfig.chatBlurEnabled() && (mw0Var = this.f27176a) != null) {
            mw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        mw0 mw0Var = this.f27176a;
        if (mw0Var != null) {
            mw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f27176a != null) {
            this.f27178c = i10;
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
