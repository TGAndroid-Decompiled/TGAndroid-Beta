package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.id;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.vy0;
public final class f3 extends kt {
    public final org.telegram.ui.ActionBar.h6 V;
    public final boolean W;
    public final h3 f29115a0;

    public f3(h3 h3Var, Context context, st0 st0Var, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(context, st0Var, null, 4, true, null);
        this.f29115a0 = h3Var;
        this.V = h6Var;
        this.W = z9;
    }

    @Override
    public final boolean a() {
        if (this.f29115a0.f29272r && super.a()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return this.f29115a0.f29273s;
    }

    @Override
    public final int h() {
        return this.f29115a0.a();
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        menu.add(2131296496, 2131296508, 6, id.M0(2131745262, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.M0(2131753671, null));
        spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(id.M0(2131749087, null));
        spannableStringBuilder2.setSpan(new u31(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(id.M0(2131744437, null));
        ?? obj = new Object();
        obj.f38777a = 8 | obj.f38777a;
        spannableStringBuilder3.setSpan(new vy0(obj, 0), 0, spannableStringBuilder3.length(), 33);
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
        h3 h3Var = this.f29115a0;
        org.telegram.ui.Components.h6 h6Var = h3Var.f29276y;
        org.telegram.ui.Components.y4 y4Var = h3Var.f29274w;
        if (y4Var != null) {
            if (h3Var.f29275x <= 0) {
                i7 = org.telegram.ui.ActionBar.m6.f28111p7;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.P5;
            }
            h6Var.u(y4Var.a(org.telegram.ui.ActionBar.m6.w0(i7, this.V), false));
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
        h6Var.o(scrollX, height, width - org.telegram.messenger.g0.L(i10 + 12), f10 + getHeight());
        h6Var.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f29115a0.f29276y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
