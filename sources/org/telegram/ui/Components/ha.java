package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ha extends LinearLayout {
    public final ov0 f26721a;
    public Paint f26722b;
    public int f26723c;
    public final boolean d;
    public final boolean f26724e;
    public final Rect f26725f;

    public ha(Context context, ov0 ov0Var) {
        super(context);
        this.f26723c = 0;
        this.d = true;
        this.f26724e = true;
        this.f26725f = new Rect();
        this.f26721a = ov0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        ov0 ov0Var;
        if (SharedConfig.chatBlurEnabled() && this.f26721a != null && this.f26724e && this.f26723c != 0) {
            if (this.f26722b == null) {
                this.f26722b = new Paint();
            }
            this.f26722b.setColor(this.f26723c);
            this.f26725f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                ov0Var = this.f26721a;
                if (view == ov0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            ov0Var.J(canvas2, f7, this.f26725f, this.f26722b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        ov0 ov0Var;
        if (SharedConfig.chatBlurEnabled() && (ov0Var = this.f26721a) != null) {
            ov0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        ov0 ov0Var = this.f26721a;
        if (ov0Var != null) {
            ov0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f26721a != null) {
            this.f26723c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
