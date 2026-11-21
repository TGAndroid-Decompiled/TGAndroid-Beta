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
public final class e00 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public float E;
    public boolean F;
    public ValueAnimator G;
    public up H;
    public int I;
    public boolean J;
    public Paint f34628a;
    public n6 f34629b;
    public n6 f34630c;
    public float d;
    public d6 f34631e;
    public View f34632f;
    public ShapeDrawable h;
    public float f34633n;
    public boolean f34634r;
    public ValueAnimator f34635s;
    public float f34636w;
    public ValueAnimator f34637x;
    public int f34638y;

    public final void a(boolean z10) {
        float f10;
        if (this.f34634r != z10) {
            ValueAnimator valueAnimator = this.f34635s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f34635s = null;
            }
            float f11 = this.f34633n;
            this.f34634r = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f34635s = ofFloat;
            ofFloat.addUpdateListener(new c00(this, 2));
            this.f34635s.addListener(new org.telegram.ui.on(10, this, z10));
            this.f34635s.setDuration(320L);
            this.f34635s.setInterpolator(nr.h);
            this.f34635s.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        n6 n6Var = this.f34629b;
        if (z10) {
            n6Var.a();
        }
        n6Var.t(charSequence, z10, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f34628a;
        n6 n6Var = this.f34630c;
        n6 n6Var2 = this.f34629b;
        this.f34632f.draw(canvas);
        if (this.f34633n > 0.0f) {
            if (this.H == null) {
                this.H = new up(n6Var2.f37789a.getColor());
            }
            int L = (int) ((1.0f - this.f34633n) * org.telegram.messenger.g0.L(24.0f));
            this.H.setBounds(0, L, getWidth(), getHeight() + L);
            this.H.setAlpha((int) (this.f34633n * 255.0f));
            this.H.draw(canvas);
            invalidate();
        }
        float f10 = this.f34633n;
        if (f10 < 1.0f) {
            if (f10 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.f34633n * org.telegram.messenger.g0.L(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.f34633n * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float c10 = n6Var2.c();
            float e10 = this.f34631e.e(false, this.d);
            float c11 = ((n6Var.c() + org.telegram.messenger.g0.L(15.66f)) * e10) + c10;
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set((int) (((getMeasuredWidth() - c11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - n6Var2.f37795e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.f3.a(getMeasuredWidth() - c11, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + n6Var2.f37795e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
            n6Var2.C = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.E) * (1.0f - this.f34633n) * 255.0f);
            n6Var2.setBounds(rect);
            n6Var2.draw(canvas);
            rect.set((int) (com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), c11, 2.0f, c10) + org.telegram.messenger.g0.L(5.0f)), (int) ((getMeasuredHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f), (int) (Math.max(org.telegram.messenger.g0.L(9.0f), n6Var.c()) + com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), c11, 2.0f, c10) + org.telegram.messenger.g0.L(13.0f)), (int) ((org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            if (this.f34636w != 1.0f) {
                canvas.save();
                float f11 = this.f34636w;
                canvas.scale(f11, f11, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.f34633n) * 255.0f * e10 * e10));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
            rect.offset(-org.telegram.messenger.g0.L(0.3f), -org.telegram.messenger.g0.L(0.4f));
            n6Var.C = (int) org.telegram.messenger.f3.A(1.0f, this.f34633n, 255.0f, e10);
            n6Var.setBounds(rect);
            n6Var.draw(canvas);
            if (this.f34636w != 1.0f) {
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
        sb2.append((Object) this.f34629b.f37798i);
        if (this.f34638y > 0) {
            str = ", " + org.telegram.messenger.gd.G(this.f34638y, "Chats", new Object[0]);
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void setEnabled(boolean z10) {
        float f10;
        if (this.F != z10) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            float f11 = this.E;
            this.F = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new c00(this, 0));
            this.G.addListener(new AnimatorListenerAdapter());
            this.G.start();
        }
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.h;
        n6 n6Var = this.f34629b;
        Paint paint = this.f34628a;
        if (paint != null && n6Var != null) {
            int i7 = org.telegram.ui.ActionBar.m6.Fi;
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            if (x02 != this.I || this.J != org.telegram.ui.ActionBar.m6.I.q()) {
                this.I = x02;
                this.J = org.telegram.ui.ActionBar.m6.I.q();
                View view = this.f34632f;
                if (view != null) {
                    view.setBackground(org.telegram.ui.ActionBar.a6.d(0, org.telegram.ui.ActionBar.a6.b(x02), 8.0f));
                }
                if (shapeDrawable != null) {
                    shapeDrawable.getPaint().setColor(x02);
                    shapeDrawable.invalidateSelf();
                }
            }
            int i10 = org.telegram.ui.ActionBar.m6.Ji;
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            n6Var.u(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            try {
                n6 n6Var2 = this.f34630c;
                if (n6Var2 != null) {
                    n6Var2.u(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f34629b != drawable && this.f34630c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
