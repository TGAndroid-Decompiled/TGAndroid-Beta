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
import org.telegram.ui.Components.pz0;

public final class c0 extends Drawable {

    public final RectF f24141a = new RectF();

    public final int f24142b;

    public final org.telegram.ui.ActionBar.c6 f24143c;
    public final pz0 d;

    public final pz0 f24144e;

    public final Drawable f24145f;

    public final Drawable f24146g;
    public int h;

    public int f24147i;

    public final Paint f24148j;

    public c0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint(1);
        this.f24148j = paint;
        this.f24142b = i10;
        this.f24143c = c6Var;
        pz0 pz0Var = new pz0(LocaleController.getString(R.string.BotForumAskForStartNewChatTitle), 14.0f, AndroidUtilities.bold());
        this.d = pz0Var;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        pz0Var.a();
        pz0 pz0Var2 = new pz0("", 13.0f, null);
        this.f24144e = pz0Var2;
        pz0Var2.n(4);
        pz0Var2.a();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.filled_topic_new_24).mutate();
        this.f24145f = drawableMutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.arrow_more).mutate();
        this.f24146g = drawableMutate2;
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableMutate2.setAlpha(153);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override
    public final void draw(Canvas canvas) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f24143c;
        Paint paintT0 = org.telegram.ui.ActionBar.g6.T0("paintChatActionBackground", c6Var);
        float fDp = AndroidUtilities.dp(16.0f);
        float fDp2 = AndroidUtilities.dp(16.0f);
        RectF rectF = this.f24141a;
        canvas.drawRoundRect(rectF, fDp, fDp2, paintT0);
        if (c6Var != null ? c6Var.u0() : org.telegram.ui.ActionBar.g6.a1()) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.T0("paintChatActionBackgroundDarken", c6Var));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + AndroidUtilities.dp(17.0f));
        canvas.drawCircle(rectF.centerX(), AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), this.f24148j);
        int iCenterX = (int) (rectF.centerX() - AndroidUtilities.dp(20.0f));
        int iDp = AndroidUtilities.dp(15.0f);
        int iDp2 = AndroidUtilities.dp(40.0f) + iCenterX;
        int iDp3 = AndroidUtilities.dp(40.0f) + iDp;
        Drawable drawable = this.f24145f;
        drawable.setBounds(iCenterX, iDp, iDp2, iDp3);
        drawable.draw(canvas);
        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float fCenterX = rectF.centerX();
        pz0 pz0Var = this.d;
        this.d.c(fCenterX - (pz0Var.l() / 2.0f), pz0Var.j() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, pz0Var.j());
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f));
        float fCenterX2 = rectF.centerX();
        pz0 pz0Var2 = this.f24144e;
        this.f24144e.c(fCenterX2 - (pz0Var2.l() / 2.0f), 0.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, pz0Var2.j());
        canvas.translate(0.0f, AndroidUtilities.dp(2.0f));
        int iCenterX2 = (int) (rectF.centerX() - AndroidUtilities.dp(10.0f));
        int iCenterX3 = (int) (rectF.centerX() + AndroidUtilities.dp(10.0f));
        int iDp4 = AndroidUtilities.dp(20.0f);
        Drawable drawable2 = this.f24146g;
        drawable2.setBounds(iCenterX2, 0, iCenterX3, iDp4);
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
        this.f24141a.set(rect);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
