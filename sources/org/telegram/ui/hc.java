package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public final class hc extends View {

    public final int f38772a;

    public final Canvas f38773b;

    public final float f38774c;
    public final float d;

    public final float f38775e;

    public final Paint f38776f;
    public final Bitmap h;

    public final Paint f38777n;

    public final float f38778r;

    public final float f38779s;
    public final org.telegram.ui.ActionBar.n2 v;

    public hc(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i10) {
        super(activity);
        this.f38772a = i10;
        this.v = n2Var;
        this.f38773b = canvas;
        this.f38774c = f10;
        this.d = f11;
        this.f38775e = f12;
        this.f38776f = paint;
        this.h = bitmap;
        this.f38777n = paint2;
        this.f38778r = f13;
        this.f38779s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f38772a) {
            case 0:
                super.onDraw(canvas);
                xc xcVar = (xc) this.v;
                boolean z10 = xcVar.F;
                Paint paint = this.f38777n;
                float f10 = this.f38775e;
                float f11 = this.d;
                float f12 = this.f38774c;
                if (z10) {
                    float f13 = xcVar.f44394j0;
                    if (f13 > 0.0f) {
                        this.f38773b.drawCircle(f12, f11, f10 * f13, this.f38776f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - xcVar.f44394j0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f38778r, this.f38779s);
                xcVar.H.draw(canvas);
                canvas.restore();
                break;
            case 1:
                super.onDraw(canvas);
                ap0 ap0Var = (ap0) this.v;
                boolean z11 = ap0Var.F;
                Paint paint2 = this.f38777n;
                float f14 = this.f38775e;
                float f15 = this.d;
                float f16 = this.f38774c;
                if (z11) {
                    float f17 = ap0Var.L;
                    if (f17 > 0.0f) {
                        this.f38773b.drawCircle(f16, f15, f14 * f17, this.f38776f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - ap0Var.L) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f38778r, this.f38779s);
                ap0Var.B.draw(canvas);
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                nc1 nc1Var = (nc1) this.v;
                boolean zA = nc1Var.f40735a.a();
                Paint paint3 = this.f38777n;
                float f18 = this.f38775e;
                float f19 = this.d;
                float f20 = this.f38774c;
                if (zA) {
                    float f21 = nc1Var.f40752e2;
                    if (f21 > 0.0f) {
                        this.f38773b.drawCircle(f20, f19, f18 * f21, this.f38776f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - nc1Var.f40752e2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f38778r, this.f38779s);
                nc1Var.K1.draw(canvas);
                canvas.restore();
                break;
        }
    }
}
