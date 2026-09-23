package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class cn0 extends EditTextBoldCursor {
    public final h5 f23077b;
    public int f23078c;
    public final o6 d;
    public final org.telegram.ui.ActionBar.d6 e;

    public cn0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = d6Var;
        this.f23077b = new h5(this);
        o6 o6Var = new o6(false, true, true, false);
        this.d = o6Var;
        o6Var.k(0.2f, 160L, rr.h);
        o6Var.t(AndroidUtilities.dp(15.33f));
        o6Var.setCallback(this);
        o6Var.f26614b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f23078c < 0) {
            i10 = org.telegram.ui.ActionBar.h6.f19008p7;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.P5;
        }
        int a2 = this.f23077b.a(org.telegram.ui.ActionBar.h6.v0(i10, this.e), false);
        o6 o6Var = this.d;
        o6Var.r(a2);
        o6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        o6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        o6 o6Var = this.d;
        if (o6Var != null) {
            this.f23078c = 12 - charSequence.length();
            o6Var.b();
            String str = "";
            if (this.f23078c <= 4) {
                str = "" + this.f23078c;
            }
            o6Var.q(str, true, true);
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
