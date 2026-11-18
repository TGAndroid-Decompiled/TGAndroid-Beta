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
import org.telegram.messenger.gd;
import org.telegram.ui.Components.vy0;
public final class b0 extends Drawable {
    public final RectF f30415a = new RectF();
    public final int f30416b;
    public final org.telegram.ui.ActionBar.i6 f30417c;
    public final vy0 d;
    public final vy0 f30418e;
    public final Drawable f30419f;
    public final Drawable f30420g;
    public int h;
    public int f30421i;
    public final Paint f30422j;
    public int f30423k;

    public b0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        Paint paint = new Paint(1);
        this.f30422j = paint;
        this.f30416b = i7;
        this.f30417c = i6Var;
        vy0 vy0Var = new vy0(gd.M0(2131753066, null), 14.0f, org.telegram.messenger.g0.o());
        this.d = vy0Var;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        vy0Var.a();
        vy0 vy0Var2 = new vy0("", 13.0f, null);
        this.f30418e = vy0Var2;
        vy0Var2.m(4);
        vy0Var2.a();
        this.f30419f = context.getResources().getDrawable(2131231177).mutate();
        Drawable g10 = i5.c.g(context, 2131230871);
        this.f30420g = g10;
        g10.setAlpha(153);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        boolean d12;
        org.telegram.ui.ActionBar.i6 i6Var = this.f30417c;
        boolean i12 = org.telegram.ui.ActionBar.n6.i1(i6Var);
        int i10 = -1;
        if (i12) {
            i7 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fa, i6Var);
        } else {
            i7 = -1;
        }
        if (i12) {
            i10 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ga, i6Var);
        }
        int i11 = this.f30423k;
        Drawable drawable = this.f30420g;
        Drawable drawable2 = this.f30419f;
        if (i11 != i10 || drawable2.getColorFilter() == null) {
            this.f30423k = i10;
            int i13 = this.f30423k;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable2.setColorFilter(new PorterDuffColorFilter(i13, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(this.f30423k, mode));
        }
        Paint W0 = org.telegram.ui.ActionBar.n6.W0("paintChatActionBackground", i6Var);
        RectF rectF = this.f30415a;
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), W0);
        if (i6Var != null) {
            d12 = i6Var.j();
        } else {
            d12 = org.telegram.ui.ActionBar.n6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.n6.W0("paintChatActionBackgroundDarken", i6Var));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + org.telegram.messenger.g0.L(17.0f));
        canvas.drawCircle(rectF.centerX(), org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), this.f30422j);
        int centerX = (int) (rectF.centerX() - org.telegram.messenger.g0.L(20.0f));
        int L = org.telegram.messenger.g0.L(15.0f);
        drawable2.setBounds(centerX, L, org.telegram.messenger.g0.L(40.0f) + centerX, org.telegram.messenger.g0.L(40.0f) + L);
        drawable2.draw(canvas);
        canvas.translate(0.0f, org.telegram.messenger.g0.L(70.0f));
        canvas.translate(0.0f, org.telegram.messenger.g0.L(14.0f));
        float centerX2 = rectF.centerX();
        vy0 vy0Var = this.d;
        this.d.c(centerX2 - (vy0Var.k() / 2.0f), vy0Var.i() / 2.0f, 1.0f, i7, canvas);
        canvas.translate(0.0f, vy0Var.i());
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f));
        float centerX3 = rectF.centerX();
        vy0 vy0Var2 = this.f30418e;
        this.f30418e.c(centerX3 - (vy0Var2.k() / 2.0f), 0.0f, 1.0f, i7, canvas);
        canvas.translate(0.0f, vy0Var2.i());
        canvas.translate(0.0f, org.telegram.messenger.g0.L(2.0f));
        drawable.setBounds((int) (rectF.centerX() - org.telegram.messenger.g0.L(10.0f)), 0, (int) (rectF.centerX() + org.telegram.messenger.g0.L(10.0f)), org.telegram.messenger.g0.L(20.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f30415a.set(rect);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
