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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
public final class ad {
    public float A;
    public float B;
    public float C;
    public float D;
    public final cd E;
    public final Paint f21461a;
    public Bitmap f21462b;
    public float f21463c;
    public float d;
    public final d6 e;
    public final d6 f21464f;
    public float f21465g;
    public final d6 h;
    public float f21466i;
    public final d6 f21467j;
    public final n6 f21468k;
    public float f21469l;
    public final d6 f21470m;
    public boolean f21471n;
    public final d6 f21472o;
    public final Path f21473p;
    public final Paint f21474q;
    public final RectF f21475r;
    public final Paint f21476s;
    public final Paint f21477t;
    public final RectF f21478u;
    public RadialGradient v;
    public Matrix f21479w;
    public float f21480x;
    public float f21481y;
    public float f21482z;

    public ad(cd cdVar) {
        this.E = cdVar;
        Paint paint = new Paint(3);
        this.f21461a = paint;
        paint.setColor(-1);
        wr wrVar = wr.h;
        this.e = new d6(cdVar, 650L, wrVar);
        this.f21464f = new d6(cdVar, 650L, wrVar);
        wr wrVar2 = wr.f28820g;
        this.h = new d6(cdVar, 0L, 150L, wrVar2);
        this.f21466i = 1.0f;
        this.f21467j = new d6(cdVar, 0L, 150L, wrVar2);
        n6 n6Var = new n6(false, true, true, false);
        this.f21468k = n6Var;
        this.f21470m = new d6(cdVar, 0L, 150L, wrVar2);
        this.f21472o = new d6(cdVar, 0L, 200L, wrVar);
        n6Var.r(-1);
        n6Var.k(0.35f, 200L, wrVar);
        n6Var.u(AndroidUtilities.bold());
        n6Var.t(AndroidUtilities.dp(15.0f));
        n6Var.f25425b = 17;
        this.f21473p = new Path();
        Paint paint2 = new Paint(1);
        this.f21474q = paint2;
        this.f21475r = new RectF();
        this.f21476s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f21477t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f21478u = new RectF();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        double d;
        if (f18 > 0.0f && LiteMode.isEnabled(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (cd.f22102b0 < 0) {
                cd.f22102b0 = currentTimeMillis;
            }
            float f19 = ((float) (currentTimeMillis - cd.f22102b0)) / 10000.0f;
            Bitmap bitmap = this.f21462b;
            if (bitmap != null) {
                int width = bitmap.getWidth();
                float f20 = width;
                float dpf2 = AndroidUtilities.dpf2(15.0f) / f20;
                float f21 = 7.0f;
                int floor = (int) Math.floor((f13 % 360.0f) / 7.0f);
                int ceil = (int) Math.ceil((f14 % 360.0f) / 7.0f);
                while (floor <= ceil) {
                    float f22 = floor * f21;
                    float sin = (float) (((((Math.sin(2000.0f * f22) + 1.0d) * 0.25d) + 1.0d) * (100.0f + f19)) % 1.0d);
                    float f23 = f20 * sqrt;
                    float f24 = f19;
                    double lerp = AndroidUtilities.lerp(f15 - f23, f16 + f23, sin);
                    float f25 = (float) hc.b.f(cd.a(f22), lerp, f7);
                    int i10 = width;
                    float sin2 = (float) ((Math.sin(cd.a(f22)) * lerp) + f10);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float B = com.google.android.gms.internal.vision.e2.B((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f18);
                    Paint paint = this.f21461a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(v7.a7.a(f25, sin2, f11, f12) / AndroidUtilities.dpf2(64.0f), 1.0f), f17) * B)) * 255.0f));
                    float f26 = dpf2;
                    float sin3 = f26 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.gms.internal.vision.e2.B((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(f25, sin2);
                    canvas.scale(sin3, sin3);
                    float f27 = -(i10 >> 1);
                    canvas.drawBitmap(this.f21462b, f27, f27, paint);
                    canvas.restore();
                    floor++;
                    sqrt = sqrt;
                    width = i10;
                    f20 = f20;
                    dpf2 = f26;
                    f19 = f24;
                    f21 = 7.0f;
                }
            }
        }
    }
}
