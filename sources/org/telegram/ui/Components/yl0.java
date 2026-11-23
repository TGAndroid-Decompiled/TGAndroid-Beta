package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class yl0 extends EditTextBoldCursor {
    public final g5 M1;
    public int N1;
    public final n6 O1;
    public final org.telegram.ui.ActionBar.h6 P1;

    public yl0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.P1 = h6Var;
        this.M1 = new g5(this);
        n6 n6Var = new n6(false, true, true);
        this.O1 = n6Var;
        n6Var.n(0.2f, 160L, nr.h);
        n6Var.w(org.telegram.messenger.g0.L(15.33f));
        n6Var.setCallback(this);
        n6Var.f37796b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.N1 < 0) {
            i7 = org.telegram.ui.ActionBar.m6.f29602p7;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.P5;
        }
        int a10 = this.M1.a(org.telegram.ui.ActionBar.m6.w0(i7, this.P1), false);
        n6 n6Var = this.O1;
        n6Var.u(a10);
        n6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        n6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        n6 n6Var = this.O1;
        if (n6Var != null) {
            this.N1 = 12 - charSequence.length();
            n6Var.a();
            String str = "";
            if (this.N1 <= 4) {
                str = "" + this.N1;
            }
            n6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.O1 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
