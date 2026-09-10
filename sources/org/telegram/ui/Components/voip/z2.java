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
import org.telegram.ui.Components.wr;
public final class z2 extends View {
    public boolean E;
    public int F;
    public boolean G;
    public final p1 H;
    public final Paint I;
    public final Rect J;
    public final boolean K;
    public final o3[] f28559a;
    public final o3[] f28560b;
    public ValueAnimator f28561c;
    public int d;
    public int e;
    public int f28562f;
    public int h;
    public int f28563n;
    public int f28564r;
    public int f28565s;
    public int v;
    public int f28566w;
    public int f28567x;
    public boolean f28568y;

    public z2(Activity activity, TLRPC.User user, p1 p1Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.I = paint;
        this.J = new Rect();
        boolean isEnabled = LiteMode.isEnabled(512);
        this.K = isEnabled;
        this.H = p1Var;
        if (!isEnabled) {
            return;
        }
        this.f28559a = new o3[]{new o3(user, this, AndroidUtilities.dp(32.0f)), new o3(user, this, AndroidUtilities.dp(28.0f)), new o3(user, this, AndroidUtilities.dp(35.0f)), new o3(user, this, AndroidUtilities.dp(28.0f)), new o3(user, this, AndroidUtilities.dp(26.0f))};
        this.f28560b = new o3[]{new o3(user, this, AndroidUtilities.dp(32.0f)), new o3(user, this, AndroidUtilities.dp(28.0f)), new o3(user, this, AndroidUtilities.dp(35.0f)), new o3(user, this, AndroidUtilities.dp(28.0f)), new o3(user, this, AndroidUtilities.dp(26.0f))};
        p1Var.a(this);
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public final void a() {
        if (!this.K || this.f28568y) {
            return;
        }
        this.f28568y = true;
        int dp = AndroidUtilities.dp(12.0f);
        this.F = dp;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, dp);
        this.f28561c = ofInt;
        ofInt.addUpdateListener(new y2(this, 0));
        this.f28561c.setInterpolator(wr.f28820g);
        this.f28561c.setDuration(200L);
        this.f28561c.start();
    }

    @Override
    public final void onAttachedToWindow() {
        o3[] o3VarArr;
        o3[] o3VarArr2;
        super.onAttachedToWindow();
        if (this.K) {
            for (o3 o3Var : this.f28559a) {
                n5 n5Var = o3Var.f28312a;
                if (n5Var != null) {
                    n5Var.a();
                    ValueAnimator valueAnimator = o3Var.f28313b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (o3 o3Var2 : this.f28560b) {
                n5 n5Var2 = o3Var2.f28312a;
                if (n5Var2 != null) {
                    n5Var2.a();
                    ValueAnimator valueAnimator2 = o3Var2.f28313b;
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
            for (o3 o3Var : this.f28559a) {
                n5 n5Var = o3Var.f28312a;
                if (n5Var != null) {
                    ValueAnimator valueAnimator = o3Var.f28313b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        o3Var.f28313b = null;
                    }
                    n5Var.b();
                }
            }
            for (o3 o3Var2 : this.f28560b) {
                n5 n5Var2 = o3Var2.f28312a;
                if (n5Var2 != null) {
                    ValueAnimator valueAnimator2 = o3Var2.f28313b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        o3Var2.f28313b = null;
                    }
                    n5Var2.b();
                }
            }
            ValueAnimator valueAnimator3 = this.f28561c;
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
        p1 p1Var = this.H;
        p1Var.d(x10, y3);
        int measuredWidth = getMeasuredWidth() / 2;
        o3[] o3VarArr = this.f28559a;
        o3VarArr[0].b((measuredWidth - AndroidUtilities.dp(120.0f)) - this.d, AndroidUtilities.dp(120.0f) - this.f28564r);
        o3VarArr[1].b((measuredWidth - AndroidUtilities.dp(180.0f)) - this.e, AndroidUtilities.dp(150.0f) - this.f28565s);
        o3VarArr[2].b((measuredWidth - AndroidUtilities.dp(150.0f)) - this.f28562f, AndroidUtilities.dp(185.0f) - this.v);
        o3VarArr[3].b((measuredWidth - AndroidUtilities.dp(176.0f)) - this.h, AndroidUtilities.dp(240.0f) - this.f28566w);
        o3VarArr[4].b((measuredWidth - AndroidUtilities.dp(130.0f)) - this.f28563n, AndroidUtilities.dp(265.0f) - this.f28567x);
        for (o3 o3Var : o3VarArr) {
            o3Var.a(canvas);
        }
        o3[] o3VarArr2 = this.f28560b;
        o3VarArr2[0].b(AndroidUtilities.dp(50.0f) + measuredWidth + this.d, AndroidUtilities.dp(120.0f) - this.f28564r);
        o3VarArr2[1].b(AndroidUtilities.dp(110.0f) + measuredWidth + this.e, AndroidUtilities.dp(150.0f) - this.f28565s);
        o3VarArr2[2].b(AndroidUtilities.dp(80.0f) + measuredWidth + this.f28562f, AndroidUtilities.dp(185.0f) - this.v);
        o3VarArr2[3].b(AndroidUtilities.dp(106.0f) + measuredWidth + this.h, AndroidUtilities.dp(240.0f) - this.f28566w);
        o3VarArr2[4].b(AndroidUtilities.dp(60.0f) + measuredWidth + this.f28563n, AndroidUtilities.dp(265.0f) - this.f28567x);
        for (o3 o3Var2 : o3VarArr2) {
            o3Var2.a(canvas);
        }
        int alpha = p1Var.b().getAlpha();
        Paint paint = this.I;
        paint.setAlpha(255);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
        p1Var.b().setAlpha(255);
        canvas.drawRect(rect, p1Var.b());
        p1Var.b().setAlpha(alpha);
        if (p1Var.e) {
            int alpha2 = ((Paint) p1Var.d.f6103a).getAlpha();
            ((Paint) p1Var.d.f6103a).setAlpha(255);
            canvas.drawRect(rect, (Paint) p1Var.d.f6103a);
            ((Paint) p1Var.d.f6103a).setAlpha(alpha2);
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        o3[] o3VarArr;
        o3[] o3VarArr2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.K) {
            for (o3 o3Var : this.f28559a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                o3Var.f28323o = measuredWidth;
                o3Var.f28319k.invalidate();
            }
            for (o3 o3Var2 : this.f28560b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                o3Var2.f28323o = measuredWidth2;
                o3Var2.f28319k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.G = z10;
        invalidate();
    }
}
