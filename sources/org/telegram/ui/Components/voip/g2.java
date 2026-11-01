package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.tc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.gr;
public final class g2 extends View {
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public final y0 H;
    public final Paint I;
    public final Rect J;
    public final boolean K;
    public final w2[] f31513a;
    public final w2[] f31514b;
    public ValueAnimator f31515c;
    public int d;
    public int e;
    public int f31516f;
    public int h;
    public int f31517n;
    public int f31518r;
    public int f31519s;
    public int f31520w;
    public int f31521x;
    public int f31522y;

    public g2(Activity activity, TLRPC.User user, y0 y0Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.I = paint;
        this.J = new Rect();
        boolean e = tc.e(512);
        this.K = e;
        this.H = y0Var;
        if (!e) {
            return;
        }
        this.f31513a = new w2[]{new w2(user, this, org.telegram.messenger.i0.L(32.0f)), new w2(user, this, org.telegram.messenger.i0.L(28.0f)), new w2(user, this, org.telegram.messenger.i0.L(35.0f)), new w2(user, this, org.telegram.messenger.i0.L(28.0f)), new w2(user, this, org.telegram.messenger.i0.L(26.0f))};
        this.f31514b = new w2[]{new w2(user, this, org.telegram.messenger.i0.L(32.0f)), new w2(user, this, org.telegram.messenger.i0.L(28.0f)), new w2(user, this, org.telegram.messenger.i0.L(35.0f)), new w2(user, this, org.telegram.messenger.i0.L(28.0f)), new w2(user, this, org.telegram.messenger.i0.L(26.0f))};
        y0Var.a(this);
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public final void a() {
        if (!this.K || this.D) {
            return;
        }
        this.D = true;
        int L = org.telegram.messenger.i0.L(12.0f);
        this.F = L;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, L);
        this.f31515c = ofInt;
        ofInt.addUpdateListener(new f2(this, 0));
        this.f31515c.setInterpolator(gr.f26524g);
        this.f31515c.setDuration(200L);
        this.f31515c.start();
    }

    @Override
    public final void onAttachedToWindow() {
        w2[] w2VarArr;
        w2[] w2VarArr2;
        super.onAttachedToWindow();
        if (this.K) {
            for (w2 w2Var : this.f31513a) {
                d5 d5Var = w2Var.f31775a;
                if (d5Var != null) {
                    d5Var.a();
                    ValueAnimator valueAnimator = w2Var.f31776b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (w2 w2Var2 : this.f31514b) {
                d5 d5Var2 = w2Var2.f31775a;
                if (d5Var2 != null) {
                    d5Var2.a();
                    ValueAnimator valueAnimator2 = w2Var2.f31776b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        w2[] w2VarArr;
        w2[] w2VarArr2;
        super.onDetachedFromWindow();
        if (this.K) {
            for (w2 w2Var : this.f31513a) {
                d5 d5Var = w2Var.f31775a;
                if (d5Var != null) {
                    ValueAnimator valueAnimator = w2Var.f31776b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        w2Var.f31776b = null;
                    }
                    d5Var.b();
                }
            }
            for (w2 w2Var2 : this.f31514b) {
                d5 d5Var2 = w2Var2.f31775a;
                if (d5Var2 != null) {
                    ValueAnimator valueAnimator2 = w2Var2.f31776b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        w2Var2.f31776b = null;
                    }
                    d5Var2.b();
                }
            }
            ValueAnimator valueAnimator3 = this.f31515c;
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
        float y3 = getY();
        y0 y0Var = this.H;
        y0Var.d(x10, y3);
        int measuredWidth = getMeasuredWidth() / 2;
        w2[] w2VarArr = this.f31513a;
        w2VarArr[0].b((measuredWidth - org.telegram.messenger.i0.L(120.0f)) - this.d, org.telegram.messenger.i0.L(120.0f) - this.f31518r);
        w2VarArr[1].b((measuredWidth - org.telegram.messenger.i0.L(180.0f)) - this.e, org.telegram.messenger.i0.L(150.0f) - this.f31519s);
        w2VarArr[2].b((measuredWidth - org.telegram.messenger.i0.L(150.0f)) - this.f31516f, org.telegram.messenger.i0.L(185.0f) - this.f31520w);
        w2VarArr[3].b((measuredWidth - org.telegram.messenger.i0.L(176.0f)) - this.h, org.telegram.messenger.i0.L(240.0f) - this.f31521x);
        w2VarArr[4].b((measuredWidth - org.telegram.messenger.i0.L(130.0f)) - this.f31517n, org.telegram.messenger.i0.L(265.0f) - this.f31522y);
        for (w2 w2Var : w2VarArr) {
            w2Var.a(canvas);
        }
        w2[] w2VarArr2 = this.f31514b;
        w2VarArr2[0].b(org.telegram.messenger.i0.L(50.0f) + measuredWidth + this.d, org.telegram.messenger.i0.L(120.0f) - this.f31518r);
        w2VarArr2[1].b(org.telegram.messenger.i0.L(110.0f) + measuredWidth + this.e, org.telegram.messenger.i0.L(150.0f) - this.f31519s);
        w2VarArr2[2].b(org.telegram.messenger.i0.L(80.0f) + measuredWidth + this.f31516f, org.telegram.messenger.i0.L(185.0f) - this.f31520w);
        w2VarArr2[3].b(org.telegram.messenger.i0.L(106.0f) + measuredWidth + this.h, org.telegram.messenger.i0.L(240.0f) - this.f31521x);
        w2VarArr2[4].b(org.telegram.messenger.i0.L(60.0f) + measuredWidth + this.f31517n, org.telegram.messenger.i0.L(265.0f) - this.f31522y);
        for (w2 w2Var2 : w2VarArr2) {
            w2Var2.a(canvas);
        }
        int alpha = y0Var.b().getAlpha();
        Paint paint = this.I;
        paint.setAlpha(255);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
        y0Var.b().setAlpha(255);
        canvas.drawRect(rect, y0Var.b());
        y0Var.b().setAlpha(alpha);
        if (y0Var.e) {
            int alpha2 = ((Paint) y0Var.d.f9348a).getAlpha();
            ((Paint) y0Var.d.f9348a).setAlpha(255);
            canvas.drawRect(rect, (Paint) y0Var.d.f9348a);
            ((Paint) y0Var.d.f9348a).setAlpha(alpha2);
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        w2[] w2VarArr;
        w2[] w2VarArr2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.K) {
            for (w2 w2Var : this.f31513a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                w2Var.f31786o = measuredWidth;
                w2Var.f31782k.invalidate();
            }
            for (w2 w2Var2 : this.f31514b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                w2Var2.f31786o = measuredWidth2;
                w2Var2.f31782k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.G = z10;
        invalidate();
    }
}
