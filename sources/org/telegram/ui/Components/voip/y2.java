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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.q5;
public final class y2 extends View {
    public boolean E;
    public int F;
    public boolean G;
    public final o1 H;
    public final Paint I;
    public final Rect J;
    public final boolean K;
    public final n3[] f30599a;
    public final n3[] f30600b;
    public ValueAnimator f30601c;
    public int d;
    public int e;
    public int f30602f;
    public int h;
    public int f30603n;
    public int f30604r;
    public int f30605s;
    public int v;
    public int f30606w;
    public int f30607x;
    public boolean f30608y;

    public y2(Activity activity, TLRPC.User user, o1 o1Var) {
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
        this.f30599a = new n3[]{new n3(user, this, AndroidUtilities.dp(32.0f)), new n3(user, this, AndroidUtilities.dp(28.0f)), new n3(user, this, AndroidUtilities.dp(35.0f)), new n3(user, this, AndroidUtilities.dp(28.0f)), new n3(user, this, AndroidUtilities.dp(26.0f))};
        this.f30600b = new n3[]{new n3(user, this, AndroidUtilities.dp(32.0f)), new n3(user, this, AndroidUtilities.dp(28.0f)), new n3(user, this, AndroidUtilities.dp(35.0f)), new n3(user, this, AndroidUtilities.dp(28.0f)), new n3(user, this, AndroidUtilities.dp(26.0f))};
        o1Var.a(this);
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public final void a() {
        if (!this.K || this.f30608y) {
            return;
        }
        this.f30608y = true;
        int dp = AndroidUtilities.dp(12.0f);
        this.F = dp;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, dp);
        this.f30601c = ofInt;
        ofInt.addUpdateListener(new x2(this, 0));
        this.f30601c.setInterpolator(es.f24772g);
        this.f30601c.setDuration(200L);
        this.f30601c.start();
    }

    @Override
    public final void onAttachedToWindow() {
        n3[] n3VarArr;
        n3[] n3VarArr2;
        super.onAttachedToWindow();
        if (this.K) {
            for (n3 n3Var : this.f30599a) {
                q5 q5Var = n3Var.f30339a;
                if (q5Var != null) {
                    q5Var.a();
                    ValueAnimator valueAnimator = n3Var.f30340b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (n3 n3Var2 : this.f30600b) {
                q5 q5Var2 = n3Var2.f30339a;
                if (q5Var2 != null) {
                    q5Var2.a();
                    ValueAnimator valueAnimator2 = n3Var2.f30340b;
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
        if (this.K) {
            for (n3 n3Var : this.f30599a) {
                q5 q5Var = n3Var.f30339a;
                if (q5Var != null) {
                    ValueAnimator valueAnimator = n3Var.f30340b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        n3Var.f30340b = null;
                    }
                    q5Var.b();
                }
            }
            for (n3 n3Var2 : this.f30600b) {
                q5 q5Var2 = n3Var2.f30339a;
                if (q5Var2 != null) {
                    ValueAnimator valueAnimator2 = n3Var2.f30340b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        n3Var2.f30340b = null;
                    }
                    q5Var2.b();
                }
            }
            ValueAnimator valueAnimator3 = this.f30601c;
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
        n3[] n3VarArr = this.f30599a;
        n3VarArr[0].b((measuredWidth - AndroidUtilities.dp(120.0f)) - this.d, AndroidUtilities.dp(120.0f) - this.f30604r);
        n3VarArr[1].b((measuredWidth - AndroidUtilities.dp(180.0f)) - this.e, AndroidUtilities.dp(150.0f) - this.f30605s);
        n3VarArr[2].b((measuredWidth - AndroidUtilities.dp(150.0f)) - this.f30602f, AndroidUtilities.dp(185.0f) - this.v);
        n3VarArr[3].b((measuredWidth - AndroidUtilities.dp(176.0f)) - this.h, AndroidUtilities.dp(240.0f) - this.f30606w);
        n3VarArr[4].b((measuredWidth - AndroidUtilities.dp(130.0f)) - this.f30603n, AndroidUtilities.dp(265.0f) - this.f30607x);
        for (n3 n3Var : n3VarArr) {
            n3Var.a(canvas);
        }
        n3[] n3VarArr2 = this.f30600b;
        n3VarArr2[0].b(AndroidUtilities.dp(50.0f) + measuredWidth + this.d, AndroidUtilities.dp(120.0f) - this.f30604r);
        n3VarArr2[1].b(AndroidUtilities.dp(110.0f) + measuredWidth + this.e, AndroidUtilities.dp(150.0f) - this.f30605s);
        n3VarArr2[2].b(AndroidUtilities.dp(80.0f) + measuredWidth + this.f30602f, AndroidUtilities.dp(185.0f) - this.v);
        n3VarArr2[3].b(AndroidUtilities.dp(106.0f) + measuredWidth + this.h, AndroidUtilities.dp(240.0f) - this.f30606w);
        n3VarArr2[4].b(AndroidUtilities.dp(60.0f) + measuredWidth + this.f30603n, AndroidUtilities.dp(265.0f) - this.f30607x);
        for (n3 n3Var2 : n3VarArr2) {
            n3Var2.a(canvas);
        }
        int alpha = o1Var.b().getAlpha();
        Paint paint = this.I;
        paint.setAlpha(255);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
        o1Var.b().setAlpha(255);
        canvas.drawRect(rect, o1Var.b());
        o1Var.b().setAlpha(alpha);
        if (o1Var.e) {
            int alpha2 = ((Paint) o1Var.d.f6191a).getAlpha();
            ((Paint) o1Var.d.f6191a).setAlpha(255);
            canvas.drawRect(rect, (Paint) o1Var.d.f6191a);
            ((Paint) o1Var.d.f6191a).setAlpha(alpha2);
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        n3[] n3VarArr;
        n3[] n3VarArr2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.K) {
            for (n3 n3Var : this.f30599a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                n3Var.f30350o = measuredWidth;
                n3Var.f30346k.invalidate();
            }
            for (n3 n3Var2 : this.f30600b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                n3Var2.f30350o = measuredWidth2;
                n3Var2.f30346k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.G = z10;
        invalidate();
    }
}
