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
import org.telegram.ui.u50;
import org.telegram.ui.v50;
public final class s extends View implements p6 {
    public u50 E;
    public int F;
    public float G;
    public final t H;
    public final ImageReceiver f34057a;
    public final ImageReceiver f34058b;
    public final j9 f34059c;
    public final fa d;
    public final fa e;
    public final Paint f34060f;
    public final Paint h;
    public float f34061n;
    public float f34062r;
    public float f34063s;
    public float v;
    public float f34064w;
    public final u50[] f34065x;
    public u50 f34066y;

    public s(t tVar, Context context) {
        super(context);
        this.H = tVar;
        this.f34057a = new ImageReceiver();
        this.f34058b = new ImageReceiver();
        this.f34059c = new j9((u6) null);
        Paint paint = new Paint(1);
        this.f34060f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f34065x = new u50[3];
        this.F = -1;
        this.G = 1.0f;
        fa faVar = new fa(9);
        this.d = faVar;
        fa faVar2 = new fa(12);
        this.e = faVar2;
        faVar.f28111a = AndroidUtilities.dp(76.0f);
        faVar.f28112b = AndroidUtilities.dp(92.0f);
        faVar.b();
        faVar2.f28111a = AndroidUtilities.dp(80.0f);
        faVar2.f28112b = AndroidUtilities.dp(95.0f);
        faVar2.b();
        paint.setColor(i0.a.f(0.0f, y6.x0(null, y6.f23588pg, false), y6.x0(null, y6.f23605qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.o(-16777216, 127));
    }

    public static void a(s sVar, boolean z10) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        u50[] u50VarArr = sVar.f34065x;
        o0 o0Var = sVar.H.f34091n0;
        if (!o0Var.f33987k && ((groupCallParticipant = o0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
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
        if (u50VarArr[i10] == null) {
            u50VarArr[i10] = new u50(i10);
            int i11 = sVar.F;
            if (i11 == 2) {
                u50VarArr[i11].f44021g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{y6.x0(null, y6.f23456ih, false), y6.x0(null, y6.f23495kh, false), y6.x0(null, y6.f23475jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                u50VarArr[i11].f44021g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{y6.x0(null, y6.Fg, false), y6.x0(null, y6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                u50VarArr[i11].f44021g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{y6.x0(null, y6.Jg, false), y6.x0(null, y6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        u50 u50Var = u50VarArr[sVar.F];
        u50 u50Var2 = sVar.f34066y;
        if (u50Var != u50Var2) {
            sVar.E = u50Var2;
            sVar.f34066y = u50Var;
            if (u50Var2 != null && z10) {
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
        this.f34057a.onAttachedToWindow();
        this.f34058b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34057a.onDetachedFromWindow();
        this.f34058b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        u50 u50Var;
        float f7;
        u50 u50Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        o oVar = this.H.f34074a;
        rectF.set(oVar.getX() + oVar.O, oVar.getY() + oVar.N, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.O, oVar.getY() + oVar.getMeasuredHeight() + oVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f34058b;
        imageReceiver.setImageCoords(f10, f11, width, height);
        imageReceiver.setRoundRadius((int) oVar.f34114b);
        imageReceiver.draw(canvas);
        float f12 = oVar.f34114b;
        canvas.drawRoundRect(rectF, f12, f12, this.h);
        float f13 = this.f34062r;
        float f14 = this.f34061n;
        if (f13 != f14) {
            float f15 = this.f34063s;
            float f16 = (16.0f * f15) + f14;
            this.f34061n = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.f34061n = f13;
                }
            } else if (f16 < f13) {
                this.f34061n = f13;
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
        float f18 = (this.f34061n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.v, this.f34064w);
        u50 u50Var3 = this.f34066y;
        if (u50Var3 != null) {
            u50Var3.b((int) (this.f34064w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f34061n);
        }
        float f19 = this.f34061n;
        fa faVar = this.e;
        faVar.e(f19, 1.0f);
        float f20 = this.f34061n;
        fa faVar2 = this.d;
        faVar2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f34060f;
            if (i10 == 0 && (u50Var2 = this.E) != null) {
                paint.setShader(u50Var2.f44021g);
                f7 = 1.0f - this.G;
            } else {
                if (i10 == 1 && (u50Var = this.f34066y) != null) {
                    paint.setShader(u50Var.f44021g);
                    f7 = this.G;
                }
            }
            paint.setAlpha((int) (f7 * 76.0f));
            faVar.a(this.v, this.f34064w, canvas, paint);
            faVar2.a(this.v, this.f34064w, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.f34061n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.v, this.f34064w);
        this.f34057a.draw(canvas);
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
        if (v50.F3) {
            f7 = 0.0f;
        } else {
            f7 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f34064w = measuredHeight + f7;
        float f10 = dp / 2.0f;
        ImageReceiver imageReceiver = this.f34057a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.f34064w - f10, dp, dp);
    }

    @Override
    public final void updateColors() {
        try {
            this.f34060f.setColor(i0.a.f(0.0f, y6.x0(null, y6.f23588pg, false), y6.x0(null, y6.f23605qg, false)));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
