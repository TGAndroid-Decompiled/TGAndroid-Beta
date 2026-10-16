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
public final class dd {
    public float A;
    public float B;
    public float C;
    public float D;
    public final fd E;
    public final Paint f24079a;
    public Bitmap f24080b;
    public float f24081c;
    public float d;
    public final g6 e;
    public final g6 f24082f;
    public float f24083g;
    public final g6 h;
    public float f24084i;
    public final g6 f24085j;
    public final r6 f24086k;
    public float f24087l;
    public final g6 f24088m;
    public boolean f24089n;
    public final g6 f24090o;
    public final Path f24091p;
    public final Paint f24092q;
    public final RectF f24093r;
    public final Paint f24094s;
    public final Paint f24095t;
    public final RectF f24096u;
    public RadialGradient v;
    public Matrix f24097w;
    public float f24098x;
    public float f24099y;
    public float f24100z;

    public dd(fd fdVar) {
        this.E = fdVar;
        Paint paint = new Paint(3);
        this.f24079a = paint;
        paint.setColor(-1);
        es esVar = es.h;
        this.e = new g6(fdVar, 650L, esVar);
        this.f24082f = new g6(fdVar, 650L, esVar);
        es esVar2 = es.f24466g;
        this.h = new g6(fdVar, 0L, 150L, esVar2);
        this.f24084i = 1.0f;
        this.f24085j = new g6(fdVar, 0L, 150L, esVar2);
        r6 r6Var = new r6(false, true, true);
        this.f24086k = r6Var;
        this.f24088m = new g6(fdVar, 0L, 150L, esVar2);
        this.f24090o = new g6(fdVar, 0L, 200L, esVar);
        r6Var.u(-1);
        r6Var.n(0.35f, 200L, esVar);
        r6Var.x(AndroidUtilities.bold());
        r6Var.w(AndroidUtilities.dp(15.0f));
        r6Var.f28435b = 17;
        this.f24091p = new Path();
        Paint paint2 = new Paint(1);
        this.f24092q = paint2;
        this.f24093r = new RectF();
        this.f24094s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f24095t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f24096u = new RectF();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        double d;
        if (f18 > 0.0f && LiteMode.isEnabled(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (fd.f24696b0 < 0) {
                fd.f24696b0 = currentTimeMillis;
            }
            float f19 = ((float) (currentTimeMillis - fd.f24696b0)) / 10000.0f;
            Bitmap bitmap = this.f24080b;
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
                    float f25 = (float) i2.d.f(fd.a(f22), lerp, f7);
                    int i10 = width;
                    float sin2 = (float) ((Math.sin(fd.a(f22)) * lerp) + f10);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float A = com.google.android.gms.internal.play_billing.k3.A((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f18);
                    Paint paint = this.f24079a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(v7.f7.a(f25, sin2, f11, f12) / AndroidUtilities.dpf2(64.0f), 1.0f), f17) * A)) * 255.0f));
                    float f26 = dpf2;
                    float sin3 = f26 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.gms.internal.play_billing.k3.A((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(f25, sin2);
                    canvas.scale(sin3, sin3);
                    float f27 = -(i10 >> 1);
                    canvas.drawBitmap(this.f24080b, f27, f27, paint);
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
