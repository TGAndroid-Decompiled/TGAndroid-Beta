package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.uy0;
public final class f3 extends jt {
    public final org.telegram.ui.ActionBar.e6 W;
    public final boolean f29154a0;
    public final h3 f29155b0;

    public f3(h3 h3Var, Context context, qt0 qt0Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, qt0Var, null, 4, true, null);
        this.f29155b0 = h3Var;
        this.W = e6Var;
        this.f29154a0 = z10;
    }

    @Override
    public final boolean a() {
        if (this.f29155b0.f29321r && super.a()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return this.f29155b0.f29322s;
    }

    @Override
    public final int h() {
        return this.f29155b0.a();
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        menu.add(2131296496, 2131296508, 6, bd.M0(2131745272, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131753671, null));
        spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(bd.M0(2131749095, null));
        spannableStringBuilder2.setSpan(new o31(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(bd.M0(2131744447, null));
        ?? obj = new Object();
        obj.f38578a = 8 | obj.f38578a;
        spannableStringBuilder3.setSpan(new uy0(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296496, 2131296509, 9, spannableStringBuilder3);
        menu.add(2131296496, 2131296503, 10, bd.M0(2131746345, null));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int i3;
        canvas.save();
        int i10 = 0;
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        h3 h3Var = this.f29155b0;
        org.telegram.ui.Components.g6 g6Var = h3Var.f29325y;
        org.telegram.ui.Components.x4 x4Var = h3Var.f29323w;
        if (x4Var != null) {
            if (h3Var.f29324x <= 0) {
                i3 = org.telegram.ui.ActionBar.k6.f28102p7;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.P5;
            }
            g6Var.u(x4Var.a(org.telegram.ui.ActionBar.k6.w0(i3, this.W), false));
        }
        int min = Math.min(org.telegram.messenger.g0.L(48.0f), getHeight());
        boolean z10 = this.f29154a0;
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
        g6Var.o(scrollX, height, width - org.telegram.messenger.g0.L(i10 + 12), f10 + getHeight());
        g6Var.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f29155b0.f29325y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
