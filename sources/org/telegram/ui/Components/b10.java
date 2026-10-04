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
public final class b10 extends FrameLayout {
    public ValueAnimator E;
    public wp F;
    public Paint f24743a;
    public o6 f24744b;
    public o6 f24745c;
    public float d;
    public e6 f24746e;
    public View f24747f;
    public float h;
    public boolean f24748n;
    public ValueAnimator f24749r;
    public float f24750s;
    public ValueAnimator v;
    public int f24751w;
    public float f24752x;
    public boolean f24753y;

    public final void a(boolean z10) {
        float f7;
        if (this.f24748n != z10) {
            ValueAnimator valueAnimator = this.f24749r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f24749r = null;
            }
            float f10 = this.h;
            this.f24748n = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f24749r = ofFloat;
            ofFloat.addUpdateListener(new a10(this, 2));
            this.f24749r.addListener(new da(9, this, z10));
            this.f24749r.setDuration(320L);
            this.f24749r.setInterpolator(tr.h);
            this.f24749r.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        o6 o6Var = this.f24744b;
        if (z10) {
            o6Var.b();
        }
        o6Var.q(charSequence, z10, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f24743a;
        o6 o6Var = this.f24745c;
        o6 o6Var2 = this.f24744b;
        this.f24747f.draw(canvas);
        if (this.h > 0.0f) {
            if (this.F == null) {
                this.F = new wp(o6Var2.f29238a.getColor());
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
            float d = o6Var2.d();
            float d10 = this.f24746e.d(this.d, false);
            float d11 = ((o6Var.d() + AndroidUtilities.dp(15.66f)) * d10) + d;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - d11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - o6Var2.f29241e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.f0.a(getMeasuredWidth() - d11, getWidth(), 2.0f, d), (int) (((getMeasuredHeight() + o6Var2.f29241e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            o6Var2.f29257w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.f24752x) * (1.0f - this.h) * 255.0f);
            o6Var2.setBounds(rect);
            o6Var2.draw(canvas);
            rect.set((int) (com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), d11, 2.0f, d) + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), o6Var.d()) + com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), d11, 2.0f, d) + AndroidUtilities.dp(13.0f)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.f24750s != 1.0f) {
                canvas.save();
                float f10 = this.f24750s;
                canvas.scale(f10, f10, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.h) * 255.0f * d10 * d10));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
            o6Var.f29257w = (int) org.telegram.messenger.f0.z(1.0f, this.h, 255.0f, d10);
            o6Var.setBounds(rect);
            o6Var.draw(canvas);
            if (this.f24750s != 1.0f) {
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
        sb2.append((Object) this.f24744b.f29243g);
        if (this.f24751w > 0) {
            str = ", " + LocaleController.formatPluralString("Chats", this.f24751w, new Object[0]);
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void setEnabled(boolean z10) {
        float f7;
        if (this.f24753y != z10) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.E = null;
            }
            float f10 = this.f24752x;
            this.f24753y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new a10(this, 0));
            this.E.addListener(new ai.l2(1));
            this.E.start();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f24744b != drawable && this.f24745c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
