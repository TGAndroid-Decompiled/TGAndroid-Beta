package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class mc extends View {
    public final int f38639a;
    public final Canvas f38640b;
    public final float f38641c;
    public final float d;
    public final float f38642e;
    public final Paint f38643f;
    public final Bitmap h;
    public final Paint f38644n;
    public final float f38645r;
    public final float f38646s;
    public final org.telegram.ui.ActionBar.n2 v;

    public mc(org.telegram.ui.ActionBar.n2 n2Var, Activity activity, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(activity);
        this.f38639a = i10;
        this.v = n2Var;
        this.f38640b = canvas;
        this.f38641c = f7;
        this.d = f10;
        this.f38642e = f11;
        this.f38643f = paint;
        this.h = bitmap;
        this.f38644n = paint2;
        this.f38645r = f12;
        this.f38646s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f38639a) {
            case 0:
                super.onDraw(canvas);
                bd bdVar = (bd) this.v;
                boolean z10 = bdVar.J;
                Paint paint = this.f38644n;
                float f7 = this.f38642e;
                float f10 = this.d;
                float f11 = this.f38641c;
                if (z10) {
                    float f12 = bdVar.f34780n0;
                    if (f12 > 0.0f) {
                        this.f38640b.drawCircle(f11, f10, f7 * f12, this.f38643f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - bdVar.f34780n0) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f38645r, this.f38646s);
                bdVar.L.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                bq0 bq0Var = (bq0) this.v;
                boolean z11 = bq0Var.S;
                Paint paint2 = this.f38644n;
                float f13 = this.f38642e;
                float f14 = this.d;
                float f15 = this.f38641c;
                if (z11) {
                    float f16 = bq0Var.Y;
                    if (f16 > 0.0f) {
                        this.f38640b.drawCircle(f15, f14, f13 * f16, this.f38643f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - bq0Var.Y) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f38645r, this.f38646s);
                bq0Var.K.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                wd1 wd1Var = (wd1) this.v;
                boolean a2 = wd1Var.f41942a.a();
                Paint paint3 = this.f38644n;
                float f17 = this.f38642e;
                float f18 = this.d;
                float f19 = this.f38641c;
                if (a2) {
                    float f20 = wd1Var.f41972i2;
                    if (f20 > 0.0f) {
                        this.f38640b.drawCircle(f19, f18, f17 * f20, this.f38643f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - wd1Var.f41972i2) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f38645r, this.f38646s);
                wd1Var.O1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
