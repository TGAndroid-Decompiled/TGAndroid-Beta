package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class pc extends View {
    public final int f40909a;
    public final Canvas f40910b;
    public final float f40911c;
    public final float d;
    public final float f40912e;
    public final Paint f40913f;
    public final Bitmap h;
    public final Paint f40914n;
    public final float f40915r;
    public final float f40916s;
    public final org.telegram.ui.ActionBar.m2 v;

    public pc(org.telegram.ui.ActionBar.m2 m2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f40909a = i10;
        this.v = m2Var;
        this.f40910b = canvas;
        this.f40911c = f7;
        this.d = f10;
        this.f40912e = f11;
        this.f40913f = paint;
        this.h = bitmap;
        this.f40914n = paint2;
        this.f40915r = f12;
        this.f40916s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f40909a) {
            case 0:
                super.onDraw(canvas);
                fd fdVar = (fd) this.v;
                boolean z10 = fdVar.J;
                Paint paint = this.f40914n;
                float f7 = this.f40912e;
                float f10 = this.d;
                float f11 = this.f40911c;
                if (z10) {
                    float f12 = fdVar.f37738n0;
                    if (f12 > 0.0f) {
                        this.f40910b.drawCircle(f11, f10, f7 * f12, this.f40913f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - fdVar.f37738n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f40915r, this.f40916s);
                fdVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                cq0 cq0Var = (cq0) this.v;
                boolean z11 = cq0Var.S;
                Paint paint2 = this.f40914n;
                float f13 = this.f40912e;
                float f14 = this.d;
                float f15 = this.f40911c;
                if (z11) {
                    float f16 = cq0Var.Y;
                    if (f16 > 0.0f) {
                        this.f40910b.drawCircle(f15, f14, f13 * f16, this.f40913f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - cq0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f40915r, this.f40916s);
                cq0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                zd1 zd1Var = (zd1) this.v;
                boolean a2 = zd1Var.f44729a.a();
                Paint paint3 = this.f40914n;
                float f17 = this.f40912e;
                float f18 = this.d;
                float f19 = this.f40911c;
                if (a2) {
                    float f20 = zd1Var.f44759i2;
                    if (f20 > 0.0f) {
                        this.f40910b.drawCircle(f19, f18, f17 * f20, this.f40913f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - zd1Var.f44759i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f40915r, this.f40916s);
                zd1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
