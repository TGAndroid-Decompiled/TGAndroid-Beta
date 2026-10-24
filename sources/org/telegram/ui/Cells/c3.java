package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.q11;
public final class c3 extends ou {
    public final org.telegram.ui.ActionBar.g6 V;
    public final boolean W;
    public final e3 f22202a0;

    public c3(e3 e3Var, Context context, nw0 nw0Var, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context, nw0Var, null, 4, true, null);
        this.f22202a0 = e3Var;
        this.V = g6Var;
        this.W = z10;
    }

    @Override
    public final boolean a() {
        if (this.f22202a0.f22320r && super.a()) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f22202a0.a();
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(16908341);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, 6, LocaleController.getString(R.string.Spoiler));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new i61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new i61(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        ?? obj = new Object();
        obj.f29448a |= 8;
        spannableStringBuilder3.setSpan(new q11(obj, 0), 0, spannableStringBuilder3.length(), 33);
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
        e3 e3Var = this.f22202a0;
        org.telegram.ui.Components.n6 n6Var = e3Var.f22322w;
        org.telegram.ui.Components.g5 g5Var = e3Var.f22321s;
        if (g5Var != null) {
            if (e3Var.v <= 0) {
                i10 = org.telegram.ui.ActionBar.k6.f21405p7;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.P5;
            }
            n6Var.u(g5Var.a(org.telegram.ui.ActionBar.k6.w0(i10, this.V), false));
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
        n6Var.o(scrollX, height, width - AndroidUtilities.dp(i11 + 12), f7 + getHeight());
        n6Var.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22202a0.f22322w && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
