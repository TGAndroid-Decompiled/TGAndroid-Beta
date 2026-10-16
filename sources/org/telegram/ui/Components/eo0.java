package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class eo0 extends EditTextBoldCursor {
    public final j5 f24444b;
    public int f24445c;
    public final r6 d;
    public final org.telegram.ui.ActionBar.c6 e;

    public eo0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = c6Var;
        this.f24444b = new j5(this);
        r6 r6Var = new r6(false, true, true);
        this.d = r6Var;
        r6Var.n(0.2f, 160L, es.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.setCallback(this);
        r6Var.f28435b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f24445c < 0) {
            i10 = org.telegram.ui.ActionBar.g6.f19822p7;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.P5;
        }
        int a2 = this.f24444b.a(org.telegram.ui.ActionBar.g6.w0(i10, this.e), false);
        r6 r6Var = this.d;
        r6Var.u(a2);
        r6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        r6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        r6 r6Var = this.d;
        if (r6Var != null) {
            this.f24445c = 12 - charSequence.length();
            r6Var.a();
            String str = "";
            if (this.f24445c <= 4) {
                str = "" + this.f24445c;
            }
            r6Var.t(str, true, true);
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
