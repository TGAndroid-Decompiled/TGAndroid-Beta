package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ha extends LinearLayout {
    public final lw0 f26839a;
    public Paint f26840b;
    public int f26841c;
    public final boolean d;
    public final boolean e;
    public final Rect f26842f;

    public ha(Context context, lw0 lw0Var) {
        super(context);
        this.f26841c = 0;
        this.d = true;
        this.e = true;
        this.f26842f = new Rect();
        this.f26839a = lw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        lw0 lw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f26839a != null && this.e && this.f26841c != 0) {
            if (this.f26840b == null) {
                this.f26840b = new Paint();
            }
            this.f26840b.setColor(this.f26841c);
            this.f26842f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                lw0Var = this.f26839a;
                if (view == lw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            lw0Var.J(canvas2, f7, this.f26842f, this.f26840b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        lw0 lw0Var;
        if (SharedConfig.chatBlurEnabled() && (lw0Var = this.f26839a) != null) {
            lw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        lw0 lw0Var = this.f26839a;
        if (lw0Var != null) {
            lw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f26839a != null) {
            this.f26841c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
