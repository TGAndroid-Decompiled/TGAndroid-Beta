package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.zz0;
public final class k3 extends mt {
    public final int Y1;
    public final org.telegram.ui.ActionBar.p6 Z1;
    public final boolean a2;
    public final m3 f22119b2;

    public k3(m3 m3Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10, org.telegram.ui.ActionBar.p6 p6Var2, boolean z10) {
        super(context, p6Var);
        this.f22119b2 = m3Var;
        this.Y1 = i10;
        this.Z1 = p6Var2;
        this.a2 = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        m3 m3Var = this.f22119b2;
        org.telegram.ui.Components.e6 e6Var = m3Var.f22299y;
        org.telegram.ui.Components.w4 w4Var = m3Var.f22297w;
        if (m3Var.f22298x <= 0) {
            i10 = org.telegram.ui.ActionBar.t6.f21153p7;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.P5;
        }
        e6Var.u(w4Var.a(org.telegram.ui.ActionBar.t6.w0(i10, this.Z1), false));
        int min = Math.min(org.telegram.messenger.i0.L(52.0f), getHeight());
        m3Var.f22299y.setBounds(getScrollX(), getHeight() - min, org.telegram.messenger.i0.L(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        m3Var.f22299y.draw(canvas);
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        if (!this.a2 || menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cd.L0(2131753671, null));
        spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(cd.L0(2131749097, null));
        spannableStringBuilder2.setSpan(new x41(org.telegram.messenger.i0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 7, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(cd.L0(2131744463, null));
        ?? obj = new Object();
        obj.f32850a |= 8;
        spannableStringBuilder3.setSpan(new zz0(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296496, 2131296509, 8, spannableStringBuilder3);
        menu.add(2131296496, 2131296503, 9, cd.L0(2131746352, null));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        m3 m3Var = this.f22119b2;
        org.telegram.ui.Components.e6 e6Var = m3Var.f22299y;
        if (e6Var != null && this.Y1 > 0) {
            e6Var.a();
            m3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22119b2.f22299y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
