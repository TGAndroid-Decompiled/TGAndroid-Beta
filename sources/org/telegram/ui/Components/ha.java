package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ha extends LinearLayout {
    public final cw0 f24752a;
    public Paint f24753b;
    public int f24754c;
    public final boolean d;
    public final boolean e;
    public final Rect f24755f;

    public ha(Context context, cw0 cw0Var) {
        super(context);
        this.f24754c = 0;
        this.d = true;
        this.e = true;
        this.f24755f = new Rect();
        this.f24752a = cw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        cw0 cw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f24752a != null && this.e && this.f24754c != 0) {
            if (this.f24753b == null) {
                this.f24753b = new Paint();
            }
            this.f24753b.setColor(this.f24754c);
            this.f24755f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                cw0Var = this.f24752a;
                if (view == cw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            cw0Var.J(canvas2, f7, this.f24755f, this.f24753b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        cw0 cw0Var;
        if (SharedConfig.chatBlurEnabled() && (cw0Var = this.f24752a) != null) {
            cw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        cw0 cw0Var = this.f24752a;
        if (cw0Var != null) {
            cw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f24752a != null) {
            this.f24754c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
