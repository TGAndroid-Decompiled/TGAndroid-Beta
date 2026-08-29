package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ym0 extends EditTextBoldCursor {
    public final f5 f35103b;
    public int f35104c;
    public final n6 d;
    public final org.telegram.ui.ActionBar.c6 f35105e;

    public ym0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f35105e = c6Var;
        this.f35103b = new f5(this);
        n6 n6Var = new n6(false, true, true, false);
        this.d = n6Var;
        n6Var.k(0.2f, 160L, jr.h);
        n6Var.t(AndroidUtilities.dp(15.33f));
        n6Var.setCallback(this);
        n6Var.f30862b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f35104c < 0) {
            i10 = org.telegram.ui.ActionBar.g6.f23279p7;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.P5;
        }
        int a2 = this.f35103b.a(org.telegram.ui.ActionBar.g6.v0(i10, this.f35105e), false);
        n6 n6Var = this.d;
        n6Var.r(a2);
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
            this.f35104c = 12 - charSequence.length();
            n6Var.b();
            String str = "";
            if (this.f35104c <= 4) {
                str = "" + this.f35104c;
            }
            n6Var.q(str, true, true);
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
