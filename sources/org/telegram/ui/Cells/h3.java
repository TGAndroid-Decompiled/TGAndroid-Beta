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
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.t51;
public final class h3 extends du {
    public final int f20389c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final boolean e;
    public final j3 f20390f;

    public h3(j3 j3Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, org.telegram.ui.ActionBar.d6 d6Var2, boolean z10) {
        super(context, d6Var);
        this.f20390f = j3Var;
        this.f20389c = i10;
        this.d = d6Var2;
        this.e = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        j3 j3Var = this.f20390f;
        org.telegram.ui.Components.o6 o6Var = j3Var.v;
        org.telegram.ui.Components.h5 h5Var = j3Var.f20495r;
        if (j3Var.f20496s <= 0) {
            i10 = org.telegram.ui.ActionBar.h6.f19279p7;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.P5;
        }
        o6Var.r(h5Var.a(org.telegram.ui.ActionBar.h6.v0(i10, this.d), false));
        int min = Math.min(AndroidUtilities.dp(52.0f), getHeight());
        j3Var.v.setBounds(getScrollX(), getHeight() - min, AndroidUtilities.dp(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        j3Var.v.draw(canvas);
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        if (!this.e || menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            menu.removeItem(16908341);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new t51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new t51(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        ?? obj = new Object();
        obj.f23182a |= 8;
        spannableStringBuilder3.setSpan(new d11(obj, 0), 0, spannableStringBuilder3.length(), 33);
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
        j3 j3Var = this.f20390f;
        org.telegram.ui.Components.o6 o6Var = j3Var.v;
        if (o6Var != null && this.f20389c > 0) {
            o6Var.b();
            j3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f20390f.v && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
