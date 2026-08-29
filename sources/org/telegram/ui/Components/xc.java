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
public final class xc {
    public float A;
    public float B;
    public float C;
    public float D;
    public final zc E;
    public final Paint f34675a;
    public Bitmap f34676b;
    public float f34677c;
    public float d;
    public final d6 f34678e;
    public final d6 f34679f;
    public float f34680g;
    public final d6 h;
    public float f34681i;
    public final d6 f34682j;
    public final n6 f34683k;
    public float f34684l;
    public final d6 f34685m;
    public boolean f34686n;
    public final d6 f34687o;
    public final Path f34688p;
    public final Paint f34689q;
    public final RectF f34690r;
    public final Paint f34691s;
    public final Paint f34692t;
    public final RectF f34693u;
    public RadialGradient v;
    public Matrix f34694w;
    public float f34695x;
    public float f34696y;
    public float f34697z;

    public xc(zc zcVar) {
        this.E = zcVar;
        Paint paint = new Paint(3);
        this.f34675a = paint;
        paint.setColor(-1);
        jr jrVar = jr.h;
        this.f34678e = new d6(zcVar, 650L, jrVar);
        this.f34679f = new d6(zcVar, 650L, jrVar);
        jr jrVar2 = jr.f29801g;
        this.h = new d6(zcVar, 0L, 150L, jrVar2);
        this.f34681i = 1.0f;
        this.f34682j = new d6(zcVar, 0L, 150L, jrVar2);
        n6 n6Var = new n6(false, true, true, false);
        this.f34683k = n6Var;
        this.f34685m = new d6(zcVar, 0L, 150L, jrVar2);
        this.f34687o = new d6(zcVar, 0L, 200L, jrVar);
        n6Var.r(-1);
        n6Var.k(0.35f, 200L, jrVar);
        n6Var.u(AndroidUtilities.bold());
        n6Var.t(AndroidUtilities.dp(15.0f));
        n6Var.f30862b = 17;
        this.f34688p = new Path();
        Paint paint2 = new Paint(1);
        this.f34689q = paint2;
        this.f34690r = new RectF();
        this.f34691s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f34692t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f34693u = new RectF();
    }

    public final void a(Canvas canvas, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        double d;
        if (f18 > 0.0f && LiteMode.isEnabled(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (zc.U < 0) {
                zc.U = currentTimeMillis;
            }
            float f19 = ((float) (currentTimeMillis - zc.U)) / 10000.0f;
            Bitmap bitmap = this.f34676b;
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
                    float b10 = (float) j7.l1.b(zc.a(f22), lerp, f9);
                    int i10 = width;
                    float sin2 = (float) ((Math.sin(zc.a(f22)) * lerp) + f10);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float B = com.google.android.recaptcha.internal.a.B((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f18);
                    Paint paint = this.f34675a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(i7.z5.a(b10, sin2, f11, f12) / AndroidUtilities.dpf2(64.0f), 1.0f), f17) * B)) * 255.0f));
                    float f25 = dpf2;
                    float sin3 = f25 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.recaptcha.internal.a.B((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(b10, sin2);
                    canvas.scale(sin3, sin3);
                    float f26 = -(i10 >> 1);
                    canvas.drawBitmap(this.f34676b, f26, f26, paint);
                    canvas.restore();
                    floor++;
                    sqrt = sqrt;
                    width = i10;
                    f20 = f20;
                    dpf2 = f25;
                    f19 = f24;
                    f21 = 7.0f;
                }
            }
        }
    }
}
