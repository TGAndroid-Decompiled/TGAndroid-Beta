package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.xs;
public final class i3 extends xs {
    public final int Z1;
    public final org.telegram.ui.ActionBar.e6 f29372a2;
    public final boolean f29373b2;
    public final k3 c2;

    public i3(k3 k3Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3, org.telegram.ui.ActionBar.e6 e6Var2, boolean z10) {
        super(context, e6Var);
        this.c2 = k3Var;
        this.Z1 = i3;
        this.f29372a2 = e6Var2;
        this.f29373b2 = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i3;
        super.dispatchDraw(canvas);
        k3 k3Var = this.c2;
        org.telegram.ui.Components.g6 g6Var = k3Var.f29493y;
        org.telegram.ui.Components.x4 x4Var = k3Var.f29491w;
        if (k3Var.f29492x <= 0) {
            i3 = org.telegram.ui.ActionBar.k6.f28102p7;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.P5;
        }
        g6Var.u(x4Var.a(org.telegram.ui.ActionBar.k6.w0(i3, this.f29372a2), false));
        int min = Math.min(org.telegram.messenger.g0.L(52.0f), getHeight());
        k3Var.f29493y.setBounds(getScrollX(), getHeight() - min, org.telegram.messenger.g0.L(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        k3Var.f29493y.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (!this.f29373b2 || menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131753671, null));
        spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(bd.M0(2131749095, null));
        spannableStringBuilder2.setSpan(new o31(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 7, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(bd.M0(2131744447, null));
        ?? obj = new Object();
        obj.f38578a |= 8;
        spannableStringBuilder3.setSpan(new uy0(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296496, 2131296509, 8, spannableStringBuilder3);
        menu.add(2131296496, 2131296503, 9, bd.M0(2131746345, null));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        super.onTextChanged(charSequence, i3, i10, i11);
        k3 k3Var = this.c2;
        org.telegram.ui.Components.g6 g6Var = k3Var.f29493y;
        if (g6Var != null && this.Z1 > 0) {
            g6Var.a();
            k3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.c2.f29493y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
