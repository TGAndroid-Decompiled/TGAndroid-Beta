package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class mc extends View {
    public final int f38638a;
    public final Canvas f38639b;
    public final float f38640c;
    public final float d;
    public final float f38641e;
    public final Paint f38642f;
    public final Bitmap h;
    public final Paint f38643n;
    public final float f38644r;
    public final float f38645s;
    public final org.telegram.ui.ActionBar.n2 v;

    public mc(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f38638a = i10;
        this.v = n2Var;
        this.f38639b = canvas;
        this.f38640c = f7;
        this.d = f10;
        this.f38641e = f11;
        this.f38642f = paint;
        this.h = bitmap;
        this.f38643n = paint2;
        this.f38644r = f12;
        this.f38645s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f38638a) {
            case 0:
                super.onDraw(canvas);
                bd bdVar = (bd) this.v;
                boolean z10 = bdVar.J;
                Paint paint = this.f38643n;
                float f7 = this.f38641e;
                float f10 = this.d;
                float f11 = this.f38640c;
                if (z10) {
                    float f12 = bdVar.f34779n0;
                    if (f12 > 0.0f) {
                        this.f38639b.drawCircle(f11, f10, f7 * f12, this.f38642f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - bdVar.f34779n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f38644r, this.f38645s);
                bdVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                bq0 bq0Var = (bq0) this.v;
                boolean z11 = bq0Var.S;
                Paint paint2 = this.f38643n;
                float f13 = this.f38641e;
                float f14 = this.d;
                float f15 = this.f38640c;
                if (z11) {
                    float f16 = bq0Var.Y;
                    if (f16 > 0.0f) {
                        this.f38639b.drawCircle(f15, f14, f13 * f16, this.f38642f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - bq0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f38644r, this.f38645s);
                bq0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                wd1 wd1Var = (wd1) this.v;
                boolean a2 = wd1Var.f41941a.a();
                Paint paint3 = this.f38643n;
                float f17 = this.f38641e;
                float f18 = this.d;
                float f19 = this.f38640c;
                if (a2) {
                    float f20 = wd1Var.f41971i2;
                    if (f20 > 0.0f) {
                        this.f38639b.drawCircle(f19, f18, f17 * f20, this.f38642f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - wd1Var.f41971i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f38644r, this.f38645s);
                wd1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
