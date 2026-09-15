package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class lc extends View {
    public final int f35416a;
    public final Canvas f35417b;
    public final float f35418c;
    public final float d;
    public final float e;
    public final Paint f35419f;
    public final Bitmap h;
    public final Paint f35420n;
    public final float f35421r;
    public final float f35422s;
    public final org.telegram.ui.ActionBar.n2 v;

    public lc(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f35416a = i10;
        this.v = n2Var;
        this.f35417b = canvas;
        this.f35418c = f7;
        this.d = f10;
        this.e = f11;
        this.f35419f = paint;
        this.h = bitmap;
        this.f35420n = paint2;
        this.f35421r = f12;
        this.f35422s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f35416a) {
            case 0:
                super.onDraw(canvas);
                ad adVar = (ad) this.v;
                boolean z10 = adVar.J;
                Paint paint = this.f35420n;
                float f7 = this.e;
                float f10 = this.d;
                float f11 = this.f35418c;
                if (z10) {
                    float f12 = adVar.f31770n0;
                    if (f12 > 0.0f) {
                        this.f35417b.drawCircle(f11, f10, f7 * f12, this.f35419f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - adVar.f31770n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f35421r, this.f35422s);
                adVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                aq0 aq0Var = (aq0) this.v;
                boolean z11 = aq0Var.S;
                Paint paint2 = this.f35420n;
                float f13 = this.e;
                float f14 = this.d;
                float f15 = this.f35418c;
                if (z11) {
                    float f16 = aq0Var.Y;
                    if (f16 > 0.0f) {
                        this.f35417b.drawCircle(f15, f14, f13 * f16, this.f35419f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - aq0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f35421r, this.f35422s);
                aq0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                vd1 vd1Var = (vd1) this.v;
                boolean a2 = vd1Var.f38513a.a();
                Paint paint3 = this.f35420n;
                float f17 = this.e;
                float f18 = this.d;
                float f19 = this.f35418c;
                if (a2) {
                    float f20 = vd1Var.f38542i2;
                    if (f20 > 0.0f) {
                        this.f35417b.drawCircle(f19, f18, f17 * f20, this.f35419f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - vd1Var.f38542i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f35421r, this.f35422s);
                vd1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
