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
    public tp F;
    public Paint f30413a;
    public n6 f30414b;
    public n6 f30415c;
    public float d;
    public d6 e;
    public View f30416f;
    public float h;
    public boolean f30417n;
    public ValueAnimator f30418r;
    public float f30419s;
    public ValueAnimator v;
    public int f30420w;
    public float f30421x;
    public boolean f30422y;

    public final void a(boolean z10) {
        float f7;
        if (this.f30417n != z10) {
            ValueAnimator valueAnimator = this.f30418r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f30418r = null;
            }
            float f10 = this.h;
            this.f30417n = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f30418r = ofFloat;
            ofFloat.addUpdateListener(new x00(this, 2));
            this.f30418r.addListener(new ba(9, this, z10));
            this.f30418r.setDuration(320L);
            this.f30418r.setInterpolator(qr.h);
            this.f30418r.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        n6 n6Var = this.f30414b;
        if (z10) {
            n6Var.b();
        }
        n6Var.q(charSequence, z10, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f30413a;
        n6 n6Var = this.f30415c;
        n6 n6Var2 = this.f30414b;
        this.f30416f.draw(canvas);
        if (this.h > 0.0f) {
            if (this.F == null) {
                this.F = new tp(n6Var2.f26574a.getColor());
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
            float d = n6Var2.d();
            float d10 = this.e.d(this.d, false);
            float d11 = ((n6Var.d() + AndroidUtilities.dp(15.66f)) * d10) + d;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - d11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - n6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.l0.a(getMeasuredWidth() - d11, getWidth(), 2.0f, d), (int) (((getMeasuredHeight() + n6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            n6Var2.f26592w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.f30421x) * (1.0f - this.h) * 255.0f);
            n6Var2.setBounds(rect);
            n6Var2.draw(canvas);
            rect.set((int) (com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), d11, 2.0f, d) + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), n6Var.d()) + com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), d11, 2.0f, d) + AndroidUtilities.dp(13.0f)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.f30419s != 1.0f) {
                canvas.save();
                float f10 = this.f30419s;
                canvas.scale(f10, f10, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.h) * 255.0f * d10 * d10));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
            n6Var.f26592w = (int) org.telegram.messenger.l0.z(1.0f, this.h, 255.0f, d10);
            n6Var.setBounds(rect);
            n6Var.draw(canvas);
            if (this.f30419s != 1.0f) {
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
        sb2.append((Object) this.f30414b.f26578g);
        if (this.f30420w > 0) {
            str = ", " + LocaleController.formatPluralString("Chats", this.f30420w, new Object[0]);
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void setEnabled(boolean z10) {
        float f7;
        if (this.f30422y != z10) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.E = null;
            }
            float f10 = this.f30421x;
            this.f30422y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new x00(this, 0));
            this.E.addListener(new ai.l2(1));
            this.E.start();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f30414b != drawable && this.f30415c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
