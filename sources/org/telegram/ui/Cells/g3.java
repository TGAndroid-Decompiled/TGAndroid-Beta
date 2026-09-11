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
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.zt;
public final class g3 extends zt {
    public final int f21967c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final boolean f21968e;
    public final i3 f21969f;

    public g3(i3 i3Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, org.telegram.ui.ActionBar.f6 f6Var2, boolean z10) {
        super(context, f6Var);
        this.f21969f = i3Var;
        this.f21967c = i10;
        this.d = f6Var2;
        this.f21968e = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        i3 i3Var = this.f21969f;
        org.telegram.ui.Components.p6 p6Var = i3Var.v;
        org.telegram.ui.Components.h5 h5Var = i3Var.f22079r;
        if (i3Var.f22080s <= 0) {
            i10 = org.telegram.ui.ActionBar.j6.f20880p7;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.P5;
        }
        p6Var.r(h5Var.a(org.telegram.ui.ActionBar.j6.v0(i10, this.d), false));
        int min = Math.min(AndroidUtilities.dp(52.0f), getHeight());
        i3Var.v.setBounds(getScrollX(), getHeight() - min, AndroidUtilities.dp(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        i3Var.v.draw(canvas);
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        if (!this.f21968e || menu.findItem(R.id.menu_bold) != null) {
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
        obj.f28591a |= 8;
        spannableStringBuilder3.setSpan(new o01(obj, 0), 0, spannableStringBuilder3.length(), 33);
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
        i3 i3Var = this.f21969f;
        org.telegram.ui.Components.p6 p6Var = i3Var.v;
        if (p6Var != null && this.f21967c > 0) {
            p6Var.b();
            i3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f21969f.v && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
