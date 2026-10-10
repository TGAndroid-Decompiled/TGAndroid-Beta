package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class io0 extends EditTextBoldCursor {
    public final j5 f27417b;
    public int f27418c;
    public final q6 d;
    public final org.telegram.ui.ActionBar.e6 f27419e;

    public io0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f27419e = e6Var;
        this.f27417b = new j5(this);
        q6 q6Var = new q6(false, true, true);
        this.d = q6Var;
        q6Var.n(0.2f, 160L, is.h);
        q6Var.w(AndroidUtilities.dp(15.33f));
        q6Var.setCallback(this);
        q6Var.f30031b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f27418c < 0) {
            i10 = org.telegram.ui.ActionBar.i6.f21022p7;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.P5;
        }
        int a2 = this.f27417b.a(org.telegram.ui.ActionBar.i6.w0(i10, this.f27419e), false);
        q6 q6Var = this.d;
        q6Var.u(a2);
        q6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        q6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        q6 q6Var = this.d;
        if (q6Var != null) {
            this.f27418c = 12 - charSequence.length();
            q6Var.a();
            String str = "";
            if (this.f27418c <= 4) {
                str = "" + this.f27418c;
            }
            q6Var.t(str, true, true);
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
