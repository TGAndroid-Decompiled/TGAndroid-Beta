package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ja extends LinearLayout {
    public final yw0 f27417a;
    public Paint f27418b;
    public int f27419c;
    public final boolean d;
    public final boolean f27420e;
    public final Rect f27421f;

    public ja(Context context, yw0 yw0Var) {
        super(context);
        this.f27419c = 0;
        this.d = true;
        this.f27420e = true;
        this.f27421f = new Rect();
        this.f27417a = yw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        yw0 yw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f27417a != null && this.f27420e && this.f27419c != 0) {
            if (this.f27418b == null) {
                this.f27418b = new Paint();
            }
            this.f27418b.setColor(this.f27419c);
            this.f27421f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                yw0Var = this.f27417a;
                if (view == yw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            yw0Var.J(canvas2, f7, this.f27421f, this.f27418b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        yw0 yw0Var;
        if (SharedConfig.chatBlurEnabled() && (yw0Var = this.f27417a) != null) {
            yw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        yw0 yw0Var = this.f27417a;
        if (yw0Var != null) {
            yw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f27417a != null) {
            this.f27419c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
