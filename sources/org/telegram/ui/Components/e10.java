package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
public final class e10 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public ValueAnimator F;
    public cq G;
    public int H;
    public boolean I;
    public Paint f25911a;
    public n6 f25912b;
    public n6 f25913c;
    public float d;
    public d6 e;
    public View f25914f;
    public ShapeDrawable h;
    public float f25915n;
    public boolean f25916r;
    public ValueAnimator f25917s;
    public float v;
    public ValueAnimator f25918w;
    public int f25919x;
    public float f25920y;

    public final void a(boolean z10) {
        float f7;
        if (this.f25916r != z10) {
            ValueAnimator valueAnimator = this.f25917s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f25917s = null;
            }
            float f10 = this.f25915n;
            this.f25916r = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f25917s = ofFloat;
            ofFloat.addUpdateListener(new d10(this, 2));
            this.f25917s.addListener(new org.telegram.ui.ho(10, this, z10));
            this.f25917s.setDuration(320L);
            this.f25917s.setInterpolator(zr.h);
            this.f25917s.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        n6 n6Var = this.f25912b;
        if (z10) {
            n6Var.a();
        }
        n6Var.t(charSequence, z10, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f25911a;
        n6 n6Var = this.f25913c;
        n6 n6Var2 = this.f25912b;
        this.f25914f.draw(canvas);
        if (this.f25915n > 0.0f) {
            if (this.G == null) {
                this.G = new cq(n6Var2.f28795a.getColor());
            }
            int dp = (int) ((1.0f - this.f25915n) * AndroidUtilities.dp(24.0f));
            this.G.setBounds(0, dp, getWidth(), getHeight() + dp);
            this.G.setAlpha((int) (this.f25915n * 255.0f));
            this.G.draw(canvas);
            invalidate();
        }
        float f7 = this.f25915n;
        if (f7 < 1.0f) {
            if (f7 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.f25915n * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.f25915n * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float c10 = n6Var2.c();
            float d = this.e.d(this.d, false);
            float c11 = ((n6Var.c() + AndroidUtilities.dp(15.66f)) * d) + c10;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - c11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - n6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.v0.a(getMeasuredWidth() - c11, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + n6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            n6Var2.B = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.f25920y) * (1.0f - this.f25915n) * 255.0f);
            n6Var2.setBounds(rect);
            n6Var2.draw(canvas);
            rect.set((int) (com.google.android.gms.internal.play_billing.k3.z(getMeasuredWidth(), c11, 2.0f, c10) + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), n6Var.c()) + com.google.android.gms.internal.play_billing.k3.z(getMeasuredWidth(), c11, 2.0f, c10) + AndroidUtilities.dp(13.0f)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.v != 1.0f) {
                canvas.save();
                float f10 = this.v;
                canvas.scale(f10, f10, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.f25915n) * 255.0f * d * d));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
            n6Var.B = (int) org.telegram.messenger.v0.A(1.0f, this.f25915n, 255.0f, d);
            n6Var.setBounds(rect);
            n6Var.draw(canvas);
            if (this.v != 1.0f) {
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
        sb2.append((Object) this.f25912b.f28802i);
        if (this.f25919x > 0) {
            str = ", " + LocaleController.formatPluralString("Chats", this.f25919x, new Object[0]);
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void setEnabled(boolean z10) {
        float f7;
        if (this.E != z10) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.F = null;
            }
            float f10 = this.f25920y;
            this.E = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new d10(this, 0));
            this.F.addListener(new ah.z(2));
            this.F.start();
        }
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.h;
        n6 n6Var = this.f25912b;
        Paint paint = this.f25911a;
        if (paint != null && n6Var != null) {
            int i10 = org.telegram.ui.ActionBar.k6.Oh;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            if (x02 != this.H || this.I != org.telegram.ui.ActionBar.k6.I.q()) {
                this.H = x02;
                this.I = org.telegram.ui.ActionBar.k6.I.q();
                View view = this.f25914f;
                if (view != null) {
                    view.setBackground(org.telegram.ui.ActionBar.a6.d(new float[]{8.0f}, 0, org.telegram.ui.ActionBar.a6.b(x02)));
                }
                if (shapeDrawable != null) {
                    shapeDrawable.getPaint().setColor(x02);
                    shapeDrawable.invalidateSelf();
                }
            }
            int i11 = org.telegram.ui.ActionBar.k6.Sh;
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
            n6Var.u(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
            try {
                n6 n6Var2 = this.f25913c;
                if (n6Var2 != null) {
                    n6Var2.u(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f25912b != drawable && this.f25913c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
