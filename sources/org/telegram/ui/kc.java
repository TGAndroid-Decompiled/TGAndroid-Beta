package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class kc extends View {
    public final int f35114a;
    public final Canvas f35115b;
    public final float f35116c;
    public final float d;
    public final float e;
    public final Paint f35117f;
    public final Bitmap h;
    public final Paint f35118n;
    public final float f35119r;
    public final float f35120s;
    public final org.telegram.ui.ActionBar.m2 v;

    public kc(org.telegram.ui.ActionBar.m2 m2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f35114a = i10;
        this.v = m2Var;
        this.f35115b = canvas;
        this.f35116c = f7;
        this.d = f10;
        this.e = f11;
        this.f35117f = paint;
        this.h = bitmap;
        this.f35118n = paint2;
        this.f35119r = f12;
        this.f35120s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f35114a) {
            case 0:
                super.onDraw(canvas);
                ad adVar = (ad) this.v;
                boolean z10 = adVar.J;
                Paint paint = this.f35118n;
                float f7 = this.e;
                float f10 = this.d;
                float f11 = this.f35116c;
                if (z10) {
                    float f12 = adVar.f32190n0;
                    if (f12 > 0.0f) {
                        this.f35115b.drawCircle(f11, f10, f7 * f12, this.f35117f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - adVar.f32190n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f35119r, this.f35120s);
                adVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                sp0 sp0Var = (sp0) this.v;
                boolean z11 = sp0Var.S;
                Paint paint2 = this.f35118n;
                float f13 = this.e;
                float f14 = this.d;
                float f15 = this.f35116c;
                if (z11) {
                    float f16 = sp0Var.Y;
                    if (f16 > 0.0f) {
                        this.f35115b.drawCircle(f15, f14, f13 * f16, this.f35117f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - sp0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f35119r, this.f35120s);
                sp0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                od1 od1Var = (od1) this.v;
                boolean a2 = od1Var.f36289a.a();
                Paint paint3 = this.f35118n;
                float f17 = this.e;
                float f18 = this.d;
                float f19 = this.f35116c;
                if (a2) {
                    float f20 = od1Var.f36318i2;
                    if (f20 > 0.0f) {
                        this.f35115b.drawCircle(f19, f18, f17 * f20, this.f35117f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - od1Var.f36318i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f35119r, this.f35120s);
                od1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
