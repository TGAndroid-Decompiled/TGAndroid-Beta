package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.id;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.wy0;
public final class f3 extends lt {
    public final org.telegram.ui.ActionBar.g6 V;
    public final boolean W;
    public final h3 f29104a0;

    public f3(h3 h3Var, Context context, tt0 tt0Var, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        super(context, tt0Var, null, 4, true, null);
        this.f29104a0 = h3Var;
        this.V = g6Var;
        this.W = z9;
    }

    @Override
    public final boolean a() {
        if (this.f29104a0.f29261r && super.a()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return this.f29104a0.f29262s;
    }

    @Override
    public final int h() {
        return this.f29104a0.a();
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        menu.add(2131296496, 2131296508, 6, id.M0(2131745262, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.M0(2131753671, null));
        spannableStringBuilder.setSpan(new v31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(id.M0(2131749087, null));
        spannableStringBuilder2.setSpan(new v31(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(id.M0(2131744437, null));
        ?? obj = new Object();
        obj.f39836a = 8 | obj.f39836a;
        spannableStringBuilder3.setSpan(new wy0(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296496, 2131296509, 9, spannableStringBuilder3);
        menu.add(2131296496, 2131296503, 10, id.M0(2131746337, null));
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
        h3 h3Var = this.f29104a0;
        org.telegram.ui.Components.i6 i6Var = h3Var.f29265y;
        org.telegram.ui.Components.z4 z4Var = h3Var.f29263w;
        if (z4Var != null) {
            if (h3Var.f29264x <= 0) {
                i7 = org.telegram.ui.ActionBar.l6.f28086p7;
            } else {
                i7 = org.telegram.ui.ActionBar.l6.P5;
            }
            i6Var.u(z4Var.a(org.telegram.ui.ActionBar.l6.w0(i7, this.V), false));
        }
        int min = Math.min(org.telegram.messenger.g0.L(48.0f), getHeight());
        boolean z9 = this.W;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = -org.telegram.messenger.g0.L(1.0f);
        }
        float scrollX = getScrollX();
        float height = (getHeight() + f10) - min;
        int width = getWidth() + getScrollX();
        if (!z9) {
            i10 = 44;
        }
        i6Var.o(scrollX, height, width - org.telegram.messenger.g0.L(i10 + 12), f10 + getHeight());
        i6Var.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f29104a0.f29265y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
