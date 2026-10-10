package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class lc extends View {
    public final int f39565a;
    public final Canvas f39566b;
    public final float f39567c;
    public final float d;
    public final float f39568e;
    public final Paint f39569f;
    public final Bitmap h;
    public final Paint f39570n;
    public final float f39571r;
    public final float f39572s;
    public final org.telegram.ui.ActionBar.n2 v;

    public lc(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f39565a = i10;
        this.v = n2Var;
        this.f39566b = canvas;
        this.f39567c = f7;
        this.d = f10;
        this.f39568e = f11;
        this.f39569f = paint;
        this.h = bitmap;
        this.f39570n = paint2;
        this.f39571r = f12;
        this.f39572s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f39565a) {
            case 0:
                super.onDraw(canvas);
                bd bdVar = (bd) this.v;
                boolean z10 = bdVar.J;
                Paint paint = this.f39570n;
                float f7 = this.f39568e;
                float f10 = this.d;
                float f11 = this.f39567c;
                if (z10) {
                    float f12 = bdVar.f36309n0;
                    if (f12 > 0.0f) {
                        this.f39566b.drawCircle(f11, f10, f7 * f12, this.f39569f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - bdVar.f36309n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f39571r, this.f39572s);
                bdVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                aq0 aq0Var = (aq0) this.v;
                boolean z11 = aq0Var.S;
                Paint paint2 = this.f39570n;
                float f13 = this.f39568e;
                float f14 = this.d;
                float f15 = this.f39567c;
                if (z11) {
                    float f16 = aq0Var.Y;
                    if (f16 > 0.0f) {
                        this.f39566b.drawCircle(f15, f14, f13 * f16, this.f39569f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - aq0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f39571r, this.f39572s);
                aq0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                xd1 xd1Var = (xd1) this.v;
                boolean a2 = xd1Var.f43981a.a();
                Paint paint3 = this.f39570n;
                float f17 = this.f39568e;
                float f18 = this.d;
                float f19 = this.f39567c;
                if (a2) {
                    float f20 = xd1Var.f44011i2;
                    if (f20 > 0.0f) {
                        this.f39566b.drawCircle(f19, f18, f17 * f20, this.f39569f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - xd1Var.f44011i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f39571r, this.f39572s);
                xd1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
