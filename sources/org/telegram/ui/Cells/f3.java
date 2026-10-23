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
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r11;
public final class f3 extends iu {
    public final int f22355c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final boolean e;
    public final h3 f22356f;

    public f3(h3 h3Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10, org.telegram.ui.ActionBar.g6 g6Var2, boolean z10) {
        super(context, g6Var);
        this.f22356f = h3Var;
        this.f22355c = i10;
        this.d = g6Var2;
        this.e = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        h3 h3Var = this.f22356f;
        org.telegram.ui.Components.p6 p6Var = h3Var.f22458x;
        org.telegram.ui.Components.i5 i5Var = h3Var.v;
        if (h3Var.f22457w <= 0) {
            i10 = org.telegram.ui.ActionBar.k6.f21404p7;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.P5;
        }
        p6Var.u(i5Var.a(org.telegram.ui.ActionBar.k6.w0(i10, this.d), false));
        int min = Math.min(AndroidUtilities.dp(52.0f), getHeight());
        h3Var.f22458x.setBounds(getScrollX(), getHeight() - min, AndroidUtilities.dp(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        h3Var.f22458x.draw(canvas);
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        if (!this.e || menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(16908341);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new j61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new j61(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        ?? obj = new Object();
        obj.f29754a |= 8;
        spannableStringBuilder3.setSpan(new r11(obj, 0), 0, spannableStringBuilder3.length(), 33);
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
        h3 h3Var = this.f22356f;
        org.telegram.ui.Components.p6 p6Var = h3Var.f22458x;
        if (p6Var != null && this.f22355c > 0) {
            p6Var.a();
            h3Var.c();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22356f.f22458x && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
