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
    public final Paint f22958a;
    public Bitmap f22959b;
    public float f22960c;
    public float d;
    public final e6 e;
    public final e6 f22961f;
    public float f22962g;
    public final e6 h;
    public float f22963i;
    public final e6 f22964j;
    public final o6 f22965k;
    public float f22966l;
    public final e6 f22967m;
    public boolean f22968n;
    public final e6 f22969o;
    public final Path f22970p;
    public final Paint f22971q;
    public final RectF f22972r;
    public final Paint f22973s;
    public final Paint f22974t;
    public final RectF f22975u;
    public RadialGradient v;
    public Matrix f22976w;
    public float f22977x;
    public float f22978y;
    public float f22979z;

    public bd(dd ddVar) {
        this.E = ddVar;
        Paint paint = new Paint(3);
        this.f22958a = paint;
        paint.setColor(-1);
        sr srVar = sr.h;
        this.e = new e6(ddVar, 650L, srVar);
        this.f22961f = new e6(ddVar, 650L, srVar);
        sr srVar2 = sr.f28349g;
        this.h = new e6(ddVar, 0L, 150L, srVar2);
        this.f22963i = 1.0f;
        this.f22964j = new e6(ddVar, 0L, 150L, srVar2);
        o6 o6Var = new o6(false, true, true, false);
        this.f22965k = o6Var;
        this.f22967m = new e6(ddVar, 0L, 150L, srVar2);
        this.f22969o = new e6(ddVar, 0L, 200L, srVar);
        o6Var.r(-1);
        o6Var.k(0.35f, 200L, srVar);
        o6Var.u(AndroidUtilities.bold());
        o6Var.t(AndroidUtilities.dp(15.0f));
        o6Var.f26948b = 17;
        this.f22970p = new Path();
        Paint paint2 = new Paint(1);
        this.f22971q = paint2;
        this.f22972r = new RectF();
        this.f22973s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f22974t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f22975u = new RectF();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        double d;
        if (f18 > 0.0f && LiteMode.isEnabled(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (dd.f23634b0 < 0) {
                dd.f23634b0 = currentTimeMillis;
            }
            float f19 = ((float) (currentTimeMillis - dd.f23634b0)) / 10000.0f;
            Bitmap bitmap = this.f22959b;
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
                    Paint paint = this.f22958a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(v7.a7.a(e, sin2, f11, f12) / AndroidUtilities.dpf2(64.0f), 1.0f), f17) * B)) * 255.0f));
                    float f25 = dpf2;
                    float sin3 = f25 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.gms.internal.vision.e2.B((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(e, sin2);
                    canvas.scale(sin3, sin3);
                    float f26 = -(i10 >> 1);
                    canvas.drawBitmap(this.f22959b, f26, f26, paint);
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
