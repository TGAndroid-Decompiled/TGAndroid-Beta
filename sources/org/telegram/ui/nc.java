package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class nc extends View {
    public final int f39397a;
    public final Canvas f39398b;
    public final float f39399c;
    public final float d;
    public final float e;
    public final Paint f39400f;
    public final Bitmap h;
    public final Paint f39401n;
    public final float f39402r;
    public final float f39403s;
    public final org.telegram.ui.ActionBar.n2 v;

    public nc(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f39397a = i10;
        this.v = n2Var;
        this.f39398b = canvas;
        this.f39399c = f7;
        this.d = f10;
        this.e = f11;
        this.f39400f = paint;
        this.h = bitmap;
        this.f39401n = paint2;
        this.f39402r = f12;
        this.f39403s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f39397a) {
            case 0:
                super.onDraw(canvas);
                dd ddVar = (dd) this.v;
                boolean z10 = ddVar.J;
                Paint paint = this.f39401n;
                float f7 = this.e;
                float f10 = this.d;
                float f11 = this.f39399c;
                if (z10) {
                    float f12 = ddVar.f36146n0;
                    if (f12 > 0.0f) {
                        this.f39398b.drawCircle(f11, f10, f7 * f12, this.f39400f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - ddVar.f36146n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f39402r, this.f39403s);
                ddVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                kp0 kp0Var = (kp0) this.v;
                boolean z11 = kp0Var.S;
                Paint paint2 = this.f39401n;
                float f13 = this.e;
                float f14 = this.d;
                float f15 = this.f39399c;
                if (z11) {
                    float f16 = kp0Var.Y;
                    if (f16 > 0.0f) {
                        this.f39398b.drawCircle(f15, f14, f13 * f16, this.f39400f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - kp0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f39402r, this.f39403s);
                kp0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                mc1 mc1Var = (mc1) this.v;
                boolean a2 = mc1Var.f39078a.a();
                Paint paint3 = this.f39401n;
                float f17 = this.e;
                float f18 = this.d;
                float f19 = this.f39399c;
                if (a2) {
                    float f20 = mc1Var.f39107i2;
                    if (f20 > 0.0f) {
                        this.f39398b.drawCircle(f19, f18, f17 * f20, this.f39400f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - mc1Var.f39107i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f39402r, this.f39403s);
                mc1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
