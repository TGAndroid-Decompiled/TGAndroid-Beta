package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mm0 extends EditTextBoldCursor {
    public final b5 f30891b;
    public int f30892c;
    public final i6 d;
    public final org.telegram.ui.ActionBar.b6 f30893e;

    public mm0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f30893e = b6Var;
        this.f30891b = new b5(this);
        i6 i6Var = new i6(false, true, true, false);
        this.d = i6Var;
        i6Var.k(0.2f, 160L, gr.h);
        i6Var.t(AndroidUtilities.dp(15.33f));
        i6Var.setCallback(this);
        i6Var.f29333b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        super.dispatchDraw(canvas);
        if (this.f30892c < 0) {
            i9 = org.telegram.ui.ActionBar.f6.f23212p7;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.P5;
        }
        int a2 = this.f30891b.a(org.telegram.ui.ActionBar.f6.v0(i9, this.f30893e), false);
        i6 i6Var = this.d;
        i6Var.r(a2);
        i6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        i6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        i6 i6Var = this.d;
        if (i6Var != null) {
            this.f30892c = 12 - charSequence.length();
            i6Var.b();
            String str = "";
            if (this.f30892c <= 4) {
                str = "" + this.f30892c;
            }
            i6Var.q(str, true, true);
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
