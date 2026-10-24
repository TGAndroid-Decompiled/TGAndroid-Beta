package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class lc extends View {
    public final int f39184a;
    public final Canvas f39185b;
    public final float f39186c;
    public final float d;
    public final float e;
    public final Paint f39187f;
    public final Bitmap h;
    public final Paint f39188n;
    public final float f39189r;
    public final float f39190s;
    public final org.telegram.ui.ActionBar.o2 v;

    public lc(org.telegram.ui.ActionBar.o2 o2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f39184a = i10;
        this.v = o2Var;
        this.f39185b = canvas;
        this.f39186c = f7;
        this.d = f10;
        this.e = f11;
        this.f39187f = paint;
        this.h = bitmap;
        this.f39188n = paint2;
        this.f39189r = f12;
        this.f39190s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f39184a) {
            case 0:
                super.onDraw(canvas);
                bd bdVar = (bd) this.v;
                boolean z10 = bdVar.J;
                Paint paint = this.f39188n;
                float f7 = this.e;
                float f10 = this.d;
                float f11 = this.f39186c;
                if (z10) {
                    float f12 = bdVar.f36032n0;
                    if (f12 > 0.0f) {
                        this.f39185b.drawCircle(f11, f10, f7 * f12, this.f39187f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - bdVar.f36032n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f39189r, this.f39190s);
                bdVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                kp0 kp0Var = (kp0) this.v;
                boolean z11 = kp0Var.S;
                Paint paint2 = this.f39188n;
                float f13 = this.e;
                float f14 = this.d;
                float f15 = this.f39186c;
                if (z11) {
                    float f16 = kp0Var.Y;
                    if (f16 > 0.0f) {
                        this.f39185b.drawCircle(f15, f14, f13 * f16, this.f39187f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - kp0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f39189r, this.f39190s);
                kp0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                pc1 pc1Var = (pc1) this.v;
                boolean a2 = pc1Var.f40442a.a();
                Paint paint3 = this.f39188n;
                float f17 = this.e;
                float f18 = this.d;
                float f19 = this.f39186c;
                if (a2) {
                    float f20 = pc1Var.f40474j2;
                    if (f20 > 0.0f) {
                        this.f39185b.drawCircle(f19, f18, f17 * f20, this.f39187f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - pc1Var.f40474j2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f39189r, this.f39190s);
                pc1Var.P1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
