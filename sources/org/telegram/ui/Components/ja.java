package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ja extends LinearLayout {
    public final yw0 f27423a;
    public Paint f27424b;
    public int f27425c;
    public final boolean d;
    public final boolean f27426e;
    public final Rect f27427f;

    public ja(Context context, yw0 yw0Var) {
        super(context);
        this.f27425c = 0;
        this.d = true;
        this.f27426e = true;
        this.f27427f = new Rect();
        this.f27423a = yw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        yw0 yw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f27423a != null && this.f27426e && this.f27425c != 0) {
            if (this.f27424b == null) {
                this.f27424b = new Paint();
            }
            this.f27424b.setColor(this.f27425c);
            this.f27427f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                yw0Var = this.f27423a;
                if (view == yw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            yw0Var.J(canvas2, f7, this.f27427f, this.f27424b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        yw0 yw0Var;
        if (SharedConfig.chatBlurEnabled() && (yw0Var = this.f27423a) != null) {
            yw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        yw0 yw0Var = this.f27423a;
        if (yw0Var != null) {
            yw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f27423a != null) {
            this.f27425c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
