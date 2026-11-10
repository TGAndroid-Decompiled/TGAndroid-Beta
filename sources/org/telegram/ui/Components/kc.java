package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
public final class kc {
    public float A;
    public float B;
    public float C;
    public float D;
    public final mc E;
    public final Paint f35268a;
    public Bitmap f35269b;
    public float f35270c;
    public float d;
    public final v5 f35271e;
    public final v5 f35272f;
    public float f35273g;
    public final v5 h;
    public float f35274i;
    public final v5 f35275j;
    public final h6 f35276k;
    public float f35277l;
    public final v5 f35278m;
    public boolean f35279n;
    public final v5 f35280o;
    public final Path f35281p;
    public final Paint f35282q;
    public final RectF f35283r;
    public final Paint f35284s;
    public final Paint f35285t;
    public final RectF f35286u;
    public RadialGradient v;
    public Matrix f35287w;
    public float f35288x;
    public float f35289y;
    public float f35290z;

    public kc(mc mcVar) {
        this.E = mcVar;
        Paint paint = new Paint(3);
        this.f35268a = paint;
        paint.setColor(-1);
        wq wqVar = wq.h;
        this.f35271e = new v5(mcVar, 650L, wqVar);
        this.f35272f = new v5(mcVar, 650L, wqVar);
        wq wqVar2 = wq.f40047g;
        this.h = new v5(mcVar, 0L, 150L, wqVar2);
        this.f35274i = 1.0f;
        this.f35275j = new v5(mcVar, 0L, 150L, wqVar2);
        h6 h6Var = new h6(false, true, true);
        this.f35276k = h6Var;
        this.f35278m = new v5(mcVar, 0L, 150L, wqVar2);
        this.f35280o = new v5(mcVar, 0L, 200L, wqVar);
        h6Var.u(-1);
        h6Var.n(0.35f, 200L, wqVar);
        h6Var.x(org.telegram.messenger.g0.o());
        h6Var.w(org.telegram.messenger.g0.L(15.0f));
        h6Var.f34187b = 17;
        this.f35281p = new Path();
        Paint paint2 = new Paint(1);
        this.f35282q = paint2;
        this.f35283r = new RectF();
        this.f35284s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f35285t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f35286u = new RectF();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        double d;
        if (f19 > 0.0f && org.telegram.messenger.sc.e(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (mc.f35921b0 < 0) {
                mc.f35921b0 = currentTimeMillis;
            }
            float f20 = ((float) (currentTimeMillis - mc.f35921b0)) / 10000.0f;
            Bitmap bitmap = this.f35269b;
            if (bitmap != null) {
                int width = bitmap.getWidth();
                float f21 = width;
                float N = org.telegram.messenger.g0.N(15.0f) / f21;
                float f22 = 7.0f;
                int floor = (int) Math.floor((f14 % 360.0f) / 7.0f);
                int ceil = (int) Math.ceil((f15 % 360.0f) / 7.0f);
                while (floor <= ceil) {
                    float f23 = floor * f22;
                    float sin = (float) (((((Math.sin(2000.0f * f23) + 1.0d) * 0.25d) + 1.0d) * (100.0f + f20)) % 1.0d);
                    float f24 = f21 * sqrt;
                    float f25 = f20;
                    double T1 = org.telegram.messenger.g0.T1(f16 - f24, f17 + f24, sin);
                    float d2 = (float) jg.g.d(mc.a(f23), T1, f10);
                    int i7 = width;
                    float sin2 = (float) ((Math.sin(mc.a(f23)) * T1) + f11);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float B = com.google.android.recaptcha.internal.a.B((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f19);
                    Paint paint = this.f35268a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, org.telegram.messenger.g0.T1(1.0f, Math.min(a8.r9.a(d2, sin2, f12, f13) / org.telegram.messenger.g0.N(64.0f), 1.0f), f18) * B)) * 255.0f));
                    float f26 = N;
                    float sin3 = f26 * ((float) ((((Math.sin(f23) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.recaptcha.internal.a.B((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(d2, sin2);
                    canvas.scale(sin3, sin3);
                    float f27 = -(i7 >> 1);
                    canvas.drawBitmap(this.f35269b, f27, f27, paint);
                    canvas.restore();
                    floor++;
                    sqrt = sqrt;
                    width = i7;
                    f21 = f21;
                    N = f26;
                    f20 = f25;
                    f22 = 7.0f;
                }
            }
        }
    }
}
