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
public final class ep0 extends Drawable {
    public final boolean f26176a;
    public final Runnable f26177b;
    public final Paint f26178c = new Paint(1);
    public final Paint d;
    public kj0 f26179e;
    public final Path f26180f;
    public final f11 f26181g;
    public final Path h;
    public final Path f26182i;
    public boolean f26183j;
    public int f26184k;
    public final e6 f26185l;
    public final e6 f26186m;
    public final e6 f26187n;
    public final e6 f26188o;
    public final dp0 f26189p;
    public boolean f26190q;
    public final RectF f26191r;
    public final RectF f26192s;
    public float f26193t;
    public long f26194u;
    public float v;
    public boolean f26195w;
    public final lc0 f26196x;

    public ep0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f26180f = path;
        this.f26181g = new f11(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f26182i = path3;
        this.f26184k = 1;
        this.f26191r = new RectF();
        this.f26192s = new RectF();
        this.f26196x = new lc0(this, 29);
        this.f26177b = runnable;
        this.f26176a = z10;
        tr trVar = tr.h;
        e6 e6Var = new e6(runnable, 360L, trVar, 0);
        this.f26185l = e6Var;
        e6Var.d(0.0f, true);
        this.f26186m = new e6(runnable, 320L, trVar, 0);
        this.f26187n = new e6(runnable, 200L, trVar, 0);
        e6 e6Var2 = new e6(runnable, 360L, trVar, 0);
        this.f26188o = e6Var2;
        e6Var2.d(0.0f, true);
        dp0 dp0Var = new dp0(runnable);
        this.f26189p = dp0Var;
        dp0Var.v = 0.3f;
        dp0Var.f29371u = 0.4f;
        dp0Var.f29368r = 650L;
        dp0Var.f29370t = 1.6f;
        dp0Var.f29369s = trVar;
        dp0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        dp0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        dp0Var.r(-1);
        dp0Var.f29354b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f26190q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f26183j && this.f26185l.f25987c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f26183j = z10;
        this.f26177b.run();
        kj0 kj0Var = this.f26179e;
        if (kj0Var != null && this.f26190q) {
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
            dp0 dp0Var = this.f26189p;
            dp0Var.b();
            dp0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f26184k = i10;
        if (!z10) {
            this.f26186m.d(i10, true);
        }
        this.f26177b.run();
        if (this.f26190q && Math.abs(f7) > 3.0f && !this.f26195w) {
            this.f26195w = true;
            AndroidUtilities.runOnUIThread(this.f26196x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float d = this.f26189p.d() + AndroidUtilities.dp(46.0f);
        float e7 = this.f26185l.e(this.f26183j);
        float d10 = this.f26186m.d(this.f26184k, false);
        if (e7 > 0.0f) {
            float d11 = this.f26187n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f26194u)) / 1000.0f);
            this.f26194u = currentTimeMillis;
            this.f26193t = (Math.min(d11, 4.0f) * 1.5f * min) + this.f26193t;
            this.f26177b.run();
            float f7 = d / 2.0f;
            this.f26191r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e7 * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f26176a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f26191r.centerX(), this.f26191r.top);
            canvas.translate(0.0f, (1.0f - e7) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f26191r);
            this.f26178c.setColor(org.telegram.ui.ActionBar.i6.l1(f10, -16777216));
            RectF rectF = this.f26191r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f26191r.height() / 2.0f, this.f26178c);
            this.f26189p.m(this.f26191r);
            canvas.save();
            float f12 = -d10;
            canvas.translate(((this.f26191r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f26191r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.i6.l1(((((((float) Math.sin(this.f26193t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.i6.l1(((((((float) Math.sin((this.f26193t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
            dp0 dp0Var = this.f26189p;
            dp0Var.f29372w = (int) (e7 * 255.0f);
            dp0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.f26191r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f26191r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.i6.l1(((((((float) Math.sin(this.f26193t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e7, -1));
            canvas.drawPath(this.f26182i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.i6.l1(((((((float) Math.sin((this.f26193t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e7, -1));
            canvas.drawPath(this.f26182i, this.d);
            canvas.restore();
            canvas.restore();
            e6 e6Var = this.f26188o;
            if (this.f26190q && this.f26183j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = e6Var.e(z10);
            if (e10 > 0.0f) {
                if (this.f26179e == null) {
                    kj0 kj0Var = new kj0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.f26179e = kj0Var;
                    kj0Var.J(true);
                    this.f26179e.setCallback(new ah.d(this, 4));
                    this.f26179e.K(1);
                    this.f26179e.start();
                }
                float dp = this.f26181g.f26266c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f26192s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f26191r;
                float height = (rectF3.height() * e7) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f26191r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e7) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e10) + 0.75f;
                canvas.scale(f14, f14, this.f26192s.centerX(), this.f26192s.top);
                this.f26178c.setColor(org.telegram.ui.ActionBar.i6.l1(e10 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f26192s.centerX(), this.f26192s.top);
                canvas.drawPath(this.f26180f, this.f26178c);
                canvas.restore();
                canvas.drawRoundRect(this.f26192s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f26178c);
                this.f26179e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f26192s.left), ((int) this.f26192s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f26192s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f26192s.centerY()));
                this.f26179e.setAlpha((int) (255.0f * e10));
                if (!this.f26179e.f28224k0) {
                    this.f26179e.H(true);
                }
                this.f26179e.draw(canvas);
                this.f26181g.c(this.f26192s.left + AndroidUtilities.dp(39.0f), this.f26192s.centerY(), e10, -1, canvas);
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
