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
import org.telegram.ui.b50;
public final class q extends View implements k6 {
    public a50 D;
    public a50 E;
    public int F;
    public float G;
    public final r H;
    public final ImageReceiver f31576a;
    public final ImageReceiver f31577b;
    public final r8 f31578c;
    public final m9 d;
    public final m9 e;
    public final Paint f31579f;
    public final Paint h;
    public float f31580n;
    public float f31581r;
    public float f31582s;
    public float f31583w;
    public float f31584x;
    public final a50[] f31585y;

    public q(r rVar, Context context) {
        super(context);
        this.H = rVar;
        this.f31576a = new ImageReceiver(null);
        this.f31577b = new ImageReceiver(null);
        this.f31578c = new r8((p6) null);
        Paint paint = new Paint(1);
        this.f31579f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f31585y = new a50[3];
        this.F = -1;
        this.G = 1.0f;
        m9 m9Var = new m9(9);
        this.d = m9Var;
        m9 m9Var2 = new m9(12);
        this.e = m9Var2;
        m9Var.f28380a = org.telegram.messenger.i0.L(76.0f);
        m9Var.f28381b = org.telegram.messenger.i0.L(92.0f);
        m9Var.b();
        m9Var2.f28380a = org.telegram.messenger.i0.L(80.0f);
        m9Var2.f28381b = org.telegram.messenger.i0.L(95.0f);
        m9Var2.b();
        paint.setColor(i0.b.f(0.0f, t6.x0(null, t6.f20940dh, false), t6.x0(null, t6.f20957eh, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.b.o(-16777216, 127));
    }

    public static void a(q qVar, boolean z10) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        a50[] a50VarArr = qVar.f31585y;
        z zVar = qVar.H.f31617n0;
        if (!zVar.f31790k && ((groupCallParticipant = zVar.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (zVar.e) {
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
        if (a50VarArr[i10] == null) {
            a50VarArr[i10] = new a50(i10);
            int i11 = qVar.F;
            if (i11 == 2) {
                a50VarArr[i11].f35566g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{t6.x0(null, t6.Wh, false), t6.x0(null, t6.Yh, false), t6.x0(null, t6.Xh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                a50VarArr[i11].f35566g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{t6.x0(null, t6.f21234th, false), t6.x0(null, t6.f21269vh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                a50VarArr[i11].f35566g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{t6.x0(null, t6.f21304xh, false), t6.x0(null, t6.f21287wh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        a50 a50Var = a50VarArr[qVar.F];
        a50 a50Var2 = qVar.D;
        if (a50Var != a50Var2) {
            qVar.E = a50Var2;
            qVar.D = a50Var;
            if (a50Var2 != null && z10) {
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
        this.f31576a.P();
        this.f31577b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31576a.R();
        this.f31577b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a50 a50Var;
        float f7;
        a50 a50Var2;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.i0.P;
        n nVar = this.H.f31600a;
        rectF.set(nVar.getX() + nVar.O, nVar.getY() + nVar.N, (nVar.getX() + nVar.getMeasuredWidth()) - nVar.O, nVar.getY() + nVar.getMeasuredHeight() + nVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f31577b;
        imageReceiver.y0(f10, f11, width, height);
        imageReceiver.J0((int) nVar.f31769b);
        imageReceiver.h(canvas, null);
        float f12 = nVar.f31769b;
        canvas.drawRoundRect(rectF, f12, f12, this.h);
        float f13 = this.f31581r;
        float f14 = this.f31580n;
        if (f13 != f14) {
            float f15 = this.f31582s;
            float f16 = (16.0f * f15) + f14;
            this.f31580n = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.f31580n = f13;
                }
            } else if (f16 < f13) {
                this.f31580n = f13;
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
        float f18 = (this.f31580n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.f31583w, this.f31584x);
        a50 a50Var3 = this.D;
        if (a50Var3 != null) {
            a50Var3.b((int) (this.f31584x - org.telegram.messenger.i0.L(100.0f)), (int) (this.f31583w - org.telegram.messenger.i0.L(100.0f)), org.telegram.messenger.i0.L(200.0f), 16L, this.f31580n);
        }
        float f19 = this.f31580n;
        m9 m9Var = this.e;
        m9Var.e(f19, 1.0f);
        float f20 = this.f31580n;
        m9 m9Var2 = this.d;
        m9Var2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f31579f;
            if (i10 == 0 && (a50Var2 = this.E) != null) {
                paint.setShader(a50Var2.f35566g);
                f7 = 1.0f - this.G;
            } else {
                if (i10 == 1 && (a50Var = this.D) != null) {
                    paint.setShader(a50Var.f35566g);
                    f7 = this.G;
                }
            }
            paint.setAlpha((int) (f7 * 76.0f));
            m9Var.a(this.f31583w, this.f31584x, canvas, paint);
            m9Var2.a(this.f31583w, this.f31584x, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.f31580n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.f31583w, this.f31584x);
        this.f31576a.h(canvas, null);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        super.onMeasure(i10, i11);
        float L = org.telegram.messenger.i0.L(157.0f);
        this.f31583w = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        if (b50.f35991w5) {
            f7 = 0.0f;
        } else {
            f7 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f31584x = measuredHeight + f7;
        float f10 = L / 2.0f;
        ImageReceiver imageReceiver = this.f31576a;
        imageReceiver.J0((int) f10);
        imageReceiver.y0(this.f31583w - f10, this.f31584x - f10, L, L);
    }

    @Override
    public final void updateColors() {
        try {
            this.f31579f.setColor(i0.b.f(0.0f, t6.x0(null, t6.f20940dh, false), t6.x0(null, t6.f20957eh, false)));
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
