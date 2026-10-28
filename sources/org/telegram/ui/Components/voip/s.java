package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.j9;
import org.telegram.ui.w50;
import org.telegram.ui.x50;
public final class s extends View implements p6 {
    public w50 E;
    public int F;
    public float G;
    public final t H;
    public final ImageReceiver f34162a;
    public final ImageReceiver f34163b;
    public final j9 f34164c;
    public final fa d;
    public final fa e;
    public final Paint f34165f;
    public final Paint h;
    public float f34166n;
    public float f34167r;
    public float f34168s;
    public float v;
    public float f34169w;
    public final w50[] f34170x;
    public w50 f34171y;

    public s(t tVar, Context context) {
        super(context);
        this.H = tVar;
        this.f34162a = new ImageReceiver();
        this.f34163b = new ImageReceiver();
        this.f34164c = new j9((u6) null);
        Paint paint = new Paint(1);
        this.f34165f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f34170x = new w50[3];
        this.F = -1;
        this.G = 1.0f;
        fa faVar = new fa(9);
        this.d = faVar;
        fa faVar2 = new fa(12);
        this.e = faVar2;
        faVar.f28065a = AndroidUtilities.dp(76.0f);
        faVar.f28066b = AndroidUtilities.dp(92.0f);
        faVar.b();
        faVar2.f28065a = AndroidUtilities.dp(80.0f);
        faVar2.f28066b = AndroidUtilities.dp(95.0f);
        faVar2.b();
        paint.setColor(i0.a.f(0.0f, y6.x0(null, y6.f23589pg, false), y6.x0(null, y6.f23606qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.o(-16777216, 127));
    }

    public static void a(s sVar, boolean z10) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        w50[] w50VarArr = sVar.f34170x;
        o0 o0Var = sVar.H.f34196n0;
        if (!o0Var.f34092k && ((groupCallParticipant = o0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
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
        if (w50VarArr[i10] == null) {
            w50VarArr[i10] = new w50(i10);
            int i11 = sVar.F;
            if (i11 == 2) {
                w50VarArr[i11].f44520g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{y6.x0(null, y6.f23457ih, false), y6.x0(null, y6.f23496kh, false), y6.x0(null, y6.f23476jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                w50VarArr[i11].f44520g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{y6.x0(null, y6.Fg, false), y6.x0(null, y6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                w50VarArr[i11].f44520g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{y6.x0(null, y6.Jg, false), y6.x0(null, y6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        w50 w50Var = w50VarArr[sVar.F];
        w50 w50Var2 = sVar.f34171y;
        if (w50Var != w50Var2) {
            sVar.E = w50Var2;
            sVar.f34171y = w50Var;
            if (w50Var2 != null && z10) {
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
        this.f34162a.onAttachedToWindow();
        this.f34163b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34162a.onDetachedFromWindow();
        this.f34163b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        w50 w50Var;
        float f7;
        w50 w50Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        o oVar = this.H.f34179a;
        rectF.set(oVar.getX() + oVar.O, oVar.getY() + oVar.N, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.O, oVar.getY() + oVar.getMeasuredHeight() + oVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f34163b;
        imageReceiver.setImageCoords(f10, f11, width, height);
        imageReceiver.setRoundRadius((int) oVar.f34219b);
        imageReceiver.draw(canvas);
        float f12 = oVar.f34219b;
        canvas.drawRoundRect(rectF, f12, f12, this.h);
        float f13 = this.f34167r;
        float f14 = this.f34166n;
        if (f13 != f14) {
            float f15 = this.f34168s;
            float f16 = (16.0f * f15) + f14;
            this.f34166n = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.f34166n = f13;
                }
            } else if (f16 < f13) {
                this.f34166n = f13;
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
        float f18 = (this.f34166n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.v, this.f34169w);
        w50 w50Var3 = this.f34171y;
        if (w50Var3 != null) {
            w50Var3.b((int) (this.f34169w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f34166n);
        }
        float f19 = this.f34166n;
        fa faVar = this.e;
        faVar.e(f19, 1.0f);
        float f20 = this.f34166n;
        fa faVar2 = this.d;
        faVar2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f34165f;
            if (i10 == 0 && (w50Var2 = this.E) != null) {
                paint.setShader(w50Var2.f44520g);
                f7 = 1.0f - this.G;
            } else {
                if (i10 == 1 && (w50Var = this.f34171y) != null) {
                    paint.setShader(w50Var.f44520g);
                    f7 = this.G;
                }
            }
            paint.setAlpha((int) (f7 * 76.0f));
            faVar.a(this.v, this.f34169w, canvas, paint);
            faVar2.a(this.v, this.f34169w, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.f34166n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.v, this.f34169w);
        this.f34162a.draw(canvas);
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
        if (x50.F3) {
            f7 = 0.0f;
        } else {
            f7 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f34169w = measuredHeight + f7;
        float f10 = dp / 2.0f;
        ImageReceiver imageReceiver = this.f34162a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.f34169w - f10, dp, dp);
    }

    @Override
    public final void updateColors() {
        try {
            this.f34165f.setColor(i0.a.f(0.0f, y6.x0(null, y6.f23589pg, false), y6.x0(null, y6.f23606qg, false)));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
