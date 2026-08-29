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
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.y9;
import org.telegram.ui.q50;
import org.telegram.ui.r50;
public final class t extends View {
    public q50 A;
    public int B;
    public float C;
    public final u D;
    public final ImageReceiver f33985a;
    public final ImageReceiver f33986b;
    public final e9 f33987c;
    public final y9 d;
    public final y9 f33988e;
    public final Paint f33989f;
    public final Paint h;
    public float f33990n;
    public float f33991r;
    public float f33992s;
    public float v;
    public float f33993w;
    public final q50[] f33994x;
    public q50 f33995y;

    public t(u uVar, Context context) {
        super(context);
        this.D = uVar;
        this.f33985a = new ImageReceiver();
        this.f33986b = new ImageReceiver();
        this.f33987c = new e9((c6) null);
        Paint paint = new Paint(1);
        this.f33989f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f33994x = new q50[3];
        this.B = -1;
        this.C = 1.0f;
        y9 y9Var = new y9(9);
        this.d = y9Var;
        y9 y9Var2 = new y9(12);
        this.f33988e = y9Var2;
        y9Var.f34975a = AndroidUtilities.dp(76.0f);
        y9Var.f34976b = AndroidUtilities.dp(92.0f);
        y9Var.b();
        y9Var2.f34975a = AndroidUtilities.dp(80.0f);
        y9Var2.f34976b = AndroidUtilities.dp(95.0f);
        y9Var2.b();
        paint.setColor(i0.a.d(0.0f, g6.w0(null, g6.f23286pg, false), g6.w0(null, g6.f23302qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(t tVar, boolean z10) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        q50[] q50VarArr = tVar.f33994x;
        o0 o0Var = tVar.D.f34028j0;
        if (!o0Var.f33880k && ((groupCallParticipant = o0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (o0Var.f33875e) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 2;
        }
        if (i10 == tVar.B) {
            return;
        }
        tVar.B = i10;
        if (q50VarArr[i10] == null) {
            q50VarArr[i10] = new q50(i10);
            int i11 = tVar.B;
            if (i11 == 2) {
                q50VarArr[i11].f41539g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{g6.w0(null, g6.f23162ih, false), g6.w0(null, g6.f23199kh, false), g6.w0(null, g6.f23181jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                q50VarArr[i11].f41539g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{g6.w0(null, g6.Fg, false), g6.w0(null, g6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                q50VarArr[i11].f41539g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{g6.w0(null, g6.Jg, false), g6.w0(null, g6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        q50 q50Var = q50VarArr[tVar.B];
        q50 q50Var2 = tVar.f33995y;
        if (q50Var != q50Var2) {
            tVar.A = q50Var2;
            tVar.f33995y = q50Var;
            if (q50Var2 != null && z10) {
                tVar.C = 0.0f;
            } else {
                tVar.C = 1.0f;
                tVar.A = null;
            }
        }
        tVar.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33985a.onAttachedToWindow();
        this.f33986b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33985a.onDetachedFromWindow();
        this.f33986b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        q50 q50Var;
        float f9;
        q50 q50Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        p pVar = this.D.f34014a;
        rectF.set(pVar.getX() + pVar.K, pVar.getY() + pVar.J, (pVar.getX() + pVar.getMeasuredWidth()) - pVar.K, pVar.getY() + pVar.getMeasuredHeight() + pVar.J);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f33986b;
        imageReceiver.setImageCoords(f10, f11, width, height);
        imageReceiver.setRoundRadius((int) pVar.f34054b);
        imageReceiver.draw(canvas);
        float f12 = pVar.f34054b;
        canvas.drawRoundRect(rectF, f12, f12, this.h);
        float f13 = this.f33991r;
        float f14 = this.f33990n;
        if (f13 != f14) {
            float f15 = this.f33992s;
            float f16 = (16.0f * f15) + f14;
            this.f33990n = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.f33990n = f13;
                }
            } else if (f16 < f13) {
                this.f33990n = f13;
            }
        }
        float f17 = this.C;
        if (f17 != 1.0f) {
            if (this.A != null) {
                this.C = f17 + 0.07272727f;
            }
            if (this.C >= 1.0f) {
                this.C = 1.0f;
                this.A = null;
            }
        }
        float f18 = (this.f33990n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.v, this.f33993w);
        q50 q50Var3 = this.f33995y;
        if (q50Var3 != null) {
            q50Var3.b((int) (this.f33993w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f33990n);
        }
        float f19 = this.f33990n;
        y9 y9Var = this.f33988e;
        y9Var.e(f19, 1.0f);
        float f20 = this.f33990n;
        y9 y9Var2 = this.d;
        y9Var2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f33989f;
            if (i10 == 0 && (q50Var2 = this.A) != null) {
                paint.setShader(q50Var2.f41539g);
                f9 = 1.0f - this.C;
            } else {
                if (i10 == 1 && (q50Var = this.f33995y) != null) {
                    paint.setShader(q50Var.f41539g);
                    f9 = this.C;
                }
            }
            paint.setAlpha((int) (f9 * 76.0f));
            y9Var.a(this.v, this.f33993w, canvas, paint);
            y9Var2.a(this.v, this.f33993w, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.f33990n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.v, this.f33993w);
        this.f33985a.draw(canvas);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        super.onMeasure(i10, i11);
        float dp = AndroidUtilities.dp(157.0f);
        this.v = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        if (r50.B3) {
            f9 = 0.0f;
        } else {
            f9 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f33993w = measuredHeight + f9;
        float f10 = dp / 2.0f;
        ImageReceiver imageReceiver = this.f33985a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.f33993w - f10, dp, dp);
    }
}
