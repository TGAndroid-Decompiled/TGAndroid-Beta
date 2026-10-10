package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.SharedConfig;
public final class ka extends LinearLayout {
    public final tw0 f27945a;
    public Paint f27946b;
    public int f27947c;
    public final boolean d;
    public final boolean f27948e;
    public final Rect f27949f;

    public ka(Context context, tw0 tw0Var) {
        super(context);
        this.f27947c = 0;
        this.d = true;
        this.f27948e = true;
        this.f27949f = new Rect();
        this.f27945a = tw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        tw0 tw0Var;
        if (SharedConfig.chatBlurEnabled() && this.f27945a != null && this.f27948e && this.f27947c != 0) {
            if (this.f27946b == null) {
                this.f27946b = new Paint();
            }
            this.f27946b.setColor(this.f27947c);
            this.f27949f.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float f7 = 0.0f;
            View view = this;
            while (true) {
                tw0Var = this.f27945a;
                if (view == tw0Var) {
                    break;
                }
                f7 += view.getY();
                view = (View) view.getParent();
            }
            canvas2 = canvas;
            tw0Var.J(canvas2, f7, this.f27949f, this.f27946b, this.d);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        tw0 tw0Var;
        if (SharedConfig.chatBlurEnabled() && (tw0Var = this.f27945a) != null) {
            tw0Var.T.add(this);
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        tw0 tw0Var = this.f27945a;
        if (tw0Var != null) {
            tw0Var.T.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (SharedConfig.chatBlurEnabled() && this.f27945a != null) {
            this.f27947c = i10;
        } else {
            super.setBackgroundColor(i10);
        }
    }
}
