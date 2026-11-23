package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.mt;
public final class j3 extends mt {
    public final int f30957e2;
    public final org.telegram.ui.ActionBar.i6 f30958f2;
    public final boolean f30959g2;
    public final l3 f30960h2;

    public j3(l3 l3Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7, org.telegram.ui.ActionBar.i6 i6Var2, boolean z10) {
        super(context, i6Var);
        this.f30960h2 = l3Var;
        this.f30957e2 = i7;
        this.f30958f2 = i6Var2;
        this.f30959g2 = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        l3 l3Var = this.f30960h2;
        org.telegram.ui.Components.m6 m6Var = l3Var.f31075y;
        org.telegram.ui.Components.f5 f5Var = l3Var.f31073w;
        if (l3Var.f31074x <= 0) {
            i7 = org.telegram.ui.ActionBar.n6.f29672p7;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.P5;
        }
        m6Var.u(f5Var.a(org.telegram.ui.ActionBar.n6.w0(i7, this.f30958f2), false));
        int min = Math.min(org.telegram.messenger.g0.L(52.0f), getHeight());
        l3Var.f31075y.setBounds(getScrollX(), getHeight() - min, org.telegram.messenger.g0.L(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        l3Var.f31075y.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (!this.f30959g2 || menu.findItem(2131296493) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.N0(2131753668, null));
        spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(gd.N0(2131748894, null));
        spannableStringBuilder2.setSpan(new k41(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296498, 2131296499, 7, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(gd.N0(2131744192, null));
        ?? obj = new Object();
        obj.f34924a |= 8;
        spannableStringBuilder3.setSpan(new fz0(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296498, 2131296511, 8, spannableStringBuilder3);
        menu.add(2131296498, 2131296505, 9, gd.N0(2131746141, null));
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
        l3 l3Var = this.f30960h2;
        org.telegram.ui.Components.m6 m6Var = l3Var.f31075y;
        if (m6Var != null && this.f30957e2 > 0) {
            m6Var.a();
            l3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f30960h2.f31075y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
