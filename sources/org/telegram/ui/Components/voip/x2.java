package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.zr;
public final class x2 extends View {
    public boolean E;
    public int F;
    public boolean G;
    public final o1 H;
    public final Paint I;
    public final Rect J;
    public final boolean K;
    public final m3[] f31977a;
    public final m3[] f31978b;
    public ValueAnimator f31979c;
    public int d;
    public int e;
    public int f31980f;
    public int h;
    public int f31981n;
    public int f31982r;
    public int f31983s;
    public int v;
    public int f31984w;
    public int f31985x;
    public boolean f31986y;

    public x2(Activity activity, TLRPC.User user, o1 o1Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.I = paint;
        this.J = new Rect();
        boolean isEnabled = LiteMode.isEnabled(512);
        this.K = isEnabled;
        this.H = o1Var;
        if (!isEnabled) {
            return;
        }
        this.f31977a = new m3[]{new m3(user, this, AndroidUtilities.dp(32.0f)), new m3(user, this, AndroidUtilities.dp(28.0f)), new m3(user, this, AndroidUtilities.dp(35.0f)), new m3(user, this, AndroidUtilities.dp(28.0f)), new m3(user, this, AndroidUtilities.dp(26.0f))};
        this.f31978b = new m3[]{new m3(user, this, AndroidUtilities.dp(32.0f)), new m3(user, this, AndroidUtilities.dp(28.0f)), new m3(user, this, AndroidUtilities.dp(35.0f)), new m3(user, this, AndroidUtilities.dp(28.0f)), new m3(user, this, AndroidUtilities.dp(26.0f))};
        o1Var.a(this);
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public final void a() {
        if (!this.K || this.f31986y) {
            return;
        }
        this.f31986y = true;
        int dp = AndroidUtilities.dp(12.0f);
        this.F = dp;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, dp);
        this.f31979c = ofInt;
        ofInt.addUpdateListener(new w2(this, 0));
        this.f31979c.setInterpolator(zr.f33338g);
        this.f31979c.setDuration(200L);
        this.f31979c.start();
    }

    @Override
    public final void onAttachedToWindow() {
        m3[] m3VarArr;
        m3[] m3VarArr2;
        super.onAttachedToWindow();
        if (this.K) {
            for (m3 m3Var : this.f31977a) {
                n5 n5Var = m3Var.f31720a;
                if (n5Var != null) {
                    n5Var.a();
                    ValueAnimator valueAnimator = m3Var.f31721b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (m3 m3Var2 : this.f31978b) {
                n5 n5Var2 = m3Var2.f31720a;
                if (n5Var2 != null) {
                    n5Var2.a();
                    ValueAnimator valueAnimator2 = m3Var2.f31721b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        m3[] m3VarArr;
        m3[] m3VarArr2;
        super.onDetachedFromWindow();
        if (this.K) {
            for (m3 m3Var : this.f31977a) {
                n5 n5Var = m3Var.f31720a;
                if (n5Var != null) {
                    ValueAnimator valueAnimator = m3Var.f31721b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        m3Var.f31721b = null;
                    }
                    n5Var.b();
                }
            }
            for (m3 m3Var2 : this.f31978b) {
                n5 n5Var2 = m3Var2.f31720a;
                if (n5Var2 != null) {
                    ValueAnimator valueAnimator2 = m3Var2.f31721b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        m3Var2.f31721b = null;
                    }
                    n5Var2.b();
                }
            }
            ValueAnimator valueAnimator3 = this.f31979c;
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
        o1 o1Var = this.H;
        o1Var.d(x10, y3);
        int measuredWidth = getMeasuredWidth() / 2;
        m3[] m3VarArr = this.f31977a;
        m3VarArr[0].b((measuredWidth - AndroidUtilities.dp(120.0f)) - this.d, AndroidUtilities.dp(120.0f) - this.f31982r);
        m3VarArr[1].b((measuredWidth - AndroidUtilities.dp(180.0f)) - this.e, AndroidUtilities.dp(150.0f) - this.f31983s);
        m3VarArr[2].b((measuredWidth - AndroidUtilities.dp(150.0f)) - this.f31980f, AndroidUtilities.dp(185.0f) - this.v);
        m3VarArr[3].b((measuredWidth - AndroidUtilities.dp(176.0f)) - this.h, AndroidUtilities.dp(240.0f) - this.f31984w);
        m3VarArr[4].b((measuredWidth - AndroidUtilities.dp(130.0f)) - this.f31981n, AndroidUtilities.dp(265.0f) - this.f31985x);
        for (m3 m3Var : m3VarArr) {
            m3Var.a(canvas);
        }
        m3[] m3VarArr2 = this.f31978b;
        m3VarArr2[0].b(AndroidUtilities.dp(50.0f) + measuredWidth + this.d, AndroidUtilities.dp(120.0f) - this.f31982r);
        m3VarArr2[1].b(AndroidUtilities.dp(110.0f) + measuredWidth + this.e, AndroidUtilities.dp(150.0f) - this.f31983s);
        m3VarArr2[2].b(AndroidUtilities.dp(80.0f) + measuredWidth + this.f31980f, AndroidUtilities.dp(185.0f) - this.v);
        m3VarArr2[3].b(AndroidUtilities.dp(106.0f) + measuredWidth + this.h, AndroidUtilities.dp(240.0f) - this.f31984w);
        m3VarArr2[4].b(AndroidUtilities.dp(60.0f) + measuredWidth + this.f31981n, AndroidUtilities.dp(265.0f) - this.f31985x);
        for (m3 m3Var2 : m3VarArr2) {
            m3Var2.a(canvas);
        }
        int alpha = o1Var.b().getAlpha();
        Paint paint = this.I;
        paint.setAlpha(255);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
        o1Var.b().setAlpha(255);
        canvas.drawRect(rect, o1Var.b());
        o1Var.b().setAlpha(alpha);
        if (o1Var.e) {
            int alpha2 = ((Paint) o1Var.d.f7657a).getAlpha();
            ((Paint) o1Var.d.f7657a).setAlpha(255);
            canvas.drawRect(rect, (Paint) o1Var.d.f7657a);
            ((Paint) o1Var.d.f7657a).setAlpha(alpha2);
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        m3[] m3VarArr;
        m3[] m3VarArr2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.K) {
            for (m3 m3Var : this.f31977a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                m3Var.f31731o = measuredWidth;
                m3Var.f31727k.invalidate();
            }
            for (m3 m3Var2 : this.f31978b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                m3Var2.f31731o = measuredWidth2;
                m3Var2.f31727k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.G = z10;
        invalidate();
    }
}
