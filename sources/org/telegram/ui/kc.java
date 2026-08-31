package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class kc extends View {
    public final int f38339a;
    public final Canvas f38340b;
    public final float f38341c;
    public final float d;
    public final float f38342e;
    public final Paint f38343f;
    public final Bitmap h;
    public final Paint f38344n;
    public final float f38345r;
    public final float f38346s;
    public final org.telegram.ui.ActionBar.p2 v;

    public kc(org.telegram.ui.ActionBar.p2 p2Var, Activity activity, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i10) {
        super(activity);
        this.f38339a = i10;
        this.v = p2Var;
        this.f38340b = canvas;
        this.f38341c = f10;
        this.d = f11;
        this.f38342e = f12;
        this.f38343f = paint;
        this.h = bitmap;
        this.f38344n = paint2;
        this.f38345r = f13;
        this.f38346s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f38339a) {
            case 0:
                super.onDraw(canvas);
                bd bdVar = (bd) this.v;
                boolean z4 = bdVar.G;
                Paint paint = this.f38344n;
                float f10 = this.f38342e;
                float f11 = this.d;
                float f12 = this.f38341c;
                if (z4) {
                    float f13 = bdVar.f35435k0;
                    if (f13 > 0.0f) {
                        this.f38340b.drawCircle(f12, f11, f10 * f13, this.f38343f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - bdVar.f35435k0) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f38345r, this.f38346s);
                bdVar.I.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                ip0 ip0Var = (ip0) this.v;
                boolean z10 = ip0Var.G;
                Paint paint2 = this.f38344n;
                float f14 = this.f38342e;
                float f15 = this.d;
                float f16 = this.f38341c;
                if (z10) {
                    float f17 = ip0Var.M;
                    if (f17 > 0.0f) {
                        this.f38340b.drawCircle(f16, f15, f14 * f17, this.f38343f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - ip0Var.M) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f38345r, this.f38346s);
                ip0Var.C.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                ed1 ed1Var = (ed1) this.v;
                boolean a2 = ed1Var.f36486a.a();
                Paint paint3 = this.f38344n;
                float f18 = this.f38342e;
                float f19 = this.d;
                float f20 = this.f38341c;
                if (a2) {
                    float f21 = ed1Var.f36507f2;
                    if (f21 > 0.0f) {
                        this.f38340b.drawCircle(f20, f19, f18 * f21, this.f38343f);
                    }
                    canvas.drawBitmap(this.h, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - ed1Var.f36507f2) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f38345r, this.f38346s);
                ed1Var.L1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}
