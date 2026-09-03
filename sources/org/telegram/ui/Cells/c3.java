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
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.t01;
public final class c3 extends cu {
    public final org.telegram.ui.ActionBar.f6 S;
    public final boolean T;
    public final e3 U;

    public c3(e3 e3Var, Context context, qv0 qv0Var, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context, qv0Var, null, 4, true, null);
        this.U = e3Var;
        this.S = f6Var;
        this.T = z4;
    }

    @Override
    public final boolean a() {
        if (this.U.f20989n && super.a()) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.U.a();
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
        spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new f51(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        ?? obj = new Object();
        obj.f28632a |= 8;
        spannableStringBuilder3.setSpan(new t01(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, LocaleController.getString(R.string.Regular));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int i10;
        canvas.save();
        int i11 = 0;
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        e3 e3Var = this.U;
        org.telegram.ui.Components.j6 j6Var = e3Var.v;
        org.telegram.ui.Components.c5 c5Var = e3Var.f20990r;
        if (c5Var != null) {
            if (e3Var.f20991s <= 0) {
                i10 = org.telegram.ui.ActionBar.j6.f20097p7;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.P5;
            }
            j6Var.r(c5Var.a(org.telegram.ui.ActionBar.j6.v0(i10, this.S), false));
        }
        int min = Math.min(AndroidUtilities.dp(48.0f), getHeight());
        boolean z4 = this.T;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = -AndroidUtilities.dp(1.0f);
        }
        float scrollX = getScrollX();
        float height = (getHeight() + f10) - min;
        int width = getWidth() + getScrollX();
        if (!z4) {
            i11 = 44;
        }
        j6Var.l(scrollX, height, width - AndroidUtilities.dp(i11 + 12), f10 + getHeight());
        j6Var.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.U.v && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
