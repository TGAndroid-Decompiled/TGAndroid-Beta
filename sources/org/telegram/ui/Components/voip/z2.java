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
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.mr;
public final class z2 extends View {
    public boolean B;
    public int C;
    public boolean D;
    public final n1 E;
    public final Paint F;
    public final Rect G;
    public final boolean H;
    public final o3[] f30025a;
    public final o3[] f30026b;
    public ValueAnimator f30027c;
    public int d;
    public int e;
    public int f30028f;
    public int h;
    public int f30029n;
    public int f30030r;
    public int f30031s;
    public int v;
    public int f30032w;
    public int f30033x;
    public boolean f30034y;

    public z2(Activity activity, TLRPC.User user, n1 n1Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.F = paint;
        this.G = new Rect();
        boolean isEnabled = LiteMode.isEnabled(512);
        this.H = isEnabled;
        this.E = n1Var;
        if (!isEnabled) {
            return;
        }
        this.f30025a = new o3[]{new o3(user, this, AndroidUtilities.dp(32.0f)), new o3(user, this, AndroidUtilities.dp(28.0f)), new o3(user, this, AndroidUtilities.dp(35.0f)), new o3(user, this, AndroidUtilities.dp(28.0f)), new o3(user, this, AndroidUtilities.dp(26.0f))};
        this.f30026b = new o3[]{new o3(user, this, AndroidUtilities.dp(32.0f)), new o3(user, this, AndroidUtilities.dp(28.0f)), new o3(user, this, AndroidUtilities.dp(35.0f)), new o3(user, this, AndroidUtilities.dp(28.0f)), new o3(user, this, AndroidUtilities.dp(26.0f))};
        n1Var.a(this);
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public final void a() {
        if (!this.H || this.f30034y) {
            return;
        }
        this.f30034y = true;
        int dp = AndroidUtilities.dp(12.0f);
        this.C = dp;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, dp);
        this.f30027c = ofInt;
        ofInt.addUpdateListener(new y2(this, 0));
        this.f30027c.setInterpolator(mr.f27123g);
        this.f30027c.setDuration(200L);
        this.f30027c.start();
    }

    @Override
    public final void onAttachedToWindow() {
        o3[] o3VarArr;
        o3[] o3VarArr2;
        super.onAttachedToWindow();
        if (this.H) {
            for (o3 o3Var : this.f30025a) {
                j5 j5Var = o3Var.f29801a;
                if (j5Var != null) {
                    j5Var.a();
                    ValueAnimator valueAnimator = o3Var.f29802b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (o3 o3Var2 : this.f30026b) {
                j5 j5Var2 = o3Var2.f29801a;
                if (j5Var2 != null) {
                    j5Var2.a();
                    ValueAnimator valueAnimator2 = o3Var2.f29802b;
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
        if (this.H) {
            for (o3 o3Var : this.f30025a) {
                j5 j5Var = o3Var.f29801a;
                if (j5Var != null) {
                    ValueAnimator valueAnimator = o3Var.f29802b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        o3Var.f29802b = null;
                    }
                    j5Var.b();
                }
            }
            for (o3 o3Var2 : this.f30026b) {
                j5 j5Var2 = o3Var2.f29801a;
                if (j5Var2 != null) {
                    ValueAnimator valueAnimator2 = o3Var2.f29802b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        o3Var2.f29802b = null;
                    }
                    j5Var2.b();
                }
            }
            ValueAnimator valueAnimator3 = this.f30027c;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.H || this.D) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        Rect rect = this.G;
        rect.set(0, 0, width, height);
        float x10 = getX();
        float y10 = getY();
        n1 n1Var = this.E;
        n1Var.d(x10, y10);
        int measuredWidth = getMeasuredWidth() / 2;
        o3[] o3VarArr = this.f30025a;
        o3VarArr[0].b((measuredWidth - AndroidUtilities.dp(120.0f)) - this.d, AndroidUtilities.dp(120.0f) - this.f30030r);
        o3VarArr[1].b((measuredWidth - AndroidUtilities.dp(180.0f)) - this.e, AndroidUtilities.dp(150.0f) - this.f30031s);
        o3VarArr[2].b((measuredWidth - AndroidUtilities.dp(150.0f)) - this.f30028f, AndroidUtilities.dp(185.0f) - this.v);
        o3VarArr[3].b((measuredWidth - AndroidUtilities.dp(176.0f)) - this.h, AndroidUtilities.dp(240.0f) - this.f30032w);
        o3VarArr[4].b((measuredWidth - AndroidUtilities.dp(130.0f)) - this.f30029n, AndroidUtilities.dp(265.0f) - this.f30033x);
        for (o3 o3Var : o3VarArr) {
            o3Var.a(canvas);
        }
        o3[] o3VarArr2 = this.f30026b;
        o3VarArr2[0].b(AndroidUtilities.dp(50.0f) + measuredWidth + this.d, AndroidUtilities.dp(120.0f) - this.f30030r);
        o3VarArr2[1].b(AndroidUtilities.dp(110.0f) + measuredWidth + this.e, AndroidUtilities.dp(150.0f) - this.f30031s);
        o3VarArr2[2].b(AndroidUtilities.dp(80.0f) + measuredWidth + this.f30028f, AndroidUtilities.dp(185.0f) - this.v);
        o3VarArr2[3].b(AndroidUtilities.dp(106.0f) + measuredWidth + this.h, AndroidUtilities.dp(240.0f) - this.f30032w);
        o3VarArr2[4].b(AndroidUtilities.dp(60.0f) + measuredWidth + this.f30029n, AndroidUtilities.dp(265.0f) - this.f30033x);
        for (o3 o3Var2 : o3VarArr2) {
            o3Var2.a(canvas);
        }
        int alpha = n1Var.b().getAlpha();
        Paint paint = this.F;
        paint.setAlpha(255);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
        n1Var.b().setAlpha(255);
        canvas.drawRect(rect, n1Var.b());
        n1Var.b().setAlpha(alpha);
        if (n1Var.e) {
            int alpha2 = ((Paint) n1Var.d.f142a).getAlpha();
            ((Paint) n1Var.d.f142a).setAlpha(255);
            canvas.drawRect(rect, (Paint) n1Var.d.f142a);
            ((Paint) n1Var.d.f142a).setAlpha(alpha2);
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        o3[] o3VarArr;
        o3[] o3VarArr2;
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.H) {
            for (o3 o3Var : this.f30025a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                o3Var.f29812o = measuredWidth;
                o3Var.f29808k.invalidate();
            }
            for (o3 o3Var2 : this.f30026b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                o3Var2.f29812o = measuredWidth2;
                o3Var2.f29808k.invalidate();
            }
        }
    }

    public void setState(boolean z4) {
        this.D = z4;
        invalidate();
    }
}
