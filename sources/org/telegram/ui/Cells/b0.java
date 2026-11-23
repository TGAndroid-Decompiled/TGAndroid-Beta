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
import org.telegram.ui.Components.xy0;
public final class b0 extends Drawable {
    public final RectF f30409a = new RectF();
    public final int f30410b;
    public final org.telegram.ui.ActionBar.h6 f30411c;
    public final xy0 d;
    public final xy0 f30412e;
    public final Drawable f30413f;
    public final Drawable f30414g;
    public int h;
    public int f30415i;
    public final Paint f30416j;
    public int f30417k;

    public b0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        Paint paint = new Paint(1);
        this.f30416j = paint;
        this.f30410b = i7;
        this.f30411c = h6Var;
        xy0 xy0Var = new xy0(hd.N0(2131753065, null), 14.0f, org.telegram.messenger.g0.o());
        this.d = xy0Var;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        xy0Var.a();
        xy0 xy0Var2 = new xy0("", 13.0f, null);
        this.f30412e = xy0Var2;
        xy0Var2.m(4);
        xy0Var2.a();
        this.f30413f = context.getResources().getDrawable(2131231177).mutate();
        Drawable g10 = i5.c.g(context, 2131230871);
        this.f30414g = g10;
        g10.setAlpha(153);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        boolean d12;
        org.telegram.ui.ActionBar.h6 h6Var = this.f30411c;
        boolean i12 = org.telegram.ui.ActionBar.m6.i1(h6Var);
        int i10 = -1;
        if (i12) {
            i7 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fa, h6Var);
        } else {
            i7 = -1;
        }
        if (i12) {
            i10 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ga, h6Var);
        }
        int i11 = this.f30417k;
        Drawable drawable = this.f30414g;
        Drawable drawable2 = this.f30413f;
        if (i11 != i10 || drawable2.getColorFilter() == null) {
            this.f30417k = i10;
            int i13 = this.f30417k;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable2.setColorFilter(new PorterDuffColorFilter(i13, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(this.f30417k, mode));
        }
        Paint W0 = org.telegram.ui.ActionBar.m6.W0("paintChatActionBackground", h6Var);
        RectF rectF = this.f30409a;
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), W0);
        if (h6Var != null) {
            d12 = h6Var.j();
        } else {
            d12 = org.telegram.ui.ActionBar.m6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.m6.W0("paintChatActionBackgroundDarken", h6Var));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + org.telegram.messenger.g0.L(17.0f));
        canvas.drawCircle(rectF.centerX(), org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), this.f30416j);
        int centerX = (int) (rectF.centerX() - org.telegram.messenger.g0.L(20.0f));
        int L = org.telegram.messenger.g0.L(15.0f);
        drawable2.setBounds(centerX, L, org.telegram.messenger.g0.L(40.0f) + centerX, org.telegram.messenger.g0.L(40.0f) + L);
        drawable2.draw(canvas);
        canvas.translate(0.0f, org.telegram.messenger.g0.L(70.0f));
        canvas.translate(0.0f, org.telegram.messenger.g0.L(14.0f));
        float centerX2 = rectF.centerX();
        xy0 xy0Var = this.d;
        this.d.c(centerX2 - (xy0Var.k() / 2.0f), xy0Var.i() / 2.0f, 1.0f, i7, canvas);
        canvas.translate(0.0f, xy0Var.i());
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f));
        float centerX3 = rectF.centerX();
        xy0 xy0Var2 = this.f30412e;
        this.f30412e.c(centerX3 - (xy0Var2.k() / 2.0f), 0.0f, 1.0f, i7, canvas);
        canvas.translate(0.0f, xy0Var2.i());
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
        this.f30409a.set(rect);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
