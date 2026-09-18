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
public final class yo0 extends Drawable {
    public final boolean f30625a;
    public final Runnable f30626b;
    public final Paint f30627c = new Paint(1);
    public final Paint d;
    public ij0 e;
    public final Path f30628f;
    public final v01 f30629g;
    public final Path h;
    public final Path f30630i;
    public boolean f30631j;
    public int f30632k;
    public final e6 f30633l;
    public final e6 f30634m;
    public final e6 f30635n;
    public final e6 f30636o;
    public final xo0 f30637p;
    public boolean f30638q;
    public final RectF f30639r;
    public final RectF f30640s;
    public float f30641t;
    public long f30642u;
    public float v;
    public boolean f30643w;
    public final kc0 f30644x;

    public yo0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f30628f = path;
        this.f30629g = new v01(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f30630i = path3;
        this.f30632k = 1;
        this.f30639r = new RectF();
        this.f30640s = new RectF();
        this.f30644x = new kc0(this, 27);
        this.f30626b = runnable;
        this.f30625a = z10;
        qr qrVar = qr.h;
        e6 e6Var = new e6(runnable, 360L, qrVar, 0);
        this.f30633l = e6Var;
        e6Var.d(0.0f, true);
        this.f30634m = new e6(runnable, 320L, qrVar, 0);
        this.f30635n = new e6(runnable, 200L, qrVar, 0);
        e6 e6Var2 = new e6(runnable, 360L, qrVar, 0);
        this.f30636o = e6Var2;
        e6Var2.d(0.0f, true);
        xo0 xo0Var = new xo0(runnable);
        this.f30637p = xo0Var;
        xo0Var.v = 0.3f;
        xo0Var.f26884u = 0.4f;
        xo0Var.f26881r = 650L;
        xo0Var.f26883t = 1.6f;
        xo0Var.f26882s = qrVar;
        xo0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        xo0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        xo0Var.r(-1);
        xo0Var.f26868b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f30638q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f30631j && this.f30633l.f23794c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f30631j = z10;
        this.f30626b.run();
        ij0 ij0Var = this.e;
        if (ij0Var != null && this.f30638q) {
            if (z10) {
                ij0Var.H(false);
            } else {
                ij0Var.stop();
            }
        }
    }

    public final void c(float f7, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            xo0 xo0Var = this.f30637p;
            xo0Var.b();
            xo0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f30632k = i10;
        if (!z10) {
            this.f30634m.d(i10, true);
        }
        this.f30626b.run();
        if (this.f30638q && Math.abs(f7) > 3.0f && !this.f30643w) {
            this.f30643w = true;
            AndroidUtilities.runOnUIThread(this.f30644x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float d = this.f30637p.d() + AndroidUtilities.dp(46.0f);
        float e = this.f30633l.e(this.f30631j);
        float d10 = this.f30634m.d(this.f30632k, false);
        if (e > 0.0f) {
            float d11 = this.f30635n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f30642u)) / 1000.0f);
            this.f30642u = currentTimeMillis;
            this.f30641t = (Math.min(d11, 4.0f) * 1.5f * min) + this.f30641t;
            this.f30626b.run();
            float f7 = d / 2.0f;
            this.f30639r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f30625a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f30639r.centerX(), this.f30639r.top);
            canvas.translate(0.0f, (1.0f - e) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f30639r);
            this.f30627c.setColor(org.telegram.ui.ActionBar.j6.l1(f10, -16777216));
            RectF rectF = this.f30639r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f30639r.height() / 2.0f, this.f30627c);
            this.f30637p.m(this.f30639r);
            canvas.save();
            float f12 = -d10;
            canvas.translate(((this.f30639r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f30639r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin(this.f30641t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin((this.f30641t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
            xo0 xo0Var = this.f30637p;
            xo0Var.f26885w = (int) (e * 255.0f);
            xo0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.f30639r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f30639r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin(this.f30641t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f30630i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin((this.f30641t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f30630i, this.d);
            canvas.restore();
            canvas.restore();
            e6 e6Var = this.f30636o;
            if (this.f30638q && this.f30631j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = e6Var.e(z10);
            if (e7 > 0.0f) {
                if (this.e == null) {
                    ij0 ij0Var = new ij0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.e = ij0Var;
                    ij0Var.J(true);
                    this.e.setCallback(new ah.d(this, 4));
                    this.e.K(1);
                    this.e.start();
                }
                float dp = this.f30629g.f28868c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f30640s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f30639r;
                float height = (rectF3.height() * e) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f30639r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e7) + 0.75f;
                canvas.scale(f14, f14, this.f30640s.centerX(), this.f30640s.top);
                this.f30627c.setColor(org.telegram.ui.ActionBar.j6.l1(e7 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f30640s.centerX(), this.f30640s.top);
                canvas.drawPath(this.f30628f, this.f30627c);
                canvas.restore();
                canvas.drawRoundRect(this.f30640s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f30627c);
                this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f30640s.left), ((int) this.f30640s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f30640s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f30640s.centerY()));
                this.e.setAlpha((int) (255.0f * e7));
                if (!this.e.f24985k0) {
                    this.e.H(true);
                }
                this.e.draw(canvas);
                this.f30629g.c(this.f30640s.left + AndroidUtilities.dp(39.0f), this.f30640s.centerY(), e7, -1, canvas);
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
