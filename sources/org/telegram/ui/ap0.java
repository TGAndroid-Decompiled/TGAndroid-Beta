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
public final class ap0 extends Drawable {
    public final org.telegram.ui.Components.q11 f37869a;
    public final Drawable f37870b;
    public final tg.a1 f37871c;

    public ap0(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        String str;
        if (z10) {
            str = "BoostLevelPlus";
        } else {
            str = "BoostLevel";
        }
        this.f37869a = new org.telegram.ui.Components.q11(LocaleController.formatPluralString(str, i10, new Object[0]), 12.0f, AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        this.f37870b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.f37871c = new tg.a1(org.telegram.ui.ActionBar.y6.Lj, org.telegram.ui.ActionBar.y6.Mj, -1, -1, u6Var);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = getBounds().left;
        int centerY = getBounds().centerY();
        RectF rectF = AndroidUtilities.rectTmp;
        float f7 = centerY;
        rectF.set(i10, f7 - (AndroidUtilities.dp(18.33f) / 2.0f), getIntrinsicWidth() + i10, (AndroidUtilities.dp(18.33f) / 2.0f) + f7);
        tg.a1 a1Var = this.f37871c;
        a1Var.e(rectF);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), a1Var.f48794f);
        Drawable drawable = this.f37870b;
        drawable.setBounds(AndroidUtilities.dp(3.33f) + i10, (int) (f7 - ((drawable.getIntrinsicHeight() * 0.875f) / 2.0f)), (int) ((drawable.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(3.33f) + i10), (int) a1.g.C(drawable.getIntrinsicHeight(), 0.875f, 2.0f, f7));
        drawable.draw(canvas);
        this.f37869a.c((drawable.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(3.66f) + i10, f7, 1.0f, -1, canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(18.33f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f37869a.l() + (this.f37870b.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(9.66f));
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
