package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.xt;
public final class g3 extends xt {
    public final int f22835c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final boolean f22836e;
    public final i3 f22837f;

    public g3(i3 i3Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10, org.telegram.ui.ActionBar.g6 g6Var2, boolean z4) {
        super(context, g6Var);
        this.f22837f = i3Var;
        this.f22835c = i10;
        this.d = g6Var2;
        this.f22836e = z4;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        i3 i3Var = this.f22837f;
        org.telegram.ui.Components.j6 j6Var = i3Var.v;
        org.telegram.ui.Components.c5 c5Var = i3Var.f22962r;
        if (i3Var.f22963s <= 0) {
            i10 = org.telegram.ui.ActionBar.k6.f21878p7;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.P5;
        }
        j6Var.r(c5Var.a(org.telegram.ui.ActionBar.k6.v0(i10, this.d), false));
        int min = Math.min(AndroidUtilities.dp(52.0f), getHeight());
        i3Var.v.setBounds(getScrollX(), getHeight() - min, AndroidUtilities.dp(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        i3Var.v.draw(canvas);
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        if (!this.f22836e || menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            menu.removeItem(16908341);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new e51(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        ?? obj = new Object();
        obj.f30949a |= 8;
        spannableStringBuilder3.setSpan(new t01(obj, 0), 0, spannableStringBuilder3.length(), 33);
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
        i3 i3Var = this.f22837f;
        org.telegram.ui.Components.j6 j6Var = i3Var.v;
        if (j6Var != null && this.f22835c > 0) {
            j6Var.b();
            i3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22837f.v && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
