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
public final class j00 extends FrameLayout {
    public ValueAnimator A;
    public jp B;
    public Paint f29563a;
    public i6 f29564b;
    public i6 f29565c;
    public float d;
    public y5 f29566e;
    public View f29567f;
    public float h;
    public boolean f29568n;
    public ValueAnimator f29569r;
    public float f29570s;
    public ValueAnimator v;
    public int f29571w;
    public float f29572x;
    public boolean f29573y;

    public final void a(boolean z10) {
        float f10;
        if (this.f29568n != z10) {
            ValueAnimator valueAnimator = this.f29569r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f29569r = null;
            }
            float f11 = this.h;
            this.f29568n = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f29569r = ofFloat;
            ofFloat.addUpdateListener(new i00(this, 2));
            this.f29569r.addListener(new u9(9, this, z10));
            this.f29569r.setDuration(320L);
            this.f29569r.setInterpolator(gr.h);
            this.f29569r.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        i6 i6Var = this.f29564b;
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
        Paint paint = this.f29563a;
        i6 i6Var = this.f29565c;
        i6 i6Var2 = this.f29564b;
        this.f29567f.draw(canvas);
        if (this.h > 0.0f) {
            if (this.B == null) {
                this.B = new jp(i6Var2.f29332a.getColor());
            }
            int dp = (int) ((1.0f - this.h) * AndroidUtilities.dp(24.0f));
            this.B.setBounds(0, dp, getWidth(), getHeight() + dp);
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
            float d = i6Var2.d();
            float d9 = this.f29566e.d(this.d, false);
            float d10 = ((i6Var.d() + AndroidUtilities.dp(15.66f)) * d9) + d;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - d10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - i6Var2.f29335e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) j3.r0.c(getMeasuredWidth() - d10, getWidth(), 2.0f, d), (int) (((getMeasuredHeight() + i6Var2.f29335e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            i6Var2.f29351w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.f29572x) * (1.0f - this.h) * 255.0f);
            i6Var2.setBounds(rect);
            i6Var2.draw(canvas);
            rect.set((int) (e2.c.A(getMeasuredWidth(), d10, 2.0f, d) + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), i6Var.d()) + e2.c.A(getMeasuredWidth(), d10, 2.0f, d) + AndroidUtilities.dp(13.0f)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.f29570s != 1.0f) {
                canvas.save();
                float f11 = this.f29570s;
                canvas.scale(f11, f11, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.h) * 255.0f * d9 * d9));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
            i6Var.f29351w = (int) org.telegram.messenger.l0.y(1.0f, this.h, 255.0f, d9);
            i6Var.setBounds(rect);
            i6Var.draw(canvas);
            if (this.f29570s != 1.0f) {
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
        sb2.append((Object) this.f29564b.f29337g);
        if (this.f29571w > 0) {
            str = ", " + LocaleController.formatPluralString("Chats", this.f29571w, new Object[0]);
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void setEnabled(boolean z10) {
        float f10;
        if (this.f29573y != z10) {
            ValueAnimator valueAnimator = this.A;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.A = null;
            }
            float f11 = this.f29572x;
            this.f29573y = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.A = ofFloat;
            ofFloat.addUpdateListener(new i00(this, 0));
            this.A.addListener(new hg.r(2));
            this.A.start();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29564b != drawable && this.f29565c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
