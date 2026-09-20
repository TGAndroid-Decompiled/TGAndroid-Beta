package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class on0 extends EditTextBoldCursor {
    public final g5 f27003b;
    public int f27004c;
    public final n6 d;
    public final org.telegram.ui.ActionBar.f6 e;

    public on0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = f6Var;
        this.f27003b = new g5(this);
        n6 n6Var = new n6(false, true, true, false);
        this.d = n6Var;
        n6Var.k(0.2f, 160L, qr.h);
        n6Var.t(AndroidUtilities.dp(15.33f));
        n6Var.setCallback(this);
        n6Var.f26575b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f27004c < 0) {
            i10 = org.telegram.ui.ActionBar.j6.f19315p7;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.P5;
        }
        int a2 = this.f27003b.a(org.telegram.ui.ActionBar.j6.v0(i10, this.e), false);
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
            this.f27004c = 12 - charSequence.length();
            n6Var.b();
            String str = "";
            if (this.f27004c <= 4) {
                str = "" + this.f27004c;
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
