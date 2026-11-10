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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.v8;
import org.telegram.ui.e40;
import org.telegram.ui.f40;
public final class x extends View implements c6 {
    public e40 D;
    public e40 E;
    public int F;
    public float G;
    public final y H;
    public final ImageReceiver f39610a;
    public final ImageReceiver f39611b;
    public final v8 f39612c;
    public final q9 d;
    public final q9 f39613e;
    public final Paint f39614f;
    public final Paint h;
    public float f39615n;
    public float f39616r;
    public float f39617s;
    public float f39618w;
    public float f39619x;
    public final e40[] f39620y;

    public x(y yVar, Context context) {
        super(context);
        this.H = yVar;
        this.f39610a = new ImageReceiver(null);
        this.f39611b = new ImageReceiver(null);
        this.f39612c = new v8((h6) null);
        Paint paint = new Paint(1);
        this.f39614f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f39620y = new e40[3];
        this.F = -1;
        this.G = 1.0f;
        q9 q9Var = new q9(9);
        this.d = q9Var;
        q9 q9Var2 = new q9(12);
        this.f39613e = q9Var2;
        q9Var.f37178a = org.telegram.messenger.g0.L(76.0f);
        q9Var.f37179b = org.telegram.messenger.g0.L(92.0f);
        q9Var.b();
        q9Var2.f37178a = org.telegram.messenger.g0.L(80.0f);
        q9Var2.f37179b = org.telegram.messenger.g0.L(95.0f);
        q9Var2.b();
        paint.setColor(i0.a.f(0.0f, m6.x0(null, m6.f27900dh, false), m6.x0(null, m6.f27919eh, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.o(-16777216, 127));
    }

    public static void a(x xVar, boolean z9) {
        int i7;
        TLRPC.GroupCallParticipant groupCallParticipant;
        e40[] e40VarArr = xVar.f39620y;
        n0 n0Var = xVar.H.f39654n0;
        if (!n0Var.f39401k && ((groupCallParticipant = n0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (n0Var.f39396e) {
                i7 = 1;
            } else {
                i7 = 0;
            }
        } else {
            i7 = 2;
        }
        if (i7 == xVar.F) {
            return;
        }
        xVar.F = i7;
        if (e40VarArr[i7] == null) {
            e40VarArr[i7] = new e40(i7);
            int i10 = xVar.F;
            if (i10 == 2) {
                e40VarArr[i10].f45131g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{m6.x0(null, m6.Wh, false), m6.x0(null, m6.Yh, false), m6.x0(null, m6.Xh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i10 == 1) {
                e40VarArr[i10].f45131g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{m6.x0(null, m6.f28197th, false), m6.x0(null, m6.f28235vh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                e40VarArr[i10].f45131g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{m6.x0(null, m6.f28273xh, false), m6.x0(null, m6.f28254wh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        e40 e40Var = e40VarArr[xVar.F];
        e40 e40Var2 = xVar.D;
        if (e40Var != e40Var2) {
            xVar.E = e40Var2;
            xVar.D = e40Var;
            if (e40Var2 != null && z9) {
                xVar.G = 0.0f;
            } else {
                xVar.G = 1.0f;
                xVar.E = null;
            }
        }
        xVar.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39610a.P();
        this.f39611b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39610a.R();
        this.f39611b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        e40 e40Var;
        float f10;
        e40 e40Var2;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        u uVar = this.H.f39636a;
        rectF.set(uVar.getX() + uVar.O, uVar.getY() + uVar.N, (uVar.getX() + uVar.getMeasuredWidth()) - uVar.O, uVar.getY() + uVar.getMeasuredHeight() + uVar.N);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f39611b;
        imageReceiver.y0(f11, f12, width, height);
        imageReceiver.J0((int) uVar.f39341b);
        imageReceiver.h(canvas, null);
        float f13 = uVar.f39341b;
        canvas.drawRoundRect(rectF, f13, f13, this.h);
        float f14 = this.f39616r;
        float f15 = this.f39615n;
        if (f14 != f15) {
            float f16 = this.f39617s;
            float f17 = (16.0f * f16) + f15;
            this.f39615n = f17;
            if (f16 > 0.0f) {
                if (f17 > f14) {
                    this.f39615n = f14;
                }
            } else if (f17 < f14) {
                this.f39615n = f14;
            }
        }
        float f18 = this.G;
        if (f18 != 1.0f) {
            if (this.E != null) {
                this.G = f18 + 0.07272727f;
            }
            if (this.G >= 1.0f) {
                this.G = 1.0f;
                this.E = null;
            }
        }
        float f19 = (this.f39615n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f19, f19, this.f39618w, this.f39619x);
        e40 e40Var3 = this.D;
        if (e40Var3 != null) {
            e40Var3.b((int) (this.f39619x - org.telegram.messenger.g0.L(100.0f)), (int) (this.f39618w - org.telegram.messenger.g0.L(100.0f)), org.telegram.messenger.g0.L(200.0f), 16L, this.f39615n);
        }
        float f20 = this.f39615n;
        q9 q9Var = this.f39613e;
        q9Var.e(f20, 1.0f);
        float f21 = this.f39615n;
        q9 q9Var2 = this.d;
        q9Var2.e(f21, 1.0f);
        for (int i7 = 0; i7 < 2; i7++) {
            Paint paint = this.f39614f;
            if (i7 == 0 && (e40Var2 = this.E) != null) {
                paint.setShader(e40Var2.f45131g);
                f10 = 1.0f - this.G;
            } else {
                if (i7 == 1 && (e40Var = this.D) != null) {
                    paint.setShader(e40Var.f45131g);
                    f10 = this.G;
                }
            }
            paint.setAlpha((int) (f10 * 76.0f));
            q9Var.a(this.f39618w, this.f39619x, canvas, paint);
            q9Var2.a(this.f39618w, this.f39619x, canvas, paint);
        }
        canvas.restore();
        float f22 = (this.f39615n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f22, f22, this.f39618w, this.f39619x);
        this.f39610a.h(canvas, null);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        super.onMeasure(i7, i10);
        float L = org.telegram.messenger.g0.L(157.0f);
        this.f39618w = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        if (f40.f45503z5) {
            f10 = 0.0f;
        } else {
            f10 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f39619x = measuredHeight + f10;
        float f11 = L / 2.0f;
        ImageReceiver imageReceiver = this.f39610a;
        imageReceiver.J0((int) f11);
        imageReceiver.y0(this.f39618w - f11, this.f39619x - f11, L, L);
    }

    @Override
    public final void updateColors() {
        try {
            this.f39614f.setColor(i0.a.f(0.0f, m6.x0(null, m6.f27900dh, false), m6.x0(null, m6.f27919eh, false)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
