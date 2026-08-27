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

public final class m00 extends FrameLayout {
    public ValueAnimator A;
    public hp B;

    public Paint f30498a;

    public i6 f30499b;

    public i6 f30500c;
    public float d;

    public y5 f30501e;

    public View f30502f;
    public float h;

    public boolean f30503n;

    public ValueAnimator f30504r;

    public float f30505s;
    public ValueAnimator v;

    public int f30506w;

    public float f30507x;

    public boolean f30508y;

    public final void a(boolean z10) {
        if (this.f30503n != z10) {
            ValueAnimator valueAnimator = this.f30504r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f30504r = null;
            }
            float f10 = this.h;
            this.f30503n = z10;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            this.f30504r = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new l00(this, 2));
            this.f30504r.addListener(new org.telegram.ui.go(10, this, z10));
            this.f30504r.setDuration(320L);
            this.f30504r.setInterpolator(er.h);
            this.f30504r.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        i6 i6Var = this.f30499b;
        if (z10) {
            i6Var.b();
        }
        i6Var.q(charSequence, z10, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f30498a;
        i6 i6Var = this.f30500c;
        i6 i6Var2 = this.f30499b;
        this.f30502f.draw(canvas);
        if (this.h > 0.0f) {
            if (this.B == null) {
                this.B = new hp(i6Var2.f29238a.getColor());
            }
            int iDp = (int) ((1.0f - this.h) * AndroidUtilities.dp(24.0f));
            this.B.setBounds(0, iDp, getWidth(), getHeight() + iDp);
            this.B.setAlpha((int) (this.h * 255.0f));
            this.B.draw(canvas);
            invalidate();
        }
        float f10 = this.h;
        if (f10 < 1.0f) {
            if (f10 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.h * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.h * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float fD = i6Var2.d();
            float fD2 = this.f30501e.d(this.d, false);
            float fD3 = ((i6Var.d() + AndroidUtilities.dp(15.66f)) * fD2) + fD;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - fD3) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - i6Var2.f29241e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) i0.a.c(getMeasuredWidth() - fD3, getWidth(), 2.0f, fD), (int) (((getMeasuredHeight() + i6Var2.f29241e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            i6Var2.f29257w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.f30507x) * (1.0f - this.h) * 255.0f);
            i6Var2.setBounds(rect);
            i6Var2.draw(canvas);
            rect.set((int) (com.google.android.recaptcha.internal.a.A(getMeasuredWidth(), fD3, 2.0f, fD) + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), i6Var.d()) + com.google.android.recaptcha.internal.a.A(getMeasuredWidth(), fD3, 2.0f, fD) + AndroidUtilities.dp(13.0f)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.f30505s != 1.0f) {
                canvas.save();
                float f11 = this.f30505s;
                canvas.scale(f11, f11, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.h) * 255.0f * fD2 * fD2));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
            i6Var.f29257w = (int) org.telegram.messenger.y1.z(1.0f, this.h, 255.0f, fD2);
            i6Var.setBounds(rect);
            i6Var.draw(canvas);
            if (this.f30505s != 1.0f) {
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
        sb2.append((Object) this.f30499b.f29243g);
        if (this.f30506w > 0) {
            str = ", " + LocaleController.formatPluralString("Chats", this.f30506w, new Object[0]);
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void setEnabled(boolean z10) {
        if (this.f30508y != z10) {
            ValueAnimator valueAnimator = this.A;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.A = null;
            }
            float f10 = this.f30507x;
            this.f30508y = z10;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            this.A = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new l00(this, 0));
            this.A.addListener(new ig.r(2));
            this.A.start();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.f30499b == drawable || this.f30500c == drawable || super.verifyDrawable(drawable);
    }
}
