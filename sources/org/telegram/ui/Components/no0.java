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
public final class no0 extends Drawable {
    public final boolean f27324a;
    public final Runnable f27325b;
    public final Paint f27326c = new Paint(1);
    public final Paint d;
    public gj0 e;
    public final Path f27327f;
    public final k01 f27328g;
    public final Path h;
    public final Path f27329i;
    public boolean f27330j;
    public int f27331k;
    public final z5 f27332l;
    public final z5 f27333m;
    public final z5 f27334n;
    public final z5 f27335o;
    public final mo0 f27336p;
    public boolean f27337q;
    public final RectF f27338r;
    public final RectF f27339s;
    public float f27340t;
    public long f27341u;
    public float v;
    public boolean f27342w;
    public final dc0 f27343x;

    public no0(Runnable runnable, boolean z4) {
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f27327f = path;
        this.f27328g = new k01(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f27329i = path3;
        this.f27331k = 1;
        this.f27338r = new RectF();
        this.f27339s = new RectF();
        this.f27343x = new dc0(this, 27);
        this.f27325b = runnable;
        this.f27324a = z4;
        mr mrVar = mr.h;
        z5 z5Var = new z5(runnable, 360L, mrVar, 0);
        this.f27332l = z5Var;
        z5Var.d(0.0f, true);
        this.f27333m = new z5(runnable, 320L, mrVar, 0);
        this.f27334n = new z5(runnable, 200L, mrVar, 0);
        z5 z5Var2 = new z5(runnable, 360L, mrVar, 0);
        this.f27335o = z5Var2;
        z5Var2.d(0.0f, true);
        mo0 mo0Var = new mo0(runnable);
        this.f27336p = mo0Var;
        mo0Var.v = 0.3f;
        mo0Var.f25863u = 0.4f;
        mo0Var.f25860r = 650L;
        mo0Var.f25862t = 1.6f;
        mo0Var.f25861s = mrVar;
        mo0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        mo0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        mo0Var.r(-1);
        mo0Var.f25847b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f27337q = (z4 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f27330j && this.f27332l.f31253c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z4) {
        this.f27330j = z4;
        this.f27325b.run();
        gj0 gj0Var = this.e;
        if (gj0Var != null && this.f27337q) {
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
            mo0 mo0Var = this.f27336p;
            mo0Var.b();
            mo0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f10))), z4, true);
            this.v = f10;
        }
        if (f10 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f27331k = i10;
        if (!z4) {
            this.f27333m.d(i10, true);
        }
        this.f27325b.run();
        if (this.f27337q && Math.abs(f10) > 3.0f && !this.f27342w) {
            this.f27342w = true;
            AndroidUtilities.runOnUIThread(this.f27343x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z4;
        Rect bounds = getBounds();
        float d = this.f27336p.d() + AndroidUtilities.dp(46.0f);
        float e = this.f27332l.e(this.f27330j);
        float d10 = this.f27333m.d(this.f27331k, false);
        if (e > 0.0f) {
            float d11 = this.f27334n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f27341u)) / 1000.0f);
            this.f27341u = currentTimeMillis;
            this.f27340t = (Math.min(d11, 4.0f) * 1.5f * min) + this.f27340t;
            this.f27325b.run();
            float f10 = d / 2.0f;
            this.f27338r.set(bounds.centerX() - f10, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f10, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f11 = e * 0.4f;
            float f12 = 0.6f + f11;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f12 *= 0.75f;
                if (this.f27324a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f12, f12, this.f27338r.centerX(), this.f27338r.top);
            canvas.translate(0.0f, (1.0f - e) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f27338r);
            this.f27326c.setColor(org.telegram.ui.ActionBar.j6.l1(f11, -16777216));
            RectF rectF = this.f27338r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f27338r.height() / 2.0f, this.f27326c);
            this.f27336p.m(this.f27338r);
            canvas.save();
            float f13 = -d10;
            canvas.translate(((this.f27338r.centerX() - f10) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f13)) * AndroidUtilities.dp(30.0f)), this.f27338r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin(this.f27340t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin((this.f27340t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
            mo0 mo0Var = this.f27336p;
            mo0Var.f25864w = (int) (e * 255.0f);
            mo0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.f27338r.centerX() + f10) - AndroidUtilities.dp(30.0f)), this.f27338r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin(this.f27340t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f27329i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin((this.f27340t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f27329i, this.d);
            canvas.restore();
            canvas.restore();
            z5 z5Var = this.f27335o;
            if (this.f27337q && this.f27330j) {
                z4 = true;
            } else {
                z4 = false;
            }
            float e6 = z5Var.e(z4);
            if (e6 > 0.0f) {
                if (this.e == null) {
                    gj0 gj0Var = new gj0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.e = gj0Var;
                    gj0Var.H(true);
                    this.e.setCallback(new i.f(this, 7));
                    this.e.I(1);
                    this.e.start();
                }
                float dp = this.f27328g.f26124c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f27339s;
                float f14 = dp / 2.0f;
                float centerX = bounds.centerX() - f14;
                RectF rectF3 = this.f27338r;
                float height = (rectF3.height() * e) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f14;
                RectF rectF4 = this.f27338r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f15 = (0.25f * e6) + 0.75f;
                canvas.scale(f15, f15, this.f27339s.centerX(), this.f27339s.top);
                this.f27326c.setColor(org.telegram.ui.ActionBar.j6.l1(e6 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f27339s.centerX(), this.f27339s.top);
                canvas.drawPath(this.f27327f, this.f27326c);
                canvas.restore();
                canvas.drawRoundRect(this.f27339s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f27326c);
                this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f27339s.left), ((int) this.f27339s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f27339s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f27339s.centerY()));
                this.e.setAlpha((int) (255.0f * e6));
                if (!this.e.f25164i0) {
                    this.e.F(true);
                }
                this.e.draw(canvas);
                this.f27328g.c(this.f27339s.left + AndroidUtilities.dp(39.0f), this.f27339s.centerY(), e6, -1, canvas);
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
