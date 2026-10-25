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
public final class ad {
    public float A;
    public float B;
    public float C;
    public float D;
    public final cd E;
    public final Paint f26466a;
    public Bitmap f26467b;
    public float f26468c;
    public float d;
    public final h6 e;
    public final h6 f26469f;
    public float f26470g;
    public final h6 h;
    public float f26471i;
    public final h6 f26472j;
    public final r6 f26473k;
    public float f26474l;
    public final h6 f26475m;
    public boolean f26476n;
    public final h6 f26477o;
    public final Path f26478p;
    public final Paint f26479q;
    public final RectF f26480r;
    public final Paint f26481s;
    public final Paint f26482t;
    public final RectF f26483u;
    public RadialGradient v;
    public Matrix f26484w;
    public float f26485x;
    public float f26486y;
    public float f26487z;

    public ad(cd cdVar) {
        this.E = cdVar;
        Paint paint = new Paint(3);
        this.f26466a = paint;
        paint.setColor(-1);
        ds dsVar = ds.h;
        this.e = new h6(cdVar, 650L, dsVar);
        this.f26469f = new h6(cdVar, 650L, dsVar);
        ds dsVar2 = ds.f27585g;
        this.h = new h6(cdVar, 0L, 150L, dsVar2);
        this.f26471i = 1.0f;
        this.f26472j = new h6(cdVar, 0L, 150L, dsVar2);
        r6 r6Var = new r6(false, true, true);
        this.f26473k = r6Var;
        this.f26475m = new h6(cdVar, 0L, 150L, dsVar2);
        this.f26477o = new h6(cdVar, 0L, 200L, dsVar);
        r6Var.u(-1);
        r6Var.n(0.35f, 200L, dsVar);
        r6Var.x(AndroidUtilities.bold());
        r6Var.w(AndroidUtilities.dp(15.0f));
        r6Var.f32119b = 17;
        this.f26478p = new Path();
        Paint paint2 = new Paint(1);
        this.f26479q = paint2;
        this.f26480r = new RectF();
        this.f26481s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f26482t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f26483u = new RectF();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        double d;
        if (f18 > 0.0f && LiteMode.isEnabled(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (cd.f27115b0 < 0) {
                cd.f27115b0 = currentTimeMillis;
            }
            float f19 = ((float) (currentTimeMillis - cd.f27115b0)) / 10000.0f;
            Bitmap bitmap = this.f26467b;
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
                    float a2 = (float) org.telegram.messenger.t.a(cd.a(f22), lerp, f7);
                    int i10 = width;
                    float sin2 = (float) ((Math.sin(cd.a(f22)) * lerp) + f10);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float C = c3.h0.C((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f18);
                    Paint paint = this.f26466a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(a8.ic.a(a2, sin2, f11, f12) / AndroidUtilities.dpf2(64.0f), 1.0f), f17) * C)) * 255.0f));
                    float f25 = dpf2;
                    float sin3 = f25 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * c3.h0.C((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(a2, sin2);
                    canvas.scale(sin3, sin3);
                    float f26 = -(i10 >> 1);
                    canvas.drawBitmap(this.f26467b, f26, f26, paint);
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
