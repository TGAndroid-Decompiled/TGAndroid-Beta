package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class gc extends View {
    public final int f38500a;
    public final Canvas f38501b;
    public final float f38502c;
    public final float d;
    public final float f38503e;
    public final Paint f38504f;
    public final Bitmap h;
    public final Paint f38505n;
    public final float f38506r;
    public final float f38507s;
    public final org.telegram.ui.ActionBar.o2 v;

    public gc(org.telegram.ui.ActionBar.o2 o2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i9) {
        super(activity);
        this.f38500a = i9;
        this.v = o2Var;
        this.f38501b = canvas;
        this.f38502c = f10;
        this.d = f11;
        this.f38503e = f12;
        this.f38504f = paint;
        this.h = bitmap;
        this.f38505n = paint2;
        this.f38506r = f13;
        this.f38507s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f38500a) {
            case 0:
                super.onDraw(canvas);
                xc xcVar = (xc) this.v;
                boolean z10 = xcVar.F;
                Paint paint = this.f38505n;
                float f10 = this.f38503e;
                float f11 = this.d;
                float f12 = this.f38502c;
                if (z10) {
                    float f13 = xcVar.f44474j0;
                    if (f13 > 0.0f) {
                        this.f38501b.drawCircle(f12, f11, f10 * f13, this.f38504f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - xcVar.f44474j0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f38506r, this.f38507s);
                xcVar.H.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                zo0 zo0Var = (zo0) this.v;
                boolean z11 = zo0Var.F;
                Paint paint2 = this.f38505n;
                float f14 = this.f38503e;
                float f15 = this.d;
                float f16 = this.f38502c;
                if (z11) {
                    float f17 = zo0Var.L;
                    if (f17 > 0.0f) {
                        this.f38501b.drawCircle(f16, f15, f14 * f17, this.f38504f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - zo0Var.L) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f38506r, this.f38507s);
                zo0Var.B.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                oc1 oc1Var = (oc1) this.v;
                boolean a2 = oc1Var.f41056a.a();
                Paint paint3 = this.f38505n;
                float f18 = this.f38503e;
                float f19 = this.d;
                float f20 = this.f38502c;
                if (a2) {
                    float f21 = oc1Var.f41073e2;
                    if (f21 > 0.0f) {
                        this.f38501b.drawCircle(f20, f19, f18 * f21, this.f38504f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - oc1Var.f41073e2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f38506r, this.f38507s);
                oc1Var.K1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
