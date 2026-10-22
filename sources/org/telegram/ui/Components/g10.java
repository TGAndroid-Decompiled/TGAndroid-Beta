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
public final class g10 extends FrameLayout {
    public ValueAnimator E;
    public dq F;
    public Paint f26466a;
    public p6 f26467b;
    public p6 f26468c;
    public float d;
    public f6 e;
    public View f26469f;
    public float h;
    public boolean f26470n;
    public ValueAnimator f26471r;
    public float f26472s;
    public ValueAnimator v;
    public int f26473w;
    public float f26474x;
    public boolean f26475y;

    public final void a(boolean z10) {
        float f7;
        if (this.f26470n != z10) {
            ValueAnimator valueAnimator = this.f26471r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f26471r = null;
            }
            float f10 = this.h;
            this.f26470n = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f26471r = ofFloat;
            ofFloat.addUpdateListener(new f10(this, 2));
            this.f26471r.addListener(new org.telegram.ui.fo(10, this, z10));
            this.f26471r.setDuration(320L);
            this.f26471r.setInterpolator(bs.h);
            this.f26471r.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        p6 p6Var = this.f26467b;
        if (z10) {
            p6Var.a();
        }
        p6Var.t(charSequence, z10, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f26466a;
        p6 p6Var = this.f26468c;
        p6 p6Var2 = this.f26467b;
        this.f26469f.draw(canvas);
        if (this.h > 0.0f) {
            if (this.F == null) {
                this.F = new dq(p6Var2.f29227a.getColor());
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
            float c10 = p6Var2.c();
            float d = this.e.d(this.d, false);
            float c11 = ((p6Var.c() + AndroidUtilities.dp(15.66f)) * d) + c10;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - c11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - p6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.g0.a(getMeasuredWidth() - c11, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + p6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            p6Var2.B = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.f26474x) * (1.0f - this.h) * 255.0f);
            p6Var2.setBounds(rect);
            p6Var2.draw(canvas);
            rect.set((int) (com.google.android.gms.internal.play_billing.k3.z(getMeasuredWidth(), c11, 2.0f, c10) + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), p6Var.c()) + com.google.android.gms.internal.play_billing.k3.z(getMeasuredWidth(), c11, 2.0f, c10) + AndroidUtilities.dp(13.0f)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.f26472s != 1.0f) {
                canvas.save();
                float f10 = this.f26472s;
                canvas.scale(f10, f10, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.h) * 255.0f * d * d));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
            p6Var.B = (int) org.telegram.messenger.g0.z(1.0f, this.h, 255.0f, d);
            p6Var.setBounds(rect);
            p6Var.draw(canvas);
            if (this.f26472s != 1.0f) {
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
        sb2.append((Object) this.f26467b.f29234i);
        if (this.f26473w > 0) {
            str = ", " + LocaleController.formatPluralString("Chats", this.f26473w, new Object[0]);
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void setEnabled(boolean z10) {
        float f7;
        if (this.f26475y != z10) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.E = null;
            }
            float f10 = this.f26474x;
            this.f26475y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new f10(this, 0));
            this.E.addListener(new ah.z(2));
            this.E.start();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f26467b != drawable && this.f26468c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
