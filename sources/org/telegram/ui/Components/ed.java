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
    public final Paint f26035a;
    public Bitmap f26036b;
    public float f26037c;
    public float d;
    public final g6 f26038e;
    public final g6 f26039f;
    public float f26040g;
    public final g6 h;
    public float f26041i;
    public final g6 f26042j;
    public final q6 f26043k;
    public float f26044l;
    public final g6 f26045m;
    public boolean f26046n;
    public final g6 f26047o;
    public final Path f26048p;
    public final Paint f26049q;
    public final RectF f26050r;
    public final Paint f26051s;
    public final Paint f26052t;
    public final RectF f26053u;
    public RadialGradient v;
    public Matrix f26054w;
    public float f26055x;
    public float f26056y;
    public float f26057z;

    public ed(gd gdVar) {
        this.E = gdVar;
        Paint paint = new Paint(3);
        this.f26035a = paint;
        paint.setColor(-1);
        hs hsVar = hs.h;
        this.f26038e = new g6(gdVar, 650L, hsVar);
        this.f26039f = new g6(gdVar, 650L, hsVar);
        hs hsVar2 = hs.f27119g;
        this.h = new g6(gdVar, 0L, 150L, hsVar2);
        this.f26041i = 1.0f;
        this.f26042j = new g6(gdVar, 0L, 150L, hsVar2);
        q6 q6Var = new q6(false, true, true);
        this.f26043k = q6Var;
        this.f26045m = new g6(gdVar, 0L, 150L, hsVar2);
        this.f26047o = new g6(gdVar, 0L, 200L, hsVar);
        q6Var.u(-1);
        q6Var.n(0.35f, 200L, hsVar);
        q6Var.x(AndroidUtilities.bold());
        q6Var.w(AndroidUtilities.dp(15.0f));
        q6Var.f30065b = 17;
        this.f26048p = new Path();
        Paint paint2 = new Paint(1);
        this.f26049q = paint2;
        this.f26050r = new RectF();
        this.f26051s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f26052t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f26053u = new RectF();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        double d;
        if (f18 > 0.0f && LiteMode.isEnabled(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (gd.f26666b0 < 0) {
                gd.f26666b0 = currentTimeMillis;
            }
            float f19 = ((float) (currentTimeMillis - gd.f26666b0)) / 10000.0f;
            Bitmap bitmap = this.f26036b;
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
                    Paint paint = this.f26035a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(v7.z6.a(e7, sin2, f11, f12) / AndroidUtilities.dpf2(64.0f), 1.0f), f17) * A)) * 255.0f));
                    float f25 = dpf2;
                    float sin3 = f25 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.gms.internal.vision.e2.A((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(e7, sin2);
                    canvas.scale(sin3, sin3);
                    float f26 = -(i10 >> 1);
                    canvas.drawBitmap(this.f26036b, f26, f26, paint);
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
