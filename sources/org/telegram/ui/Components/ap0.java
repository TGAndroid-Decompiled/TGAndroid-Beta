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
public final class ap0 extends Drawable {
    public final boolean f22666a;
    public final Runnable f22667b;
    public final Paint f22668c = new Paint(1);
    public final Paint d;
    public lj0 e;
    public final Path f22669f;
    public final w01 f22670g;
    public final Path h;
    public final Path f22671i;
    public boolean f22672j;
    public int f22673k;
    public final e6 f22674l;
    public final e6 f22675m;
    public final e6 f22676n;
    public final e6 f22677o;
    public final zo0 f22678p;
    public boolean f22679q;
    public final RectF f22680r;
    public final RectF f22681s;
    public float f22682t;
    public long f22683u;
    public float v;
    public boolean f22684w;
    public final lc0 f22685x;

    public ap0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f22669f = path;
        this.f22670g = new w01(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f22671i = path3;
        this.f22673k = 1;
        this.f22680r = new RectF();
        this.f22681s = new RectF();
        this.f22685x = new lc0(this, 28);
        this.f22667b = runnable;
        this.f22666a = z10;
        tr trVar = tr.h;
        e6 e6Var = new e6(runnable, 360L, trVar, 0);
        this.f22674l = e6Var;
        e6Var.d(0.0f, true);
        this.f22675m = new e6(runnable, 320L, trVar, 0);
        this.f22676n = new e6(runnable, 200L, trVar, 0);
        e6 e6Var2 = new e6(runnable, 360L, trVar, 0);
        this.f22677o = e6Var2;
        e6Var2.d(0.0f, true);
        zo0 zo0Var = new zo0(runnable);
        this.f22678p = zo0Var;
        zo0Var.v = 0.3f;
        zo0Var.f27007u = 0.4f;
        zo0Var.f27004r = 650L;
        zo0Var.f27006t = 1.6f;
        zo0Var.f27005s = trVar;
        zo0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        zo0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        zo0Var.r(-1);
        zo0Var.f26991b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f22679q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f22672j && this.f22674l.f23852c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f22672j = z10;
        this.f22667b.run();
        lj0 lj0Var = this.e;
        if (lj0Var != null && this.f22679q) {
            if (z10) {
                lj0Var.H(false);
            } else {
                lj0Var.stop();
            }
        }
    }

    public final void c(float f7, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            zo0 zo0Var = this.f22678p;
            zo0Var.b();
            zo0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f22673k = i10;
        if (!z10) {
            this.f22675m.d(i10, true);
        }
        this.f22667b.run();
        if (this.f22679q && Math.abs(f7) > 3.0f && !this.f22684w) {
            this.f22684w = true;
            AndroidUtilities.runOnUIThread(this.f22685x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float d = this.f22678p.d() + AndroidUtilities.dp(46.0f);
        float e = this.f22674l.e(this.f22672j);
        float d10 = this.f22675m.d(this.f22673k, false);
        if (e > 0.0f) {
            float d11 = this.f22676n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f22683u)) / 1000.0f);
            this.f22683u = currentTimeMillis;
            this.f22682t = (Math.min(d11, 4.0f) * 1.5f * min) + this.f22682t;
            this.f22667b.run();
            float f7 = d / 2.0f;
            this.f22680r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f22666a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f22680r.centerX(), this.f22680r.top);
            canvas.translate(0.0f, (1.0f - e) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f22680r);
            this.f22668c.setColor(org.telegram.ui.ActionBar.h6.l1(f10, -16777216));
            RectF rectF = this.f22680r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f22680r.height() / 2.0f, this.f22668c);
            this.f22678p.m(this.f22680r);
            canvas.save();
            float f12 = -d10;
            canvas.translate(((this.f22680r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f22680r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin(this.f22682t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin((this.f22682t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
            zo0 zo0Var = this.f22678p;
            zo0Var.f27008w = (int) (e * 255.0f);
            zo0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.f22680r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f22680r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin(this.f22682t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f22671i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.l1(((((((float) Math.sin((this.f22682t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f22671i, this.d);
            canvas.restore();
            canvas.restore();
            e6 e6Var = this.f22677o;
            if (this.f22679q && this.f22672j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = e6Var.e(z10);
            if (e7 > 0.0f) {
                if (this.e == null) {
                    lj0 lj0Var = new lj0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.e = lj0Var;
                    lj0Var.J(true);
                    this.e.setCallback(new i.f(this, 3));
                    this.e.K(1);
                    this.e.start();
                }
                float dp = this.f22670g.f29768c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f22681s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f22680r;
                float height = (rectF3.height() * e) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f22680r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e7) + 0.75f;
                canvas.scale(f14, f14, this.f22681s.centerX(), this.f22681s.top);
                this.f22668c.setColor(org.telegram.ui.ActionBar.h6.l1(e7 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f22681s.centerX(), this.f22681s.top);
                canvas.drawPath(this.f22669f, this.f22668c);
                canvas.restore();
                canvas.drawRoundRect(this.f22681s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f22668c);
                this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f22681s.left), ((int) this.f22681s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f22681s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f22681s.centerY()));
                this.e.setAlpha((int) (255.0f * e7));
                if (!this.e.f26021k0) {
                    this.e.H(true);
                }
                this.e.draw(canvas);
                this.f22670g.c(this.f22681s.left + AndroidUtilities.dp(39.0f), this.f22681s.centerY(), e7, -1, canvas);
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
