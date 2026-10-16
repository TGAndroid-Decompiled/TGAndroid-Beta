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
public final class lp0 extends Drawable {
    public final boolean f26780a;
    public final Runnable f26781b;
    public final Paint f26782c = new Paint(1);
    public final Paint d;
    public yj0 e;
    public final Path f26783f;
    public final i11 f26784g;
    public final Path h;
    public final Path f26785i;
    public boolean f26786j;
    public int f26787k;
    public final g6 f26788l;
    public final g6 f26789m;
    public final g6 f26790n;
    public final g6 f26791o;
    public final kp0 f26792p;
    public boolean f26793q;
    public final RectF f26794r;
    public final RectF f26795s;
    public float f26796t;
    public long f26797u;
    public float v;
    public boolean f26798w;
    public final yc0 f26799x;

    public lp0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f26783f = path;
        this.f26784g = new i11(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f26785i = path3;
        this.f26787k = 1;
        this.f26794r = new RectF();
        this.f26795s = new RectF();
        this.f26799x = new yc0(this, 28);
        this.f26781b = runnable;
        this.f26780a = z10;
        es esVar = es.h;
        g6 g6Var = new g6(runnable, 360L, esVar, 0);
        this.f26788l = g6Var;
        g6Var.d(0.0f, true);
        this.f26789m = new g6(runnable, 320L, esVar, 0);
        this.f26790n = new g6(runnable, 200L, esVar, 0);
        g6 g6Var2 = new g6(runnable, 360L, esVar, 0);
        this.f26791o = g6Var2;
        g6Var2.d(0.0f, true);
        kp0 kp0Var = new kp0(runnable);
        this.f26792p = kp0Var;
        kp0Var.A = 0.3f;
        kp0Var.m(0.4f, 650L, 1.6f, esVar);
        kp0Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        kp0Var.w(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        kp0Var.u(-1);
        kp0Var.f28435b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f26793q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f26786j && this.f26788l.f24885c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f26786j = z10;
        this.f26781b.run();
        yj0 yj0Var = this.e;
        if (yj0Var != null && this.f26793q) {
            if (z10) {
                yj0Var.H(false);
            } else {
                yj0Var.stop();
            }
        }
    }

    public final void c(float f7, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            kp0 kp0Var = this.f26792p;
            kp0Var.a();
            kp0Var.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f26787k = i10;
        if (!z10) {
            this.f26789m.d(i10, true);
        }
        this.f26781b.run();
        if (this.f26793q && Math.abs(f7) > 3.0f && !this.f26798w) {
            this.f26798w = true;
            AndroidUtilities.runOnUIThread(this.f26799x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f26792p.c() + AndroidUtilities.dp(46.0f);
        float e = this.f26788l.e(this.f26786j);
        float d = this.f26789m.d(this.f26787k, false);
        if (e > 0.0f) {
            float d10 = this.f26790n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f26797u)) / 1000.0f);
            this.f26797u = currentTimeMillis;
            this.f26796t = (Math.min(d10, 4.0f) * 1.5f * min) + this.f26796t;
            this.f26781b.run();
            float f7 = c10 / 2.0f;
            this.f26794r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f26780a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f26794r.centerX(), this.f26794r.top);
            canvas.translate(0.0f, (1.0f - e) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f26794r);
            this.f26782c.setColor(org.telegram.ui.ActionBar.g6.m1(f10, -16777216));
            RectF rectF = this.f26794r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f26794r.height() / 2.0f, this.f26782c);
            this.f26792p.p(this.f26794r);
            canvas.save();
            float f12 = -d;
            canvas.translate(((this.f26794r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f26794r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.g6.m1(((((((float) Math.sin(this.f26796t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.g6.m1(((((((float) Math.sin((this.f26796t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d, 0.0f);
            kp0 kp0Var = this.f26792p;
            kp0Var.B = (int) (e * 255.0f);
            kp0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d)) * AndroidUtilities.dp(30.0f)) + ((this.f26794r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f26794r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.g6.m1(((((((float) Math.sin(this.f26796t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e, -1));
            canvas.drawPath(this.f26785i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.g6.m1(((((((float) Math.sin((this.f26796t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e, -1));
            canvas.drawPath(this.f26785i, this.d);
            canvas.restore();
            canvas.restore();
            g6 g6Var = this.f26791o;
            if (this.f26793q && this.f26786j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = g6Var.e(z10);
            if (e7 > 0.0f) {
                if (this.e == null) {
                    yj0 yj0Var = new yj0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.e = yj0Var;
                    yj0Var.J(true);
                    this.e.setCallback(new ah.f1(this, 4));
                    this.e.K(1);
                    this.e.start();
                }
                float dp = this.f26784g.f25455c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f26795s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f26794r;
                float height = (rectF3.height() * e) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f26794r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e7) + 0.75f;
                canvas.scale(f14, f14, this.f26795s.centerX(), this.f26795s.top);
                this.f26782c.setColor(org.telegram.ui.ActionBar.g6.m1(e7 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f26795s.centerX(), this.f26795s.top);
                canvas.drawPath(this.f26783f, this.f26782c);
                canvas.restore();
                canvas.drawRoundRect(this.f26795s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f26782c);
                this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f26795s.left), ((int) this.f26795s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f26795s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f26795s.centerY()));
                this.e.setAlpha((int) (255.0f * e7));
                if (!this.e.f31298k0) {
                    this.e.H(true);
                }
                this.e.draw(canvas);
                this.f26784g.c(this.f26795s.left + AndroidUtilities.dp(39.0f), this.f26795s.centerY(), e7, -1, canvas);
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
