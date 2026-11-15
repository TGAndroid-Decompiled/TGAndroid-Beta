package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ol0 extends EditTextBoldCursor {
    public final x4 M1;
    public int N1;
    public final g6 O1;
    public final org.telegram.ui.ActionBar.e6 P1;

    public ol0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.P1 = e6Var;
        this.M1 = new x4(this);
        g6 g6Var = new g6(false, true, true);
        this.O1 = g6Var;
        g6Var.n(0.2f, 160L, er.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.setCallback(this);
        g6Var.f34833b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.N1 < 0) {
            i7 = org.telegram.ui.ActionBar.j6.f29070p7;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.P5;
        }
        int a10 = this.M1.a(org.telegram.ui.ActionBar.j6.w0(i7, this.P1), false);
        g6 g6Var = this.O1;
        g6Var.u(a10);
        g6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        g6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        g6 g6Var = this.O1;
        if (g6Var != null) {
            this.N1 = 12 - charSequence.length();
            g6Var.a();
            String str = "";
            if (this.N1 <= 4) {
                str = "" + this.N1;
            }
            g6Var.t(str, true, true);
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
