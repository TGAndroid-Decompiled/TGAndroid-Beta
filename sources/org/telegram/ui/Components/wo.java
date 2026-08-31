package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class wo extends View {
    public final int f32825a;
    public final boolean f32826b;
    public final Canvas f32827c;
    public final float d;
    public final float f32828e;
    public final float f32829f;
    public final Paint h;
    public final Bitmap f32830n;
    public final Paint f32831r;
    public final float f32832s;
    public final float v;
    public final NotificationCenter.NotificationCenterDelegate f32833w;

    public wo(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z4, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i10) {
        super(context);
        this.f32825a = i10;
        this.f32833w = notificationCenterDelegate;
        this.f32826b = z4;
        this.f32827c = canvas;
        this.d = f10;
        this.f32828e = f11;
        this.f32829f = f12;
        this.h = paint;
        this.f32830n = bitmap;
        this.f32831r = paint2;
        this.f32832s = f13;
        this.v = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f32825a) {
            case 0:
                mp mpVar = (mp) this.f32833w;
                super.onDraw(canvas);
                boolean z4 = this.f32826b;
                Paint paint = this.f32831r;
                float f10 = this.f32829f;
                float f11 = this.f32828e;
                float f12 = this.d;
                if (z4) {
                    float f13 = mpVar.P;
                    if (f13 > 0.0f) {
                        this.f32827c.drawCircle(f12, f11, f10 * f13, this.h);
                    }
                    canvas.drawBitmap(this.f32830n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - mpVar.P) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f32832s, this.v);
                mpVar.D.draw(canvas);
                canvas.restore();
                return;
            case 1:
                org.telegram.ui.n21 n21Var = (org.telegram.ui.n21) this.f32833w;
                super.onDraw(canvas);
                boolean z10 = this.f32826b;
                Paint paint2 = this.f32831r;
                float f14 = this.f32829f;
                float f15 = this.f32828e;
                float f16 = this.d;
                if (z10) {
                    float f17 = n21Var.M;
                    if (f17 > 0.0f) {
                        this.f32827c.drawCircle(f16, f15, f14 * f17, this.h);
                    }
                    canvas.drawBitmap(this.f32830n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - n21Var.M) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f32832s, this.v);
                n21Var.C.draw(canvas);
                canvas.restore();
                return;
            default:
                qh.ca caVar = (qh.ca) this.f32833w;
                super.onDraw(canvas);
                boolean z11 = this.f32826b;
                Paint paint3 = this.f32831r;
                float f18 = this.f32829f;
                float f19 = this.f32828e;
                float f20 = this.d;
                if (z11) {
                    float f21 = caVar.A2;
                    if (f21 > 0.0f) {
                        this.f32827c.drawCircle(f20, f19, f18 * f21, this.h);
                    }
                    canvas.drawBitmap(this.f32830n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - caVar.A2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f32832s, this.v);
                caVar.f45094f1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
