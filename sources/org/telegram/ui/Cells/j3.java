package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ot;
public final class j3 extends ot {
    public final int f30899e2;
    public final org.telegram.ui.ActionBar.h6 f30900f2;
    public final boolean f30901g2;
    public final l3 f30902h2;

    public j3(l3 l3Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7, org.telegram.ui.ActionBar.h6 h6Var2, boolean z10) {
        super(context, h6Var);
        this.f30902h2 = l3Var;
        this.f30899e2 = i7;
        this.f30900f2 = h6Var2;
        this.f30901g2 = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        l3 l3Var = this.f30902h2;
        org.telegram.ui.Components.n6 n6Var = l3Var.f31007y;
        org.telegram.ui.Components.g5 g5Var = l3Var.f31005w;
        if (l3Var.f31006x <= 0) {
            i7 = org.telegram.ui.ActionBar.m6.f29599p7;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.P5;
        }
        n6Var.u(g5Var.a(org.telegram.ui.ActionBar.m6.w0(i7, this.f30900f2), false));
        int min = Math.min(org.telegram.messenger.g0.L(52.0f), getHeight());
        l3Var.f31007y.setBounds(getScrollX(), getHeight() - min, org.telegram.messenger.g0.L(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        l3Var.f31007y.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (!this.f30901g2 || menu.findItem(2131296493) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.N0(2131753668, null));
        spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(gd.N0(2131748894, null));
        spannableStringBuilder2.setSpan(new l41(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296498, 2131296499, 7, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(gd.N0(2131744196, null));
        ?? obj = new Object();
        obj.f35335a |= 8;
        spannableStringBuilder3.setSpan(new gz0(obj, 0), 0, spannableStringBuilder3.length(), 33);
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
        l3 l3Var = this.f30902h2;
        org.telegram.ui.Components.n6 n6Var = l3Var.f31007y;
        if (n6Var != null && this.f30899e2 > 0) {
            n6Var.a();
            l3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f30902h2.f31007y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
