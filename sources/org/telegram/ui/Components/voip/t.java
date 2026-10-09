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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.j9;
import org.telegram.ui.f60;
import org.telegram.ui.g60;
public final class t extends View {
    public f60 E;
    public int F;
    public float G;
    public final u H;
    public final ImageReceiver f32227a;
    public final ImageReceiver f32228b;
    public final j9 f32229c;
    public final da d;
    public final da f32230e;
    public final Paint f32231f;
    public final Paint h;
    public float f32232n;
    public float f32233r;
    public float f32234s;
    public float v;
    public float f32235w;
    public final f60[] f32236x;
    public f60 f32237y;

    public t(u uVar, Context context) {
        super(context);
        this.H = uVar;
        this.f32227a = new ImageReceiver();
        this.f32228b = new ImageReceiver();
        this.f32229c = new j9((e6) null);
        Paint paint = new Paint(1);
        this.f32231f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f32236x = new f60[3];
        this.F = -1;
        this.G = 1.0f;
        da daVar = new da(9);
        this.d = daVar;
        da daVar2 = new da(12);
        this.f32230e = daVar2;
        daVar.f25650a = AndroidUtilities.dp(76.0f);
        daVar.f25651b = AndroidUtilities.dp(92.0f);
        daVar.b();
        daVar2.f25650a = AndroidUtilities.dp(80.0f);
        daVar2.f25651b = AndroidUtilities.dp(95.0f);
        daVar2.b();
        paint.setColor(i0.a.d(0.0f, i6.x0(null, i6.f21027pg, false), i6.x0(null, i6.f21046qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(t tVar, boolean z10) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        f60[] f60VarArr = tVar.f32236x;
        p0 p0Var = tVar.H.f32269n0;
        if (!p0Var.f32158k && ((groupCallParticipant = p0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
            if (p0Var.f32153e) {
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
        if (f60VarArr[i10] == null) {
            f60VarArr[i10] = new f60(i10);
            int i11 = tVar.F;
            if (i11 == 2) {
                f60VarArr[i11].f37461g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{i6.x0(null, i6.f20898ih, false), i6.x0(null, i6.f20936kh, false), i6.x0(null, i6.f20916jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                f60VarArr[i11].f37461g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{i6.x0(null, i6.Fg, false), i6.x0(null, i6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                f60VarArr[i11].f37461g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{i6.x0(null, i6.Jg, false), i6.x0(null, i6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        f60 f60Var = f60VarArr[tVar.F];
        f60 f60Var2 = tVar.f32237y;
        if (f60Var != f60Var2) {
            tVar.E = f60Var2;
            tVar.f32237y = f60Var;
            if (f60Var2 != null && z10) {
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
        this.f32227a.onAttachedToWindow();
        this.f32228b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32227a.onDetachedFromWindow();
        this.f32228b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f60 f60Var;
        float f7;
        f60 f60Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        p pVar = this.H.f32251a;
        rectF.set(pVar.getX() + pVar.O, pVar.getY() + pVar.N, (pVar.getX() + pVar.getMeasuredWidth()) - pVar.O, pVar.getY() + pVar.getMeasuredHeight() + pVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f32228b;
        imageReceiver.setImageCoords(f10, f11, width, height);
        imageReceiver.setRoundRadius((int) pVar.f32212b);
        imageReceiver.draw(canvas);
        float f12 = pVar.f32212b;
        canvas.drawRoundRect(rectF, f12, f12, this.h);
        float f13 = this.f32233r;
        float f14 = this.f32232n;
        if (f13 != f14) {
            float f15 = this.f32234s;
            float f16 = (16.0f * f15) + f14;
            this.f32232n = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.f32232n = f13;
                }
            } else if (f16 < f13) {
                this.f32232n = f13;
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
        float f18 = (this.f32232n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.v, this.f32235w);
        f60 f60Var3 = this.f32237y;
        if (f60Var3 != null) {
            f60Var3.b((int) (this.f32235w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f32232n);
        }
        float f19 = this.f32232n;
        da daVar = this.f32230e;
        daVar.e(f19, 1.0f);
        float f20 = this.f32232n;
        da daVar2 = this.d;
        daVar2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f32231f;
            if (i10 == 0 && (f60Var2 = this.E) != null) {
                paint.setShader(f60Var2.f37461g);
                f7 = 1.0f - this.G;
            } else {
                if (i10 == 1 && (f60Var = this.f32237y) != null) {
                    paint.setShader(f60Var.f37461g);
                    f7 = this.G;
                }
            }
            paint.setAlpha((int) (f7 * 76.0f));
            daVar.a(this.v, this.f32235w, canvas, paint);
            daVar2.a(this.v, this.f32235w, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.f32232n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.v, this.f32235w);
        this.f32227a.draw(canvas);
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
        if (g60.F3) {
            f7 = 0.0f;
        } else {
            f7 = (-getMeasuredHeight()) * 0.12f;
        }
        this.f32235w = measuredHeight + f7;
        float f10 = dp / 2.0f;
        ImageReceiver imageReceiver = this.f32227a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.f32235w - f10, dp, dp);
    }
}
