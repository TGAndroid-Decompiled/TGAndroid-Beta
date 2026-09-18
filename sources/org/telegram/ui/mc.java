package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class mc extends View {
    public final int f35583a;
    public final Canvas f35584b;
    public final float f35585c;
    public final float d;
    public final float e;
    public final Paint f35586f;
    public final Bitmap h;
    public final Paint f35587n;
    public final float f35588r;
    public final float f35589s;
    public final org.telegram.ui.ActionBar.n2 v;

    public mc(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f35583a = i10;
        this.v = n2Var;
        this.f35584b = canvas;
        this.f35585c = f7;
        this.d = f10;
        this.e = f11;
        this.f35586f = paint;
        this.h = bitmap;
        this.f35587n = paint2;
        this.f35588r = f12;
        this.f35589s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f35583a) {
            case 0:
                super.onDraw(canvas);
                bd bdVar = (bd) this.v;
                boolean z10 = bdVar.J;
                Paint paint = this.f35587n;
                float f7 = this.e;
                float f10 = this.d;
                float f11 = this.f35585c;
                if (z10) {
                    float f12 = bdVar.f32327n0;
                    if (f12 > 0.0f) {
                        this.f35584b.drawCircle(f11, f10, f7 * f12, this.f35586f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - bdVar.f32327n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f35588r, this.f35589s);
                bdVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                cq0 cq0Var = (cq0) this.v;
                boolean z11 = cq0Var.S;
                Paint paint2 = this.f35587n;
                float f13 = this.e;
                float f14 = this.d;
                float f15 = this.f35585c;
                if (z11) {
                    float f16 = cq0Var.Y;
                    if (f16 > 0.0f) {
                        this.f35584b.drawCircle(f15, f14, f13 * f16, this.f35586f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - cq0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f35588r, this.f35589s);
                cq0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                vd1 vd1Var = (vd1) this.v;
                boolean a2 = vd1Var.f38467a.a();
                Paint paint3 = this.f35587n;
                float f17 = this.e;
                float f18 = this.d;
                float f19 = this.f35585c;
                if (a2) {
                    float f20 = vd1Var.f38496i2;
                    if (f20 > 0.0f) {
                        this.f35584b.drawCircle(f19, f18, f17 * f20, this.f35586f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - vd1Var.f38496i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f35588r, this.f35589s);
                vd1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
