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
public final class gc {
    public float A;
    public float B;
    public float C;
    public float D;
    public final ic E;
    public final Paint f34880a;
    public Bitmap f34881b;
    public float f34882c;
    public float d;
    public final u5 f34883e;
    public final u5 f34884f;
    public float f34885g;
    public final u5 h;
    public float f34886i;
    public final u5 f34887j;
    public final g6 f34888k;
    public float f34889l;
    public final u5 f34890m;
    public boolean f34891n;
    public final u5 f34892o;
    public final Path f34893p;
    public final Paint f34894q;
    public final RectF f34895r;
    public final Paint f34896s;
    public final Paint f34897t;
    public final RectF f34898u;
    public RadialGradient v;
    public Matrix f34899w;
    public float f34900x;
    public float f34901y;
    public float f34902z;

    public gc(ic icVar) {
        this.E = icVar;
        Paint paint = new Paint(3);
        this.f34880a = paint;
        paint.setColor(-1);
        er erVar = er.h;
        this.f34883e = new u5(icVar, 650L, erVar);
        this.f34884f = new u5(icVar, 650L, erVar);
        er erVar2 = er.f34420g;
        this.h = new u5(icVar, 0L, 150L, erVar2);
        this.f34886i = 1.0f;
        this.f34887j = new u5(icVar, 0L, 150L, erVar2);
        g6 g6Var = new g6(false, true, true);
        this.f34888k = g6Var;
        this.f34890m = new u5(icVar, 0L, 150L, erVar2);
        this.f34892o = new u5(icVar, 0L, 200L, erVar);
        g6Var.u(-1);
        g6Var.n(0.35f, 200L, erVar);
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.w(org.telegram.messenger.g0.L(15.0f));
        g6Var.f34833b = 17;
        this.f34893p = new Path();
        Paint paint2 = new Paint(1);
        this.f34894q = paint2;
        this.f34895r = new RectF();
        this.f34896s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f34897t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f34898u = new RectF();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        double d;
        if (f19 > 0.0f && org.telegram.messenger.qc.e(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (ic.f35569c0 < 0) {
                ic.f35569c0 = currentTimeMillis;
            }
            float f20 = ((float) (currentTimeMillis - ic.f35569c0)) / 10000.0f;
            Bitmap bitmap = this.f34881b;
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
                    float c10 = (float) i5.c.c(ic.a(f23), T1, f10);
                    int i7 = width;
                    float sin2 = (float) ((Math.sin(ic.a(f23)) * T1) + f11);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float B = com.google.android.gms.internal.vision.e2.B((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f19);
                    Paint paint = this.f34880a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, org.telegram.messenger.g0.T1(1.0f, Math.min(a8.t9.a(c10, sin2, f12, f13) / org.telegram.messenger.g0.N(64.0f), 1.0f), f18) * B)) * 255.0f));
                    float f26 = N;
                    float sin3 = f26 * ((float) ((((Math.sin(f23) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.gms.internal.vision.e2.B((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(c10, sin2);
                    canvas.scale(sin3, sin3);
                    float f27 = -(i7 >> 1);
                    canvas.drawBitmap(this.f34881b, f27, f27, paint);
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
