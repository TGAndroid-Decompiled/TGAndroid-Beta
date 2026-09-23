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
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.rr;
public final class z2 extends View {
    public boolean E;
    public int F;
    public boolean G;
    public final q1 H;
    public final Paint I;
    public final Rect J;
    public final boolean K;
    public final o3[] f29351a;
    public final o3[] f29352b;
    public ValueAnimator f29353c;
    public int d;
    public int e;
    public int f29354f;
    public int h;
    public int f29355n;
    public int f29356r;
    public int f29357s;
    public int v;
    public int f29358w;
    public int f29359x;
    public boolean f29360y;

    public z2(Activity activity, TLRPC.User user, q1 q1Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.I = paint;
        this.J = new Rect();
        boolean isEnabled = LiteMode.isEnabled(512);
        this.K = isEnabled;
        this.H = q1Var;
        if (!isEnabled) {
            return;
        }
        this.f29351a = new o3[]{new o3(user, this, AndroidUtilities.dp(32.0f)), new o3(user, this, AndroidUtilities.dp(28.0f)), new o3(user, this, AndroidUtilities.dp(35.0f)), new o3(user, this, AndroidUtilities.dp(28.0f)), new o3(user, this, AndroidUtilities.dp(26.0f))};
        this.f29352b = new o3[]{new o3(user, this, AndroidUtilities.dp(32.0f)), new o3(user, this, AndroidUtilities.dp(28.0f)), new o3(user, this, AndroidUtilities.dp(35.0f)), new o3(user, this, AndroidUtilities.dp(28.0f)), new o3(user, this, AndroidUtilities.dp(26.0f))};
        q1Var.a(this);
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public final void a() {
        if (!this.K || this.f29360y) {
            return;
        }
        this.f29360y = true;
        int dp = AndroidUtilities.dp(12.0f);
        this.F = dp;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, dp);
        this.f29353c = ofInt;
        ofInt.addUpdateListener(new y2(this, 0));
        this.f29353c.setInterpolator(rr.f27702g);
        this.f29353c.setDuration(200L);
        this.f29353c.start();
    }

    @Override
    public final void onAttachedToWindow() {
        o3[] o3VarArr;
        o3[] o3VarArr2;
        super.onAttachedToWindow();
        if (this.K) {
            for (o3 o3Var : this.f29351a) {
                o5 o5Var = o3Var.f29093a;
                if (o5Var != null) {
                    o5Var.a();
                    ValueAnimator valueAnimator = o3Var.f29094b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (o3 o3Var2 : this.f29352b) {
                o5 o5Var2 = o3Var2.f29093a;
                if (o5Var2 != null) {
                    o5Var2.a();
                    ValueAnimator valueAnimator2 = o3Var2.f29094b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        o3[] o3VarArr;
        o3[] o3VarArr2;
        super.onDetachedFromWindow();
        if (this.K) {
            for (o3 o3Var : this.f29351a) {
                o5 o5Var = o3Var.f29093a;
                if (o5Var != null) {
                    ValueAnimator valueAnimator = o3Var.f29094b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        o3Var.f29094b = null;
                    }
                    o5Var.b();
                }
            }
            for (o3 o3Var2 : this.f29352b) {
                o5 o5Var2 = o3Var2.f29093a;
                if (o5Var2 != null) {
                    ValueAnimator valueAnimator2 = o3Var2.f29094b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        o3Var2.f29094b = null;
                    }
                    o5Var2.b();
                }
            }
            ValueAnimator valueAnimator3 = this.f29353c;
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
        q1 q1Var = this.H;
        q1Var.d(x10, y3);
        int measuredWidth = getMeasuredWidth() / 2;
        o3[] o3VarArr = this.f29351a;
        o3VarArr[0].b((measuredWidth - AndroidUtilities.dp(120.0f)) - this.d, AndroidUtilities.dp(120.0f) - this.f29356r);
        o3VarArr[1].b((measuredWidth - AndroidUtilities.dp(180.0f)) - this.e, AndroidUtilities.dp(150.0f) - this.f29357s);
        o3VarArr[2].b((measuredWidth - AndroidUtilities.dp(150.0f)) - this.f29354f, AndroidUtilities.dp(185.0f) - this.v);
        o3VarArr[3].b((measuredWidth - AndroidUtilities.dp(176.0f)) - this.h, AndroidUtilities.dp(240.0f) - this.f29358w);
        o3VarArr[4].b((measuredWidth - AndroidUtilities.dp(130.0f)) - this.f29355n, AndroidUtilities.dp(265.0f) - this.f29359x);
        for (o3 o3Var : o3VarArr) {
            o3Var.a(canvas);
        }
        o3[] o3VarArr2 = this.f29352b;
        o3VarArr2[0].b(AndroidUtilities.dp(50.0f) + measuredWidth + this.d, AndroidUtilities.dp(120.0f) - this.f29356r);
        o3VarArr2[1].b(AndroidUtilities.dp(110.0f) + measuredWidth + this.e, AndroidUtilities.dp(150.0f) - this.f29357s);
        o3VarArr2[2].b(AndroidUtilities.dp(80.0f) + measuredWidth + this.f29354f, AndroidUtilities.dp(185.0f) - this.v);
        o3VarArr2[3].b(AndroidUtilities.dp(106.0f) + measuredWidth + this.h, AndroidUtilities.dp(240.0f) - this.f29358w);
        o3VarArr2[4].b(AndroidUtilities.dp(60.0f) + measuredWidth + this.f29355n, AndroidUtilities.dp(265.0f) - this.f29359x);
        for (o3 o3Var2 : o3VarArr2) {
            o3Var2.a(canvas);
        }
        int alpha = q1Var.b().getAlpha();
        Paint paint = this.I;
        paint.setAlpha(255);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
        q1Var.b().setAlpha(255);
        canvas.drawRect(rect, q1Var.b());
        q1Var.b().setAlpha(alpha);
        if (q1Var.e) {
            int alpha2 = ((Paint) q1Var.d.f7319a).getAlpha();
            ((Paint) q1Var.d.f7319a).setAlpha(255);
            canvas.drawRect(rect, (Paint) q1Var.d.f7319a);
            ((Paint) q1Var.d.f7319a).setAlpha(alpha2);
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        o3[] o3VarArr;
        o3[] o3VarArr2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.K) {
            for (o3 o3Var : this.f29351a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                o3Var.f29104o = measuredWidth;
                o3Var.f29100k.invalidate();
            }
            for (o3 o3Var2 : this.f29352b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                o3Var2.f29104o = measuredWidth2;
                o3Var2.f29100k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.G = z10;
        invalidate();
    }
}
