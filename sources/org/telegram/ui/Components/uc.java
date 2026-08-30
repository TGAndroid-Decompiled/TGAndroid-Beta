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
    public final Paint f29184a;
    public Bitmap f29185b;
    public float f29186c;
    public float d;
    public final z5 e;
    public final z5 f29187f;
    public float f29188g;
    public final z5 h;
    public float f29189i;
    public final z5 f29190j;
    public final j6 f29191k;
    public float f29192l;
    public final z5 f29193m;
    public boolean f29194n;
    public final z5 f29195o;
    public final Path f29196p;
    public final Paint f29197q;
    public final RectF f29198r;
    public final Paint f29199s;
    public final Paint f29200t;
    public final RectF f29201u;
    public RadialGradient v;
    public Matrix f29202w;
    public float f29203x;
    public float f29204y;
    public float f29205z;

    public uc(wc wcVar) {
        this.E = wcVar;
        Paint paint = new Paint(3);
        this.f29184a = paint;
        paint.setColor(-1);
        nr nrVar = nr.h;
        this.e = new z5(wcVar, 650L, nrVar);
        this.f29187f = new z5(wcVar, 650L, nrVar);
        nr nrVar2 = nr.f27347g;
        this.h = new z5(wcVar, 0L, 150L, nrVar2);
        this.f29189i = 1.0f;
        this.f29190j = new z5(wcVar, 0L, 150L, nrVar2);
        j6 j6Var = new j6(false, true, true, false);
        this.f29191k = j6Var;
        this.f29193m = new z5(wcVar, 0L, 150L, nrVar2);
        this.f29195o = new z5(wcVar, 0L, 200L, nrVar);
        j6Var.r(-1);
        j6Var.k(0.35f, 200L, nrVar);
        j6Var.u(AndroidUtilities.bold());
        j6Var.t(AndroidUtilities.dp(15.0f));
        j6Var.f25884b = 17;
        this.f29196p = new Path();
        Paint paint2 = new Paint(1);
        this.f29197q = paint2;
        this.f29198r = new RectF();
        this.f29199s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f29200t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f29201u = new RectF();
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
            Bitmap bitmap = this.f29185b;
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
                    float a2 = (float) kh.a2.a(wc.a(f23), lerp, f10);
                    int i10 = width;
                    float sin2 = (float) ((Math.sin(wc.a(f23)) * lerp) + f11);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float y10 = e2.c.y((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f19);
                    Paint paint = this.f29184a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(k7.n6.a(a2, sin2, f12, f13) / AndroidUtilities.dpf2(64.0f), 1.0f), f18) * y10)) * 255.0f));
                    float f26 = dpf2;
                    float sin3 = f26 * ((float) ((((Math.sin(f23) + 1.0d) * 0.25d) + 0.800000011920929d) * e2.c.y((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(a2, sin2);
                    canvas.scale(sin3, sin3);
                    float f27 = -(i10 >> 1);
                    canvas.drawBitmap(this.f29185b, f27, f27, paint);
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
