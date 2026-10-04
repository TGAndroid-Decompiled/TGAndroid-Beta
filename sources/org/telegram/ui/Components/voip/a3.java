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
    public final p3[] f31768a;
    public final p3[] f31769b;
    public ValueAnimator f31770c;
    public int d;
    public int f31771e;
    public int f31772f;
    public int h;
    public int f31773n;
    public int f31774r;
    public int f31775s;
    public int v;
    public int f31776w;
    public int f31777x;
    public boolean f31778y;

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
        this.f31768a = new p3[]{new p3(user, this, AndroidUtilities.dp(32.0f)), new p3(user, this, AndroidUtilities.dp(28.0f)), new p3(user, this, AndroidUtilities.dp(35.0f)), new p3(user, this, AndroidUtilities.dp(28.0f)), new p3(user, this, AndroidUtilities.dp(26.0f))};
        this.f31769b = new p3[]{new p3(user, this, AndroidUtilities.dp(32.0f)), new p3(user, this, AndroidUtilities.dp(28.0f)), new p3(user, this, AndroidUtilities.dp(35.0f)), new p3(user, this, AndroidUtilities.dp(28.0f)), new p3(user, this, AndroidUtilities.dp(26.0f))};
        r1Var.a(this);
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public final void a() {
        if (!this.K || this.f31778y) {
            return;
        }
        this.f31778y = true;
        int dp = AndroidUtilities.dp(12.0f);
        this.F = dp;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, dp);
        this.f31770c = ofInt;
        ofInt.addUpdateListener(new z2(this, 0));
        this.f31770c.setInterpolator(tr.f31141g);
        this.f31770c.setDuration(200L);
        this.f31770c.start();
    }

    @Override
    public final void onAttachedToWindow() {
        p3[] p3VarArr;
        p3[] p3VarArr2;
        super.onAttachedToWindow();
        if (this.K) {
            for (p3 p3Var : this.f31768a) {
                o5 o5Var = p3Var.f32072a;
                if (o5Var != null) {
                    o5Var.a();
                    ValueAnimator valueAnimator = p3Var.f32073b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (p3 p3Var2 : this.f31769b) {
                o5 o5Var2 = p3Var2.f32072a;
                if (o5Var2 != null) {
                    o5Var2.a();
                    ValueAnimator valueAnimator2 = p3Var2.f32073b;
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
            for (p3 p3Var : this.f31768a) {
                o5 o5Var = p3Var.f32072a;
                if (o5Var != null) {
                    ValueAnimator valueAnimator = p3Var.f32073b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        p3Var.f32073b = null;
                    }
                    o5Var.b();
                }
            }
            for (p3 p3Var2 : this.f31769b) {
                o5 o5Var2 = p3Var2.f32072a;
                if (o5Var2 != null) {
                    ValueAnimator valueAnimator2 = p3Var2.f32073b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        p3Var2.f32073b = null;
                    }
                    o5Var2.b();
                }
            }
            ValueAnimator valueAnimator3 = this.f31770c;
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
        p3[] p3VarArr = this.f31768a;
        p3VarArr[0].b((measuredWidth - AndroidUtilities.dp(120.0f)) - this.d, AndroidUtilities.dp(120.0f) - this.f31774r);
        p3VarArr[1].b((measuredWidth - AndroidUtilities.dp(180.0f)) - this.f31771e, AndroidUtilities.dp(150.0f) - this.f31775s);
        p3VarArr[2].b((measuredWidth - AndroidUtilities.dp(150.0f)) - this.f31772f, AndroidUtilities.dp(185.0f) - this.v);
        p3VarArr[3].b((measuredWidth - AndroidUtilities.dp(176.0f)) - this.h, AndroidUtilities.dp(240.0f) - this.f31776w);
        p3VarArr[4].b((measuredWidth - AndroidUtilities.dp(130.0f)) - this.f31773n, AndroidUtilities.dp(265.0f) - this.f31777x);
        for (p3 p3Var : p3VarArr) {
            p3Var.a(canvas);
        }
        p3[] p3VarArr2 = this.f31769b;
        p3VarArr2[0].b(AndroidUtilities.dp(50.0f) + measuredWidth + this.d, AndroidUtilities.dp(120.0f) - this.f31774r);
        p3VarArr2[1].b(AndroidUtilities.dp(110.0f) + measuredWidth + this.f31771e, AndroidUtilities.dp(150.0f) - this.f31775s);
        p3VarArr2[2].b(AndroidUtilities.dp(80.0f) + measuredWidth + this.f31772f, AndroidUtilities.dp(185.0f) - this.v);
        p3VarArr2[3].b(AndroidUtilities.dp(106.0f) + measuredWidth + this.h, AndroidUtilities.dp(240.0f) - this.f31776w);
        p3VarArr2[4].b(AndroidUtilities.dp(60.0f) + measuredWidth + this.f31773n, AndroidUtilities.dp(265.0f) - this.f31777x);
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
        if (r1Var.f32105e) {
            int alpha2 = ((Paint) r1Var.d.f7904a).getAlpha();
            ((Paint) r1Var.d.f7904a).setAlpha(255);
            canvas.drawRect(rect, (Paint) r1Var.d.f7904a);
            ((Paint) r1Var.d.f7904a).setAlpha(alpha2);
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        p3[] p3VarArr;
        p3[] p3VarArr2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.K) {
            for (p3 p3Var : this.f31768a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                p3Var.f32084o = measuredWidth;
                p3Var.f32080k.invalidate();
            }
            for (p3 p3Var2 : this.f31769b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                p3Var2.f32084o = measuredWidth2;
                p3Var2.f32080k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.G = z10;
        invalidate();
    }
}
