package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.wt;
public final class g3 extends wt {
    public final org.telegram.ui.ActionBar.i6 W;
    public final boolean f30648a0;
    public final i3 f30649b0;

    public g3(i3 i3Var, Context context, au0 au0Var, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context, au0Var, null, 4, true, null);
        this.f30649b0 = i3Var;
        this.W = i6Var;
        this.f30648a0 = z10;
    }

    @Override
    public final boolean a() {
        if (this.f30649b0.f30805r && super.a()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return this.f30649b0.f30806s;
    }

    @Override
    public final int h() {
        return this.f30649b0.a();
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        menu.add(2131296496, 2131296508, 6, gd.M0(2131745027, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.M0(2131753669, null));
        spannableStringBuilder.setSpan(new i41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(gd.M0(2131748895, null));
        spannableStringBuilder2.setSpan(new i41(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(gd.M0(2131744202, null));
        ?? obj = new Object();
        obj.f34537a = 8 | obj.f34537a;
        spannableStringBuilder3.setSpan(new ez0(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296496, 2131296509, 9, spannableStringBuilder3);
        menu.add(2131296496, 2131296503, 10, gd.M0(2131746142, null));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int i7;
        canvas.save();
        int i10 = 0;
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        i3 i3Var = this.f30649b0;
        org.telegram.ui.Components.m6 m6Var = i3Var.f30809y;
        org.telegram.ui.Components.f5 f5Var = i3Var.f30807w;
        if (f5Var != null) {
            if (i3Var.f30808x <= 0) {
                i7 = org.telegram.ui.ActionBar.n6.f29615p7;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.P5;
            }
            m6Var.u(f5Var.a(org.telegram.ui.ActionBar.n6.w0(i7, this.W), false));
        }
        int min = Math.min(org.telegram.messenger.g0.L(48.0f), getHeight());
        boolean z10 = this.f30648a0;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = -org.telegram.messenger.g0.L(1.0f);
        }
        float scrollX = getScrollX();
        float height = (getHeight() + f10) - min;
        int width = getWidth() + getScrollX();
        if (!z10) {
            i10 = 44;
        }
        m6Var.o(scrollX, height, width - org.telegram.messenger.g0.L(i10 + 12), f10 + getHeight());
        m6Var.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f30649b0.f30809y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
