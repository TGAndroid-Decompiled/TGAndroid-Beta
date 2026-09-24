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
    public final Paint f23282a;
    public Bitmap f23283b;
    public float f23284c;
    public float d;
    public final e6 e;
    public final e6 f23285f;
    public float f23286g;
    public final e6 h;
    public float f23287i;
    public final e6 f23288j;
    public final o6 f23289k;
    public float f23290l;
    public final e6 f23291m;
    public boolean f23292n;
    public final e6 f23293o;
    public final Path f23294p;
    public final Paint f23295q;
    public final RectF f23296r;
    public final Paint f23297s;
    public final Paint f23298t;
    public final RectF f23299u;
    public RadialGradient v;
    public Matrix f23300w;
    public float f23301x;
    public float f23302y;
    public float f23303z;

    public cd(ed edVar) {
        this.E = edVar;
        Paint paint = new Paint(3);
        this.f23282a = paint;
        paint.setColor(-1);
        rr rrVar = rr.h;
        this.e = new e6(edVar, 650L, rrVar);
        this.f23285f = new e6(edVar, 650L, rrVar);
        rr rrVar2 = rr.f28023g;
        this.h = new e6(edVar, 0L, 150L, rrVar2);
        this.f23287i = 1.0f;
        this.f23288j = new e6(edVar, 0L, 150L, rrVar2);
        o6 o6Var = new o6(false, true, true, false);
        this.f23289k = o6Var;
        this.f23291m = new e6(edVar, 0L, 150L, rrVar2);
        this.f23293o = new e6(edVar, 0L, 200L, rrVar);
        o6Var.r(-1);
        o6Var.k(0.35f, 200L, rrVar);
        o6Var.u(AndroidUtilities.bold());
        o6Var.t(AndroidUtilities.dp(15.0f));
        o6Var.f26925b = 17;
        this.f23294p = new Path();
        Paint paint2 = new Paint(1);
        this.f23295q = paint2;
        this.f23296r = new RectF();
        this.f23297s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f23298t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f23299u = new RectF();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        double d;
        if (f18 > 0.0f && LiteMode.isEnabled(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (ed.f23880b0 < 0) {
                ed.f23880b0 = currentTimeMillis;
            }
            float f19 = ((float) (currentTimeMillis - ed.f23880b0)) / 10000.0f;
            Bitmap bitmap = this.f23283b;
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
                    float e = (float) hg.c.e(ed.a(f22), lerp, f7);
                    int i10 = width;
                    float sin2 = (float) ((Math.sin(ed.a(f22)) * lerp) + f10);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float B = com.google.android.gms.internal.vision.e2.B((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f18);
                    Paint paint = this.f23282a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(v7.a7.a(e, sin2, f11, f12) / AndroidUtilities.dpf2(64.0f), 1.0f), f17) * B)) * 255.0f));
                    float f25 = dpf2;
                    float sin3 = f25 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.gms.internal.vision.e2.B((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(e, sin2);
                    canvas.scale(sin3, sin3);
                    float f26 = -(i10 >> 1);
                    canvas.drawBitmap(this.f23283b, f26, f26, paint);
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
