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
import org.telegram.ui.Components.e11;
public final class c0 extends Drawable {
    public final RectF f22072a = new RectF();
    public final int f22073b;
    public final org.telegram.ui.ActionBar.d6 f22074c;
    public final e11 d;
    public final e11 e;
    public final Drawable f22075f;
    public final Drawable f22076g;
    public int h;
    public int f22077i;
    public final Paint f22078j;

    public c0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint(1);
        this.f22078j = paint;
        this.f22073b = i10;
        this.f22074c = d6Var;
        e11 e11Var = new e11(LocaleController.getString(R.string.BotForumAskForStartNewChatTitle), 14.0f, AndroidUtilities.bold());
        this.d = e11Var;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        e11Var.a();
        e11 e11Var2 = new e11("", 13.0f, null);
        this.e = e11Var2;
        e11Var2.n(4);
        e11Var2.a();
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_topic_new_24).mutate();
        this.f22075f = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.arrow_more).mutate();
        this.f22076g = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        mutate2.setAlpha(153);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean b12;
        org.telegram.ui.ActionBar.d6 d6Var = this.f22074c;
        Paint U0 = org.telegram.ui.ActionBar.h6.U0("paintChatActionBackground", d6Var);
        RectF rectF = this.f22072a;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), U0);
        if (d6Var != null) {
            b12 = d6Var.s();
        } else {
            b12 = org.telegram.ui.ActionBar.h6.b1();
        }
        if (b12) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.h6.U0("paintChatActionBackgroundDarken", d6Var));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + AndroidUtilities.dp(17.0f));
        canvas.drawCircle(rectF.centerX(), AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), this.f22078j);
        int centerX = (int) (rectF.centerX() - AndroidUtilities.dp(20.0f));
        int dp = AndroidUtilities.dp(15.0f);
        Drawable drawable = this.f22075f;
        drawable.setBounds(centerX, dp, AndroidUtilities.dp(40.0f) + centerX, AndroidUtilities.dp(40.0f) + dp);
        drawable.draw(canvas);
        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float centerX2 = rectF.centerX();
        e11 e11Var = this.d;
        this.d.c(centerX2 - (e11Var.l() / 2.0f), e11Var.j() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, e11Var.j());
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f));
        float centerX3 = rectF.centerX();
        e11 e11Var2 = this.e;
        this.e.c(centerX3 - (e11Var2.l() / 2.0f), 0.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, e11Var2.j());
        canvas.translate(0.0f, AndroidUtilities.dp(2.0f));
        int centerX4 = (int) (rectF.centerX() + AndroidUtilities.dp(10.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        Drawable drawable2 = this.f22076g;
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
        this.f22072a.set(rect);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
