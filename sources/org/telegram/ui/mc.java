package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class mc extends View {
    public final int f41521a;
    public final Canvas f41522b;
    public final float f41523c;
    public final float d;
    public final float e;
    public final Paint f41524f;
    public final Bitmap h;
    public final Paint f41525n;
    public final float f41526r;
    public final float f41527s;
    public final org.telegram.ui.ActionBar.r2 v;

    public mc(org.telegram.ui.ActionBar.r2 r2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f41521a = i10;
        this.v = r2Var;
        this.f41522b = canvas;
        this.f41523c = f7;
        this.d = f10;
        this.e = f11;
        this.f41524f = paint;
        this.h = bitmap;
        this.f41525n = paint2;
        this.f41526r = f12;
        this.f41527s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f41521a) {
            case 0:
                super.onDraw(canvas);
                bd bdVar = (bd) this.v;
                boolean z10 = bdVar.J;
                Paint paint = this.f41525n;
                float f7 = this.e;
                float f10 = this.d;
                float f11 = this.f41523c;
                if (z10) {
                    float f12 = bdVar.f38049n0;
                    if (f12 > 0.0f) {
                        this.f41522b.drawCircle(f11, f10, f7 * f12, this.f41524f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - bdVar.f38049n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f41526r, this.f41527s);
                bdVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                rp0 rp0Var = (rp0) this.v;
                boolean z11 = rp0Var.S;
                Paint paint2 = this.f41525n;
                float f13 = this.e;
                float f14 = this.d;
                float f15 = this.f41523c;
                if (z11) {
                    float f16 = rp0Var.Y;
                    if (f16 > 0.0f) {
                        this.f41522b.drawCircle(f15, f14, f13 * f16, this.f41524f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - rp0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f41526r, this.f41527s);
                rp0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                tc1 tc1Var = (tc1) this.v;
                boolean a2 = tc1Var.f43733a.a();
                Paint paint3 = this.f41525n;
                float f17 = this.e;
                float f18 = this.d;
                float f19 = this.f41523c;
                if (a2) {
                    float f20 = tc1Var.f43765j2;
                    if (f20 > 0.0f) {
                        this.f41522b.drawCircle(f19, f18, f17 * f20, this.f41524f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - tc1Var.f43765j2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f41526r, this.f41527s);
                tc1Var.P1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
