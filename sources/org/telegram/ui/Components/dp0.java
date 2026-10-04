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
public final class dp0 extends Drawable {
    public final boolean f25783a;
    public final Runnable f25784b;
    public final Paint f25785c = new Paint(1);
    public final Paint d;
    public kj0 f25786e;
    public final Path f25787f;
    public final e11 f25788g;
    public final Path h;
    public final Path f25789i;
    public boolean f25790j;
    public int f25791k;
    public final e6 f25792l;
    public final e6 f25793m;
    public final e6 f25794n;
    public final e6 f25795o;
    public final cp0 f25796p;
    public boolean f25797q;
    public final RectF f25798r;
    public final RectF f25799s;
    public float f25800t;
    public long f25801u;
    public float v;
    public boolean f25802w;
    public final lc0 f25803x;

    public dp0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f25787f = path;
        this.f25788g = new e11(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f25789i = path3;
        this.f25791k = 1;
        this.f25798r = new RectF();
        this.f25799s = new RectF();
        this.f25803x = new lc0(this, 28);
        this.f25784b = runnable;
        this.f25783a = z10;
        tr trVar = tr.h;
        e6 e6Var = new e6(runnable, 360L, trVar, 0);
        this.f25792l = e6Var;
        e6Var.d(0.0f, true);
        this.f25793m = new e6(runnable, 320L, trVar, 0);
        this.f25794n = new e6(runnable, 200L, trVar, 0);
        e6 e6Var2 = new e6(runnable, 360L, trVar, 0);
        this.f25795o = e6Var2;
        e6Var2.d(0.0f, true);
        cp0 cp0Var = new cp0(runnable);
        this.f25796p = cp0Var;
        cp0Var.v = 0.3f;
        cp0Var.f29262u = 0.4f;
        cp0Var.f29259r = 650L;
        cp0Var.f29261t = 1.6f;
        cp0Var.f29260s = trVar;
        cp0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        cp0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        cp0Var.r(-1);
        cp0Var.f29245b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f25797q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f25790j && this.f25792l.f25939c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f25790j = z10;
        this.f25784b.run();
        kj0 kj0Var = this.f25786e;
        if (kj0Var != null && this.f25797q) {
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
            cp0 cp0Var = this.f25796p;
            cp0Var.b();
            cp0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f25791k = i10;
        if (!z10) {
            this.f25793m.d(i10, true);
        }
        this.f25784b.run();
        if (this.f25797q && Math.abs(f7) > 3.0f && !this.f25802w) {
            this.f25802w = true;
            AndroidUtilities.runOnUIThread(this.f25803x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float d = this.f25796p.d() + AndroidUtilities.dp(46.0f);
        float e7 = this.f25792l.e(this.f25790j);
        float d10 = this.f25793m.d(this.f25791k, false);
        if (e7 > 0.0f) {
            float d11 = this.f25794n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f25801u)) / 1000.0f);
            this.f25801u = currentTimeMillis;
            this.f25800t = (Math.min(d11, 4.0f) * 1.5f * min) + this.f25800t;
            this.f25784b.run();
            float f7 = d / 2.0f;
            this.f25798r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e7 * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f25783a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f25798r.centerX(), this.f25798r.top);
            canvas.translate(0.0f, (1.0f - e7) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f25798r);
            this.f25785c.setColor(org.telegram.ui.ActionBar.i6.l1(f10, -16777216));
            RectF rectF = this.f25798r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f25798r.height() / 2.0f, this.f25785c);
            this.f25796p.m(this.f25798r);
            canvas.save();
            float f12 = -d10;
            canvas.translate(((this.f25798r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f25798r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.i6.l1(((((((float) Math.sin(this.f25800t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.i6.l1(((((((float) Math.sin((this.f25800t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
            cp0 cp0Var = this.f25796p;
            cp0Var.f29263w = (int) (e7 * 255.0f);
            cp0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.f25798r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f25798r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.i6.l1(((((((float) Math.sin(this.f25800t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e7, -1));
            canvas.drawPath(this.f25789i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.i6.l1(((((((float) Math.sin((this.f25800t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e7, -1));
            canvas.drawPath(this.f25789i, this.d);
            canvas.restore();
            canvas.restore();
            e6 e6Var = this.f25795o;
            if (this.f25797q && this.f25790j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = e6Var.e(z10);
            if (e10 > 0.0f) {
                if (this.f25786e == null) {
                    kj0 kj0Var = new kj0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.f25786e = kj0Var;
                    kj0Var.J(true);
                    this.f25786e.setCallback(new ah.d(this, 4));
                    this.f25786e.K(1);
                    this.f25786e.start();
                }
                float dp = this.f25788g.f25884c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f25799s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f25798r;
                float height = (rectF3.height() * e7) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f25798r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e7) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e10) + 0.75f;
                canvas.scale(f14, f14, this.f25799s.centerX(), this.f25799s.top);
                this.f25785c.setColor(org.telegram.ui.ActionBar.i6.l1(e10 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f25799s.centerX(), this.f25799s.top);
                canvas.drawPath(this.f25787f, this.f25785c);
                canvas.restore();
                canvas.drawRoundRect(this.f25799s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f25785c);
                this.f25786e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f25799s.left), ((int) this.f25799s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f25799s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f25799s.centerY()));
                this.f25786e.setAlpha((int) (255.0f * e10));
                if (!this.f25786e.f28138k0) {
                    this.f25786e.H(true);
                }
                this.f25786e.draw(canvas);
                this.f25788g.c(this.f25799s.left + AndroidUtilities.dp(39.0f), this.f25799s.centerY(), e10, -1, canvas);
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
