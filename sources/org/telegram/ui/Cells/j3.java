package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.mt;
public final class j3 extends mt {
    public final int f30871e2;
    public final org.telegram.ui.ActionBar.i6 f30872f2;
    public final boolean f30873g2;
    public final l3 f30874h2;

    public j3(l3 l3Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7, org.telegram.ui.ActionBar.i6 i6Var2, boolean z10) {
        super(context, i6Var);
        this.f30874h2 = l3Var;
        this.f30871e2 = i7;
        this.f30872f2 = i6Var2;
        this.f30873g2 = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        l3 l3Var = this.f30874h2;
        org.telegram.ui.Components.m6 m6Var = l3Var.f30979y;
        org.telegram.ui.Components.f5 f5Var = l3Var.f30977w;
        if (l3Var.f30978x <= 0) {
            i7 = org.telegram.ui.ActionBar.n6.f29615p7;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.P5;
        }
        m6Var.u(f5Var.a(org.telegram.ui.ActionBar.n6.w0(i7, this.f30872f2), false));
        int min = Math.min(org.telegram.messenger.g0.L(52.0f), getHeight());
        l3Var.f30979y.setBounds(getScrollX(), getHeight() - min, org.telegram.messenger.g0.L(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        l3Var.f30979y.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (!this.f30873g2 || menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.M0(2131753669, null));
        spannableStringBuilder.setSpan(new i41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(gd.M0(2131748895, null));
        spannableStringBuilder2.setSpan(new i41(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 7, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(gd.M0(2131744202, null));
        ?? obj = new Object();
        obj.f34537a |= 8;
        spannableStringBuilder3.setSpan(new ez0(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296496, 2131296509, 8, spannableStringBuilder3);
        menu.add(2131296496, 2131296503, 9, gd.M0(2131746142, null));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        l3 l3Var = this.f30874h2;
        org.telegram.ui.Components.m6 m6Var = l3Var.f30979y;
        if (m6Var != null && this.f30871e2 > 0) {
            m6Var.a();
            l3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f30874h2.f30979y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
