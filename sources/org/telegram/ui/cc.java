package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class cc extends View {
    public final int f44739a;
    public final Canvas f44740b;
    public final float f44741c;
    public final float d;
    public final float f44742e;
    public final Paint f44743f;
    public final Bitmap h;
    public final Paint f44744n;
    public final float f44745r;
    public final float f44746s;
    public final org.telegram.ui.ActionBar.f2 f44747w;

    public cc(org.telegram.ui.ActionBar.f2 f2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i7) {
        super(activity);
        this.f44739a = i7;
        this.f44747w = f2Var;
        this.f44740b = canvas;
        this.f44741c = f10;
        this.d = f11;
        this.f44742e = f12;
        this.f44743f = paint;
        this.h = bitmap;
        this.f44744n = paint2;
        this.f44745r = f13;
        this.f44746s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f44739a) {
            case 0:
                super.onDraw(canvas);
                rc rcVar = (rc) this.f44747w;
                boolean z9 = rcVar.J;
                Paint paint = this.f44744n;
                float f10 = this.f44742e;
                float f11 = this.d;
                float f12 = this.f44741c;
                if (z9) {
                    float f13 = rcVar.f49465n0;
                    if (f13 > 0.0f) {
                        this.f44740b.drawCircle(f12, f11, f10 * f13, this.f44743f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - rcVar.f49465n0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f44745r, this.f44746s);
                rcVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                hm0 hm0Var = (hm0) this.f44747w;
                boolean z10 = hm0Var.S;
                Paint paint2 = this.f44744n;
                float f14 = this.f44742e;
                float f15 = this.d;
                float f16 = this.f44741c;
                if (z10) {
                    float f17 = hm0Var.Y;
                    if (f17 > 0.0f) {
                        this.f44740b.drawCircle(f16, f15, f14 * f17, this.f44743f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - hm0Var.Y) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f44745r, this.f44746s);
                hm0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                u71 u71Var = (u71) this.f44747w;
                boolean a10 = u71Var.f50266a.a();
                Paint paint3 = this.f44744n;
                float f18 = this.f44742e;
                float f19 = this.d;
                float f20 = this.f44741c;
                if (a10) {
                    float f21 = u71Var.f50299j2;
                    if (f21 > 0.0f) {
                        this.f44740b.drawCircle(f20, f19, f18 * f21, this.f44743f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - u71Var.f50299j2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f44745r, this.f44746s);
                u71Var.P1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
