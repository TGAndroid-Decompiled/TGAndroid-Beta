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
public final class zc {
    public float A;
    public float B;
    public float C;
    public float D;
    public final bd E;
    public final Paint f30546a;
    public Bitmap f30547b;
    public float f30548c;
    public float d;
    public final c6 e;
    public final c6 f30549f;
    public float f30550g;
    public final c6 h;
    public float f30551i;
    public final c6 f30552j;
    public final m6 f30553k;
    public float f30554l;
    public final c6 f30555m;
    public boolean f30556n;
    public final c6 f30557o;
    public final Path f30558p;
    public final Paint f30559q;
    public final RectF f30560r;
    public final Paint f30561s;
    public final Paint f30562t;
    public final RectF f30563u;
    public RadialGradient v;
    public Matrix f30564w;
    public float f30565x;
    public float f30566y;
    public float f30567z;

    public zc(bd bdVar) {
        this.E = bdVar;
        Paint paint = new Paint(3);
        this.f30546a = paint;
        paint.setColor(-1);
        qr qrVar = qr.h;
        this.e = new c6(bdVar, 650L, qrVar);
        this.f30549f = new c6(bdVar, 650L, qrVar);
        qr qrVar2 = qr.f27421g;
        this.h = new c6(bdVar, 0L, 150L, qrVar2);
        this.f30551i = 1.0f;
        this.f30552j = new c6(bdVar, 0L, 150L, qrVar2);
        m6 m6Var = new m6(false, true, true, false);
        this.f30553k = m6Var;
        this.f30555m = new c6(bdVar, 0L, 150L, qrVar2);
        this.f30557o = new c6(bdVar, 0L, 200L, qrVar);
        m6Var.r(-1);
        m6Var.k(0.35f, 200L, qrVar);
        m6Var.u(AndroidUtilities.bold());
        m6Var.t(AndroidUtilities.dp(15.0f));
        m6Var.f26085b = 17;
        this.f30558p = new Path();
        Paint paint2 = new Paint(1);
        this.f30559q = paint2;
        this.f30560r = new RectF();
        this.f30561s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f30562t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f30563u = new RectF();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        double d;
        if (f18 > 0.0f && LiteMode.isEnabled(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (bd.f22752b0 < 0) {
                bd.f22752b0 = currentTimeMillis;
            }
            float f19 = ((float) (currentTimeMillis - bd.f22752b0)) / 10000.0f;
            Bitmap bitmap = this.f30547b;
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
                    float e = (float) hg.c.e(bd.a(f22), lerp, f7);
                    int i10 = width;
                    float sin2 = (float) ((Math.sin(bd.a(f22)) * lerp) + f10);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float B = com.google.android.gms.internal.vision.e2.B((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f18);
                    Paint paint = this.f30546a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(v7.z6.a(e, sin2, f11, f12) / AndroidUtilities.dpf2(64.0f), 1.0f), f17) * B)) * 255.0f));
                    float f25 = dpf2;
                    float sin3 = f25 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.gms.internal.vision.e2.B((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(e, sin2);
                    canvas.scale(sin3, sin3);
                    float f26 = -(i10 >> 1);
                    canvas.drawBitmap(this.f30547b, f26, f26, paint);
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
