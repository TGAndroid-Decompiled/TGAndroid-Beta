package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ha extends LinearLayout {
    public final aw0 f24704a;
    public Paint f24705b;
    public int f24706c;
    public final boolean d;
    public final boolean e;
    public final Rect f24707f;

    public ha(Context context, aw0 aw0Var) {
        super(context);
        this.f24706c = 0;
        this.d = true;
        this.e = true;
        this.f24707f = new Rect();
        this.f24704a = aw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        aw0 aw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f24704a != null && this.e && this.f24706c != 0) {
            if (this.f24705b == null) {
                this.f24705b = new Paint();
            }
            this.f24705b.setColor(this.f24706c);
            this.f24707f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                aw0Var = this.f24704a;
                if (view == aw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            aw0Var.J(canvas2, f7, this.f24707f, this.f24705b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        aw0 aw0Var;
        if (SharedConfig.chatBlurEnabled() && (aw0Var = this.f24704a) != null) {
            aw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        aw0 aw0Var = this.f24704a;
        if (aw0Var != null) {
            aw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f24704a != null) {
            this.f24706c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
