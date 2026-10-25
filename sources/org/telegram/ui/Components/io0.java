package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class io0 extends EditTextBoldCursor {
    public final j5 f29324b;
    public int f29325c;
    public final r6 d;
    public final org.telegram.ui.ActionBar.u6 e;

    public io0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.e = u6Var;
        this.f29324b = new j5(this);
        r6 r6Var = new r6(false, true, true);
        this.d = r6Var;
        r6Var.n(0.2f, 160L, ds.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.setCallback(this);
        r6Var.f32119b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f29325c < 0) {
            i10 = org.telegram.ui.ActionBar.y6.f23579p7;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.P5;
        }
        int a2 = this.f29324b.a(org.telegram.ui.ActionBar.y6.w0(i10, this.e), false);
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
            this.f29325c = 12 - charSequence.length();
            r6Var.a();
            String str = "";
            if (this.f29325c <= 4) {
                str = "" + this.f29325c;
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
