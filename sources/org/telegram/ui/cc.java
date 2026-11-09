package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class cc extends View {
    public final int f44267a;
    public final Canvas f44268b;
    public final float f44269c;
    public final float d;
    public final float f44270e;
    public final Paint f44271f;
    public final Bitmap h;
    public final Paint f44272n;
    public final float f44273r;
    public final float f44274s;
    public final org.telegram.ui.ActionBar.f2 f44275w;

    public cc(org.telegram.ui.ActionBar.f2 f2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i7) {
        super(activity);
        this.f44267a = i7;
        this.f44275w = f2Var;
        this.f44268b = canvas;
        this.f44269c = f10;
        this.d = f11;
        this.f44270e = f12;
        this.f44271f = paint;
        this.h = bitmap;
        this.f44272n = paint2;
        this.f44273r = f13;
        this.f44274s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f44267a) {
            case 0:
                super.onDraw(canvas);
                rc rcVar = (rc) this.f44275w;
                boolean z9 = rcVar.J;
                Paint paint = this.f44272n;
                float f10 = this.f44270e;
                float f11 = this.d;
                float f12 = this.f44269c;
                if (z9) {
                    float f13 = rcVar.f49424n0;
                    if (f13 > 0.0f) {
                        this.f44268b.drawCircle(f12, f11, f10 * f13, this.f44271f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - rcVar.f49424n0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f44273r, this.f44274s);
                rcVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                jm0 jm0Var = (jm0) this.f44275w;
                boolean z10 = jm0Var.S;
                Paint paint2 = this.f44272n;
                float f14 = this.f44270e;
                float f15 = this.d;
                float f16 = this.f44269c;
                if (z10) {
                    float f17 = jm0Var.Y;
                    if (f17 > 0.0f) {
                        this.f44268b.drawCircle(f16, f15, f14 * f17, this.f44271f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - jm0Var.Y) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f44273r, this.f44274s);
                jm0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                w71 w71Var = (w71) this.f44275w;
                boolean a10 = w71Var.f50902a.a();
                Paint paint3 = this.f44272n;
                float f18 = this.f44270e;
                float f19 = this.d;
                float f20 = this.f44269c;
                if (a10) {
                    float f21 = w71Var.f50935j2;
                    if (f21 > 0.0f) {
                        this.f44268b.drawCircle(f20, f19, f18 * f21, this.f44271f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - w71Var.f50935j2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f44273r, this.f44274s);
                w71Var.P1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
