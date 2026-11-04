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
public final class jc {
    public float A;
    public float B;
    public float C;
    public float D;
    public final lc E;
    public final Paint f35017a;
    public Bitmap f35018b;
    public float f35019c;
    public float d;
    public final u5 f35020e;
    public final u5 f35021f;
    public float f35022g;
    public final u5 h;
    public float f35023i;
    public final u5 f35024j;
    public final g6 f35025k;
    public float f35026l;
    public final u5 f35027m;
    public boolean f35028n;
    public final u5 f35029o;
    public final Path f35030p;
    public final Paint f35031q;
    public final RectF f35032r;
    public final Paint f35033s;
    public final Paint f35034t;
    public final RectF f35035u;
    public RadialGradient v;
    public Matrix f35036w;
    public float f35037x;
    public float f35038y;
    public float f35039z;

    public jc(lc lcVar) {
        this.E = lcVar;
        Paint paint = new Paint(3);
        this.f35017a = paint;
        paint.setColor(-1);
        xq xqVar = xq.h;
        this.f35020e = new u5(lcVar, 650L, xqVar);
        this.f35021f = new u5(lcVar, 650L, xqVar);
        xq xqVar2 = xq.f40453g;
        this.h = new u5(lcVar, 0L, 150L, xqVar2);
        this.f35023i = 1.0f;
        this.f35024j = new u5(lcVar, 0L, 150L, xqVar2);
        g6 g6Var = new g6(false, true, true);
        this.f35025k = g6Var;
        this.f35027m = new u5(lcVar, 0L, 150L, xqVar2);
        this.f35029o = new u5(lcVar, 0L, 200L, xqVar);
        g6Var.u(-1);
        g6Var.n(0.35f, 200L, xqVar);
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.w(org.telegram.messenger.g0.L(15.0f));
        g6Var.f33983b = 17;
        this.f35030p = new Path();
        Paint paint2 = new Paint(1);
        this.f35031q = paint2;
        this.f35032r = new RectF();
        this.f35033s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f35034t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f35035u = new RectF();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        double d;
        if (f19 > 0.0f && org.telegram.messenger.lc.e(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (lc.f35689c0 < 0) {
                lc.f35689c0 = currentTimeMillis;
            }
            float f20 = ((float) (currentTimeMillis - lc.f35689c0)) / 10000.0f;
            Bitmap bitmap = this.f35018b;
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
                    float c2 = (float) k2.p1.c(lc.a(f23), T1, f10);
                    int i3 = width;
                    float sin2 = (float) ((Math.sin(lc.a(f23)) * T1) + f11);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float A = com.google.android.recaptcha.internal.a.A((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f19);
                    Paint paint = this.f35017a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, org.telegram.messenger.g0.T1(1.0f, Math.min(a7.h.a(c2, sin2, f12, f13) / org.telegram.messenger.g0.N(64.0f), 1.0f), f18) * A)) * 255.0f));
                    float f26 = N;
                    float sin3 = f26 * ((float) ((((Math.sin(f23) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.recaptcha.internal.a.A((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(c2, sin2);
                    canvas.scale(sin3, sin3);
                    float f27 = -(i3 >> 1);
                    canvas.drawBitmap(this.f35018b, f27, f27, paint);
                    canvas.restore();
                    floor++;
                    sqrt = sqrt;
                    width = i3;
                    f21 = f21;
                    N = f26;
                    f20 = f25;
                    f22 = 7.0f;
                }
            }
        }
    }
}
