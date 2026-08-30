package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class uo extends View {
    public final int f29258a;
    public final boolean f29259b;
    public final Canvas f29260c;
    public final float d;
    public final float e;
    public final float f29261f;
    public final Paint h;
    public final Bitmap f29262n;
    public final Paint f29263r;
    public final float f29264s;
    public final float v;
    public final NotificationCenter.NotificationCenterDelegate f29265w;

    public uo(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z4, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i10) {
        super(context);
        this.f29258a = i10;
        this.f29265w = notificationCenterDelegate;
        this.f29259b = z4;
        this.f29260c = canvas;
        this.d = f10;
        this.e = f11;
        this.f29261f = f12;
        this.h = paint;
        this.f29262n = bitmap;
        this.f29263r = paint2;
        this.f29264s = f13;
        this.v = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f29258a) {
            case 0:
                kp kpVar = (kp) this.f29265w;
                super.onDraw(canvas);
                boolean z4 = this.f29259b;
                Paint paint = this.f29263r;
                float f10 = this.f29261f;
                float f11 = this.e;
                float f12 = this.d;
                if (z4) {
                    float f13 = kpVar.P;
                    if (f13 > 0.0f) {
                        this.f29260c.drawCircle(f12, f11, f10 * f13, this.h);
                    }
                    canvas.drawBitmap(this.f29262n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - kpVar.P) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f29264s, this.v);
                kpVar.D.draw(canvas);
                canvas.restore();
                return;
            case 1:
                org.telegram.ui.l21 l21Var = (org.telegram.ui.l21) this.f29265w;
                super.onDraw(canvas);
                boolean z10 = this.f29259b;
                Paint paint2 = this.f29263r;
                float f14 = this.f29261f;
                float f15 = this.e;
                float f16 = this.d;
                if (z10) {
                    float f17 = l21Var.M;
                    if (f17 > 0.0f) {
                        this.f29260c.drawCircle(f16, f15, f14 * f17, this.h);
                    }
                    canvas.drawBitmap(this.f29262n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - l21Var.M) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f29264s, this.v);
                l21Var.C.draw(canvas);
                canvas.restore();
                return;
            default:
                ph.da daVar = (ph.da) this.f29265w;
                super.onDraw(canvas);
                boolean z11 = this.f29259b;
                Paint paint3 = this.f29263r;
                float f18 = this.f29261f;
                float f19 = this.e;
                float f20 = this.d;
                if (z11) {
                    float f21 = daVar.A2;
                    if (f21 > 0.0f) {
                        this.f29260c.drawCircle(f20, f19, f18 * f21, this.h);
                    }
                    canvas.drawBitmap(this.f29262n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - daVar.A2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f29264s, this.v);
                daVar.f41491f1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
