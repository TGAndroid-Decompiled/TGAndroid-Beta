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
public final class lc {
    public float A;
    public float B;
    public float C;
    public float D;
    public final nc E;
    public final Paint f35596a;
    public Bitmap f35597b;
    public float f35598c;
    public float d;
    public final w5 f35599e;
    public final w5 f35600f;
    public float f35601g;
    public final w5 h;
    public float f35602i;
    public final w5 f35603j;
    public final i6 f35604k;
    public float f35605l;
    public final w5 f35606m;
    public boolean f35607n;
    public final w5 f35608o;
    public final Path f35609p;
    public final Paint f35610q;
    public final RectF f35611r;
    public final Paint f35612s;
    public final Paint f35613t;
    public final RectF f35614u;
    public RadialGradient v;
    public Matrix f35615w;
    public float f35616x;
    public float f35617y;
    public float f35618z;

    public lc(nc ncVar) {
        this.E = ncVar;
        Paint paint = new Paint(3);
        this.f35596a = paint;
        paint.setColor(-1);
        xq xqVar = xq.h;
        this.f35599e = new w5(ncVar, 650L, xqVar);
        this.f35600f = new w5(ncVar, 650L, xqVar);
        xq xqVar2 = xq.f40311g;
        this.h = new w5(ncVar, 0L, 150L, xqVar2);
        this.f35602i = 1.0f;
        this.f35603j = new w5(ncVar, 0L, 150L, xqVar2);
        i6 i6Var = new i6(false, true, true);
        this.f35604k = i6Var;
        this.f35606m = new w5(ncVar, 0L, 150L, xqVar2);
        this.f35608o = new w5(ncVar, 0L, 200L, xqVar);
        i6Var.u(-1);
        i6Var.n(0.35f, 200L, xqVar);
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.w(org.telegram.messenger.g0.L(15.0f));
        i6Var.f34516b = 17;
        this.f35609p = new Path();
        Paint paint2 = new Paint(1);
        this.f35610q = paint2;
        this.f35611r = new RectF();
        this.f35612s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f35613t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f35614u = new RectF();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        double d;
        if (f19 > 0.0f && org.telegram.messenger.rc.e(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (nc.f36367b0 < 0) {
                nc.f36367b0 = currentTimeMillis;
            }
            float f20 = ((float) (currentTimeMillis - nc.f36367b0)) / 10000.0f;
            Bitmap bitmap = this.f35597b;
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
                    float d2 = (float) jg.g.d(nc.a(f23), T1, f10);
                    int i7 = width;
                    float sin2 = (float) ((Math.sin(nc.a(f23)) * T1) + f11);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float B = com.google.android.recaptcha.internal.a.B((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f19);
                    Paint paint = this.f35596a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, org.telegram.messenger.g0.T1(1.0f, Math.min(a8.r9.a(d2, sin2, f12, f13) / org.telegram.messenger.g0.N(64.0f), 1.0f), f18) * B)) * 255.0f));
                    float f26 = N;
                    float sin3 = f26 * ((float) ((((Math.sin(f23) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.recaptcha.internal.a.B((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(d2, sin2);
                    canvas.scale(sin3, sin3);
                    float f27 = -(i7 >> 1);
                    canvas.drawBitmap(this.f35597b, f27, f27, paint);
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
