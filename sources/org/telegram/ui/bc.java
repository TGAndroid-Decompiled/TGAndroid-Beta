package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class bc extends View {
    public final int f45672a;
    public final Canvas f45673b;
    public final float f45674c;
    public final float d;
    public final float f45675e;
    public final Paint f45676f;
    public final Bitmap h;
    public final Paint f45677n;
    public final float f45678r;
    public final float f45679s;
    public final org.telegram.ui.ActionBar.e2 f45680w;

    public bc(org.telegram.ui.ActionBar.e2 e2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i7) {
        super(activity);
        this.f45672a = i7;
        this.f45680w = e2Var;
        this.f45673b = canvas;
        this.f45674c = f10;
        this.d = f11;
        this.f45675e = f12;
        this.f45676f = paint;
        this.h = bitmap;
        this.f45677n = paint2;
        this.f45678r = f13;
        this.f45679s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f45672a) {
            case 0:
                super.onDraw(canvas);
                qc qcVar = (qc) this.f45680w;
                boolean z10 = qcVar.K;
                Paint paint = this.f45677n;
                float f10 = this.f45675e;
                float f11 = this.d;
                float f12 = this.f45674c;
                if (z10) {
                    float f13 = qcVar.f50571o0;
                    if (f13 > 0.0f) {
                        this.f45673b.drawCircle(f12, f11, f10 * f13, this.f45676f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - qcVar.f50571o0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f45678r, this.f45679s);
                qcVar.M.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                im0 im0Var = (im0) this.f45680w;
                boolean z11 = im0Var.T;
                Paint paint2 = this.f45677n;
                float f14 = this.f45675e;
                float f15 = this.d;
                float f16 = this.f45674c;
                if (z11) {
                    float f17 = im0Var.Z;
                    if (f17 > 0.0f) {
                        this.f45673b.drawCircle(f16, f15, f14 * f17, this.f45676f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - im0Var.Z) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f45678r, this.f45679s);
                im0Var.L.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                t71 t71Var = (t71) this.f45680w;
                boolean a10 = t71Var.f51408a.a();
                Paint paint3 = this.f45677n;
                float f18 = this.f45675e;
                float f19 = this.d;
                float f20 = this.f45674c;
                if (a10) {
                    float f21 = t71Var.f51444k2;
                    if (f21 > 0.0f) {
                        this.f45673b.drawCircle(f20, f19, f18 * f21, this.f45676f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - t71Var.f51444k2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f45678r, this.f45679s);
                t71Var.Q1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
