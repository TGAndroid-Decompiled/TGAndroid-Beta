package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.n11;
import org.telegram.ui.Components.qu;
public final class d3 extends qu {
    public final org.telegram.ui.ActionBar.d6 V;
    public final boolean W;
    public final f3 f22119a0;

    public d3(f3 f3Var, Context context, kw0 kw0Var, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, kw0Var, null, 4, true, null);
        this.f22119a0 = f3Var;
        this.V = d6Var;
        this.W = z10;
    }

    @Override
    public final boolean a() {
        if (this.f22119a0.f22231n && super.a()) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f22119a0.a();
    }

    @Override
    public final void i(Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(16908341);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, 6, LocaleController.getString(R.string.Spoiler));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new d61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new d61(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        ?? obj = new Object();
        obj.f28359a |= 8;
        spannableStringBuilder3.setSpan(new n11(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, LocaleController.getString(R.string.Regular));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        int i10;
        canvas.save();
        int i11 = 0;
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        f3 f3Var = this.f22119a0;
        org.telegram.ui.Components.p6 p6Var = f3Var.v;
        org.telegram.ui.Components.i5 i5Var = f3Var.f22232r;
        if (i5Var != null) {
            if (f3Var.f22233s <= 0) {
                i10 = org.telegram.ui.ActionBar.h6.f21210p7;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.P5;
            }
            p6Var.u(i5Var.a(org.telegram.ui.ActionBar.h6.w0(i10, this.V), false));
        }
        int min = Math.min(AndroidUtilities.dp(48.0f), getHeight());
        boolean z10 = this.W;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(1.0f);
        }
        float scrollX = getScrollX();
        float height = (getHeight() + f7) - min;
        int width = getWidth() + getScrollX();
        if (!z10) {
            i11 = 44;
        }
        p6Var.o(scrollX, height, width - AndroidUtilities.dp(i11 + 12), f7 + getHeight());
        p6Var.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22119a0.v && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
