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
public final class zo0 extends Drawable {
    public final boolean f30911a;
    public final Runnable f30912b;
    public final Paint f30913c = new Paint(1);
    public final Paint d;
    public kj0 e;
    public final Path f30914f;
    public final w01 f30915g;
    public final Path h;
    public final Path f30916i;
    public boolean f30917j;
    public int f30918k;
    public final d6 f30919l;
    public final d6 f30920m;
    public final d6 f30921n;
    public final d6 f30922o;
    public final yo0 f30923p;
    public boolean f30924q;
    public final RectF f30925r;
    public final RectF f30926s;
    public float f30927t;
    public long f30928u;
    public float v;
    public boolean f30929w;
    public final jc0 f30930x;

    public zo0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f30914f = path;
        this.f30915g = new w01(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f30916i = path3;
        this.f30918k = 1;
        this.f30925r = new RectF();
        this.f30926s = new RectF();
        this.f30930x = new jc0(this, 28);
        this.f30912b = runnable;
        this.f30911a = z10;
        qr qrVar = qr.h;
        d6 d6Var = new d6(runnable, 360L, qrVar, 0);
        this.f30919l = d6Var;
        d6Var.d(0.0f, true);
        this.f30920m = new d6(runnable, 320L, qrVar, 0);
        this.f30921n = new d6(runnable, 200L, qrVar, 0);
        d6 d6Var2 = new d6(runnable, 360L, qrVar, 0);
        this.f30922o = d6Var2;
        d6Var2.d(0.0f, true);
        yo0 yo0Var = new yo0(runnable);
        this.f30923p = yo0Var;
        yo0Var.v = 0.3f;
        yo0Var.f26659u = 0.4f;
        yo0Var.f26656r = 650L;
        yo0Var.f26658t = 1.6f;
        yo0Var.f26657s = qrVar;
        yo0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        yo0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        yo0Var.r(-1);
        yo0Var.f26643b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f30924q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f30917j && this.f30919l.f23570c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f30917j = z10;
        this.f30912b.run();
        kj0 kj0Var = this.e;
        if (kj0Var != null && this.f30924q) {
            if (z10) {
                kj0Var.H(false);
            } else {
                kj0Var.stop();
            }
        }
    }

    public final void c(float f7, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            yo0 yo0Var = this.f30923p;
            yo0Var.b();
            yo0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f30918k = i10;
        if (!z10) {
            this.f30920m.d(i10, true);
        }
        this.f30912b.run();
        if (this.f30924q && Math.abs(f7) > 3.0f && !this.f30929w) {
            this.f30929w = true;
            AndroidUtilities.runOnUIThread(this.f30930x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float d = this.f30923p.d() + AndroidUtilities.dp(46.0f);
        float e = this.f30919l.e(this.f30917j);
        float d10 = this.f30920m.d(this.f30918k, false);
        if (e > 0.0f) {
            float d11 = this.f30921n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f30928u)) / 1000.0f);
            this.f30928u = currentTimeMillis;
            this.f30927t = (Math.min(d11, 4.0f) * 1.5f * min) + this.f30927t;
            this.f30912b.run();
            float f7 = d / 2.0f;
            this.f30925r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f30911a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f30925r.centerX(), this.f30925r.top);
            canvas.translate(0.0f, (1.0f - e) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f30925r);
            this.f30913c.setColor(org.telegram.ui.ActionBar.j6.l1(f10, -16777216));
            RectF rectF = this.f30925r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f30925r.height() / 2.0f, this.f30913c);
            this.f30923p.m(this.f30925r);
            canvas.save();
            float f12 = -d10;
            canvas.translate(((this.f30925r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f30925r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin(this.f30927t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin((this.f30927t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
            yo0 yo0Var = this.f30923p;
            yo0Var.f26660w = (int) (e * 255.0f);
            yo0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.f30925r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f30925r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin(this.f30927t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f30916i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin((this.f30927t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f30916i, this.d);
            canvas.restore();
            canvas.restore();
            d6 d6Var = this.f30922o;
            if (this.f30924q && this.f30917j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = d6Var.e(z10);
            if (e7 > 0.0f) {
                if (this.e == null) {
                    kj0 kj0Var = new kj0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.e = kj0Var;
                    kj0Var.J(true);
                    this.e.setCallback(new ah.d(this, 4));
                    this.e.K(1);
                    this.e.start();
                }
                float dp = this.f30915g.f29862c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f30926s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f30925r;
                float height = (rectF3.height() * e) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f30925r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e7) + 0.75f;
                canvas.scale(f14, f14, this.f30926s.centerX(), this.f30926s.top);
                this.f30913c.setColor(org.telegram.ui.ActionBar.j6.l1(e7 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f30926s.centerX(), this.f30926s.top);
                canvas.drawPath(this.f30914f, this.f30913c);
                canvas.restore();
                canvas.drawRoundRect(this.f30926s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f30913c);
                this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f30926s.left), ((int) this.f30926s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f30926s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f30926s.centerY()));
                this.e.setAlpha((int) (255.0f * e7));
                if (!this.e.f25724k0) {
                    this.e.H(true);
                }
                this.e.draw(canvas);
                this.f30915g.c(this.f30926s.left + AndroidUtilities.dp(39.0f), this.f30926s.centerY(), e7, -1, canvas);
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
