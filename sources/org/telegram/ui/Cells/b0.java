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
import org.telegram.messenger.hd;
import org.telegram.ui.Components.oy0;
public final class b0 extends Drawable {
    public final RectF f30027a = new RectF();
    public final int f30028b;
    public final org.telegram.ui.ActionBar.e6 f30029c;
    public final oy0 d;
    public final oy0 f30030e;
    public final Drawable f30031f;
    public final Drawable f30032g;
    public int h;
    public int f30033i;
    public final Paint f30034j;

    public b0(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint(1);
        this.f30034j = paint;
        this.f30028b = i7;
        this.f30029c = e6Var;
        oy0 oy0Var = new oy0(hd.M0(2131753068, null), 14.0f, org.telegram.messenger.g0.o());
        this.d = oy0Var;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        oy0Var.a();
        oy0 oy0Var2 = new oy0("", 13.0f, null);
        this.f30030e = oy0Var2;
        oy0Var2.m(4);
        oy0Var2.a();
        Drawable mutate = context.getResources().getDrawable(2131231177).mutate();
        this.f30031f = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = context.getResources().getDrawable(2131230871).mutate();
        this.f30032g = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        mutate2.setAlpha(153);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean d12;
        org.telegram.ui.ActionBar.e6 e6Var = this.f30029c;
        Paint W0 = org.telegram.ui.ActionBar.j6.W0("paintChatActionBackground", e6Var);
        RectF rectF = this.f30027a;
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), W0);
        if (e6Var != null) {
            d12 = e6Var.g();
        } else {
            d12 = org.telegram.ui.ActionBar.j6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.j6.W0("paintChatActionBackgroundDarken", e6Var));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + org.telegram.messenger.g0.L(17.0f));
        canvas.drawCircle(rectF.centerX(), org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), this.f30034j);
        int centerX = (int) (rectF.centerX() - org.telegram.messenger.g0.L(20.0f));
        int L = org.telegram.messenger.g0.L(15.0f);
        Drawable drawable = this.f30031f;
        drawable.setBounds(centerX, L, org.telegram.messenger.g0.L(40.0f) + centerX, org.telegram.messenger.g0.L(40.0f) + L);
        drawable.draw(canvas);
        canvas.translate(0.0f, org.telegram.messenger.g0.L(70.0f));
        canvas.translate(0.0f, org.telegram.messenger.g0.L(14.0f));
        float centerX2 = rectF.centerX();
        oy0 oy0Var = this.d;
        this.d.c(centerX2 - (oy0Var.k() / 2.0f), oy0Var.i() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, oy0Var.i());
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f));
        float centerX3 = rectF.centerX();
        oy0 oy0Var2 = this.f30030e;
        this.f30030e.c(centerX3 - (oy0Var2.k() / 2.0f), 0.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, oy0Var2.i());
        canvas.translate(0.0f, org.telegram.messenger.g0.L(2.0f));
        int centerX4 = (int) (rectF.centerX() + org.telegram.messenger.g0.L(10.0f));
        int L2 = org.telegram.messenger.g0.L(20.0f);
        Drawable drawable2 = this.f30032g;
        drawable2.setBounds((int) (rectF.centerX() - org.telegram.messenger.g0.L(10.0f)), 0, centerX4, L2);
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
        this.f30027a.set(rect);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
