package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.zz0;
public final class c0 extends Drawable {
    public final RectF f24139a = new RectF();
    public final int f24140b;
    public final org.telegram.ui.ActionBar.c6 f24141c;
    public final zz0 d;
    public final zz0 f24142e;
    public final Drawable f24143f;
    public final Drawable f24144g;
    public int h;
    public int f24145i;
    public final Paint f24146j;

    public c0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint(1);
        this.f24146j = paint;
        this.f24140b = i10;
        this.f24141c = c6Var;
        zz0 zz0Var = new zz0(LocaleController.getString(R.string.BotForumAskForStartNewChatTitle), 14.0f, AndroidUtilities.bold());
        this.d = zz0Var;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        zz0Var.a();
        zz0 zz0Var2 = new zz0("", 13.0f, null);
        this.f24142e = zz0Var2;
        zz0Var2.n(4);
        zz0Var2.a();
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_topic_new_24).mutate();
        this.f24143f = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.arrow_more).mutate();
        this.f24144g = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        mutate2.setAlpha(153);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean a12;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24141c;
        Paint T0 = org.telegram.ui.ActionBar.g6.T0("paintChatActionBackground", c6Var);
        RectF rectF = this.f24139a;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), T0);
        if (c6Var != null) {
            a12 = c6Var.l0();
        } else {
            a12 = org.telegram.ui.ActionBar.g6.a1();
        }
        if (a12) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.T0("paintChatActionBackgroundDarken", c6Var));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + AndroidUtilities.dp(17.0f));
        canvas.drawCircle(rectF.centerX(), AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), this.f24146j);
        int centerX = (int) (rectF.centerX() - AndroidUtilities.dp(20.0f));
        int dp = AndroidUtilities.dp(15.0f);
        Drawable drawable = this.f24143f;
        drawable.setBounds(centerX, dp, AndroidUtilities.dp(40.0f) + centerX, AndroidUtilities.dp(40.0f) + dp);
        drawable.draw(canvas);
        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float centerX2 = rectF.centerX();
        zz0 zz0Var = this.d;
        this.d.c(centerX2 - (zz0Var.l() / 2.0f), zz0Var.j() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, zz0Var.j());
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f));
        float centerX3 = rectF.centerX();
        zz0 zz0Var2 = this.f24142e;
        this.f24142e.c(centerX3 - (zz0Var2.l() / 2.0f), 0.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, zz0Var2.j());
        canvas.translate(0.0f, AndroidUtilities.dp(2.0f));
        int centerX4 = (int) (rectF.centerX() + AndroidUtilities.dp(10.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        Drawable drawable2 = this.f24144g;
        drawable2.setBounds((int) (rectF.centerX() - AndroidUtilities.dp(10.0f)), 0, centerX4, dp2);
        drawable2.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f24139a.set(rect);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
