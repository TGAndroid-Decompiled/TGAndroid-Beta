package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class fa extends LinearLayout {
    public final qv0 f23859a;
    public Paint f23860b;
    public int f23861c;
    public final boolean d;
    public final boolean e;
    public final Rect f23862f;

    public fa(Context context, qv0 qv0Var) {
        super(context);
        this.f23861c = 0;
        this.d = true;
        this.e = true;
        this.f23862f = new Rect();
        this.f23859a = qv0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        qv0 qv0Var;
        if (SharedConfig.chatBlurEnabled() && this.f23859a != null && this.e && this.f23861c != 0) {
            if (this.f23860b == null) {
                this.f23860b = new Paint();
            }
            this.f23860b.setColor(this.f23861c);
            this.f23862f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                qv0Var = this.f23859a;
                if (view == qv0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            qv0Var.J(canvas2, f7, this.f23862f, this.f23860b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        qv0 qv0Var;
        if (SharedConfig.chatBlurEnabled() && (qv0Var = this.f23859a) != null) {
            qv0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        qv0 qv0Var = this.f23859a;
        if (qv0Var != null) {
            qv0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f23859a != null) {
            this.f23861c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
