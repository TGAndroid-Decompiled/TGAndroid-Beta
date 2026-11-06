package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class kl0 extends EditTextBoldCursor {
    public final z4 G1;
    public int H1;
    public final i6 I1;
    public final org.telegram.ui.ActionBar.f6 J1;

    public kl0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.J1 = f6Var;
        this.G1 = new z4(this);
        i6 i6Var = new i6(false, true, true);
        this.I1 = i6Var;
        i6Var.n(0.2f, 160L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(15.33f));
        i6Var.setCallback(this);
        i6Var.f34477b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.H1 < 0) {
            i7 = org.telegram.ui.ActionBar.k6.f28069p7;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.P5;
        }
        int a10 = this.G1.a(org.telegram.ui.ActionBar.k6.w0(i7, this.J1), false);
        i6 i6Var = this.I1;
        i6Var.u(a10);
        i6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        i6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        i6 i6Var = this.I1;
        if (i6Var != null) {
            this.H1 = 12 - charSequence.length();
            i6Var.a();
            String str = "";
            if (this.H1 <= 4) {
                str = "" + this.H1;
            }
            i6Var.t(str, true, true);
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
