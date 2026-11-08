package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class cc extends View {
    public final int f44744a;
    public final Canvas f44745b;
    public final float f44746c;
    public final float d;
    public final float f44747e;
    public final Paint f44748f;
    public final Bitmap h;
    public final Paint f44749n;
    public final float f44750r;
    public final float f44751s;
    public final org.telegram.ui.ActionBar.f2 f44752w;

    public cc(org.telegram.ui.ActionBar.f2 f2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i7) {
        super(activity);
        this.f44744a = i7;
        this.f44752w = f2Var;
        this.f44745b = canvas;
        this.f44746c = f10;
        this.d = f11;
        this.f44747e = f12;
        this.f44748f = paint;
        this.h = bitmap;
        this.f44749n = paint2;
        this.f44750r = f13;
        this.f44751s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f44744a) {
            case 0:
                super.onDraw(canvas);
                rc rcVar = (rc) this.f44752w;
                boolean z9 = rcVar.J;
                Paint paint = this.f44749n;
                float f10 = this.f44747e;
                float f11 = this.d;
                float f12 = this.f44746c;
                if (z9) {
                    float f13 = rcVar.f49451n0;
                    if (f13 > 0.0f) {
                        this.f44745b.drawCircle(f12, f11, f10 * f13, this.f44748f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - rcVar.f49451n0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f44750r, this.f44751s);
                rcVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                hm0 hm0Var = (hm0) this.f44752w;
                boolean z10 = hm0Var.S;
                Paint paint2 = this.f44749n;
                float f14 = this.f44747e;
                float f15 = this.d;
                float f16 = this.f44746c;
                if (z10) {
                    float f17 = hm0Var.Y;
                    if (f17 > 0.0f) {
                        this.f44745b.drawCircle(f16, f15, f14 * f17, this.f44748f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - hm0Var.Y) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f44750r, this.f44751s);
                hm0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                v71 v71Var = (v71) this.f44752w;
                boolean a10 = v71Var.f50520a.a();
                Paint paint3 = this.f44749n;
                float f18 = this.f44747e;
                float f19 = this.d;
                float f20 = this.f44746c;
                if (a10) {
                    float f21 = v71Var.f50553j2;
                    if (f21 > 0.0f) {
                        this.f44745b.drawCircle(f20, f19, f18 * f21, this.f44748f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - v71Var.f50553j2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f44750r, this.f44751s);
                v71Var.P1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
