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
    public final Paint f29172a;
    public Bitmap f29173b;
    public float f29174c;
    public float d;
    public final z5 e;
    public final z5 f29175f;
    public float f29176g;
    public final z5 h;
    public float f29177i;
    public final z5 f29178j;
    public final j6 f29179k;
    public float f29180l;
    public final z5 f29181m;
    public boolean f29182n;
    public final z5 f29183o;
    public final Path f29184p;
    public final Paint f29185q;
    public final RectF f29186r;
    public final Paint f29187s;
    public final Paint f29188t;
    public final RectF f29189u;
    public RadialGradient v;
    public Matrix f29190w;
    public float f29191x;
    public float f29192y;
    public float f29193z;

    public uc(wc wcVar) {
        this.E = wcVar;
        Paint paint = new Paint(3);
        this.f29172a = paint;
        paint.setColor(-1);
        mr mrVar = mr.h;
        this.e = new z5(wcVar, 650L, mrVar);
        this.f29175f = new z5(wcVar, 650L, mrVar);
        mr mrVar2 = mr.f27123g;
        this.h = new z5(wcVar, 0L, 150L, mrVar2);
        this.f29177i = 1.0f;
        this.f29178j = new z5(wcVar, 0L, 150L, mrVar2);
        j6 j6Var = new j6(false, true, true, false);
        this.f29179k = j6Var;
        this.f29181m = new z5(wcVar, 0L, 150L, mrVar2);
        this.f29183o = new z5(wcVar, 0L, 200L, mrVar);
        j6Var.r(-1);
        j6Var.k(0.35f, 200L, mrVar);
        j6Var.u(AndroidUtilities.bold());
        j6Var.t(AndroidUtilities.dp(15.0f));
        j6Var.f25847b = 17;
        this.f29184p = new Path();
        Paint paint2 = new Paint(1);
        this.f29185q = paint2;
        this.f29186r = new RectF();
        this.f29187s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f29188t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f29189u = new RectF();
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
            Bitmap bitmap = this.f29173b;
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
                    float a2 = (float) kf.k0.a(wc.a(f23), lerp, f10);
                    int i10 = width;
                    float sin2 = (float) ((Math.sin(wc.a(f23)) * lerp) + f11);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float y10 = e2.c.y((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f19);
                    Paint paint = this.f29172a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(k7.n6.a(a2, sin2, f12, f13) / AndroidUtilities.dpf2(64.0f), 1.0f), f18) * y10)) * 255.0f));
                    float f26 = dpf2;
                    float sin3 = f26 * ((float) ((((Math.sin(f23) + 1.0d) * 0.25d) + 0.800000011920929d) * e2.c.y((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(a2, sin2);
                    canvas.scale(sin3, sin3);
                    float f27 = -(i10 >> 1);
                    canvas.drawBitmap(this.f29173b, f27, f27, paint);
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
