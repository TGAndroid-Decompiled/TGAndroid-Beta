package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class nc extends View {
    public final int f36022a;
    public final Canvas f36023b;
    public final float f36024c;
    public final float d;
    public final float e;
    public final Paint f36025f;
    public final Bitmap h;
    public final Paint f36026n;
    public final float f36027r;
    public final float f36028s;
    public final org.telegram.ui.ActionBar.o2 v;

    public nc(org.telegram.ui.ActionBar.o2 o2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f36022a = i10;
        this.v = o2Var;
        this.f36023b = canvas;
        this.f36024c = f7;
        this.d = f10;
        this.e = f11;
        this.f36025f = paint;
        this.h = bitmap;
        this.f36026n = paint2;
        this.f36027r = f12;
        this.f36028s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f36022a) {
            case 0:
                super.onDraw(canvas);
                cd cdVar = (cd) this.v;
                boolean z10 = cdVar.J;
                Paint paint = this.f36026n;
                float f7 = this.e;
                float f10 = this.d;
                float f11 = this.f36024c;
                if (z10) {
                    float f12 = cdVar.f32745n0;
                    if (f12 > 0.0f) {
                        this.f36023b.drawCircle(f11, f10, f7 * f12, this.f36025f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - cdVar.f32745n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f36027r, this.f36028s);
                cdVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                cq0 cq0Var = (cq0) this.v;
                boolean z11 = cq0Var.S;
                Paint paint2 = this.f36026n;
                float f13 = this.e;
                float f14 = this.d;
                float f15 = this.f36024c;
                if (z11) {
                    float f16 = cq0Var.Y;
                    if (f16 > 0.0f) {
                        this.f36023b.drawCircle(f15, f14, f13 * f16, this.f36025f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - cq0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f36027r, this.f36028s);
                cq0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                xd1 xd1Var = (xd1) this.v;
                boolean a2 = xd1Var.f39536a.a();
                Paint paint3 = this.f36026n;
                float f17 = this.e;
                float f18 = this.d;
                float f19 = this.f36024c;
                if (a2) {
                    float f20 = xd1Var.f39565i2;
                    if (f20 > 0.0f) {
                        this.f36023b.drawCircle(f19, f18, f17 * f20, this.f36025f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - xd1Var.f39565i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f36027r, this.f36028s);
                xd1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
