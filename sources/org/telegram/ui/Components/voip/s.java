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
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.g9;
import org.telegram.ui.i60;
import org.telegram.ui.j60;
public final class s extends View {
    public i60 E;
    public int F;
    public float G;
    public final t H;
    public final ImageReceiver f28388a;
    public final ImageReceiver f28389b;
    public final g9 f28390c;
    public final ba d;
    public final ba e;
    public final Paint f28391f;
    public final Paint h;
    public float f28392n;
    public float f28393r;
    public float f28394s;
    public float v;
    public float f28395w;
    public final i60[] f28396x;
    public i60 f28397y;

    public s(t tVar, Context context) {
        super(context);
        this.H = tVar;
        this.f28388a = new ImageReceiver();
        this.f28389b = new ImageReceiver();
        this.f28390c = new g9((f6) null);
        Paint paint = new Paint(1);
        this.f28391f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f28396x = new i60[3];
        this.F = -1;
        this.G = 1.0f;
        ba baVar = new ba(9);
        this.d = baVar;
        ba baVar2 = new ba(12);
        this.e = baVar2;
        baVar.f21768a = AndroidUtilities.dp(76.0f);
        baVar.f21769b = AndroidUtilities.dp(92.0f);
        baVar.b();
        baVar2.f21768a = AndroidUtilities.dp(80.0f);
        baVar2.f21769b = AndroidUtilities.dp(95.0f);
        baVar2.b();
        paint.setColor(i0.a.d(0.0f, j6.w0(null, j6.f18153pg, false), j6.w0(null, j6.f18171qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(s sVar, boolean z10) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        i60[] i60VarArr = sVar.f28396x;
        p0 p0Var = sVar.H.f28426n0;
        if (!p0Var.f28335k && ((groupCallParticipant = p0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (p0Var.e) {
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
        if (i60VarArr[i10] == null) {
            i60VarArr[i10] = new i60(i10);
            int i11 = sVar.F;
            if (i11 == 2) {
                i60VarArr[i11].f33544g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{j6.w0(null, j6.f18027ih, false), j6.w0(null, j6.f18066kh, false), j6.w0(null, j6.f18046jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                i60VarArr[i11].f33544g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{j6.w0(null, j6.Fg, false), j6.w0(null, j6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                i60VarArr[i11].f33544g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{j6.w0(null, j6.Jg, false), j6.w0(null, j6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        i60 i60Var = i60VarArr[sVar.F];
        i60 i60Var2 = sVar.f28397y;
        if (i60Var != i60Var2) {
            sVar.E = i60Var2;
            sVar.f28397y = i60Var;
            if (i60Var2 != null && z10) {
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
        this.f28388a.onAttachedToWindow();
        this.f28389b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28388a.onDetachedFromWindow();
        this.f28389b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        i60 i60Var;
        float f7;
        i60 i60Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        o oVar = this.H.f28409a;
        rectF.set(oVar.getX() + oVar.O, oVar.getY() + oVar.N, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.O, oVar.getY() + oVar.getMeasuredHeight() + oVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f28389b;
        imageReceiver.setImageCoords(f10, f11, width, height);
        imageReceiver.setRoundRadius((int) oVar.f28374b);
        imageReceiver.draw(canvas);
        float f12 = oVar.f28374b;
        canvas.drawRoundRect(rectF, f12, f12, this.h);
        float f13 = this.f28393r;
        float f14 = this.f28392n;
        if (f13 != f14) {
            float f15 = this.f28394s;
            float f16 = (16.0f * f15) + f14;
            this.f28392n = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.f28392n = f13;
                }
            } else if (f16 < f13) {
                this.f28392n = f13;
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
        float f18 = (this.f28392n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.v, this.f28395w);
        i60 i60Var3 = this.f28397y;
        if (i60Var3 != null) {
            i60Var3.b((int) (this.f28395w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f28392n);
        }
        float f19 = this.f28392n;
        ba baVar = this.e;
        baVar.e(f19, 1.0f);
        float f20 = this.f28392n;
        ba baVar2 = this.d;
        baVar2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f28391f;
            if (i10 == 0 && (i60Var2 = this.E) != null) {
                paint.setShader(i60Var2.f33544g);
                f7 = 1.0f - this.G;
            } else {
                if (i10 == 1 && (i60Var = this.f28397y) != null) {
                    paint.setShader(i60Var.f33544g);
                    f7 = this.G;
                }
            }
            paint.setAlpha((int) (f7 * 76.0f));
            baVar.a(this.v, this.f28395w, canvas, paint);
            baVar2.a(this.v, this.f28395w, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.f28392n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.v, this.f28395w);
        this.f28388a.draw(canvas);
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
        if (j60.F3) {
            f7 = 0.0f;
        } else {
            f7 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f28395w = measuredHeight + f7;
        float f10 = dp / 2.0f;
        ImageReceiver imageReceiver = this.f28388a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.f28395w - f10, dp, dp);
    }
}
