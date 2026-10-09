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
public final class pp0 extends Drawable {
    public final boolean f29901a;
    public final Runnable f29902b;
    public final Paint f29903c = new Paint(1);
    public final Paint d;
    public ck0 f29904e;
    public final Path f29905f;
    public final l11 f29906g;
    public final Path h;
    public final Path f29907i;
    public boolean f29908j;
    public int f29909k;
    public final g6 f29910l;
    public final g6 f29911m;
    public final g6 f29912n;
    public final g6 f29913o;
    public final op0 f29914p;
    public boolean f29915q;
    public final RectF f29916r;
    public final RectF f29917s;
    public float f29918t;
    public long f29919u;
    public float v;
    public boolean f29920w;
    public final bd0 f29921x;

    public pp0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f29905f = path;
        this.f29906g = new l11(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f29907i = path3;
        this.f29909k = 1;
        this.f29916r = new RectF();
        this.f29917s = new RectF();
        this.f29921x = new bd0(this, 27);
        this.f29902b = runnable;
        this.f29901a = z10;
        hs hsVar = hs.h;
        g6 g6Var = new g6(runnable, 360L, hsVar, 0);
        this.f29910l = g6Var;
        g6Var.d(0.0f, true);
        this.f29911m = new g6(runnable, 320L, hsVar, 0);
        this.f29912n = new g6(runnable, 200L, hsVar, 0);
        g6 g6Var2 = new g6(runnable, 360L, hsVar, 0);
        this.f29913o = g6Var2;
        g6Var2.d(0.0f, true);
        op0 op0Var = new op0(runnable);
        this.f29914p = op0Var;
        op0Var.A = 0.3f;
        op0Var.m(0.4f, 650L, 1.6f, hsVar);
        op0Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        op0Var.w(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        op0Var.u(-1);
        op0Var.f30065b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f29915q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f29908j && this.f29910l.f26599c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f29908j = z10;
        this.f29902b.run();
        ck0 ck0Var = this.f29904e;
        if (ck0Var != null && this.f29915q) {
            if (z10) {
                ck0Var.H(false);
            } else {
                ck0Var.stop();
            }
        }
    }

    public final void c(float f7, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            op0 op0Var = this.f29914p;
            op0Var.a();
            op0Var.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f29909k = i10;
        if (!z10) {
            this.f29911m.d(i10, true);
        }
        this.f29902b.run();
        if (this.f29915q && Math.abs(f7) > 3.0f && !this.f29920w) {
            this.f29920w = true;
            AndroidUtilities.runOnUIThread(this.f29921x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f29914p.c() + AndroidUtilities.dp(46.0f);
        float e7 = this.f29910l.e(this.f29908j);
        float d = this.f29911m.d(this.f29909k, false);
        if (e7 > 0.0f) {
            float d10 = this.f29912n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f29919u)) / 1000.0f);
            this.f29919u = currentTimeMillis;
            this.f29918t = (Math.min(d10, 4.0f) * 1.5f * min) + this.f29918t;
            this.f29902b.run();
            float f7 = c10 / 2.0f;
            this.f29916r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e7 * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f29901a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f29916r.centerX(), this.f29916r.top);
            canvas.translate(0.0f, (1.0f - e7) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f29916r);
            this.f29903c.setColor(org.telegram.ui.ActionBar.i6.m1(f10, -16777216));
            RectF rectF = this.f29916r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f29916r.height() / 2.0f, this.f29903c);
            this.f29914p.p(this.f29916r);
            canvas.save();
            float f12 = -d;
            canvas.translate(((this.f29916r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f29916r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.i6.m1(((((((float) Math.sin(this.f29918t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.i6.m1(((((((float) Math.sin((this.f29918t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d, 0.0f);
            op0 op0Var = this.f29914p;
            op0Var.B = (int) (e7 * 255.0f);
            op0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d)) * AndroidUtilities.dp(30.0f)) + ((this.f29916r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f29916r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.i6.m1(((((((float) Math.sin(this.f29918t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e7, -1));
            canvas.drawPath(this.f29907i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.i6.m1(((((((float) Math.sin((this.f29918t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e7, -1));
            canvas.drawPath(this.f29907i, this.d);
            canvas.restore();
            canvas.restore();
            g6 g6Var = this.f29913o;
            if (this.f29915q && this.f29908j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = g6Var.e(z10);
            if (e10 > 0.0f) {
                if (this.f29904e == null) {
                    ck0 ck0Var = new ck0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.f29904e = ck0Var;
                    ck0Var.J(true);
                    this.f29904e.setCallback(new i.f(this, 3));
                    this.f29904e.K(1);
                    this.f29904e.start();
                }
                float dp = this.f29906g.f28222c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f29917s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f29916r;
                float height = (rectF3.height() * e7) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f29916r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e7) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e10) + 0.75f;
                canvas.scale(f14, f14, this.f29917s.centerX(), this.f29917s.top);
                this.f29903c.setColor(org.telegram.ui.ActionBar.i6.m1(e10 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f29917s.centerX(), this.f29917s.top);
                canvas.drawPath(this.f29905f, this.f29903c);
                canvas.restore();
                canvas.drawRoundRect(this.f29917s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f29903c);
                this.f29904e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f29917s.left), ((int) this.f29917s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f29917s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f29917s.centerY()));
                this.f29904e.setAlpha((int) (255.0f * e10));
                if (!this.f29904e.f25409k0) {
                    this.f29904e.H(true);
                }
                this.f29904e.draw(canvas);
                this.f29906g.c(this.f29917s.left + AndroidUtilities.dp(39.0f), this.f29917s.centerY(), e10, -1, canvas);
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
