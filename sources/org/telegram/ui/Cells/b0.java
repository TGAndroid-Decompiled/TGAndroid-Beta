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
import org.telegram.messenger.bd;
import org.telegram.ui.Components.ly0;
public final class b0 extends Drawable {
    public final RectF f28968a = new RectF();
    public final int f28969b;
    public final org.telegram.ui.ActionBar.e6 f28970c;
    public final ly0 d;
    public final ly0 f28971e;
    public final Drawable f28972f;
    public final Drawable f28973g;
    public int h;
    public int f28974i;
    public final Paint f28975j;

    public b0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint(1);
        this.f28975j = paint;
        this.f28969b = i3;
        this.f28970c = e6Var;
        ly0 ly0Var = new ly0(bd.M0(2131753068, null), 14.0f, org.telegram.messenger.g0.o());
        this.d = ly0Var;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        ly0Var.a();
        ly0 ly0Var2 = new ly0("", 13.0f, null);
        this.f28971e = ly0Var2;
        ly0Var2.m(4);
        ly0Var2.a();
        Drawable mutate = context.getResources().getDrawable(2131231177).mutate();
        this.f28972f = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = context.getResources().getDrawable(2131230871).mutate();
        this.f28973g = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        mutate2.setAlpha(153);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean d12;
        org.telegram.ui.ActionBar.e6 e6Var = this.f28970c;
        Paint W0 = org.telegram.ui.ActionBar.k6.W0("paintChatActionBackground", e6Var);
        RectF rectF = this.f28968a;
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), W0);
        if (e6Var != null) {
            d12 = e6Var.g();
        } else {
            d12 = org.telegram.ui.ActionBar.k6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.W0("paintChatActionBackgroundDarken", e6Var));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + org.telegram.messenger.g0.L(17.0f));
        canvas.drawCircle(rectF.centerX(), org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), this.f28975j);
        int centerX = (int) (rectF.centerX() - org.telegram.messenger.g0.L(20.0f));
        int L = org.telegram.messenger.g0.L(15.0f);
        Drawable drawable = this.f28972f;
        drawable.setBounds(centerX, L, org.telegram.messenger.g0.L(40.0f) + centerX, org.telegram.messenger.g0.L(40.0f) + L);
        drawable.draw(canvas);
        canvas.translate(0.0f, org.telegram.messenger.g0.L(70.0f));
        canvas.translate(0.0f, org.telegram.messenger.g0.L(14.0f));
        float centerX2 = rectF.centerX();
        ly0 ly0Var = this.d;
        this.d.c(centerX2 - (ly0Var.k() / 2.0f), ly0Var.i() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, ly0Var.i());
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f));
        float centerX3 = rectF.centerX();
        ly0 ly0Var2 = this.f28971e;
        this.f28971e.c(centerX3 - (ly0Var2.k() / 2.0f), 0.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, ly0Var2.i());
        canvas.translate(0.0f, org.telegram.messenger.g0.L(2.0f));
        int centerX4 = (int) (rectF.centerX() + org.telegram.messenger.g0.L(10.0f));
        int L2 = org.telegram.messenger.g0.L(20.0f);
        Drawable drawable2 = this.f28973g;
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
        this.f28968a.set(rect);
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
