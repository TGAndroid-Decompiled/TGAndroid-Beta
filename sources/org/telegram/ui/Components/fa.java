package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class fa extends LinearLayout {
    public final nw0 f26264a;
    public Paint f26265b;
    public int f26266c;
    public final boolean d;
    public final boolean e;
    public final Rect f26267f;

    public fa(Context context, nw0 nw0Var) {
        super(context);
        this.f26266c = 0;
        this.d = true;
        this.e = true;
        this.f26267f = new Rect();
        this.f26264a = nw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        nw0 nw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f26264a != null && this.e && this.f26266c != 0) {
            if (this.f26265b == null) {
                this.f26265b = new Paint();
            }
            this.f26265b.setColor(this.f26266c);
            this.f26267f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                nw0Var = this.f26264a;
                if (view == nw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            nw0Var.I(canvas2, f7, this.f26267f, this.f26265b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        nw0 nw0Var;
        if (SharedConfig.chatBlurEnabled() && (nw0Var = this.f26264a) != null) {
            nw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        nw0 nw0Var = this.f26264a;
        if (nw0Var != null) {
            nw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f26264a != null) {
            this.f26266c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
