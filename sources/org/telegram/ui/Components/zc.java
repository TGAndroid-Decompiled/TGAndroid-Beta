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
public final class zc {
    public float A;
    public float B;
    public float C;
    public float D;
    public final bd E;
    public final Paint f33220a;
    public Bitmap f33221b;
    public float f33222c;
    public float d;
    public final d6 e;
    public final d6 f33223f;
    public float f33224g;
    public final d6 h;
    public float f33225i;
    public final d6 f33226j;
    public final n6 f33227k;
    public float f33228l;
    public final d6 f33229m;
    public boolean f33230n;
    public final d6 f33231o;
    public final Path f33232p;
    public final Paint f33233q;
    public final RectF f33234r;
    public final Paint f33235s;
    public final Paint f33236t;
    public final RectF f33237u;
    public RadialGradient v;
    public Matrix f33238w;
    public float f33239x;
    public float f33240y;
    public float f33241z;

    public zc(bd bdVar) {
        this.E = bdVar;
        Paint paint = new Paint(3);
        this.f33220a = paint;
        paint.setColor(-1);
        zr zrVar = zr.h;
        this.e = new d6(bdVar, 650L, zrVar);
        this.f33223f = new d6(bdVar, 650L, zrVar);
        zr zrVar2 = zr.f33338g;
        this.h = new d6(bdVar, 0L, 150L, zrVar2);
        this.f33225i = 1.0f;
        this.f33226j = new d6(bdVar, 0L, 150L, zrVar2);
        n6 n6Var = new n6(false, true, true);
        this.f33227k = n6Var;
        this.f33229m = new d6(bdVar, 0L, 150L, zrVar2);
        this.f33231o = new d6(bdVar, 0L, 200L, zrVar);
        n6Var.u(-1);
        n6Var.n(0.35f, 200L, zrVar);
        n6Var.x(AndroidUtilities.bold());
        n6Var.w(AndroidUtilities.dp(15.0f));
        n6Var.f28797b = 17;
        this.f33232p = new Path();
        Paint paint2 = new Paint(1);
        this.f33233q = paint2;
        this.f33234r = new RectF();
        this.f33235s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f33236t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f33237u = new RectF();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        double d;
        if (f18 > 0.0f && LiteMode.isEnabled(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (bd.f24966b0 < 0) {
                bd.f24966b0 = currentTimeMillis;
            }
            float f19 = ((float) (currentTimeMillis - bd.f24966b0)) / 10000.0f;
            Bitmap bitmap = this.f33221b;
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
                    float f25 = (float) i2.o1.f(bd.a(f22), lerp, f7);
                    int i10 = width;
                    float sin2 = (float) ((Math.sin(bd.a(f22)) * lerp) + f10);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float A = com.google.android.gms.internal.play_billing.k3.A((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f18);
                    Paint paint = this.f33220a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(v7.f7.a(f25, sin2, f11, f12) / AndroidUtilities.dpf2(64.0f), 1.0f), f17) * A)) * 255.0f));
                    float f26 = dpf2;
                    float sin3 = f26 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.gms.internal.play_billing.k3.A((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(f25, sin2);
                    canvas.scale(sin3, sin3);
                    float f27 = -(i10 >> 1);
                    canvas.drawBitmap(this.f33221b, f27, f27, paint);
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
