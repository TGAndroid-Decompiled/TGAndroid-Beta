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
public final class p10 extends FrameLayout {
    public ValueAnimator E;
    public jq F;
    public Paint f29677a;
    public q6 f29678b;
    public q6 f29679c;
    public float d;
    public g6 f29680e;
    public View f29681f;
    public float h;
    public boolean f29682n;
    public ValueAnimator f29683r;
    public float f29684s;
    public ValueAnimator v;
    public int f29685w;
    public float f29686x;
    public boolean f29687y;

    public final void a(boolean z10) {
        float f7;
        if (this.f29682n != z10) {
            ValueAnimator valueAnimator = this.f29683r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f29683r = null;
            }
            float f10 = this.h;
            this.f29682n = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f29683r = ofFloat;
            ofFloat.addUpdateListener(new o10(this, 2));
            this.f29683r.addListener(new ea(9, this, z10));
            this.f29683r.setDuration(320L);
            this.f29683r.setInterpolator(is.h);
            this.f29683r.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        q6 q6Var = this.f29678b;
        if (z10) {
            q6Var.a();
        }
        q6Var.t(charSequence, z10, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f29677a;
        q6 q6Var = this.f29679c;
        q6 q6Var2 = this.f29678b;
        this.f29681f.draw(canvas);
        if (this.h > 0.0f) {
            if (this.F == null) {
                this.F = new jq(q6Var2.f30132a.getColor());
            }
            int dp = (int) ((1.0f - this.h) * AndroidUtilities.dp(24.0f));
            this.F.setBounds(0, dp, getWidth(), getHeight() + dp);
            this.F.setAlpha((int) (this.h * 255.0f));
            this.F.draw(canvas);
            invalidate();
        }
        float f7 = this.h;
        if (f7 < 1.0f) {
            if (f7 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.h * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.h * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float c10 = q6Var2.c();
            float d = this.f29680e.d(this.d, false);
            float c11 = ((q6Var.c() + AndroidUtilities.dp(15.66f)) * d) + c10;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - c11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - q6Var2.f30137e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.q.a(getMeasuredWidth() - c11, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + q6Var2.f30137e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            q6Var2.B = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.f29686x) * (1.0f - this.h) * 255.0f);
            q6Var2.setBounds(rect);
            q6Var2.draw(canvas);
            rect.set((int) (com.google.android.gms.internal.vision.e2.z(getMeasuredWidth(), c11, 2.0f, c10) + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), q6Var.c()) + com.google.android.gms.internal.vision.e2.z(getMeasuredWidth(), c11, 2.0f, c10) + AndroidUtilities.dp(13.0f)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.f29684s != 1.0f) {
                canvas.save();
                float f10 = this.f29684s;
                canvas.scale(f10, f10, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.h) * 255.0f * d * d));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
            q6Var.B = (int) org.telegram.messenger.q.z(1.0f, this.h, 255.0f, d);
            q6Var.setBounds(rect);
            q6Var.draw(canvas);
            if (this.f29684s != 1.0f) {
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
        sb2.append((Object) this.f29678b.f30140i);
        if (this.f29685w > 0) {
            str = ", " + LocaleController.formatPluralString("Chats", this.f29685w, new Object[0]);
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void setEnabled(boolean z10) {
        float f7;
        if (this.f29687y != z10) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.E = null;
            }
            float f10 = this.f29686x;
            this.f29687y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new o10(this, 0));
            this.E.addListener(new ai.m2(1));
            this.E.start();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29678b != drawable && this.f29679c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
