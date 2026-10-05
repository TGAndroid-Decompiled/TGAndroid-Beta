package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ia extends LinearLayout {
    public final mw0 f27442a;
    public Paint f27443b;
    public int f27444c;
    public final boolean d;
    public final boolean f27445e;
    public final Rect f27446f;

    public ia(Context context, mw0 mw0Var) {
        super(context);
        this.f27444c = 0;
        this.d = true;
        this.f27445e = true;
        this.f27446f = new Rect();
        this.f27442a = mw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        mw0 mw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f27442a != null && this.f27445e && this.f27444c != 0) {
            if (this.f27443b == null) {
                this.f27443b = new Paint();
            }
            this.f27443b.setColor(this.f27444c);
            this.f27446f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                mw0Var = this.f27442a;
                if (view == mw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            mw0Var.J(canvas2, f7, this.f27446f, this.f27443b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        mw0 mw0Var;
        if (SharedConfig.chatBlurEnabled() && (mw0Var = this.f27442a) != null) {
            mw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        mw0 mw0Var = this.f27442a;
        if (mw0Var != null) {
            mw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f27442a != null) {
            this.f27444c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
