package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ha extends LinearLayout {
    public final bw0 f24619a;
    public Paint f24620b;
    public int f24621c;
    public final boolean d;
    public final boolean e;
    public final Rect f24622f;

    public ha(Context context, bw0 bw0Var) {
        super(context);
        this.f24621c = 0;
        this.d = true;
        this.e = true;
        this.f24622f = new Rect();
        this.f24619a = bw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        bw0 bw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f24619a != null && this.e && this.f24621c != 0) {
            if (this.f24620b == null) {
                this.f24620b = new Paint();
            }
            this.f24620b.setColor(this.f24621c);
            this.f24622f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                bw0Var = this.f24619a;
                if (view == bw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            bw0Var.J(canvas2, f7, this.f24622f, this.f24620b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        bw0 bw0Var;
        if (SharedConfig.chatBlurEnabled() && (bw0Var = this.f24619a) != null) {
            bw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        bw0 bw0Var = this.f24619a;
        if (bw0Var != null) {
            bw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f24619a != null) {
            this.f24621c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
