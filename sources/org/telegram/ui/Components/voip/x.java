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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.e40;
import org.telegram.ui.f40;
public final class x extends View implements b6 {
    public e40 E;
    public e40 F;
    public int G;
    public float H;
    public final y I;
    public final ImageReceiver f41434a;
    public final ImageReceiver f41435b;
    public final b9 f41436c;
    public final w9 d;
    public final w9 f41437e;
    public final Paint f41438f;
    public final Paint h;
    public float f41439n;
    public float f41440r;
    public float f41441s;
    public float f41442w;
    public float f41443x;
    public final e40[] f41444y;

    public x(y yVar, Context context) {
        super(context);
        this.I = yVar;
        this.f41434a = new ImageReceiver(null);
        this.f41435b = new ImageReceiver(null);
        this.f41436c = new b9((h6) null);
        Paint paint = new Paint(1);
        this.f41438f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f41444y = new e40[3];
        this.G = -1;
        this.H = 1.0f;
        w9 w9Var = new w9(9);
        this.d = w9Var;
        w9 w9Var2 = new w9(12);
        this.f41437e = w9Var2;
        w9Var.f41712a = org.telegram.messenger.g0.L(76.0f);
        w9Var.f41713b = org.telegram.messenger.g0.L(92.0f);
        w9Var.b();
        w9Var2.f41712a = org.telegram.messenger.g0.L(80.0f);
        w9Var2.f41713b = org.telegram.messenger.g0.L(95.0f);
        w9Var2.b();
        paint.setColor(i0.a.f(0.0f, m6.x0(null, m6.f29447gh, false), m6.x0(null, m6.f29464hh, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.o(-16777216, 127));
    }

    public static void a(x xVar, boolean z10) {
        int i7;
        TLRPC.GroupCallParticipant groupCallParticipant;
        e40[] e40VarArr = xVar.f41444y;
        n0 n0Var = xVar.I.f41480o0;
        if (!n0Var.f41204k && ((groupCallParticipant = n0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (n0Var.f41199e) {
                i7 = 1;
            } else {
                i7 = 0;
            }
        } else {
            i7 = 2;
        }
        if (i7 == xVar.G) {
            return;
        }
        xVar.G = i7;
        if (e40VarArr[i7] == null) {
            e40VarArr[i7] = new e40(i7);
            int i10 = xVar.G;
            if (i10 == 2) {
                e40VarArr[i10].f47139g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{m6.x0(null, m6.Zh, false), m6.x0(null, m6.f29355bi, false), m6.x0(null, m6.f29335ai, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i10 == 1) {
                e40VarArr[i10].f47139g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{m6.x0(null, m6.f29745wh, false), m6.x0(null, m6.f29783yh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                e40VarArr[i10].f47139g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{m6.x0(null, m6.Ah, false), m6.x0(null, m6.f29803zh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        e40 e40Var = e40VarArr[xVar.G];
        e40 e40Var2 = xVar.E;
        if (e40Var != e40Var2) {
            xVar.F = e40Var2;
            xVar.E = e40Var;
            if (e40Var2 != null && z10) {
                xVar.H = 0.0f;
            } else {
                xVar.H = 1.0f;
                xVar.F = null;
            }
        }
        xVar.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41434a.P();
        this.f41435b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41434a.R();
        this.f41435b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        e40 e40Var;
        float f10;
        e40 e40Var2;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        u uVar = this.I.f41461a;
        rectF.set(uVar.getX() + uVar.P, uVar.getY() + uVar.O, (uVar.getX() + uVar.getMeasuredWidth()) - uVar.P, uVar.getY() + uVar.getMeasuredHeight() + uVar.O);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f41435b;
        imageReceiver.y0(f11, f12, width, height);
        imageReceiver.J0((int) uVar.f41212b);
        imageReceiver.h(canvas, null);
        float f13 = uVar.f41212b;
        canvas.drawRoundRect(rectF, f13, f13, this.h);
        float f14 = this.f41440r;
        float f15 = this.f41439n;
        if (f14 != f15) {
            float f16 = this.f41441s;
            float f17 = (16.0f * f16) + f15;
            this.f41439n = f17;
            if (f16 > 0.0f) {
                if (f17 > f14) {
                    this.f41439n = f14;
                }
            } else if (f17 < f14) {
                this.f41439n = f14;
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
        float f19 = (this.f41439n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f19, f19, this.f41442w, this.f41443x);
        e40 e40Var3 = this.E;
        if (e40Var3 != null) {
            e40Var3.b((int) (this.f41443x - org.telegram.messenger.g0.L(100.0f)), (int) (this.f41442w - org.telegram.messenger.g0.L(100.0f)), org.telegram.messenger.g0.L(200.0f), 16L, this.f41439n);
        }
        float f20 = this.f41439n;
        w9 w9Var = this.f41437e;
        w9Var.e(f20, 1.0f);
        float f21 = this.f41439n;
        w9 w9Var2 = this.d;
        w9Var2.e(f21, 1.0f);
        for (int i7 = 0; i7 < 2; i7++) {
            Paint paint = this.f41438f;
            if (i7 == 0 && (e40Var2 = this.F) != null) {
                paint.setShader(e40Var2.f47139g);
                f10 = 1.0f - this.H;
            } else {
                if (i7 == 1 && (e40Var = this.E) != null) {
                    paint.setShader(e40Var.f47139g);
                    f10 = this.H;
                }
            }
            paint.setAlpha((int) (f10 * 76.0f));
            w9Var.a(this.f41442w, this.f41443x, canvas, paint);
            w9Var2.a(this.f41442w, this.f41443x, canvas, paint);
        }
        canvas.restore();
        float f22 = (this.f41439n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f22, f22, this.f41442w, this.f41443x);
        this.f41434a.h(canvas, null);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        super.onMeasure(i7, i10);
        float L = org.telegram.messenger.g0.L(157.0f);
        this.f41442w = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        if (f40.E5) {
            f10 = 0.0f;
        } else {
            f10 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f41443x = measuredHeight + f10;
        float f11 = L / 2.0f;
        ImageReceiver imageReceiver = this.f41434a;
        imageReceiver.J0((int) f11);
        imageReceiver.y0(this.f41442w - f11, this.f41443x - f11, L, L);
    }

    @Override
    public final void updateColors() {
        try {
            this.f41438f.setColor(i0.a.f(0.0f, m6.x0(null, m6.f29447gh, false), m6.x0(null, m6.f29464hh, false)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
