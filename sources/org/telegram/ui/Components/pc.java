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
public final class pc {
    public float A;
    public float B;
    public float C;
    public float D;
    public final rc E;
    public final Paint f38336a;
    public Bitmap f38337b;
    public float f38338c;
    public float d;
    public final c6 f38339e;
    public final c6 f38340f;
    public float f38341g;
    public final c6 h;
    public float f38342i;
    public final c6 f38343j;
    public final m6 f38344k;
    public float f38345l;
    public final c6 f38346m;
    public boolean f38347n;
    public final c6 f38348o;
    public final Path f38349p;
    public final Paint f38350q;
    public final RectF f38351r;
    public final Paint f38352s;
    public final Paint f38353t;
    public final RectF f38354u;
    public RadialGradient v;
    public Matrix f38355w;
    public float f38356x;
    public float f38357y;
    public float f38358z;

    public pc(rc rcVar) {
        this.E = rcVar;
        Paint paint = new Paint(3);
        this.f38336a = paint;
        paint.setColor(-1);
        lr lrVar = lr.h;
        this.f38339e = new c6(rcVar, 650L, lrVar);
        this.f38340f = new c6(rcVar, 650L, lrVar);
        lr lrVar2 = lr.f37209g;
        this.h = new c6(rcVar, 0L, 150L, lrVar2);
        this.f38342i = 1.0f;
        this.f38343j = new c6(rcVar, 0L, 150L, lrVar2);
        m6 m6Var = new m6(false, true, true);
        this.f38344k = m6Var;
        this.f38346m = new c6(rcVar, 0L, 150L, lrVar2);
        this.f38348o = new c6(rcVar, 0L, 200L, lrVar);
        m6Var.u(-1);
        m6Var.n(0.35f, 200L, lrVar);
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.w(org.telegram.messenger.g0.L(15.0f));
        m6Var.f37377b = 17;
        this.f38349p = new Path();
        Paint paint2 = new Paint(1);
        this.f38350q = paint2;
        this.f38351r = new RectF();
        this.f38352s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f38353t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f38354u = new RectF();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        double d;
        if (f19 > 0.0f && org.telegram.messenger.pc.e(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (rc.f39092c0 < 0) {
                rc.f39092c0 = currentTimeMillis;
            }
            float f20 = ((float) (currentTimeMillis - rc.f39092c0)) / 10000.0f;
            Bitmap bitmap = this.f38337b;
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
                    float c10 = (float) i5.c.c(rc.a(f23), T1, f10);
                    int i7 = width;
                    float sin2 = (float) ((Math.sin(rc.a(f23)) * T1) + f11);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float B = com.google.android.gms.internal.vision.e2.B((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f19);
                    Paint paint = this.f38336a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, org.telegram.messenger.g0.T1(1.0f, Math.min(a8.w9.a(c10, sin2, f12, f13) / org.telegram.messenger.g0.N(64.0f), 1.0f), f18) * B)) * 255.0f));
                    float f26 = N;
                    float sin3 = f26 * ((float) ((((Math.sin(f23) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.gms.internal.vision.e2.B((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(c10, sin2);
                    canvas.scale(sin3, sin3);
                    float f27 = -(i7 >> 1);
                    canvas.drawBitmap(this.f38337b, f27, f27, paint);
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
