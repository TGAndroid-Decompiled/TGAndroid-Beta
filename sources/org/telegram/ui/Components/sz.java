package org.telegram.ui.Components;

import android.animation.AnimatorListenerAdapter;
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
public final class sz extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public float D;
    public boolean E;
    public ValueAnimator F;
    public cp G;
    public int H;
    public boolean I;
    public Paint f38187a;
    public i6 f38188b;
    public i6 f38189c;
    public float d;
    public w5 f38190e;
    public View f38191f;
    public ShapeDrawable h;
    public float f38192n;
    public boolean f38193r;
    public ValueAnimator f38194s;
    public float f38195w;
    public ValueAnimator f38196x;
    public int f38197y;

    public final void a(boolean z9) {
        float f10;
        if (this.f38193r != z9) {
            ValueAnimator valueAnimator = this.f38194s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f38194s = null;
            }
            float f11 = this.f38192n;
            this.f38193r = z9;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f38194s = ofFloat;
            ofFloat.addUpdateListener(new qz(this, 2));
            this.f38194s.addListener(new t9(9, this, z9));
            this.f38194s.setDuration(320L);
            this.f38194s.setInterpolator(xq.h);
            this.f38194s.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z9) {
        i6 i6Var = this.f38188b;
        if (z9) {
            i6Var.a();
        }
        i6Var.t(charSequence, z9, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z9;
        Paint paint = this.f38187a;
        i6 i6Var = this.f38189c;
        i6 i6Var2 = this.f38188b;
        this.f38191f.draw(canvas);
        if (this.f38192n > 0.0f) {
            if (this.G == null) {
                this.G = new cp(i6Var2.f34585a.getColor());
            }
            int L = (int) ((1.0f - this.f38192n) * org.telegram.messenger.g0.L(24.0f));
            this.G.setBounds(0, L, getWidth(), getHeight() + L);
            this.G.setAlpha((int) (this.f38192n * 255.0f));
            this.G.draw(canvas);
            invalidate();
        }
        float f10 = this.f38192n;
        if (f10 < 1.0f) {
            if (f10 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.f38192n * org.telegram.messenger.g0.L(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.f38192n * 0.4f));
                z9 = true;
            } else {
                z9 = false;
            }
            float c10 = i6Var2.c();
            float e10 = this.f38190e.e(false, this.d);
            float c11 = ((i6Var.c() + org.telegram.messenger.g0.L(15.66f)) * e10) + c10;
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set((int) (((getMeasuredWidth() - c11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - i6Var2.f34590e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.k5.a(getMeasuredWidth() - c11, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + i6Var2.f34590e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
            i6Var2.B = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.D) * (1.0f - this.f38192n) * 255.0f);
            i6Var2.setBounds(rect);
            i6Var2.draw(canvas);
            rect.set((int) (com.google.android.recaptcha.internal.a.A(getMeasuredWidth(), c11, 2.0f, c10) + org.telegram.messenger.g0.L(5.0f)), (int) ((getMeasuredHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f), (int) (Math.max(org.telegram.messenger.g0.L(9.0f), i6Var.c()) + com.google.android.recaptcha.internal.a.A(getMeasuredWidth(), c11, 2.0f, c10) + org.telegram.messenger.g0.L(13.0f)), (int) ((org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            if (this.f38195w != 1.0f) {
                canvas.save();
                float f11 = this.f38195w;
                canvas.scale(f11, f11, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.f38192n) * 255.0f * e10 * e10));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
            rect.offset(-org.telegram.messenger.g0.L(0.3f), -org.telegram.messenger.g0.L(0.4f));
            i6Var.B = (int) org.telegram.messenger.k5.A(1.0f, this.f38192n, 255.0f, e10);
            i6Var.setBounds(rect);
            i6Var.draw(canvas);
            if (this.f38195w != 1.0f) {
                canvas.restore();
            }
            if (z9) {
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
        sb2.append((Object) this.f38188b.f34593i);
        if (this.f38197y > 0) {
            str = ", " + org.telegram.messenger.id.G(this.f38197y, "Chats", new Object[0]);
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void setEnabled(boolean z9) {
        float f10;
        if (this.E != z9) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.F = null;
            }
            float f11 = this.D;
            this.E = z9;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new qz(this, 0));
            this.F.addListener(new AnimatorListenerAdapter());
            this.F.start();
        }
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.h;
        i6 i6Var = this.f38188b;
        Paint paint = this.f38187a;
        if (paint != null && i6Var != null) {
            int i7 = org.telegram.ui.ActionBar.l6.Ci;
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, i7, false);
            if (x02 != this.H || this.I != org.telegram.ui.ActionBar.l6.I.q()) {
                this.H = x02;
                this.I = org.telegram.ui.ActionBar.l6.I.q();
                View view = this.f38191f;
                if (view != null) {
                    view.setBackground(org.telegram.ui.ActionBar.a6.d(0, org.telegram.ui.ActionBar.a6.b(x02), 8.0f));
                }
                if (shapeDrawable != null) {
                    shapeDrawable.getPaint().setColor(x02);
                    shapeDrawable.invalidateSelf();
                }
            }
            int i10 = org.telegram.ui.ActionBar.l6.Gi;
            paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, i10, false));
            i6Var.u(org.telegram.ui.ActionBar.l6.x0(null, i10, false));
            try {
                i6 i6Var2 = this.f38189c;
                if (i6Var2 != null) {
                    i6Var2.u(org.telegram.ui.ActionBar.l6.x0(null, i7, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f38188b != drawable && this.f38189c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
