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
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.Components.xu0;
public final class d3 extends ut {
    public final org.telegram.ui.ActionBar.b6 R;
    public final boolean S;
    public final g3 T;

    public d3(g3 g3Var, Context context, xu0 xu0Var, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context, xu0Var, null, 4, true, null);
        this.T = g3Var;
        this.R = b6Var;
        this.S = z10;
    }

    @Override
    public final boolean a() {
        if (this.T.f24377n && super.a()) {
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
        spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new i41(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        ?? obj = new Object();
        obj.f34062a |= 8;
        spannableStringBuilder3.setSpan(new wz0(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, LocaleController.getString(R.string.Regular));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int i9;
        canvas.save();
        int i10 = 0;
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        g3 g3Var = this.T;
        org.telegram.ui.Components.i6 i6Var = g3Var.v;
        org.telegram.ui.Components.b5 b5Var = g3Var.f24378r;
        if (b5Var != null) {
            if (g3Var.f24379s <= 0) {
                i9 = org.telegram.ui.ActionBar.f6.f23212p7;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.P5;
            }
            i6Var.r(b5Var.a(org.telegram.ui.ActionBar.f6.v0(i9, this.R), false));
        }
        int min = Math.min(AndroidUtilities.dp(48.0f), getHeight());
        boolean z10 = this.S;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = -AndroidUtilities.dp(1.0f);
        }
        float scrollX = getScrollX();
        float height = (getHeight() + f10) - min;
        int width = getWidth() + getScrollX();
        if (!z10) {
            i10 = 44;
        }
        i6Var.l(scrollX, height, width - AndroidUtilities.dp(i10 + 12), f10 + getHeight());
        i6Var.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.T.v && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
