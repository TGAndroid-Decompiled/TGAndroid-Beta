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
    public Paint f30059a;
    public m6 f30060b;
    public m6 f30061c;
    public float d;
    public c6 e;
    public View f30062f;
    public float h;
    public boolean f30063n;
    public ValueAnimator f30064r;
    public float f30065s;
    public ValueAnimator v;
    public int f30066w;
    public float f30067x;
    public boolean f30068y;

    public final void a(boolean z10) {
        float f7;
        if (this.f30063n != z10) {
            ValueAnimator valueAnimator = this.f30064r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f30064r = null;
            }
            float f10 = this.h;
            this.f30063n = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f30064r = ofFloat;
            ofFloat.addUpdateListener(new x00(this, 2));
            this.f30064r.addListener(new aa(9, this, z10));
            this.f30064r.setDuration(320L);
            this.f30064r.setInterpolator(qr.h);
            this.f30064r.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        m6 m6Var = this.f30060b;
        if (z10) {
            m6Var.b();
        }
        m6Var.q(charSequence, z10, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f30059a;
        m6 m6Var = this.f30061c;
        m6 m6Var2 = this.f30060b;
        this.f30062f.draw(canvas);
        if (this.h > 0.0f) {
            if (this.F == null) {
                this.F = new tp(m6Var2.f26069a.getColor());
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
            float d = m6Var2.d();
            float d10 = this.e.d(this.d, false);
            float d11 = ((m6Var.d() + AndroidUtilities.dp(15.66f)) * d10) + d;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - d11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - m6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.w1.a(getMeasuredWidth() - d11, getWidth(), 2.0f, d), (int) (((getMeasuredHeight() + m6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            m6Var2.f26087w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.f30067x) * (1.0f - this.h) * 255.0f);
            m6Var2.setBounds(rect);
            m6Var2.draw(canvas);
            rect.set((int) (com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), d11, 2.0f, d) + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), m6Var.d()) + com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), d11, 2.0f, d) + AndroidUtilities.dp(13.0f)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.f30065s != 1.0f) {
                canvas.save();
                float f10 = this.f30065s;
                canvas.scale(f10, f10, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.h) * 255.0f * d10 * d10));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
            m6Var.f26087w = (int) org.telegram.messenger.w1.A(1.0f, this.h, 255.0f, d10);
            m6Var.setBounds(rect);
            m6Var.draw(canvas);
            if (this.f30065s != 1.0f) {
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
        sb2.append((Object) this.f30060b.f26073g);
        if (this.f30066w > 0) {
            str = ", " + LocaleController.formatPluralString("Chats", this.f30066w, new Object[0]);
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void setEnabled(boolean z10) {
        float f7;
        if (this.f30068y != z10) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.E = null;
            }
            float f10 = this.f30067x;
            this.f30068y = z10;
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
        if (this.f30060b != drawable && this.f30061c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
