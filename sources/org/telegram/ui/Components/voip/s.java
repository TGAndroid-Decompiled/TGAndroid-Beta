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
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.y8;
import org.telegram.ui.r50;
import org.telegram.ui.s50;

public final class s extends View {
    public r50 A;
    public int B;
    public float C;
    public final t D;

    public final ImageReceiver f33835a;

    public final ImageReceiver f33836b;

    public final y8 f33837c;
    public final s9 d;

    public final s9 f33838e;

    public final Paint f33839f;
    public final Paint h;

    public float f33840n;

    public float f33841r;

    public float f33842s;
    public float v;

    public float f33843w;

    public final r50[] f33844x;

    public r50 f33845y;

    public s(t tVar, Context context) {
        super(context);
        this.D = tVar;
        this.f33835a = new ImageReceiver();
        this.f33836b = new ImageReceiver();
        this.f33837c = new y8((c6) null);
        Paint paint = new Paint(1);
        this.f33839f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f33844x = new r50[3];
        this.B = -1;
        this.C = 1.0f;
        s9 s9Var = new s9(9);
        this.d = s9Var;
        s9 s9Var2 = new s9(12);
        this.f33838e = s9Var2;
        s9Var.f32356a = AndroidUtilities.dp(76.0f);
        s9Var.f32357b = AndroidUtilities.dp(92.0f);
        s9Var.b();
        s9Var2.f32356a = AndroidUtilities.dp(80.0f);
        s9Var2.f32357b = AndroidUtilities.dp(95.0f);
        s9Var2.b();
        paint.setColor(i0.b.d(0.0f, g6.w0(null, g6.f23275pg, false), g6.w0(null, g6.f23292qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.b.k(-16777216, 127));
    }

    public static void a(s sVar, boolean z10) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        r50[] r50VarArr = sVar.f33844x;
        n0 n0Var = sVar.D.f33885j0;
        if (n0Var.f33733k || !((groupCallParticipant = n0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            i10 = 2;
        } else {
            i10 = n0Var.f33728e ? 1 : 0;
        }
        if (i10 == sVar.B) {
            return;
        }
        sVar.B = i10;
        if (r50VarArr[i10] == null) {
            r50VarArr[i10] = new r50(i10);
            int i11 = sVar.B;
            if (i11 == 2) {
                r50VarArr[i11].f41814g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{g6.w0(null, g6.f23154ih, false), g6.w0(null, g6.f23191kh, false), g6.w0(null, g6.f23173jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                r50VarArr[i11].f41814g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{g6.w0(null, g6.Fg, false), g6.w0(null, g6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                r50VarArr[i11].f41814g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{g6.w0(null, g6.Jg, false), g6.w0(null, g6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        r50 r50Var = r50VarArr[sVar.B];
        r50 r50Var2 = sVar.f33845y;
        if (r50Var != r50Var2) {
            sVar.A = r50Var2;
            sVar.f33845y = r50Var;
            if (r50Var2 == null || !z10) {
                sVar.C = 1.0f;
                sVar.A = null;
            } else {
                sVar.C = 0.0f;
            }
        }
        sVar.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33835a.onAttachedToWindow();
        this.f33836b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33835a.onDetachedFromWindow();
        this.f33836b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        r50 r50Var;
        float f10;
        r50 r50Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        o oVar = this.D.f33871a;
        rectF.set(oVar.getX() + oVar.K, oVar.getY() + oVar.J, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.K, oVar.getY() + oVar.getMeasuredHeight() + oVar.J);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        ImageReceiver imageReceiver = this.f33836b;
        imageReceiver.setImageCoords(f11, f12, fWidth, fHeight);
        imageReceiver.setRoundRadius((int) oVar.f33824b);
        imageReceiver.draw(canvas);
        float f13 = oVar.f33824b;
        canvas.drawRoundRect(rectF, f13, f13, this.h);
        float f14 = this.f33841r;
        float f15 = this.f33840n;
        if (f14 != f15) {
            float f16 = this.f33842s;
            float f17 = (16.0f * f16) + f15;
            this.f33840n = f17;
            if (f16 > 0.0f) {
                if (f17 > f14) {
                    this.f33840n = f14;
                }
            } else if (f17 < f14) {
                this.f33840n = f14;
            }
        }
        float f18 = this.C;
        if (f18 != 1.0f) {
            if (this.A != null) {
                this.C = f18 + 0.07272727f;
            }
            if (this.C >= 1.0f) {
                this.C = 1.0f;
                this.A = null;
            }
        }
        float f19 = (this.f33840n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f19, f19, this.v, this.f33843w);
        r50 r50Var3 = this.f33845y;
        if (r50Var3 != null) {
            r50Var3.b((int) (this.f33843w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f33840n);
        }
        float f20 = this.f33840n;
        s9 s9Var = this.f33838e;
        s9Var.e(f20, 1.0f);
        float f21 = this.f33840n;
        s9 s9Var2 = this.d;
        s9Var2.e(f21, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f33839f;
            if (i10 != 0 || (r50Var2 = this.A) == null) {
                if (i10 == 1 && (r50Var = this.f33845y) != null) {
                    paint.setShader(r50Var.f41814g);
                    f10 = this.C;
                }
            } else {
                paint.setShader(r50Var2.f41814g);
                f10 = 1.0f - this.C;
            }
            paint.setAlpha((int) (f10 * 76.0f));
            s9Var.a(this.v, this.f33843w, canvas, paint);
            s9Var2.a(this.v, this.f33843w, canvas, paint);
        }
        canvas.restore();
        float f22 = (this.f33840n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f22, f22, this.v, this.f33843w);
        this.f33835a.draw(canvas);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float fDp = AndroidUtilities.dp(157.0f);
        this.v = getMeasuredWidth() >> 1;
        this.f33843w = (getMeasuredHeight() >> 1) + (s50.B3 ? 0.0f : (-getMeasuredHeight()) * 0.12f);
        float f10 = fDp / 2.0f;
        ImageReceiver imageReceiver = this.f33835a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.f33843w - f10, fDp, fDp);
    }
}
