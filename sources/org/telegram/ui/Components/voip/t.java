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
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.g9;
import org.telegram.ui.h60;
import org.telegram.ui.i60;
public final class t extends View {
    public h60 E;
    public int F;
    public float G;
    public final u H;
    public final ImageReceiver f29584a;
    public final ImageReceiver f29585b;
    public final g9 f29586c;
    public final aa d;
    public final aa e;
    public final Paint f29587f;
    public final Paint h;
    public float f29588n;
    public float f29589r;
    public float f29590s;
    public float v;
    public float f29591w;
    public final h60[] f29592x;
    public h60 f29593y;

    public t(u uVar, Context context) {
        super(context);
        this.H = uVar;
        this.f29584a = new ImageReceiver();
        this.f29585b = new ImageReceiver();
        this.f29586c = new g9((f6) null);
        Paint paint = new Paint(1);
        this.f29587f = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.f29592x = new h60[3];
        this.F = -1;
        this.G = 1.0f;
        aa aaVar = new aa(9);
        this.d = aaVar;
        aa aaVar2 = new aa(12);
        this.e = aaVar2;
        aaVar.f22580a = AndroidUtilities.dp(76.0f);
        aaVar.f22581b = AndroidUtilities.dp(92.0f);
        aaVar.b();
        aaVar2.f22580a = AndroidUtilities.dp(80.0f);
        aaVar2.f22581b = AndroidUtilities.dp(95.0f);
        aaVar2.b();
        paint.setColor(i0.a.d(0.0f, j6.w0(null, j6.f19339pg, false), j6.w0(null, j6.f19357qg, false)));
        paint.setAlpha(102);
        paint2.setColor(i0.a.k(-16777216, 127));
    }

    public static void a(t tVar, boolean z10) {
        int i10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        h60[] h60VarArr = tVar.f29592x;
        p0 p0Var = tVar.H.f29622n0;
        if (!p0Var.f29521k && ((groupCallParticipant = p0Var.h) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
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
                h60VarArr[i11].f34146g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{j6.w0(null, j6.f19209ih, false), j6.w0(null, j6.f19248kh, false), j6.w0(null, j6.f19228jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 == 1) {
                h60VarArr[i11].f34146g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{j6.w0(null, j6.Fg, false), j6.w0(null, j6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                h60VarArr[i11].f34146g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{j6.w0(null, j6.Jg, false), j6.w0(null, j6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        h60 h60Var = h60VarArr[tVar.F];
        h60 h60Var2 = tVar.f29593y;
        if (h60Var != h60Var2) {
            tVar.E = h60Var2;
            tVar.f29593y = h60Var;
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
        this.f29584a.onAttachedToWindow();
        this.f29585b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29584a.onDetachedFromWindow();
        this.f29585b.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        h60 h60Var;
        float f7;
        h60 h60Var2;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        p pVar = this.H.f29605a;
        rectF.set(pVar.getX() + pVar.O, pVar.getY() + pVar.N, (pVar.getX() + pVar.getMeasuredWidth()) - pVar.O, pVar.getY() + pVar.getMeasuredHeight() + pVar.N);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        ImageReceiver imageReceiver = this.f29585b;
        imageReceiver.setImageCoords(f10, f11, width, height);
        imageReceiver.setRoundRadius((int) pVar.f29570b);
        imageReceiver.draw(canvas);
        float f12 = pVar.f29570b;
        canvas.drawRoundRect(rectF, f12, f12, this.h);
        float f13 = this.f29589r;
        float f14 = this.f29588n;
        if (f13 != f14) {
            float f15 = this.f29590s;
            float f16 = (16.0f * f15) + f14;
            this.f29588n = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.f29588n = f13;
                }
            } else if (f16 < f13) {
                this.f29588n = f13;
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
        float f18 = (this.f29588n * 0.8f) + 1.0f;
        canvas.save();
        canvas.scale(f18, f18, this.v, this.f29591w);
        h60 h60Var3 = this.f29593y;
        if (h60Var3 != null) {
            h60Var3.b((int) (this.f29591w - AndroidUtilities.dp(100.0f)), (int) (this.v - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.f29588n);
        }
        float f19 = this.f29588n;
        aa aaVar = this.e;
        aaVar.e(f19, 1.0f);
        float f20 = this.f29588n;
        aa aaVar2 = this.d;
        aaVar2.e(f20, 1.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            Paint paint = this.f29587f;
            if (i10 == 0 && (h60Var2 = this.E) != null) {
                paint.setShader(h60Var2.f34146g);
                f7 = 1.0f - this.G;
            } else {
                if (i10 == 1 && (h60Var = this.f29593y) != null) {
                    paint.setShader(h60Var.f34146g);
                    f7 = this.G;
                }
            }
            paint.setAlpha((int) (f7 * 76.0f));
            aaVar.a(this.v, this.f29591w, canvas, paint);
            aaVar2.a(this.v, this.f29591w, canvas, paint);
        }
        canvas.restore();
        float f21 = (this.f29588n * 0.2f) + 1.0f;
        canvas.save();
        canvas.scale(f21, f21, this.v, this.f29591w);
        this.f29584a.draw(canvas);
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
        this.f29591w = measuredHeight + f7;
        float f10 = dp / 2.0f;
        ImageReceiver imageReceiver = this.f29584a;
        imageReceiver.setRoundRadius((int) f10);
        imageReceiver.setImageCoords(this.v - f10, this.f29591w - f10, dp, dp);
    }
}
