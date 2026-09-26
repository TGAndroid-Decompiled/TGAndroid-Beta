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
    public final boolean f30665a;
    public final Runnable f30666b;
    public final Paint f30667c = new Paint(1);
    public final Paint d;
    public jj0 e;
    public final Path f30668f;
    public final u01 f30669g;
    public final Path h;
    public final Path f30670i;
    public boolean f30671j;
    public int f30672k;
    public final e6 f30673l;
    public final e6 f30674m;
    public final e6 f30675n;
    public final e6 f30676o;
    public final xo0 f30677p;
    public boolean f30678q;
    public final RectF f30679r;
    public final RectF f30680s;
    public float f30681t;
    public long f30682u;
    public float v;
    public boolean f30683w;
    public final jc0 f30684x;

    public yo0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f30668f = path;
        this.f30669g = new u01(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f30670i = path3;
        this.f30672k = 1;
        this.f30679r = new RectF();
        this.f30680s = new RectF();
        this.f30684x = new jc0(this, 28);
        this.f30666b = runnable;
        this.f30665a = z10;
        sr srVar = sr.h;
        e6 e6Var = new e6(runnable, 360L, srVar, 0);
        this.f30673l = e6Var;
        e6Var.d(0.0f, true);
        this.f30674m = new e6(runnable, 320L, srVar, 0);
        this.f30675n = new e6(runnable, 200L, srVar, 0);
        e6 e6Var2 = new e6(runnable, 360L, srVar, 0);
        this.f30676o = e6Var2;
        e6Var2.d(0.0f, true);
        xo0 xo0Var = new xo0(runnable);
        this.f30677p = xo0Var;
        xo0Var.v = 0.3f;
        xo0Var.f26978u = 0.4f;
        xo0Var.f26975r = 650L;
        xo0Var.f26977t = 1.6f;
        xo0Var.f26976s = srVar;
        xo0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        xo0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        xo0Var.r(-1);
        xo0Var.f26962b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f30678q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f30671j && this.f30673l.f23850c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f30671j = z10;
        this.f30666b.run();
        jj0 jj0Var = this.e;
        if (jj0Var != null && this.f30678q) {
            if (z10) {
                jj0Var.H(false);
            } else {
                jj0Var.stop();
            }
        }
    }

    public final void c(float f7, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            xo0 xo0Var = this.f30677p;
            xo0Var.b();
            xo0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f30672k = i10;
        if (!z10) {
            this.f30674m.d(i10, true);
        }
        this.f30666b.run();
        if (this.f30678q && Math.abs(f7) > 3.0f && !this.f30683w) {
            this.f30683w = true;
            AndroidUtilities.runOnUIThread(this.f30684x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float d = this.f30677p.d() + AndroidUtilities.dp(46.0f);
        float e = this.f30673l.e(this.f30671j);
        float d10 = this.f30674m.d(this.f30672k, false);
        if (e > 0.0f) {
            float d11 = this.f30675n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f30682u)) / 1000.0f);
            this.f30682u = currentTimeMillis;
            this.f30681t = (Math.min(d11, 4.0f) * 1.5f * min) + this.f30681t;
            this.f30666b.run();
            float f7 = d / 2.0f;
            this.f30679r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f30665a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f30679r.centerX(), this.f30679r.top);
            canvas.translate(0.0f, (1.0f - e) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f30679r);
            this.f30667c.setColor(org.telegram.ui.ActionBar.h6.l1(f10, -16777216));
            RectF rectF = this.f30679r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f30679r.height() / 2.0f, this.f30667c);
            this.f30677p.m(this.f30679r);
            canvas.save();
            float f12 = -d10;
            canvas.translate(((this.f30679r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f30679r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin(this.f30681t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin((this.f30681t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
            xo0 xo0Var = this.f30677p;
            xo0Var.f26979w = (int) (e * 255.0f);
            xo0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.f30679r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f30679r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin(this.f30681t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f30670i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin((this.f30681t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f30670i, this.d);
            canvas.restore();
            canvas.restore();
            e6 e6Var = this.f30676o;
            if (this.f30678q && this.f30671j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = e6Var.e(z10);
            if (e7 > 0.0f) {
                if (this.e == null) {
                    jj0 jj0Var = new jj0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.e = jj0Var;
                    jj0Var.J(true);
                    this.e.setCallback(new i.f(this, 3));
                    this.e.K(1);
                    this.e.start();
                }
                float dp = this.f30669g.f28649c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f30680s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f30679r;
                float height = (rectF3.height() * e) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f30679r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e7) + 0.75f;
                canvas.scale(f14, f14, this.f30680s.centerX(), this.f30680s.top);
                this.f30667c.setColor(org.telegram.ui.ActionBar.h6.l1(e7 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f30680s.centerX(), this.f30680s.top);
                canvas.drawPath(this.f30668f, this.f30667c);
                canvas.restore();
                canvas.drawRoundRect(this.f30680s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f30667c);
                this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f30680s.left), ((int) this.f30680s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f30680s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f30680s.centerY()));
                this.e.setAlpha((int) (255.0f * e7));
                if (!this.e.f25435k0) {
                    this.e.H(true);
                }
                this.e.draw(canvas);
                this.f30669g.c(this.f30680s.left + AndroidUtilities.dp(39.0f), this.f30680s.centerY(), e7, -1, canvas);
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
