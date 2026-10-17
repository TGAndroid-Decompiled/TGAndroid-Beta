package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ha extends LinearLayout {
    public final jw0 f26835a;
    public Paint f26836b;
    public int f26837c;
    public final boolean d;
    public final boolean e;
    public final Rect f26838f;

    public ha(Context context, jw0 jw0Var) {
        super(context);
        this.f26837c = 0;
        this.d = true;
        this.e = true;
        this.f26838f = new Rect();
        this.f26835a = jw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        jw0 jw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f26835a != null && this.e && this.f26837c != 0) {
            if (this.f26836b == null) {
                this.f26836b = new Paint();
            }
            this.f26836b.setColor(this.f26837c);
            this.f26838f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                jw0Var = this.f26835a;
                if (view == jw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            jw0Var.J(canvas2, f7, this.f26838f, this.f26836b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        jw0 jw0Var;
        if (SharedConfig.chatBlurEnabled() && (jw0Var = this.f26835a) != null) {
            jw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        jw0 jw0Var = this.f26835a;
        if (jw0Var != null) {
            jw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f26835a != null) {
            this.f26837c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
