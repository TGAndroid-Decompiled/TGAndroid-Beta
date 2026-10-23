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
public final class g10 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public ValueAnimator F;
    public eq G;
    public int H;
    public boolean I;
    public Paint f26501a;
    public p6 f26502b;
    public p6 f26503c;
    public float d;
    public f6 e;
    public View f26504f;
    public ShapeDrawable h;
    public float f26505n;
    public boolean f26506r;
    public ValueAnimator f26507s;
    public float v;
    public ValueAnimator f26508w;
    public int f26509x;
    public float f26510y;

    public final void a(boolean z10) {
        float f7;
        if (this.f26506r != z10) {
            ValueAnimator valueAnimator = this.f26507s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f26507s = null;
            }
            float f10 = this.f26505n;
            this.f26506r = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f26507s = ofFloat;
            ofFloat.addUpdateListener(new f10(this, 2));
            this.f26507s.addListener(new org.telegram.ui.ho(10, this, z10));
            this.f26507s.setDuration(320L);
            this.f26507s.setInterpolator(bs.h);
            this.f26507s.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        p6 p6Var = this.f26502b;
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
        Paint paint = this.f26501a;
        p6 p6Var = this.f26503c;
        p6 p6Var2 = this.f26502b;
        this.f26504f.draw(canvas);
        if (this.f26505n > 0.0f) {
            if (this.G == null) {
                this.G = new eq(p6Var2.f29435a.getColor());
            }
            int dp = (int) ((1.0f - this.f26505n) * AndroidUtilities.dp(24.0f));
            this.G.setBounds(0, dp, getWidth(), getHeight() + dp);
            this.G.setAlpha((int) (this.f26505n * 255.0f));
            this.G.draw(canvas);
            invalidate();
        }
        float f7 = this.f26505n;
        if (f7 < 1.0f) {
            if (f7 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.f26505n * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.f26505n * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float c10 = p6Var2.c();
            float d = this.e.d(this.d, false);
            float c11 = ((p6Var.c() + AndroidUtilities.dp(15.66f)) * d) + c10;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - c11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - p6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.v0.a(getMeasuredWidth() - c11, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + p6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            p6Var2.B = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.f26510y) * (1.0f - this.f26505n) * 255.0f);
            p6Var2.setBounds(rect);
            p6Var2.draw(canvas);
            rect.set((int) (com.google.android.gms.internal.play_billing.k3.z(getMeasuredWidth(), c11, 2.0f, c10) + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), p6Var.c()) + com.google.android.gms.internal.play_billing.k3.z(getMeasuredWidth(), c11, 2.0f, c10) + AndroidUtilities.dp(13.0f)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.v != 1.0f) {
                canvas.save();
                float f10 = this.v;
                canvas.scale(f10, f10, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.f26505n) * 255.0f * d * d));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
            p6Var.B = (int) org.telegram.messenger.v0.A(1.0f, this.f26505n, 255.0f, d);
            p6Var.setBounds(rect);
            p6Var.draw(canvas);
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
        sb2.append((Object) this.f26502b.f29442i);
        if (this.f26509x > 0) {
            str = ", " + LocaleController.formatPluralString("Chats", this.f26509x, new Object[0]);
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
            float f10 = this.f26510y;
            this.E = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new f10(this, 0));
            this.F.addListener(new ah.z(2));
            this.F.start();
        }
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.h;
        p6 p6Var = this.f26502b;
        Paint paint = this.f26501a;
        if (paint != null && p6Var != null) {
            int i10 = org.telegram.ui.ActionBar.k6.Oh;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            if (x02 != this.H || this.I != org.telegram.ui.ActionBar.k6.I.q()) {
                this.H = x02;
                this.I = org.telegram.ui.ActionBar.k6.I.q();
                View view = this.f26504f;
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
            p6Var.u(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
            try {
                p6 p6Var2 = this.f26503c;
                if (p6Var2 != null) {
                    p6Var2.u(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f26502b != drawable && this.f26503c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
