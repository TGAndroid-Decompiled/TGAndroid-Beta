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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.j9;
import org.telegram.ui.h60;
import org.telegram.ui.i60;
public final class u extends View {
    public h60 E;
    public int F;
    public float G;
    public final v H;
    public final ImageReceiver f31972a;
    public final ImageReceiver f31973b;
    public final j9 f31974c;
    public final da d;
    public final da f31975e;
    public final Paint f31976f;
    public final Paint h;
    public float f31977n;
    public float f31978r;
    public float f31979s;
    public float v;
    public float f31980w;
    public final h60[] f31981x;
    public h60 f31982y;

    public u(v vVar, Context context) {
        super(context);
        this.H = vVar;
        this.f31972a = new ImageReceiver();
        this.f31973b = new ImageReceiver();
        this.f31974c = new j9((c6) null);
        Paint paint = new Paint(1);
        this.f31976f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f31981x = new h60[3];
        this.F = -1;
        this.G = 1.0f;
        da daVar = new da(9);
        this.d = daVar;
        da daVar2 = new da(12);
        this.f31975e = daVar2;
        daVar.f25264a = AndroidUtilities.dp(76.0f);
        daVar.f25265b = AndroidUtilities.dp(92.0f);
        daVar.b();
        daVar2.f25264a = AndroidUtilities.dp(80.0f);
        daVar2.f25265b = AndroidUtilities.dp(95.0f);
        daVar2.b();
        paint.setColor(i0.a.d(0.0f, h6.x0(null, h6.f20790pg, false), h6.x0(null, h6.f20809qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(u uVar, boolean z10) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        h60[] h60VarArr = uVar.f31981x;
        q0 q0Var = uVar.H.f32014n0;
        if (!q0Var.f31903k && ((groupCallParticipant = q0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (q0Var.f31898e) {
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
        if (h60VarArr[i10] == null) {
            h60VarArr[i10] = new h60(i10);
            int i11 = uVar.F;
            if (i11 == 2) {
                h60VarArr[i11].f38263g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{h6.x0(null, h6.f20661ih, false), h6.x0(null, h6.f20699kh, false), h6.x0(null, h6.f20679jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                h60VarArr[i11].f38263g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{h6.x0(null, h6.Fg, false), h6.x0(null, h6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                h60VarArr[i11].f38263g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{h6.x0(null, h6.Jg, false), h6.x0(null, h6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        h60 h60Var = h60VarArr[uVar.F];
        h60 h60Var2 = uVar.f31982y;
        if (h60Var != h60Var2) {
            uVar.E = h60Var2;
            uVar.f31982y = h60Var;
            if (h60Var2 != null && z10) {
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
        this.f31972a.onAttachedToWindow();
        this.f31973b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31972a.onDetachedFromWindow();
        this.f31973b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        h60 h60Var;
        float f7;
        h60 h60Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        q qVar = this.H.f31996a;
        rectF.set(qVar.getX() + qVar.O, qVar.getY() + qVar.N, (qVar.getX() + qVar.getMeasuredWidth()) - qVar.O, qVar.getY() + qVar.getMeasuredHeight() + qVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f31973b;
        imageReceiver.setImageCoords(f10, f11, width, height);
        imageReceiver.setRoundRadius((int) qVar.f31957b);
        imageReceiver.draw(canvas);
        float f12 = qVar.f31957b;
        canvas.drawRoundRect(rectF, f12, f12, this.h);
        float f13 = this.f31978r;
        float f14 = this.f31977n;
        if (f13 != f14) {
            float f15 = this.f31979s;
            float f16 = (16.0f * f15) + f14;
            this.f31977n = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.f31977n = f13;
                }
            } else if (f16 < f13) {
                this.f31977n = f13;
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
        float f18 = (this.f31977n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.v, this.f31980w);
        h60 h60Var3 = this.f31982y;
        if (h60Var3 != null) {
            h60Var3.b((int) (this.f31980w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f31977n);
        }
        float f19 = this.f31977n;
        da daVar = this.f31975e;
        daVar.e(f19, 1.0f);
        float f20 = this.f31977n;
        da daVar2 = this.d;
        daVar2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f31976f;
            if (i10 == 0 && (h60Var2 = this.E) != null) {
                paint.setShader(h60Var2.f38263g);
                f7 = 1.0f - this.G;
            } else {
                if (i10 == 1 && (h60Var = this.f31982y) != null) {
                    paint.setShader(h60Var.f38263g);
                    f7 = this.G;
                }
            }
            paint.setAlpha((int) (f7 * 76.0f));
            daVar.a(this.v, this.f31980w, canvas, paint);
            daVar2.a(this.v, this.f31980w, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.f31977n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.v, this.f31980w);
        this.f31972a.draw(canvas);
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
        this.f31980w = measuredHeight + f7;
        float f10 = dp / 2.0f;
        ImageReceiver imageReceiver = this.f31972a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.f31980w - f10, dp, dp);
    }
}
