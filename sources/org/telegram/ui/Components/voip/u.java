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
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.j9;
import org.telegram.ui.f60;
import org.telegram.ui.g60;
public final class u extends View {
    public f60 E;
    public int F;
    public float G;
    public final v H;
    public final ImageReceiver f32350a;
    public final ImageReceiver f32351b;
    public final j9 f32352c;
    public final da d;
    public final da f32353e;
    public final Paint f32354f;
    public final Paint h;
    public float f32355n;
    public float f32356r;
    public float f32357s;
    public float v;
    public float f32358w;
    public final f60[] f32359x;
    public f60 f32360y;

    public u(v vVar, Context context) {
        super(context);
        this.H = vVar;
        this.f32350a = new ImageReceiver();
        this.f32351b = new ImageReceiver();
        this.f32352c = new j9((d6) null);
        Paint paint = new Paint(1);
        this.f32354f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f32359x = new f60[3];
        this.F = -1;
        this.G = 1.0f;
        da daVar = new da(9);
        this.d = daVar;
        da daVar2 = new da(12);
        this.f32353e = daVar2;
        daVar.f25702a = AndroidUtilities.dp(76.0f);
        daVar.f25703b = AndroidUtilities.dp(92.0f);
        daVar.b();
        daVar2.f25702a = AndroidUtilities.dp(80.0f);
        daVar2.f25703b = AndroidUtilities.dp(95.0f);
        daVar2.b();
        paint.setColor(i0.a.d(0.0f, h6.x0(null, h6.f21052pg, false), h6.x0(null, h6.f21071qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(u uVar, boolean z10) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        f60[] f60VarArr = uVar.f32359x;
        q0 q0Var = uVar.H.f32392n0;
        if (!q0Var.f32281k && ((groupCallParticipant = q0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (q0Var.f32276e) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 2;
        }
        if (i10 == uVar.F) {
            return;
        }
        uVar.F = i10;
        if (f60VarArr[i10] == null) {
            f60VarArr[i10] = new f60(i10);
            int i11 = uVar.F;
            if (i11 == 2) {
                f60VarArr[i11].f37589g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{h6.x0(null, h6.f20923ih, false), h6.x0(null, h6.f20961kh, false), h6.x0(null, h6.f20941jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                f60VarArr[i11].f37589g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{h6.x0(null, h6.Fg, false), h6.x0(null, h6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                f60VarArr[i11].f37589g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{h6.x0(null, h6.Jg, false), h6.x0(null, h6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        f60 f60Var = f60VarArr[uVar.F];
        f60 f60Var2 = uVar.f32360y;
        if (f60Var != f60Var2) {
            uVar.E = f60Var2;
            uVar.f32360y = f60Var;
            if (f60Var2 != null && z10) {
                uVar.G = 0.0f;
            } else {
                uVar.G = 1.0f;
                uVar.E = null;
            }
        }
        uVar.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32350a.onAttachedToWindow();
        this.f32351b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32350a.onDetachedFromWindow();
        this.f32351b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f60 f60Var;
        float f7;
        f60 f60Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        q qVar = this.H.f32374a;
        rectF.set(qVar.getX() + qVar.O, qVar.getY() + qVar.N, (qVar.getX() + qVar.getMeasuredWidth()) - qVar.O, qVar.getY() + qVar.getMeasuredHeight() + qVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f32351b;
        imageReceiver.setImageCoords(f10, f11, width, height);
        imageReceiver.setRoundRadius((int) qVar.f32335b);
        imageReceiver.draw(canvas);
        float f12 = qVar.f32335b;
        canvas.drawRoundRect(rectF, f12, f12, this.h);
        float f13 = this.f32356r;
        float f14 = this.f32355n;
        if (f13 != f14) {
            float f15 = this.f32357s;
            float f16 = (16.0f * f15) + f14;
            this.f32355n = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.f32355n = f13;
                }
            } else if (f16 < f13) {
                this.f32355n = f13;
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
        float f18 = (this.f32355n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.v, this.f32358w);
        f60 f60Var3 = this.f32360y;
        if (f60Var3 != null) {
            f60Var3.b((int) (this.f32358w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f32355n);
        }
        float f19 = this.f32355n;
        da daVar = this.f32353e;
        daVar.e(f19, 1.0f);
        float f20 = this.f32355n;
        da daVar2 = this.d;
        daVar2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f32354f;
            if (i10 == 0 && (f60Var2 = this.E) != null) {
                paint.setShader(f60Var2.f37589g);
                f7 = 1.0f - this.G;
            } else {
                if (i10 == 1 && (f60Var = this.f32360y) != null) {
                    paint.setShader(f60Var.f37589g);
                    f7 = this.G;
                }
            }
            paint.setAlpha((int) (f7 * 76.0f));
            daVar.a(this.v, this.f32358w, canvas, paint);
            daVar2.a(this.v, this.f32358w, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.f32355n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.v, this.f32358w);
        this.f32350a.draw(canvas);
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
        if (g60.F3) {
            f7 = 0.0f;
        } else {
            f7 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f32358w = measuredHeight + f7;
        float f10 = dp / 2.0f;
        ImageReceiver imageReceiver = this.f32350a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.f32358w - f10, dp, dp);
    }
}
