package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.zu0;

public final class b3 extends tt {
    public final org.telegram.ui.ActionBar.c6 R;
    public final boolean S;
    public final d3 T;

    public b3(d3 d3Var, Context context, zu0 zu0Var, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, zu0Var, null, 4, true, null);
        this.T = d3Var;
        this.R = c6Var;
        this.S = z10;
    }

    @Override
    public final boolean a() {
        return this.T.f24200n && super.a();
    }

    @Override
    public final int h() {
        return this.T.a();
    }

    @Override
    public final void i(Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            menu.removeItem(16908341);
        }
        menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, 6, LocaleController.getString(R.string.Spoiler));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new k41(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        xz0 xz0Var = new xz0();
        xz0Var.f34734a |= 8;
        spannableStringBuilder3.setSpan(new yz0(xz0Var, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, LocaleController.getString(R.string.Regular));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        d3 d3Var = this.T;
        org.telegram.ui.Components.i6 i6Var = d3Var.v;
        org.telegram.ui.Components.b5 b5Var = d3Var.f24201r;
        if (b5Var != null) {
            i6Var.r(b5Var.a(org.telegram.ui.ActionBar.g6.v0(d3Var.f24202s <= 0 ? org.telegram.ui.ActionBar.g6.f23269p7 : org.telegram.ui.ActionBar.g6.P5, this.R), false));
        }
        int iMin = Math.min(AndroidUtilities.dp(48.0f), getHeight());
        boolean z10 = this.S;
        float f10 = z10 ? 0.0f : -AndroidUtilities.dp(1.0f);
        i6Var.l(getScrollX(), (getHeight() + f10) - iMin, (getWidth() + getScrollX()) - AndroidUtilities.dp((z10 ? 0 : 44) + 12), f10 + getHeight());
        i6Var.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.T.v || super.verifyDrawable(drawable);
    }
}
