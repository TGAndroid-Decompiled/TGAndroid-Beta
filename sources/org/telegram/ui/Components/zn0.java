package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zn0 extends EditTextBoldCursor {
    public final i5 f32995b;
    public int f32996c;
    public final p6 d;
    public final org.telegram.ui.ActionBar.d6 e;

    public zn0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = d6Var;
        this.f32995b = new i5(this);
        p6 p6Var = new p6(false, true, true);
        this.d = p6Var;
        p6Var.n(0.2f, 160L, bs.h);
        p6Var.w(AndroidUtilities.dp(15.33f));
        p6Var.setCallback(this);
        p6Var.f29182b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f32996c < 0) {
            i10 = org.telegram.ui.ActionBar.h6.f21210p7;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.P5;
        }
        int a2 = this.f32995b.a(org.telegram.ui.ActionBar.h6.w0(i10, this.e), false);
        p6 p6Var = this.d;
        p6Var.u(a2);
        p6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        p6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        p6 p6Var = this.d;
        if (p6Var != null) {
            this.f32996c = 12 - charSequence.length();
            p6Var.a();
            String str = "";
            if (this.f32996c <= 4) {
                str = "" + this.f32996c;
            }
            p6Var.t(str, true, true);
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
