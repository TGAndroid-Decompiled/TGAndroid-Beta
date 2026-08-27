package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class om0 extends EditTextBoldCursor {

    public final b5 f31362b;

    public int f31363c;
    public final i6 d;

    public final org.telegram.ui.ActionBar.c6 f31364e;

    public om0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f31364e = c6Var;
        this.f31362b = new b5(this);
        i6 i6Var = new i6(false, true, true, false);
        this.d = i6Var;
        i6Var.k(0.2f, 160L, er.h);
        i6Var.t(AndroidUtilities.dp(15.33f));
        i6Var.setCallback(this);
        i6Var.f29239b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int iA = this.f31362b.a(org.telegram.ui.ActionBar.g6.v0(this.f31363c < 0 ? org.telegram.ui.ActionBar.g6.f23269p7 : org.telegram.ui.ActionBar.g6.P5, this.f31364e), false);
        i6 i6Var = this.d;
        i6Var.r(iA);
        i6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        i6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i6 i6Var = this.d;
        if (i6Var != null) {
            this.f31363c = 12 - charSequence.length();
            i6Var.b();
            String str = "";
            if (this.f31363c <= 4) {
                str = "" + this.f31363c;
            }
            i6Var.q(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d || super.verifyDrawable(drawable);
    }
}
