package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class lc extends View {
    public final int f38877a;
    public final Canvas f38878b;
    public final float f38879c;
    public final float d;
    public final float e;
    public final Paint f38880f;
    public final Bitmap h;
    public final Paint f38881n;
    public final float f38882r;
    public final float f38883s;
    public final org.telegram.ui.ActionBar.n2 v;

    public lc(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f38877a = i10;
        this.v = n2Var;
        this.f38878b = canvas;
        this.f38879c = f7;
        this.d = f10;
        this.e = f11;
        this.f38880f = paint;
        this.h = bitmap;
        this.f38881n = paint2;
        this.f38882r = f12;
        this.f38883s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f38877a) {
            case 0:
                super.onDraw(canvas);
                bd bdVar = (bd) this.v;
                boolean z10 = bdVar.J;
                Paint paint = this.f38881n;
                float f7 = this.e;
                float f10 = this.d;
                float f11 = this.f38879c;
                if (z10) {
                    float f12 = bdVar.f35583n0;
                    if (f12 > 0.0f) {
                        this.f38878b.drawCircle(f11, f10, f7 * f12, this.f38880f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - bdVar.f35583n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f38882r, this.f38883s);
                bdVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                ip0 ip0Var = (ip0) this.v;
                boolean z11 = ip0Var.S;
                Paint paint2 = this.f38881n;
                float f13 = this.e;
                float f14 = this.d;
                float f15 = this.f38879c;
                if (z11) {
                    float f16 = ip0Var.Y;
                    if (f16 > 0.0f) {
                        this.f38878b.drawCircle(f15, f14, f13 * f16, this.f38880f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - ip0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f38882r, this.f38883s);
                ip0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                kc1 kc1Var = (kc1) this.v;
                boolean a2 = kc1Var.f38510a.a();
                Paint paint3 = this.f38881n;
                float f17 = this.e;
                float f18 = this.d;
                float f19 = this.f38879c;
                if (a2) {
                    float f20 = kc1Var.f38539i2;
                    if (f20 > 0.0f) {
                        this.f38878b.drawCircle(f19, f18, f17 * f20, this.f38880f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - kc1Var.f38539i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f38882r, this.f38883s);
                kc1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
