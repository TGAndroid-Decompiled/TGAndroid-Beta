package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ka extends LinearLayout {
    public final sw0 f27912a;
    public Paint f27913b;
    public int f27914c;
    public final boolean d;
    public final boolean f27915e;
    public final Rect f27916f;

    public ka(Context context, sw0 sw0Var) {
        super(context);
        this.f27914c = 0;
        this.d = true;
        this.f27915e = true;
        this.f27916f = new Rect();
        this.f27912a = sw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        sw0 sw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f27912a != null && this.f27915e && this.f27914c != 0) {
            if (this.f27913b == null) {
                this.f27913b = new Paint();
            }
            this.f27913b.setColor(this.f27914c);
            this.f27916f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                sw0Var = this.f27912a;
                if (view == sw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            sw0Var.J(canvas2, f7, this.f27916f, this.f27913b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        sw0 sw0Var;
        if (SharedConfig.chatBlurEnabled() && (sw0Var = this.f27912a) != null) {
            sw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        sw0 sw0Var = this.f27912a;
        if (sw0Var != null) {
            sw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f27912a != null) {
            this.f27914c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
