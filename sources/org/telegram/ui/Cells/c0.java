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
import org.telegram.ui.Components.nz0;
public final class c0 extends Drawable {
    public final RectF f24172a = new RectF();
    public final int f24173b;
    public final org.telegram.ui.ActionBar.b6 f24174c;
    public final nz0 d;
    public final nz0 f24175e;
    public final Drawable f24176f;
    public final Drawable f24177g;
    public int h;
    public int f24178i;
    public final Paint f24179j;

    public c0(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        Paint paint = new Paint(1);
        this.f24179j = paint;
        this.f24173b = i9;
        this.f24174c = b6Var;
        nz0 nz0Var = new nz0(LocaleController.getString(R.string.BotForumAskForStartNewChatTitle), 14.0f, AndroidUtilities.bold());
        this.d = nz0Var;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        nz0Var.a();
        nz0 nz0Var2 = new nz0("", 13.0f, null);
        this.f24175e = nz0Var2;
        nz0Var2.n(4);
        nz0Var2.a();
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_topic_new_24).mutate();
        this.f24176f = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.arrow_more).mutate();
        this.f24177g = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        mutate2.setAlpha(153);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean a12;
        org.telegram.ui.ActionBar.b6 b6Var = this.f24174c;
        Paint T0 = org.telegram.ui.ActionBar.f6.T0("paintChatActionBackground", b6Var);
        RectF rectF = this.f24172a;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), T0);
        if (b6Var != null) {
            a12 = b6Var.t0();
        } else {
            a12 = org.telegram.ui.ActionBar.f6.a1();
        }
        if (a12) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.f6.T0("paintChatActionBackgroundDarken", b6Var));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + AndroidUtilities.dp(17.0f));
        canvas.drawCircle(rectF.centerX(), AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), this.f24179j);
        int centerX = (int) (rectF.centerX() - AndroidUtilities.dp(20.0f));
        int dp = AndroidUtilities.dp(15.0f);
        Drawable drawable = this.f24176f;
        drawable.setBounds(centerX, dp, AndroidUtilities.dp(40.0f) + centerX, AndroidUtilities.dp(40.0f) + dp);
        drawable.draw(canvas);
        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float centerX2 = rectF.centerX();
        nz0 nz0Var = this.d;
        this.d.c(centerX2 - (nz0Var.l() / 2.0f), nz0Var.j() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, nz0Var.j());
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f));
        float centerX3 = rectF.centerX();
        nz0 nz0Var2 = this.f24175e;
        this.f24175e.c(centerX3 - (nz0Var2.l() / 2.0f), 0.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, nz0Var2.j());
        canvas.translate(0.0f, AndroidUtilities.dp(2.0f));
        int centerX4 = (int) (rectF.centerX() + AndroidUtilities.dp(10.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        Drawable drawable2 = this.f24177g;
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
        this.f24172a.set(rect);
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
