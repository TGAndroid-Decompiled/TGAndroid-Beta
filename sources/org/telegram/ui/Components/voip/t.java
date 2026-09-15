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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.z9;
import org.telegram.ui.h60;
import org.telegram.ui.i60;
public final class t extends View {
    public h60 E;
    public int F;
    public float G;
    public final u H;
    public final ImageReceiver f29219a;
    public final ImageReceiver f29220b;
    public final f9 f29221c;
    public final z9 d;
    public final z9 e;
    public final Paint f29222f;
    public final Paint h;
    public float f29223n;
    public float f29224r;
    public float f29225s;
    public float v;
    public float f29226w;
    public final h60[] f29227x;
    public h60 f29228y;

    public t(u uVar, Context context) {
        super(context);
        this.H = uVar;
        this.f29219a = new ImageReceiver();
        this.f29220b = new ImageReceiver();
        this.f29221c = new f9((e6) null);
        Paint paint = new Paint(1);
        this.f29222f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f29227x = new h60[3];
        this.F = -1;
        this.G = 1.0f;
        z9 z9Var = new z9(9);
        this.d = z9Var;
        z9 z9Var2 = new z9(12);
        this.e = z9Var2;
        z9Var.f30504a = AndroidUtilities.dp(76.0f);
        z9Var.f30505b = AndroidUtilities.dp(92.0f);
        z9Var.b();
        z9Var2.f30504a = AndroidUtilities.dp(80.0f);
        z9Var2.f30505b = AndroidUtilities.dp(95.0f);
        z9Var2.b();
        paint.setColor(i0.a.d(0.0f, i6.w0(null, i6.f19065pg, false), i6.w0(null, i6.f19083qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(t tVar, boolean z10) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        h60[] h60VarArr = tVar.f29227x;
        p0 p0Var = tVar.H.f29257n0;
        if (!p0Var.f29156k && ((groupCallParticipant = p0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (p0Var.e) {
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
        if (h60VarArr[i10] == null) {
            h60VarArr[i10] = new h60(i10);
            int i11 = tVar.F;
            if (i11 == 2) {
                h60VarArr[i11].f34178g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{i6.w0(null, i6.f18936ih, false), i6.w0(null, i6.f18975kh, false), i6.w0(null, i6.f18955jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                h60VarArr[i11].f34178g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{i6.w0(null, i6.Fg, false), i6.w0(null, i6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                h60VarArr[i11].f34178g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{i6.w0(null, i6.Jg, false), i6.w0(null, i6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        h60 h60Var = h60VarArr[tVar.F];
        h60 h60Var2 = tVar.f29228y;
        if (h60Var != h60Var2) {
            tVar.E = h60Var2;
            tVar.f29228y = h60Var;
            if (h60Var2 != null && z10) {
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
        this.f29219a.onAttachedToWindow();
        this.f29220b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29219a.onDetachedFromWindow();
        this.f29220b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        h60 h60Var;
        float f7;
        h60 h60Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        p pVar = this.H.f29240a;
        rectF.set(pVar.getX() + pVar.O, pVar.getY() + pVar.N, (pVar.getX() + pVar.getMeasuredWidth()) - pVar.O, pVar.getY() + pVar.getMeasuredHeight() + pVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f29220b;
        imageReceiver.setImageCoords(f10, f11, width, height);
        imageReceiver.setRoundRadius((int) pVar.f29205b);
        imageReceiver.draw(canvas);
        float f12 = pVar.f29205b;
        canvas.drawRoundRect(rectF, f12, f12, this.h);
        float f13 = this.f29224r;
        float f14 = this.f29223n;
        if (f13 != f14) {
            float f15 = this.f29225s;
            float f16 = (16.0f * f15) + f14;
            this.f29223n = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.f29223n = f13;
                }
            } else if (f16 < f13) {
                this.f29223n = f13;
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
        float f18 = (this.f29223n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.v, this.f29226w);
        h60 h60Var3 = this.f29228y;
        if (h60Var3 != null) {
            h60Var3.b((int) (this.f29226w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f29223n);
        }
        float f19 = this.f29223n;
        z9 z9Var = this.e;
        z9Var.e(f19, 1.0f);
        float f20 = this.f29223n;
        z9 z9Var2 = this.d;
        z9Var2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f29222f;
            if (i10 == 0 && (h60Var2 = this.E) != null) {
                paint.setShader(h60Var2.f34178g);
                f7 = 1.0f - this.G;
            } else {
                if (i10 == 1 && (h60Var = this.f29228y) != null) {
                    paint.setShader(h60Var.f34178g);
                    f7 = this.G;
                }
            }
            paint.setAlpha((int) (f7 * 76.0f));
            z9Var.a(this.v, this.f29226w, canvas, paint);
            z9Var2.a(this.v, this.f29226w, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.f29223n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.v, this.f29226w);
        this.f29219a.draw(canvas);
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
        if (i60.F3) {
            f7 = 0.0f;
        } else {
            f7 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f29226w = measuredHeight + f7;
        float f10 = dp / 2.0f;
        ImageReceiver imageReceiver = this.f29219a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.f29226w - f10, dp, dp);
    }
}
