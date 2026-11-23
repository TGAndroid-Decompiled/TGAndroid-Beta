package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.qc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.nr;
public final class u2 extends View {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final l1 I;
    public final Paint J;
    public final Rect K;
    public final boolean L;
    public final i3[] f41392a;
    public final i3[] f41393b;
    public ValueAnimator f41394c;
    public int d;
    public int f41395e;
    public int f41396f;
    public int h;
    public int f41397n;
    public int f41398r;
    public int f41399s;
    public int f41400w;
    public int f41401x;
    public int f41402y;

    public u2(Activity activity, TLRPC.User user, l1 l1Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.J = paint;
        this.K = new Rect();
        boolean e10 = qc.e(512);
        this.L = e10;
        this.I = l1Var;
        if (!e10) {
            return;
        }
        this.f41392a = new i3[]{new i3(user, this, org.telegram.messenger.g0.L(32.0f)), new i3(user, this, org.telegram.messenger.g0.L(28.0f)), new i3(user, this, org.telegram.messenger.g0.L(35.0f)), new i3(user, this, org.telegram.messenger.g0.L(28.0f)), new i3(user, this, org.telegram.messenger.g0.L(26.0f))};
        this.f41393b = new i3[]{new i3(user, this, org.telegram.messenger.g0.L(32.0f)), new i3(user, this, org.telegram.messenger.g0.L(28.0f)), new i3(user, this, org.telegram.messenger.g0.L(35.0f)), new i3(user, this, org.telegram.messenger.g0.L(28.0f)), new i3(user, this, org.telegram.messenger.g0.L(26.0f))};
        l1Var.a(this);
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
        this.f41394c = ofInt;
        ofInt.addUpdateListener(new t2(this, 0));
        this.f41394c.setInterpolator(nr.f37962g);
        this.f41394c.setDuration(200L);
        this.f41394c.start();
    }

    @Override
    public final void onAttachedToWindow() {
        i3[] i3VarArr;
        i3[] i3VarArr2;
        super.onAttachedToWindow();
        if (this.L) {
            for (i3 i3Var : this.f41392a) {
                n5 n5Var = i3Var.f41066a;
                if (n5Var != null) {
                    n5Var.a();
                    ValueAnimator valueAnimator = i3Var.f41067b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (i3 i3Var2 : this.f41393b) {
                n5 n5Var2 = i3Var2.f41066a;
                if (n5Var2 != null) {
                    n5Var2.a();
                    ValueAnimator valueAnimator2 = i3Var2.f41067b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        i3[] i3VarArr;
        i3[] i3VarArr2;
        super.onDetachedFromWindow();
        if (this.L) {
            for (i3 i3Var : this.f41392a) {
                n5 n5Var = i3Var.f41066a;
                if (n5Var != null) {
                    ValueAnimator valueAnimator = i3Var.f41067b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        i3Var.f41067b = null;
                    }
                    n5Var.b();
                }
            }
            for (i3 i3Var2 : this.f41393b) {
                n5 n5Var2 = i3Var2.f41066a;
                if (n5Var2 != null) {
                    ValueAnimator valueAnimator2 = i3Var2.f41067b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        i3Var2.f41067b = null;
                    }
                    n5Var2.b();
                }
            }
            ValueAnimator valueAnimator3 = this.f41394c;
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
        l1 l1Var = this.I;
        l1Var.d(x10, y10);
        int measuredWidth = getMeasuredWidth() / 2;
        i3[] i3VarArr = this.f41392a;
        i3VarArr[0].b((measuredWidth - org.telegram.messenger.g0.L(120.0f)) - this.d, org.telegram.messenger.g0.L(120.0f) - this.f41398r);
        i3VarArr[1].b((measuredWidth - org.telegram.messenger.g0.L(180.0f)) - this.f41395e, org.telegram.messenger.g0.L(150.0f) - this.f41399s);
        i3VarArr[2].b((measuredWidth - org.telegram.messenger.g0.L(150.0f)) - this.f41396f, org.telegram.messenger.g0.L(185.0f) - this.f41400w);
        i3VarArr[3].b((measuredWidth - org.telegram.messenger.g0.L(176.0f)) - this.h, org.telegram.messenger.g0.L(240.0f) - this.f41401x);
        i3VarArr[4].b((measuredWidth - org.telegram.messenger.g0.L(130.0f)) - this.f41397n, org.telegram.messenger.g0.L(265.0f) - this.f41402y);
        for (i3 i3Var : i3VarArr) {
            i3Var.a(canvas);
        }
        i3[] i3VarArr2 = this.f41393b;
        i3VarArr2[0].b(org.telegram.messenger.g0.L(50.0f) + measuredWidth + this.d, org.telegram.messenger.g0.L(120.0f) - this.f41398r);
        i3VarArr2[1].b(org.telegram.messenger.g0.L(110.0f) + measuredWidth + this.f41395e, org.telegram.messenger.g0.L(150.0f) - this.f41399s);
        i3VarArr2[2].b(org.telegram.messenger.g0.L(80.0f) + measuredWidth + this.f41396f, org.telegram.messenger.g0.L(185.0f) - this.f41400w);
        i3VarArr2[3].b(org.telegram.messenger.g0.L(106.0f) + measuredWidth + this.h, org.telegram.messenger.g0.L(240.0f) - this.f41401x);
        i3VarArr2[4].b(org.telegram.messenger.g0.L(60.0f) + measuredWidth + this.f41397n, org.telegram.messenger.g0.L(265.0f) - this.f41402y);
        for (i3 i3Var2 : i3VarArr2) {
            i3Var2.a(canvas);
        }
        int alpha = l1Var.b().getAlpha();
        Paint paint = this.J;
        paint.setAlpha(255);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
        l1Var.b().setAlpha(255);
        canvas.drawRect(rect, l1Var.b());
        l1Var.b().setAlpha(alpha);
        if (l1Var.f41158e) {
            int alpha2 = ((Paint) l1Var.d.f341a).getAlpha();
            ((Paint) l1Var.d.f341a).setAlpha(255);
            canvas.drawRect(rect, (Paint) l1Var.d.f341a);
            ((Paint) l1Var.d.f341a).setAlpha(alpha2);
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        i3[] i3VarArr;
        i3[] i3VarArr2;
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.L) {
            for (i3 i3Var : this.f41392a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                i3Var.f41078o = measuredWidth;
                i3Var.f41074k.invalidate();
            }
            for (i3 i3Var2 : this.f41393b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                i3Var2.f41078o = measuredWidth2;
                i3Var2.f41074k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.H = z10;
        invalidate();
    }
}
