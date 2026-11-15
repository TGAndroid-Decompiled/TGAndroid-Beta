package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.y31;
public final class f3 extends rt {
    public final org.telegram.ui.ActionBar.e6 W;
    public final boolean f30213a0;
    public final h3 f30214b0;

    public f3(h3 h3Var, Context context, st0 st0Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, st0Var, null, 4, true, null);
        this.f30214b0 = h3Var;
        this.W = e6Var;
        this.f30213a0 = z10;
    }

    @Override
    public final boolean a() {
        if (this.f30214b0.f30380r && super.a()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return this.f30214b0.f30381s;
    }

    @Override
    public final int h() {
        return this.f30214b0.a();
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        menu.add(2131296496, 2131296508, 6, hd.M0(2131745262, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131753671, null));
        spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hd.M0(2131749087, null));
        spannableStringBuilder2.setSpan(new y31(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(hd.M0(2131744437, null));
        ?? obj = new Object();
        obj.f41484a = 8 | obj.f41484a;
        spannableStringBuilder3.setSpan(new xy0(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296496, 2131296509, 9, spannableStringBuilder3);
        menu.add(2131296496, 2131296503, 10, hd.M0(2131746337, null));
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
        h3 h3Var = this.f30214b0;
        org.telegram.ui.Components.g6 g6Var = h3Var.f30384y;
        org.telegram.ui.Components.x4 x4Var = h3Var.f30382w;
        if (x4Var != null) {
            if (h3Var.f30383x <= 0) {
                i7 = org.telegram.ui.ActionBar.j6.f29070p7;
            } else {
                i7 = org.telegram.ui.ActionBar.j6.P5;
            }
            g6Var.u(x4Var.a(org.telegram.ui.ActionBar.j6.w0(i7, this.W), false));
        }
        int min = Math.min(org.telegram.messenger.g0.L(48.0f), getHeight());
        boolean z10 = this.f30213a0;
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
        if (drawable != this.f30214b0.f30384y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
