package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ha extends LinearLayout {
    public final ov0 f26695a;
    public Paint f26696b;
    public int f26697c;
    public final boolean d;
    public final boolean f26698e;
    public final Rect f26699f;

    public ha(Context context, ov0 ov0Var) {
        super(context);
        this.f26697c = 0;
        this.d = true;
        this.f26698e = true;
        this.f26699f = new Rect();
        this.f26695a = ov0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        ov0 ov0Var;
        if (SharedConfig.chatBlurEnabled() && this.f26695a != null && this.f26698e && this.f26697c != 0) {
            if (this.f26696b == null) {
                this.f26696b = new Paint();
            }
            this.f26696b.setColor(this.f26697c);
            this.f26699f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                ov0Var = this.f26695a;
                if (view == ov0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            ov0Var.J(canvas2, f7, this.f26699f, this.f26696b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        ov0 ov0Var;
        if (SharedConfig.chatBlurEnabled() && (ov0Var = this.f26695a) != null) {
            ov0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        ov0 ov0Var = this.f26695a;
        if (ov0Var != null) {
            ov0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f26695a != null) {
            this.f26697c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
