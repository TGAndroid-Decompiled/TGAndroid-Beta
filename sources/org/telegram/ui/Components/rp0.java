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
public final class rp0 extends Drawable {
    public final boolean f30494a;
    public final Runnable f30495b;
    public final Paint f30496c = new Paint(1);
    public final Paint d;
    public ek0 f30497e;
    public final Path f30498f;
    public final n11 f30499g;
    public final Path h;
    public final Path f30500i;
    public boolean f30501j;
    public int f30502k;
    public final g6 f30503l;
    public final g6 f30504m;
    public final g6 f30505n;
    public final g6 f30506o;
    public final qp0 f30507p;
    public boolean f30508q;
    public final RectF f30509r;
    public final RectF f30510s;
    public float f30511t;
    public long f30512u;
    public float v;
    public boolean f30513w;
    public final cd0 f30514x;

    public rp0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f30498f = path;
        this.f30499g = new n11(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f30500i = path3;
        this.f30502k = 1;
        this.f30509r = new RectF();
        this.f30510s = new RectF();
        this.f30514x = new cd0(this, 27);
        this.f30495b = runnable;
        this.f30494a = z10;
        is isVar = is.h;
        g6 g6Var = new g6(runnable, 360L, isVar, 0);
        this.f30503l = g6Var;
        g6Var.d(0.0f, true);
        this.f30504m = new g6(runnable, 320L, isVar, 0);
        this.f30505n = new g6(runnable, 200L, isVar, 0);
        g6 g6Var2 = new g6(runnable, 360L, isVar, 0);
        this.f30506o = g6Var2;
        g6Var2.d(0.0f, true);
        qp0 qp0Var = new qp0(runnable);
        this.f30507p = qp0Var;
        qp0Var.A = 0.3f;
        qp0Var.m(0.4f, 650L, 1.6f, isVar);
        qp0Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        qp0Var.w(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        qp0Var.u(-1);
        qp0Var.f30019b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f30508q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f30501j && this.f30503l.f26613c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f30501j = z10;
        this.f30495b.run();
        ek0 ek0Var = this.f30497e;
        if (ek0Var != null && this.f30508q) {
            if (z10) {
                ek0Var.H(false);
            } else {
                ek0Var.stop();
            }
        }
    }

    public final void c(float f7, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            qp0 qp0Var = this.f30507p;
            qp0Var.a();
            qp0Var.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f30502k = i10;
        if (!z10) {
            this.f30504m.d(i10, true);
        }
        this.f30495b.run();
        if (this.f30508q && Math.abs(f7) > 3.0f && !this.f30513w) {
            this.f30513w = true;
            AndroidUtilities.runOnUIThread(this.f30514x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f30507p.c() + AndroidUtilities.dp(46.0f);
        float e7 = this.f30503l.e(this.f30501j);
        float d = this.f30504m.d(this.f30502k, false);
        if (e7 > 0.0f) {
            float d10 = this.f30505n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f30512u)) / 1000.0f);
            this.f30512u = currentTimeMillis;
            this.f30511t = (Math.min(d10, 4.0f) * 1.5f * min) + this.f30511t;
            this.f30495b.run();
            float f7 = c10 / 2.0f;
            this.f30509r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e7 * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f30494a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f30509r.centerX(), this.f30509r.top);
            canvas.translate(0.0f, (1.0f - e7) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f30509r);
            this.f30496c.setColor(org.telegram.ui.ActionBar.h6.m1(f10, -16777216));
            RectF rectF = this.f30509r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f30509r.height() / 2.0f, this.f30496c);
            this.f30507p.p(this.f30509r);
            canvas.save();
            float f12 = -d;
            canvas.translate(((this.f30509r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f30509r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin(this.f30511t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin((this.f30511t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d, 0.0f);
            qp0 qp0Var = this.f30507p;
            qp0Var.B = (int) (e7 * 255.0f);
            qp0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d)) * AndroidUtilities.dp(30.0f)) + ((this.f30509r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f30509r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin(this.f30511t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e7, -1));
            canvas.drawPath(this.f30500i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin((this.f30511t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e7, -1));
            canvas.drawPath(this.f30500i, this.d);
            canvas.restore();
            canvas.restore();
            g6 g6Var = this.f30506o;
            if (this.f30508q && this.f30501j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = g6Var.e(z10);
            if (e10 > 0.0f) {
                if (this.f30497e == null) {
                    ek0 ek0Var = new ek0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.f30497e = ek0Var;
                    ek0Var.J(true);
                    this.f30497e.setCallback(new i.f(this, 3));
                    this.f30497e.K(1);
                    this.f30497e.start();
                }
                float dp = this.f30499g.f28902c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f30510s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f30509r;
                float height = (rectF3.height() * e7) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f30509r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e7) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e10) + 0.75f;
                canvas.scale(f14, f14, this.f30510s.centerX(), this.f30510s.top);
                this.f30496c.setColor(org.telegram.ui.ActionBar.h6.m1(e10 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f30510s.centerX(), this.f30510s.top);
                canvas.drawPath(this.f30498f, this.f30496c);
                canvas.restore();
                canvas.drawRoundRect(this.f30510s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f30496c);
                this.f30497e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f30510s.left), ((int) this.f30510s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f30510s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f30510s.centerY()));
                this.f30497e.setAlpha((int) (255.0f * e10));
                if (!this.f30497e.f26051k0) {
                    this.f30497e.H(true);
                }
                this.f30497e.draw(canvas);
                this.f30499g.c(this.f30510s.left + AndroidUtilities.dp(39.0f), this.f30510s.centerY(), e10, -1, canvas);
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
