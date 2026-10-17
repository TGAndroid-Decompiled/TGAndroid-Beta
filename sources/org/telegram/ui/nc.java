package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class nc extends View {
    public final int f39412a;
    public final Canvas f39413b;
    public final float f39414c;
    public final float d;
    public final float e;
    public final Paint f39415f;
    public final Bitmap h;
    public final Paint f39416n;
    public final float f39417r;
    public final float f39418s;
    public final org.telegram.ui.ActionBar.n2 v;

    public nc(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f39412a = i10;
        this.v = n2Var;
        this.f39413b = canvas;
        this.f39414c = f7;
        this.d = f10;
        this.e = f11;
        this.f39415f = paint;
        this.h = bitmap;
        this.f39416n = paint2;
        this.f39417r = f12;
        this.f39418s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f39412a) {
            case 0:
                super.onDraw(canvas);
                dd ddVar = (dd) this.v;
                boolean z10 = ddVar.J;
                Paint paint = this.f39416n;
                float f7 = this.e;
                float f10 = this.d;
                float f11 = this.f39414c;
                if (z10) {
                    float f12 = ddVar.f36153n0;
                    if (f12 > 0.0f) {
                        this.f39413b.drawCircle(f11, f10, f7 * f12, this.f39415f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - ddVar.f36153n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f39417r, this.f39418s);
                ddVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                jp0 jp0Var = (jp0) this.v;
                boolean z11 = jp0Var.S;
                Paint paint2 = this.f39416n;
                float f13 = this.e;
                float f14 = this.d;
                float f15 = this.f39414c;
                if (z11) {
                    float f16 = jp0Var.Y;
                    if (f16 > 0.0f) {
                        this.f39413b.drawCircle(f15, f14, f13 * f16, this.f39415f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - jp0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f39417r, this.f39418s);
                jp0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                mc1 mc1Var = (mc1) this.v;
                boolean a2 = mc1Var.f39097a.a();
                Paint paint3 = this.f39416n;
                float f17 = this.e;
                float f18 = this.d;
                float f19 = this.f39414c;
                if (a2) {
                    float f20 = mc1Var.f39126i2;
                    if (f20 > 0.0f) {
                        this.f39413b.drawCircle(f19, f18, f17 * f20, this.f39415f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - mc1Var.f39126i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f39417r, this.f39418s);
                mc1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
