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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ea;
import org.telegram.ui.Components.k9;
import org.telegram.ui.m60;
import org.telegram.ui.n60;
public final class s extends View {
    public m60 E;
    public int F;
    public float G;
    public final t H;
    public final ImageReceiver f30436a;
    public final ImageReceiver f30437b;
    public final k9 f30438c;
    public final ea d;
    public final ea e;
    public final Paint f30439f;
    public final Paint h;
    public float f30440n;
    public float f30441r;
    public float f30442s;
    public float v;
    public float f30443w;
    public final m60[] f30444x;
    public m60 f30445y;

    public s(t tVar, Context context) {
        super(context);
        this.H = tVar;
        this.f30436a = new ImageReceiver();
        this.f30437b = new ImageReceiver();
        this.f30438c = new k9((c6) null);
        Paint paint = new Paint(1);
        this.f30439f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f30444x = new m60[3];
        this.F = -1;
        this.G = 1.0f;
        ea eaVar = new ea(9);
        this.d = eaVar;
        ea eaVar2 = new ea(12);
        this.e = eaVar2;
        eaVar.f24634a = AndroidUtilities.dp(76.0f);
        eaVar.f24635b = AndroidUtilities.dp(92.0f);
        eaVar.b();
        eaVar2.f24634a = AndroidUtilities.dp(80.0f);
        eaVar2.f24635b = AndroidUtilities.dp(95.0f);
        eaVar2.b();
        paint.setColor(i0.a.d(0.0f, g6.x0(null, g6.f20129pg, false), g6.x0(null, g6.f20148qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(s sVar, boolean z10) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        m60[] m60VarArr = sVar.f30444x;
        o0 o0Var = sVar.H.f30493n0;
        if (!o0Var.f30373k && ((groupCallParticipant = o0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (o0Var.e) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 2;
        }
        if (i10 == sVar.F) {
            return;
        }
        sVar.F = i10;
        if (m60VarArr[i10] == null) {
            m60VarArr[i10] = new m60(i10);
            int i11 = sVar.F;
            if (i11 == 2) {
                m60VarArr[i11].f38174g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{g6.x0(null, g6.f19999ih, false), g6.x0(null, g6.f20038kh, false), g6.x0(null, g6.f20019jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                m60VarArr[i11].f38174g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{g6.x0(null, g6.Fg, false), g6.x0(null, g6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                m60VarArr[i11].f38174g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{g6.x0(null, g6.Jg, false), g6.x0(null, g6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        m60 m60Var = m60VarArr[sVar.F];
        m60 m60Var2 = sVar.f30445y;
        if (m60Var != m60Var2) {
            sVar.E = m60Var2;
            sVar.f30445y = m60Var;
            if (m60Var2 != null && z10) {
                sVar.G = 0.0f;
            } else {
                sVar.G = 1.0f;
                sVar.E = null;
            }
        }
        sVar.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30436a.onAttachedToWindow();
        this.f30437b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30436a.onDetachedFromWindow();
        this.f30437b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        m60 m60Var;
        float f7;
        m60 m60Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        o oVar = this.H.f30476a;
        rectF.set(oVar.getX() + oVar.O, oVar.getY() + oVar.N, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.O, oVar.getY() + oVar.getMeasuredHeight() + oVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f30437b;
        imageReceiver.setImageCoords(f10, f11, width, height);
        imageReceiver.setRoundRadius((int) oVar.f30422b);
        imageReceiver.draw(canvas);
        float f12 = oVar.f30422b;
        canvas.drawRoundRect(rectF, f12, f12, this.h);
        float f13 = this.f30441r;
        float f14 = this.f30440n;
        if (f13 != f14) {
            float f15 = this.f30442s;
            float f16 = (16.0f * f15) + f14;
            this.f30440n = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.f30440n = f13;
                }
            } else if (f16 < f13) {
                this.f30440n = f13;
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
        float f18 = (this.f30440n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.v, this.f30443w);
        m60 m60Var3 = this.f30445y;
        if (m60Var3 != null) {
            m60Var3.b((int) (this.f30443w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f30440n);
        }
        float f19 = this.f30440n;
        ea eaVar = this.e;
        eaVar.e(f19, 1.0f);
        float f20 = this.f30440n;
        ea eaVar2 = this.d;
        eaVar2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f30439f;
            if (i10 == 0 && (m60Var2 = this.E) != null) {
                paint.setShader(m60Var2.f38174g);
                f7 = 1.0f - this.G;
            } else {
                if (i10 == 1 && (m60Var = this.f30445y) != null) {
                    paint.setShader(m60Var.f38174g);
                    f7 = this.G;
                }
            }
            paint.setAlpha((int) (f7 * 76.0f));
            eaVar.a(this.v, this.f30443w, canvas, paint);
            eaVar2.a(this.v, this.f30443w, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.f30440n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.v, this.f30443w);
        this.f30436a.draw(canvas);
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
        if (n60.F3) {
            f7 = 0.0f;
        } else {
            f7 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f30443w = measuredHeight + f7;
        float f10 = dp / 2.0f;
        ImageReceiver imageReceiver = this.f30436a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.f30443w - f10, dp, dp);
    }
}
