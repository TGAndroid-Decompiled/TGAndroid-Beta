package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class kc extends View {
    public final int f39281a;
    public final Canvas f39282b;
    public final float f39283c;
    public final float d;
    public final float f39284e;
    public final Paint f39285f;
    public final Bitmap h;
    public final Paint f39286n;
    public final float f39287r;
    public final float f39288s;
    public final org.telegram.ui.ActionBar.m2 v;

    public kc(org.telegram.ui.ActionBar.m2 m2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f39281a = i10;
        this.v = m2Var;
        this.f39282b = canvas;
        this.f39283c = f7;
        this.d = f10;
        this.f39284e = f11;
        this.f39285f = paint;
        this.h = bitmap;
        this.f39286n = paint2;
        this.f39287r = f12;
        this.f39288s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f39281a) {
            case 0:
                super.onDraw(canvas);
                ad adVar = (ad) this.v;
                boolean z10 = adVar.J;
                Paint paint = this.f39286n;
                float f7 = this.f39284e;
                float f10 = this.d;
                float f11 = this.f39283c;
                if (z10) {
                    float f12 = adVar.f36022n0;
                    if (f12 > 0.0f) {
                        this.f39282b.drawCircle(f11, f10, f7 * f12, this.f39285f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - adVar.f36022n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f39287r, this.f39288s);
                adVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                zp0 zp0Var = (zp0) this.v;
                boolean z11 = zp0Var.S;
                Paint paint2 = this.f39286n;
                float f13 = this.f39284e;
                float f14 = this.d;
                float f15 = this.f39283c;
                if (z11) {
                    float f16 = zp0Var.Y;
                    if (f16 > 0.0f) {
                        this.f39282b.drawCircle(f15, f14, f13 * f16, this.f39285f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - zp0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f39287r, this.f39288s);
                zp0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                wd1 wd1Var = (wd1) this.v;
                boolean a2 = wd1Var.f43325a.a();
                Paint paint3 = this.f39286n;
                float f17 = this.f39284e;
                float f18 = this.d;
                float f19 = this.f39283c;
                if (a2) {
                    float f20 = wd1Var.f43355i2;
                    if (f20 > 0.0f) {
                        this.f39282b.drawCircle(f19, f18, f17 * f20, this.f39285f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - wd1Var.f43355i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f39287r, this.f39288s);
                wd1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
