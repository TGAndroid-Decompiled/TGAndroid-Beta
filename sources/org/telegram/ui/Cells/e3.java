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
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.r61;
public final class e3 extends ju {
    public final int f24028c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final boolean e;
    public final g3 f24029f;

    public e3(g3 g3Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10, org.telegram.ui.ActionBar.u6 u6Var2, boolean z10) {
        super(context, u6Var);
        this.f24029f = g3Var;
        this.f24028c = i10;
        this.d = u6Var2;
        this.e = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        g3 g3Var = this.f24029f;
        org.telegram.ui.Components.r6 r6Var = g3Var.f24155x;
        org.telegram.ui.Components.j5 j5Var = g3Var.v;
        if (g3Var.f24154w <= 0) {
            i10 = org.telegram.ui.ActionBar.y6.f23582p7;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.P5;
        }
        r6Var.u(j5Var.a(org.telegram.ui.ActionBar.y6.w0(i10, this.d), false));
        int min = Math.min(AndroidUtilities.dp(52.0f), getHeight());
        g3Var.f24155x.setBounds(getScrollX(), getHeight() - min, AndroidUtilities.dp(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        g3Var.f24155x.draw(canvas);
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        if (!this.e || menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new r61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new r61(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        ?? obj = new Object();
        obj.f35208a |= 8;
        spannableStringBuilder3.setSpan(new a21(obj, 0), 0, spannableStringBuilder3.length(), 33);
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
        g3 g3Var = this.f24029f;
        org.telegram.ui.Components.r6 r6Var = g3Var.f24155x;
        if (r6Var != null && this.f24028c > 0) {
            r6Var.a();
            g3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f24029f.f24155x && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
