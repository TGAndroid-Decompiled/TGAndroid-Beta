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
import org.telegram.ui.Components.pr;
public final class a3 extends View {
    public boolean B;
    public int C;
    public boolean D;
    public final o1 E;
    public final Paint F;
    public final Rect G;
    public final boolean H;
    public final p3[] f31950a;
    public final p3[] f31951b;
    public ValueAnimator f31952c;
    public int d;
    public int f31953e;
    public int f31954f;
    public int h;
    public int f31955n;
    public int f31956r;
    public int f31957s;
    public int v;
    public int f31958w;
    public int f31959x;
    public boolean f31960y;

    public a3(Activity activity, TLRPC.User user, o1 o1Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.F = paint;
        this.G = new Rect();
        boolean isEnabled = LiteMode.isEnabled(512);
        this.H = isEnabled;
        this.E = o1Var;
        if (!isEnabled) {
            return;
        }
        this.f31950a = new p3[]{new p3(user, this, AndroidUtilities.dp(32.0f)), new p3(user, this, AndroidUtilities.dp(28.0f)), new p3(user, this, AndroidUtilities.dp(35.0f)), new p3(user, this, AndroidUtilities.dp(28.0f)), new p3(user, this, AndroidUtilities.dp(26.0f))};
        this.f31951b = new p3[]{new p3(user, this, AndroidUtilities.dp(32.0f)), new p3(user, this, AndroidUtilities.dp(28.0f)), new p3(user, this, AndroidUtilities.dp(35.0f)), new p3(user, this, AndroidUtilities.dp(28.0f)), new p3(user, this, AndroidUtilities.dp(26.0f))};
        o1Var.a(this);
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public final void a() {
        if (!this.H || this.f31960y) {
            return;
        }
        this.f31960y = true;
        int dp = AndroidUtilities.dp(12.0f);
        this.C = dp;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, dp);
        this.f31952c = ofInt;
        ofInt.addUpdateListener(new z2(this, 0));
        this.f31952c.setInterpolator(pr.f30184g);
        this.f31952c.setDuration(200L);
        this.f31952c.start();
    }

    @Override
    public final void onAttachedToWindow() {
        p3[] p3VarArr;
        p3[] p3VarArr2;
        super.onAttachedToWindow();
        if (this.H) {
            for (p3 p3Var : this.f31950a) {
                j5 j5Var = p3Var.f32262a;
                if (j5Var != null) {
                    j5Var.a();
                    ValueAnimator valueAnimator = p3Var.f32263b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (p3 p3Var2 : this.f31951b) {
                j5 j5Var2 = p3Var2.f32262a;
                if (j5Var2 != null) {
                    j5Var2.a();
                    ValueAnimator valueAnimator2 = p3Var2.f32263b;
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
        if (this.H) {
            for (p3 p3Var : this.f31950a) {
                j5 j5Var = p3Var.f32262a;
                if (j5Var != null) {
                    ValueAnimator valueAnimator = p3Var.f32263b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        p3Var.f32263b = null;
                    }
                    j5Var.b();
                }
            }
            for (p3 p3Var2 : this.f31951b) {
                j5 j5Var2 = p3Var2.f32262a;
                if (j5Var2 != null) {
                    ValueAnimator valueAnimator2 = p3Var2.f32263b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        p3Var2.f32263b = null;
                    }
                    j5Var2.b();
                }
            }
            ValueAnimator valueAnimator3 = this.f31952c;
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
        o1 o1Var = this.E;
        o1Var.d(x10, y10);
        int measuredWidth = getMeasuredWidth() / 2;
        p3[] p3VarArr = this.f31950a;
        p3VarArr[0].b((measuredWidth - AndroidUtilities.dp(120.0f)) - this.d, AndroidUtilities.dp(120.0f) - this.f31956r);
        p3VarArr[1].b((measuredWidth - AndroidUtilities.dp(180.0f)) - this.f31953e, AndroidUtilities.dp(150.0f) - this.f31957s);
        p3VarArr[2].b((measuredWidth - AndroidUtilities.dp(150.0f)) - this.f31954f, AndroidUtilities.dp(185.0f) - this.v);
        p3VarArr[3].b((measuredWidth - AndroidUtilities.dp(176.0f)) - this.h, AndroidUtilities.dp(240.0f) - this.f31958w);
        p3VarArr[4].b((measuredWidth - AndroidUtilities.dp(130.0f)) - this.f31955n, AndroidUtilities.dp(265.0f) - this.f31959x);
        for (p3 p3Var : p3VarArr) {
            p3Var.a(canvas);
        }
        p3[] p3VarArr2 = this.f31951b;
        p3VarArr2[0].b(AndroidUtilities.dp(50.0f) + measuredWidth + this.d, AndroidUtilities.dp(120.0f) - this.f31956r);
        p3VarArr2[1].b(AndroidUtilities.dp(110.0f) + measuredWidth + this.f31953e, AndroidUtilities.dp(150.0f) - this.f31957s);
        p3VarArr2[2].b(AndroidUtilities.dp(80.0f) + measuredWidth + this.f31954f, AndroidUtilities.dp(185.0f) - this.v);
        p3VarArr2[3].b(AndroidUtilities.dp(106.0f) + measuredWidth + this.h, AndroidUtilities.dp(240.0f) - this.f31958w);
        p3VarArr2[4].b(AndroidUtilities.dp(60.0f) + measuredWidth + this.f31955n, AndroidUtilities.dp(265.0f) - this.f31959x);
        for (p3 p3Var2 : p3VarArr2) {
            p3Var2.a(canvas);
        }
        int alpha = o1Var.b().getAlpha();
        Paint paint = this.F;
        paint.setAlpha(255);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
        o1Var.b().setAlpha(255);
        canvas.drawRect(rect, o1Var.b());
        o1Var.b().setAlpha(alpha);
        if (o1Var.f32230e) {
            int alpha2 = ((Paint) o1Var.d.f155a).getAlpha();
            ((Paint) o1Var.d.f155a).setAlpha(255);
            canvas.drawRect(rect, (Paint) o1Var.d.f155a);
            ((Paint) o1Var.d.f155a).setAlpha(alpha2);
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        p3[] p3VarArr;
        p3[] p3VarArr2;
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.H) {
            for (p3 p3Var : this.f31950a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                p3Var.f32274o = measuredWidth;
                p3Var.f32270k.invalidate();
            }
            for (p3 p3Var2 : this.f31951b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                p3Var2.f32274o = measuredWidth2;
                p3Var2.f32270k.invalidate();
            }
        }
    }

    public void setState(boolean z4) {
        this.D = z4;
        invalidate();
    }
}
