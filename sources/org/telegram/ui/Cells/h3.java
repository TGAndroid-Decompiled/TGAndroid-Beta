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
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.u11;
public final class h3 extends ru {
    public final int f22193c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final boolean f22194e;
    public final j3 f22195f;

    public h3(j3 j3Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10, org.telegram.ui.ActionBar.e6 e6Var2, boolean z10) {
        super(context, e6Var);
        this.f22195f = j3Var;
        this.f22193c = i10;
        this.d = e6Var2;
        this.f22194e = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        j3 j3Var = this.f22195f;
        org.telegram.ui.Components.q6 q6Var = j3Var.v;
        org.telegram.ui.Components.j5 j5Var = j3Var.f22302r;
        if (j3Var.f22303s <= 0) {
            i10 = org.telegram.ui.ActionBar.i6.f21018p7;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.P5;
        }
        q6Var.u(j5Var.a(org.telegram.ui.ActionBar.i6.w0(i10, this.d), false));
        int min = Math.min(AndroidUtilities.dp(52.0f), getHeight());
        j3Var.v.setBounds(getScrollX(), getHeight() - min, AndroidUtilities.dp(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        j3Var.v.draw(canvas);
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        if (!this.f22194e || menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new m61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new m61(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        ?? obj = new Object();
        obj.f30974a |= 8;
        spannableStringBuilder3.setSpan(new u11(obj, 0), 0, spannableStringBuilder3.length(), 33);
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
        j3 j3Var = this.f22195f;
        org.telegram.ui.Components.q6 q6Var = j3Var.v;
        if (q6Var != null && this.f22193c > 0) {
            q6Var.a();
            j3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22195f.v && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
