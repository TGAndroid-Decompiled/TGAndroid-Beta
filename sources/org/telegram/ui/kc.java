package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class kc extends View {
    public final int f34671a;
    public final Canvas f34672b;
    public final float f34673c;
    public final float d;
    public final float e;
    public final Paint f34674f;
    public final Bitmap h;
    public final Paint f34675n;
    public final float f34676r;
    public final float f34677s;
    public final org.telegram.ui.ActionBar.n2 v;

    public kc(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f34671a = i10;
        this.v = n2Var;
        this.f34672b = canvas;
        this.f34673c = f7;
        this.d = f10;
        this.e = f11;
        this.f34674f = paint;
        this.h = bitmap;
        this.f34675n = paint2;
        this.f34676r = f12;
        this.f34677s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f34671a) {
            case 0:
                super.onDraw(canvas);
                ad adVar = (ad) this.v;
                boolean z10 = adVar.J;
                Paint paint = this.f34675n;
                float f7 = this.e;
                float f10 = this.d;
                float f11 = this.f34673c;
                if (z10) {
                    float f12 = adVar.f31755n0;
                    if (f12 > 0.0f) {
                        this.f34672b.drawCircle(f11, f10, f7 * f12, this.f34674f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - adVar.f31755n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f34676r, this.f34677s);
                adVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                up0 up0Var = (up0) this.v;
                boolean z11 = up0Var.S;
                Paint paint2 = this.f34675n;
                float f13 = this.e;
                float f14 = this.d;
                float f15 = this.f34673c;
                if (z11) {
                    float f16 = up0Var.Y;
                    if (f16 > 0.0f) {
                        this.f34672b.drawCircle(f15, f14, f13 * f16, this.f34674f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - up0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f34676r, this.f34677s);
                up0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                od1 od1Var = (od1) this.v;
                boolean a2 = od1Var.f35780a.a();
                Paint paint3 = this.f34675n;
                float f17 = this.e;
                float f18 = this.d;
                float f19 = this.f34673c;
                if (a2) {
                    float f20 = od1Var.f35809i2;
                    if (f20 > 0.0f) {
                        this.f34672b.drawCircle(f19, f18, f17 * f20, this.f34674f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - od1Var.f35809i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f34676r, this.f34677s);
                od1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
