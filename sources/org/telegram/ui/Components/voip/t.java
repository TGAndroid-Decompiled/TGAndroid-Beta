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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.h9;
import org.telegram.ui.h60;
import org.telegram.ui.i60;
public final class t extends View {
    public h60 E;
    public int F;
    public float G;
    public final u H;
    public final ImageReceiver f29515a;
    public final ImageReceiver f29516b;
    public final h9 f29517c;
    public final ba d;
    public final ba e;
    public final Paint f29518f;
    public final Paint h;
    public float f29519n;
    public float f29520r;
    public float f29521s;
    public float v;
    public float f29522w;
    public final h60[] f29523x;
    public h60 f29524y;

    public t(u uVar, Context context) {
        super(context);
        this.H = uVar;
        this.f29515a = new ImageReceiver();
        this.f29516b = new ImageReceiver();
        this.f29517c = new h9((e6) null);
        Paint paint = new Paint(1);
        this.f29518f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f29523x = new h60[3];
        this.F = -1;
        this.G = 1.0f;
        ba baVar = new ba(9);
        this.d = baVar;
        ba baVar2 = new ba(12);
        this.e = baVar2;
        baVar.f22900a = AndroidUtilities.dp(76.0f);
        baVar.f22901b = AndroidUtilities.dp(92.0f);
        baVar.b();
        baVar2.f22900a = AndroidUtilities.dp(80.0f);
        baVar2.f22901b = AndroidUtilities.dp(95.0f);
        baVar2.b();
        paint.setColor(i0.a.d(0.0f, j6.w0(null, j6.f19292pg, false), j6.w0(null, j6.f19310qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(t tVar, boolean z10) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        h60[] h60VarArr = tVar.f29523x;
        p0 p0Var = tVar.H.f29553n0;
        if (!p0Var.f29452k && ((groupCallParticipant = p0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (p0Var.e) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 2;
        }
        if (i10 == tVar.F) {
            return;
        }
        tVar.F = i10;
        if (h60VarArr[i10] == null) {
            h60VarArr[i10] = new h60(i10);
            int i11 = tVar.F;
            if (i11 == 2) {
                h60VarArr[i11].f34087g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{j6.w0(null, j6.f19162ih, false), j6.w0(null, j6.f19201kh, false), j6.w0(null, j6.f19181jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                h60VarArr[i11].f34087g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{j6.w0(null, j6.Fg, false), j6.w0(null, j6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                h60VarArr[i11].f34087g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{j6.w0(null, j6.Jg, false), j6.w0(null, j6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        h60 h60Var = h60VarArr[tVar.F];
        h60 h60Var2 = tVar.f29524y;
        if (h60Var != h60Var2) {
            tVar.E = h60Var2;
            tVar.f29524y = h60Var;
            if (h60Var2 != null && z10) {
                tVar.G = 0.0f;
            } else {
                tVar.G = 1.0f;
                tVar.E = null;
            }
        }
        tVar.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29515a.onAttachedToWindow();
        this.f29516b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29515a.onDetachedFromWindow();
        this.f29516b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        h60 h60Var;
        float f7;
        h60 h60Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        p pVar = this.H.f29536a;
        rectF.set(pVar.getX() + pVar.O, pVar.getY() + pVar.N, (pVar.getX() + pVar.getMeasuredWidth()) - pVar.O, pVar.getY() + pVar.getMeasuredHeight() + pVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f29516b;
        imageReceiver.setImageCoords(f10, f11, width, height);
        imageReceiver.setRoundRadius((int) pVar.f29501b);
        imageReceiver.draw(canvas);
        float f12 = pVar.f29501b;
        canvas.drawRoundRect(rectF, f12, f12, this.h);
        float f13 = this.f29520r;
        float f14 = this.f29519n;
        if (f13 != f14) {
            float f15 = this.f29521s;
            float f16 = (16.0f * f15) + f14;
            this.f29519n = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.f29519n = f13;
                }
            } else if (f16 < f13) {
                this.f29519n = f13;
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
        float f18 = (this.f29519n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.v, this.f29522w);
        h60 h60Var3 = this.f29524y;
        if (h60Var3 != null) {
            h60Var3.b((int) (this.f29522w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f29519n);
        }
        float f19 = this.f29519n;
        ba baVar = this.e;
        baVar.e(f19, 1.0f);
        float f20 = this.f29519n;
        ba baVar2 = this.d;
        baVar2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f29518f;
            if (i10 == 0 && (h60Var2 = this.E) != null) {
                paint.setShader(h60Var2.f34087g);
                f7 = 1.0f - this.G;
            } else {
                if (i10 == 1 && (h60Var = this.f29524y) != null) {
                    paint.setShader(h60Var.f34087g);
                    f7 = this.G;
                }
            }
            paint.setAlpha((int) (f7 * 76.0f));
            baVar.a(this.v, this.f29522w, canvas, paint);
            baVar2.a(this.v, this.f29522w, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.f29519n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.v, this.f29522w);
        this.f29515a.draw(canvas);
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
        this.f29522w = measuredHeight + f7;
        float f10 = dp / 2.0f;
        ImageReceiver imageReceiver = this.f29515a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.f29522w - f10, dp, dp);
    }
}
