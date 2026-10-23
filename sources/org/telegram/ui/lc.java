package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class lc extends View {
    public final int f39213a;
    public final Canvas f39214b;
    public final float f39215c;
    public final float d;
    public final float e;
    public final Paint f39216f;
    public final Bitmap h;
    public final Paint f39217n;
    public final float f39218r;
    public final float f39219s;
    public final org.telegram.ui.ActionBar.o2 v;

    public lc(org.telegram.ui.ActionBar.o2 o2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f39213a = i10;
        this.v = o2Var;
        this.f39214b = canvas;
        this.f39215c = f7;
        this.d = f10;
        this.e = f11;
        this.f39216f = paint;
        this.h = bitmap;
        this.f39217n = paint2;
        this.f39218r = f12;
        this.f39219s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f39213a) {
            case 0:
                super.onDraw(canvas);
                bd bdVar = (bd) this.v;
                boolean z10 = bdVar.J;
                Paint paint = this.f39217n;
                float f7 = this.e;
                float f10 = this.d;
                float f11 = this.f39215c;
                if (z10) {
                    float f12 = bdVar.f36034n0;
                    if (f12 > 0.0f) {
                        this.f39214b.drawCircle(f11, f10, f7 * f12, this.f39216f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - bdVar.f36034n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f39218r, this.f39219s);
                bdVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                lp0 lp0Var = (lp0) this.v;
                boolean z11 = lp0Var.S;
                Paint paint2 = this.f39217n;
                float f13 = this.e;
                float f14 = this.d;
                float f15 = this.f39215c;
                if (z11) {
                    float f16 = lp0Var.Y;
                    if (f16 > 0.0f) {
                        this.f39214b.drawCircle(f15, f14, f13 * f16, this.f39216f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - lp0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f39218r, this.f39219s);
                lp0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                qc1 qc1Var = (qc1) this.v;
                boolean a2 = qc1Var.f40713a.a();
                Paint paint3 = this.f39217n;
                float f17 = this.e;
                float f18 = this.d;
                float f19 = this.f39215c;
                if (a2) {
                    float f20 = qc1Var.f40745j2;
                    if (f20 > 0.0f) {
                        this.f39214b.drawCircle(f19, f18, f17 * f20, this.f39216f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - qc1Var.f40745j2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f39218r, this.f39219s);
                qc1Var.P1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
