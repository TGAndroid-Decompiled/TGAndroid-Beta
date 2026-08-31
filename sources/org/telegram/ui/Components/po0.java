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
public final class po0 extends Drawable {
    public final boolean f30140a;
    public final Runnable f30141b;
    public final Paint f30142c = new Paint(1);
    public final Paint d;
    public ij0 f30143e;
    public final Path f30144f;
    public final l01 f30145g;
    public final Path h;
    public final Path f30146i;
    public boolean f30147j;
    public int f30148k;
    public final z5 f30149l;
    public final z5 f30150m;
    public final z5 f30151n;
    public final z5 f30152o;
    public final oo0 f30153p;
    public boolean f30154q;
    public final RectF f30155r;
    public final RectF f30156s;
    public float f30157t;
    public long f30158u;
    public float v;
    public boolean f30159w;
    public final ec0 f30160x;

    public po0(Runnable runnable, boolean z4) {
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f30144f = path;
        this.f30145g = new l01(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f30146i = path3;
        this.f30148k = 1;
        this.f30155r = new RectF();
        this.f30156s = new RectF();
        this.f30160x = new ec0(this, 27);
        this.f30141b = runnable;
        this.f30140a = z4;
        pr prVar = pr.h;
        z5 z5Var = new z5(runnable, 360L, prVar, 0);
        this.f30149l = z5Var;
        z5Var.d(0.0f, true);
        this.f30150m = new z5(runnable, 320L, prVar, 0);
        this.f30151n = new z5(runnable, 200L, prVar, 0);
        z5 z5Var2 = new z5(runnable, 360L, prVar, 0);
        this.f30152o = z5Var2;
        z5Var2.d(0.0f, true);
        oo0 oo0Var = new oo0(runnable);
        this.f30153p = oo0Var;
        oo0Var.v = 0.3f;
        oo0Var.f28046u = 0.4f;
        oo0Var.f28043r = 650L;
        oo0Var.f28045t = 1.6f;
        oo0Var.f28044s = prVar;
        oo0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        oo0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        oo0Var.r(-1);
        oo0Var.f28029b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f30154q = (z4 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f30147j && this.f30149l.f33725c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z4) {
        this.f30147j = z4;
        this.f30141b.run();
        ij0 ij0Var = this.f30143e;
        if (ij0Var != null && this.f30154q) {
            if (z4) {
                ij0Var.F(false);
            } else {
                ij0Var.stop();
            }
        }
    }

    public final void c(float f10, boolean z4) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f10)) {
            oo0 oo0Var = this.f30153p;
            oo0Var.b();
            oo0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f10))), z4, true);
            this.v = f10;
        }
        if (f10 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f30148k = i10;
        if (!z4) {
            this.f30150m.d(i10, true);
        }
        this.f30141b.run();
        if (this.f30154q && Math.abs(f10) > 3.0f && !this.f30159w) {
            this.f30159w = true;
            AndroidUtilities.runOnUIThread(this.f30160x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z4;
        Rect bounds = getBounds();
        float d = this.f30153p.d() + AndroidUtilities.dp(46.0f);
        float e6 = this.f30149l.e(this.f30147j);
        float d10 = this.f30150m.d(this.f30148k, false);
        if (e6 > 0.0f) {
            float d11 = this.f30151n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f30158u)) / 1000.0f);
            this.f30158u = currentTimeMillis;
            this.f30157t = (Math.min(d11, 4.0f) * 1.5f * min) + this.f30157t;
            this.f30141b.run();
            float f10 = d / 2.0f;
            this.f30155r.set(bounds.centerX() - f10, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f10, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f11 = e6 * 0.4f;
            float f12 = 0.6f + f11;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f12 *= 0.75f;
                if (this.f30140a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f12, f12, this.f30155r.centerX(), this.f30155r.top);
            canvas.translate(0.0f, (1.0f - e6) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f30155r);
            this.f30142c.setColor(org.telegram.ui.ActionBar.k6.l1(f11, -16777216));
            RectF rectF = this.f30155r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f30155r.height() / 2.0f, this.f30142c);
            this.f30153p.m(this.f30155r);
            canvas.save();
            float f13 = -d10;
            canvas.translate(((this.f30155r.centerX() - f10) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f13)) * AndroidUtilities.dp(30.0f)), this.f30155r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.k6.l1(((((((float) Math.sin(this.f30157t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * e6, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.k6.l1(((((((float) Math.sin((this.f30157t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * e6, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
            oo0 oo0Var = this.f30153p;
            oo0Var.f28047w = (int) (e6 * 255.0f);
            oo0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.f30155r.centerX() + f10) - AndroidUtilities.dp(30.0f)), this.f30155r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.k6.l1(((((((float) Math.sin(this.f30157t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e6, -1));
            canvas.drawPath(this.f30146i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.k6.l1(((((((float) Math.sin((this.f30157t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e6, -1));
            canvas.drawPath(this.f30146i, this.d);
            canvas.restore();
            canvas.restore();
            z5 z5Var = this.f30152o;
            if (this.f30154q && this.f30147j) {
                z4 = true;
            } else {
                z4 = false;
            }
            float e10 = z5Var.e(z4);
            if (e10 > 0.0f) {
                if (this.f30143e == null) {
                    int i10 = R.raw.seek_speed_hint;
                    ij0 ij0Var = new ij0(i10, "" + R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.f30143e = ij0Var;
                    ij0Var.H(true);
                    this.f30143e.setCallback(new i.f(this, 7));
                    this.f30143e.I(1);
                    this.f30143e.start();
                }
                float dp = this.f30145g.f28521c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f30156s;
                float f14 = dp / 2.0f;
                float centerX = bounds.centerX() - f14;
                RectF rectF3 = this.f30155r;
                float height = (rectF3.height() * e6) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f14;
                RectF rectF4 = this.f30155r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e6) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f15 = (0.25f * e10) + 0.75f;
                canvas.scale(f15, f15, this.f30156s.centerX(), this.f30156s.top);
                this.f30142c.setColor(org.telegram.ui.ActionBar.k6.l1(e10 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f30156s.centerX(), this.f30156s.top);
                canvas.drawPath(this.f30144f, this.f30142c);
                canvas.restore();
                canvas.drawRoundRect(this.f30156s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f30142c);
                this.f30143e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f30156s.left), ((int) this.f30156s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f30156s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f30156s.centerY()));
                this.f30143e.setAlpha((int) (255.0f * e10));
                if (!this.f30143e.f27823i0) {
                    this.f30143e.F(true);
                }
                this.f30143e.draw(canvas);
                this.f30145g.c(this.f30156s.left + AndroidUtilities.dp(39.0f), this.f30156s.centerY(), e10, -1, canvas);
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
