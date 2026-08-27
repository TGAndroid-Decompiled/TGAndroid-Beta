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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i5;

public final class y2 extends View {
    public boolean A;
    public int B;
    public boolean C;
    public final n1 D;
    public final Paint E;
    public final Rect F;
    public final boolean G;

    public final n3[] f34004a;

    public final n3[] f34005b;

    public ValueAnimator f34006c;
    public int d;

    public int f34007e;

    public int f34008f;
    public int h;

    public int f34009n;

    public int f34010r;

    public int f34011s;
    public int v;

    public int f34012w;

    public int f34013x;

    public boolean f34014y;

    public y2(Activity activity, TLRPC.User user, n1 n1Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.E = paint;
        this.F = new Rect();
        boolean zIsEnabled = LiteMode.isEnabled(512);
        this.G = zIsEnabled;
        this.D = n1Var;
        if (zIsEnabled) {
            this.f34004a = new n3[]{new n3(user, this, AndroidUtilities.dp(32.0f)), new n3(user, this, AndroidUtilities.dp(28.0f)), new n3(user, this, AndroidUtilities.dp(35.0f)), new n3(user, this, AndroidUtilities.dp(28.0f)), new n3(user, this, AndroidUtilities.dp(26.0f))};
            this.f34005b = new n3[]{new n3(user, this, AndroidUtilities.dp(32.0f)), new n3(user, this, AndroidUtilities.dp(28.0f)), new n3(user, this, AndroidUtilities.dp(35.0f)), new n3(user, this, AndroidUtilities.dp(28.0f)), new n3(user, this, AndroidUtilities.dp(26.0f))};
            n1Var.a(this);
            setLayerType(2, null);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
    }

    public final void a() {
        if (this.G && !this.f34014y) {
            this.f34014y = true;
            int iDp = AndroidUtilities.dp(12.0f);
            this.B = iDp;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iDp);
            this.f34006c = valueAnimatorOfInt;
            valueAnimatorOfInt.addUpdateListener(new x2(this, 0));
            this.f34006c.setInterpolator(er.f28123g);
            this.f34006c.setDuration(200L);
            this.f34006c.start();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.G) {
            for (n3 n3Var : this.f34004a) {
                i5 i5Var = n3Var.f33749a;
                if (i5Var != null) {
                    i5Var.a();
                    ValueAnimator valueAnimator = n3Var.f33750b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (n3 n3Var2 : this.f34005b) {
                i5 i5Var2 = n3Var2.f33749a;
                if (i5Var2 != null) {
                    i5Var2.a();
                    ValueAnimator valueAnimator2 = n3Var2.f33750b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.G) {
            for (n3 n3Var : this.f34004a) {
                i5 i5Var = n3Var.f33749a;
                if (i5Var != null) {
                    ValueAnimator valueAnimator = n3Var.f33750b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        n3Var.f33750b = null;
                    }
                    i5Var.b();
                }
            }
            for (n3 n3Var2 : this.f34005b) {
                i5 i5Var2 = n3Var2.f33749a;
                if (i5Var2 != null) {
                    ValueAnimator valueAnimator2 = n3Var2.f33750b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        n3Var2.f33750b = null;
                    }
                    i5Var2.b();
                }
            }
            ValueAnimator valueAnimator3 = this.f34006c;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.G && !this.C) {
            int width = getWidth();
            int height = getHeight();
            Rect rect = this.F;
            rect.set(0, 0, width, height);
            float x8 = getX();
            float y10 = getY();
            n1 n1Var = this.D;
            n1Var.d(x8, y10);
            int measuredWidth = getMeasuredWidth() / 2;
            n3[] n3VarArr = this.f34004a;
            n3VarArr[0].b((measuredWidth - AndroidUtilities.dp(120.0f)) - this.d, AndroidUtilities.dp(120.0f) - this.f34010r);
            n3VarArr[1].b((measuredWidth - AndroidUtilities.dp(180.0f)) - this.f34007e, AndroidUtilities.dp(150.0f) - this.f34011s);
            n3VarArr[2].b((measuredWidth - AndroidUtilities.dp(150.0f)) - this.f34008f, AndroidUtilities.dp(185.0f) - this.v);
            n3VarArr[3].b((measuredWidth - AndroidUtilities.dp(176.0f)) - this.h, AndroidUtilities.dp(240.0f) - this.f34012w);
            n3VarArr[4].b((measuredWidth - AndroidUtilities.dp(130.0f)) - this.f34009n, AndroidUtilities.dp(265.0f) - this.f34013x);
            for (n3 n3Var : n3VarArr) {
                n3Var.a(canvas);
            }
            n3[] n3VarArr2 = this.f34005b;
            n3VarArr2[0].b(AndroidUtilities.dp(50.0f) + measuredWidth + this.d, AndroidUtilities.dp(120.0f) - this.f34010r);
            n3VarArr2[1].b(AndroidUtilities.dp(110.0f) + measuredWidth + this.f34007e, AndroidUtilities.dp(150.0f) - this.f34011s);
            n3VarArr2[2].b(AndroidUtilities.dp(80.0f) + measuredWidth + this.f34008f, AndroidUtilities.dp(185.0f) - this.v);
            n3VarArr2[3].b(AndroidUtilities.dp(106.0f) + measuredWidth + this.h, AndroidUtilities.dp(240.0f) - this.f34012w);
            n3VarArr2[4].b(AndroidUtilities.dp(60.0f) + measuredWidth + this.f34009n, AndroidUtilities.dp(265.0f) - this.f34013x);
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
            if (n1Var.f33739e) {
                int alpha2 = ((Paint) n1Var.d.f4602a).getAlpha();
                ((Paint) n1Var.d.f4602a).setAlpha(255);
                canvas.drawRect(rect, (Paint) n1Var.d.f4602a);
                ((Paint) n1Var.d.f4602a).setAlpha(alpha2);
            }
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.G) {
            for (n3 n3Var : this.f34004a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                n3Var.f33761o = measuredWidth;
                n3Var.f33757k.invalidate();
            }
            for (n3 n3Var2 : this.f34005b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                n3Var2.f33761o = measuredWidth2;
                n3Var2.f33757k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.C = z10;
        invalidate();
    }
}
