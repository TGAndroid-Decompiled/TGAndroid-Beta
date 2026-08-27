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

public final class un0 extends Drawable {

    public final boolean f33140a;

    public final Runnable f33141b;

    public final Paint f33142c = new Paint(1);
    public final Paint d;

    public oi0 f33143e;

    public final Path f33144f;

    public final pz0 f33145g;
    public final Path h;

    public final Path f33146i;

    public boolean f33147j;

    public int f33148k;

    public final y5 f33149l;

    public final y5 f33150m;

    public final y5 f33151n;

    public final y5 f33152o;

    public final tn0 f33153p;

    public boolean f33154q;

    public final RectF f33155r;

    public final RectF f33156s;

    public float f33157t;

    public long f33158u;
    public float v;

    public boolean f33159w;

    public final mb0 f33160x;

    public un0(Runnable runnable, boolean z10) {
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f33144f = path;
        this.f33145g = new pz0(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f33146i = path3;
        this.f33148k = 1;
        this.f33155r = new RectF();
        this.f33156s = new RectF();
        this.f33160x = new mb0(this, 27);
        this.f33141b = runnable;
        this.f33140a = z10;
        er erVar = er.h;
        y5 y5Var = new y5(runnable, 360L, erVar, 0);
        this.f33149l = y5Var;
        y5Var.d(0.0f, true);
        this.f33150m = new y5(runnable, 320L, erVar, 0);
        this.f33151n = new y5(runnable, 200L, erVar, 0);
        y5 y5Var2 = new y5(runnable, 360L, erVar, 0);
        this.f33152o = y5Var2;
        y5Var2.d(0.0f, true);
        tn0 tn0Var = new tn0(runnable);
        this.f33153p = tn0Var;
        tn0Var.v = 0.3f;
        tn0Var.f29256u = 0.4f;
        tn0Var.f29253r = 650L;
        tn0Var.f29255t = 1.6f;
        tn0Var.f29254s = erVar;
        tn0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        tn0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        tn0Var.r(-1);
        tn0Var.f29239b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f33154q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : true;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        return this.f33147j || this.f33149l.f34812c > 0.0f;
    }

    public final void b(boolean z10) {
        this.f33147j = z10;
        this.f33141b.run();
        oi0 oi0Var = this.f33143e;
        if (oi0Var == null || !this.f33154q) {
            return;
        }
        if (z10) {
            oi0Var.F(false);
        } else {
            oi0Var.stop();
        }
    }

    public final void c(float f10, boolean z10) {
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f10)) {
            tn0 tn0Var = this.f33153p;
            tn0Var.b();
            tn0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f10))), z10, true);
            this.v = f10;
        }
        int i10 = f10 > 0.0f ? 1 : -1;
        this.f33148k = i10;
        if (!z10) {
            this.f33150m.d(i10, true);
        }
        this.f33141b.run();
        if (!this.f33154q || Math.abs(f10) <= 3.0f || this.f33159w) {
            return;
        }
        this.f33159w = true;
        AndroidUtilities.runOnUIThread(this.f33160x, 2500L);
        MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float fD = this.f33153p.d() + AndroidUtilities.dp(46.0f);
        float fE = this.f33149l.e(this.f33147j);
        float fD2 = this.f33150m.d(this.f33148k, false);
        if (fE <= 0.0f) {
            return;
        }
        float fD3 = this.f33151n.d(Math.abs(this.v), false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        float fMin = Math.min(0.016f, (jCurrentTimeMillis - this.f33158u) / 1000.0f);
        this.f33158u = jCurrentTimeMillis;
        this.f33157t = (Math.min(fD3, 4.0f) * 1.5f * fMin) + this.f33157t;
        this.f33141b.run();
        float f10 = fD / 2.0f;
        this.f33155r.set(bounds.centerX() - f10, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f10, AndroidUtilities.dp(37.0f) + bounds.top);
        canvas.save();
        float f11 = fE * 0.4f;
        float f12 = 0.6f + f11;
        if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
            f12 *= 0.75f;
            if (this.f33140a) {
                canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
            }
        }
        canvas.scale(f12, f12, this.f33155r.centerX(), this.f33155r.top);
        canvas.translate(0.0f, (1.0f - fE) * (-AndroidUtilities.dp(15.0f)));
        canvas.clipRect(this.f33155r);
        this.f33142c.setColor(org.telegram.ui.ActionBar.g6.l1(f11, -16777216));
        RectF rectF = this.f33155r;
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f33155r.height() / 2.0f, this.f33142c);
        this.f33153p.m(this.f33155r);
        canvas.save();
        float f13 = -fD2;
        canvas.translate(((this.f33155r.centerX() - f10) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f13)) * AndroidUtilities.dp(30.0f)), this.f33155r.centerY());
        this.d.setColor(org.telegram.ui.ActionBar.g6.l1(((((((float) Math.sin(((double) this.f33157t) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * fE, -1));
        canvas.drawPath(this.h, this.d);
        canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
        this.d.setColor(org.telegram.ui.ActionBar.g6.l1(((((((float) Math.sin(((double) (this.f33157t + 0.17f)) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * fE, -1));
        canvas.drawPath(this.h, this.d);
        canvas.restore();
        canvas.save();
        canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * fD2, 0.0f);
        tn0 tn0Var = this.f33153p;
        tn0Var.f29257w = (int) (fE * 255.0f);
        tn0Var.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(((1.0f - Math.max(0.0f, fD2)) * AndroidUtilities.dp(30.0f)) + ((this.f33155r.centerX() + f10) - AndroidUtilities.dp(30.0f)), this.f33155r.centerY());
        this.d.setColor(org.telegram.ui.ActionBar.g6.l1(((((((float) Math.sin(((double) this.f33157t) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, fD2) * fE, -1));
        canvas.drawPath(this.f33146i, this.d);
        canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
        this.d.setColor(org.telegram.ui.ActionBar.g6.l1(((((((float) Math.sin(((double) (this.f33157t - 0.17f)) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, fD2) * fE, -1));
        canvas.drawPath(this.f33146i, this.d);
        canvas.restore();
        canvas.restore();
        float fE2 = this.f33152o.e(this.f33154q && this.f33147j);
        if (fE2 > 0.0f) {
            if (this.f33143e == null) {
                oi0 oi0Var = new oi0(R.raw.seek_speed_hint, "" + R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                this.f33143e = oi0Var;
                oi0Var.H(true);
                this.f33143e.setCallback(new fg.a(this, 7));
                this.f33143e.I(1);
                this.f33143e.start();
            }
            float fDp = this.f33145g.f31697c + AndroidUtilities.dp(54.0f);
            float fDp2 = AndroidUtilities.dp(32.0f);
            RectF rectF2 = this.f33156s;
            float f14 = fDp / 2.0f;
            float fCenterX = bounds.centerX() - f14;
            RectF rectF3 = this.f33155r;
            float fHeight = (rectF3.height() * fE) + rectF3.top + AndroidUtilities.dp(11.0f);
            float fCenterX2 = bounds.centerX() + f14;
            RectF rectF4 = this.f33155r;
            rectF2.set(fCenterX, fHeight, fCenterX2, (rectF4.height() * fE) + rectF4.top + AndroidUtilities.dp(11.0f) + fDp2);
            canvas.save();
            float f15 = (0.25f * fE2) + 0.75f;
            canvas.scale(f15, f15, this.f33156s.centerX(), this.f33156s.top);
            this.f33142c.setColor(org.telegram.ui.ActionBar.g6.l1(fE2 * 0.4f, -16777216));
            canvas.save();
            canvas.translate(this.f33156s.centerX(), this.f33156s.top);
            canvas.drawPath(this.f33144f, this.f33142c);
            canvas.restore();
            canvas.drawRoundRect(this.f33156s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f33142c);
            this.f33143e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f33156s.left), ((int) this.f33156s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f33156s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f33156s.centerY()));
            this.f33143e.setAlpha((int) (255.0f * fE2));
            if (!this.f33143e.f31317h0) {
                this.f33143e.F(true);
            }
            this.f33143e.draw(canvas);
            this.f33145g.c(this.f33156s.left + AndroidUtilities.dp(39.0f), this.f33156s.centerY(), fE2, -1, canvas);
            canvas.restore();
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
