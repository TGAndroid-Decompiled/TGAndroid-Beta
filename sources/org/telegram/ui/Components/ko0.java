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
    public final boolean f27889a;
    public final Runnable f27890b;
    public final Paint f27891c = new Paint(1);
    public final Paint d;
    public xi0 f27892e;
    public final Path f27893f;
    public final f01 f27894g;
    public final Path h;
    public final Path f27895i;
    public boolean f27896j;
    public int f27897k;
    public final e6 f27898l;
    public final e6 f27899m;
    public final e6 f27900n;
    public final e6 f27901o;
    public final jo0 f27902p;
    public boolean f27903q;
    public final RectF f27904r;
    public final RectF f27905s;
    public float f27906t;
    public long f27907u;
    public float v;
    public boolean f27908w;
    public final cc0 f27909x;

    public ko0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f27893f = path;
        this.f27894g = new f01(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f27895i = path3;
        this.f27897k = 1;
        this.f27904r = new RectF();
        this.f27905s = new RectF();
        this.f27909x = new cc0(this, 27);
        this.f27890b = runnable;
        this.f27889a = z10;
        pr prVar = pr.h;
        e6 e6Var = new e6(runnable, 360L, prVar, 0);
        this.f27898l = e6Var;
        e6Var.d(0.0f, true);
        this.f27899m = new e6(runnable, 320L, prVar, 0);
        this.f27900n = new e6(runnable, 200L, prVar, 0);
        e6 e6Var2 = new e6(runnable, 360L, prVar, 0);
        this.f27901o = e6Var2;
        e6Var2.d(0.0f, true);
        jo0 jo0Var = new jo0(runnable);
        this.f27902p = jo0Var;
        jo0Var.v = 0.3f;
        jo0Var.f29330u = 0.4f;
        jo0Var.f29327r = 650L;
        jo0Var.f29329t = 1.6f;
        jo0Var.f29328s = prVar;
        jo0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        jo0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        jo0Var.r(-1);
        jo0Var.f29313b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f27903q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f27896j && this.f27898l.f25593c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f27896j = z10;
        this.f27890b.run();
        xi0 xi0Var = this.f27892e;
        if (xi0Var != null && this.f27903q) {
            if (z10) {
                xi0Var.F(false);
            } else {
                xi0Var.stop();
            }
        }
    }

    public final void c(float f7, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            jo0 jo0Var = this.f27902p;
            jo0Var.b();
            jo0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f27897k = i10;
        if (!z10) {
            this.f27899m.d(i10, true);
        }
        this.f27890b.run();
        if (this.f27903q && Math.abs(f7) > 3.0f && !this.f27908w) {
            this.f27908w = true;
            AndroidUtilities.runOnUIThread(this.f27909x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float d = this.f27902p.d() + AndroidUtilities.dp(46.0f);
        float e7 = this.f27898l.e(this.f27896j);
        float d10 = this.f27899m.d(this.f27897k, false);
        if (e7 > 0.0f) {
            float d11 = this.f27900n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f27907u)) / 1000.0f);
            this.f27907u = currentTimeMillis;
            this.f27906t = (Math.min(d11, 4.0f) * 1.5f * min) + this.f27906t;
            this.f27890b.run();
            float f7 = d / 2.0f;
            this.f27904r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e7 * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f27889a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f27904r.centerX(), this.f27904r.top);
            canvas.translate(0.0f, (1.0f - e7) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f27904r);
            this.f27891c.setColor(org.telegram.ui.ActionBar.j6.l1(f10, -16777216));
            RectF rectF = this.f27904r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f27904r.height() / 2.0f, this.f27891c);
            this.f27902p.m(this.f27904r);
            canvas.save();
            float f12 = -d10;
            canvas.translate(((this.f27904r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f27904r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin(this.f27906t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin((this.f27906t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
            jo0 jo0Var = this.f27902p;
            jo0Var.f29331w = (int) (e7 * 255.0f);
            jo0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.f27904r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f27904r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin(this.f27906t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e7, -1));
            canvas.drawPath(this.f27895i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin((this.f27906t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e7, -1));
            canvas.drawPath(this.f27895i, this.d);
            canvas.restore();
            canvas.restore();
            e6 e6Var = this.f27901o;
            if (this.f27903q && this.f27896j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = e6Var.e(z10);
            if (e10 > 0.0f) {
                if (this.f27892e == null) {
                    xi0 xi0Var = new xi0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.f27892e = xi0Var;
                    xi0Var.H(true);
                    this.f27892e.setCallback(new ah.g1(this, 4));
                    this.f27892e.I(1);
                    this.f27892e.start();
                }
                float dp = this.f27894g.f25875c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f27905s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f27904r;
                float height = (rectF3.height() * e7) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f27904r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e7) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e10) + 0.75f;
                canvas.scale(f14, f14, this.f27905s.centerX(), this.f27905s.top);
                this.f27891c.setColor(org.telegram.ui.ActionBar.j6.l1(e10 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f27905s.centerX(), this.f27905s.top);
                canvas.drawPath(this.f27893f, this.f27891c);
                canvas.restore();
                canvas.drawRoundRect(this.f27905s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f27891c);
                this.f27892e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f27905s.left), ((int) this.f27905s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f27905s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f27905s.centerY()));
                this.f27892e.setAlpha((int) (255.0f * e10));
                if (!this.f27892e.f32594l0) {
                    this.f27892e.F(true);
                }
                this.f27892e.draw(canvas);
                this.f27894g.c(this.f27905s.left + AndroidUtilities.dp(39.0f), this.f27905s.centerY(), e10, -1, canvas);
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
