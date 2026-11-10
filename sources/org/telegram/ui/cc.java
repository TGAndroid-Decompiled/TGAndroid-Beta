package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class cc extends View {
    public final int f44313a;
    public final Canvas f44314b;
    public final float f44315c;
    public final float d;
    public final float f44316e;
    public final Paint f44317f;
    public final Bitmap h;
    public final Paint f44318n;
    public final float f44319r;
    public final float f44320s;
    public final org.telegram.ui.ActionBar.f2 f44321w;

    public cc(org.telegram.ui.ActionBar.f2 f2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i7) {
        super(activity);
        this.f44313a = i7;
        this.f44321w = f2Var;
        this.f44314b = canvas;
        this.f44315c = f10;
        this.d = f11;
        this.f44316e = f12;
        this.f44317f = paint;
        this.h = bitmap;
        this.f44318n = paint2;
        this.f44319r = f13;
        this.f44320s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f44313a) {
            case 0:
                super.onDraw(canvas);
                rc rcVar = (rc) this.f44321w;
                boolean z9 = rcVar.J;
                Paint paint = this.f44318n;
                float f10 = this.f44316e;
                float f11 = this.d;
                float f12 = this.f44315c;
                if (z9) {
                    float f13 = rcVar.f49369n0;
                    if (f13 > 0.0f) {
                        this.f44314b.drawCircle(f12, f11, f10 * f13, this.f44317f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - rcVar.f49369n0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f44319r, this.f44320s);
                rcVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                km0 km0Var = (km0) this.f44321w;
                boolean z10 = km0Var.S;
                Paint paint2 = this.f44318n;
                float f14 = this.f44316e;
                float f15 = this.d;
                float f16 = this.f44315c;
                if (z10) {
                    float f17 = km0Var.Y;
                    if (f17 > 0.0f) {
                        this.f44314b.drawCircle(f16, f15, f14 * f17, this.f44317f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - km0Var.Y) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f44319r, this.f44320s);
                km0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                x71 x71Var = (x71) this.f44321w;
                boolean a10 = x71Var.f51561a.a();
                Paint paint3 = this.f44318n;
                float f18 = this.f44316e;
                float f19 = this.d;
                float f20 = this.f44315c;
                if (a10) {
                    float f21 = x71Var.f51594j2;
                    if (f21 > 0.0f) {
                        this.f44314b.drawCircle(f20, f19, f18 * f21, this.f44317f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - x71Var.f51594j2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f44319r, this.f44320s);
                x71Var.P1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
