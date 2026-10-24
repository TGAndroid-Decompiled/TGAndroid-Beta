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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.z9;
import org.telegram.ui.t50;
import org.telegram.ui.u50;
public final class s extends View implements b6 {
    public t50 E;
    public int F;
    public float G;
    public final t H;
    public final ImageReceiver f31828a;
    public final ImageReceiver f31829b;
    public final f9 f31830c;
    public final z9 d;
    public final z9 e;
    public final Paint f31831f;
    public final Paint h;
    public float f31832n;
    public float f31833r;
    public float f31834s;
    public float v;
    public float f31835w;
    public final t50[] f31836x;
    public t50 f31837y;

    public s(t tVar, Context context) {
        super(context);
        this.H = tVar;
        this.f31828a = new ImageReceiver();
        this.f31829b = new ImageReceiver();
        this.f31830c = new f9((g6) null);
        Paint paint = new Paint(1);
        this.f31831f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f31836x = new t50[3];
        this.F = -1;
        this.G = 1.0f;
        z9 z9Var = new z9(9);
        this.d = z9Var;
        z9 z9Var2 = new z9(12);
        this.e = z9Var2;
        z9Var.f33181a = AndroidUtilities.dp(76.0f);
        z9Var.f33182b = AndroidUtilities.dp(92.0f);
        z9Var.b();
        z9Var2.f33181a = AndroidUtilities.dp(80.0f);
        z9Var2.f33182b = AndroidUtilities.dp(95.0f);
        z9Var2.b();
        paint.setColor(i0.a.f(0.0f, k6.x0(null, k6.f21412pg, false), k6.x0(null, k6.f21431qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.o(-16777216, 127));
    }

    public static void a(s sVar, boolean z10) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        t50[] t50VarArr = sVar.f31836x;
        o0 o0Var = sVar.H.f31880n0;
        if (!o0Var.f31763k && ((groupCallParticipant = o0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
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
        if (t50VarArr[i10] == null) {
            t50VarArr[i10] = new t50(i10);
            int i11 = sVar.F;
            if (i11 == 2) {
                t50VarArr[i11].f41883g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{k6.x0(null, k6.f21282ih, false), k6.x0(null, k6.f21321kh, false), k6.x0(null, k6.f21302jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                t50VarArr[i11].f41883g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{k6.x0(null, k6.Fg, false), k6.x0(null, k6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                t50VarArr[i11].f41883g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{k6.x0(null, k6.Jg, false), k6.x0(null, k6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        t50 t50Var = t50VarArr[sVar.F];
        t50 t50Var2 = sVar.f31837y;
        if (t50Var != t50Var2) {
            sVar.E = t50Var2;
            sVar.f31837y = t50Var;
            if (t50Var2 != null && z10) {
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
        this.f31828a.onAttachedToWindow();
        this.f31829b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31828a.onDetachedFromWindow();
        this.f31829b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        t50 t50Var;
        float f7;
        t50 t50Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        o oVar = this.H.f31863a;
        rectF.set(oVar.getX() + oVar.O, oVar.getY() + oVar.N, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.O, oVar.getY() + oVar.getMeasuredHeight() + oVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f31829b;
        imageReceiver.setImageCoords(f10, f11, width, height);
        imageReceiver.setRoundRadius((int) oVar.f31801b);
        imageReceiver.draw(canvas);
        float f12 = oVar.f31801b;
        canvas.drawRoundRect(rectF, f12, f12, this.h);
        float f13 = this.f31833r;
        float f14 = this.f31832n;
        if (f13 != f14) {
            float f15 = this.f31834s;
            float f16 = (16.0f * f15) + f14;
            this.f31832n = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.f31832n = f13;
                }
            } else if (f16 < f13) {
                this.f31832n = f13;
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
        float f18 = (this.f31832n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.v, this.f31835w);
        t50 t50Var3 = this.f31837y;
        if (t50Var3 != null) {
            t50Var3.b((int) (this.f31835w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f31832n);
        }
        float f19 = this.f31832n;
        z9 z9Var = this.e;
        z9Var.e(f19, 1.0f);
        float f20 = this.f31832n;
        z9 z9Var2 = this.d;
        z9Var2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f31831f;
            if (i10 == 0 && (t50Var2 = this.E) != null) {
                paint.setShader(t50Var2.f41883g);
                f7 = 1.0f - this.G;
            } else {
                if (i10 == 1 && (t50Var = this.f31837y) != null) {
                    paint.setShader(t50Var.f41883g);
                    f7 = this.G;
                }
            }
            paint.setAlpha((int) (f7 * 76.0f));
            z9Var.a(this.v, this.f31835w, canvas, paint);
            z9Var2.a(this.v, this.f31835w, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.f31832n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.v, this.f31835w);
        this.f31828a.draw(canvas);
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
        if (u50.F3) {
            f7 = 0.0f;
        } else {
            f7 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f31835w = measuredHeight + f7;
        float f10 = dp / 2.0f;
        ImageReceiver imageReceiver = this.f31828a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.f31835w - f10, dp, dp);
    }

    @Override
    public final void updateColors() {
        try {
            this.f31831f.setColor(i0.a.f(0.0f, k6.x0(null, k6.f21412pg, false), k6.x0(null, k6.f21431qg, false)));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
