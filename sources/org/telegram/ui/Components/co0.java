package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class co0 extends EditTextBoldCursor {
    public final g5 f25404b;
    public int f25405c;
    public final n6 d;
    public final org.telegram.ui.ActionBar.g6 e;

    public co0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = g6Var;
        this.f25404b = new g5(this);
        n6 n6Var = new n6(false, true, true);
        this.d = n6Var;
        n6Var.n(0.2f, 160L, zr.h);
        n6Var.w(AndroidUtilities.dp(15.33f));
        n6Var.setCallback(this);
        n6Var.f28797b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f25405c < 0) {
            i10 = org.telegram.ui.ActionBar.k6.f21405p7;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.P5;
        }
        int a2 = this.f25404b.a(org.telegram.ui.ActionBar.k6.w0(i10, this.e), false);
        n6 n6Var = this.d;
        n6Var.u(a2);
        n6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        n6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        n6 n6Var = this.d;
        if (n6Var != null) {
            this.f25405c = 12 - charSequence.length();
            n6Var.a();
            String str = "";
            if (this.f25405c <= 4) {
                str = "" + this.f25405c;
            }
            n6Var.t(str, true, true);
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
