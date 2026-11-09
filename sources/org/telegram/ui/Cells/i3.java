package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.id;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.zs;
public final class i3 extends zs {
    public final int Y1;
    public final org.telegram.ui.ActionBar.g6 Z1;
    public final boolean f29310a2;
    public final k3 f29311b2;

    public i3(k3 k3Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7, org.telegram.ui.ActionBar.g6 g6Var2, boolean z9) {
        super(context, g6Var);
        this.f29311b2 = k3Var;
        this.Y1 = i7;
        this.Z1 = g6Var2;
        this.f29310a2 = z9;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        k3 k3Var = this.f29311b2;
        org.telegram.ui.Components.i6 i6Var = k3Var.f29423y;
        org.telegram.ui.Components.z4 z4Var = k3Var.f29421w;
        if (k3Var.f29422x <= 0) {
            i7 = org.telegram.ui.ActionBar.l6.f28086p7;
        } else {
            i7 = org.telegram.ui.ActionBar.l6.P5;
        }
        i6Var.u(z4Var.a(org.telegram.ui.ActionBar.l6.w0(i7, this.Z1), false));
        int min = Math.min(org.telegram.messenger.g0.L(52.0f), getHeight());
        k3Var.f29423y.setBounds(getScrollX(), getHeight() - min, org.telegram.messenger.g0.L(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        k3Var.f29423y.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (!this.f29310a2 || menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.M0(2131753671, null));
        spannableStringBuilder.setSpan(new v31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(id.M0(2131749087, null));
        spannableStringBuilder2.setSpan(new v31(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 7, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(id.M0(2131744437, null));
        ?? obj = new Object();
        obj.f39836a |= 8;
        spannableStringBuilder3.setSpan(new wy0(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296496, 2131296509, 8, spannableStringBuilder3);
        menu.add(2131296496, 2131296503, 9, id.M0(2131746337, null));
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
        k3 k3Var = this.f29311b2;
        org.telegram.ui.Components.i6 i6Var = k3Var.f29423y;
        if (i6Var != null && this.Y1 > 0) {
            i6Var.a();
            k3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f29311b2.f29423y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
