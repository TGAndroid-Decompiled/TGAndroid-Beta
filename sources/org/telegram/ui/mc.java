package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class mc extends View {
    public final int f38528a;
    public final Canvas f38529b;
    public final float f38530c;
    public final float d;
    public final float f38531e;
    public final Paint f38532f;
    public final Bitmap h;
    public final Paint f38533n;
    public final float f38534r;
    public final float f38535s;
    public final org.telegram.ui.ActionBar.n2 v;

    public mc(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f38528a = i10;
        this.v = n2Var;
        this.f38529b = canvas;
        this.f38530c = f7;
        this.d = f10;
        this.f38531e = f11;
        this.f38532f = paint;
        this.h = bitmap;
        this.f38533n = paint2;
        this.f38534r = f12;
        this.f38535s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f38528a) {
            case 0:
                super.onDraw(canvas);
                cd cdVar = (cd) this.v;
                boolean z10 = cdVar.J;
                Paint paint = this.f38533n;
                float f7 = this.f38531e;
                float f10 = this.d;
                float f11 = this.f38530c;
                if (z10) {
                    float f12 = cdVar.f35432n0;
                    if (f12 > 0.0f) {
                        this.f38529b.drawCircle(f11, f10, f7 * f12, this.f38532f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - cdVar.f35432n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f38534r, this.f38535s);
                cdVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                wp0 wp0Var = (wp0) this.v;
                boolean z11 = wp0Var.S;
                Paint paint2 = this.f38533n;
                float f13 = this.f38531e;
                float f14 = this.d;
                float f15 = this.f38530c;
                if (z11) {
                    float f16 = wp0Var.Y;
                    if (f16 > 0.0f) {
                        this.f38529b.drawCircle(f15, f14, f13 * f16, this.f38532f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - wp0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f38534r, this.f38535s);
                wp0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                rd1 rd1Var = (rd1) this.v;
                boolean a2 = rd1Var.f40037a.a();
                Paint paint3 = this.f38533n;
                float f17 = this.f38531e;
                float f18 = this.d;
                float f19 = this.f38530c;
                if (a2) {
                    float f20 = rd1Var.f40067i2;
                    if (f20 > 0.0f) {
                        this.f38529b.drawCircle(f19, f18, f17 * f20, this.f38532f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - rd1Var.f40067i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f38534r, this.f38535s);
                rd1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
