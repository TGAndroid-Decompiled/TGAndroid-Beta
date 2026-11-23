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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.v9;
import org.telegram.ui.d40;
import org.telegram.ui.e40;
public final class y extends View implements c6 {
    public d40 E;
    public d40 F;
    public int G;
    public float H;
    public final z I;
    public final ImageReceiver f41330a;
    public final ImageReceiver f41331b;
    public final a9 f41332c;
    public final v9 d;
    public final v9 f41333e;
    public final Paint f41334f;
    public final Paint h;
    public float f41335n;
    public float f41336r;
    public float f41337s;
    public float f41338w;
    public float f41339x;
    public final d40[] f41340y;

    public y(z zVar, Context context) {
        super(context);
        this.I = zVar;
        this.f41330a = new ImageReceiver(null);
        this.f41331b = new ImageReceiver(null);
        this.f41332c = new a9((i6) null);
        Paint paint = new Paint(1);
        this.f41334f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f41340y = new d40[3];
        this.G = -1;
        this.H = 1.0f;
        v9 v9Var = new v9(9);
        this.d = v9Var;
        v9 v9Var2 = new v9(12);
        this.f41333e = v9Var2;
        v9Var.f40595a = org.telegram.messenger.g0.L(76.0f);
        v9Var.f40596b = org.telegram.messenger.g0.L(92.0f);
        v9Var.b();
        v9Var2.f40595a = org.telegram.messenger.g0.L(80.0f);
        v9Var2.f40596b = org.telegram.messenger.g0.L(95.0f);
        v9Var2.b();
        paint.setColor(i0.a.f(0.0f, n6.x0(null, n6.f29517gh, false), n6.x0(null, n6.f29534hh, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.o(-16777216, 127));
    }

    public static void a(y yVar, boolean z10) {
        int i7;
        TLRPC.GroupCallParticipant groupCallParticipant;
        d40[] d40VarArr = yVar.f41340y;
        o0 o0Var = yVar.I.f41376o0;
        if (!o0Var.f41100k && ((groupCallParticipant = o0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (o0Var.f41095e) {
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
        if (d40VarArr[i7] == null) {
            d40VarArr[i7] = new d40(i7);
            int i10 = yVar.G;
            if (i10 == 2) {
                d40VarArr[i10].f46950g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{n6.x0(null, n6.Zh, false), n6.x0(null, n6.f29425bi, false), n6.x0(null, n6.f29405ai, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i10 == 1) {
                d40VarArr[i10].f46950g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{n6.x0(null, n6.f29815wh, false), n6.x0(null, n6.f29853yh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                d40VarArr[i10].f46950g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{n6.x0(null, n6.Ah, false), n6.x0(null, n6.f29873zh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        d40 d40Var = d40VarArr[yVar.G];
        d40 d40Var2 = yVar.E;
        if (d40Var != d40Var2) {
            yVar.F = d40Var2;
            yVar.E = d40Var;
            if (d40Var2 != null && z10) {
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
        this.f41330a.Q();
        this.f41331b.Q();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41330a.S();
        this.f41331b.S();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        d40 d40Var;
        float f10;
        d40 d40Var2;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        v vVar = this.I.f41357a;
        rectF.set(vVar.getX() + vVar.P, vVar.getY() + vVar.O, (vVar.getX() + vVar.getMeasuredWidth()) - vVar.P, vVar.getY() + vVar.getMeasuredHeight() + vVar.O);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f41331b;
        imageReceiver.z0(f11, f12, width, height);
        imageReceiver.K0((int) vVar.f41108b);
        imageReceiver.h(canvas, null);
        float f13 = vVar.f41108b;
        canvas.drawRoundRect(rectF, f13, f13, this.h);
        float f14 = this.f41336r;
        float f15 = this.f41335n;
        if (f14 != f15) {
            float f16 = this.f41337s;
            float f17 = (16.0f * f16) + f15;
            this.f41335n = f17;
            if (f16 > 0.0f) {
                if (f17 > f14) {
                    this.f41335n = f14;
                }
            } else if (f17 < f14) {
                this.f41335n = f14;
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
        float f19 = (this.f41335n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f19, f19, this.f41338w, this.f41339x);
        d40 d40Var3 = this.E;
        if (d40Var3 != null) {
            d40Var3.b((int) (this.f41339x - org.telegram.messenger.g0.L(100.0f)), (int) (this.f41338w - org.telegram.messenger.g0.L(100.0f)), org.telegram.messenger.g0.L(200.0f), 16L, this.f41335n);
        }
        float f20 = this.f41335n;
        v9 v9Var = this.f41333e;
        v9Var.e(f20, 1.0f);
        float f21 = this.f41335n;
        v9 v9Var2 = this.d;
        v9Var2.e(f21, 1.0f);
        for (int i7 = 0; i7 < 2; i7++) {
            Paint paint = this.f41334f;
            if (i7 == 0 && (d40Var2 = this.F) != null) {
                paint.setShader(d40Var2.f46950g);
                f10 = 1.0f - this.H;
            } else {
                if (i7 == 1 && (d40Var = this.E) != null) {
                    paint.setShader(d40Var.f46950g);
                    f10 = this.H;
                }
            }
            paint.setAlpha((int) (f10 * 76.0f));
            v9Var.a(this.f41338w, this.f41339x, canvas, paint);
            v9Var2.a(this.f41338w, this.f41339x, canvas, paint);
        }
        canvas.restore();
        float f22 = (this.f41335n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f22, f22, this.f41338w, this.f41339x);
        this.f41330a.h(canvas, null);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        super.onMeasure(i7, i10);
        float L = org.telegram.messenger.g0.L(157.0f);
        this.f41338w = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        if (e40.E5) {
            f10 = 0.0f;
        } else {
            f10 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f41339x = measuredHeight + f10;
        float f11 = L / 2.0f;
        ImageReceiver imageReceiver = this.f41330a;
        imageReceiver.K0((int) f11);
        imageReceiver.z0(this.f41338w - f11, this.f41339x - f11, L, L);
    }

    @Override
    public final void updateColors() {
        try {
            this.f41334f.setColor(i0.a.f(0.0f, n6.x0(null, n6.f29517gh, false), n6.x0(null, n6.f29534hh, false)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
