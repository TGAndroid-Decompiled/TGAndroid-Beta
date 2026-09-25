package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class kc extends View {
    public final int f35025a;
    public final Canvas f35026b;
    public final float f35027c;
    public final float d;
    public final float e;
    public final Paint f35028f;
    public final Bitmap h;
    public final Paint f35029n;
    public final float f35030r;
    public final float f35031s;
    public final org.telegram.ui.ActionBar.m2 v;

    public kc(org.telegram.ui.ActionBar.m2 m2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f35025a = i10;
        this.v = m2Var;
        this.f35026b = canvas;
        this.f35027c = f7;
        this.d = f10;
        this.e = f11;
        this.f35028f = paint;
        this.h = bitmap;
        this.f35029n = paint2;
        this.f35030r = f12;
        this.f35031s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f35025a) {
            case 0:
                super.onDraw(canvas);
                ad adVar = (ad) this.v;
                boolean z10 = adVar.J;
                Paint paint = this.f35029n;
                float f7 = this.e;
                float f10 = this.d;
                float f11 = this.f35027c;
                if (z10) {
                    float f12 = adVar.f32117n0;
                    if (f12 > 0.0f) {
                        this.f35026b.drawCircle(f11, f10, f7 * f12, this.f35028f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - adVar.f32117n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f35030r, this.f35031s);
                adVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                tp0 tp0Var = (tp0) this.v;
                boolean z11 = tp0Var.S;
                Paint paint2 = this.f35029n;
                float f13 = this.e;
                float f14 = this.d;
                float f15 = this.f35027c;
                if (z11) {
                    float f16 = tp0Var.Y;
                    if (f16 > 0.0f) {
                        this.f35026b.drawCircle(f15, f14, f13 * f16, this.f35028f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - tp0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f35030r, this.f35031s);
                tp0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                od1 od1Var = (od1) this.v;
                boolean a2 = od1Var.f36153a.a();
                Paint paint3 = this.f35029n;
                float f17 = this.e;
                float f18 = this.d;
                float f19 = this.f35027c;
                if (a2) {
                    float f20 = od1Var.f36182i2;
                    if (f20 > 0.0f) {
                        this.f35026b.drawCircle(f19, f18, f17 * f20, this.f35028f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - od1Var.f36182i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f35030r, this.f35031s);
                od1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
