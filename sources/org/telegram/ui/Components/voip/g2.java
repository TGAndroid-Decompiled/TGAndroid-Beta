package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.lc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.xq;
public final class g2 extends View {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final x0 I;
    public final Paint J;
    public final Rect K;
    public final boolean L;
    public final u2[] f39368a;
    public final u2[] f39369b;
    public ValueAnimator f39370c;
    public int d;
    public int f39371e;
    public int f39372f;
    public int h;
    public int f39373n;
    public int f39374r;
    public int f39375s;
    public int f39376w;
    public int f39377x;
    public int f39378y;

    public g2(Activity activity, TLRPC.User user, x0 x0Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.J = paint;
        this.K = new Rect();
        boolean e10 = lc.e(512);
        this.L = e10;
        this.I = x0Var;
        if (!e10) {
            return;
        }
        this.f39368a = new u2[]{new u2(user, this, org.telegram.messenger.g0.L(32.0f)), new u2(user, this, org.telegram.messenger.g0.L(28.0f)), new u2(user, this, org.telegram.messenger.g0.L(35.0f)), new u2(user, this, org.telegram.messenger.g0.L(28.0f)), new u2(user, this, org.telegram.messenger.g0.L(26.0f))};
        this.f39369b = new u2[]{new u2(user, this, org.telegram.messenger.g0.L(32.0f)), new u2(user, this, org.telegram.messenger.g0.L(28.0f)), new u2(user, this, org.telegram.messenger.g0.L(35.0f)), new u2(user, this, org.telegram.messenger.g0.L(28.0f)), new u2(user, this, org.telegram.messenger.g0.L(26.0f))};
        x0Var.a(this);
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
        this.f39370c = ofInt;
        ofInt.addUpdateListener(new f2(this, 0));
        this.f39370c.setInterpolator(xq.f40453g);
        this.f39370c.setDuration(200L);
        this.f39370c.start();
    }

    @Override
    public final void onAttachedToWindow() {
        u2[] u2VarArr;
        u2[] u2VarArr2;
        super.onAttachedToWindow();
        if (this.L) {
            for (u2 u2Var : this.f39368a) {
                e5 e5Var = u2Var.f39632a;
                if (e5Var != null) {
                    e5Var.a();
                    ValueAnimator valueAnimator = u2Var.f39633b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (u2 u2Var2 : this.f39369b) {
                e5 e5Var2 = u2Var2.f39632a;
                if (e5Var2 != null) {
                    e5Var2.a();
                    ValueAnimator valueAnimator2 = u2Var2.f39633b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        u2[] u2VarArr;
        u2[] u2VarArr2;
        super.onDetachedFromWindow();
        if (this.L) {
            for (u2 u2Var : this.f39368a) {
                e5 e5Var = u2Var.f39632a;
                if (e5Var != null) {
                    ValueAnimator valueAnimator = u2Var.f39633b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        u2Var.f39633b = null;
                    }
                    e5Var.b();
                }
            }
            for (u2 u2Var2 : this.f39369b) {
                e5 e5Var2 = u2Var2.f39632a;
                if (e5Var2 != null) {
                    ValueAnimator valueAnimator2 = u2Var2.f39633b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        u2Var2.f39633b = null;
                    }
                    e5Var2.b();
                }
            }
            ValueAnimator valueAnimator3 = this.f39370c;
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
        float y9 = getY();
        x0 x0Var = this.I;
        x0Var.d(x10, y9);
        int measuredWidth = getMeasuredWidth() / 2;
        u2[] u2VarArr = this.f39368a;
        u2VarArr[0].b((measuredWidth - org.telegram.messenger.g0.L(120.0f)) - this.d, org.telegram.messenger.g0.L(120.0f) - this.f39374r);
        u2VarArr[1].b((measuredWidth - org.telegram.messenger.g0.L(180.0f)) - this.f39371e, org.telegram.messenger.g0.L(150.0f) - this.f39375s);
        u2VarArr[2].b((measuredWidth - org.telegram.messenger.g0.L(150.0f)) - this.f39372f, org.telegram.messenger.g0.L(185.0f) - this.f39376w);
        u2VarArr[3].b((measuredWidth - org.telegram.messenger.g0.L(176.0f)) - this.h, org.telegram.messenger.g0.L(240.0f) - this.f39377x);
        u2VarArr[4].b((measuredWidth - org.telegram.messenger.g0.L(130.0f)) - this.f39373n, org.telegram.messenger.g0.L(265.0f) - this.f39378y);
        for (u2 u2Var : u2VarArr) {
            u2Var.a(canvas);
        }
        u2[] u2VarArr2 = this.f39369b;
        u2VarArr2[0].b(org.telegram.messenger.g0.L(50.0f) + measuredWidth + this.d, org.telegram.messenger.g0.L(120.0f) - this.f39374r);
        u2VarArr2[1].b(org.telegram.messenger.g0.L(110.0f) + measuredWidth + this.f39371e, org.telegram.messenger.g0.L(150.0f) - this.f39375s);
        u2VarArr2[2].b(org.telegram.messenger.g0.L(80.0f) + measuredWidth + this.f39372f, org.telegram.messenger.g0.L(185.0f) - this.f39376w);
        u2VarArr2[3].b(org.telegram.messenger.g0.L(106.0f) + measuredWidth + this.h, org.telegram.messenger.g0.L(240.0f) - this.f39377x);
        u2VarArr2[4].b(org.telegram.messenger.g0.L(60.0f) + measuredWidth + this.f39373n, org.telegram.messenger.g0.L(265.0f) - this.f39378y);
        for (u2 u2Var2 : u2VarArr2) {
            u2Var2.a(canvas);
        }
        int alpha = x0Var.b().getAlpha();
        Paint paint = this.J;
        paint.setAlpha(255);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
        x0Var.b().setAlpha(255);
        canvas.drawRect(rect, x0Var.b());
        x0Var.b().setAlpha(alpha);
        if (x0Var.f39707e) {
            int alpha2 = ((Paint) x0Var.d.f17689a).getAlpha();
            ((Paint) x0Var.d.f17689a).setAlpha(255);
            canvas.drawRect(rect, (Paint) x0Var.d.f17689a);
            ((Paint) x0Var.d.f17689a).setAlpha(alpha2);
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        u2[] u2VarArr;
        u2[] u2VarArr2;
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.L) {
            for (u2 u2Var : this.f39368a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                u2Var.f39644o = measuredWidth;
                u2Var.f39640k.invalidate();
            }
            for (u2 u2Var2 : this.f39369b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                u2Var2.f39644o = measuredWidth2;
                u2Var2.f39640k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.H = z10;
        invalidate();
    }
}
