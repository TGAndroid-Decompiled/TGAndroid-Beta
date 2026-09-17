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
import org.telegram.ui.Components.f01;
public final class c0 extends Drawable {
    public final RectF f21665a = new RectF();
    public final int f21666b;
    public final org.telegram.ui.ActionBar.f6 f21667c;
    public final f01 d;
    public final f01 f21668e;
    public final Drawable f21669f;
    public final Drawable f21670g;
    public int h;
    public int f21671i;
    public final Paint f21672j;

    public c0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.f21672j = paint;
        this.f21666b = i10;
        this.f21667c = f6Var;
        f01 f01Var = new f01(LocaleController.getString(R.string.BotForumAskForStartNewChatTitle), 14.0f, AndroidUtilities.bold());
        this.d = f01Var;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        f01Var.a();
        f01 f01Var2 = new f01("", 13.0f, null);
        this.f21668e = f01Var2;
        f01Var2.n(4);
        f01Var2.a();
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_topic_new_24).mutate();
        this.f21669f = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.arrow_more).mutate();
        this.f21670g = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        mutate2.setAlpha(153);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean a12;
        org.telegram.ui.ActionBar.f6 f6Var = this.f21667c;
        Paint T0 = org.telegram.ui.ActionBar.j6.T0("paintChatActionBackground", f6Var);
        RectF rectF = this.f21665a;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), T0);
        if (f6Var != null) {
            a12 = f6Var.o0();
        } else {
            a12 = org.telegram.ui.ActionBar.j6.a1();
        }
        if (a12) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.T0("paintChatActionBackgroundDarken", f6Var));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + AndroidUtilities.dp(17.0f));
        canvas.drawCircle(rectF.centerX(), AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), this.f21672j);
        int centerX = (int) (rectF.centerX() - AndroidUtilities.dp(20.0f));
        int dp = AndroidUtilities.dp(15.0f);
        Drawable drawable = this.f21669f;
        drawable.setBounds(centerX, dp, AndroidUtilities.dp(40.0f) + centerX, AndroidUtilities.dp(40.0f) + dp);
        drawable.draw(canvas);
        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float centerX2 = rectF.centerX();
        f01 f01Var = this.d;
        this.d.c(centerX2 - (f01Var.l() / 2.0f), f01Var.j() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, f01Var.j());
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f));
        float centerX3 = rectF.centerX();
        f01 f01Var2 = this.f21668e;
        this.f21668e.c(centerX3 - (f01Var2.l() / 2.0f), 0.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, f01Var2.j());
        canvas.translate(0.0f, AndroidUtilities.dp(2.0f));
        int centerX4 = (int) (rectF.centerX() + AndroidUtilities.dp(10.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        Drawable drawable2 = this.f21670g;
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
        this.f21665a.set(rect);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
