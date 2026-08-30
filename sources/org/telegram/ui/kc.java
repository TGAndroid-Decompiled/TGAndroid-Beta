package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class kc extends View {
    public final int f35610a;
    public final Canvas f35611b;
    public final float f35612c;
    public final float d;
    public final float e;
    public final Paint f35613f;
    public final Bitmap h;
    public final Paint f35614n;
    public final float f35615r;
    public final float f35616s;
    public final org.telegram.ui.ActionBar.p2 v;

    public kc(org.telegram.ui.ActionBar.p2 p2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i10) {
        super(activity);
        this.f35610a = i10;
        this.v = p2Var;
        this.f35611b = canvas;
        this.f35612c = f10;
        this.d = f11;
        this.e = f12;
        this.f35613f = paint;
        this.h = bitmap;
        this.f35614n = paint2;
        this.f35615r = f13;
        this.f35616s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f35610a) {
            case 0:
                super.onDraw(canvas);
                bd bdVar = (bd) this.v;
                boolean z4 = bdVar.G;
                Paint paint = this.f35614n;
                float f10 = this.e;
                float f11 = this.d;
                float f12 = this.f35612c;
                if (z4) {
                    float f13 = bdVar.f32924k0;
                    if (f13 > 0.0f) {
                        this.f35611b.drawCircle(f12, f11, f10 * f13, this.f35613f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - bdVar.f32924k0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f35615r, this.f35616s);
                bdVar.I.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                gp0 gp0Var = (gp0) this.v;
                boolean z10 = gp0Var.G;
                Paint paint2 = this.f35614n;
                float f14 = this.e;
                float f15 = this.d;
                float f16 = this.f35612c;
                if (z10) {
                    float f17 = gp0Var.M;
                    if (f17 > 0.0f) {
                        this.f35611b.drawCircle(f16, f15, f14 * f17, this.f35613f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - gp0Var.M) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f35615r, this.f35616s);
                gp0Var.C.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                cd1 cd1Var = (cd1) this.v;
                boolean a2 = cd1Var.f33287a.a();
                Paint paint3 = this.f35614n;
                float f18 = this.e;
                float f19 = this.d;
                float f20 = this.f35612c;
                if (a2) {
                    float f21 = cd1Var.f33307f2;
                    if (f21 > 0.0f) {
                        this.f35611b.drawCircle(f20, f19, f18 * f21, this.f35613f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - cd1Var.f33307f2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f35615r, this.f35616s);
                cd1Var.L1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
