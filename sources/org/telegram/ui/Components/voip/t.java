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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.h9;
import org.telegram.ui.g60;
import org.telegram.ui.h60;
public final class t extends View {
    public g60 E;
    public int F;
    public float G;
    public final u H;
    public final ImageReceiver f32208a;
    public final ImageReceiver f32209b;
    public final h9 f32210c;
    public final ca d;
    public final ca f32211e;
    public final Paint f32212f;
    public final Paint h;
    public float f32213n;
    public float f32214r;
    public float f32215s;
    public float v;
    public float f32216w;
    public final g60[] f32217x;
    public g60 f32218y;

    public t(u uVar, Context context) {
        super(context);
        this.H = uVar;
        this.f32208a = new ImageReceiver();
        this.f32209b = new ImageReceiver();
        this.f32210c = new h9((d6) null);
        Paint paint = new Paint(1);
        this.f32212f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f32217x = new g60[3];
        this.F = -1;
        this.G = 1.0f;
        ca caVar = new ca(9);
        this.d = caVar;
        ca caVar2 = new ca(12);
        this.f32211e = caVar2;
        caVar.f25322a = AndroidUtilities.dp(76.0f);
        caVar.f25323b = AndroidUtilities.dp(92.0f);
        caVar.b();
        caVar2.f25322a = AndroidUtilities.dp(80.0f);
        caVar2.f25323b = AndroidUtilities.dp(95.0f);
        caVar2.b();
        paint.setColor(i0.a.d(0.0f, i6.w0(null, i6.f21058pg, false), i6.w0(null, i6.f21077qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(t tVar, boolean z10) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        g60[] g60VarArr = tVar.f32217x;
        p0 p0Var = tVar.H.f32262n0;
        if (!p0Var.f32138k && ((groupCallParticipant = p0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (p0Var.f32133e) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 2;
        }
        if (i10 == tVar.F) {
            return;
        }
        tVar.F = i10;
        if (g60VarArr[i10] == null) {
            g60VarArr[i10] = new g60(i10);
            int i11 = tVar.F;
            if (i11 == 2) {
                g60VarArr[i11].f36529g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{i6.w0(null, i6.f20928ih, false), i6.w0(null, i6.f20967kh, false), i6.w0(null, i6.f20947jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                g60VarArr[i11].f36529g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{i6.w0(null, i6.Fg, false), i6.w0(null, i6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                g60VarArr[i11].f36529g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{i6.w0(null, i6.Jg, false), i6.w0(null, i6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        g60 g60Var = g60VarArr[tVar.F];
        g60 g60Var2 = tVar.f32218y;
        if (g60Var != g60Var2) {
            tVar.E = g60Var2;
            tVar.f32218y = g60Var;
            if (g60Var2 != null && z10) {
                tVar.G = 0.0f;
            } else {
                tVar.G = 1.0f;
                tVar.E = null;
            }
        }
        tVar.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32208a.onAttachedToWindow();
        this.f32209b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32208a.onDetachedFromWindow();
        this.f32209b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        g60 g60Var;
        float f7;
        g60 g60Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        p pVar = this.H.f32244a;
        rectF.set(pVar.getX() + pVar.O, pVar.getY() + pVar.N, (pVar.getX() + pVar.getMeasuredWidth()) - pVar.O, pVar.getY() + pVar.getMeasuredHeight() + pVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f32209b;
        imageReceiver.setImageCoords(f10, f11, width, height);
        imageReceiver.setRoundRadius((int) pVar.f32229b);
        imageReceiver.draw(canvas);
        float f12 = pVar.f32229b;
        canvas.drawRoundRect(rectF, f12, f12, this.h);
        float f13 = this.f32214r;
        float f14 = this.f32213n;
        if (f13 != f14) {
            float f15 = this.f32215s;
            float f16 = (16.0f * f15) + f14;
            this.f32213n = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.f32213n = f13;
                }
            } else if (f16 < f13) {
                this.f32213n = f13;
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
        float f18 = (this.f32213n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.v, this.f32216w);
        g60 g60Var3 = this.f32218y;
        if (g60Var3 != null) {
            g60Var3.b((int) (this.f32216w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f32213n);
        }
        float f19 = this.f32213n;
        ca caVar = this.f32211e;
        caVar.e(f19, 1.0f);
        float f20 = this.f32213n;
        ca caVar2 = this.d;
        caVar2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f32212f;
            if (i10 == 0 && (g60Var2 = this.E) != null) {
                paint.setShader(g60Var2.f36529g);
                f7 = 1.0f - this.G;
            } else {
                if (i10 == 1 && (g60Var = this.f32218y) != null) {
                    paint.setShader(g60Var.f36529g);
                    f7 = this.G;
                }
            }
            paint.setAlpha((int) (f7 * 76.0f));
            caVar.a(this.v, this.f32216w, canvas, paint);
            caVar2.a(this.v, this.f32216w, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.f32213n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.v, this.f32216w);
        this.f32208a.draw(canvas);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        super.onMeasure(i10, i11);
        float dp = AndroidUtilities.dp(157.0f);
        this.v = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        if (h60.F3) {
            f7 = 0.0f;
        } else {
            f7 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f32216w = measuredHeight + f7;
        float f10 = dp / 2.0f;
        ImageReceiver imageReceiver = this.f32208a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.f32216w - f10, dp, dp);
    }
}
