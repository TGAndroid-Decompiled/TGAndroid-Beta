package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class ac extends View {
    public final int f43706a;
    public final Canvas f43707b;
    public final float f43708c;
    public final float d;
    public final float f43709e;
    public final Paint f43710f;
    public final Bitmap h;
    public final Paint f43711n;
    public final float f43712r;
    public final float f43713s;
    public final org.telegram.ui.ActionBar.d2 f43714w;

    public ac(org.telegram.ui.ActionBar.d2 d2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i3) {
        super(activity);
        this.f43706a = i3;
        this.f43714w = d2Var;
        this.f43707b = canvas;
        this.f43708c = f10;
        this.d = f11;
        this.f43709e = f12;
        this.f43710f = paint;
        this.h = bitmap;
        this.f43711n = paint2;
        this.f43712r = f13;
        this.f43713s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f43706a) {
            case 0:
                super.onDraw(canvas);
                pc pcVar = (pc) this.f43714w;
                boolean z10 = pcVar.K;
                Paint paint = this.f43711n;
                float f10 = this.f43709e;
                float f11 = this.d;
                float f12 = this.f43708c;
                if (z10) {
                    float f13 = pcVar.f48529o0;
                    if (f13 > 0.0f) {
                        this.f43707b.drawCircle(f12, f11, f10 * f13, this.f43710f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - pcVar.f48529o0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f43712r, this.f43713s);
                pcVar.M.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                cm0 cm0Var = (cm0) this.f43714w;
                boolean z11 = cm0Var.T;
                Paint paint2 = this.f43711n;
                float f14 = this.f43709e;
                float f15 = this.d;
                float f16 = this.f43708c;
                if (z11) {
                    float f17 = cm0Var.Z;
                    if (f17 > 0.0f) {
                        this.f43707b.drawCircle(f16, f15, f14 * f17, this.f43710f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - cm0Var.Z) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f43712r, this.f43713s);
                cm0Var.L.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                l71 l71Var = (l71) this.f43714w;
                boolean a10 = l71Var.f47141a.a();
                Paint paint3 = this.f43711n;
                float f18 = this.f43709e;
                float f19 = this.d;
                float f20 = this.f43708c;
                if (a10) {
                    float f21 = l71Var.f47176k2;
                    if (f21 > 0.0f) {
                        this.f43707b.drawCircle(f20, f19, f18 * f21, this.f43710f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - l71Var.f47176k2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f43712r, this.f43713s);
                l71Var.Q1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
