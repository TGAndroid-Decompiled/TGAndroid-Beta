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
public final class eo0 extends Drawable {
    public final boolean f28132a;
    public final Runnable f28133b;
    public final Paint f28134c = new Paint(1);
    public final Paint d;
    public xi0 f28135e;
    public final Path f28136f;
    public final zz0 f28137g;
    public final Path h;
    public final Path f28138i;
    public boolean f28139j;
    public int f28140k;
    public final d6 f28141l;
    public final d6 f28142m;
    public final d6 f28143n;
    public final d6 f28144o;
    public final do0 f28145p;
    public boolean f28146q;
    public final RectF f28147r;
    public final RectF f28148s;
    public float f28149t;
    public long f28150u;
    public float v;
    public boolean f28151w;
    public final xb0 f28152x;

    public eo0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f28136f = path;
        this.f28137g = new zz0(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f28138i = path3;
        this.f28140k = 1;
        this.f28147r = new RectF();
        this.f28148s = new RectF();
        this.f28152x = new xb0(this, 27);
        this.f28133b = runnable;
        this.f28132a = z10;
        jr jrVar = jr.h;
        d6 d6Var = new d6(runnable, 360L, jrVar, 0);
        this.f28141l = d6Var;
        d6Var.d(0.0f, true);
        this.f28142m = new d6(runnable, 320L, jrVar, 0);
        this.f28143n = new d6(runnable, 200L, jrVar, 0);
        d6 d6Var2 = new d6(runnable, 360L, jrVar, 0);
        this.f28144o = d6Var2;
        d6Var2.d(0.0f, true);
        do0 do0Var = new do0(runnable);
        this.f28145p = do0Var;
        do0Var.v = 0.3f;
        do0Var.f30879u = 0.4f;
        do0Var.f30876r = 650L;
        do0Var.f30878t = 1.6f;
        do0Var.f30877s = jrVar;
        do0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        do0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        do0Var.r(-1);
        do0Var.f30862b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f28146q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f28139j && this.f28141l.f27666c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f28139j = z10;
        this.f28133b.run();
        xi0 xi0Var = this.f28135e;
        if (xi0Var != null && this.f28146q) {
            if (z10) {
                xi0Var.F(false);
            } else {
                xi0Var.stop();
            }
        }
    }

    public final void c(float f9, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f9)) {
            do0 do0Var = this.f28145p;
            do0Var.b();
            do0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f9))), z10, true);
            this.v = f9;
        }
        if (f9 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f28140k = i10;
        if (!z10) {
            this.f28142m.d(i10, true);
        }
        this.f28133b.run();
        if (this.f28146q && Math.abs(f9) > 3.0f && !this.f28151w) {
            this.f28151w = true;
            AndroidUtilities.runOnUIThread(this.f28152x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float d = this.f28145p.d() + AndroidUtilities.dp(46.0f);
        float e10 = this.f28141l.e(this.f28139j);
        float d10 = this.f28142m.d(this.f28140k, false);
        if (e10 > 0.0f) {
            float d11 = this.f28143n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f28150u)) / 1000.0f);
            this.f28150u = currentTimeMillis;
            this.f28149t = (Math.min(d11, 4.0f) * 1.5f * min) + this.f28149t;
            this.f28133b.run();
            float f9 = d / 2.0f;
            this.f28147r.set(bounds.centerX() - f9, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f9, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e10 * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f28132a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f28147r.centerX(), this.f28147r.top);
            canvas.translate(0.0f, (1.0f - e10) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f28147r);
            this.f28134c.setColor(org.telegram.ui.ActionBar.g6.l1(f10, -16777216));
            RectF rectF = this.f28147r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f28147r.height() / 2.0f, this.f28134c);
            this.f28145p.m(this.f28147r);
            canvas.save();
            float f12 = -d10;
            canvas.translate(((this.f28147r.centerX() - f9) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f28147r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.g6.l1(((((((float) Math.sin(this.f28149t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e10, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.g6.l1(((((((float) Math.sin((this.f28149t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e10, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
            do0 do0Var = this.f28145p;
            do0Var.f30880w = (int) (e10 * 255.0f);
            do0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.f28147r.centerX() + f9) - AndroidUtilities.dp(30.0f)), this.f28147r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.g6.l1(((((((float) Math.sin(this.f28149t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e10, -1));
            canvas.drawPath(this.f28138i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.g6.l1(((((((float) Math.sin((this.f28149t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e10, -1));
            canvas.drawPath(this.f28138i, this.d);
            canvas.restore();
            canvas.restore();
            d6 d6Var = this.f28144o;
            if (this.f28146q && this.f28139j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e11 = d6Var.e(z10);
            if (e11 > 0.0f) {
                if (this.f28135e == null) {
                    int i10 = R.raw.seek_speed_hint;
                    xi0 xi0Var = new xi0(i10, "" + R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.f28135e = xi0Var;
                    xi0Var.H(true);
                    this.f28135e.setCallback(new hg.a(this, 7));
                    this.f28135e.I(1);
                    this.f28135e.start();
                }
                float dp = this.f28137g.f35462c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f28148s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f28147r;
                float height = (rectF3.height() * e10) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f28147r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e10) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e11) + 0.75f;
                canvas.scale(f14, f14, this.f28148s.centerX(), this.f28148s.top);
                this.f28134c.setColor(org.telegram.ui.ActionBar.g6.l1(e11 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f28148s.centerX(), this.f28148s.top);
                canvas.drawPath(this.f28136f, this.f28134c);
                canvas.restore();
                canvas.drawRoundRect(this.f28148s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f28134c);
                this.f28135e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f28148s.left), ((int) this.f28148s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f28148s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f28148s.centerY()));
                this.f28135e.setAlpha((int) (255.0f * e11));
                if (!this.f28135e.f34742h0) {
                    this.f28135e.F(true);
                }
                this.f28135e.draw(canvas);
                this.f28137g.c(this.f28148s.left + AndroidUtilities.dp(39.0f), this.f28148s.centerY(), e11, -1, canvas);
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
