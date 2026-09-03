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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.d60;
import org.telegram.ui.e60;
public final class s extends View {
    public d60 B;
    public int C;
    public float D;
    public final t E;
    public final ImageReceiver f29851a;
    public final ImageReceiver f29852b;
    public final z8 f29853c;
    public final u9 d;
    public final u9 e;
    public final Paint f29854f;
    public final Paint h;
    public float f29855n;
    public float f29856r;
    public float f29857s;
    public float v;
    public float f29858w;
    public final d60[] f29859x;
    public d60 f29860y;

    public s(t tVar, Context context) {
        super(context);
        this.E = tVar;
        this.f29851a = new ImageReceiver();
        this.f29852b = new ImageReceiver();
        this.f29853c = new z8((f6) null);
        Paint paint = new Paint(1);
        this.f29854f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f29859x = new d60[3];
        this.C = -1;
        this.D = 1.0f;
        u9 u9Var = new u9(9);
        this.d = u9Var;
        u9 u9Var2 = new u9(12);
        this.e = u9Var2;
        u9Var.f29139a = AndroidUtilities.dp(76.0f);
        u9Var.f29140b = AndroidUtilities.dp(92.0f);
        u9Var.b();
        u9Var2.f29139a = AndroidUtilities.dp(80.0f);
        u9Var2.f29140b = AndroidUtilities.dp(95.0f);
        u9Var2.b();
        paint.setColor(i0.a.d(0.0f, j6.w0(null, j6.f20106pg, false), j6.w0(null, j6.f20123qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(s sVar, boolean z4) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        d60[] d60VarArr = sVar.f29859x;
        n0 n0Var = sVar.E.f29905k0;
        if (!n0Var.f29765k && ((groupCallParticipant = n0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (n0Var.e) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 2;
        }
        if (i10 == sVar.C) {
            return;
        }
        sVar.C = i10;
        if (d60VarArr[i10] == null) {
            d60VarArr[i10] = new d60(i10);
            int i11 = sVar.C;
            if (i11 == 2) {
                d60VarArr[i11].f33338g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{j6.w0(null, j6.f19980ih, false), j6.w0(null, j6.f20017kh, false), j6.w0(null, j6.f19998jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                d60VarArr[i11].f33338g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{j6.w0(null, j6.Fg, false), j6.w0(null, j6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                d60VarArr[i11].f33338g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{j6.w0(null, j6.Jg, false), j6.w0(null, j6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        d60 d60Var = d60VarArr[sVar.C];
        d60 d60Var2 = sVar.f29860y;
        if (d60Var != d60Var2) {
            sVar.B = d60Var2;
            sVar.f29860y = d60Var;
            if (d60Var2 != null && z4) {
                sVar.D = 0.0f;
            } else {
                sVar.D = 1.0f;
                sVar.B = null;
            }
        }
        sVar.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29851a.onAttachedToWindow();
        this.f29852b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29851a.onDetachedFromWindow();
        this.f29852b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        d60 d60Var;
        float f10;
        d60 d60Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        o oVar = this.E.f29891a;
        rectF.set(oVar.getX() + oVar.L, oVar.getY() + oVar.K, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.L, oVar.getY() + oVar.getMeasuredHeight() + oVar.K);
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f29852b;
        imageReceiver.setImageCoords(f11, f12, width, height);
        imageReceiver.setRoundRadius((int) oVar.f29880b);
        imageReceiver.draw(canvas);
        float f13 = oVar.f29880b;
        canvas.drawRoundRect(rectF, f13, f13, this.h);
        float f14 = this.f29856r;
        float f15 = this.f29855n;
        if (f14 != f15) {
            float f16 = this.f29857s;
            float f17 = (16.0f * f16) + f15;
            this.f29855n = f17;
            if (f16 > 0.0f) {
                if (f17 > f14) {
                    this.f29855n = f14;
                }
            } else if (f17 < f14) {
                this.f29855n = f14;
            }
        }
        float f18 = this.D;
        if (f18 != 1.0f) {
            if (this.B != null) {
                this.D = f18 + 0.07272727f;
            }
            if (this.D >= 1.0f) {
                this.D = 1.0f;
                this.B = null;
            }
        }
        float f19 = (this.f29855n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f19, f19, this.v, this.f29858w);
        d60 d60Var3 = this.f29860y;
        if (d60Var3 != null) {
            d60Var3.b((int) (this.f29858w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f29855n);
        }
        float f20 = this.f29855n;
        u9 u9Var = this.e;
        u9Var.e(f20, 1.0f);
        float f21 = this.f29855n;
        u9 u9Var2 = this.d;
        u9Var2.e(f21, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f29854f;
            if (i10 == 0 && (d60Var2 = this.B) != null) {
                paint.setShader(d60Var2.f33338g);
                f10 = 1.0f - this.D;
            } else {
                if (i10 == 1 && (d60Var = this.f29860y) != null) {
                    paint.setShader(d60Var.f33338g);
                    f10 = this.D;
                }
            }
            paint.setAlpha((int) (f10 * 76.0f));
            u9Var.a(this.v, this.f29858w, canvas, paint);
            u9Var2.a(this.v, this.f29858w, canvas, paint);
        }
        canvas.restore();
        float f22 = (this.f29855n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f22, f22, this.v, this.f29858w);
        this.f29851a.draw(canvas);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        super.onMeasure(i10, i11);
        float dp = AndroidUtilities.dp(157.0f);
        this.v = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        if (e60.C3) {
            f10 = 0.0f;
        } else {
            f10 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f29858w = measuredHeight + f10;
        float f11 = dp / 2.0f;
        ImageReceiver imageReceiver = this.f29851a;
        imageReceiver.setRoundRadius((int) f11);
        imageReceiver.setImageCoords(this.v - f11, this.f29858w - f11, dp, dp);
    }
}
