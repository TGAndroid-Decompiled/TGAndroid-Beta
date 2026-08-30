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
    public ValueAnimator B;
    public rp C;
    public Paint f30800a;
    public j6 f30801b;
    public j6 f30802c;
    public float d;
    public z5 e;
    public View f30803f;
    public float h;
    public boolean f30804n;
    public ValueAnimator f30805r;
    public float f30806s;
    public ValueAnimator v;
    public int f30807w;
    public float f30808x;
    public boolean f30809y;

    public final void a(boolean z4) {
        float f10;
        if (this.f30804n != z4) {
            ValueAnimator valueAnimator = this.f30805r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f30805r = null;
            }
            float f11 = this.h;
            this.f30804n = z4;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f30805r = ofFloat;
            ofFloat.addUpdateListener(new x00(this, 2));
            this.f30805r.addListener(new l00(1, this, z4));
            this.f30805r.setDuration(320L);
            this.f30805r.setInterpolator(nr.h);
            this.f30805r.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z4) {
        j6 j6Var = this.f30801b;
        if (z4) {
            j6Var.b();
        }
        j6Var.q(charSequence, z4, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z4;
        Paint paint = this.f30800a;
        j6 j6Var = this.f30802c;
        j6 j6Var2 = this.f30801b;
        this.f30803f.draw(canvas);
        if (this.h > 0.0f) {
            if (this.C == null) {
                this.C = new rp(j6Var2.f25883a.getColor());
            }
            int dp = (int) ((1.0f - this.h) * AndroidUtilities.dp(24.0f));
            this.C.setBounds(0, dp, getWidth(), getHeight() + dp);
            this.C.setAlpha((int) (this.h * 255.0f));
            this.C.draw(canvas);
            invalidate();
        }
        float f10 = this.h;
        if (f10 < 1.0f) {
            if (f10 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.h * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.h * 0.4f));
                z4 = true;
            } else {
                z4 = false;
            }
            float d = j6Var2.d();
            float d10 = this.e.d(this.d, false);
            float d11 = ((j6Var.d() + AndroidUtilities.dp(15.66f)) * d10) + d;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - d11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - j6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) kh.a2.b(getMeasuredWidth() - d11, getWidth(), 2.0f, d), (int) (((getMeasuredHeight() + j6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            j6Var2.f25901w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.f30808x) * (1.0f - this.h) * 255.0f);
            j6Var2.setBounds(rect);
            j6Var2.draw(canvas);
            rect.set((int) (e2.c.x(getMeasuredWidth(), d11, 2.0f, d) + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), j6Var.d()) + e2.c.x(getMeasuredWidth(), d11, 2.0f, d) + AndroidUtilities.dp(13.0f)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.f30806s != 1.0f) {
                canvas.save();
                float f11 = this.f30806s;
                canvas.scale(f11, f11, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.h) * 255.0f * d10 * d10));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
            j6Var.f25901w = (int) org.telegram.messenger.y3.y(1.0f, this.h, 255.0f, d10);
            j6Var.setBounds(rect);
            j6Var.draw(canvas);
            if (this.f30806s != 1.0f) {
                canvas.restore();
            }
            if (z4) {
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.f30801b.f25887g);
        if (this.f30807w > 0) {
            str = ", " + LocaleController.formatPluralString("Chats", this.f30807w, new Object[0]);
        } else {
            str = "";
        }
        sb.append(str);
        accessibilityNodeInfo.setContentDescription(sb.toString());
    }

    @Override
    public final void setEnabled(boolean z4) {
        float f10;
        if (this.f30809y != z4) {
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.B = null;
            }
            float f11 = this.f30808x;
            this.f30809y = z4;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new x00(this, 0));
            this.B.addListener(new mg.r(2));
            this.B.start();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f30801b != drawable && this.f30802c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
