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
public final class tn0 extends Drawable {
    public final boolean f32751a;
    public final Runnable f32752b;
    public final Paint f32753c = new Paint(1);
    public final Paint d;
    public mi0 f32754e;
    public final Path f32755f;
    public final nz0 f32756g;
    public final Path h;
    public final Path f32757i;
    public boolean f32758j;
    public int f32759k;
    public final y5 f32760l;
    public final y5 f32761m;
    public final y5 f32762n;
    public final y5 f32763o;
    public final sn0 f32764p;
    public boolean f32765q;
    public final RectF f32766r;
    public final RectF f32767s;
    public float f32768t;
    public long f32769u;
    public float v;
    public boolean f32770w;
    public final ib0 f32771x;

    public tn0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f32755f = path;
        this.f32756g = new nz0(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f32757i = path3;
        this.f32759k = 1;
        this.f32766r = new RectF();
        this.f32767s = new RectF();
        this.f32771x = new ib0(this, 27);
        this.f32752b = runnable;
        this.f32751a = z10;
        gr grVar = gr.h;
        y5 y5Var = new y5(runnable, 360L, grVar, 0);
        this.f32760l = y5Var;
        y5Var.d(0.0f, true);
        this.f32761m = new y5(runnable, 320L, grVar, 0);
        this.f32762n = new y5(runnable, 200L, grVar, 0);
        y5 y5Var2 = new y5(runnable, 360L, grVar, 0);
        this.f32763o = y5Var2;
        y5Var2.d(0.0f, true);
        sn0 sn0Var = new sn0(runnable);
        this.f32764p = sn0Var;
        sn0Var.v = 0.3f;
        sn0Var.f29350u = 0.4f;
        sn0Var.f29347r = 650L;
        sn0Var.f29349t = 1.6f;
        sn0Var.f29348s = grVar;
        sn0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        sn0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        sn0Var.r(-1);
        sn0Var.f29333b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f32765q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f32758j && this.f32760l.f34854c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f32758j = z10;
        this.f32752b.run();
        mi0 mi0Var = this.f32754e;
        if (mi0Var != null && this.f32765q) {
            if (z10) {
                mi0Var.F(false);
            } else {
                mi0Var.stop();
            }
        }
    }

    public final void c(float f10, boolean z10) {
        int i9;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f10)) {
            sn0 sn0Var = this.f32764p;
            sn0Var.b();
            sn0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f10))), z10, true);
            this.v = f10;
        }
        if (f10 > 0.0f) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        this.f32759k = i9;
        if (!z10) {
            this.f32761m.d(i9, true);
        }
        this.f32752b.run();
        if (this.f32765q && Math.abs(f10) > 3.0f && !this.f32770w) {
            this.f32770w = true;
            AndroidUtilities.runOnUIThread(this.f32771x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float d = this.f32764p.d() + AndroidUtilities.dp(46.0f);
        float e10 = this.f32760l.e(this.f32758j);
        float d9 = this.f32761m.d(this.f32759k, false);
        if (e10 > 0.0f) {
            float d10 = this.f32762n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f32769u)) / 1000.0f);
            this.f32769u = currentTimeMillis;
            this.f32768t = (Math.min(d10, 4.0f) * 1.5f * min) + this.f32768t;
            this.f32752b.run();
            float f10 = d / 2.0f;
            this.f32766r.set(bounds.centerX() - f10, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f10, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f11 = e10 * 0.4f;
            float f12 = 0.6f + f11;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f12 *= 0.75f;
                if (this.f32751a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f12, f12, this.f32766r.centerX(), this.f32766r.top);
            canvas.translate(0.0f, (1.0f - e10) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f32766r);
            this.f32753c.setColor(org.telegram.ui.ActionBar.f6.l1(f11, -16777216));
            RectF rectF = this.f32766r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f32766r.height() / 2.0f, this.f32753c);
            this.f32764p.m(this.f32766r);
            canvas.save();
            float f13 = -d9;
            canvas.translate(((this.f32766r.centerX() - f10) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f13)) * AndroidUtilities.dp(30.0f)), this.f32766r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.f6.l1(((((((float) Math.sin(this.f32768t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * e10, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.f6.l1(((((((float) Math.sin((this.f32768t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * e10, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d9, 0.0f);
            sn0 sn0Var = this.f32764p;
            sn0Var.f29351w = (int) (e10 * 255.0f);
            sn0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d9)) * AndroidUtilities.dp(30.0f)) + ((this.f32766r.centerX() + f10) - AndroidUtilities.dp(30.0f)), this.f32766r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.f6.l1(((((((float) Math.sin(this.f32768t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d9) * e10, -1));
            canvas.drawPath(this.f32757i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.f6.l1(((((((float) Math.sin((this.f32768t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d9) * e10, -1));
            canvas.drawPath(this.f32757i, this.d);
            canvas.restore();
            canvas.restore();
            y5 y5Var = this.f32763o;
            if (this.f32765q && this.f32758j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e11 = y5Var.e(z10);
            if (e11 > 0.0f) {
                if (this.f32754e == null) {
                    int i9 = R.raw.seek_speed_hint;
                    mi0 mi0Var = new mi0(i9, "" + R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.f32754e = mi0Var;
                    mi0Var.H(true);
                    this.f32754e.setCallback(new eg.a(this, 7));
                    this.f32754e.I(1);
                    this.f32754e.start();
                }
                float dp = this.f32756g.f31223c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f32767s;
                float f14 = dp / 2.0f;
                float centerX = bounds.centerX() - f14;
                RectF rectF3 = this.f32766r;
                float height = (rectF3.height() * e10) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f14;
                RectF rectF4 = this.f32766r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e10) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f15 = (0.25f * e11) + 0.75f;
                canvas.scale(f15, f15, this.f32767s.centerX(), this.f32767s.top);
                this.f32753c.setColor(org.telegram.ui.ActionBar.f6.l1(e11 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f32767s.centerX(), this.f32767s.top);
                canvas.drawPath(this.f32755f, this.f32753c);
                canvas.restore();
                canvas.drawRoundRect(this.f32767s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f32753c);
                this.f32754e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f32767s.left), ((int) this.f32767s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f32767s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f32767s.centerY()));
                this.f32754e.setAlpha((int) (255.0f * e11));
                if (!this.f32754e.f30852h0) {
                    this.f32754e.F(true);
                }
                this.f32754e.draw(canvas);
                this.f32756g.c(this.f32767s.left + AndroidUtilities.dp(39.0f), this.f32767s.centerY(), e11, -1, canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
