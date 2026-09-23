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
public final class ko0 extends Drawable {
    public final boolean f25643a;
    public final Runnable f25644b;
    public final Paint f25645c = new Paint(1);
    public final Paint d;
    public yi0 e;
    public final Path f25646f;
    public final f01 f25647g;
    public final Path h;
    public final Path f25648i;
    public boolean f25649j;
    public int f25650k;
    public final e6 f25651l;
    public final e6 f25652m;
    public final e6 f25653n;
    public final e6 f25654o;
    public final jo0 f25655p;
    public boolean f25656q;
    public final RectF f25657r;
    public final RectF f25658s;
    public float f25659t;
    public long f25660u;
    public float v;
    public boolean f25661w;
    public final ac0 f25662x;

    public ko0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f25646f = path;
        this.f25647g = new f01(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f25648i = path3;
        this.f25650k = 1;
        this.f25657r = new RectF();
        this.f25658s = new RectF();
        this.f25662x = new ac0(this, 27);
        this.f25644b = runnable;
        this.f25643a = z10;
        rr rrVar = rr.h;
        e6 e6Var = new e6(runnable, 360L, rrVar, 0);
        this.f25651l = e6Var;
        e6Var.d(0.0f, true);
        this.f25652m = new e6(runnable, 320L, rrVar, 0);
        this.f25653n = new e6(runnable, 200L, rrVar, 0);
        e6 e6Var2 = new e6(runnable, 360L, rrVar, 0);
        this.f25654o = e6Var2;
        e6Var2.d(0.0f, true);
        jo0 jo0Var = new jo0(runnable);
        this.f25655p = jo0Var;
        jo0Var.v = 0.3f;
        jo0Var.f26630u = 0.4f;
        jo0Var.f26627r = 650L;
        jo0Var.f26629t = 1.6f;
        jo0Var.f26628s = rrVar;
        jo0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        jo0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        jo0Var.r(-1);
        jo0Var.f26614b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f25656q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f25649j && this.f25651l.f23575c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f25649j = z10;
        this.f25644b.run();
        yi0 yi0Var = this.e;
        if (yi0Var != null && this.f25656q) {
            if (z10) {
                yi0Var.H(false);
            } else {
                yi0Var.stop();
            }
        }
    }

    public final void c(float f7, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            jo0 jo0Var = this.f25655p;
            jo0Var.b();
            jo0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f25650k = i10;
        if (!z10) {
            this.f25652m.d(i10, true);
        }
        this.f25644b.run();
        if (this.f25656q && Math.abs(f7) > 3.0f && !this.f25661w) {
            this.f25661w = true;
            AndroidUtilities.runOnUIThread(this.f25662x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float d = this.f25655p.d() + AndroidUtilities.dp(46.0f);
        float e = this.f25651l.e(this.f25649j);
        float d10 = this.f25652m.d(this.f25650k, false);
        if (e > 0.0f) {
            float d11 = this.f25653n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f25660u)) / 1000.0f);
            this.f25660u = currentTimeMillis;
            this.f25659t = (Math.min(d11, 4.0f) * 1.5f * min) + this.f25659t;
            this.f25644b.run();
            float f7 = d / 2.0f;
            this.f25657r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f25643a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f25657r.centerX(), this.f25657r.top);
            canvas.translate(0.0f, (1.0f - e) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f25657r);
            this.f25645c.setColor(org.telegram.ui.ActionBar.h6.l1(f10, -16777216));
            RectF rectF = this.f25657r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f25657r.height() / 2.0f, this.f25645c);
            this.f25655p.m(this.f25657r);
            canvas.save();
            float f12 = -d10;
            canvas.translate(((this.f25657r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f25657r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin(this.f25659t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin((this.f25659t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
            jo0 jo0Var = this.f25655p;
            jo0Var.f26631w = (int) (e * 255.0f);
            jo0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.f25657r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f25657r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin(this.f25659t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f25648i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin((this.f25659t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f25648i, this.d);
            canvas.restore();
            canvas.restore();
            e6 e6Var = this.f25654o;
            if (this.f25656q && this.f25649j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = e6Var.e(z10);
            if (e7 > 0.0f) {
                if (this.e == null) {
                    yi0 yi0Var = new yi0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.e = yi0Var;
                    yi0Var.J(true);
                    this.e.setCallback(new i.f(this, 3));
                    this.e.K(1);
                    this.e.start();
                }
                float dp = this.f25647g.f23785c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f25658s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f25657r;
                float height = (rectF3.height() * e) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f25657r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e7) + 0.75f;
                canvas.scale(f14, f14, this.f25658s.centerX(), this.f25658s.top);
                this.f25645c.setColor(org.telegram.ui.ActionBar.h6.l1(e7 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f25658s.centerX(), this.f25658s.top);
                canvas.drawPath(this.f25646f, this.f25645c);
                canvas.restore();
                canvas.drawRoundRect(this.f25658s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f25645c);
                this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f25658s.left), ((int) this.f25658s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f25658s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f25658s.centerY()));
                this.e.setAlpha((int) (255.0f * e7));
                if (!this.e.f30271k0) {
                    this.e.H(true);
                }
                this.e.draw(canvas);
                this.f25647g.c(this.f25658s.left + AndroidUtilities.dp(39.0f), this.f25658s.centerY(), e7, -1, canvas);
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
