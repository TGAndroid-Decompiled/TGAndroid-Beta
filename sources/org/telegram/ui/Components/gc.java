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
    public final Paint f26323a;
    public Bitmap f26324b;
    public float f26325c;
    public float d;
    public final t5 e;
    public final t5 f26326f;
    public float f26327g;
    public final t5 h;
    public float f26328i;
    public final t5 f26329j;
    public final e6 f26330k;
    public float f26331l;
    public final t5 f26332m;
    public boolean f26333n;
    public final t5 f26334o;
    public final Path f26335p;
    public final Paint f26336q;
    public final RectF f26337r;
    public final Paint f26338s;
    public final Paint f26339t;
    public final RectF f26340u;
    public RadialGradient v;
    public Matrix f26341w;
    public float f26342x;
    public float f26343y;
    public float f26344z;

    public gc(ic icVar) {
        this.E = icVar;
        Paint paint = new Paint(3);
        this.f26323a = paint;
        paint.setColor(-1);
        gr grVar = gr.h;
        this.e = new t5(icVar, 650L, grVar);
        this.f26326f = new t5(icVar, 650L, grVar);
        gr grVar2 = gr.f26496g;
        this.h = new t5(icVar, 0L, 150L, grVar2);
        this.f26328i = 1.0f;
        this.f26329j = new t5(icVar, 0L, 150L, grVar2);
        e6 e6Var = new e6(false, true, true);
        this.f26330k = e6Var;
        this.f26332m = new t5(icVar, 0L, 150L, grVar2);
        this.f26334o = new t5(icVar, 0L, 200L, grVar);
        e6Var.u(-1);
        e6Var.n(0.35f, 200L, grVar);
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.w(org.telegram.messenger.i0.L(15.0f));
        e6Var.f25695b = 17;
        this.f26335p = new Path();
        Paint paint2 = new Paint(1);
        this.f26336q = paint2;
        this.f26337r = new RectF();
        this.f26338s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f26339t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f26340u = new RectF();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        double d;
        if (f18 > 0.0f && org.telegram.messenger.sc.e(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (ic.f26952b0 < 0) {
                ic.f26952b0 = currentTimeMillis;
            }
            float f19 = ((float) (currentTimeMillis - ic.f26952b0)) / 10000.0f;
            Bitmap bitmap = this.f26324b;
            if (bitmap != null) {
                int width = bitmap.getWidth();
                float f20 = width;
                float N = org.telegram.messenger.i0.N(15.0f) / f20;
                float f21 = 7.0f;
                int floor = (int) Math.floor((f13 % 360.0f) / 7.0f);
                int ceil = (int) Math.ceil((f14 % 360.0f) / 7.0f);
                while (floor <= ceil) {
                    float f22 = floor * f21;
                    float sin = (float) (((((Math.sin(2000.0f * f22) + 1.0d) * 0.25d) + 1.0d) * (100.0f + f19)) % 1.0d);
                    float f23 = f20 * sqrt;
                    float f24 = f19;
                    double T1 = org.telegram.messenger.i0.T1(f15 - f23, f16 + f23, sin);
                    float c10 = (float) i0.a.c(ic.a(f22), T1, f7);
                    int i10 = width;
                    float sin2 = (float) ((Math.sin(ic.a(f22)) * T1) + f10);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float C = c3.i0.C((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f18);
                    Paint paint = this.f26323a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, org.telegram.messenger.i0.T1(1.0f, Math.min(w7.z8.a(c10, sin2, f11, f12) / org.telegram.messenger.i0.N(64.0f), 1.0f), f17) * C)) * 255.0f));
                    float f25 = N;
                    float sin3 = f25 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * c3.i0.C((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(c10, sin2);
                    canvas.scale(sin3, sin3);
                    float f26 = -(i10 >> 1);
                    canvas.drawBitmap(this.f26324b, f26, f26, paint);
                    canvas.restore();
                    floor++;
                    sqrt = sqrt;
                    width = i10;
                    f20 = f20;
                    N = f25;
                    f19 = f24;
                    f21 = 7.0f;
                }
            }
        }
    }
}
