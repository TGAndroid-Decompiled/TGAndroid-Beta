package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class wo extends View {
    public final int f32797a;
    public final boolean f32798b;
    public final Canvas f32799c;
    public final float d;
    public final float f32800e;
    public final float f32801f;
    public final Paint h;
    public final Bitmap f32802n;
    public final Paint f32803r;
    public final float f32804s;
    public final float v;
    public final NotificationCenter.NotificationCenterDelegate f32805w;

    public wo(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z4, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i10) {
        super(context);
        this.f32797a = i10;
        this.f32805w = notificationCenterDelegate;
        this.f32798b = z4;
        this.f32799c = canvas;
        this.d = f10;
        this.f32800e = f11;
        this.f32801f = f12;
        this.h = paint;
        this.f32802n = bitmap;
        this.f32803r = paint2;
        this.f32804s = f13;
        this.v = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f32797a) {
            case 0:
                mp mpVar = (mp) this.f32805w;
                super.onDraw(canvas);
                boolean z4 = this.f32798b;
                Paint paint = this.f32803r;
                float f10 = this.f32801f;
                float f11 = this.f32800e;
                float f12 = this.d;
                if (z4) {
                    float f13 = mpVar.P;
                    if (f13 > 0.0f) {
                        this.f32799c.drawCircle(f12, f11, f10 * f13, this.h);
                    }
                    canvas.drawBitmap(this.f32802n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - mpVar.P) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f32804s, this.v);
                mpVar.D.draw(canvas);
                canvas.restore();
                return;
            case 1:
                org.telegram.ui.t21 t21Var = (org.telegram.ui.t21) this.f32805w;
                super.onDraw(canvas);
                boolean z10 = this.f32798b;
                Paint paint2 = this.f32803r;
                float f14 = this.f32801f;
                float f15 = this.f32800e;
                float f16 = this.d;
                if (z10) {
                    float f17 = t21Var.M;
                    if (f17 > 0.0f) {
                        this.f32799c.drawCircle(f16, f15, f14 * f17, this.h);
                    }
                    canvas.drawBitmap(this.f32802n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - t21Var.M) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f32804s, this.v);
                t21Var.C.draw(canvas);
                canvas.restore();
                return;
            default:
                qh.ba baVar = (qh.ba) this.f32805w;
                super.onDraw(canvas);
                boolean z11 = this.f32798b;
                Paint paint3 = this.f32803r;
                float f18 = this.f32801f;
                float f19 = this.f32800e;
                float f20 = this.d;
                if (z11) {
                    float f21 = baVar.A2;
                    if (f21 > 0.0f) {
                        this.f32799c.drawCircle(f20, f19, f18 * f21, this.h);
                    }
                    canvas.drawBitmap(this.f32802n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - baVar.A2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f32804s, this.v);
                baVar.f45060f1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
