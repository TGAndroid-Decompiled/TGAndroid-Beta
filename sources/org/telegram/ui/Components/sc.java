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
public final class sc {
    public float A;
    public float B;
    public float C;
    public float D;
    public final uc E;
    public final Paint f32419a;
    public Bitmap f32420b;
    public float f32421c;
    public float d;
    public final y5 f32422e;
    public final y5 f32423f;
    public float f32424g;
    public final y5 h;
    public float f32425i;
    public final y5 f32426j;
    public final i6 f32427k;
    public float f32428l;
    public final y5 f32429m;
    public boolean f32430n;
    public final y5 f32431o;
    public final Path f32432p;
    public final Paint f32433q;
    public final RectF f32434r;
    public final Paint f32435s;
    public final Paint f32436t;
    public final RectF f32437u;
    public RadialGradient v;
    public Matrix f32438w;
    public float f32439x;
    public float f32440y;
    public float f32441z;

    public sc(uc ucVar) {
        this.E = ucVar;
        Paint paint = new Paint(3);
        this.f32419a = paint;
        paint.setColor(-1);
        gr grVar = gr.h;
        this.f32422e = new y5(ucVar, 650L, grVar);
        this.f32423f = new y5(ucVar, 650L, grVar);
        gr grVar2 = gr.f28845g;
        this.h = new y5(ucVar, 0L, 150L, grVar2);
        this.f32425i = 1.0f;
        this.f32426j = new y5(ucVar, 0L, 150L, grVar2);
        i6 i6Var = new i6(false, true, true, false);
        this.f32427k = i6Var;
        this.f32429m = new y5(ucVar, 0L, 150L, grVar2);
        this.f32431o = new y5(ucVar, 0L, 200L, grVar);
        i6Var.r(-1);
        i6Var.k(0.35f, 200L, grVar);
        i6Var.u(AndroidUtilities.bold());
        i6Var.t(AndroidUtilities.dp(15.0f));
        i6Var.f29333b = 17;
        this.f32432p = new Path();
        Paint paint2 = new Paint(1);
        this.f32433q = paint2;
        this.f32434r = new RectF();
        this.f32435s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f32436t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f32437u = new RectF();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        double d;
        if (f19 > 0.0f && LiteMode.isEnabled(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            float sqrt = (float) Math.sqrt(2.0d);
            if (uc.U < 0) {
                uc.U = currentTimeMillis;
            }
            float f20 = ((float) (currentTimeMillis - uc.U)) / 10000.0f;
            Bitmap bitmap = this.f32420b;
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
                    float b10 = (float) j3.r0.b(uc.a(f23), lerp, f10);
                    int i9 = width;
                    float sin2 = (float) ((Math.sin(uc.a(f23)) * lerp) + f11);
                    float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                    float B = e2.c.B((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f19);
                    Paint paint = this.f32419a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(g7.w.a(b10, sin2, f12, f13) / AndroidUtilities.dpf2(64.0f), 1.0f), f18) * B)) * 255.0f));
                    float f26 = dpf2;
                    float sin3 = f26 * ((float) ((((Math.sin(f23) + 1.0d) * 0.25d) + 0.800000011920929d) * e2.c.B((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f)));
                    canvas.save();
                    canvas.translate(b10, sin2);
                    canvas.scale(sin3, sin3);
                    float f27 = -(i9 >> 1);
                    canvas.drawBitmap(this.f32420b, f27, f27, paint);
                    canvas.restore();
                    floor++;
                    sqrt = sqrt;
                    width = i9;
                    f21 = f21;
                    dpf2 = f26;
                    f20 = f25;
                    f22 = 7.0f;
                }
            }
        }
    }
}
