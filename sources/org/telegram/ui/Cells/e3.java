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
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.yz0;

public final class e3 extends lt {

    public final int f24257c;
    public final org.telegram.ui.ActionBar.c6 d;

    public final boolean f24258e;

    public final g3 f24259f;

    public e3(g3 g3Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, org.telegram.ui.ActionBar.c6 c6Var2, boolean z10) {
        super(context, c6Var);
        this.f24259f = g3Var;
        this.f24257c = i10;
        this.d = c6Var2;
        this.f24258e = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        g3 g3Var = this.f24259f;
        g3Var.v.r(g3Var.f24375r.a(org.telegram.ui.ActionBar.g6.v0(g3Var.f24376s <= 0 ? org.telegram.ui.ActionBar.g6.f23269p7 : org.telegram.ui.ActionBar.g6.P5, this.d), false));
        g3Var.v.setBounds(getScrollX(), getHeight() - Math.min(AndroidUtilities.dp(52.0f), getHeight()), AndroidUtilities.dp(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        g3Var.v.draw(canvas);
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        if (this.f24258e && menu.findItem(R.id.menu_bold) == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                menu.removeItem(16908341);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
            spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
            spannableStringBuilder2.setSpan(new k41(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
            xz0 xz0Var = new xz0();
            xz0Var.f34734a |= 8;
            spannableStringBuilder3.setSpan(new yz0(xz0Var, 0), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 8, spannableStringBuilder3);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, LocaleController.getString(R.string.Regular));
        }
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
        g3 g3Var = this.f24259f;
        org.telegram.ui.Components.i6 i6Var = g3Var.v;
        if (i6Var == null || this.f24257c <= 0) {
            return;
        }
        i6Var.b();
        g3Var.c();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f24259f.v || super.verifyDrawable(drawable);
    }
}
