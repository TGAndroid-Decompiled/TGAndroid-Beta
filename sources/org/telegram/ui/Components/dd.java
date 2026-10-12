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
    public final Paint f25301a;
    public Bitmap f25302b;
    public float f25303c;
    public float d;
    public final g6 f25304e;
    public final g6 f25305f;
    public float f25306g;
    public final g6 h;
    public float f25307i;
    public final g6 f25308j;
    public final q6 f25309k;
    public float f25310l;
    public final g6 f25311m;
    public boolean f25312n;
    public final g6 f25313o;
    public final Path f25314p;
    public final Paint f25315q;
    public final RectF f25316r;
    public final Paint f25317s;
    public final Paint f25318t;
    public final RectF f25319u;
    public RadialGradient v;
    public Matrix f25320w;
    public float f25321x;
    public float f25322y;
    public float f25323z;

    public dd(fd fdVar) {
        this.E = fdVar;
        Paint paint = new Paint(3);
        this.f25301a = paint;
        paint.setColor(-1);
        js jsVar = js.h;
        this.f25304e = new g6(fdVar, 650L, jsVar);
        this.f25305f = new g6(fdVar, 650L, jsVar);
        js jsVar2 = js.f27635g;
        this.h = new g6(fdVar, 0L, 150L, jsVar2);
        this.f25307i = 1.0f;
        this.f25308j = new g6(fdVar, 0L, 150L, jsVar2);
        q6 q6Var = new q6(false, true, true);
        this.f25309k = q6Var;
        this.f25311m = new g6(fdVar, 0L, 150L, jsVar2);
        this.f25313o = new g6(fdVar, 0L, 200L, jsVar);
        q6Var.u(-1);
        q6Var.n(0.35f, 200L, jsVar);
        q6Var.x(AndroidUtilities.bold());
        q6Var.w(AndroidUtilities.dp(15.0f));
        q6Var.f29690b = 17;
        this.f25314p = new Path();
        Paint paint2 = new Paint(1);
        this.f25315q = paint2;
        this.f25316r = new RectF();
        this.f25317s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f25318t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f25319u = new RectF();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        double d;
        if (f18 > 0.0f && LiteMode.isEnabled(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (fd.f26013b0 < 0) {
                fd.f26013b0 = currentTimeMillis;
            }
            float f19 = ((float) (currentTimeMillis - fd.f26013b0)) / 10000.0f;
            Bitmap bitmap = this.f25302b;
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
                    float e7 = (float) hg.c.e(fd.a(f22), lerp, f7);
                    int i10 = width;
                    float sin2 = (float) ((Math.sin(fd.a(f22)) * lerp) + f10);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float A = com.google.android.gms.internal.vision.e2.A((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f18);
                    Paint paint = this.f25301a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(v7.z6.a(e7, sin2, f11, f12) / AndroidUtilities.dpf2(64.0f), 1.0f), f17) * A)) * 255.0f));
                    float f25 = dpf2;
                    float sin3 = f25 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.gms.internal.vision.e2.A((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(e7, sin2);
                    canvas.scale(sin3, sin3);
                    float f26 = -(i10 >> 1);
                    canvas.drawBitmap(this.f25302b, f26, f26, paint);
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
