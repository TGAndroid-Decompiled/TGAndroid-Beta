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
public final class y00 extends FrameLayout {
    public ValueAnimator E;
    public sp F;
    public Paint f32823a;
    public p6 f32824b;
    public p6 f32825c;
    public float d;
    public e6 f32826e;
    public View f32827f;
    public float h;
    public boolean f32828n;
    public ValueAnimator f32829r;
    public float f32830s;
    public ValueAnimator v;
    public int f32831w;
    public float f32832x;
    public boolean f32833y;

    public final void a(boolean z10) {
        float f7;
        if (this.f32828n != z10) {
            ValueAnimator valueAnimator = this.f32829r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f32829r = null;
            }
            float f10 = this.h;
            this.f32828n = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f32829r = ofFloat;
            ofFloat.addUpdateListener(new x00(this, 2));
            this.f32829r.addListener(new org.telegram.ui.to(10, this, z10));
            this.f32829r.setDuration(320L);
            this.f32829r.setInterpolator(pr.h);
            this.f32829r.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        p6 p6Var = this.f32824b;
        if (z10) {
            p6Var.b();
        }
        p6Var.q(charSequence, z10, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f32823a;
        p6 p6Var = this.f32825c;
        p6 p6Var2 = this.f32824b;
        this.f32827f.draw(canvas);
        if (this.h > 0.0f) {
            if (this.F == null) {
                this.F = new sp(p6Var2.f29311a.getColor());
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
            float d = p6Var2.d();
            float d10 = this.f32826e.d(this.d, false);
            float d11 = ((p6Var.d() + AndroidUtilities.dp(15.66f)) * d10) + d;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - d11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - p6Var2.f29314e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.w1.a(getMeasuredWidth() - d11, getWidth(), 2.0f, d), (int) (((getMeasuredHeight() + p6Var2.f29314e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            p6Var2.f29330w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.f32832x) * (1.0f - this.h) * 255.0f);
            p6Var2.setBounds(rect);
            p6Var2.draw(canvas);
            rect.set((int) (com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), d11, 2.0f, d) + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), p6Var.d()) + com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), d11, 2.0f, d) + AndroidUtilities.dp(13.0f)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.f32830s != 1.0f) {
                canvas.save();
                float f10 = this.f32830s;
                canvas.scale(f10, f10, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.h) * 255.0f * d10 * d10));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
            p6Var.f29330w = (int) org.telegram.messenger.w1.A(1.0f, this.h, 255.0f, d10);
            p6Var.setBounds(rect);
            p6Var.draw(canvas);
            if (this.f32830s != 1.0f) {
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
        sb2.append((Object) this.f32824b.f29316g);
        if (this.f32831w > 0) {
            str = ", " + LocaleController.formatPluralString("Chats", this.f32831w, new Object[0]);
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void setEnabled(boolean z10) {
        float f7;
        if (this.f32833y != z10) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.E = null;
            }
            float f10 = this.f32832x;
            this.f32833y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new x00(this, 0));
            this.E.addListener(new ah.a0(2));
            this.E.start();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f32824b != drawable && this.f32825c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
