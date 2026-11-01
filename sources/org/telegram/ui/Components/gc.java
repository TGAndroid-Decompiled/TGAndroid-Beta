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
    public final Paint f26388a;
    public Bitmap f26389b;
    public float f26390c;
    public float d;
    public final t5 e;
    public final t5 f26391f;
    public float f26392g;
    public final t5 h;
    public float f26393i;
    public final t5 f26394j;
    public final e6 f26395k;
    public float f26396l;
    public final t5 f26397m;
    public boolean f26398n;
    public final t5 f26399o;
    public final Path f26400p;
    public final Paint f26401q;
    public final RectF f26402r;
    public final Paint f26403s;
    public final Paint f26404t;
    public final RectF f26405u;
    public RadialGradient v;
    public Matrix f26406w;
    public float f26407x;
    public float f26408y;
    public float f26409z;

    public gc(ic icVar) {
        this.E = icVar;
        Paint paint = new Paint(3);
        this.f26388a = paint;
        paint.setColor(-1);
        gr grVar = gr.h;
        this.e = new t5(icVar, 650L, grVar);
        this.f26391f = new t5(icVar, 650L, grVar);
        gr grVar2 = gr.f26524g;
        this.h = new t5(icVar, 0L, 150L, grVar2);
        this.f26393i = 1.0f;
        this.f26394j = new t5(icVar, 0L, 150L, grVar2);
        e6 e6Var = new e6(false, true, true);
        this.f26395k = e6Var;
        this.f26397m = new t5(icVar, 0L, 150L, grVar2);
        this.f26399o = new t5(icVar, 0L, 200L, grVar);
        e6Var.u(-1);
        e6Var.n(0.35f, 200L, grVar);
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.w(org.telegram.messenger.i0.L(15.0f));
        e6Var.f25744b = 17;
        this.f26400p = new Path();
        Paint paint2 = new Paint(1);
        this.f26401q = paint2;
        this.f26402r = new RectF();
        this.f26403s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f26404t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f26405u = new RectF();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        double d;
        if (f18 > 0.0f && org.telegram.messenger.tc.e(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (ic.f27067b0 < 0) {
                ic.f27067b0 = currentTimeMillis;
            }
            float f19 = ((float) (currentTimeMillis - ic.f27067b0)) / 10000.0f;
            Bitmap bitmap = this.f26389b;
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
                    Paint paint = this.f26388a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, org.telegram.messenger.i0.T1(1.0f, Math.min(w7.z8.a(c10, sin2, f11, f12) / org.telegram.messenger.i0.N(64.0f), 1.0f), f17) * C)) * 255.0f));
                    float f25 = N;
                    float sin3 = f25 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * c3.i0.C((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(c10, sin2);
                    canvas.scale(sin3, sin3);
                    float f26 = -(i10 >> 1);
                    canvas.drawBitmap(this.f26389b, f26, f26, paint);
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
