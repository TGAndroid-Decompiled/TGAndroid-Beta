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
import org.telegram.messenger.dd;
import org.telegram.ui.Components.rz0;
public final class b0 extends Drawable {
    public final RectF f21701a = new RectF();
    public final int f21702b;
    public final org.telegram.ui.ActionBar.p6 f21703c;
    public final rz0 d;
    public final rz0 e;
    public final Drawable f21704f;
    public final Drawable f21705g;
    public int h;
    public int f21706i;
    public final Paint f21707j;

    public b0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        Paint paint = new Paint(1);
        this.f21707j = paint;
        this.f21702b = i10;
        this.f21703c = p6Var;
        rz0 rz0Var = new rz0(dd.L0(2131753068, null), 14.0f, org.telegram.messenger.i0.o());
        this.d = rz0Var;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        rz0Var.a();
        rz0 rz0Var2 = new rz0("", 13.0f, null);
        this.e = rz0Var2;
        rz0Var2.m(4);
        rz0Var2.a();
        Drawable mutate = context.getResources().getDrawable(2131231177).mutate();
        this.f21704f = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = context.getResources().getDrawable(2131230871).mutate();
        this.f21705g = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        mutate2.setAlpha(153);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean d12;
        org.telegram.ui.ActionBar.p6 p6Var = this.f21703c;
        Paint W0 = org.telegram.ui.ActionBar.t6.W0("paintChatActionBackground", p6Var);
        RectF rectF = this.f21701a;
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), W0);
        if (p6Var != null) {
            d12 = p6Var.g();
        } else {
            d12 = org.telegram.ui.ActionBar.t6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.ui.ActionBar.t6.W0("paintChatActionBackgroundDarken", p6Var));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + org.telegram.messenger.i0.L(17.0f));
        canvas.drawCircle(rectF.centerX(), org.telegram.messenger.i0.L(35.0f), org.telegram.messenger.i0.L(35.0f), this.f21707j);
        int centerX = (int) (rectF.centerX() - org.telegram.messenger.i0.L(20.0f));
        int L = org.telegram.messenger.i0.L(15.0f);
        Drawable drawable = this.f21704f;
        drawable.setBounds(centerX, L, org.telegram.messenger.i0.L(40.0f) + centerX, org.telegram.messenger.i0.L(40.0f) + L);
        drawable.draw(canvas);
        canvas.translate(0.0f, org.telegram.messenger.i0.L(70.0f));
        canvas.translate(0.0f, org.telegram.messenger.i0.L(14.0f));
        float centerX2 = rectF.centerX();
        rz0 rz0Var = this.d;
        this.d.c(centerX2 - (rz0Var.k() / 2.0f), rz0Var.i() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, rz0Var.i());
        canvas.translate(0.0f, org.telegram.messenger.i0.L(4.0f));
        float centerX3 = rectF.centerX();
        rz0 rz0Var2 = this.e;
        this.e.c(centerX3 - (rz0Var2.k() / 2.0f), 0.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, rz0Var2.i());
        canvas.translate(0.0f, org.telegram.messenger.i0.L(2.0f));
        int centerX4 = (int) (rectF.centerX() + org.telegram.messenger.i0.L(10.0f));
        int L2 = org.telegram.messenger.i0.L(20.0f);
        Drawable drawable2 = this.f21705g;
        drawable2.setBounds((int) (rectF.centerX() - org.telegram.messenger.i0.L(10.0f)), 0, centerX4, L2);
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
        this.f21701a.set(rect);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
