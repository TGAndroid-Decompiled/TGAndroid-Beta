package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class bc extends View {
    public final int f45853a;
    public final Canvas f45854b;
    public final float f45855c;
    public final float d;
    public final float f45856e;
    public final Paint f45857f;
    public final Bitmap h;
    public final Paint f45858n;
    public final float f45859r;
    public final float f45860s;
    public final org.telegram.ui.ActionBar.g2 f45861w;

    public bc(org.telegram.ui.ActionBar.g2 g2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i7) {
        super(activity);
        this.f45853a = i7;
        this.f45861w = g2Var;
        this.f45854b = canvas;
        this.f45855c = f10;
        this.d = f11;
        this.f45856e = f12;
        this.f45857f = paint;
        this.h = bitmap;
        this.f45858n = paint2;
        this.f45859r = f13;
        this.f45860s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f45853a) {
            case 0:
                super.onDraw(canvas);
                qc qcVar = (qc) this.f45861w;
                boolean z10 = qcVar.K;
                Paint paint = this.f45858n;
                float f10 = this.f45856e;
                float f11 = this.d;
                float f12 = this.f45855c;
                if (z10) {
                    float f13 = qcVar.f51224o0;
                    if (f13 > 0.0f) {
                        this.f45854b.drawCircle(f12, f11, f10 * f13, this.f45857f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - qcVar.f51224o0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f45859r, this.f45860s);
                qcVar.M.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                lm0 lm0Var = (lm0) this.f45861w;
                boolean z11 = lm0Var.T;
                Paint paint2 = this.f45858n;
                float f14 = this.f45856e;
                float f15 = this.d;
                float f16 = this.f45855c;
                if (z11) {
                    float f17 = lm0Var.Z;
                    if (f17 > 0.0f) {
                        this.f45854b.drawCircle(f16, f15, f14 * f17, this.f45857f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - lm0Var.Z) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f45859r, this.f45860s);
                lm0Var.L.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                x71 x71Var = (x71) this.f45861w;
                boolean d = x71Var.f53711a.d();
                Paint paint3 = this.f45858n;
                float f18 = this.f45856e;
                float f19 = this.d;
                float f20 = this.f45855c;
                if (d) {
                    float f21 = x71Var.f53747k2;
                    if (f21 > 0.0f) {
                        this.f45854b.drawCircle(f20, f19, f18 * f21, this.f45857f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - x71Var.f53747k2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f45859r, this.f45860s);
                x71Var.Q1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
