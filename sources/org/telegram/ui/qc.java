package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class qc extends View {
    public final int f39095a;
    public final Canvas f39096b;
    public final float f39097c;
    public final float d;
    public final float e;
    public final Paint f39098f;
    public final Bitmap h;
    public final Paint f39099n;
    public final float f39100r;
    public final float f39101s;
    public final org.telegram.ui.ActionBar.m2 v;

    public qc(org.telegram.ui.ActionBar.m2 m2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f39095a = i10;
        this.v = m2Var;
        this.f39096b = canvas;
        this.f39097c = f7;
        this.d = f10;
        this.e = f11;
        this.f39098f = paint;
        this.h = bitmap;
        this.f39099n = paint2;
        this.f39100r = f12;
        this.f39101s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f39095a) {
            case 0:
                super.onDraw(canvas);
                gd gdVar = (gd) this.v;
                boolean z10 = gdVar.J;
                Paint paint = this.f39099n;
                float f7 = this.e;
                float f10 = this.d;
                float f11 = this.f39097c;
                if (z10) {
                    float f12 = gdVar.f36154n0;
                    if (f12 > 0.0f) {
                        this.f39096b.drawCircle(f11, f10, f7 * f12, this.f39098f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - gdVar.f36154n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f39100r, this.f39101s);
                gdVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                eq0 eq0Var = (eq0) this.v;
                boolean z11 = eq0Var.S;
                Paint paint2 = this.f39099n;
                float f13 = this.e;
                float f14 = this.d;
                float f15 = this.f39097c;
                if (z11) {
                    float f16 = eq0Var.Y;
                    if (f16 > 0.0f) {
                        this.f39096b.drawCircle(f15, f14, f13 * f16, this.f39098f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - eq0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f39100r, this.f39101s);
                eq0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                ce1 ce1Var = (ce1) this.v;
                boolean a2 = ce1Var.f34577a.a();
                Paint paint3 = this.f39099n;
                float f17 = this.e;
                float f18 = this.d;
                float f19 = this.f39097c;
                if (a2) {
                    float f20 = ce1Var.f34606i2;
                    if (f20 > 0.0f) {
                        this.f39096b.drawCircle(f19, f18, f17 * f20, this.f39098f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - ce1Var.f34606i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f39100r, this.f39101s);
                ce1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
