package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.id;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.vy0;
public final class f3 extends lt {
    public final org.telegram.ui.ActionBar.f6 V;
    public final boolean W;
    public final h3 f29100a0;

    public f3(h3 h3Var, Context context, rt0 rt0Var, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context, rt0Var, null, 4, true, null);
        this.f29100a0 = h3Var;
        this.V = f6Var;
        this.W = z9;
    }

    @Override
    public final boolean a() {
        if (this.f29100a0.f29257r && super.a()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return this.f29100a0.f29258s;
    }

    @Override
    public final int h() {
        return this.f29100a0.a();
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        menu.add(2131296496, 2131296508, 6, id.M0(2131745265, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.M0(2131753671, null));
        spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(id.M0(2131749088, null));
        spannableStringBuilder2.setSpan(new u31(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296496, 2131296497, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(id.M0(2131744440, null));
        ?? obj = new Object();
        obj.f38779a = 8 | obj.f38779a;
        spannableStringBuilder3.setSpan(new vy0(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296496, 2131296509, 9, spannableStringBuilder3);
        menu.add(2131296496, 2131296503, 10, id.M0(2131746338, null));
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
        h3 h3Var = this.f29100a0;
        org.telegram.ui.Components.i6 i6Var = h3Var.f29261y;
        org.telegram.ui.Components.z4 z4Var = h3Var.f29259w;
        if (z4Var != null) {
            if (h3Var.f29260x <= 0) {
                i7 = org.telegram.ui.ActionBar.k6.f28073p7;
            } else {
                i7 = org.telegram.ui.ActionBar.k6.P5;
            }
            i6Var.u(z4Var.a(org.telegram.ui.ActionBar.k6.w0(i7, this.V), false));
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
        if (drawable != this.f29100a0.f29261y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
