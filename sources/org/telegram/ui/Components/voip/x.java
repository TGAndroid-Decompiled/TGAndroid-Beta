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
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.r9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.b40;
import org.telegram.ui.c40;
public final class x extends View implements a6 {
    public b40 D;
    public b40 E;
    public int F;
    public float G;
    public final y H;
    public final ImageReceiver f39547a;
    public final ImageReceiver f39548b;
    public final w8 f39549c;
    public final r9 d;
    public final r9 f39550e;
    public final Paint f39551f;
    public final Paint h;
    public float f39552n;
    public float f39553r;
    public float f39554s;
    public float f39555w;
    public float f39556x;
    public final b40[] f39557y;

    public x(y yVar, Context context) {
        super(context);
        this.H = yVar;
        this.f39547a = new ImageReceiver(null);
        this.f39548b = new ImageReceiver(null);
        this.f39549c = new w8((f6) null);
        Paint paint = new Paint(1);
        this.f39551f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f39557y = new b40[3];
        this.F = -1;
        this.G = 1.0f;
        r9 r9Var = new r9(9);
        this.d = r9Var;
        r9 r9Var2 = new r9(12);
        this.f39550e = r9Var2;
        r9Var.f37649a = org.telegram.messenger.g0.L(76.0f);
        r9Var.f37650b = org.telegram.messenger.g0.L(92.0f);
        r9Var.b();
        r9Var2.f37649a = org.telegram.messenger.g0.L(80.0f);
        r9Var2.f37650b = org.telegram.messenger.g0.L(95.0f);
        r9Var2.b();
        paint.setColor(i0.a.f(0.0f, k6.x0(null, k6.f27858dh, false), k6.x0(null, k6.f27877eh, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.o(-16777216, 127));
    }

    public static void a(x xVar, boolean z9) {
        int i7;
        TLRPC.GroupCallParticipant groupCallParticipant;
        b40[] b40VarArr = xVar.f39557y;
        n0 n0Var = xVar.H.f39590n0;
        if (!n0Var.f39339k && ((groupCallParticipant = n0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (n0Var.f39334e) {
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
        if (b40VarArr[i7] == null) {
            b40VarArr[i7] = new b40(i7);
            int i10 = xVar.F;
            if (i10 == 2) {
                b40VarArr[i10].f44163g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{k6.x0(null, k6.Wh, false), k6.x0(null, k6.Yh, false), k6.x0(null, k6.Xh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i10 == 1) {
                b40VarArr[i10].f44163g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{k6.x0(null, k6.f28155th, false), k6.x0(null, k6.f28193vh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                b40VarArr[i10].f44163g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{k6.x0(null, k6.f28231xh, false), k6.x0(null, k6.f28212wh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        b40 b40Var = b40VarArr[xVar.F];
        b40 b40Var2 = xVar.D;
        if (b40Var != b40Var2) {
            xVar.E = b40Var2;
            xVar.D = b40Var;
            if (b40Var2 != null && z9) {
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
        this.f39547a.P();
        this.f39548b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39547a.R();
        this.f39548b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        b40 b40Var;
        float f10;
        b40 b40Var2;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        u uVar = this.H.f39572a;
        rectF.set(uVar.getX() + uVar.O, uVar.getY() + uVar.N, (uVar.getX() + uVar.getMeasuredWidth()) - uVar.O, uVar.getY() + uVar.getMeasuredHeight() + uVar.N);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f39548b;
        imageReceiver.y0(f11, f12, width, height);
        imageReceiver.J0((int) uVar.f39279b);
        imageReceiver.h(canvas, null);
        float f13 = uVar.f39279b;
        canvas.drawRoundRect(rectF, f13, f13, this.h);
        float f14 = this.f39553r;
        float f15 = this.f39552n;
        if (f14 != f15) {
            float f16 = this.f39554s;
            float f17 = (16.0f * f16) + f15;
            this.f39552n = f17;
            if (f16 > 0.0f) {
                if (f17 > f14) {
                    this.f39552n = f14;
                }
            } else if (f17 < f14) {
                this.f39552n = f14;
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
        float f19 = (this.f39552n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f19, f19, this.f39555w, this.f39556x);
        b40 b40Var3 = this.D;
        if (b40Var3 != null) {
            b40Var3.b((int) (this.f39556x - org.telegram.messenger.g0.L(100.0f)), (int) (this.f39555w - org.telegram.messenger.g0.L(100.0f)), org.telegram.messenger.g0.L(200.0f), 16L, this.f39552n);
        }
        float f20 = this.f39552n;
        r9 r9Var = this.f39550e;
        r9Var.e(f20, 1.0f);
        float f21 = this.f39552n;
        r9 r9Var2 = this.d;
        r9Var2.e(f21, 1.0f);
        for (int i7 = 0; i7 < 2; i7++) {
            Paint paint = this.f39551f;
            if (i7 == 0 && (b40Var2 = this.E) != null) {
                paint.setShader(b40Var2.f44163g);
                f10 = 1.0f - this.G;
            } else {
                if (i7 == 1 && (b40Var = this.D) != null) {
                    paint.setShader(b40Var.f44163g);
                    f10 = this.G;
                }
            }
            paint.setAlpha((int) (f10 * 76.0f));
            r9Var.a(this.f39555w, this.f39556x, canvas, paint);
            r9Var2.a(this.f39555w, this.f39556x, canvas, paint);
        }
        canvas.restore();
        float f22 = (this.f39552n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f22, f22, this.f39555w, this.f39556x);
        this.f39547a.h(canvas, null);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        super.onMeasure(i7, i10);
        float L = org.telegram.messenger.g0.L(157.0f);
        this.f39555w = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        if (c40.f44521w5) {
            f10 = 0.0f;
        } else {
            f10 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f39556x = measuredHeight + f10;
        float f11 = L / 2.0f;
        ImageReceiver imageReceiver = this.f39547a;
        imageReceiver.J0((int) f11);
        imageReceiver.y0(this.f39555w - f11, this.f39556x - f11, L, L);
    }

    @Override
    public final void updateColors() {
        try {
            this.f39551f.setColor(i0.a.f(0.0f, k6.x0(null, k6.f27858dh, false), k6.x0(null, k6.f27877eh, false)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
