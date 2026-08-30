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
public final class oo0 extends Drawable {
    public final boolean f27616a;
    public final Runnable f27617b;
    public final Paint f27618c = new Paint(1);
    public final Paint d;
    public gj0 e;
    public final Path f27619f;
    public final k01 f27620g;
    public final Path h;
    public final Path f27621i;
    public boolean f27622j;
    public int f27623k;
    public final z5 f27624l;
    public final z5 f27625m;
    public final z5 f27626n;
    public final z5 f27627o;
    public final no0 f27628p;
    public boolean f27629q;
    public final RectF f27630r;
    public final RectF f27631s;
    public float f27632t;
    public long f27633u;
    public float v;
    public boolean f27634w;
    public final cc0 f27635x;

    public oo0(Runnable runnable, boolean z4) {
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f27619f = path;
        this.f27620g = new k01(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f27621i = path3;
        this.f27623k = 1;
        this.f27630r = new RectF();
        this.f27631s = new RectF();
        this.f27635x = new cc0(this, 27);
        this.f27617b = runnable;
        this.f27616a = z4;
        nr nrVar = nr.h;
        z5 z5Var = new z5(runnable, 360L, nrVar, 0);
        this.f27624l = z5Var;
        z5Var.d(0.0f, true);
        this.f27625m = new z5(runnable, 320L, nrVar, 0);
        this.f27626n = new z5(runnable, 200L, nrVar, 0);
        z5 z5Var2 = new z5(runnable, 360L, nrVar, 0);
        this.f27627o = z5Var2;
        z5Var2.d(0.0f, true);
        no0 no0Var = new no0(runnable);
        this.f27628p = no0Var;
        no0Var.v = 0.3f;
        no0Var.f25900u = 0.4f;
        no0Var.f25897r = 650L;
        no0Var.f25899t = 1.6f;
        no0Var.f25898s = nrVar;
        no0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        no0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        no0Var.r(-1);
        no0Var.f25884b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f27629q = (z4 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f27622j && this.f27624l.f31241c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z4) {
        this.f27622j = z4;
        this.f27617b.run();
        gj0 gj0Var = this.e;
        if (gj0Var != null && this.f27629q) {
            if (z4) {
                gj0Var.F(false);
            } else {
                gj0Var.stop();
            }
        }
    }

    public final void c(float f10, boolean z4) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f10)) {
            no0 no0Var = this.f27628p;
            no0Var.b();
            no0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f10))), z4, true);
            this.v = f10;
        }
        if (f10 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f27623k = i10;
        if (!z4) {
            this.f27625m.d(i10, true);
        }
        this.f27617b.run();
        if (this.f27629q && Math.abs(f10) > 3.0f && !this.f27634w) {
            this.f27634w = true;
            AndroidUtilities.runOnUIThread(this.f27635x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z4;
        Rect bounds = getBounds();
        float d = this.f27628p.d() + AndroidUtilities.dp(46.0f);
        float e = this.f27624l.e(this.f27622j);
        float d10 = this.f27625m.d(this.f27623k, false);
        if (e > 0.0f) {
            float d11 = this.f27626n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f27633u)) / 1000.0f);
            this.f27633u = currentTimeMillis;
            this.f27632t = (Math.min(d11, 4.0f) * 1.5f * min) + this.f27632t;
            this.f27617b.run();
            float f10 = d / 2.0f;
            this.f27630r.set(bounds.centerX() - f10, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f10, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f11 = e * 0.4f;
            float f12 = 0.6f + f11;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f12 *= 0.75f;
                if (this.f27616a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f12, f12, this.f27630r.centerX(), this.f27630r.top);
            canvas.translate(0.0f, (1.0f - e) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f27630r);
            this.f27618c.setColor(org.telegram.ui.ActionBar.j6.l1(f11, -16777216));
            RectF rectF = this.f27630r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f27630r.height() / 2.0f, this.f27618c);
            this.f27628p.m(this.f27630r);
            canvas.save();
            float f13 = -d10;
            canvas.translate(((this.f27630r.centerX() - f10) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f13)) * AndroidUtilities.dp(30.0f)), this.f27630r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin(this.f27632t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin((this.f27632t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
            no0 no0Var = this.f27628p;
            no0Var.f25901w = (int) (e * 255.0f);
            no0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.f27630r.centerX() + f10) - AndroidUtilities.dp(30.0f)), this.f27630r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin(this.f27632t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f27621i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin((this.f27632t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f27621i, this.d);
            canvas.restore();
            canvas.restore();
            z5 z5Var = this.f27627o;
            if (this.f27629q && this.f27622j) {
                z4 = true;
            } else {
                z4 = false;
            }
            float e6 = z5Var.e(z4);
            if (e6 > 0.0f) {
                if (this.e == null) {
                    int i10 = R.raw.seek_speed_hint;
                    gj0 gj0Var = new gj0(i10, "" + R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.e = gj0Var;
                    gj0Var.H(true);
                    this.e.setCallback(new i.f(this, 7));
                    this.e.I(1);
                    this.e.start();
                }
                float dp = this.f27620g.f26084c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f27631s;
                float f14 = dp / 2.0f;
                float centerX = bounds.centerX() - f14;
                RectF rectF3 = this.f27630r;
                float height = (rectF3.height() * e) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f14;
                RectF rectF4 = this.f27630r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f15 = (0.25f * e6) + 0.75f;
                canvas.scale(f15, f15, this.f27631s.centerX(), this.f27631s.top);
                this.f27618c.setColor(org.telegram.ui.ActionBar.j6.l1(e6 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f27631s.centerX(), this.f27631s.top);
                canvas.drawPath(this.f27619f, this.f27618c);
                canvas.restore();
                canvas.drawRoundRect(this.f27631s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f27618c);
                this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f27631s.left), ((int) this.f27631s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f27631s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f27631s.centerY()));
                this.e.setAlpha((int) (255.0f * e6));
                if (!this.e.f25158i0) {
                    this.e.F(true);
                }
                this.e.draw(canvas);
                this.f27620g.c(this.f27631s.left + AndroidUtilities.dp(39.0f), this.f27631s.centerY(), e6, -1, canvas);
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
