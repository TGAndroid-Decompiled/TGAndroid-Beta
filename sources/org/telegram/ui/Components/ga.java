package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ga extends LinearLayout {
    public final aw0 f23313a;
    public Paint f23314b;
    public int f23315c;
    public final boolean d;
    public final boolean e;
    public final Rect f23316f;

    public ga(Context context, aw0 aw0Var) {
        super(context);
        this.f23315c = 0;
        this.d = true;
        this.e = true;
        this.f23316f = new Rect();
        this.f23313a = aw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        aw0 aw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f23313a != null && this.e && this.f23315c != 0) {
            if (this.f23314b == null) {
                this.f23314b = new Paint();
            }
            this.f23314b.setColor(this.f23315c);
            this.f23316f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                aw0Var = this.f23313a;
                if (view == aw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            aw0Var.J(canvas2, f7, this.f23316f, this.f23314b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        aw0 aw0Var;
        if (SharedConfig.chatBlurEnabled() && (aw0Var = this.f23313a) != null) {
            aw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        aw0 aw0Var = this.f23313a;
        if (aw0Var != null) {
            aw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f23313a != null) {
            this.f23315c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
