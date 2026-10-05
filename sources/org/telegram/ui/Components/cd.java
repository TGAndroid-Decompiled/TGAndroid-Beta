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
    public final Paint f25383a;
    public Bitmap f25384b;
    public float f25385c;
    public float d;
    public final e6 f25386e;
    public final e6 f25387f;
    public float f25388g;
    public final e6 h;
    public float f25389i;
    public final e6 f25390j;
    public final o6 f25391k;
    public float f25392l;
    public final e6 f25393m;
    public boolean f25394n;
    public final e6 f25395o;
    public final Path f25396p;
    public final Paint f25397q;
    public final RectF f25398r;
    public final Paint f25399s;
    public final Paint f25400t;
    public final RectF f25401u;
    public RadialGradient v;
    public Matrix f25402w;
    public float f25403x;
    public float f25404y;
    public float f25405z;

    public cd(ed edVar) {
        this.E = edVar;
        Paint paint = new Paint(3);
        this.f25383a = paint;
        paint.setColor(-1);
        tr trVar = tr.h;
        this.f25386e = new e6(edVar, 650L, trVar);
        this.f25387f = new e6(edVar, 650L, trVar);
        tr trVar2 = tr.f31216g;
        this.h = new e6(edVar, 0L, 150L, trVar2);
        this.f25389i = 1.0f;
        this.f25390j = new e6(edVar, 0L, 150L, trVar2);
        o6 o6Var = new o6(false, true, true, false);
        this.f25391k = o6Var;
        this.f25393m = new e6(edVar, 0L, 150L, trVar2);
        this.f25395o = new e6(edVar, 0L, 200L, trVar);
        o6Var.r(-1);
        o6Var.k(0.35f, 200L, trVar);
        o6Var.u(AndroidUtilities.bold());
        o6Var.t(AndroidUtilities.dp(15.0f));
        o6Var.f29354b = 17;
        this.f25396p = new Path();
        Paint paint2 = new Paint(1);
        this.f25397q = paint2;
        this.f25398r = new RectF();
        this.f25399s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f25400t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f25401u = new RectF();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        double d;
        if (f18 > 0.0f && LiteMode.isEnabled(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (ed.f26109b0 < 0) {
                ed.f26109b0 = currentTimeMillis;
            }
            float f19 = ((float) (currentTimeMillis - ed.f26109b0)) / 10000.0f;
            Bitmap bitmap = this.f25384b;
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
                    float e7 = (float) hg.c.e(ed.a(f22), lerp, f7);
                    int i10 = width;
                    float sin2 = (float) ((Math.sin(ed.a(f22)) * lerp) + f10);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float B = com.google.android.gms.internal.vision.e2.B((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f18);
                    Paint paint = this.f25383a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(v7.z6.a(e7, sin2, f11, f12) / AndroidUtilities.dpf2(64.0f), 1.0f), f17) * B)) * 255.0f));
                    float f25 = dpf2;
                    float sin3 = f25 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.gms.internal.vision.e2.B((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(e7, sin2);
                    canvas.scale(sin3, sin3);
                    float f26 = -(i10 >> 1);
                    canvas.drawBitmap(this.f25384b, f26, f26, paint);
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
