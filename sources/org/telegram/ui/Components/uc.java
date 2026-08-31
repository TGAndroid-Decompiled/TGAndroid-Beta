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
public final class uc {
    public float A;
    public float B;
    public float C;
    public float D;
    public final wc E;
    public final Paint f31633a;
    public Bitmap f31634b;
    public float f31635c;
    public float d;
    public final z5 f31636e;
    public final z5 f31637f;
    public float f31638g;
    public final z5 h;
    public float f31639i;
    public final z5 f31640j;
    public final j6 f31641k;
    public float f31642l;
    public final z5 f31643m;
    public boolean f31644n;
    public final z5 f31645o;
    public final Path f31646p;
    public final Paint f31647q;
    public final RectF f31648r;
    public final Paint f31649s;
    public final Paint f31650t;
    public final RectF f31651u;
    public RadialGradient v;
    public Matrix f31652w;
    public float f31653x;
    public float f31654y;
    public float f31655z;

    public uc(wc wcVar) {
        this.E = wcVar;
        Paint paint = new Paint(3);
        this.f31633a = paint;
        paint.setColor(-1);
        pr prVar = pr.h;
        this.f31636e = new z5(wcVar, 650L, prVar);
        this.f31637f = new z5(wcVar, 650L, prVar);
        pr prVar2 = pr.f30184g;
        this.h = new z5(wcVar, 0L, 150L, prVar2);
        this.f31639i = 1.0f;
        this.f31640j = new z5(wcVar, 0L, 150L, prVar2);
        j6 j6Var = new j6(false, true, true, false);
        this.f31641k = j6Var;
        this.f31643m = new z5(wcVar, 0L, 150L, prVar2);
        this.f31645o = new z5(wcVar, 0L, 200L, prVar);
        j6Var.r(-1);
        j6Var.k(0.35f, 200L, prVar);
        j6Var.u(AndroidUtilities.bold());
        j6Var.t(AndroidUtilities.dp(15.0f));
        j6Var.f28029b = 17;
        this.f31646p = new Path();
        Paint paint2 = new Paint(1);
        this.f31647q = paint2;
        this.f31648r = new RectF();
        this.f31649s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f31650t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f31651u = new RectF();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        double d;
        if (f19 > 0.0f && LiteMode.isEnabled(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (wc.V < 0) {
                wc.V = currentTimeMillis;
            }
            float f20 = ((float) (currentTimeMillis - wc.V)) / 10000.0f;
            Bitmap bitmap = this.f31634b;
            if (bitmap != null) {
                int width = bitmap.getWidth();
                float f21 = width;
                float dpf2 = AndroidUtilities.dpf2(15.0f) / f21;
                float f22 = 7.0f;
                int floor = (int) Math.floor((f14 % 360.0f) / 7.0f);
                int ceil = (int) Math.ceil((f15 % 360.0f) / 7.0f);
                while (floor <= ceil) {
                    float f23 = floor * f22;
                    float sin = (float) (((((Math.sin(2000.0f * f23) + 1.0d) * 0.25d) + 1.0d) * (100.0f + f20)) % 1.0d);
                    float f24 = f21 * sqrt;
                    float f25 = f20;
                    double lerp = AndroidUtilities.lerp(f16 - f24, f17 + f24, sin);
                    float a2 = (float) l.d.a(wc.a(f23), lerp, f10);
                    int i10 = width;
                    float sin2 = (float) ((Math.sin(wc.a(f23)) * lerp) + f11);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float y10 = e2.c.y((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f19);
                    Paint paint = this.f31633a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(k7.o6.a(a2, sin2, f12, f13) / AndroidUtilities.dpf2(64.0f), 1.0f), f18) * y10)) * 255.0f));
                    float f26 = dpf2;
                    float sin3 = f26 * ((float) ((((Math.sin(f23) + 1.0d) * 0.25d) + 0.800000011920929d) * e2.c.y((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(a2, sin2);
                    canvas.scale(sin3, sin3);
                    float f27 = -(i10 >> 1);
                    canvas.drawBitmap(this.f31634b, f27, f27, paint);
                    canvas.restore();
                    floor++;
                    sqrt = sqrt;
                    width = i10;
                    f21 = f21;
                    dpf2 = f26;
                    f20 = f25;
                    f22 = 7.0f;
                }
            }
        }
    }
}
