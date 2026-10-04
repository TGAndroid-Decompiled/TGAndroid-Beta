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
import org.telegram.ui.Components.tr;
public final class a3 extends View {
    public boolean E;
    public int F;
    public boolean G;
    public final r1 H;
    public final Paint I;
    public final Rect J;
    public final boolean K;
    public final p3[] f31775a;
    public final p3[] f31776b;
    public ValueAnimator f31777c;
    public int d;
    public int f31778e;
    public int f31779f;
    public int h;
    public int f31780n;
    public int f31781r;
    public int f31782s;
    public int v;
    public int f31783w;
    public int f31784x;
    public boolean f31785y;

    public a3(Activity activity, TLRPC.User user, r1 r1Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.I = paint;
        this.J = new Rect();
        boolean isEnabled = LiteMode.isEnabled(512);
        this.K = isEnabled;
        this.H = r1Var;
        if (!isEnabled) {
            return;
        }
        this.f31775a = new p3[]{new p3(user, this, AndroidUtilities.dp(32.0f)), new p3(user, this, AndroidUtilities.dp(28.0f)), new p3(user, this, AndroidUtilities.dp(35.0f)), new p3(user, this, AndroidUtilities.dp(28.0f)), new p3(user, this, AndroidUtilities.dp(26.0f))};
        this.f31776b = new p3[]{new p3(user, this, AndroidUtilities.dp(32.0f)), new p3(user, this, AndroidUtilities.dp(28.0f)), new p3(user, this, AndroidUtilities.dp(35.0f)), new p3(user, this, AndroidUtilities.dp(28.0f)), new p3(user, this, AndroidUtilities.dp(26.0f))};
        r1Var.a(this);
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public final void a() {
        if (!this.K || this.f31785y) {
            return;
        }
        this.f31785y = true;
        int dp = AndroidUtilities.dp(12.0f);
        this.F = dp;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, dp);
        this.f31777c = ofInt;
        ofInt.addUpdateListener(new z2(this, 0));
        this.f31777c.setInterpolator(tr.f31148g);
        this.f31777c.setDuration(200L);
        this.f31777c.start();
    }

    @Override
    public final void onAttachedToWindow() {
        p3[] p3VarArr;
        p3[] p3VarArr2;
        super.onAttachedToWindow();
        if (this.K) {
            for (p3 p3Var : this.f31775a) {
                o5 o5Var = p3Var.f32079a;
                if (o5Var != null) {
                    o5Var.a();
                    ValueAnimator valueAnimator = p3Var.f32080b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (p3 p3Var2 : this.f31776b) {
                o5 o5Var2 = p3Var2.f32079a;
                if (o5Var2 != null) {
                    o5Var2.a();
                    ValueAnimator valueAnimator2 = p3Var2.f32080b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        p3[] p3VarArr;
        p3[] p3VarArr2;
        super.onDetachedFromWindow();
        if (this.K) {
            for (p3 p3Var : this.f31775a) {
                o5 o5Var = p3Var.f32079a;
                if (o5Var != null) {
                    ValueAnimator valueAnimator = p3Var.f32080b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        p3Var.f32080b = null;
                    }
                    o5Var.b();
                }
            }
            for (p3 p3Var2 : this.f31776b) {
                o5 o5Var2 = p3Var2.f32079a;
                if (o5Var2 != null) {
                    ValueAnimator valueAnimator2 = p3Var2.f32080b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        p3Var2.f32080b = null;
                    }
                    o5Var2.b();
                }
            }
            ValueAnimator valueAnimator3 = this.f31777c;
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
        r1 r1Var = this.H;
        r1Var.d(x10, y3);
        int measuredWidth = getMeasuredWidth() / 2;
        p3[] p3VarArr = this.f31775a;
        p3VarArr[0].b((measuredWidth - AndroidUtilities.dp(120.0f)) - this.d, AndroidUtilities.dp(120.0f) - this.f31781r);
        p3VarArr[1].b((measuredWidth - AndroidUtilities.dp(180.0f)) - this.f31778e, AndroidUtilities.dp(150.0f) - this.f31782s);
        p3VarArr[2].b((measuredWidth - AndroidUtilities.dp(150.0f)) - this.f31779f, AndroidUtilities.dp(185.0f) - this.v);
        p3VarArr[3].b((measuredWidth - AndroidUtilities.dp(176.0f)) - this.h, AndroidUtilities.dp(240.0f) - this.f31783w);
        p3VarArr[4].b((measuredWidth - AndroidUtilities.dp(130.0f)) - this.f31780n, AndroidUtilities.dp(265.0f) - this.f31784x);
        for (p3 p3Var : p3VarArr) {
            p3Var.a(canvas);
        }
        p3[] p3VarArr2 = this.f31776b;
        p3VarArr2[0].b(AndroidUtilities.dp(50.0f) + measuredWidth + this.d, AndroidUtilities.dp(120.0f) - this.f31781r);
        p3VarArr2[1].b(AndroidUtilities.dp(110.0f) + measuredWidth + this.f31778e, AndroidUtilities.dp(150.0f) - this.f31782s);
        p3VarArr2[2].b(AndroidUtilities.dp(80.0f) + measuredWidth + this.f31779f, AndroidUtilities.dp(185.0f) - this.v);
        p3VarArr2[3].b(AndroidUtilities.dp(106.0f) + measuredWidth + this.h, AndroidUtilities.dp(240.0f) - this.f31783w);
        p3VarArr2[4].b(AndroidUtilities.dp(60.0f) + measuredWidth + this.f31780n, AndroidUtilities.dp(265.0f) - this.f31784x);
        for (p3 p3Var2 : p3VarArr2) {
            p3Var2.a(canvas);
        }
        int alpha = r1Var.b().getAlpha();
        Paint paint = this.I;
        paint.setAlpha(255);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
        r1Var.b().setAlpha(255);
        canvas.drawRect(rect, r1Var.b());
        r1Var.b().setAlpha(alpha);
        if (r1Var.f32112e) {
            int alpha2 = ((Paint) r1Var.d.f7905a).getAlpha();
            ((Paint) r1Var.d.f7905a).setAlpha(255);
            canvas.drawRect(rect, (Paint) r1Var.d.f7905a);
            ((Paint) r1Var.d.f7905a).setAlpha(alpha2);
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        p3[] p3VarArr;
        p3[] p3VarArr2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.K) {
            for (p3 p3Var : this.f31775a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                p3Var.f32091o = measuredWidth;
                p3Var.f32087k.invalidate();
            }
            for (p3 p3Var2 : this.f31776b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                p3Var2.f32091o = measuredWidth2;
                p3Var2.f32087k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.G = z10;
        invalidate();
    }
}
