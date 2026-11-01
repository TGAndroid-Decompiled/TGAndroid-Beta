package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.y41;
public final class h3 extends wt {
    public final org.telegram.ui.ActionBar.p6 V;
    public final boolean W;
    public final j3 f21972a0;

    public h3(j3 j3Var, Context context, vu0 vu0Var, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context, vu0Var, null, 4, true, null);
        this.f21972a0 = j3Var;
        this.V = p6Var;
        this.W = z10;
    }

    @Override
    public final boolean a() {
        if (this.f21972a0.f22070r && super.a()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return this.f21972a0.f22071s;
    }

    @Override
    public final int h() {
        return this.f21972a0.a();
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        menu.add(2131296496, 2131296508, 6, dd.L0(2131745280, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dd.L0(2131753671, null));
        spannableStringBuilder.setSpan(new y41(org.telegram.messenger.i0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(dd.L0(2131749097, null));
        spannableStringBuilder2.setSpan(new y41(org.telegram.messenger.i0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(dd.L0(2131744463, null));
        ?? obj = new Object();
        obj.f33282a = 8 | obj.f33282a;
        spannableStringBuilder3.setSpan(new a01(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296496, 2131296509, 9, spannableStringBuilder3);
        menu.add(2131296496, 2131296503, 10, dd.L0(2131746352, null));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        int i10;
        canvas.save();
        int i11 = 0;
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        j3 j3Var = this.f21972a0;
        org.telegram.ui.Components.e6 e6Var = j3Var.f22074y;
        org.telegram.ui.Components.w4 w4Var = j3Var.f22072w;
        if (w4Var != null) {
            if (j3Var.f22073x <= 0) {
                i10 = org.telegram.ui.ActionBar.t6.f21154p7;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.P5;
            }
            e6Var.u(w4Var.a(org.telegram.ui.ActionBar.t6.w0(i10, this.V), false));
        }
        int min = Math.min(org.telegram.messenger.i0.L(48.0f), getHeight());
        boolean z10 = this.W;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -org.telegram.messenger.i0.L(1.0f);
        }
        float scrollX = getScrollX();
        float height = (getHeight() + f7) - min;
        int width = getWidth() + getScrollX();
        if (!z10) {
            i11 = 44;
        }
        e6Var.o(scrollX, height, width - org.telegram.messenger.i0.L(i11 + 12), f7 + getHeight());
        e6Var.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f21972a0.f22074y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
