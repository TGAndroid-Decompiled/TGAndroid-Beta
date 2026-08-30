package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class in0 extends EditTextBoldCursor {
    public final c5 f25758b;
    public int f25759c;
    public final j6 d;
    public final org.telegram.ui.ActionBar.f6 e;

    public in0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = f6Var;
        this.f25758b = new c5(this);
        j6 j6Var = new j6(false, true, true, false);
        this.d = j6Var;
        j6Var.k(0.2f, 160L, nr.h);
        j6Var.t(AndroidUtilities.dp(15.33f));
        j6Var.setCallback(this);
        j6Var.f25884b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f25759c < 0) {
            i10 = org.telegram.ui.ActionBar.j6.f20122p7;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.P5;
        }
        int a2 = this.f25758b.a(org.telegram.ui.ActionBar.j6.v0(i10, this.e), false);
        j6 j6Var = this.d;
        j6Var.r(a2);
        j6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        j6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        j6 j6Var = this.d;
        if (j6Var != null) {
            this.f25759c = 12 - charSequence.length();
            j6Var.b();
            String str = "";
            if (this.f25759c <= 4) {
                str = "" + this.f25759c;
            }
            j6Var.q(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
