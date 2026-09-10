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
public final class jp0 extends Drawable {
    public final org.telegram.ui.Components.t01 f34146a;
    public final Drawable f34147b;
    public final qg.c1 f34148c;

    public jp0(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        String str;
        if (z10) {
            str = "BoostLevelPlus";
        } else {
            str = "BoostLevel";
        }
        this.f34146a = new org.telegram.ui.Components.t01(LocaleController.formatPluralString(str, i10, new Object[0]), 12.0f, AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        this.f34147b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.f34148c = new qg.c1(org.telegram.ui.ActionBar.j6.Lj, org.telegram.ui.ActionBar.j6.Mj, -1, -1, f6Var);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = getBounds().left;
        int centerY = getBounds().centerY();
        RectF rectF = AndroidUtilities.rectTmp;
        float f7 = centerY;
        rectF.set(i10, f7 - (AndroidUtilities.dp(18.33f) / 2.0f), getIntrinsicWidth() + i10, (AndroidUtilities.dp(18.33f) / 2.0f) + f7);
        qg.c1 c1Var = this.f34148c;
        c1Var.e(rectF);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), c1Var.f40690f);
        Drawable drawable = this.f34147b;
        drawable.setBounds(AndroidUtilities.dp(3.33f) + i10, (int) (f7 - ((drawable.getIntrinsicHeight() * 0.875f) / 2.0f)), (int) ((drawable.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(3.33f) + i10), (int) a4.a.A(drawable.getIntrinsicHeight(), 0.875f, 2.0f, f7));
        drawable.draw(canvas);
        this.f34146a.c((drawable.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(3.66f) + i10, f7, 1.0f, -1, canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(18.33f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f34146a.l() + (this.f34147b.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(9.66f));
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
