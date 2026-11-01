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
import org.telegram.messenger.f8;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.r8;
import org.telegram.ui.a50;
import org.telegram.ui.z40;
public final class q extends View implements k6 {
    public z40 D;
    public z40 E;
    public int F;
    public float G;
    public final r H;
    public final ImageReceiver f31650a;
    public final ImageReceiver f31651b;
    public final r8 f31652c;
    public final m9 d;
    public final m9 e;
    public final Paint f31653f;
    public final Paint h;
    public float f31654n;
    public float f31655r;
    public float f31656s;
    public float f31657w;
    public float f31658x;
    public final z40[] f31659y;

    public q(r rVar, Context context) {
        super(context);
        this.H = rVar;
        this.f31650a = new ImageReceiver(null);
        this.f31651b = new ImageReceiver(null);
        this.f31652c = new r8((p6) null);
        Paint paint = new Paint(1);
        this.f31653f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f31659y = new z40[3];
        this.F = -1;
        this.G = 1.0f;
        m9 m9Var = new m9(9);
        this.d = m9Var;
        m9 m9Var2 = new m9(12);
        this.e = m9Var2;
        m9Var.f28417a = org.telegram.messenger.i0.L(76.0f);
        m9Var.f28418b = org.telegram.messenger.i0.L(92.0f);
        m9Var.b();
        m9Var2.f28417a = org.telegram.messenger.i0.L(80.0f);
        m9Var2.f28418b = org.telegram.messenger.i0.L(95.0f);
        m9Var2.b();
        paint.setColor(i0.b.f(0.0f, t6.x0(null, t6.f20941dh, false), t6.x0(null, t6.f20958eh, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.b.o(-16777216, 127));
    }

    public static void a(q qVar, boolean z10) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        z40[] z40VarArr = qVar.f31659y;
        a0 a0Var = qVar.H.f31680n0;
        if (!a0Var.f31370k && ((groupCallParticipant = a0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (a0Var.e) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 2;
        }
        if (i10 == qVar.F) {
            return;
        }
        qVar.F = i10;
        if (z40VarArr[i10] == null) {
            z40VarArr[i10] = new z40(i10);
            int i11 = qVar.F;
            if (i11 == 2) {
                z40VarArr[i11].f43818g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{t6.x0(null, t6.Wh, false), t6.x0(null, t6.Yh, false), t6.x0(null, t6.Xh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                z40VarArr[i11].f43818g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{t6.x0(null, t6.f21235th, false), t6.x0(null, t6.f21270vh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                z40VarArr[i11].f43818g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{t6.x0(null, t6.f21305xh, false), t6.x0(null, t6.f21288wh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        z40 z40Var = z40VarArr[qVar.F];
        z40 z40Var2 = qVar.D;
        if (z40Var != z40Var2) {
            qVar.E = z40Var2;
            qVar.D = z40Var;
            if (z40Var2 != null && z10) {
                qVar.G = 0.0f;
            } else {
                qVar.G = 1.0f;
                qVar.E = null;
            }
        }
        qVar.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31650a.P();
        this.f31651b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31650a.R();
        this.f31651b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        z40 z40Var;
        float f7;
        z40 z40Var2;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.i0.P;
        n nVar = this.H.f31663a;
        rectF.set(nVar.getX() + nVar.O, nVar.getY() + nVar.N, (nVar.getX() + nVar.getMeasuredWidth()) - nVar.O, nVar.getY() + nVar.getMeasuredHeight() + nVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f31651b;
        imageReceiver.y0(f10, f11, width, height);
        imageReceiver.J0((int) nVar.f31849b);
        imageReceiver.h(canvas, null);
        float f12 = nVar.f31849b;
        canvas.drawRoundRect(rectF, f12, f12, this.h);
        float f13 = this.f31655r;
        float f14 = this.f31654n;
        if (f13 != f14) {
            float f15 = this.f31656s;
            float f16 = (16.0f * f15) + f14;
            this.f31654n = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.f31654n = f13;
                }
            } else if (f16 < f13) {
                this.f31654n = f13;
            }
        }
        float f17 = this.G;
        if (f17 != 1.0f) {
            if (this.E != null) {
                this.G = f17 + 0.07272727f;
            }
            if (this.G >= 1.0f) {
                this.G = 1.0f;
                this.E = null;
            }
        }
        float f18 = (this.f31654n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.f31657w, this.f31658x);
        z40 z40Var3 = this.D;
        if (z40Var3 != null) {
            z40Var3.b((int) (this.f31658x - org.telegram.messenger.i0.L(100.0f)), (int) (this.f31657w - org.telegram.messenger.i0.L(100.0f)), org.telegram.messenger.i0.L(200.0f), 16L, this.f31654n);
        }
        float f19 = this.f31654n;
        m9 m9Var = this.e;
        m9Var.e(f19, 1.0f);
        float f20 = this.f31654n;
        m9 m9Var2 = this.d;
        m9Var2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f31653f;
            if (i10 == 0 && (z40Var2 = this.E) != null) {
                paint.setShader(z40Var2.f43818g);
                f7 = 1.0f - this.G;
            } else {
                if (i10 == 1 && (z40Var = this.D) != null) {
                    paint.setShader(z40Var.f43818g);
                    f7 = this.G;
                }
            }
            paint.setAlpha((int) (f7 * 76.0f));
            m9Var.a(this.f31657w, this.f31658x, canvas, paint);
            m9Var2.a(this.f31657w, this.f31658x, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.f31654n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.f31657w, this.f31658x);
        this.f31650a.h(canvas, null);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        super.onMeasure(i10, i11);
        float L = org.telegram.messenger.i0.L(157.0f);
        this.f31657w = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        if (a50.f35575w5) {
            f7 = 0.0f;
        } else {
            f7 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f31658x = measuredHeight + f7;
        float f10 = L / 2.0f;
        ImageReceiver imageReceiver = this.f31650a;
        imageReceiver.J0((int) f10);
        imageReceiver.y0(this.f31657w - f10, this.f31658x - f10, L, L);
    }

    @Override
    public final void updateColors() {
        try {
            this.f31653f.setColor(i0.b.f(0.0f, t6.x0(null, t6.f20941dh, false), t6.x0(null, t6.f20958eh, false)));
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
