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

public final class qc {
    public float A;
    public float B;
    public float C;
    public float D;
    public final sc E;

    public final Paint f31870a;

    public Bitmap f31871b;

    public float f31872c;
    public float d;

    public final y5 f31873e;

    public final y5 f31874f;

    public float f31875g;
    public final y5 h;

    public float f31876i;

    public final y5 f31877j;

    public final i6 f31878k;

    public float f31879l;

    public final y5 f31880m;

    public boolean f31881n;

    public final y5 f31882o;

    public final Path f31883p;

    public final Paint f31884q;

    public final RectF f31885r;

    public final Paint f31886s;

    public final Paint f31887t;

    public final RectF f31888u;
    public RadialGradient v;

    public Matrix f31889w;

    public float f31890x;

    public float f31891y;

    public float f31892z;

    public qc(sc scVar) {
        this.E = scVar;
        Paint paint = new Paint(3);
        this.f31870a = paint;
        paint.setColor(-1);
        er erVar = er.h;
        this.f31873e = new y5(scVar, 650L, erVar);
        this.f31874f = new y5(scVar, 650L, erVar);
        er erVar2 = er.f28123g;
        this.h = new y5(scVar, 0L, 150L, erVar2);
        this.f31876i = 1.0f;
        this.f31877j = new y5(scVar, 0L, 150L, erVar2);
        i6 i6Var = new i6(false, true, true, false);
        this.f31878k = i6Var;
        this.f31880m = new y5(scVar, 0L, 150L, erVar2);
        this.f31882o = new y5(scVar, 0L, 200L, erVar);
        i6Var.r(-1);
        i6Var.k(0.35f, 200L, erVar);
        i6Var.u(AndroidUtilities.bold());
        i6Var.t(AndroidUtilities.dp(15.0f));
        i6Var.f29239b = 17;
        this.f31883p = new Path();
        Paint paint2 = new Paint(1);
        this.f31884q = paint2;
        this.f31885r = new RectF();
        this.f31886s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f31887t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f31888u = new RectF();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        if (f19 <= 0.0f || !LiteMode.isEnabled(360928)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        float fSqrt = (float) Math.sqrt(2.0d);
        if (sc.U < 0) {
            sc.U = jCurrentTimeMillis;
        }
        float f20 = (jCurrentTimeMillis - sc.U) / 10000.0f;
        Bitmap bitmap = this.f31871b;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f21 = width;
            float fDpf2 = AndroidUtilities.dpf2(15.0f) / f21;
            float f22 = 7.0f;
            int iFloor = (int) Math.floor((f14 % 360.0f) / 7.0f);
            int iCeil = (int) Math.ceil((f15 % 360.0f) / 7.0f);
            while (iFloor <= iCeil) {
                float f23 = iFloor * f22;
                float fSin = (float) (((((Math.sin(2000.0f * f23) + 1.0d) * 0.25d) + 1.0d) * ((double) (100.0f + f20))) % 1.0d);
                float f24 = f21 * fSqrt;
                float f25 = f20;
                double dLerp = AndroidUtilities.lerp(f16 - f24, f17 + f24, fSin);
                float fB = (float) i0.a.b(sc.a(f23), dLerp, f10);
                int i10 = width;
                float fSin2 = (float) ((Math.sin(sc.a(f23)) * dLerp) + ((double) f11));
                float fAbs = (Math.abs(fSin - 0.5f) * (-1.75f)) + 1.0f;
                double d = ((double) fSin) * 3.141592653589793d;
                int iMax = (int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(h7.y.a(fB, fSin2, f12, f13) / AndroidUtilities.dpf2(64.0f), 1.0f), f18) * com.google.android.recaptcha.internal.a.B((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, fAbs * 0.65f * f19))) * 255.0f);
                Paint paint = this.f31870a;
                paint.setAlpha(iMax);
                float f26 = fDpf2;
                float fSin3 = f26 * ((float) ((((Math.sin(f23) + 1.0d) * 0.25d) + 0.800000011920929d) * ((double) com.google.android.recaptcha.internal.a.B((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f))));
                canvas.save();
                canvas.translate(fB, fSin2);
                canvas.scale(fSin3, fSin3);
                float f27 = -(i10 >> 1);
                canvas.drawBitmap(this.f31871b, f27, f27, paint);
                canvas.restore();
                iFloor++;
                fSqrt = fSqrt;
                width = i10;
                f21 = f21;
                fDpf2 = f26;
                f20 = f25;
                f22 = 7.0f;
            }
        }
    }
}
