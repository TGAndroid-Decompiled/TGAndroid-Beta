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
    public final Paint f24890a;
    public Bitmap f24891b;
    public float f24892c;
    public float d;
    public final f6 e;
    public final f6 f24893f;
    public float f24894g;
    public final f6 h;
    public float f24895i;
    public final f6 f24896j;
    public final p6 f24897k;
    public float f24898l;
    public final f6 f24899m;
    public boolean f24900n;
    public final f6 f24901o;
    public final Path f24902p;
    public final Paint f24903q;
    public final RectF f24904r;
    public final Paint f24905s;
    public final Paint f24906t;
    public final RectF f24907u;
    public RadialGradient v;
    public Matrix f24908w;
    public float f24909x;
    public float f24910y;
    public float f24911z;

    public bd(dd ddVar) {
        this.E = ddVar;
        Paint paint = new Paint(3);
        this.f24890a = paint;
        paint.setColor(-1);
        bs bsVar = bs.h;
        this.e = new f6(ddVar, 650L, bsVar);
        this.f24893f = new f6(ddVar, 650L, bsVar);
        bs bsVar2 = bs.f25022g;
        this.h = new f6(ddVar, 0L, 150L, bsVar2);
        this.f24895i = 1.0f;
        this.f24896j = new f6(ddVar, 0L, 150L, bsVar2);
        p6 p6Var = new p6(false, true, true);
        this.f24897k = p6Var;
        this.f24899m = new f6(ddVar, 0L, 150L, bsVar2);
        this.f24901o = new f6(ddVar, 0L, 200L, bsVar);
        p6Var.u(-1);
        p6Var.n(0.35f, 200L, bsVar);
        p6Var.x(AndroidUtilities.bold());
        p6Var.w(AndroidUtilities.dp(15.0f));
        p6Var.f29226b = 17;
        this.f24902p = new Path();
        Paint paint2 = new Paint(1);
        this.f24903q = paint2;
        this.f24904r = new RectF();
        this.f24905s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f24906t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f24907u = new RectF();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        double d;
        if (f18 > 0.0f && LiteMode.isEnabled(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (dd.f25441b0 < 0) {
                dd.f25441b0 = currentTimeMillis;
            }
            float f19 = ((float) (currentTimeMillis - dd.f25441b0)) / 10000.0f;
            Bitmap bitmap = this.f24891b;
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
                    float f25 = (float) i2.e.f(dd.a(f22), lerp, f7);
                    int i10 = width;
                    float sin2 = (float) ((Math.sin(dd.a(f22)) * lerp) + f10);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float A = com.google.android.gms.internal.play_billing.k3.A((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f18);
                    Paint paint = this.f24890a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(v7.f7.a(f25, sin2, f11, f12) / AndroidUtilities.dpf2(64.0f), 1.0f), f17) * A)) * 255.0f));
                    float f26 = dpf2;
                    float sin3 = f26 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.gms.internal.play_billing.k3.A((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(f25, sin2);
                    canvas.scale(sin3, sin3);
                    float f27 = -(i10 >> 1);
                    canvas.drawBitmap(this.f24891b, f27, f27, paint);
                    canvas.restore();
                    floor++;
                    sqrt = sqrt;
                    width = i10;
                    f20 = f20;
                    dpf2 = f26;
                    f19 = f24;
                    f21 = 7.0f;
                }
            }
        }
    }
}
