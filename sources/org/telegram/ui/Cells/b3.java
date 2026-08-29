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
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.t41;
public final class b3 extends au {
    public final org.telegram.ui.ActionBar.c6 R;
    public final boolean S;
    public final d3 T;

    public b3(d3 d3Var, Context context, hv0 hv0Var, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, hv0Var, null, 4, true, null);
        this.T = d3Var;
        this.R = c6Var;
        this.S = z10;
    }

    @Override
    public final boolean a() {
        if (this.T.f24222n && super.a()) {
            return true;
        }
        return false;
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
        spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new t41(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        ?? obj = new Object();
        obj.f29024a |= 8;
        spannableStringBuilder3.setSpan(new i01(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, LocaleController.getString(R.string.Regular));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        int i10;
        canvas.save();
        int i11 = 0;
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        d3 d3Var = this.T;
        org.telegram.ui.Components.n6 n6Var = d3Var.v;
        org.telegram.ui.Components.f5 f5Var = d3Var.f24223r;
        if (f5Var != null) {
            if (d3Var.f24224s <= 0) {
                i10 = org.telegram.ui.ActionBar.g6.f23279p7;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.P5;
            }
            n6Var.r(f5Var.a(org.telegram.ui.ActionBar.g6.v0(i10, this.R), false));
        }
        int min = Math.min(AndroidUtilities.dp(48.0f), getHeight());
        boolean z10 = this.S;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = -AndroidUtilities.dp(1.0f);
        }
        float scrollX = getScrollX();
        float height = (getHeight() + f9) - min;
        int width = getWidth() + getScrollX();
        if (!z10) {
            i11 = 44;
        }
        n6Var.l(scrollX, height, width - AndroidUtilities.dp(i11 + 12), f9 + getHeight());
        n6Var.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.T.v && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
