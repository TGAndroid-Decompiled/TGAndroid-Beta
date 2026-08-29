package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ko0 extends Drawable {
    public final org.telegram.ui.Components.zz0 f39974a;
    public final Drawable f39975b;
    public final cg.r1 f39976c;

    public ko0(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        String str;
        if (z10) {
            str = "BoostLevelPlus";
        } else {
            str = "BoostLevel";
        }
        this.f39974a = new org.telegram.ui.Components.zz0(LocaleController.formatPluralString(str, i10, new Object[0]), 12.0f, AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        this.f39975b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.f39976c = new cg.r1(org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, -1, -1, c6Var);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = getBounds().left;
        int centerY = getBounds().centerY();
        RectF rectF = AndroidUtilities.rectTmp;
        float f9 = centerY;
        rectF.set(i10, f9 - (AndroidUtilities.dp(18.33f) / 2.0f), getIntrinsicWidth() + i10, (AndroidUtilities.dp(18.33f) / 2.0f) + f9);
        cg.r1 r1Var = this.f39976c;
        r1Var.e(rectF);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), r1Var.f3319f);
        Drawable drawable = this.f39975b;
        drawable.setBounds(AndroidUtilities.dp(3.33f) + i10, (int) (f9 - ((drawable.getIntrinsicHeight() * 0.875f) / 2.0f)), (int) ((drawable.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(3.33f) + i10), (int) a4.w.d(drawable.getIntrinsicHeight(), 0.875f, 2.0f, f9));
        drawable.draw(canvas);
        this.f39974a.c((drawable.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(3.66f) + i10, f9, 1.0f, -1, canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(18.33f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f39974a.l() + (this.f39975b.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(9.66f));
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
