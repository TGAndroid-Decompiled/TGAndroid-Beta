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
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.wz0;
public final class h3 extends mt {
    public final int f24428c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final boolean f24429e;
    public final j3 f24430f;

    public h3(j3 j3Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9, org.telegram.ui.ActionBar.b6 b6Var2, boolean z10) {
        super(context, b6Var);
        this.f24430f = j3Var;
        this.f24428c = i9;
        this.d = b6Var2;
        this.f24429e = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        super.dispatchDraw(canvas);
        j3 j3Var = this.f24430f;
        org.telegram.ui.Components.i6 i6Var = j3Var.v;
        org.telegram.ui.Components.b5 b5Var = j3Var.f24549r;
        if (j3Var.f24550s <= 0) {
            i9 = org.telegram.ui.ActionBar.f6.f23212p7;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.P5;
        }
        i6Var.r(b5Var.a(org.telegram.ui.ActionBar.f6.v0(i9, this.d), false));
        int min = Math.min(AndroidUtilities.dp(52.0f), getHeight());
        j3Var.v.setBounds(getScrollX(), getHeight() - min, AndroidUtilities.dp(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        j3Var.v.draw(canvas);
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        if (!this.f24429e || menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            menu.removeItem(16908341);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new i41(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        ?? obj = new Object();
        obj.f34062a |= 8;
        spannableStringBuilder3.setSpan(new wz0(obj, 0), 0, spannableStringBuilder3.length(), 33);
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
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        j3 j3Var = this.f24430f;
        org.telegram.ui.Components.i6 i6Var = j3Var.v;
        if (i6Var != null && this.f24428c > 0) {
            i6Var.b();
            j3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f24430f.v && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
