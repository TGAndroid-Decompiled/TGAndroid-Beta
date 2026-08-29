package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class fc extends View {
    public final int f38095a;
    public final Canvas f38096b;
    public final float f38097c;
    public final float d;
    public final float f38098e;
    public final Paint f38099f;
    public final Bitmap h;
    public final Paint f38100n;
    public final float f38101r;
    public final float f38102s;
    public final org.telegram.ui.ActionBar.o2 v;

    public fc(org.telegram.ui.ActionBar.o2 o2Var, Activity activity, Canvas canvas, float f9, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f38095a = i10;
        this.v = o2Var;
        this.f38096b = canvas;
        this.f38097c = f9;
        this.d = f10;
        this.f38098e = f11;
        this.f38099f = paint;
        this.h = bitmap;
        this.f38100n = paint2;
        this.f38101r = f12;
        this.f38102s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f38095a) {
            case 0:
                super.onDraw(canvas);
                vc vcVar = (vc) this.v;
                boolean z10 = vcVar.F;
                Paint paint = this.f38100n;
                float f9 = this.f38098e;
                float f10 = this.d;
                float f11 = this.f38097c;
                if (z10) {
                    float f12 = vcVar.f43516j0;
                    if (f12 > 0.0f) {
                        this.f38096b.drawCircle(f11, f10, f9 * f12, this.f38099f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - vcVar.f43516j0) * f9, paint);
                }
                canvas.save();
                canvas.translate(this.f38101r, this.f38102s);
                vcVar.H.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                yo0 yo0Var = (yo0) this.v;
                boolean z11 = yo0Var.F;
                Paint paint2 = this.f38100n;
                float f13 = this.f38098e;
                float f14 = this.d;
                float f15 = this.f38097c;
                if (z11) {
                    float f16 = yo0Var.L;
                    if (f16 > 0.0f) {
                        this.f38096b.drawCircle(f15, f14, f13 * f16, this.f38099f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - yo0Var.L) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f38101r, this.f38102s);
                yo0Var.B.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                qc1 qc1Var = (qc1) this.v;
                boolean a2 = qc1Var.f41623a.a();
                Paint paint3 = this.f38100n;
                float f17 = this.f38098e;
                float f18 = this.d;
                float f19 = this.f38097c;
                if (a2) {
                    float f20 = qc1Var.f41640e2;
                    if (f20 > 0.0f) {
                        this.f38096b.drawCircle(f19, f18, f17 * f20, this.f38099f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - qc1Var.f41640e2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f38101r, this.f38102s);
                qc1Var.K1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
