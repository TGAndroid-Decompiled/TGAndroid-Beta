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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.r9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.d40;
import org.telegram.ui.e40;
public final class x extends View implements b6 {
    public d40 D;
    public d40 E;
    public int F;
    public float G;
    public final y H;
    public final ImageReceiver f39689a;
    public final ImageReceiver f39690b;
    public final w8 f39691c;
    public final r9 d;
    public final r9 f39692e;
    public final Paint f39693f;
    public final Paint h;
    public float f39694n;
    public float f39695r;
    public float f39696s;
    public float f39697w;
    public float f39698x;
    public final d40[] f39699y;

    public x(y yVar, Context context) {
        super(context);
        this.H = yVar;
        this.f39689a = new ImageReceiver(null);
        this.f39690b = new ImageReceiver(null);
        this.f39691c = new w8((g6) null);
        Paint paint = new Paint(1);
        this.f39693f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f39699y = new d40[3];
        this.F = -1;
        this.G = 1.0f;
        r9 r9Var = new r9(9);
        this.d = r9Var;
        r9 r9Var2 = new r9(12);
        this.f39692e = r9Var2;
        r9Var.f37587a = org.telegram.messenger.g0.L(76.0f);
        r9Var.f37588b = org.telegram.messenger.g0.L(92.0f);
        r9Var.b();
        r9Var2.f37587a = org.telegram.messenger.g0.L(80.0f);
        r9Var2.f37588b = org.telegram.messenger.g0.L(95.0f);
        r9Var2.b();
        paint.setColor(i0.a.f(0.0f, l6.x0(null, l6.f27875dh, false), l6.x0(null, l6.f27894eh, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.o(-16777216, 127));
    }

    public static void a(x xVar, boolean z9) {
        int i7;
        TLRPC.GroupCallParticipant groupCallParticipant;
        d40[] d40VarArr = xVar.f39699y;
        n0 n0Var = xVar.H.f39732n0;
        if (!n0Var.f39481k && ((groupCallParticipant = n0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (n0Var.f39476e) {
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
        if (d40VarArr[i7] == null) {
            d40VarArr[i7] = new d40(i7);
            int i10 = xVar.F;
            if (i10 == 2) {
                d40VarArr[i10].f44820g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{l6.x0(null, l6.Wh, false), l6.x0(null, l6.Yh, false), l6.x0(null, l6.Xh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i10 == 1) {
                d40VarArr[i10].f44820g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{l6.x0(null, l6.f28172th, false), l6.x0(null, l6.f28210vh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                d40VarArr[i10].f44820g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{l6.x0(null, l6.f28248xh, false), l6.x0(null, l6.f28229wh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        d40 d40Var = d40VarArr[xVar.F];
        d40 d40Var2 = xVar.D;
        if (d40Var != d40Var2) {
            xVar.E = d40Var2;
            xVar.D = d40Var;
            if (d40Var2 != null && z9) {
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
        this.f39689a.P();
        this.f39690b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39689a.R();
        this.f39690b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        d40 d40Var;
        float f10;
        d40 d40Var2;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        u uVar = this.H.f39714a;
        rectF.set(uVar.getX() + uVar.O, uVar.getY() + uVar.N, (uVar.getX() + uVar.getMeasuredWidth()) - uVar.O, uVar.getY() + uVar.getMeasuredHeight() + uVar.N);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f39690b;
        imageReceiver.y0(f11, f12, width, height);
        imageReceiver.J0((int) uVar.f39421b);
        imageReceiver.h(canvas, null);
        float f13 = uVar.f39421b;
        canvas.drawRoundRect(rectF, f13, f13, this.h);
        float f14 = this.f39695r;
        float f15 = this.f39694n;
        if (f14 != f15) {
            float f16 = this.f39696s;
            float f17 = (16.0f * f16) + f15;
            this.f39694n = f17;
            if (f16 > 0.0f) {
                if (f17 > f14) {
                    this.f39694n = f14;
                }
            } else if (f17 < f14) {
                this.f39694n = f14;
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
        float f19 = (this.f39694n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f19, f19, this.f39697w, this.f39698x);
        d40 d40Var3 = this.D;
        if (d40Var3 != null) {
            d40Var3.b((int) (this.f39698x - org.telegram.messenger.g0.L(100.0f)), (int) (this.f39697w - org.telegram.messenger.g0.L(100.0f)), org.telegram.messenger.g0.L(200.0f), 16L, this.f39694n);
        }
        float f20 = this.f39694n;
        r9 r9Var = this.f39692e;
        r9Var.e(f20, 1.0f);
        float f21 = this.f39694n;
        r9 r9Var2 = this.d;
        r9Var2.e(f21, 1.0f);
        for (int i7 = 0; i7 < 2; i7++) {
            Paint paint = this.f39693f;
            if (i7 == 0 && (d40Var2 = this.E) != null) {
                paint.setShader(d40Var2.f44820g);
                f10 = 1.0f - this.G;
            } else {
                if (i7 == 1 && (d40Var = this.D) != null) {
                    paint.setShader(d40Var.f44820g);
                    f10 = this.G;
                }
            }
            paint.setAlpha((int) (f10 * 76.0f));
            r9Var.a(this.f39697w, this.f39698x, canvas, paint);
            r9Var2.a(this.f39697w, this.f39698x, canvas, paint);
        }
        canvas.restore();
        float f22 = (this.f39694n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f22, f22, this.f39697w, this.f39698x);
        this.f39689a.h(canvas, null);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        super.onMeasure(i7, i10);
        float L = org.telegram.messenger.g0.L(157.0f);
        this.f39697w = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        if (e40.f45184w5) {
            f10 = 0.0f;
        } else {
            f10 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f39698x = measuredHeight + f10;
        float f11 = L / 2.0f;
        ImageReceiver imageReceiver = this.f39689a;
        imageReceiver.J0((int) f11);
        imageReceiver.y0(this.f39697w - f11, this.f39698x - f11, L, L);
    }

    @Override
    public final void updateColors() {
        try {
            this.f39693f.setColor(i0.a.f(0.0f, l6.x0(null, l6.f27875dh, false), l6.x0(null, l6.f27894eh, false)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
