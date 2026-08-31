package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.c60;
import org.telegram.ui.d60;
public final class t extends View {
    public c60 B;
    public int C;
    public float D;
    public final u E;
    public final ImageReceiver f32317a;
    public final ImageReceiver f32318b;
    public final z8 f32319c;
    public final u9 d;
    public final u9 f32320e;
    public final Paint f32321f;
    public final Paint h;
    public float f32322n;
    public float f32323r;
    public float f32324s;
    public float v;
    public float f32325w;
    public final c60[] f32326x;
    public c60 f32327y;

    public t(u uVar, Context context) {
        super(context);
        this.E = uVar;
        this.f32317a = new ImageReceiver();
        this.f32318b = new ImageReceiver();
        this.f32319c = new z8((g6) null);
        Paint paint = new Paint(1);
        this.f32321f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f32326x = new c60[3];
        this.C = -1;
        this.D = 1.0f;
        u9 u9Var = new u9(9);
        this.d = u9Var;
        u9 u9Var2 = new u9(12);
        this.f32320e = u9Var2;
        u9Var.f31606a = AndroidUtilities.dp(76.0f);
        u9Var.f31607b = AndroidUtilities.dp(92.0f);
        u9Var.b();
        u9Var2.f31606a = AndroidUtilities.dp(80.0f);
        u9Var2.f31607b = AndroidUtilities.dp(95.0f);
        u9Var2.b();
        paint.setColor(i0.a.d(0.0f, k6.w0(null, k6.f21885pg, false), k6.w0(null, k6.f21903qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(t tVar, boolean z4) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        c60[] c60VarArr = tVar.f32326x;
        o0 o0Var = tVar.E.f32375k0;
        if (!o0Var.f32224k && ((groupCallParticipant = o0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (o0Var.f32219e) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 2;
        }
        if (i10 == tVar.C) {
            return;
        }
        tVar.C = i10;
        if (c60VarArr[i10] == null) {
            c60VarArr[i10] = new c60(i10);
            int i11 = tVar.C;
            if (i11 == 2) {
                c60VarArr[i11].f35689g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{k6.w0(null, k6.f21759ih, false), k6.w0(null, k6.f21796kh, false), k6.w0(null, k6.f21777jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                c60VarArr[i11].f35689g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{k6.w0(null, k6.Fg, false), k6.w0(null, k6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                c60VarArr[i11].f35689g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{k6.w0(null, k6.Jg, false), k6.w0(null, k6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        c60 c60Var = c60VarArr[tVar.C];
        c60 c60Var2 = tVar.f32327y;
        if (c60Var != c60Var2) {
            tVar.B = c60Var2;
            tVar.f32327y = c60Var;
            if (c60Var2 != null && z4) {
                tVar.D = 0.0f;
            } else {
                tVar.D = 1.0f;
                tVar.B = null;
            }
        }
        tVar.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32317a.onAttachedToWindow();
        this.f32318b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32317a.onDetachedFromWindow();
        this.f32318b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        c60 c60Var;
        float f10;
        c60 c60Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        p pVar = this.E.f32360a;
        rectF.set(pVar.getX() + pVar.L, pVar.getY() + pVar.K, (pVar.getX() + pVar.getMeasuredWidth()) - pVar.L, pVar.getY() + pVar.getMeasuredHeight() + pVar.K);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f32318b;
        imageReceiver.setImageCoords(f11, f12, width, height);
        imageReceiver.setRoundRadius((int) pVar.f32348b);
        imageReceiver.draw(canvas);
        float f13 = pVar.f32348b;
        canvas.drawRoundRect(rectF, f13, f13, this.h);
        float f14 = this.f32323r;
        float f15 = this.f32322n;
        if (f14 != f15) {
            float f16 = this.f32324s;
            float f17 = (16.0f * f16) + f15;
            this.f32322n = f17;
            if (f16 > 0.0f) {
                if (f17 > f14) {
                    this.f32322n = f14;
                }
            } else if (f17 < f14) {
                this.f32322n = f14;
            }
        }
        float f18 = this.D;
        if (f18 != 1.0f) {
            if (this.B != null) {
                this.D = f18 + 0.07272727f;
            }
            if (this.D >= 1.0f) {
                this.D = 1.0f;
                this.B = null;
            }
        }
        float f19 = (this.f32322n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f19, f19, this.v, this.f32325w);
        c60 c60Var3 = this.f32327y;
        if (c60Var3 != null) {
            c60Var3.b((int) (this.f32325w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f32322n);
        }
        float f20 = this.f32322n;
        u9 u9Var = this.f32320e;
        u9Var.e(f20, 1.0f);
        float f21 = this.f32322n;
        u9 u9Var2 = this.d;
        u9Var2.e(f21, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f32321f;
            if (i10 == 0 && (c60Var2 = this.B) != null) {
                paint.setShader(c60Var2.f35689g);
                f10 = 1.0f - this.D;
            } else {
                if (i10 == 1 && (c60Var = this.f32327y) != null) {
                    paint.setShader(c60Var.f35689g);
                    f10 = this.D;
                }
            }
            paint.setAlpha((int) (f10 * 76.0f));
            u9Var.a(this.v, this.f32325w, canvas, paint);
            u9Var2.a(this.v, this.f32325w, canvas, paint);
        }
        canvas.restore();
        float f22 = (this.f32322n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f22, f22, this.v, this.f32325w);
        this.f32317a.draw(canvas);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        super.onMeasure(i10, i11);
        float dp = AndroidUtilities.dp(157.0f);
        this.v = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        if (d60.C3) {
            f10 = 0.0f;
        } else {
            f10 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f32325w = measuredHeight + f10;
        float f11 = dp / 2.0f;
        ImageReceiver imageReceiver = this.f32317a;
        imageReceiver.setRoundRadius((int) f11);
        imageReceiver.setImageCoords(this.v - f11, this.f32325w - f11, dp, dp);
    }
}
