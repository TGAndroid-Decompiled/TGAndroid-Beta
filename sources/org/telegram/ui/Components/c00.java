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
public final class c00 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public float E;
    public boolean F;
    public ValueAnimator G;
    public sp H;
    public int I;
    public boolean J;
    public Paint f33826a;
    public m6 f33827b;
    public m6 f33828c;
    public float d;
    public c6 f33829e;
    public View f33830f;
    public ShapeDrawable h;
    public float f33831n;
    public boolean f33832r;
    public ValueAnimator f33833s;
    public float f33834w;
    public ValueAnimator f33835x;
    public int f33836y;

    public final void a(boolean z10) {
        float f10;
        if (this.f33832r != z10) {
            ValueAnimator valueAnimator = this.f33833s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f33833s = null;
            }
            float f11 = this.f33831n;
            this.f33832r = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f33833s = ofFloat;
            ofFloat.addUpdateListener(new a00(this, 2));
            this.f33833s.addListener(new org.telegram.ui.on(10, this, z10));
            this.f33833s.setDuration(320L);
            this.f33833s.setInterpolator(lr.h);
            this.f33833s.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        m6 m6Var = this.f33827b;
        if (z10) {
            m6Var.a();
        }
        m6Var.t(charSequence, z10, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f33826a;
        m6 m6Var = this.f33828c;
        m6 m6Var2 = this.f33827b;
        this.f33830f.draw(canvas);
        if (this.f33831n > 0.0f) {
            if (this.H == null) {
                this.H = new sp(m6Var2.f37375a.getColor());
            }
            int L = (int) ((1.0f - this.f33831n) * org.telegram.messenger.g0.L(24.0f));
            this.H.setBounds(0, L, getWidth(), getHeight() + L);
            this.H.setAlpha((int) (this.f33831n * 255.0f));
            this.H.draw(canvas);
            invalidate();
        }
        float f10 = this.f33831n;
        if (f10 < 1.0f) {
            if (f10 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.f33831n * org.telegram.messenger.g0.L(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.f33831n * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float c10 = m6Var2.c();
            float e10 = this.f33829e.e(false, this.d);
            float c11 = ((m6Var.c() + org.telegram.messenger.g0.L(15.66f)) * e10) + c10;
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set((int) (((getMeasuredWidth() - c11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - m6Var2.f37381e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.f3.a(getMeasuredWidth() - c11, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + m6Var2.f37381e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
            m6Var2.C = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.E) * (1.0f - this.f33831n) * 255.0f);
            m6Var2.setBounds(rect);
            m6Var2.draw(canvas);
            rect.set((int) (com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), c11, 2.0f, c10) + org.telegram.messenger.g0.L(5.0f)), (int) ((getMeasuredHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f), (int) (Math.max(org.telegram.messenger.g0.L(9.0f), m6Var.c()) + com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), c11, 2.0f, c10) + org.telegram.messenger.g0.L(13.0f)), (int) ((org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            if (this.f33834w != 1.0f) {
                canvas.save();
                float f11 = this.f33834w;
                canvas.scale(f11, f11, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.f33831n) * 255.0f * e10 * e10));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
            rect.offset(-org.telegram.messenger.g0.L(0.3f), -org.telegram.messenger.g0.L(0.4f));
            m6Var.C = (int) org.telegram.messenger.f3.A(1.0f, this.f33831n, 255.0f, e10);
            m6Var.setBounds(rect);
            m6Var.draw(canvas);
            if (this.f33834w != 1.0f) {
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
        sb2.append((Object) this.f33827b.f37384i);
        if (this.f33836y > 0) {
            str = ", " + org.telegram.messenger.gd.G(this.f33836y, "Chats", new Object[0]);
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
            ofFloat.addUpdateListener(new a00(this, 0));
            this.G.addListener(new AnimatorListenerAdapter());
            this.G.start();
        }
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.h;
        m6 m6Var = this.f33827b;
        Paint paint = this.f33826a;
        if (paint != null && m6Var != null) {
            int i7 = org.telegram.ui.ActionBar.n6.Fi;
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
            if (x02 != this.I || this.J != org.telegram.ui.ActionBar.n6.I.q()) {
                this.I = x02;
                this.J = org.telegram.ui.ActionBar.n6.I.q();
                View view = this.f33830f;
                if (view != null) {
                    view.setBackground(org.telegram.ui.ActionBar.b6.d(0, org.telegram.ui.ActionBar.b6.b(x02), 8.0f));
                }
                if (shapeDrawable != null) {
                    shapeDrawable.getPaint().setColor(x02);
                    shapeDrawable.invalidateSelf();
                }
            }
            int i10 = org.telegram.ui.ActionBar.n6.Ji;
            paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
            m6Var.u(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
            try {
                m6 m6Var2 = this.f33828c;
                if (m6Var2 != null) {
                    m6Var2.u(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f33827b != drawable && this.f33828c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
