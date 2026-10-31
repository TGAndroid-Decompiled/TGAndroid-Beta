package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class ic extends View {
    public final int f38229a;
    public final Canvas f38230b;
    public final float f38231c;
    public final float d;
    public final float e;
    public final Paint f38232f;
    public final Bitmap h;
    public final Paint f38233n;
    public final float f38234r;
    public final float f38235s;
    public final org.telegram.ui.ActionBar.k2 f38236w;

    public ic(org.telegram.ui.ActionBar.k2 k2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f38229a = i10;
        this.f38236w = k2Var;
        this.f38230b = canvas;
        this.f38231c = f7;
        this.d = f10;
        this.e = f11;
        this.f38232f = paint;
        this.h = bitmap;
        this.f38233n = paint2;
        this.f38234r = f12;
        this.f38235s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f38229a) {
            case 0:
                super.onDraw(canvas);
                zc zcVar = (zc) this.f38236w;
                boolean z10 = zcVar.J;
                Paint paint = this.f38233n;
                float f7 = this.e;
                float f10 = this.d;
                float f11 = this.f38231c;
                if (z10) {
                    float f12 = zcVar.f44103n0;
                    if (f12 > 0.0f) {
                        this.f38230b.drawCircle(f11, f10, f7 * f12, this.f38232f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - zcVar.f44103n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f38234r, this.f38235s);
                zcVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                tn0 tn0Var = (tn0) this.f38236w;
                boolean z11 = tn0Var.S;
                Paint paint2 = this.f38233n;
                float f13 = this.e;
                float f14 = this.d;
                float f15 = this.f38231c;
                if (z11) {
                    float f16 = tn0Var.Y;
                    if (f16 > 0.0f) {
                        this.f38230b.drawCircle(f15, f14, f13 * f16, this.f38232f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - tn0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f38234r, this.f38235s);
                tn0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                m91 m91Var = (m91) this.f38236w;
                boolean a2 = m91Var.f39537a.a();
                Paint paint3 = this.f38233n;
                float f17 = this.e;
                float f18 = this.d;
                float f19 = this.f38231c;
                if (a2) {
                    float f20 = m91Var.f39569j2;
                    if (f20 > 0.0f) {
                        this.f38230b.drawCircle(f19, f18, f17 * f20, this.f38232f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - m91Var.f39569j2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f38234r, this.f38235s);
                m91Var.P1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
