package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class kc extends View {
    public final int f39315a;
    public final Canvas f39316b;
    public final float f39317c;
    public final float d;
    public final float f39318e;
    public final Paint f39319f;
    public final Bitmap h;
    public final Paint f39320n;
    public final float f39321r;
    public final float f39322s;
    public final org.telegram.ui.ActionBar.m2 v;

    public kc(org.telegram.ui.ActionBar.m2 m2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f39315a = i10;
        this.v = m2Var;
        this.f39316b = canvas;
        this.f39317c = f7;
        this.d = f10;
        this.f39318e = f11;
        this.f39319f = paint;
        this.h = bitmap;
        this.f39320n = paint2;
        this.f39321r = f12;
        this.f39322s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f39315a) {
            case 0:
                super.onDraw(canvas);
                ad adVar = (ad) this.v;
                boolean z10 = adVar.J;
                Paint paint = this.f39320n;
                float f7 = this.f39318e;
                float f10 = this.d;
                float f11 = this.f39317c;
                if (z10) {
                    float f12 = adVar.f36056n0;
                    if (f12 > 0.0f) {
                        this.f39316b.drawCircle(f11, f10, f7 * f12, this.f39319f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - adVar.f36056n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f39321r, this.f39322s);
                adVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                zp0 zp0Var = (zp0) this.v;
                boolean z11 = zp0Var.S;
                Paint paint2 = this.f39320n;
                float f13 = this.f39318e;
                float f14 = this.d;
                float f15 = this.f39317c;
                if (z11) {
                    float f16 = zp0Var.Y;
                    if (f16 > 0.0f) {
                        this.f39316b.drawCircle(f15, f14, f13 * f16, this.f39319f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - zp0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f39321r, this.f39322s);
                zp0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                wd1 wd1Var = (wd1) this.v;
                boolean a2 = wd1Var.f43359a.a();
                Paint paint3 = this.f39320n;
                float f17 = this.f39318e;
                float f18 = this.d;
                float f19 = this.f39317c;
                if (a2) {
                    float f20 = wd1Var.f43389i2;
                    if (f20 > 0.0f) {
                        this.f39316b.drawCircle(f19, f18, f17 * f20, this.f39319f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - wd1Var.f43389i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f39321r, this.f39322s);
                wd1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
