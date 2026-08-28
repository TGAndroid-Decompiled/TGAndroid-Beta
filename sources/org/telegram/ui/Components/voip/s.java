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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.n50;
import org.telegram.ui.o50;
public final class s extends View {
    public n50 A;
    public int B;
    public float C;
    public final t D;
    public final ImageReceiver f33785a;
    public final ImageReceiver f33786b;
    public final z8 f33787c;
    public final t9 d;
    public final t9 f33788e;
    public final Paint f33789f;
    public final Paint h;
    public float f33790n;
    public float f33791r;
    public float f33792s;
    public float v;
    public float f33793w;
    public final n50[] f33794x;
    public n50 f33795y;

    public s(t tVar, Context context) {
        super(context);
        this.D = tVar;
        this.f33785a = new ImageReceiver();
        this.f33786b = new ImageReceiver();
        this.f33787c = new z8((b6) null);
        Paint paint = new Paint(1);
        this.f33789f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f33794x = new n50[3];
        this.B = -1;
        this.C = 1.0f;
        t9 t9Var = new t9(9);
        this.d = t9Var;
        t9 t9Var2 = new t9(12);
        this.f33788e = t9Var2;
        t9Var.f32647a = AndroidUtilities.dp(76.0f);
        t9Var.f32648b = AndroidUtilities.dp(92.0f);
        t9Var.b();
        t9Var2.f32647a = AndroidUtilities.dp(80.0f);
        t9Var2.f32648b = AndroidUtilities.dp(95.0f);
        t9Var2.b();
        paint.setColor(i0.a.d(0.0f, f6.w0(null, f6.f23220pg, false), f6.w0(null, f6.f23239qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(s sVar, boolean z10) {
        int i9;
        TLRPC.GroupCallParticipant groupCallParticipant;
        n50[] n50VarArr = sVar.f33794x;
        n0 n0Var = sVar.D.f33835j0;
        if (!n0Var.f33683k && ((groupCallParticipant = n0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (n0Var.f33678e) {
                i9 = 1;
            } else {
                i9 = 0;
            }
        } else {
            i9 = 2;
        }
        if (i9 == sVar.B) {
            return;
        }
        sVar.B = i9;
        if (n50VarArr[i9] == null) {
            n50VarArr[i9] = new n50(i9);
            int i10 = sVar.B;
            if (i10 == 2) {
                n50VarArr[i10].f40597g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{f6.w0(null, f6.f23101ih, false), f6.w0(null, f6.f23137kh, false), f6.w0(null, f6.f23119jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i10 == 1) {
                n50VarArr[i10].f40597g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{f6.w0(null, f6.Fg, false), f6.w0(null, f6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                n50VarArr[i10].f40597g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{f6.w0(null, f6.Jg, false), f6.w0(null, f6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        n50 n50Var = n50VarArr[sVar.B];
        n50 n50Var2 = sVar.f33795y;
        if (n50Var != n50Var2) {
            sVar.A = n50Var2;
            sVar.f33795y = n50Var;
            if (n50Var2 != null && z10) {
                sVar.C = 0.0f;
            } else {
                sVar.C = 1.0f;
                sVar.A = null;
            }
        }
        sVar.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33785a.onAttachedToWindow();
        this.f33786b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33785a.onDetachedFromWindow();
        this.f33786b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        n50 n50Var;
        float f10;
        n50 n50Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        o oVar = this.D.f33821a;
        rectF.set(oVar.getX() + oVar.K, oVar.getY() + oVar.J, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.K, oVar.getY() + oVar.getMeasuredHeight() + oVar.J);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f33786b;
        imageReceiver.setImageCoords(f11, f12, width, height);
        imageReceiver.setRoundRadius((int) oVar.f33774b);
        imageReceiver.draw(canvas);
        float f13 = oVar.f33774b;
        canvas.drawRoundRect(rectF, f13, f13, this.h);
        float f14 = this.f33791r;
        float f15 = this.f33790n;
        if (f14 != f15) {
            float f16 = this.f33792s;
            float f17 = (16.0f * f16) + f15;
            this.f33790n = f17;
            if (f16 > 0.0f) {
                if (f17 > f14) {
                    this.f33790n = f14;
                }
            } else if (f17 < f14) {
                this.f33790n = f14;
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
        float f19 = (this.f33790n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f19, f19, this.v, this.f33793w);
        n50 n50Var3 = this.f33795y;
        if (n50Var3 != null) {
            n50Var3.b((int) (this.f33793w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f33790n);
        }
        float f20 = this.f33790n;
        t9 t9Var = this.f33788e;
        t9Var.e(f20, 1.0f);
        float f21 = this.f33790n;
        t9 t9Var2 = this.d;
        t9Var2.e(f21, 1.0f);
        for (int i9 = 0; i9 < 2; i9++) {
            Paint paint = this.f33789f;
            if (i9 == 0 && (n50Var2 = this.A) != null) {
                paint.setShader(n50Var2.f40597g);
                f10 = 1.0f - this.C;
            } else {
                if (i9 == 1 && (n50Var = this.f33795y) != null) {
                    paint.setShader(n50Var.f40597g);
                    f10 = this.C;
                }
            }
            paint.setAlpha((int) (f10 * 76.0f));
            t9Var.a(this.v, this.f33793w, canvas, paint);
            t9Var2.a(this.v, this.f33793w, canvas, paint);
        }
        canvas.restore();
        float f22 = (this.f33790n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f22, f22, this.v, this.f33793w);
        this.f33785a.draw(canvas);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        super.onMeasure(i9, i10);
        float dp = AndroidUtilities.dp(157.0f);
        this.v = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        if (o50.B3) {
            f10 = 0.0f;
        } else {
            f10 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f33793w = measuredHeight + f10;
        float f11 = dp / 2.0f;
        ImageReceiver imageReceiver = this.f33785a;
        imageReceiver.setRoundRadius((int) f11);
        imageReceiver.setImageCoords(this.v - f11, this.f33793w - f11, dp, dp);
    }
}
