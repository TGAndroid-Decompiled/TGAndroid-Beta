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
public final class k10 extends FrameLayout {
    public ValueAnimator E;
    public gq F;
    public Paint f26168a;
    public r6 f26169b;
    public r6 f26170c;
    public float d;
    public g6 e;
    public View f26171f;
    public float h;
    public boolean f26172n;
    public ValueAnimator f26173r;
    public float f26174s;
    public ValueAnimator v;
    public int f26175w;
    public float f26176x;
    public boolean f26177y;

    public final void a(boolean z10) {
        float f7;
        if (this.f26172n != z10) {
            ValueAnimator valueAnimator = this.f26173r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f26173r = null;
            }
            float f10 = this.h;
            this.f26172n = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f26173r = ofFloat;
            ofFloat.addUpdateListener(new j10(this, 2));
            this.f26173r.addListener(new org.telegram.ui.vo(10, this, z10));
            this.f26173r.setDuration(320L);
            this.f26173r.setInterpolator(es.h);
            this.f26173r.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        r6 r6Var = this.f26169b;
        if (z10) {
            r6Var.a();
        }
        r6Var.t(charSequence, z10, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f26168a;
        r6 r6Var = this.f26170c;
        r6 r6Var2 = this.f26169b;
        this.f26171f.draw(canvas);
        if (this.h > 0.0f) {
            if (this.F == null) {
                this.F = new gq(r6Var2.f28433a.getColor());
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
            float c10 = r6Var2.c();
            float d = this.e.d(this.d, false);
            float c11 = ((r6Var.c() + AndroidUtilities.dp(15.66f)) * d) + c10;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - c11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - r6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.g0.a(getMeasuredWidth() - c11, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + r6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            r6Var2.B = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.f26176x) * (1.0f - this.h) * 255.0f);
            r6Var2.setBounds(rect);
            r6Var2.draw(canvas);
            rect.set((int) (com.google.android.gms.internal.play_billing.k3.z(getMeasuredWidth(), c11, 2.0f, c10) + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), r6Var.c()) + com.google.android.gms.internal.play_billing.k3.z(getMeasuredWidth(), c11, 2.0f, c10) + AndroidUtilities.dp(13.0f)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.f26174s != 1.0f) {
                canvas.save();
                float f10 = this.f26174s;
                canvas.scale(f10, f10, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.h) * 255.0f * d * d));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
            r6Var.B = (int) org.telegram.messenger.g0.z(1.0f, this.h, 255.0f, d);
            r6Var.setBounds(rect);
            r6Var.draw(canvas);
            if (this.f26174s != 1.0f) {
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
        sb2.append((Object) this.f26169b.f28440i);
        if (this.f26175w > 0) {
            str = ", " + LocaleController.formatPluralString("Chats", this.f26175w, new Object[0]);
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void setEnabled(boolean z10) {
        float f7;
        if (this.f26177y != z10) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.E = null;
            }
            float f10 = this.f26176x;
            this.f26177y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new j10(this, 0));
            this.E.addListener(new ah.z(2));
            this.E.start();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f26169b != drawable && this.f26170c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
