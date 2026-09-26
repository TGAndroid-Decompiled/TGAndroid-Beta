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
public final class bd {
    public float A;
    public float B;
    public float C;
    public float D;
    public final dd E;
    public final Paint f22975a;
    public Bitmap f22976b;
    public float f22977c;
    public float d;
    public final e6 e;
    public final e6 f22978f;
    public float f22979g;
    public final e6 h;
    public float f22980i;
    public final e6 f22981j;
    public final o6 f22982k;
    public float f22983l;
    public final e6 f22984m;
    public boolean f22985n;
    public final e6 f22986o;
    public final Path f22987p;
    public final Paint f22988q;
    public final RectF f22989r;
    public final Paint f22990s;
    public final Paint f22991t;
    public final RectF f22992u;
    public RadialGradient v;
    public Matrix f22993w;
    public float f22994x;
    public float f22995y;
    public float f22996z;

    public bd(dd ddVar) {
        this.E = ddVar;
        Paint paint = new Paint(3);
        this.f22975a = paint;
        paint.setColor(-1);
        rr rrVar = rr.h;
        this.e = new e6(ddVar, 650L, rrVar);
        this.f22978f = new e6(ddVar, 650L, rrVar);
        rr rrVar2 = rr.f28031g;
        this.h = new e6(ddVar, 0L, 150L, rrVar2);
        this.f22980i = 1.0f;
        this.f22981j = new e6(ddVar, 0L, 150L, rrVar2);
        o6 o6Var = new o6(false, true, true, false);
        this.f22982k = o6Var;
        this.f22984m = new e6(ddVar, 0L, 150L, rrVar2);
        this.f22986o = new e6(ddVar, 0L, 200L, rrVar);
        o6Var.r(-1);
        o6Var.k(0.35f, 200L, rrVar);
        o6Var.u(AndroidUtilities.bold());
        o6Var.t(AndroidUtilities.dp(15.0f));
        o6Var.f26929b = 17;
        this.f22987p = new Path();
        Paint paint2 = new Paint(1);
        this.f22988q = paint2;
        this.f22989r = new RectF();
        this.f22990s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f22991t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f22992u = new RectF();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        double d;
        if (f18 > 0.0f && LiteMode.isEnabled(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (dd.f23593b0 < 0) {
                dd.f23593b0 = currentTimeMillis;
            }
            float f19 = ((float) (currentTimeMillis - dd.f23593b0)) / 10000.0f;
            Bitmap bitmap = this.f22976b;
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
                    float e = (float) hg.c.e(dd.a(f22), lerp, f7);
                    int i10 = width;
                    float sin2 = (float) ((Math.sin(dd.a(f22)) * lerp) + f10);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float B = com.google.android.gms.internal.vision.e2.B((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f18);
                    Paint paint = this.f22975a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(v7.a7.a(e, sin2, f11, f12) / AndroidUtilities.dpf2(64.0f), 1.0f), f17) * B)) * 255.0f));
                    float f25 = dpf2;
                    float sin3 = f25 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.gms.internal.vision.e2.B((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(e, sin2);
                    canvas.scale(sin3, sin3);
                    float f26 = -(i10 >> 1);
                    canvas.drawBitmap(this.f22976b, f26, f26, paint);
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
