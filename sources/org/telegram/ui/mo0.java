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

public final class mo0 extends Drawable {

    public final org.telegram.ui.Components.pz0 f40554a;

    public final Drawable f40555b;

    public final ag.i2 f40556c;

    public mo0(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this.f40554a = new org.telegram.ui.Components.pz0(LocaleController.formatPluralString(z10 ? "BoostLevelPlus" : "BoostLevel", i10, new Object[0]), 12.0f, AndroidUtilities.bold());
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        this.f40555b = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.f40556c = new ag.i2(org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, -1, -1, c6Var);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = getBounds().left;
        int iCenterY = getBounds().centerY();
        RectF rectF = AndroidUtilities.rectTmp;
        float f10 = iCenterY;
        rectF.set(i10, f10 - (AndroidUtilities.dp(18.33f) / 2.0f), getIntrinsicWidth() + i10, (AndroidUtilities.dp(18.33f) / 2.0f) + f10);
        ag.i2 i2Var = this.f40556c;
        i2Var.e(rectF);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), i2Var.f458f);
        int iDp = AndroidUtilities.dp(3.33f) + i10;
        Drawable drawable = this.f40555b;
        drawable.setBounds(iDp, (int) (f10 - ((drawable.getIntrinsicHeight() * 0.875f) / 2.0f)), (int) ((drawable.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(3.33f) + i10), (int) a9.p.d(drawable.getIntrinsicHeight(), 0.875f, 2.0f, f10));
        drawable.draw(canvas);
        this.f40554a.c((drawable.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(3.66f) + i10, f10, 1.0f, -1, canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(18.33f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f40554a.l() + (this.f40555b.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(9.66f));
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
