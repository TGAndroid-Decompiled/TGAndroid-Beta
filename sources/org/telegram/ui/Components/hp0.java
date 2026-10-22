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
public final class hp0 extends Drawable {
    public final boolean f26961a;
    public final Runnable f26962b;
    public final Paint f26963c = new Paint(1);
    public final Paint d;
    public vj0 e;
    public final Path f26964f;
    public final f11 f26965g;
    public final Path h;
    public final Path f26966i;
    public boolean f26967j;
    public int f26968k;
    public final f6 f26969l;
    public final f6 f26970m;
    public final f6 f26971n;
    public final f6 f26972o;
    public final ei.k f26973p;
    public boolean f26974q;
    public final RectF f26975r;
    public final RectF f26976s;
    public float f26977t;
    public long f26978u;
    public float v;
    public boolean f26979w;
    public final rc0 f26980x;

    public hp0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f26964f = path;
        this.f26965g = new f11(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f26966i = path3;
        this.f26968k = 1;
        this.f26975r = new RectF();
        this.f26976s = new RectF();
        this.f26980x = new rc0(this, 27);
        this.f26962b = runnable;
        this.f26961a = z10;
        bs bsVar = bs.h;
        f6 f6Var = new f6(runnable, 360L, bsVar, 0);
        this.f26969l = f6Var;
        f6Var.d(0.0f, true);
        this.f26970m = new f6(runnable, 320L, bsVar, 0);
        this.f26971n = new f6(runnable, 200L, bsVar, 0);
        f6 f6Var2 = new f6(runnable, 360L, bsVar, 0);
        this.f26972o = f6Var2;
        f6Var2.d(0.0f, true);
        ei.k kVar = new ei.k(runnable);
        this.f26973p = kVar;
        kVar.A = 0.3f;
        kVar.m(0.4f, 650L, 1.6f, bsVar);
        kVar.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar.w(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        kVar.u(-1);
        kVar.f29229b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f26974q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f26967j && this.f26969l.f26089c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f26967j = z10;
        this.f26962b.run();
        vj0 vj0Var = this.e;
        if (vj0Var != null && this.f26974q) {
            if (z10) {
                vj0Var.H(false);
            } else {
                vj0Var.stop();
            }
        }
    }

    public final void c(float f7, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            ei.k kVar = this.f26973p;
            kVar.a();
            kVar.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f26968k = i10;
        if (!z10) {
            this.f26970m.d(i10, true);
        }
        this.f26962b.run();
        if (this.f26974q && Math.abs(f7) > 3.0f && !this.f26979w) {
            this.f26979w = true;
            AndroidUtilities.runOnUIThread(this.f26980x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f26973p.c() + AndroidUtilities.dp(46.0f);
        float e = this.f26969l.e(this.f26967j);
        float d = this.f26970m.d(this.f26968k, false);
        if (e > 0.0f) {
            float d10 = this.f26971n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f26978u)) / 1000.0f);
            this.f26978u = currentTimeMillis;
            this.f26977t = (Math.min(d10, 4.0f) * 1.5f * min) + this.f26977t;
            this.f26962b.run();
            float f7 = c10 / 2.0f;
            this.f26975r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f26961a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f26975r.centerX(), this.f26975r.top);
            canvas.translate(0.0f, (1.0f - e) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f26975r);
            this.f26963c.setColor(org.telegram.ui.ActionBar.h6.m1(f10, -16777216));
            RectF rectF = this.f26975r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f26975r.height() / 2.0f, this.f26963c);
            this.f26973p.p(this.f26975r);
            canvas.save();
            float f12 = -d;
            canvas.translate(((this.f26975r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f26975r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin(this.f26977t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin((this.f26977t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d, 0.0f);
            ei.k kVar = this.f26973p;
            kVar.B = (int) (e * 255.0f);
            kVar.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d)) * AndroidUtilities.dp(30.0f)) + ((this.f26975r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f26975r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin(this.f26977t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e, -1));
            canvas.drawPath(this.f26966i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin((this.f26977t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e, -1));
            canvas.drawPath(this.f26966i, this.d);
            canvas.restore();
            canvas.restore();
            f6 f6Var = this.f26972o;
            if (this.f26974q && this.f26967j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = f6Var.e(z10);
            if (e7 > 0.0f) {
                if (this.e == null) {
                    vj0 vj0Var = new vj0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.e = vj0Var;
                    vj0Var.J(true);
                    this.e.setCallback(new ah.f1(this, 5));
                    this.e.K(1);
                    this.e.start();
                }
                float dp = this.f26965g.f26024c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f26976s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f26975r;
                float height = (rectF3.height() * e) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f26975r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e7) + 0.75f;
                canvas.scale(f14, f14, this.f26976s.centerX(), this.f26976s.top);
                this.f26963c.setColor(org.telegram.ui.ActionBar.h6.m1(e7 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f26976s.centerX(), this.f26976s.top);
                canvas.drawPath(this.f26964f, this.f26963c);
                canvas.restore();
                canvas.drawRoundRect(this.f26976s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f26963c);
                this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f26976s.left), ((int) this.f26976s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f26976s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f26976s.centerY()));
                this.e.setAlpha((int) (255.0f * e7));
                if (!this.e.f31281k0) {
                    this.e.H(true);
                }
                this.e.draw(canvas);
                this.f26965g.c(this.f26976s.left + AndroidUtilities.dp(39.0f), this.f26976s.centerY(), e7, -1, canvas);
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
