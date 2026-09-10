package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class nc extends View {
    public final int f35202a;
    public final Canvas f35203b;
    public final float f35204c;
    public final float d;
    public final float e;
    public final Paint f35205f;
    public final Bitmap h;
    public final Paint f35206n;
    public final float f35207r;
    public final float f35208s;
    public final org.telegram.ui.ActionBar.p2 v;

    public nc(org.telegram.ui.ActionBar.p2 p2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f35202a = i10;
        this.v = p2Var;
        this.f35203b = canvas;
        this.f35204c = f7;
        this.d = f10;
        this.e = f11;
        this.f35205f = paint;
        this.h = bitmap;
        this.f35206n = paint2;
        this.f35207r = f12;
        this.f35208s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f35202a) {
            case 0:
                super.onDraw(canvas);
                cd cdVar = (cd) this.v;
                boolean z10 = cdVar.J;
                Paint paint = this.f35206n;
                float f7 = this.e;
                float f10 = this.d;
                float f11 = this.f35204c;
                if (z10) {
                    float f12 = cdVar.f31625n0;
                    if (f12 > 0.0f) {
                        this.f35203b.drawCircle(f11, f10, f7 * f12, this.f35205f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - cdVar.f31625n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f35207r, this.f35208s);
                cdVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                bq0 bq0Var = (bq0) this.v;
                boolean z11 = bq0Var.S;
                Paint paint2 = this.f35206n;
                float f13 = this.e;
                float f14 = this.d;
                float f15 = this.f35204c;
                if (z11) {
                    float f16 = bq0Var.Y;
                    if (f16 > 0.0f) {
                        this.f35203b.drawCircle(f15, f14, f13 * f16, this.f35205f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - bq0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f35207r, this.f35208s);
                bq0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                ae1 ae1Var = (ae1) this.v;
                boolean a2 = ae1Var.f30914a.a();
                Paint paint3 = this.f35206n;
                float f17 = this.e;
                float f18 = this.d;
                float f19 = this.f35204c;
                if (a2) {
                    float f20 = ae1Var.f30943i2;
                    if (f20 > 0.0f) {
                        this.f35203b.drawCircle(f19, f18, f17 * f20, this.f35205f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - ae1Var.f30943i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f35207r, this.f35208s);
                ae1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
