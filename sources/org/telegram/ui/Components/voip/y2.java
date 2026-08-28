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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i5;
public final class y2 extends View {
    public boolean A;
    public int B;
    public boolean C;
    public final n1 D;
    public final Paint E;
    public final Rect F;
    public final boolean G;
    public final n3[] f33954a;
    public final n3[] f33955b;
    public ValueAnimator f33956c;
    public int d;
    public int f33957e;
    public int f33958f;
    public int h;
    public int f33959n;
    public int f33960r;
    public int f33961s;
    public int v;
    public int f33962w;
    public int f33963x;
    public boolean f33964y;

    public y2(Activity activity, TLRPC.User user, n1 n1Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.E = paint;
        this.F = new Rect();
        boolean isEnabled = LiteMode.isEnabled(512);
        this.G = isEnabled;
        this.D = n1Var;
        if (!isEnabled) {
            return;
        }
        this.f33954a = new n3[]{new n3(user, this, AndroidUtilities.dp(32.0f)), new n3(user, this, AndroidUtilities.dp(28.0f)), new n3(user, this, AndroidUtilities.dp(35.0f)), new n3(user, this, AndroidUtilities.dp(28.0f)), new n3(user, this, AndroidUtilities.dp(26.0f))};
        this.f33955b = new n3[]{new n3(user, this, AndroidUtilities.dp(32.0f)), new n3(user, this, AndroidUtilities.dp(28.0f)), new n3(user, this, AndroidUtilities.dp(35.0f)), new n3(user, this, AndroidUtilities.dp(28.0f)), new n3(user, this, AndroidUtilities.dp(26.0f))};
        n1Var.a(this);
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public final void a() {
        if (!this.G || this.f33964y) {
            return;
        }
        this.f33964y = true;
        int dp = AndroidUtilities.dp(12.0f);
        this.B = dp;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, dp);
        this.f33956c = ofInt;
        ofInt.addUpdateListener(new x2(this, 0));
        this.f33956c.setInterpolator(gr.f28845g);
        this.f33956c.setDuration(200L);
        this.f33956c.start();
    }

    @Override
    public final void onAttachedToWindow() {
        n3[] n3VarArr;
        n3[] n3VarArr2;
        super.onAttachedToWindow();
        if (this.G) {
            for (n3 n3Var : this.f33954a) {
                i5 i5Var = n3Var.f33699a;
                if (i5Var != null) {
                    i5Var.a();
                    ValueAnimator valueAnimator = n3Var.f33700b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (n3 n3Var2 : this.f33955b) {
                i5 i5Var2 = n3Var2.f33699a;
                if (i5Var2 != null) {
                    i5Var2.a();
                    ValueAnimator valueAnimator2 = n3Var2.f33700b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        n3[] n3VarArr;
        n3[] n3VarArr2;
        super.onDetachedFromWindow();
        if (this.G) {
            for (n3 n3Var : this.f33954a) {
                i5 i5Var = n3Var.f33699a;
                if (i5Var != null) {
                    ValueAnimator valueAnimator = n3Var.f33700b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        n3Var.f33700b = null;
                    }
                    i5Var.b();
                }
            }
            for (n3 n3Var2 : this.f33955b) {
                i5 i5Var2 = n3Var2.f33699a;
                if (i5Var2 != null) {
                    ValueAnimator valueAnimator2 = n3Var2.f33700b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        n3Var2.f33700b = null;
                    }
                    i5Var2.b();
                }
            }
            ValueAnimator valueAnimator3 = this.f33956c;
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
        float x10 = getX();
        float y10 = getY();
        n1 n1Var = this.D;
        n1Var.d(x10, y10);
        int measuredWidth = getMeasuredWidth() / 2;
        n3[] n3VarArr = this.f33954a;
        n3VarArr[0].b((measuredWidth - AndroidUtilities.dp(120.0f)) - this.d, AndroidUtilities.dp(120.0f) - this.f33960r);
        n3VarArr[1].b((measuredWidth - AndroidUtilities.dp(180.0f)) - this.f33957e, AndroidUtilities.dp(150.0f) - this.f33961s);
        n3VarArr[2].b((measuredWidth - AndroidUtilities.dp(150.0f)) - this.f33958f, AndroidUtilities.dp(185.0f) - this.v);
        n3VarArr[3].b((measuredWidth - AndroidUtilities.dp(176.0f)) - this.h, AndroidUtilities.dp(240.0f) - this.f33962w);
        n3VarArr[4].b((measuredWidth - AndroidUtilities.dp(130.0f)) - this.f33959n, AndroidUtilities.dp(265.0f) - this.f33963x);
        for (n3 n3Var : n3VarArr) {
            n3Var.a(canvas);
        }
        n3[] n3VarArr2 = this.f33955b;
        n3VarArr2[0].b(AndroidUtilities.dp(50.0f) + measuredWidth + this.d, AndroidUtilities.dp(120.0f) - this.f33960r);
        n3VarArr2[1].b(AndroidUtilities.dp(110.0f) + measuredWidth + this.f33957e, AndroidUtilities.dp(150.0f) - this.f33961s);
        n3VarArr2[2].b(AndroidUtilities.dp(80.0f) + measuredWidth + this.f33958f, AndroidUtilities.dp(185.0f) - this.v);
        n3VarArr2[3].b(AndroidUtilities.dp(106.0f) + measuredWidth + this.h, AndroidUtilities.dp(240.0f) - this.f33962w);
        n3VarArr2[4].b(AndroidUtilities.dp(60.0f) + measuredWidth + this.f33959n, AndroidUtilities.dp(265.0f) - this.f33963x);
        for (n3 n3Var2 : n3VarArr2) {
            n3Var2.a(canvas);
        }
        int alpha = n1Var.b().getAlpha();
        Paint paint = this.E;
        paint.setAlpha(255);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
        n1Var.b().setAlpha(255);
        canvas.drawRect(rect, n1Var.b());
        n1Var.b().setAlpha(alpha);
        if (n1Var.f33689e) {
            int alpha2 = ((Paint) n1Var.d.f4160a).getAlpha();
            ((Paint) n1Var.d.f4160a).setAlpha(255);
            canvas.drawRect(rect, (Paint) n1Var.d.f4160a);
            ((Paint) n1Var.d.f4160a).setAlpha(alpha2);
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        n3[] n3VarArr;
        n3[] n3VarArr2;
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.G) {
            for (n3 n3Var : this.f33954a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                n3Var.f33711o = measuredWidth;
                n3Var.f33707k.invalidate();
            }
            for (n3 n3Var2 : this.f33955b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                n3Var2.f33711o = measuredWidth2;
                n3Var2.f33707k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.C = z10;
        invalidate();
    }
}
