package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.yt;
public final class g3 extends yt {
    public final org.telegram.ui.ActionBar.h6 W;
    public final boolean f30676a0;
    public final i3 f30677b0;

    public g3(i3 i3Var, Context context, du0 du0Var, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context, du0Var, null, 4, true, null);
        this.f30677b0 = i3Var;
        this.W = h6Var;
        this.f30676a0 = z10;
    }

    @Override
    public final boolean a() {
        if (this.f30677b0.f30833r && super.a()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return this.f30677b0.f30834s;
    }

    @Override
    public final int h() {
        return this.f30677b0.a();
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(2131296493) != null) {
            return;
        }
        menu.removeItem(16908341);
        menu.add(2131296498, 2131296510, 6, gd.N0(2131745021, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.N0(2131753668, null));
        spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296498, 2131296493, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(gd.N0(2131748894, null));
        spannableStringBuilder2.setSpan(new l41(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(2131296498, 2131296499, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(gd.N0(2131744196, null));
        ?? obj = new Object();
        obj.f35335a = 8 | obj.f35335a;
        spannableStringBuilder3.setSpan(new gz0(obj, 0), 0, spannableStringBuilder3.length(), 33);
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
        i3 i3Var = this.f30677b0;
        org.telegram.ui.Components.n6 n6Var = i3Var.f30837y;
        org.telegram.ui.Components.g5 g5Var = i3Var.f30835w;
        if (g5Var != null) {
            if (i3Var.f30836x <= 0) {
                i7 = org.telegram.ui.ActionBar.m6.f29599p7;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.P5;
            }
            n6Var.u(g5Var.a(org.telegram.ui.ActionBar.m6.w0(i7, this.W), false));
        }
        int min = Math.min(org.telegram.messenger.g0.L(48.0f), getHeight());
        boolean z10 = this.f30676a0;
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
        n6Var.o(scrollX, height, width - org.telegram.messenger.g0.L(i10 + 12), f10 + getHeight());
        n6Var.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f30677b0.f30837y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
