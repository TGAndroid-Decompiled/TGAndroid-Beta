package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.ys;
public final class i3 extends ys {
    public final int Y1;
    public final org.telegram.ui.ActionBar.f6 Z1;
    public final boolean f29302a2;
    public final k3 f29303b2;

    public i3(k3 k3Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7, org.telegram.ui.ActionBar.f6 f6Var2, boolean z9) {
        super(context, f6Var);
        this.f29303b2 = k3Var;
        this.Y1 = i7;
        this.Z1 = f6Var2;
        this.f29302a2 = z9;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        k3 k3Var = this.f29303b2;
        org.telegram.ui.Components.i6 i6Var = k3Var.f29415y;
        org.telegram.ui.Components.z4 z4Var = k3Var.f29413w;
        if (k3Var.f29414x <= 0) {
            i7 = org.telegram.ui.ActionBar.k6.f28069p7;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.P5;
        }
        i6Var.u(z4Var.a(org.telegram.ui.ActionBar.k6.w0(i7, this.Z1), false));
        int min = Math.min(org.telegram.messenger.g0.L(52.0f), getHeight());
        k3Var.f29415y.setBounds(getScrollX(), getHeight() - min, org.telegram.messenger.g0.L(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        k3Var.f29415y.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (!this.f29302a2 || menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131753671, null));
        spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hd.M0(2131749086, null));
        spannableStringBuilder2.setSpan(new o31(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 7, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(hd.M0(2131744438, null));
        ?? obj = new Object();
        obj.f38442a |= 8;
        spannableStringBuilder3.setSpan(new uy0(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296496, 2131296509, 8, spannableStringBuilder3);
        menu.add(2131296496, 2131296503, 9, hd.M0(2131746336, null));
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
        k3 k3Var = this.f29303b2;
        org.telegram.ui.Components.i6 i6Var = k3Var.f29415y;
        if (i6Var != null && this.Y1 > 0) {
            i6Var.a();
            k3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f29303b2.f29415y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
