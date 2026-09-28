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
    public final boolean f30921a;
    public final Runnable f30922b;
    public final Paint f30923c = new Paint(1);
    public final Paint d;
    public kj0 e;
    public final Path f30924f;
    public final v01 f30925g;
    public final Path h;
    public final Path f30926i;
    public boolean f30927j;
    public int f30928k;
    public final e6 f30929l;
    public final e6 f30930m;
    public final e6 f30931n;
    public final e6 f30932o;
    public final yo0 f30933p;
    public boolean f30934q;
    public final RectF f30935r;
    public final RectF f30936s;
    public float f30937t;
    public long f30938u;
    public float v;
    public boolean f30939w;
    public final kc0 f30940x;

    public zo0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f30924f = path;
        this.f30925g = new v01(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f30926i = path3;
        this.f30928k = 1;
        this.f30935r = new RectF();
        this.f30936s = new RectF();
        this.f30940x = new kc0(this, 28);
        this.f30922b = runnable;
        this.f30921a = z10;
        sr srVar = sr.h;
        e6 e6Var = new e6(runnable, 360L, srVar, 0);
        this.f30929l = e6Var;
        e6Var.d(0.0f, true);
        this.f30930m = new e6(runnable, 320L, srVar, 0);
        this.f30931n = new e6(runnable, 200L, srVar, 0);
        e6 e6Var2 = new e6(runnable, 360L, srVar, 0);
        this.f30932o = e6Var2;
        e6Var2.d(0.0f, true);
        yo0 yo0Var = new yo0(runnable);
        this.f30933p = yo0Var;
        yo0Var.v = 0.3f;
        yo0Var.f26965u = 0.4f;
        yo0Var.f26962r = 650L;
        yo0Var.f26964t = 1.6f;
        yo0Var.f26963s = srVar;
        yo0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        yo0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        yo0Var.r(-1);
        yo0Var.f26949b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f30934q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f30927j && this.f30929l.f23876c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f30927j = z10;
        this.f30922b.run();
        kj0 kj0Var = this.e;
        if (kj0Var != null && this.f30934q) {
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
            yo0 yo0Var = this.f30933p;
            yo0Var.b();
            yo0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f30928k = i10;
        if (!z10) {
            this.f30930m.d(i10, true);
        }
        this.f30922b.run();
        if (this.f30934q && Math.abs(f7) > 3.0f && !this.f30939w) {
            this.f30939w = true;
            AndroidUtilities.runOnUIThread(this.f30940x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float d = this.f30933p.d() + AndroidUtilities.dp(46.0f);
        float e = this.f30929l.e(this.f30927j);
        float d10 = this.f30930m.d(this.f30928k, false);
        if (e > 0.0f) {
            float d11 = this.f30931n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f30938u)) / 1000.0f);
            this.f30938u = currentTimeMillis;
            this.f30937t = (Math.min(d11, 4.0f) * 1.5f * min) + this.f30937t;
            this.f30922b.run();
            float f7 = d / 2.0f;
            this.f30935r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f30921a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f30935r.centerX(), this.f30935r.top);
            canvas.translate(0.0f, (1.0f - e) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f30935r);
            this.f30923c.setColor(org.telegram.ui.ActionBar.h6.l1(f10, -16777216));
            RectF rectF = this.f30935r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f30935r.height() / 2.0f, this.f30923c);
            this.f30933p.m(this.f30935r);
            canvas.save();
            float f12 = -d10;
            canvas.translate(((this.f30935r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f30935r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin(this.f30937t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin((this.f30937t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
            yo0 yo0Var = this.f30933p;
            yo0Var.f26966w = (int) (e * 255.0f);
            yo0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.f30935r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f30935r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin(this.f30937t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f30926i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin((this.f30937t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f30926i, this.d);
            canvas.restore();
            canvas.restore();
            e6 e6Var = this.f30932o;
            if (this.f30934q && this.f30927j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = e6Var.e(z10);
            if (e7 > 0.0f) {
                if (this.e == null) {
                    kj0 kj0Var = new kj0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.e = kj0Var;
                    kj0Var.J(true);
                    this.e.setCallback(new i.f(this, 3));
                    this.e.K(1);
                    this.e.start();
                }
                float dp = this.f30925g.f28929c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f30936s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f30935r;
                float height = (rectF3.height() * e) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f30935r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e7) + 0.75f;
                canvas.scale(f14, f14, this.f30936s.centerX(), this.f30936s.top);
                this.f30923c.setColor(org.telegram.ui.ActionBar.h6.l1(e7 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f30936s.centerX(), this.f30936s.top);
                canvas.drawPath(this.f30924f, this.f30923c);
                canvas.restore();
                canvas.drawRoundRect(this.f30936s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f30923c);
                this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f30936s.left), ((int) this.f30936s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f30936s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f30936s.centerY()));
                this.e.setAlpha((int) (255.0f * e7));
                if (!this.e.f25730k0) {
                    this.e.H(true);
                }
                this.e.draw(canvas);
                this.f30925g.c(this.f30936s.left + AndroidUtilities.dp(39.0f), this.f30936s.centerY(), e7, -1, canvas);
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
