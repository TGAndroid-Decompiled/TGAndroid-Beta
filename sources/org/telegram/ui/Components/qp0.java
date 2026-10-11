package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class qp0 extends Drawable {
    public final boolean f30276a;
    public final Runnable f30277b;
    public final Paint f30278c = new Paint(1);
    public final Paint d;
    public dk0 f30279e;
    public final Path f30280f;
    public final m11 f30281g;
    public final Path h;
    public final Path f30282i;
    public boolean f30283j;
    public int f30284k;
    public final g6 f30285l;
    public final g6 f30286m;
    public final g6 f30287n;
    public final g6 f30288o;
    public final pp0 f30289p;
    public boolean f30290q;
    public final RectF f30291r;
    public final RectF f30292s;
    public float f30293t;
    public long f30294u;
    public float v;
    public boolean f30295w;
    public final yc0 f30296x;

    public qp0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f30280f = path;
        this.f30281g = new m11(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f30282i = path3;
        this.f30284k = 1;
        this.f30291r = new RectF();
        this.f30292s = new RectF();
        this.f30296x = new yc0(this, 28);
        this.f30277b = runnable;
        this.f30276a = z10;
        is isVar = is.h;
        g6 g6Var = new g6(runnable, 360L, isVar, 0);
        this.f30285l = g6Var;
        g6Var.d(0.0f, true);
        this.f30286m = new g6(runnable, 320L, isVar, 0);
        this.f30287n = new g6(runnable, 200L, isVar, 0);
        g6 g6Var2 = new g6(runnable, 360L, isVar, 0);
        this.f30288o = g6Var2;
        g6Var2.d(0.0f, true);
        pp0 pp0Var = new pp0(runnable);
        this.f30289p = pp0Var;
        pp0Var.A = 0.3f;
        pp0Var.m(0.4f, 650L, 1.6f, isVar);
        pp0Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        pp0Var.w(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        pp0Var.u(-1);
        pp0Var.f30134b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f30290q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f30283j && this.f30285l.f26665c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f30283j = z10;
        this.f30277b.run();
        dk0 dk0Var = this.f30279e;
        if (dk0Var != null && this.f30290q) {
            if (z10) {
                dk0Var.H(false);
            } else {
                dk0Var.stop();
            }
        }
    }

    public final void c(float f7, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            pp0 pp0Var = this.f30289p;
            pp0Var.a();
            pp0Var.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f30284k = i10;
        if (!z10) {
            this.f30286m.d(i10, true);
        }
        this.f30277b.run();
        if (this.f30290q && Math.abs(f7) > 3.0f && !this.f30295w) {
            this.f30295w = true;
            AndroidUtilities.runOnUIThread(this.f30296x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f30289p.c() + AndroidUtilities.dp(46.0f);
        float e7 = this.f30285l.e(this.f30283j);
        float d = this.f30286m.d(this.f30284k, false);
        if (e7 > 0.0f) {
            float d10 = this.f30287n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f30294u)) / 1000.0f);
            this.f30294u = currentTimeMillis;
            this.f30293t = (Math.min(d10, 4.0f) * 1.5f * min) + this.f30293t;
            this.f30277b.run();
            float f7 = c10 / 2.0f;
            this.f30291r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e7 * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f30276a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f30291r.centerX(), this.f30291r.top);
            canvas.translate(0.0f, (1.0f - e7) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f30291r);
            this.f30278c.setColor(org.telegram.ui.ActionBar.h6.m1(f10, -16777216));
            RectF rectF = this.f30291r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f30291r.height() / 2.0f, this.f30278c);
            this.f30289p.p(this.f30291r);
            canvas.save();
            float f12 = -d;
            canvas.translate(((this.f30291r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f30291r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin(this.f30293t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin((this.f30293t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d, 0.0f);
            pp0 pp0Var = this.f30289p;
            pp0Var.B = (int) (e7 * 255.0f);
            pp0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d)) * AndroidUtilities.dp(30.0f)) + ((this.f30291r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f30291r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin(this.f30293t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e7, -1));
            canvas.drawPath(this.f30282i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin((this.f30293t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e7, -1));
            canvas.drawPath(this.f30282i, this.d);
            canvas.restore();
            canvas.restore();
            g6 g6Var = this.f30288o;
            if (this.f30290q && this.f30283j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = g6Var.e(z10);
            if (e10 > 0.0f) {
                if (this.f30279e == null) {
                    dk0 dk0Var = new dk0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.f30279e = dk0Var;
                    dk0Var.J(true);
                    this.f30279e.setCallback(new i.f(this, 3));
                    this.f30279e.K(1);
                    this.f30279e.start();
                }
                float dp = this.f30281g.f28678c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f30292s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f30291r;
                float height = (rectF3.height() * e7) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f30291r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e7) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e10) + 0.75f;
                canvas.scale(f14, f14, this.f30292s.centerX(), this.f30292s.top);
                this.f30278c.setColor(org.telegram.ui.ActionBar.h6.m1(e10 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f30292s.centerX(), this.f30292s.top);
                canvas.drawPath(this.f30280f, this.f30278c);
                canvas.restore();
                canvas.drawRoundRect(this.f30292s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f30278c);
                this.f30279e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f30292s.left), ((int) this.f30292s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f30292s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f30292s.centerY()));
                this.f30279e.setAlpha((int) (255.0f * e10));
                if (!this.f30279e.f25818k0) {
                    this.f30279e.H(true);
                }
                this.f30279e.draw(canvas);
                this.f30281g.c(this.f30292s.left + AndroidUtilities.dp(39.0f), this.f30292s.centerY(), e10, -1, canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
