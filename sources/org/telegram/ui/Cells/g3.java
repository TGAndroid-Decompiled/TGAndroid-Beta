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
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.m11;
public final class g3 extends iu {
    public final int f22283c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final boolean e;
    public final i3 f22284f;

    public g3(i3 i3Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, org.telegram.ui.ActionBar.d6 d6Var2, boolean z10) {
        super(context, d6Var);
        this.f22284f = i3Var;
        this.f22283c = i10;
        this.d = d6Var2;
        this.e = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        i3 i3Var = this.f22284f;
        org.telegram.ui.Components.p6 p6Var = i3Var.v;
        org.telegram.ui.Components.i5 i5Var = i3Var.f22402r;
        if (i3Var.f22403s <= 0) {
            i10 = org.telegram.ui.ActionBar.h6.f21207p7;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.P5;
        }
        p6Var.u(i5Var.a(org.telegram.ui.ActionBar.h6.w0(i10, this.d), false));
        int min = Math.min(AndroidUtilities.dp(52.0f), getHeight());
        i3Var.v.setBounds(getScrollX(), getHeight() - min, AndroidUtilities.dp(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        i3Var.v.draw(canvas);
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        if (!this.e || menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new c61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new c61(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        ?? obj = new Object();
        obj.f28049a |= 8;
        spannableStringBuilder3.setSpan(new m11(obj, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 8, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, LocaleController.getString(R.string.Regular));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i3 i3Var = this.f22284f;
        org.telegram.ui.Components.p6 p6Var = i3Var.v;
        if (p6Var != null && this.f22283c > 0) {
            p6Var.a();
            i3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22284f.v && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
