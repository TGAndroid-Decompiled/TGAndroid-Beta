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
import org.telegram.ui.r50;
import org.telegram.ui.s50;
public final class s extends View {
    public r50 E;
    public int F;
    public float G;
    public final t H;
    public final ImageReceiver f31712a;
    public final ImageReceiver f31713b;
    public final h9 f31714c;
    public final ba d;
    public final ba e;
    public final Paint f31715f;
    public final Paint h;
    public float f31716n;
    public float f31717r;
    public float f31718s;
    public float v;
    public float f31719w;
    public final r50[] f31720x;
    public r50 f31721y;

    public s(t tVar, Context context) {
        super(context);
        this.H = tVar;
        this.f31712a = new ImageReceiver();
        this.f31713b = new ImageReceiver();
        this.f31714c = new h9((d6) null);
        Paint paint = new Paint(1);
        this.f31715f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f31720x = new r50[3];
        this.F = -1;
        this.G = 1.0f;
        ba baVar = new ba(9);
        this.d = baVar;
        ba baVar2 = new ba(12);
        this.e = baVar2;
        baVar.f24872a = AndroidUtilities.dp(76.0f);
        baVar.f24873b = AndroidUtilities.dp(92.0f);
        baVar.b();
        baVar2.f24872a = AndroidUtilities.dp(80.0f);
        baVar2.f24873b = AndroidUtilities.dp(95.0f);
        baVar2.b();
        paint.setColor(i0.b.f(0.0f, h6.x0(null, h6.f21214pg, false), h6.x0(null, h6.f21233qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.b.o(-16777216, 127));
    }

    public static void a(s sVar, boolean z10) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        r50[] r50VarArr = sVar.f31720x;
        o0 o0Var = sVar.H.f31764n0;
        if (!o0Var.f31647k && ((groupCallParticipant = o0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
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
        if (r50VarArr[i10] == null) {
            r50VarArr[i10] = new r50(i10);
            int i11 = sVar.F;
            if (i11 == 2) {
                r50VarArr[i11].f40581g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{h6.x0(null, h6.f21084ih, false), h6.x0(null, h6.f21123kh, false), h6.x0(null, h6.f21104jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                r50VarArr[i11].f40581g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{h6.x0(null, h6.Fg, false), h6.x0(null, h6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                r50VarArr[i11].f40581g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{h6.x0(null, h6.Jg, false), h6.x0(null, h6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        r50 r50Var = r50VarArr[sVar.F];
        r50 r50Var2 = sVar.f31721y;
        if (r50Var != r50Var2) {
            sVar.E = r50Var2;
            sVar.f31721y = r50Var;
            if (r50Var2 != null && z10) {
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
        this.f31712a.onAttachedToWindow();
        this.f31713b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31712a.onDetachedFromWindow();
        this.f31713b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        r50 r50Var;
        float f7;
        r50 r50Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        o oVar = this.H.f31747a;
        rectF.set(oVar.getX() + oVar.O, oVar.getY() + oVar.N, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.O, oVar.getY() + oVar.getMeasuredHeight() + oVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f31713b;
        imageReceiver.setImageCoords(f10, f11, width, height);
        imageReceiver.setRoundRadius((int) oVar.f31685b);
        imageReceiver.draw(canvas);
        float f12 = oVar.f31685b;
        canvas.drawRoundRect(rectF, f12, f12, this.h);
        float f13 = this.f31717r;
        float f14 = this.f31716n;
        if (f13 != f14) {
            float f15 = this.f31718s;
            float f16 = (16.0f * f15) + f14;
            this.f31716n = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.f31716n = f13;
                }
            } else if (f16 < f13) {
                this.f31716n = f13;
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
        float f18 = (this.f31716n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.v, this.f31719w);
        r50 r50Var3 = this.f31721y;
        if (r50Var3 != null) {
            r50Var3.b((int) (this.f31719w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f31716n);
        }
        float f19 = this.f31716n;
        ba baVar = this.e;
        baVar.e(f19, 1.0f);
        float f20 = this.f31716n;
        ba baVar2 = this.d;
        baVar2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f31715f;
            if (i10 == 0 && (r50Var2 = this.E) != null) {
                paint.setShader(r50Var2.f40581g);
                f7 = 1.0f - this.G;
            } else {
                if (i10 == 1 && (r50Var = this.f31721y) != null) {
                    paint.setShader(r50Var.f40581g);
                    f7 = this.G;
                }
            }
            paint.setAlpha((int) (f7 * 76.0f));
            baVar.a(this.v, this.f31719w, canvas, paint);
            baVar2.a(this.v, this.f31719w, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.f31716n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.v, this.f31719w);
        this.f31712a.draw(canvas);
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
        if (s50.F3) {
            f7 = 0.0f;
        } else {
            f7 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f31719w = measuredHeight + f7;
        float f10 = dp / 2.0f;
        ImageReceiver imageReceiver = this.f31712a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.f31719w - f10, dp, dp);
    }
}
