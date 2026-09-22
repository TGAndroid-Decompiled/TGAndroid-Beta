package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ga extends LinearLayout {
    public final cw0 f24482a;
    public Paint f24483b;
    public int f24484c;
    public final boolean d;
    public final boolean e;
    public final Rect f24485f;

    public ga(Context context, cw0 cw0Var) {
        super(context);
        this.f24484c = 0;
        this.d = true;
        this.e = true;
        this.f24485f = new Rect();
        this.f24482a = cw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        cw0 cw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f24482a != null && this.e && this.f24484c != 0) {
            if (this.f24483b == null) {
                this.f24483b = new Paint();
            }
            this.f24483b.setColor(this.f24484c);
            this.f24485f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                cw0Var = this.f24482a;
                if (view == cw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            cw0Var.J(canvas2, f7, this.f24485f, this.f24483b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        cw0 cw0Var;
        if (SharedConfig.chatBlurEnabled() && (cw0Var = this.f24482a) != null) {
            cw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        cw0 cw0Var = this.f24482a;
        if (cw0Var != null) {
            cw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f24482a != null) {
            this.f24484c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
