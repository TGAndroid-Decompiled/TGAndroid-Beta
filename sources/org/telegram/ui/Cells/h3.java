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
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.uu;
public final class h3 extends uu {
    public final int f21960c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final boolean f21961e;
    public final j3 f21962f;

    public h3(j3 j3Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, org.telegram.ui.ActionBar.c6 c6Var2, boolean z10) {
        super(context, c6Var);
        this.f21962f = j3Var;
        this.f21960c = i10;
        this.d = c6Var2;
        this.f21961e = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        j3 j3Var = this.f21962f;
        org.telegram.ui.Components.q6 q6Var = j3Var.v;
        org.telegram.ui.Components.j5 j5Var = j3Var.f22086r;
        if (j3Var.f22087s <= 0) {
            i10 = org.telegram.ui.ActionBar.h6.f20781p7;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.P5;
        }
        q6Var.u(j5Var.a(org.telegram.ui.ActionBar.h6.w0(i10, this.d), false));
        int min = Math.min(AndroidUtilities.dp(52.0f), getHeight());
        j3Var.v.setBounds(getScrollX(), getHeight() - min, AndroidUtilities.dp(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        j3Var.v.draw(canvas);
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        if (!this.f21961e || menu.findItem(R.id.menu_bold) != null) {
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
        obj.f33255a |= 8;
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
        j3 j3Var = this.f21962f;
        org.telegram.ui.Components.q6 q6Var = j3Var.v;
        if (q6Var != null && this.f21960c > 0) {
            q6Var.a();
            j3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f21962f.v && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
