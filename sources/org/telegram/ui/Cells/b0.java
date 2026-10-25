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
import org.telegram.ui.Components.q11;
public final class b0 extends Drawable {
    public final RectF f23885a = new RectF();
    public final int f23886b;
    public final org.telegram.ui.ActionBar.u6 f23887c;
    public final q11 d;
    public final q11 e;
    public final Drawable f23888f;
    public final Drawable f23889g;
    public int h;
    public int f23890i;
    public final Paint f23891j;

    public b0(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        Paint paint = new Paint(1);
        this.f23891j = paint;
        this.f23886b = i10;
        this.f23887c = u6Var;
        q11 q11Var = new q11(LocaleController.getString(R.string.BotForumAskForStartNewChatTitle), 14.0f, AndroidUtilities.bold());
        this.d = q11Var;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        q11Var.a();
        q11 q11Var2 = new q11("", 13.0f, null);
        this.e = q11Var2;
        q11Var2.n(4);
        q11Var2.a();
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_topic_new_24).mutate();
        this.f23888f = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.arrow_more).mutate();
        this.f23889g = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        mutate2.setAlpha(153);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean c12;
        org.telegram.ui.ActionBar.u6 u6Var = this.f23887c;
        Paint V0 = org.telegram.ui.ActionBar.y6.V0("paintChatActionBackground", u6Var);
        RectF rectF = this.f23885a;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), V0);
        if (u6Var != null) {
            c12 = u6Var.f();
        } else {
            c12 = org.telegram.ui.ActionBar.y6.c1();
        }
        if (c12) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.y6.V0("paintChatActionBackgroundDarken", u6Var));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + AndroidUtilities.dp(17.0f));
        canvas.drawCircle(rectF.centerX(), AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), this.f23891j);
        int centerX = (int) (rectF.centerX() - AndroidUtilities.dp(20.0f));
        int dp = AndroidUtilities.dp(15.0f);
        Drawable drawable = this.f23888f;
        drawable.setBounds(centerX, dp, AndroidUtilities.dp(40.0f) + centerX, AndroidUtilities.dp(40.0f) + dp);
        drawable.draw(canvas);
        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float centerX2 = rectF.centerX();
        q11 q11Var = this.d;
        this.d.c(centerX2 - (q11Var.l() / 2.0f), q11Var.j() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, q11Var.j());
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f));
        float centerX3 = rectF.centerX();
        q11 q11Var2 = this.e;
        this.e.c(centerX3 - (q11Var2.l() / 2.0f), 0.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, q11Var2.j());
        canvas.translate(0.0f, AndroidUtilities.dp(2.0f));
        int centerX4 = (int) (rectF.centerX() + AndroidUtilities.dp(10.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        Drawable drawable2 = this.f23889g;
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
        this.f23885a.set(rect);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
