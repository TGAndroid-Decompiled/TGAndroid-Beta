package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class jc extends View {
    public final int f37940a;
    public final Canvas f37941b;
    public final float f37942c;
    public final float d;
    public final float f37943e;
    public final Paint f37944f;
    public final Bitmap h;
    public final Paint f37945n;
    public final float f37946r;
    public final float f37947s;
    public final org.telegram.ui.ActionBar.p2 v;

    public jc(org.telegram.ui.ActionBar.p2 p2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i10) {
        super(activity);
        this.f37940a = i10;
        this.v = p2Var;
        this.f37941b = canvas;
        this.f37942c = f10;
        this.d = f11;
        this.f37943e = f12;
        this.f37944f = paint;
        this.h = bitmap;
        this.f37945n = paint2;
        this.f37946r = f13;
        this.f37947s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f37940a) {
            case 0:
                super.onDraw(canvas);
                bd bdVar = (bd) this.v;
                boolean z4 = bdVar.G;
                Paint paint = this.f37945n;
                float f10 = this.f37943e;
                float f11 = this.d;
                float f12 = this.f37942c;
                if (z4) {
                    float f13 = bdVar.f35451k0;
                    if (f13 > 0.0f) {
                        this.f37941b.drawCircle(f12, f11, f10 * f13, this.f37944f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - bdVar.f35451k0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f37946r, this.f37947s);
                bdVar.I.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                np0 np0Var = (np0) this.v;
                boolean z10 = np0Var.P;
                Paint paint2 = this.f37945n;
                float f14 = this.f37943e;
                float f15 = this.d;
                float f16 = this.f37942c;
                if (z10) {
                    float f17 = np0Var.V;
                    if (f17 > 0.0f) {
                        this.f37941b.drawCircle(f16, f15, f14 * f17, this.f37944f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - np0Var.V) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f37946r, this.f37947s);
                np0Var.H.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                jd1 jd1Var = (jd1) this.v;
                boolean a2 = jd1Var.f37961a.a();
                Paint paint3 = this.f37945n;
                float f18 = this.f37943e;
                float f19 = this.d;
                float f20 = this.f37942c;
                if (a2) {
                    float f21 = jd1Var.f37982f2;
                    if (f21 > 0.0f) {
                        this.f37941b.drawCircle(f20, f19, f18 * f21, this.f37944f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - jd1Var.f37982f2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f37946r, this.f37947s);
                jd1Var.L1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
