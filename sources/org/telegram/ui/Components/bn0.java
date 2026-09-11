package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class bn0 extends EditTextBoldCursor {
    public final h5 f24749b;
    public int f24750c;
    public final p6 d;
    public final org.telegram.ui.ActionBar.f6 f24751e;

    public bn0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f24751e = f6Var;
        this.f24749b = new h5(this);
        p6 p6Var = new p6(false, true, true, false);
        this.d = p6Var;
        p6Var.k(0.2f, 160L, pr.h);
        p6Var.t(AndroidUtilities.dp(15.33f));
        p6Var.setCallback(this);
        p6Var.f29285b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f24750c < 0) {
            i10 = org.telegram.ui.ActionBar.j6.f20880p7;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.P5;
        }
        int a2 = this.f24749b.a(org.telegram.ui.ActionBar.j6.v0(i10, this.f24751e), false);
        p6 p6Var = this.d;
        p6Var.r(a2);
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
            this.f24750c = 12 - charSequence.length();
            p6Var.b();
            String str = "";
            if (this.f24750c <= 4) {
                str = "" + this.f24750c;
            }
            p6Var.q(str, true, true);
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
