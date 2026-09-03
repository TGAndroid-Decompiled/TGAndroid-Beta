package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class mc extends View {
    public final int f36020a;
    public final Canvas f36021b;
    public final float f36022c;
    public final float d;
    public final float e;
    public final Paint f36023f;
    public final Bitmap h;
    public final Paint f36024n;
    public final float f36025r;
    public final float f36026s;
    public final org.telegram.ui.ActionBar.p2 v;

    public mc(org.telegram.ui.ActionBar.p2 p2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i10) {
        super(activity);
        this.f36020a = i10;
        this.v = p2Var;
        this.f36021b = canvas;
        this.f36022c = f10;
        this.d = f11;
        this.e = f12;
        this.f36023f = paint;
        this.h = bitmap;
        this.f36024n = paint2;
        this.f36025r = f13;
        this.f36026s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f36020a) {
            case 0:
                super.onDraw(canvas);
                dd ddVar = (dd) this.v;
                boolean z4 = ddVar.G;
                Paint paint = this.f36024n;
                float f10 = this.e;
                float f11 = this.d;
                float f12 = this.f36022c;
                if (z4) {
                    float f13 = ddVar.f33430k0;
                    if (f13 > 0.0f) {
                        this.f36021b.drawCircle(f12, f11, f10 * f13, this.f36023f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - ddVar.f33430k0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f36025r, this.f36026s);
                ddVar.I.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                np0 np0Var = (np0) this.v;
                boolean z10 = np0Var.P;
                Paint paint2 = this.f36024n;
                float f14 = this.e;
                float f15 = this.d;
                float f16 = this.f36022c;
                if (z10) {
                    float f17 = np0Var.V;
                    if (f17 > 0.0f) {
                        this.f36021b.drawCircle(f16, f15, f14 * f17, this.f36023f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - np0Var.V) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f36025r, this.f36026s);
                np0Var.H.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                jd1 jd1Var = (jd1) this.v;
                boolean a2 = jd1Var.f35179a.a();
                Paint paint3 = this.f36024n;
                float f18 = this.e;
                float f19 = this.d;
                float f20 = this.f36022c;
                if (a2) {
                    float f21 = jd1Var.f35199f2;
                    if (f21 > 0.0f) {
                        this.f36021b.drawCircle(f20, f19, f18 * f21, this.f36023f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - jd1Var.f35199f2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f36025r, this.f36026s);
                jd1Var.L1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
