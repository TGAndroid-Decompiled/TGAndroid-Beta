package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class mc extends View {
    public final int f38561a;
    public final Canvas f38562b;
    public final float f38563c;
    public final float d;
    public final float f38564e;
    public final Paint f38565f;
    public final Bitmap h;
    public final Paint f38566n;
    public final float f38567r;
    public final float f38568s;
    public final org.telegram.ui.ActionBar.n2 v;

    public mc(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f38561a = i10;
        this.v = n2Var;
        this.f38562b = canvas;
        this.f38563c = f7;
        this.d = f10;
        this.f38564e = f11;
        this.f38565f = paint;
        this.h = bitmap;
        this.f38566n = paint2;
        this.f38567r = f12;
        this.f38568s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f38561a) {
            case 0:
                super.onDraw(canvas);
                cd cdVar = (cd) this.v;
                boolean z10 = cdVar.J;
                Paint paint = this.f38566n;
                float f7 = this.f38564e;
                float f10 = this.d;
                float f11 = this.f38563c;
                if (z10) {
                    float f12 = cdVar.f35416n0;
                    if (f12 > 0.0f) {
                        this.f38562b.drawCircle(f11, f10, f7 * f12, this.f38565f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - cdVar.f35416n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f38567r, this.f38568s);
                cdVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                wp0 wp0Var = (wp0) this.v;
                boolean z11 = wp0Var.S;
                Paint paint2 = this.f38566n;
                float f13 = this.f38564e;
                float f14 = this.d;
                float f15 = this.f38563c;
                if (z11) {
                    float f16 = wp0Var.Y;
                    if (f16 > 0.0f) {
                        this.f38562b.drawCircle(f15, f14, f13 * f16, this.f38565f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - wp0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f38567r, this.f38568s);
                wp0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                pd1 pd1Var = (pd1) this.v;
                boolean a2 = pd1Var.f39487a.a();
                Paint paint3 = this.f38566n;
                float f17 = this.f38564e;
                float f18 = this.d;
                float f19 = this.f38563c;
                if (a2) {
                    float f20 = pd1Var.f39517i2;
                    if (f20 > 0.0f) {
                        this.f38562b.drawCircle(f19, f18, f17 * f20, this.f38565f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - pd1Var.f39517i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f38567r, this.f38568s);
                pd1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
