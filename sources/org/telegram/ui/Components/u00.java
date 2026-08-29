package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class u00 extends FrameLayout {
    public ValueAnimator A;
    public np B;
    public Paint f33070a;
    public n6 f33071b;
    public n6 f33072c;
    public float d;
    public d6 f33073e;
    public View f33074f;
    public float h;
    public boolean f33075n;
    public ValueAnimator f33076r;
    public float f33077s;
    public ValueAnimator v;
    public int f33078w;
    public float f33079x;
    public boolean f33080y;

    public final void a(boolean z10) {
        float f9;
        if (this.f33075n != z10) {
            ValueAnimator valueAnimator = this.f33076r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f33076r = null;
            }
            float f10 = this.h;
            this.f33075n = z10;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.f33076r = ofFloat;
            ofFloat.addUpdateListener(new t00(this, 2));
            this.f33076r.addListener(new z9(9, this, z10));
            this.f33076r.setDuration(320L);
            this.f33076r.setInterpolator(jr.h);
            this.f33076r.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        n6 n6Var = this.f33071b;
        if (z10) {
            n6Var.b();
        }
        n6Var.q(charSequence, z10, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f33070a;
        n6 n6Var = this.f33072c;
        n6 n6Var2 = this.f33071b;
        this.f33074f.draw(canvas);
        if (this.h > 0.0f) {
            if (this.B == null) {
                this.B = new np(n6Var2.f30861a.getColor());
            }
            int dp = (int) ((1.0f - this.h) * AndroidUtilities.dp(24.0f));
            this.B.setBounds(0, dp, getWidth(), getHeight() + dp);
            this.B.setAlpha((int) (this.h * 255.0f));
            this.B.draw(canvas);
            invalidate();
        }
        float f9 = this.h;
        if (f9 < 1.0f) {
            if (f9 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.h * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.h * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float d = n6Var2.d();
            float d10 = this.f33073e.d(this.d, false);
            float d11 = ((n6Var.d() + AndroidUtilities.dp(15.66f)) * d10) + d;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - d11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - n6Var2.f30864e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) j7.l1.c(getMeasuredWidth() - d11, getWidth(), 2.0f, d), (int) (((getMeasuredHeight() + n6Var2.f30864e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            n6Var2.f30880w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.f33079x) * (1.0f - this.h) * 255.0f);
            n6Var2.setBounds(rect);
            n6Var2.draw(canvas);
            rect.set((int) (com.google.android.recaptcha.internal.a.A(getMeasuredWidth(), d11, 2.0f, d) + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), n6Var.d()) + com.google.android.recaptcha.internal.a.A(getMeasuredWidth(), d11, 2.0f, d) + AndroidUtilities.dp(13.0f)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.f33077s != 1.0f) {
                canvas.save();
                float f10 = this.f33077s;
                canvas.scale(f10, f10, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.h) * 255.0f * d10 * d10));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
            n6Var.f30880w = (int) org.telegram.messenger.x3.y(1.0f, this.h, 255.0f, d10);
            n6Var.setBounds(rect);
            n6Var.draw(canvas);
            if (this.f33077s != 1.0f) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f33071b.f30866g);
        if (this.f33078w > 0) {
            str = ", " + LocaleController.formatPluralString("Chats", this.f33078w, new Object[0]);
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void setEnabled(boolean z10) {
        float f9;
        if (this.f33080y != z10) {
            ValueAnimator valueAnimator = this.A;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.A = null;
            }
            float f10 = this.f33079x;
            this.f33080y = z10;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.A = ofFloat;
            ofFloat.addUpdateListener(new t00(this, 0));
            this.A.addListener(new kg.r(2));
            this.A.start();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f33071b != drawable && this.f33072c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
