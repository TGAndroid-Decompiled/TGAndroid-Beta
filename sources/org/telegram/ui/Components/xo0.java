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
public final class xo0 extends Drawable {
    public final boolean f30363a;
    public final Runnable f30364b;
    public final Paint f30365c = new Paint(1);
    public final Paint d;
    public ij0 e;
    public final Path f30366f;
    public final t01 f30367g;
    public final Path h;
    public final Path f30368i;
    public boolean f30369j;
    public int f30370k;
    public final e6 f30371l;
    public final e6 f30372m;
    public final e6 f30373n;
    public final e6 f30374o;
    public final wo0 f30375p;
    public boolean f30376q;
    public final RectF f30377r;
    public final RectF f30378s;
    public float f30379t;
    public long f30380u;
    public float v;
    public boolean f30381w;
    public final ic0 f30382x;

    public xo0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f30366f = path;
        this.f30367g = new t01(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f30368i = path3;
        this.f30370k = 1;
        this.f30377r = new RectF();
        this.f30378s = new RectF();
        this.f30382x = new ic0(this, 28);
        this.f30364b = runnable;
        this.f30363a = z10;
        rr rrVar = rr.h;
        e6 e6Var = new e6(runnable, 360L, rrVar, 0);
        this.f30371l = e6Var;
        e6Var.d(0.0f, true);
        this.f30372m = new e6(runnable, 320L, rrVar, 0);
        this.f30373n = new e6(runnable, 200L, rrVar, 0);
        e6 e6Var2 = new e6(runnable, 360L, rrVar, 0);
        this.f30374o = e6Var2;
        e6Var2.d(0.0f, true);
        wo0 wo0Var = new wo0(runnable);
        this.f30375p = wo0Var;
        wo0Var.v = 0.3f;
        wo0Var.f26945u = 0.4f;
        wo0Var.f26942r = 650L;
        wo0Var.f26944t = 1.6f;
        wo0Var.f26943s = rrVar;
        wo0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        wo0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        wo0Var.r(-1);
        wo0Var.f26929b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f30376q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f30369j && this.f30371l.f23844c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f30369j = z10;
        this.f30364b.run();
        ij0 ij0Var = this.e;
        if (ij0Var != null && this.f30376q) {
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
            wo0 wo0Var = this.f30375p;
            wo0Var.b();
            wo0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f30370k = i10;
        if (!z10) {
            this.f30372m.d(i10, true);
        }
        this.f30364b.run();
        if (this.f30376q && Math.abs(f7) > 3.0f && !this.f30381w) {
            this.f30381w = true;
            AndroidUtilities.runOnUIThread(this.f30382x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float d = this.f30375p.d() + AndroidUtilities.dp(46.0f);
        float e = this.f30371l.e(this.f30369j);
        float d10 = this.f30372m.d(this.f30370k, false);
        if (e > 0.0f) {
            float d11 = this.f30373n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f30380u)) / 1000.0f);
            this.f30380u = currentTimeMillis;
            this.f30379t = (Math.min(d11, 4.0f) * 1.5f * min) + this.f30379t;
            this.f30364b.run();
            float f7 = d / 2.0f;
            this.f30377r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f30363a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f30377r.centerX(), this.f30377r.top);
            canvas.translate(0.0f, (1.0f - e) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f30377r);
            this.f30365c.setColor(org.telegram.ui.ActionBar.h6.l1(f10, -16777216));
            RectF rectF = this.f30377r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f30377r.height() / 2.0f, this.f30365c);
            this.f30375p.m(this.f30377r);
            canvas.save();
            float f12 = -d10;
            canvas.translate(((this.f30377r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f30377r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin(this.f30379t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin((this.f30379t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
            wo0 wo0Var = this.f30375p;
            wo0Var.f26946w = (int) (e * 255.0f);
            wo0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.f30377r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f30377r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin(this.f30379t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f30368i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin((this.f30379t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f30368i, this.d);
            canvas.restore();
            canvas.restore();
            e6 e6Var = this.f30374o;
            if (this.f30376q && this.f30369j) {
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
                    this.e.setCallback(new i.f(this, 3));
                    this.e.K(1);
                    this.e.start();
                }
                float dp = this.f30367g.f28363c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f30378s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f30377r;
                float height = (rectF3.height() * e) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f30377r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e7) + 0.75f;
                canvas.scale(f14, f14, this.f30378s.centerX(), this.f30378s.top);
                this.f30365c.setColor(org.telegram.ui.ActionBar.h6.l1(e7 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f30378s.centerX(), this.f30378s.top);
                canvas.drawPath(this.f30366f, this.f30365c);
                canvas.restore();
                canvas.drawRoundRect(this.f30378s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f30365c);
                this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f30378s.left), ((int) this.f30378s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f30378s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f30378s.centerY()));
                this.e.setAlpha((int) (255.0f * e7));
                if (!this.e.f25081k0) {
                    this.e.H(true);
                }
                this.e.draw(canvas);
                this.f30367g.c(this.f30378s.left + AndroidUtilities.dp(39.0f), this.f30378s.centerY(), e7, -1, canvas);
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
