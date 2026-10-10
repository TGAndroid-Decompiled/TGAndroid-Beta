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
public final class ed {
    public float A;
    public float B;
    public float C;
    public float D;
    public final gd E;
    public final Paint f26007a;
    public Bitmap f26008b;
    public float f26009c;
    public float d;
    public final g6 f26010e;
    public final g6 f26011f;
    public float f26012g;
    public final g6 h;
    public float f26013i;
    public final g6 f26014j;
    public final q6 f26015k;
    public float f26016l;
    public final g6 f26017m;
    public boolean f26018n;
    public final g6 f26019o;
    public final Path f26020p;
    public final Paint f26021q;
    public final RectF f26022r;
    public final Paint f26023s;
    public final Paint f26024t;
    public final RectF f26025u;
    public RadialGradient v;
    public Matrix f26026w;
    public float f26027x;
    public float f26028y;
    public float f26029z;

    public ed(gd gdVar) {
        this.E = gdVar;
        Paint paint = new Paint(3);
        this.f26007a = paint;
        paint.setColor(-1);
        is isVar = is.h;
        this.f26010e = new g6(gdVar, 650L, isVar);
        this.f26011f = new g6(gdVar, 650L, isVar);
        is isVar2 = is.f27444g;
        this.h = new g6(gdVar, 0L, 150L, isVar2);
        this.f26013i = 1.0f;
        this.f26014j = new g6(gdVar, 0L, 150L, isVar2);
        q6 q6Var = new q6(false, true, true);
        this.f26015k = q6Var;
        this.f26017m = new g6(gdVar, 0L, 150L, isVar2);
        this.f26019o = new g6(gdVar, 0L, 200L, isVar);
        q6Var.u(-1);
        q6Var.n(0.35f, 200L, isVar);
        q6Var.x(AndroidUtilities.bold());
        q6Var.w(AndroidUtilities.dp(15.0f));
        q6Var.f30031b = 17;
        this.f26020p = new Path();
        Paint paint2 = new Paint(1);
        this.f26021q = paint2;
        this.f26022r = new RectF();
        this.f26023s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f26024t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f26025u = new RectF();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        double d;
        if (f18 > 0.0f && LiteMode.isEnabled(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (gd.f26689b0 < 0) {
                gd.f26689b0 = currentTimeMillis;
            }
            float f19 = ((float) (currentTimeMillis - gd.f26689b0)) / 10000.0f;
            Bitmap bitmap = this.f26008b;
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
                    float e7 = (float) hg.c.e(gd.a(f22), lerp, f7);
                    int i10 = width;
                    float sin2 = (float) ((Math.sin(gd.a(f22)) * lerp) + f10);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float A = com.google.android.gms.internal.vision.e2.A((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f18);
                    Paint paint = this.f26007a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(v7.z6.a(e7, sin2, f11, f12) / AndroidUtilities.dpf2(64.0f), 1.0f), f17) * A)) * 255.0f));
                    float f25 = dpf2;
                    float sin3 = f25 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.gms.internal.vision.e2.A((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(e7, sin2);
                    canvas.scale(sin3, sin3);
                    float f26 = -(i10 >> 1);
                    canvas.drawBitmap(this.f26008b, f26, f26, paint);
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
