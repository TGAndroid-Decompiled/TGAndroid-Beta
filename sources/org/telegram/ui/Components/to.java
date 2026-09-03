package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class to extends View {
    public final int f29003a;
    public final boolean f29004b;
    public final Canvas f29005c;
    public final float d;
    public final float e;
    public final float f29006f;
    public final Paint h;
    public final Bitmap f29007n;
    public final Paint f29008r;
    public final float f29009s;
    public final float v;
    public final NotificationCenter.NotificationCenterDelegate f29010w;

    public to(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z4, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i10) {
        super(context);
        this.f29003a = i10;
        this.f29010w = notificationCenterDelegate;
        this.f29004b = z4;
        this.f29005c = canvas;
        this.d = f10;
        this.e = f11;
        this.f29006f = f12;
        this.h = paint;
        this.f29007n = bitmap;
        this.f29008r = paint2;
        this.f29009s = f13;
        this.v = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f29003a) {
            case 0:
                jp jpVar = (jp) this.f29010w;
                super.onDraw(canvas);
                boolean z4 = this.f29004b;
                Paint paint = this.f29008r;
                float f10 = this.f29006f;
                float f11 = this.e;
                float f12 = this.d;
                if (z4) {
                    float f13 = jpVar.P;
                    if (f13 > 0.0f) {
                        this.f29005c.drawCircle(f12, f11, f10 * f13, this.h);
                    }
                    canvas.drawBitmap(this.f29007n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - jpVar.P) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f29009s, this.v);
                jpVar.D.draw(canvas);
                canvas.restore();
                return;
            case 1:
                org.telegram.ui.t21 t21Var = (org.telegram.ui.t21) this.f29010w;
                super.onDraw(canvas);
                boolean z10 = this.f29004b;
                Paint paint2 = this.f29008r;
                float f14 = this.f29006f;
                float f15 = this.e;
                float f16 = this.d;
                if (z10) {
                    float f17 = t21Var.M;
                    if (f17 > 0.0f) {
                        this.f29005c.drawCircle(f16, f15, f14 * f17, this.h);
                    }
                    canvas.drawBitmap(this.f29007n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - t21Var.M) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f29009s, this.v);
                t21Var.C.draw(canvas);
                canvas.restore();
                return;
            default:
                ph.da daVar = (ph.da) this.f29010w;
                super.onDraw(canvas);
                boolean z11 = this.f29004b;
                Paint paint3 = this.f29008r;
                float f18 = this.f29006f;
                float f19 = this.e;
                float f20 = this.d;
                if (z11) {
                    float f21 = daVar.A2;
                    if (f21 > 0.0f) {
                        this.f29005c.drawCircle(f20, f19, f18 * f21, this.h);
                    }
                    canvas.drawBitmap(this.f29007n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - daVar.A2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f29009s, this.v);
                daVar.f41529f1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
