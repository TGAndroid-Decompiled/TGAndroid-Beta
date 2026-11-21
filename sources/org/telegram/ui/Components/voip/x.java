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
    public final ImageReceiver f41433a;
    public final ImageReceiver f41434b;
    public final b9 f41435c;
    public final w9 d;
    public final w9 f41436e;
    public final Paint f41437f;
    public final Paint h;
    public float f41438n;
    public float f41439r;
    public float f41440s;
    public float f41441w;
    public float f41442x;
    public final e40[] f41443y;

    public x(y yVar, Context context) {
        super(context);
        this.I = yVar;
        this.f41433a = new ImageReceiver(null);
        this.f41434b = new ImageReceiver(null);
        this.f41435c = new b9((h6) null);
        Paint paint = new Paint(1);
        this.f41437f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f41443y = new e40[3];
        this.G = -1;
        this.H = 1.0f;
        w9 w9Var = new w9(9);
        this.d = w9Var;
        w9 w9Var2 = new w9(12);
        this.f41436e = w9Var2;
        w9Var.f41719a = org.telegram.messenger.g0.L(76.0f);
        w9Var.f41720b = org.telegram.messenger.g0.L(92.0f);
        w9Var.b();
        w9Var2.f41719a = org.telegram.messenger.g0.L(80.0f);
        w9Var2.f41720b = org.telegram.messenger.g0.L(95.0f);
        w9Var2.b();
        paint.setColor(i0.a.f(0.0f, m6.x0(null, m6.f29444gh, false), m6.x0(null, m6.f29461hh, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.o(-16777216, 127));
    }

    public static void a(x xVar, boolean z10) {
        int i7;
        TLRPC.GroupCallParticipant groupCallParticipant;
        e40[] e40VarArr = xVar.f41443y;
        n0 n0Var = xVar.I.f41479o0;
        if (!n0Var.f41203k && ((groupCallParticipant = n0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (n0Var.f41198e) {
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
                e40VarArr[i10].f47135g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{m6.x0(null, m6.Zh, false), m6.x0(null, m6.f29352bi, false), m6.x0(null, m6.f29332ai, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i10 == 1) {
                e40VarArr[i10].f47135g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{m6.x0(null, m6.f29742wh, false), m6.x0(null, m6.f29780yh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                e40VarArr[i10].f47135g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{m6.x0(null, m6.Ah, false), m6.x0(null, m6.f29800zh, false)}, (float[]) null, Shader.TileMode.CLAMP);
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
        this.f41433a.P();
        this.f41434b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41433a.R();
        this.f41434b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        e40 e40Var;
        float f10;
        e40 e40Var2;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        u uVar = this.I.f41460a;
        rectF.set(uVar.getX() + uVar.P, uVar.getY() + uVar.O, (uVar.getX() + uVar.getMeasuredWidth()) - uVar.P, uVar.getY() + uVar.getMeasuredHeight() + uVar.O);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f41434b;
        imageReceiver.y0(f11, f12, width, height);
        imageReceiver.J0((int) uVar.f41211b);
        imageReceiver.h(canvas, null);
        float f13 = uVar.f41211b;
        canvas.drawRoundRect(rectF, f13, f13, this.h);
        float f14 = this.f41439r;
        float f15 = this.f41438n;
        if (f14 != f15) {
            float f16 = this.f41440s;
            float f17 = (16.0f * f16) + f15;
            this.f41438n = f17;
            if (f16 > 0.0f) {
                if (f17 > f14) {
                    this.f41438n = f14;
                }
            } else if (f17 < f14) {
                this.f41438n = f14;
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
        float f19 = (this.f41438n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f19, f19, this.f41441w, this.f41442x);
        e40 e40Var3 = this.E;
        if (e40Var3 != null) {
            e40Var3.b((int) (this.f41442x - org.telegram.messenger.g0.L(100.0f)), (int) (this.f41441w - org.telegram.messenger.g0.L(100.0f)), org.telegram.messenger.g0.L(200.0f), 16L, this.f41438n);
        }
        float f20 = this.f41438n;
        w9 w9Var = this.f41436e;
        w9Var.e(f20, 1.0f);
        float f21 = this.f41438n;
        w9 w9Var2 = this.d;
        w9Var2.e(f21, 1.0f);
        for (int i7 = 0; i7 < 2; i7++) {
            Paint paint = this.f41437f;
            if (i7 == 0 && (e40Var2 = this.F) != null) {
                paint.setShader(e40Var2.f47135g);
                f10 = 1.0f - this.H;
            } else {
                if (i7 == 1 && (e40Var = this.E) != null) {
                    paint.setShader(e40Var.f47135g);
                    f10 = this.H;
                }
            }
            paint.setAlpha((int) (f10 * 76.0f));
            w9Var.a(this.f41441w, this.f41442x, canvas, paint);
            w9Var2.a(this.f41441w, this.f41442x, canvas, paint);
        }
        canvas.restore();
        float f22 = (this.f41438n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f22, f22, this.f41441w, this.f41442x);
        this.f41433a.h(canvas, null);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        super.onMeasure(i7, i10);
        float L = org.telegram.messenger.g0.L(157.0f);
        this.f41441w = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        if (f40.E5) {
            f10 = 0.0f;
        } else {
            f10 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f41442x = measuredHeight + f10;
        float f11 = L / 2.0f;
        ImageReceiver imageReceiver = this.f41433a;
        imageReceiver.J0((int) f11);
        imageReceiver.y0(this.f41441w - f11, this.f41442x - f11, L, L);
    }

    @Override
    public final void updateColors() {
        try {
            this.f41437f.setColor(i0.a.f(0.0f, m6.x0(null, m6.f29444gh, false), m6.x0(null, m6.f29461hh, false)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
