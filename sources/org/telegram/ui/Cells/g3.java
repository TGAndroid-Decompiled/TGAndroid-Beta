package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.wt;
public final class g3 extends wt {
    public final org.telegram.ui.ActionBar.i6 W;
    public final boolean f30734a0;
    public final i3 f30735b0;

    public g3(i3 i3Var, Context context, cu0 cu0Var, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context, cu0Var, null, 4, true, null);
        this.f30735b0 = i3Var;
        this.W = i6Var;
        this.f30734a0 = z10;
    }

    @Override
    public final boolean a() {
        if (this.f30735b0.f30892r && super.a()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return this.f30735b0.f30893s;
    }

    @Override
    public final int h() {
        return this.f30735b0.a();
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296493) != null) {
            return;
        }
        menu.removeItem(16908341);
        menu.add(2131296498, 2131296510, 6, gd.N0(2131745021, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.N0(2131753668, null));
        spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(gd.N0(2131748894, null));
        spannableStringBuilder2.setSpan(new k41(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296498, 2131296499, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(gd.N0(2131744192, null));
        ?? obj = new Object();
        obj.f34924a = 8 | obj.f34924a;
        spannableStringBuilder3.setSpan(new fz0(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(2131296498, 2131296511, 9, spannableStringBuilder3);
        menu.add(2131296498, 2131296505, 10, gd.N0(2131746141, null));
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
        i3 i3Var = this.f30735b0;
        org.telegram.ui.Components.m6 m6Var = i3Var.f30896y;
        org.telegram.ui.Components.f5 f5Var = i3Var.f30894w;
        if (f5Var != null) {
            if (i3Var.f30895x <= 0) {
                i7 = org.telegram.ui.ActionBar.n6.f29672p7;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.P5;
            }
            m6Var.u(f5Var.a(org.telegram.ui.ActionBar.n6.w0(i7, this.W), false));
        }
        int min = Math.min(org.telegram.messenger.g0.L(48.0f), getHeight());
        boolean z10 = this.f30734a0;
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
        if (drawable != this.f30735b0.f30896y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
