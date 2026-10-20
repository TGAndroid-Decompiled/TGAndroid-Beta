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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.h9;
import org.telegram.ui.p50;
import org.telegram.ui.q50;
public final class s extends View {
    public p50 E;
    public int F;
    public float G;
    public final t H;
    public final ImageReceiver f31672a;
    public final ImageReceiver f31673b;
    public final h9 f31674c;
    public final ba d;
    public final ba e;
    public final Paint f31675f;
    public final Paint h;
    public float f31676n;
    public float f31677r;
    public float f31678s;
    public float v;
    public float f31679w;
    public final p50[] f31680x;
    public p50 f31681y;

    public s(t tVar, Context context) {
        super(context);
        this.H = tVar;
        this.f31672a = new ImageReceiver();
        this.f31673b = new ImageReceiver();
        this.f31674c = new h9((d6) null);
        Paint paint = new Paint(1);
        this.f31675f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f31680x = new p50[3];
        this.F = -1;
        this.G = 1.0f;
        ba baVar = new ba(9);
        this.d = baVar;
        ba baVar2 = new ba(12);
        this.e = baVar2;
        baVar.f24839a = AndroidUtilities.dp(76.0f);
        baVar.f24840b = AndroidUtilities.dp(92.0f);
        baVar.b();
        baVar2.f24839a = AndroidUtilities.dp(80.0f);
        baVar2.f24840b = AndroidUtilities.dp(95.0f);
        baVar2.b();
        paint.setColor(i0.a.f(0.0f, h6.x0(null, h6.f21218pg, false), h6.x0(null, h6.f21237qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.o(-16777216, 127));
    }

    public static void a(s sVar, boolean z10) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        p50[] p50VarArr = sVar.f31680x;
        o0 o0Var = sVar.H.f31724n0;
        if (!o0Var.f31607k && ((groupCallParticipant = o0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
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
        if (p50VarArr[i10] == null) {
            p50VarArr[i10] = new p50(i10);
            int i11 = sVar.F;
            if (i11 == 2) {
                p50VarArr[i11].f40071g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{h6.x0(null, h6.f21088ih, false), h6.x0(null, h6.f21127kh, false), h6.x0(null, h6.f21108jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                p50VarArr[i11].f40071g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{h6.x0(null, h6.Fg, false), h6.x0(null, h6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                p50VarArr[i11].f40071g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{h6.x0(null, h6.Jg, false), h6.x0(null, h6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        p50 p50Var = p50VarArr[sVar.F];
        p50 p50Var2 = sVar.f31681y;
        if (p50Var != p50Var2) {
            sVar.E = p50Var2;
            sVar.f31681y = p50Var;
            if (p50Var2 != null && z10) {
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
        this.f31672a.onAttachedToWindow();
        this.f31673b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31672a.onDetachedFromWindow();
        this.f31673b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        p50 p50Var;
        float f7;
        p50 p50Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        o oVar = this.H.f31707a;
        rectF.set(oVar.getX() + oVar.O, oVar.getY() + oVar.N, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.O, oVar.getY() + oVar.getMeasuredHeight() + oVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f31673b;
        imageReceiver.setImageCoords(f10, f11, width, height);
        imageReceiver.setRoundRadius((int) oVar.f31645b);
        imageReceiver.draw(canvas);
        float f12 = oVar.f31645b;
        canvas.drawRoundRect(rectF, f12, f12, this.h);
        float f13 = this.f31677r;
        float f14 = this.f31676n;
        if (f13 != f14) {
            float f15 = this.f31678s;
            float f16 = (16.0f * f15) + f14;
            this.f31676n = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.f31676n = f13;
                }
            } else if (f16 < f13) {
                this.f31676n = f13;
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
        float f18 = (this.f31676n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.v, this.f31679w);
        p50 p50Var3 = this.f31681y;
        if (p50Var3 != null) {
            p50Var3.b((int) (this.f31679w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f31676n);
        }
        float f19 = this.f31676n;
        ba baVar = this.e;
        baVar.e(f19, 1.0f);
        float f20 = this.f31676n;
        ba baVar2 = this.d;
        baVar2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f31675f;
            if (i10 == 0 && (p50Var2 = this.E) != null) {
                paint.setShader(p50Var2.f40071g);
                f7 = 1.0f - this.G;
            } else {
                if (i10 == 1 && (p50Var = this.f31681y) != null) {
                    paint.setShader(p50Var.f40071g);
                    f7 = this.G;
                }
            }
            paint.setAlpha((int) (f7 * 76.0f));
            baVar.a(this.v, this.f31679w, canvas, paint);
            baVar2.a(this.v, this.f31679w, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.f31676n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.v, this.f31679w);
        this.f31672a.draw(canvas);
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
        if (q50.F3) {
            f7 = 0.0f;
        } else {
            f7 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f31679w = measuredHeight + f7;
        float f10 = dp / 2.0f;
        ImageReceiver imageReceiver = this.f31672a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.f31679w - f10, dp, dp);
    }
}
