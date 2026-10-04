package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class mc extends View {
    public final int f38522a;
    public final Canvas f38523b;
    public final float f38524c;
    public final float d;
    public final float f38525e;
    public final Paint f38526f;
    public final Bitmap h;
    public final Paint f38527n;
    public final float f38528r;
    public final float f38529s;
    public final org.telegram.ui.ActionBar.n2 v;

    public mc(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f38522a = i10;
        this.v = n2Var;
        this.f38523b = canvas;
        this.f38524c = f7;
        this.d = f10;
        this.f38525e = f11;
        this.f38526f = paint;
        this.h = bitmap;
        this.f38527n = paint2;
        this.f38528r = f12;
        this.f38529s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f38522a) {
            case 0:
                super.onDraw(canvas);
                cd cdVar = (cd) this.v;
                boolean z10 = cdVar.J;
                Paint paint = this.f38527n;
                float f7 = this.f38525e;
                float f10 = this.d;
                float f11 = this.f38524c;
                if (z10) {
                    float f12 = cdVar.f35426n0;
                    if (f12 > 0.0f) {
                        this.f38523b.drawCircle(f11, f10, f7 * f12, this.f38526f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - cdVar.f35426n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f38528r, this.f38529s);
                cdVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                wp0 wp0Var = (wp0) this.v;
                boolean z11 = wp0Var.S;
                Paint paint2 = this.f38527n;
                float f13 = this.f38525e;
                float f14 = this.d;
                float f15 = this.f38524c;
                if (z11) {
                    float f16 = wp0Var.Y;
                    if (f16 > 0.0f) {
                        this.f38523b.drawCircle(f15, f14, f13 * f16, this.f38526f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - wp0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f38528r, this.f38529s);
                wp0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                rd1 rd1Var = (rd1) this.v;
                boolean a2 = rd1Var.f40031a.a();
                Paint paint3 = this.f38527n;
                float f17 = this.f38525e;
                float f18 = this.d;
                float f19 = this.f38524c;
                if (a2) {
                    float f20 = rd1Var.f40061i2;
                    if (f20 > 0.0f) {
                        this.f38523b.drawCircle(f19, f18, f17 * f20, this.f38526f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - rd1Var.f40061i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f38528r, this.f38529s);
                rd1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
