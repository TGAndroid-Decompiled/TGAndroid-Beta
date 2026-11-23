package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class bc extends View {
    public final int f46006a;
    public final Canvas f46007b;
    public final float f46008c;
    public final float d;
    public final float f46009e;
    public final Paint f46010f;
    public final Bitmap h;
    public final Paint f46011n;
    public final float f46012r;
    public final float f46013s;
    public final org.telegram.ui.ActionBar.g2 f46014w;

    public bc(org.telegram.ui.ActionBar.g2 g2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i7) {
        super(activity);
        this.f46006a = i7;
        this.f46014w = g2Var;
        this.f46007b = canvas;
        this.f46008c = f10;
        this.d = f11;
        this.f46009e = f12;
        this.f46010f = paint;
        this.h = bitmap;
        this.f46011n = paint2;
        this.f46012r = f13;
        this.f46013s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f46006a) {
            case 0:
                super.onDraw(canvas);
                qc qcVar = (qc) this.f46014w;
                boolean z10 = qcVar.K;
                Paint paint = this.f46011n;
                float f10 = this.f46009e;
                float f11 = this.d;
                float f12 = this.f46008c;
                if (z10) {
                    float f13 = qcVar.f51420o0;
                    if (f13 > 0.0f) {
                        this.f46007b.drawCircle(f12, f11, f10 * f13, this.f46010f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - qcVar.f51420o0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f46012r, this.f46013s);
                qcVar.M.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                jm0 jm0Var = (jm0) this.f46014w;
                boolean z11 = jm0Var.T;
                Paint paint2 = this.f46011n;
                float f14 = this.f46009e;
                float f15 = this.d;
                float f16 = this.f46008c;
                if (z11) {
                    float f17 = jm0Var.Z;
                    if (f17 > 0.0f) {
                        this.f46007b.drawCircle(f16, f15, f14 * f17, this.f46010f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - jm0Var.Z) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f46012r, this.f46013s);
                jm0Var.L.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                v71 v71Var = (v71) this.f46014w;
                boolean b10 = v71Var.f52845a.b();
                Paint paint3 = this.f46011n;
                float f18 = this.f46009e;
                float f19 = this.d;
                float f20 = this.f46008c;
                if (b10) {
                    float f21 = v71Var.f52881k2;
                    if (f21 > 0.0f) {
                        this.f46007b.drawCircle(f20, f19, f18 * f21, this.f46010f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - v71Var.f52881k2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f46012r, this.f46013s);
                v71Var.Q1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
