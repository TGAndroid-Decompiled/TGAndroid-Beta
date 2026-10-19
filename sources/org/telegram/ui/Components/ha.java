package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ha extends LinearLayout {
    public final kw0 f26828a;
    public Paint f26829b;
    public int f26830c;
    public final boolean d;
    public final boolean e;
    public final Rect f26831f;

    public ha(Context context, kw0 kw0Var) {
        super(context);
        this.f26830c = 0;
        this.d = true;
        this.e = true;
        this.f26831f = new Rect();
        this.f26828a = kw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        kw0 kw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f26828a != null && this.e && this.f26830c != 0) {
            if (this.f26829b == null) {
                this.f26829b = new Paint();
            }
            this.f26829b.setColor(this.f26830c);
            this.f26831f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                kw0Var = this.f26828a;
                if (view == kw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            kw0Var.J(canvas2, f7, this.f26831f, this.f26829b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        kw0 kw0Var;
        if (SharedConfig.chatBlurEnabled() && (kw0Var = this.f26828a) != null) {
            kw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        kw0 kw0Var = this.f26828a;
        if (kw0Var != null) {
            kw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f26828a != null) {
            this.f26830c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
