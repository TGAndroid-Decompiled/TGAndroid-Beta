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
    public final boolean f29841a;
    public final Runnable f29842b;
    public final Paint f29843c = new Paint(1);
    public final Paint d;
    public hj0 f29844e;
    public final Path f29845f;
    public final k01 f29846g;
    public final Path h;
    public final Path f29847i;
    public boolean f29848j;
    public int f29849k;
    public final z5 f29850l;
    public final z5 f29851m;
    public final z5 f29852n;
    public final z5 f29853o;
    public final no0 f29854p;
    public boolean f29855q;
    public final RectF f29856r;
    public final RectF f29857s;
    public float f29858t;
    public long f29859u;
    public float v;
    public boolean f29860w;
    public final ec0 f29861x;

    public oo0(Runnable runnable, boolean z4) {
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f29845f = path;
        this.f29846g = new k01(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f29847i = path3;
        this.f29849k = 1;
        this.f29856r = new RectF();
        this.f29857s = new RectF();
        this.f29861x = new ec0(this, 27);
        this.f29842b = runnable;
        this.f29841a = z4;
        pr prVar = pr.h;
        z5 z5Var = new z5(runnable, 360L, prVar, 0);
        this.f29850l = z5Var;
        z5Var.d(0.0f, true);
        this.f29851m = new z5(runnable, 320L, prVar, 0);
        this.f29852n = new z5(runnable, 200L, prVar, 0);
        z5 z5Var2 = new z5(runnable, 360L, prVar, 0);
        this.f29853o = z5Var2;
        z5Var2.d(0.0f, true);
        no0 no0Var = new no0(runnable);
        this.f29854p = no0Var;
        no0Var.v = 0.3f;
        no0Var.f28016u = 0.4f;
        no0Var.f28013r = 650L;
        no0Var.f28015t = 1.6f;
        no0Var.f28014s = prVar;
        no0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        no0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        no0Var.r(-1);
        no0Var.f27999b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f29855q = (z4 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f29848j && this.f29850l.f33763c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z4) {
        this.f29848j = z4;
        this.f29842b.run();
        hj0 hj0Var = this.f29844e;
        if (hj0Var != null && this.f29855q) {
            if (z4) {
                hj0Var.F(false);
            } else {
                hj0Var.stop();
            }
        }
    }

    public final void c(float f10, boolean z4) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f10)) {
            no0 no0Var = this.f29854p;
            no0Var.b();
            no0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f10))), z4, true);
            this.v = f10;
        }
        if (f10 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f29849k = i10;
        if (!z4) {
            this.f29851m.d(i10, true);
        }
        this.f29842b.run();
        if (this.f29855q && Math.abs(f10) > 3.0f && !this.f29860w) {
            this.f29860w = true;
            AndroidUtilities.runOnUIThread(this.f29861x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z4;
        Rect bounds = getBounds();
        float d = this.f29854p.d() + AndroidUtilities.dp(46.0f);
        float e6 = this.f29850l.e(this.f29848j);
        float d10 = this.f29851m.d(this.f29849k, false);
        if (e6 > 0.0f) {
            float d11 = this.f29852n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f29859u)) / 1000.0f);
            this.f29859u = currentTimeMillis;
            this.f29858t = (Math.min(d11, 4.0f) * 1.5f * min) + this.f29858t;
            this.f29842b.run();
            float f10 = d / 2.0f;
            this.f29856r.set(bounds.centerX() - f10, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f10, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f11 = e6 * 0.4f;
            float f12 = 0.6f + f11;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f12 *= 0.75f;
                if (this.f29841a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f12, f12, this.f29856r.centerX(), this.f29856r.top);
            canvas.translate(0.0f, (1.0f - e6) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f29856r);
            this.f29843c.setColor(org.telegram.ui.ActionBar.k6.l1(f11, -16777216));
            RectF rectF = this.f29856r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f29856r.height() / 2.0f, this.f29843c);
            this.f29854p.m(this.f29856r);
            canvas.save();
            float f13 = -d10;
            canvas.translate(((this.f29856r.centerX() - f10) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f13)) * AndroidUtilities.dp(30.0f)), this.f29856r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.k6.l1(((((((float) Math.sin(this.f29858t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * e6, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.k6.l1(((((((float) Math.sin((this.f29858t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * e6, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
            no0 no0Var = this.f29854p;
            no0Var.f28017w = (int) (e6 * 255.0f);
            no0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.f29856r.centerX() + f10) - AndroidUtilities.dp(30.0f)), this.f29856r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.k6.l1(((((((float) Math.sin(this.f29858t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e6, -1));
            canvas.drawPath(this.f29847i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.k6.l1(((((((float) Math.sin((this.f29858t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e6, -1));
            canvas.drawPath(this.f29847i, this.d);
            canvas.restore();
            canvas.restore();
            z5 z5Var = this.f29853o;
            if (this.f29855q && this.f29848j) {
                z4 = true;
            } else {
                z4 = false;
            }
            float e10 = z5Var.e(z4);
            if (e10 > 0.0f) {
                if (this.f29844e == null) {
                    hj0 hj0Var = new hj0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.f29844e = hj0Var;
                    hj0Var.H(true);
                    this.f29844e.setCallback(new i.f(this, 7));
                    this.f29844e.I(1);
                    this.f29844e.start();
                }
                float dp = this.f29846g.f28227c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f29857s;
                float f14 = dp / 2.0f;
                float centerX = bounds.centerX() - f14;
                RectF rectF3 = this.f29856r;
                float height = (rectF3.height() * e6) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f14;
                RectF rectF4 = this.f29856r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e6) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f15 = (0.25f * e10) + 0.75f;
                canvas.scale(f15, f15, this.f29857s.centerX(), this.f29857s.top);
                this.f29843c.setColor(org.telegram.ui.ActionBar.k6.l1(e10 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f29857s.centerX(), this.f29857s.top);
                canvas.drawPath(this.f29845f, this.f29843c);
                canvas.restore();
                canvas.drawRoundRect(this.f29857s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f29843c);
                this.f29844e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f29857s.left), ((int) this.f29857s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f29857s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f29857s.centerY()));
                this.f29844e.setAlpha((int) (255.0f * e10));
                if (!this.f29844e.f27530i0) {
                    this.f29844e.F(true);
                }
                this.f29844e.draw(canvas);
                this.f29846g.c(this.f29857s.left + AndroidUtilities.dp(39.0f), this.f29857s.centerY(), e10, -1, canvas);
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
