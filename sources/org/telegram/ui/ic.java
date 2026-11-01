package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class ic extends View {
    public final int f37993a;
    public final Canvas f37994b;
    public final float f37995c;
    public final float d;
    public final float e;
    public final Paint f37996f;
    public final Bitmap h;
    public final Paint f37997n;
    public final float f37998r;
    public final float f37999s;
    public final org.telegram.ui.ActionBar.k2 f38000w;

    public ic(org.telegram.ui.ActionBar.k2 k2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f37993a = i10;
        this.f38000w = k2Var;
        this.f37994b = canvas;
        this.f37995c = f7;
        this.d = f10;
        this.e = f11;
        this.f37996f = paint;
        this.h = bitmap;
        this.f37997n = paint2;
        this.f37998r = f12;
        this.f37999s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f37993a) {
            case 0:
                super.onDraw(canvas);
                zc zcVar = (zc) this.f38000w;
                boolean z10 = zcVar.J;
                Paint paint = this.f37997n;
                float f7 = this.e;
                float f10 = this.d;
                float f11 = this.f37995c;
                if (z10) {
                    float f12 = zcVar.f43906n0;
                    if (f12 > 0.0f) {
                        this.f37994b.drawCircle(f11, f10, f7 * f12, this.f37996f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - zcVar.f43906n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f37998r, this.f37999s);
                zcVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                rn0 rn0Var = (rn0) this.f38000w;
                boolean z11 = rn0Var.S;
                Paint paint2 = this.f37997n;
                float f13 = this.e;
                float f14 = this.d;
                float f15 = this.f37995c;
                if (z11) {
                    float f16 = rn0Var.Y;
                    if (f16 > 0.0f) {
                        this.f37994b.drawCircle(f15, f14, f13 * f16, this.f37996f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - rn0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f37998r, this.f37999s);
                rn0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                k91 k91Var = (k91) this.f38000w;
                boolean a2 = k91Var.f38712a.a();
                Paint paint3 = this.f37997n;
                float f17 = this.e;
                float f18 = this.d;
                float f19 = this.f37995c;
                if (a2) {
                    float f20 = k91Var.f38744j2;
                    if (f20 > 0.0f) {
                        this.f37994b.drawCircle(f19, f18, f17 * f20, this.f37996f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - k91Var.f38744j2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f37998r, this.f37999s);
                k91Var.P1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
