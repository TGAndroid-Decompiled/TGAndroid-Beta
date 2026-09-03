package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class z9 extends LinearLayout {
    public final pv0 f33874a;
    public Paint f33875b;
    public int f33876c;
    public final boolean d;
    public final boolean f33877e;
    public final Rect f33878f;

    public z9(Context context, pv0 pv0Var) {
        super(context);
        this.f33876c = 0;
        this.d = true;
        this.f33877e = true;
        this.f33878f = new Rect();
        this.f33874a = pv0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        pv0 pv0Var;
        if (SharedConfig.chatBlurEnabled() && this.f33874a != null && this.f33877e && this.f33876c != 0) {
            if (this.f33875b == null) {
                this.f33875b = new Paint();
            }
            this.f33875b.setColor(this.f33876c);
            this.f33878f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f10 = 0.0f;
            View view = this;
            while (true) {
                pv0Var = this.f33874a;
                if (view == pv0Var) {
                    break;
                }
                f10 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            pv0Var.J(canvas2, f10, this.f33878f, this.f33875b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        pv0 pv0Var;
        if (SharedConfig.chatBlurEnabled() && (pv0Var = this.f33874a) != null) {
            pv0Var.Q.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        pv0 pv0Var = this.f33874a;
        if (pv0Var != null) {
            pv0Var.Q.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f33874a != null) {
            this.f33876c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
