package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class lc extends View {
    public final int f39519a;
    public final Canvas f39520b;
    public final float f39521c;
    public final float d;
    public final float f39522e;
    public final Paint f39523f;
    public final Bitmap h;
    public final Paint f39524n;
    public final float f39525r;
    public final float f39526s;
    public final org.telegram.ui.ActionBar.n2 v;

    public lc(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f39519a = i10;
        this.v = n2Var;
        this.f39520b = canvas;
        this.f39521c = f7;
        this.d = f10;
        this.f39522e = f11;
        this.f39523f = paint;
        this.h = bitmap;
        this.f39524n = paint2;
        this.f39525r = f12;
        this.f39526s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f39519a) {
            case 0:
                super.onDraw(canvas);
                bd bdVar = (bd) this.v;
                boolean z10 = bdVar.J;
                Paint paint = this.f39524n;
                float f7 = this.f39522e;
                float f10 = this.d;
                float f11 = this.f39521c;
                if (z10) {
                    float f12 = bdVar.f36263n0;
                    if (f12 > 0.0f) {
                        this.f39520b.drawCircle(f11, f10, f7 * f12, this.f39523f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - bdVar.f36263n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f39525r, this.f39526s);
                bdVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                aq0 aq0Var = (aq0) this.v;
                boolean z11 = aq0Var.S;
                Paint paint2 = this.f39524n;
                float f13 = this.f39522e;
                float f14 = this.d;
                float f15 = this.f39521c;
                if (z11) {
                    float f16 = aq0Var.Y;
                    if (f16 > 0.0f) {
                        this.f39520b.drawCircle(f15, f14, f13 * f16, this.f39523f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - aq0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f39525r, this.f39526s);
                aq0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                xd1 xd1Var = (xd1) this.v;
                boolean a2 = xd1Var.f43935a.a();
                Paint paint3 = this.f39524n;
                float f17 = this.f39522e;
                float f18 = this.d;
                float f19 = this.f39521c;
                if (a2) {
                    float f20 = xd1Var.f43965i2;
                    if (f20 > 0.0f) {
                        this.f39520b.drawCircle(f19, f18, f17 * f20, this.f39523f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - xd1Var.f43965i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f39525r, this.f39526s);
                xd1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
