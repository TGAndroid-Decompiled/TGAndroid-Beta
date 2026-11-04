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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.w30;
import org.telegram.ui.x30;
public final class q extends View implements z5 {
    public w30 E;
    public w30 F;
    public int G;
    public float H;
    public final r I;
    public final ImageReceiver f39527a;
    public final ImageReceiver f39528b;
    public final u8 f39529c;
    public final q9 d;
    public final q9 f39530e;
    public final Paint f39531f;
    public final Paint h;
    public float f39532n;
    public float f39533r;
    public float f39534s;
    public float f39535w;
    public float f39536x;
    public final w30[] f39537y;

    public q(r rVar, Context context) {
        super(context);
        this.I = rVar;
        this.f39527a = new ImageReceiver(null);
        this.f39528b = new ImageReceiver(null);
        this.f39529c = new u8((e6) null);
        Paint paint = new Paint(1);
        this.f39531f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f39537y = new w30[3];
        this.G = -1;
        this.H = 1.0f;
        q9 q9Var = new q9(9);
        this.d = q9Var;
        q9 q9Var2 = new q9(12);
        this.f39530e = q9Var2;
        q9Var.f37381a = org.telegram.messenger.g0.L(76.0f);
        q9Var.f37382b = org.telegram.messenger.g0.L(92.0f);
        q9Var.b();
        q9Var2.f37381a = org.telegram.messenger.g0.L(80.0f);
        q9Var2.f37382b = org.telegram.messenger.g0.L(95.0f);
        q9Var2.b();
        paint.setColor(i0.a.f(0.0f, k6.x0(null, k6.f27889dh, false), k6.x0(null, k6.f27908eh, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.o(-16777216, 127));
    }

    public static void a(q qVar, boolean z10) {
        int i3;
        TLRPC.GroupCallParticipant groupCallParticipant;
        w30[] w30VarArr = qVar.f39537y;
        a0 a0Var = qVar.I.f39565o0;
        if (!a0Var.f39214k && ((groupCallParticipant = a0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (a0Var.f39209e) {
                i3 = 1;
            } else {
                i3 = 0;
            }
        } else {
            i3 = 2;
        }
        if (i3 == qVar.G) {
            return;
        }
        qVar.G = i3;
        if (w30VarArr[i3] == null) {
            w30VarArr[i3] = new w30(i3);
            int i10 = qVar.G;
            if (i10 == 2) {
                w30VarArr[i10].f50688g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{k6.x0(null, k6.Wh, false), k6.x0(null, k6.Yh, false), k6.x0(null, k6.Xh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i10 == 1) {
                w30VarArr[i10].f50688g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{k6.x0(null, k6.f28187th, false), k6.x0(null, k6.f28225vh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                w30VarArr[i10].f50688g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{k6.x0(null, k6.f28264xh, false), k6.x0(null, k6.f28245wh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        w30 w30Var = w30VarArr[qVar.G];
        w30 w30Var2 = qVar.E;
        if (w30Var != w30Var2) {
            qVar.F = w30Var2;
            qVar.E = w30Var;
            if (w30Var2 != null && z10) {
                qVar.H = 0.0f;
            } else {
                qVar.H = 1.0f;
                qVar.F = null;
            }
        }
        qVar.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39527a.P();
        this.f39528b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39527a.R();
        this.f39528b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        w30 w30Var;
        float f10;
        w30 w30Var2;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        n nVar = this.I.f39546a;
        rectF.set(nVar.getX() + nVar.P, nVar.getY() + nVar.O, (nVar.getX() + nVar.getMeasuredWidth()) - nVar.P, nVar.getY() + nVar.getMeasuredHeight() + nVar.O);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f39528b;
        imageReceiver.y0(f11, f12, width, height);
        imageReceiver.J0((int) nVar.f39732b);
        imageReceiver.h(canvas, null);
        float f13 = nVar.f39732b;
        canvas.drawRoundRect(rectF, f13, f13, this.h);
        float f14 = this.f39533r;
        float f15 = this.f39532n;
        if (f14 != f15) {
            float f16 = this.f39534s;
            float f17 = (16.0f * f16) + f15;
            this.f39532n = f17;
            if (f16 > 0.0f) {
                if (f17 > f14) {
                    this.f39532n = f14;
                }
            } else if (f17 < f14) {
                this.f39532n = f14;
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
        float f19 = (this.f39532n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f19, f19, this.f39535w, this.f39536x);
        w30 w30Var3 = this.E;
        if (w30Var3 != null) {
            w30Var3.b((int) (this.f39536x - org.telegram.messenger.g0.L(100.0f)), (int) (this.f39535w - org.telegram.messenger.g0.L(100.0f)), org.telegram.messenger.g0.L(200.0f), 16L, this.f39532n);
        }
        float f20 = this.f39532n;
        q9 q9Var = this.f39530e;
        q9Var.e(f20, 1.0f);
        float f21 = this.f39532n;
        q9 q9Var2 = this.d;
        q9Var2.e(f21, 1.0f);
        for (int i3 = 0; i3 < 2; i3++) {
            Paint paint = this.f39531f;
            if (i3 == 0 && (w30Var2 = this.F) != null) {
                paint.setShader(w30Var2.f50688g);
                f10 = 1.0f - this.H;
            } else {
                if (i3 == 1 && (w30Var = this.E) != null) {
                    paint.setShader(w30Var.f50688g);
                    f10 = this.H;
                }
            }
            paint.setAlpha((int) (f10 * 76.0f));
            q9Var.a(this.f39535w, this.f39536x, canvas, paint);
            q9Var2.a(this.f39535w, this.f39536x, canvas, paint);
        }
        canvas.restore();
        float f22 = (this.f39532n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f22, f22, this.f39535w, this.f39536x);
        this.f39527a.h(canvas, null);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        super.onMeasure(i3, i10);
        float L = org.telegram.messenger.g0.L(157.0f);
        this.f39535w = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        if (x30.f51713x5) {
            f10 = 0.0f;
        } else {
            f10 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f39536x = measuredHeight + f10;
        float f11 = L / 2.0f;
        ImageReceiver imageReceiver = this.f39527a;
        imageReceiver.J0((int) f11);
        imageReceiver.y0(this.f39535w - f11, this.f39536x - f11, L, L);
    }

    @Override
    public final void updateColors() {
        try {
            this.f39531f.setColor(i0.a.f(0.0f, k6.x0(null, k6.f27889dh, false), k6.x0(null, k6.f27908eh, false)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
