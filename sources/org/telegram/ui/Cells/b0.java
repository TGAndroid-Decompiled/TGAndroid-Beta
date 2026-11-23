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
import org.telegram.ui.Components.wy0;
public final class b0 extends Drawable {
    public final RectF f30497a = new RectF();
    public final int f30498b;
    public final org.telegram.ui.ActionBar.i6 f30499c;
    public final wy0 d;
    public final wy0 f30500e;
    public final Drawable f30501f;
    public final Drawable f30502g;
    public int h;
    public int f30503i;
    public final Paint f30504j;
    public int f30505k;

    public b0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        Paint paint = new Paint(1);
        this.f30504j = paint;
        this.f30498b = i7;
        this.f30499c = i6Var;
        wy0 wy0Var = new wy0(gd.N0(2131753065, null), 14.0f, org.telegram.messenger.g0.o());
        this.d = wy0Var;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        wy0Var.a();
        wy0 wy0Var2 = new wy0("", 13.0f, null);
        this.f30500e = wy0Var2;
        wy0Var2.m(4);
        wy0Var2.a();
        this.f30501f = context.getResources().getDrawable(2131231179).mutate();
        Drawable g10 = i5.c.g(context, 2131230871);
        this.f30502g = g10;
        g10.setAlpha(153);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        boolean d12;
        org.telegram.ui.ActionBar.i6 i6Var = this.f30499c;
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
        int i11 = this.f30505k;
        Drawable drawable = this.f30502g;
        Drawable drawable2 = this.f30501f;
        if (i11 != i10 || drawable2.getColorFilter() == null) {
            this.f30505k = i10;
            int i13 = this.f30505k;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable2.setColorFilter(new PorterDuffColorFilter(i13, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(this.f30505k, mode));
        }
        Paint W0 = org.telegram.ui.ActionBar.n6.W0("paintChatActionBackground", i6Var);
        RectF rectF = this.f30497a;
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), W0);
        if (i6Var != null) {
            d12 = i6Var.h();
        } else {
            d12 = org.telegram.ui.ActionBar.n6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.n6.W0("paintChatActionBackgroundDarken", i6Var));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + org.telegram.messenger.g0.L(17.0f));
        canvas.drawCircle(rectF.centerX(), org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), this.f30504j);
        int centerX = (int) (rectF.centerX() - org.telegram.messenger.g0.L(20.0f));
        int L = org.telegram.messenger.g0.L(15.0f);
        drawable2.setBounds(centerX, L, org.telegram.messenger.g0.L(40.0f) + centerX, org.telegram.messenger.g0.L(40.0f) + L);
        drawable2.draw(canvas);
        canvas.translate(0.0f, org.telegram.messenger.g0.L(70.0f));
        canvas.translate(0.0f, org.telegram.messenger.g0.L(14.0f));
        float centerX2 = rectF.centerX();
        wy0 wy0Var = this.d;
        this.d.c(centerX2 - (wy0Var.k() / 2.0f), wy0Var.i() / 2.0f, 1.0f, i7, canvas);
        canvas.translate(0.0f, wy0Var.i());
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f));
        float centerX3 = rectF.centerX();
        wy0 wy0Var2 = this.f30500e;
        this.f30500e.c(centerX3 - (wy0Var2.k() / 2.0f), 0.0f, 1.0f, i7, canvas);
        canvas.translate(0.0f, wy0Var2.i());
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
        this.f30497a.set(rect);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
