package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.y31;
public final class i3 extends ft {
    public final int f30431e2;
    public final org.telegram.ui.ActionBar.e6 f30432f2;
    public final boolean f30433g2;
    public final k3 f30434h2;

    public i3(k3 k3Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7, org.telegram.ui.ActionBar.e6 e6Var2, boolean z10) {
        super(context, e6Var);
        this.f30434h2 = k3Var;
        this.f30431e2 = i7;
        this.f30432f2 = e6Var2;
        this.f30433g2 = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        k3 k3Var = this.f30434h2;
        org.telegram.ui.Components.g6 g6Var = k3Var.f30554y;
        org.telegram.ui.Components.x4 x4Var = k3Var.f30552w;
        if (k3Var.f30553x <= 0) {
            i7 = org.telegram.ui.ActionBar.j6.f29070p7;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.P5;
        }
        g6Var.u(x4Var.a(org.telegram.ui.ActionBar.j6.w0(i7, this.f30432f2), false));
        int min = Math.min(org.telegram.messenger.g0.L(52.0f), getHeight());
        k3Var.f30554y.setBounds(getScrollX(), getHeight() - min, org.telegram.messenger.g0.L(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        k3Var.f30554y.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (!this.f30433g2 || menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131753671, null));
        spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hd.M0(2131749087, null));
        spannableStringBuilder2.setSpan(new y31(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 7, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(hd.M0(2131744437, null));
        ?? obj = new Object();
        obj.f41484a |= 8;
        spannableStringBuilder3.setSpan(new xy0(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296496, 2131296509, 8, spannableStringBuilder3);
        menu.add(2131296496, 2131296503, 9, hd.M0(2131746337, null));
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
        k3 k3Var = this.f30434h2;
        org.telegram.ui.Components.g6 g6Var = k3Var.f30554y;
        if (g6Var != null && this.f30431e2 > 0) {
            g6Var.a();
            k3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f30434h2.f30554y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
