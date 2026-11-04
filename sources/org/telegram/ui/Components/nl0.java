package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class nl0 extends EditTextBoldCursor {
    public final x4 H1;
    public int I1;
    public final g6 J1;
    public final org.telegram.ui.ActionBar.e6 K1;

    public nl0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.K1 = e6Var;
        this.H1 = new x4(this);
        g6 g6Var = new g6(false, true, true);
        this.J1 = g6Var;
        g6Var.n(0.2f, 160L, xq.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.setCallback(this);
        g6Var.f33983b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i3;
        super.dispatchDraw(canvas);
        if (this.I1 < 0) {
            i3 = org.telegram.ui.ActionBar.k6.f28102p7;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.P5;
        }
        int a10 = this.H1.a(org.telegram.ui.ActionBar.k6.w0(i3, this.K1), false);
        g6 g6Var = this.J1;
        g6Var.u(a10);
        g6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        g6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        super.onTextChanged(charSequence, i3, i10, i11);
        g6 g6Var = this.J1;
        if (g6Var != null) {
            this.I1 = 12 - charSequence.length();
            g6Var.a();
            String str = "";
            if (this.I1 <= 4) {
                str = "" + this.I1;
            }
            g6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.J1 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
