package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.rc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.xq;
public final class r2 extends View {
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public final i1 H;
    public final Paint I;
    public final Rect J;
    public final boolean K;
    public final f3[] f39452a;
    public final f3[] f39453b;
    public ValueAnimator f39454c;
    public int d;
    public int f39455e;
    public int f39456f;
    public int h;
    public int f39457n;
    public int f39458r;
    public int f39459s;
    public int f39460w;
    public int f39461x;
    public int f39462y;

    public r2(Activity activity, TLRPC.User user, i1 i1Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.I = paint;
        this.J = new Rect();
        boolean e10 = rc.e(512);
        this.K = e10;
        this.H = i1Var;
        if (!e10) {
            return;
        }
        this.f39452a = new f3[]{new f3(user, this, org.telegram.messenger.g0.L(32.0f)), new f3(user, this, org.telegram.messenger.g0.L(28.0f)), new f3(user, this, org.telegram.messenger.g0.L(35.0f)), new f3(user, this, org.telegram.messenger.g0.L(28.0f)), new f3(user, this, org.telegram.messenger.g0.L(26.0f))};
        this.f39453b = new f3[]{new f3(user, this, org.telegram.messenger.g0.L(32.0f)), new f3(user, this, org.telegram.messenger.g0.L(28.0f)), new f3(user, this, org.telegram.messenger.g0.L(35.0f)), new f3(user, this, org.telegram.messenger.g0.L(28.0f)), new f3(user, this, org.telegram.messenger.g0.L(26.0f))};
        i1Var.a(this);
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public final void a() {
        if (!this.K || this.D) {
            return;
        }
        this.D = true;
        int L = org.telegram.messenger.g0.L(12.0f);
        this.F = L;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, L);
        this.f39454c = ofInt;
        ofInt.addUpdateListener(new q2(this, 0));
        this.f39454c.setInterpolator(xq.f40311g);
        this.f39454c.setDuration(200L);
        this.f39454c.start();
    }

    @Override
    public final void onAttachedToWindow() {
        f3[] f3VarArr;
        f3[] f3VarArr2;
        super.onAttachedToWindow();
        if (this.K) {
            for (f3 f3Var : this.f39452a) {
                g5 g5Var = f3Var.f39145a;
                if (g5Var != null) {
                    g5Var.a();
                    ValueAnimator valueAnimator = f3Var.f39146b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (f3 f3Var2 : this.f39453b) {
                g5 g5Var2 = f3Var2.f39145a;
                if (g5Var2 != null) {
                    g5Var2.a();
                    ValueAnimator valueAnimator2 = f3Var2.f39146b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        f3[] f3VarArr;
        f3[] f3VarArr2;
        super.onDetachedFromWindow();
        if (this.K) {
            for (f3 f3Var : this.f39452a) {
                g5 g5Var = f3Var.f39145a;
                if (g5Var != null) {
                    ValueAnimator valueAnimator = f3Var.f39146b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        f3Var.f39146b = null;
                    }
                    g5Var.b();
                }
            }
            for (f3 f3Var2 : this.f39453b) {
                g5 g5Var2 = f3Var2.f39145a;
                if (g5Var2 != null) {
                    ValueAnimator valueAnimator2 = f3Var2.f39146b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        f3Var2.f39146b = null;
                    }
                    g5Var2.b();
                }
            }
            ValueAnimator valueAnimator3 = this.f39454c;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.K || this.G) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        Rect rect = this.J;
        rect.set(0, 0, width, height);
        float x10 = getX();
        float y10 = getY();
        i1 i1Var = this.H;
        i1Var.d(x10, y10);
        int measuredWidth = getMeasuredWidth() / 2;
        f3[] f3VarArr = this.f39452a;
        f3VarArr[0].b((measuredWidth - org.telegram.messenger.g0.L(120.0f)) - this.d, org.telegram.messenger.g0.L(120.0f) - this.f39458r);
        f3VarArr[1].b((measuredWidth - org.telegram.messenger.g0.L(180.0f)) - this.f39455e, org.telegram.messenger.g0.L(150.0f) - this.f39459s);
        f3VarArr[2].b((measuredWidth - org.telegram.messenger.g0.L(150.0f)) - this.f39456f, org.telegram.messenger.g0.L(185.0f) - this.f39460w);
        f3VarArr[3].b((measuredWidth - org.telegram.messenger.g0.L(176.0f)) - this.h, org.telegram.messenger.g0.L(240.0f) - this.f39461x);
        f3VarArr[4].b((measuredWidth - org.telegram.messenger.g0.L(130.0f)) - this.f39457n, org.telegram.messenger.g0.L(265.0f) - this.f39462y);
        for (f3 f3Var : f3VarArr) {
            f3Var.a(canvas);
        }
        f3[] f3VarArr2 = this.f39453b;
        f3VarArr2[0].b(org.telegram.messenger.g0.L(50.0f) + measuredWidth + this.d, org.telegram.messenger.g0.L(120.0f) - this.f39458r);
        f3VarArr2[1].b(org.telegram.messenger.g0.L(110.0f) + measuredWidth + this.f39455e, org.telegram.messenger.g0.L(150.0f) - this.f39459s);
        f3VarArr2[2].b(org.telegram.messenger.g0.L(80.0f) + measuredWidth + this.f39456f, org.telegram.messenger.g0.L(185.0f) - this.f39460w);
        f3VarArr2[3].b(org.telegram.messenger.g0.L(106.0f) + measuredWidth + this.h, org.telegram.messenger.g0.L(240.0f) - this.f39461x);
        f3VarArr2[4].b(org.telegram.messenger.g0.L(60.0f) + measuredWidth + this.f39457n, org.telegram.messenger.g0.L(265.0f) - this.f39462y);
        for (f3 f3Var2 : f3VarArr2) {
            f3Var2.a(canvas);
        }
        int alpha = i1Var.b().getAlpha();
        Paint paint = this.I;
        paint.setAlpha(255);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
        i1Var.b().setAlpha(255);
        canvas.drawRect(rect, i1Var.b());
        i1Var.b().setAlpha(alpha);
        if (i1Var.f39205e) {
            int alpha2 = ((Paint) i1Var.d.f335a).getAlpha();
            ((Paint) i1Var.d.f335a).setAlpha(255);
            canvas.drawRect(rect, (Paint) i1Var.d.f335a);
            ((Paint) i1Var.d.f335a).setAlpha(alpha2);
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        f3[] f3VarArr;
        f3[] f3VarArr2;
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.K) {
            for (f3 f3Var : this.f39452a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                f3Var.f39157o = measuredWidth;
                f3Var.f39153k.invalidate();
            }
            for (f3 f3Var2 : this.f39453b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                f3Var2.f39157o = measuredWidth2;
                f3Var2.f39153k.invalidate();
            }
        }
    }

    public void setState(boolean z9) {
        this.G = z9;
        invalidate();
    }
}
