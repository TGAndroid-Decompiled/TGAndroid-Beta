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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n5;
public final class b3 extends View {
    public boolean A;
    public int B;
    public boolean C;
    public final o1 D;
    public final Paint E;
    public final Rect F;
    public final boolean G;
    public final q3[] f33634a;
    public final q3[] f33635b;
    public ValueAnimator f33636c;
    public int d;
    public int f33637e;
    public int f33638f;
    public int h;
    public int f33639n;
    public int f33640r;
    public int f33641s;
    public int v;
    public int f33642w;
    public int f33643x;
    public boolean f33644y;

    public b3(Activity activity, TLRPC.User user, o1 o1Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.E = paint;
        this.F = new Rect();
        boolean isEnabled = LiteMode.isEnabled(512);
        this.G = isEnabled;
        this.D = o1Var;
        if (!isEnabled) {
            return;
        }
        this.f33634a = new q3[]{new q3(user, this, AndroidUtilities.dp(32.0f)), new q3(user, this, AndroidUtilities.dp(28.0f)), new q3(user, this, AndroidUtilities.dp(35.0f)), new q3(user, this, AndroidUtilities.dp(28.0f)), new q3(user, this, AndroidUtilities.dp(26.0f))};
        this.f33635b = new q3[]{new q3(user, this, AndroidUtilities.dp(32.0f)), new q3(user, this, AndroidUtilities.dp(28.0f)), new q3(user, this, AndroidUtilities.dp(35.0f)), new q3(user, this, AndroidUtilities.dp(28.0f)), new q3(user, this, AndroidUtilities.dp(26.0f))};
        o1Var.a(this);
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public final void a() {
        if (!this.G || this.f33644y) {
            return;
        }
        this.f33644y = true;
        int dp = AndroidUtilities.dp(12.0f);
        this.B = dp;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, dp);
        this.f33636c = ofInt;
        ofInt.addUpdateListener(new a3(this, 0));
        this.f33636c.setInterpolator(jr.f29801g);
        this.f33636c.setDuration(200L);
        this.f33636c.start();
    }

    @Override
    public final void onAttachedToWindow() {
        q3[] q3VarArr;
        q3[] q3VarArr2;
        super.onAttachedToWindow();
        if (this.G) {
            for (q3 q3Var : this.f33634a) {
                n5 n5Var = q3Var.f33944a;
                if (n5Var != null) {
                    n5Var.a();
                    ValueAnimator valueAnimator = q3Var.f33945b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (q3 q3Var2 : this.f33635b) {
                n5 n5Var2 = q3Var2.f33944a;
                if (n5Var2 != null) {
                    n5Var2.a();
                    ValueAnimator valueAnimator2 = q3Var2.f33945b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        q3[] q3VarArr;
        q3[] q3VarArr2;
        super.onDetachedFromWindow();
        if (this.G) {
            for (q3 q3Var : this.f33634a) {
                n5 n5Var = q3Var.f33944a;
                if (n5Var != null) {
                    ValueAnimator valueAnimator = q3Var.f33945b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        q3Var.f33945b = null;
                    }
                    n5Var.b();
                }
            }
            for (q3 q3Var2 : this.f33635b) {
                n5 n5Var2 = q3Var2.f33944a;
                if (n5Var2 != null) {
                    ValueAnimator valueAnimator2 = q3Var2.f33945b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        q3Var2.f33945b = null;
                    }
                    n5Var2.b();
                }
            }
            ValueAnimator valueAnimator3 = this.f33636c;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.G || this.C) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        Rect rect = this.F;
        rect.set(0, 0, width, height);
        float x4 = getX();
        float y8 = getY();
        o1 o1Var = this.D;
        o1Var.d(x4, y8);
        int measuredWidth = getMeasuredWidth() / 2;
        q3[] q3VarArr = this.f33634a;
        q3VarArr[0].b((measuredWidth - AndroidUtilities.dp(120.0f)) - this.d, AndroidUtilities.dp(120.0f) - this.f33640r);
        q3VarArr[1].b((measuredWidth - AndroidUtilities.dp(180.0f)) - this.f33637e, AndroidUtilities.dp(150.0f) - this.f33641s);
        q3VarArr[2].b((measuredWidth - AndroidUtilities.dp(150.0f)) - this.f33638f, AndroidUtilities.dp(185.0f) - this.v);
        q3VarArr[3].b((measuredWidth - AndroidUtilities.dp(176.0f)) - this.h, AndroidUtilities.dp(240.0f) - this.f33642w);
        q3VarArr[4].b((measuredWidth - AndroidUtilities.dp(130.0f)) - this.f33639n, AndroidUtilities.dp(265.0f) - this.f33643x);
        for (q3 q3Var : q3VarArr) {
            q3Var.a(canvas);
        }
        q3[] q3VarArr2 = this.f33635b;
        q3VarArr2[0].b(AndroidUtilities.dp(50.0f) + measuredWidth + this.d, AndroidUtilities.dp(120.0f) - this.f33640r);
        q3VarArr2[1].b(AndroidUtilities.dp(110.0f) + measuredWidth + this.f33637e, AndroidUtilities.dp(150.0f) - this.f33641s);
        q3VarArr2[2].b(AndroidUtilities.dp(80.0f) + measuredWidth + this.f33638f, AndroidUtilities.dp(185.0f) - this.v);
        q3VarArr2[3].b(AndroidUtilities.dp(106.0f) + measuredWidth + this.h, AndroidUtilities.dp(240.0f) - this.f33642w);
        q3VarArr2[4].b(AndroidUtilities.dp(60.0f) + measuredWidth + this.f33639n, AndroidUtilities.dp(265.0f) - this.f33643x);
        for (q3 q3Var2 : q3VarArr2) {
            q3Var2.a(canvas);
        }
        int alpha = o1Var.b().getAlpha();
        Paint paint = this.E;
        paint.setAlpha(255);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
        o1Var.b().setAlpha(255);
        canvas.drawRect(rect, o1Var.b());
        o1Var.b().setAlpha(alpha);
        if (o1Var.f33886e) {
            int alpha2 = ((Paint) o1Var.d.d).getAlpha();
            ((Paint) o1Var.d.d).setAlpha(255);
            canvas.drawRect(rect, (Paint) o1Var.d.d);
            ((Paint) o1Var.d.d).setAlpha(alpha2);
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        q3[] q3VarArr;
        q3[] q3VarArr2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.G) {
            for (q3 q3Var : this.f33634a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                q3Var.f33956o = measuredWidth;
                q3Var.f33952k.invalidate();
            }
            for (q3 q3Var2 : this.f33635b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                q3Var2.f33956o = measuredWidth2;
                q3Var2.f33952k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.C = z10;
        invalidate();
    }
}
