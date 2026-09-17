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
public final class cd {
    public float A;
    public float B;
    public float C;
    public float D;
    public final ed E;
    public final Paint f24970a;
    public Bitmap f24971b;
    public float f24972c;
    public float d;
    public final e6 f24973e;
    public final e6 f24974f;
    public float f24975g;
    public final e6 h;
    public float f24976i;
    public final e6 f24977j;
    public final p6 f24978k;
    public float f24979l;
    public final e6 f24980m;
    public boolean f24981n;
    public final e6 f24982o;
    public final Path f24983p;
    public final Paint f24984q;
    public final RectF f24985r;
    public final Paint f24986s;
    public final Paint f24987t;
    public final RectF f24988u;
    public RadialGradient v;
    public Matrix f24989w;
    public float f24990x;
    public float f24991y;
    public float f24992z;

    public cd(ed edVar) {
        this.E = edVar;
        Paint paint = new Paint(3);
        this.f24970a = paint;
        paint.setColor(-1);
        pr prVar = pr.h;
        this.f24973e = new e6(edVar, 650L, prVar);
        this.f24974f = new e6(edVar, 650L, prVar);
        pr prVar2 = pr.f29468g;
        this.h = new e6(edVar, 0L, 150L, prVar2);
        this.f24976i = 1.0f;
        this.f24977j = new e6(edVar, 0L, 150L, prVar2);
        p6 p6Var = new p6(false, true, true, false);
        this.f24978k = p6Var;
        this.f24980m = new e6(edVar, 0L, 150L, prVar2);
        this.f24982o = new e6(edVar, 0L, 200L, prVar);
        p6Var.r(-1);
        p6Var.k(0.35f, 200L, prVar);
        p6Var.u(AndroidUtilities.bold());
        p6Var.t(AndroidUtilities.dp(15.0f));
        p6Var.f29286b = 17;
        this.f24983p = new Path();
        Paint paint2 = new Paint(1);
        this.f24984q = paint2;
        this.f24985r = new RectF();
        this.f24986s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f24987t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f24988u = new RectF();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        double d;
        if (f18 > 0.0f && LiteMode.isEnabled(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (ed.f25641b0 < 0) {
                ed.f25641b0 = currentTimeMillis;
            }
            float f19 = ((float) (currentTimeMillis - ed.f25641b0)) / 10000.0f;
            Bitmap bitmap = this.f24971b;
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
                    float e7 = (float) i2.g.e(ed.a(f22), lerp, f7);
                    int i10 = width;
                    float sin2 = (float) ((Math.sin(ed.a(f22)) * lerp) + f10);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float B = com.google.android.gms.internal.vision.e2.B((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f18);
                    Paint paint = this.f24970a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(v7.z6.a(e7, sin2, f11, f12) / AndroidUtilities.dpf2(64.0f), 1.0f), f17) * B)) * 255.0f));
                    float f25 = dpf2;
                    float sin3 = f25 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.gms.internal.vision.e2.B((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(e7, sin2);
                    canvas.scale(sin3, sin3);
                    float f26 = -(i10 >> 1);
                    canvas.drawBitmap(this.f24971b, f26, f26, paint);
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
