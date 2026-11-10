package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class kl0 extends EditTextBoldCursor {
    public final y4 G1;
    public int H1;
    public final h6 I1;
    public final org.telegram.ui.ActionBar.h6 J1;

    public kl0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.J1 = h6Var;
        this.G1 = new y4(this);
        h6 h6Var2 = new h6(false, true, true);
        this.I1 = h6Var2;
        h6Var2.n(0.2f, 160L, wq.h);
        h6Var2.w(org.telegram.messenger.g0.L(15.33f));
        h6Var2.setCallback(this);
        h6Var2.f34187b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.H1 < 0) {
            i7 = org.telegram.ui.ActionBar.m6.f28111p7;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.P5;
        }
        int a10 = this.G1.a(org.telegram.ui.ActionBar.m6.w0(i7, this.J1), false);
        h6 h6Var = this.I1;
        h6Var.u(a10);
        h6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        h6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        h6 h6Var = this.I1;
        if (h6Var != null) {
            this.H1 = 12 - charSequence.length();
            h6Var.a();
            String str = "";
            if (this.H1 <= 4) {
                str = "" + this.H1;
            }
            h6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.I1 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
