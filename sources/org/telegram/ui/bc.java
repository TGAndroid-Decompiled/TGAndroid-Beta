package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class bc extends View {
    public final int f45834a;
    public final Canvas f45835b;
    public final float f45836c;
    public final float d;
    public final float f45837e;
    public final Paint f45838f;
    public final Bitmap h;
    public final Paint f45839n;
    public final float f45840r;
    public final float f45841s;
    public final org.telegram.ui.ActionBar.h2 f45842w;

    public bc(org.telegram.ui.ActionBar.h2 h2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i7) {
        super(activity);
        this.f45834a = i7;
        this.f45842w = h2Var;
        this.f45835b = canvas;
        this.f45836c = f10;
        this.d = f11;
        this.f45837e = f12;
        this.f45838f = paint;
        this.h = bitmap;
        this.f45839n = paint2;
        this.f45840r = f13;
        this.f45841s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f45834a) {
            case 0:
                super.onDraw(canvas);
                qc qcVar = (qc) this.f45842w;
                boolean z10 = qcVar.K;
                Paint paint = this.f45839n;
                float f10 = this.f45837e;
                float f11 = this.d;
                float f12 = this.f45836c;
                if (z10) {
                    float f13 = qcVar.f51220o0;
                    if (f13 > 0.0f) {
                        this.f45835b.drawCircle(f12, f11, f10 * f13, this.f45838f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - qcVar.f51220o0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f45840r, this.f45841s);
                qcVar.M.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                lm0 lm0Var = (lm0) this.f45842w;
                boolean z11 = lm0Var.T;
                Paint paint2 = this.f45839n;
                float f14 = this.f45837e;
                float f15 = this.d;
                float f16 = this.f45836c;
                if (z11) {
                    float f17 = lm0Var.Z;
                    if (f17 > 0.0f) {
                        this.f45835b.drawCircle(f16, f15, f14 * f17, this.f45838f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - lm0Var.Z) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f45840r, this.f45841s);
                lm0Var.L.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                x71 x71Var = (x71) this.f45842w;
                boolean d = x71Var.f53682a.d();
                Paint paint3 = this.f45839n;
                float f18 = this.f45837e;
                float f19 = this.d;
                float f20 = this.f45836c;
                if (d) {
                    float f21 = x71Var.f53718k2;
                    if (f21 > 0.0f) {
                        this.f45835b.drawCircle(f20, f19, f18 * f21, this.f45838f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - x71Var.f53718k2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f45840r, this.f45841s);
                x71Var.Q1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
