package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.pc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m5;
public final class v2 extends View {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final m1 I;
    public final Paint J;
    public final Rect K;
    public final boolean L;
    public final j3[] f41287a;
    public final j3[] f41288b;
    public ValueAnimator f41289c;
    public int d;
    public int f41290e;
    public int f41291f;
    public int h;
    public int f41292n;
    public int f41293r;
    public int f41294s;
    public int f41295w;
    public int f41296x;
    public int f41297y;

    public v2(Activity activity, TLRPC.User user, m1 m1Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.J = paint;
        this.K = new Rect();
        boolean e10 = pc.e(512);
        this.L = e10;
        this.I = m1Var;
        if (!e10) {
            return;
        }
        this.f41287a = new j3[]{new j3(user, this, org.telegram.messenger.g0.L(32.0f)), new j3(user, this, org.telegram.messenger.g0.L(28.0f)), new j3(user, this, org.telegram.messenger.g0.L(35.0f)), new j3(user, this, org.telegram.messenger.g0.L(28.0f)), new j3(user, this, org.telegram.messenger.g0.L(26.0f))};
        this.f41288b = new j3[]{new j3(user, this, org.telegram.messenger.g0.L(32.0f)), new j3(user, this, org.telegram.messenger.g0.L(28.0f)), new j3(user, this, org.telegram.messenger.g0.L(35.0f)), new j3(user, this, org.telegram.messenger.g0.L(28.0f)), new j3(user, this, org.telegram.messenger.g0.L(26.0f))};
        m1Var.a(this);
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public final void a() {
        if (!this.L || this.E) {
            return;
        }
        this.E = true;
        int L = org.telegram.messenger.g0.L(12.0f);
        this.G = L;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, L);
        this.f41289c = ofInt;
        ofInt.addUpdateListener(new u2(this, 0));
        this.f41289c.setInterpolator(kr.f36859g);
        this.f41289c.setDuration(200L);
        this.f41289c.start();
    }

    @Override
    public final void onAttachedToWindow() {
        j3[] j3VarArr;
        j3[] j3VarArr2;
        super.onAttachedToWindow();
        if (this.L) {
            for (j3 j3Var : this.f41287a) {
                m5 m5Var = j3Var.f40960a;
                if (m5Var != null) {
                    m5Var.a();
                    ValueAnimator valueAnimator = j3Var.f40961b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (j3 j3Var2 : this.f41288b) {
                m5 m5Var2 = j3Var2.f40960a;
                if (m5Var2 != null) {
                    m5Var2.a();
                    ValueAnimator valueAnimator2 = j3Var2.f40961b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        j3[] j3VarArr;
        j3[] j3VarArr2;
        super.onDetachedFromWindow();
        if (this.L) {
            for (j3 j3Var : this.f41287a) {
                m5 m5Var = j3Var.f40960a;
                if (m5Var != null) {
                    ValueAnimator valueAnimator = j3Var.f40961b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        j3Var.f40961b = null;
                    }
                    m5Var.b();
                }
            }
            for (j3 j3Var2 : this.f41288b) {
                m5 m5Var2 = j3Var2.f40960a;
                if (m5Var2 != null) {
                    ValueAnimator valueAnimator2 = j3Var2.f40961b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        j3Var2.f40961b = null;
                    }
                    m5Var2.b();
                }
            }
            ValueAnimator valueAnimator3 = this.f41289c;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.L || this.H) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        Rect rect = this.K;
        rect.set(0, 0, width, height);
        float x10 = getX();
        float y10 = getY();
        m1 m1Var = this.I;
        m1Var.d(x10, y10);
        int measuredWidth = getMeasuredWidth() / 2;
        j3[] j3VarArr = this.f41287a;
        j3VarArr[0].b((measuredWidth - org.telegram.messenger.g0.L(120.0f)) - this.d, org.telegram.messenger.g0.L(120.0f) - this.f41293r);
        j3VarArr[1].b((measuredWidth - org.telegram.messenger.g0.L(180.0f)) - this.f41290e, org.telegram.messenger.g0.L(150.0f) - this.f41294s);
        j3VarArr[2].b((measuredWidth - org.telegram.messenger.g0.L(150.0f)) - this.f41291f, org.telegram.messenger.g0.L(185.0f) - this.f41295w);
        j3VarArr[3].b((measuredWidth - org.telegram.messenger.g0.L(176.0f)) - this.h, org.telegram.messenger.g0.L(240.0f) - this.f41296x);
        j3VarArr[4].b((measuredWidth - org.telegram.messenger.g0.L(130.0f)) - this.f41292n, org.telegram.messenger.g0.L(265.0f) - this.f41297y);
        for (j3 j3Var : j3VarArr) {
            j3Var.a(canvas);
        }
        j3[] j3VarArr2 = this.f41288b;
        j3VarArr2[0].b(org.telegram.messenger.g0.L(50.0f) + measuredWidth + this.d, org.telegram.messenger.g0.L(120.0f) - this.f41293r);
        j3VarArr2[1].b(org.telegram.messenger.g0.L(110.0f) + measuredWidth + this.f41290e, org.telegram.messenger.g0.L(150.0f) - this.f41294s);
        j3VarArr2[2].b(org.telegram.messenger.g0.L(80.0f) + measuredWidth + this.f41291f, org.telegram.messenger.g0.L(185.0f) - this.f41295w);
        j3VarArr2[3].b(org.telegram.messenger.g0.L(106.0f) + measuredWidth + this.h, org.telegram.messenger.g0.L(240.0f) - this.f41296x);
        j3VarArr2[4].b(org.telegram.messenger.g0.L(60.0f) + measuredWidth + this.f41292n, org.telegram.messenger.g0.L(265.0f) - this.f41297y);
        for (j3 j3Var2 : j3VarArr2) {
            j3Var2.a(canvas);
        }
        int alpha = m1Var.b().getAlpha();
        Paint paint = this.J;
        paint.setAlpha(255);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
        m1Var.b().setAlpha(255);
        canvas.drawRect(rect, m1Var.b());
        m1Var.b().setAlpha(alpha);
        if (m1Var.f41057e) {
            int alpha2 = ((Paint) m1Var.d.f341a).getAlpha();
            ((Paint) m1Var.d.f341a).setAlpha(255);
            canvas.drawRect(rect, (Paint) m1Var.d.f341a);
            ((Paint) m1Var.d.f341a).setAlpha(alpha2);
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        j3[] j3VarArr;
        j3[] j3VarArr2;
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.L) {
            for (j3 j3Var : this.f41287a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                j3Var.f40972o = measuredWidth;
                j3Var.f40968k.invalidate();
            }
            for (j3 j3Var2 : this.f41288b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                j3Var2.f40972o = measuredWidth2;
                j3Var2.f40968k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.H = z10;
        invalidate();
    }
}
