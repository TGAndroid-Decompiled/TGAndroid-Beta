package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class in0 extends EditTextBoldCursor {
    public final c5 f27869b;
    public int f27870c;
    public final j6 d;
    public final org.telegram.ui.ActionBar.g6 f27871e;

    public in0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f27871e = g6Var;
        this.f27869b = new c5(this);
        j6 j6Var = new j6(false, true, true, false);
        this.d = j6Var;
        j6Var.k(0.2f, 160L, pr.h);
        j6Var.t(AndroidUtilities.dp(15.33f));
        j6Var.setCallback(this);
        j6Var.f27999b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f27870c < 0) {
            i10 = org.telegram.ui.ActionBar.k6.f21878p7;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.P5;
        }
        int a2 = this.f27869b.a(org.telegram.ui.ActionBar.k6.v0(i10, this.f27871e), false);
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
            this.f27870c = 12 - charSequence.length();
            j6Var.b();
            String str = "";
            if (this.f27870c <= 4) {
                str = "" + this.f27870c;
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
