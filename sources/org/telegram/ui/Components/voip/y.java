package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.t8;
import org.telegram.ui.b40;
import org.telegram.ui.c40;
public final class y extends View implements z5 {
    public b40 E;
    public b40 F;
    public int G;
    public float H;
    public final z I;
    public final ImageReceiver f41051a;
    public final ImageReceiver f41052b;
    public final t8 f41053c;
    public final o9 d;
    public final o9 f41054e;
    public final Paint f41055f;
    public final Paint h;
    public float f41056n;
    public float f41057r;
    public float f41058s;
    public float f41059w;
    public float f41060x;
    public final b40[] f41061y;

    public y(z zVar, Context context) {
        super(context);
        this.I = zVar;
        this.f41051a = new ImageReceiver(null);
        this.f41052b = new ImageReceiver(null);
        this.f41053c = new t8((e6) null);
        Paint paint = new Paint(1);
        this.f41055f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f41061y = new b40[3];
        this.G = -1;
        this.H = 1.0f;
        o9 o9Var = new o9(9);
        this.d = o9Var;
        o9 o9Var2 = new o9(12);
        this.f41054e = o9Var2;
        o9Var.f37875a = org.telegram.messenger.g0.L(76.0f);
        o9Var.f37876b = org.telegram.messenger.g0.L(92.0f);
        o9Var.b();
        o9Var2.f37875a = org.telegram.messenger.g0.L(80.0f);
        o9Var2.f37876b = org.telegram.messenger.g0.L(95.0f);
        o9Var2.b();
        paint.setColor(i0.a.f(0.0f, j6.x0(null, j6.f28915gh, false), j6.x0(null, j6.f28932hh, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.o(-16777216, 127));
    }

    public static void a(y yVar, boolean z10) {
        int i7;
        TLRPC.GroupCallParticipant groupCallParticipant;
        b40[] b40VarArr = yVar.f41061y;
        o0 o0Var = yVar.I.f41097o0;
        if (!o0Var.f40820k && ((groupCallParticipant = o0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (o0Var.f40815e) {
                i7 = 1;
            } else {
                i7 = 0;
            }
        } else {
            i7 = 2;
        }
        if (i7 == yVar.G) {
            return;
        }
        yVar.G = i7;
        if (b40VarArr[i7] == null) {
            b40VarArr[i7] = new b40(i7);
            int i10 = yVar.G;
            if (i10 == 2) {
                b40VarArr[i10].f45582g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{j6.x0(null, j6.Zh, false), j6.x0(null, j6.f28823bi, false), j6.x0(null, j6.f28803ai, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i10 == 1) {
                b40VarArr[i10].f45582g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{j6.x0(null, j6.f29213wh, false), j6.x0(null, j6.f29251yh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                b40VarArr[i10].f45582g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{j6.x0(null, j6.Ah, false), j6.x0(null, j6.f29271zh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        b40 b40Var = b40VarArr[yVar.G];
        b40 b40Var2 = yVar.E;
        if (b40Var != b40Var2) {
            yVar.F = b40Var2;
            yVar.E = b40Var;
            if (b40Var2 != null && z10) {
                yVar.H = 0.0f;
            } else {
                yVar.H = 1.0f;
                yVar.F = null;
            }
        }
        yVar.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41051a.P();
        this.f41052b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41051a.R();
        this.f41052b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        b40 b40Var;
        float f10;
        b40 b40Var2;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        v vVar = this.I.f41078a;
        rectF.set(vVar.getX() + vVar.P, vVar.getY() + vVar.O, (vVar.getX() + vVar.getMeasuredWidth()) - vVar.P, vVar.getY() + vVar.getMeasuredHeight() + vVar.O);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f41052b;
        imageReceiver.y0(f11, f12, width, height);
        imageReceiver.J0((int) vVar.f40828b);
        imageReceiver.h(canvas, null);
        float f13 = vVar.f40828b;
        canvas.drawRoundRect(rectF, f13, f13, this.h);
        float f14 = this.f41057r;
        float f15 = this.f41056n;
        if (f14 != f15) {
            float f16 = this.f41058s;
            float f17 = (16.0f * f16) + f15;
            this.f41056n = f17;
            if (f16 > 0.0f) {
                if (f17 > f14) {
                    this.f41056n = f14;
                }
            } else if (f17 < f14) {
                this.f41056n = f14;
            }
        }
        float f18 = this.H;
        if (f18 != 1.0f) {
            if (this.F != null) {
                this.H = f18 + 0.07272727f;
            }
            if (this.H >= 1.0f) {
                this.H = 1.0f;
                this.F = null;
            }
        }
        float f19 = (this.f41056n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f19, f19, this.f41059w, this.f41060x);
        b40 b40Var3 = this.E;
        if (b40Var3 != null) {
            b40Var3.b((int) (this.f41060x - org.telegram.messenger.g0.L(100.0f)), (int) (this.f41059w - org.telegram.messenger.g0.L(100.0f)), org.telegram.messenger.g0.L(200.0f), 16L, this.f41056n);
        }
        float f20 = this.f41056n;
        o9 o9Var = this.f41054e;
        o9Var.e(f20, 1.0f);
        float f21 = this.f41056n;
        o9 o9Var2 = this.d;
        o9Var2.e(f21, 1.0f);
        for (int i7 = 0; i7 < 2; i7++) {
            Paint paint = this.f41055f;
            if (i7 == 0 && (b40Var2 = this.F) != null) {
                paint.setShader(b40Var2.f45582g);
                f10 = 1.0f - this.H;
            } else {
                if (i7 == 1 && (b40Var = this.E) != null) {
                    paint.setShader(b40Var.f45582g);
                    f10 = this.H;
                }
            }
            paint.setAlpha((int) (f10 * 76.0f));
            o9Var.a(this.f41059w, this.f41060x, canvas, paint);
            o9Var2.a(this.f41059w, this.f41060x, canvas, paint);
        }
        canvas.restore();
        float f22 = (this.f41056n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f22, f22, this.f41059w, this.f41060x);
        this.f41051a.h(canvas, null);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        super.onMeasure(i7, i10);
        float L = org.telegram.messenger.g0.L(157.0f);
        this.f41059w = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        if (c40.E5) {
            f10 = 0.0f;
        } else {
            f10 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f41060x = measuredHeight + f10;
        float f11 = L / 2.0f;
        ImageReceiver imageReceiver = this.f41051a;
        imageReceiver.J0((int) f11);
        imageReceiver.y0(this.f41059w - f11, this.f41060x - f11, L, L);
    }

    @Override
    public final void updateColors() {
        try {
            this.f41055f.setColor(i0.a.f(0.0f, j6.x0(null, j6.f28915gh, false), j6.x0(null, j6.f28932hh, false)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
