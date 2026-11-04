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
public final class nz extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public float E;
    public boolean F;
    public ValueAnimator G;
    public cp H;
    public int I;
    public boolean J;
    public Paint f36652a;
    public g6 f36653b;
    public g6 f36654c;
    public float d;
    public u5 f36655e;
    public View f36656f;
    public ShapeDrawable h;
    public float f36657n;
    public boolean f36658r;
    public ValueAnimator f36659s;
    public float f36660w;
    public ValueAnimator f36661x;
    public int f36662y;

    public final void a(boolean z10) {
        float f10;
        if (this.f36658r != z10) {
            ValueAnimator valueAnimator = this.f36659s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f36659s = null;
            }
            float f11 = this.f36657n;
            this.f36658r = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f36659s = ofFloat;
            ofFloat.addUpdateListener(new mz(this, 2));
            this.f36659s.addListener(new s9(9, this, z10));
            this.f36659s.setDuration(320L);
            this.f36659s.setInterpolator(xq.h);
            this.f36659s.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        g6 g6Var = this.f36653b;
        if (z10) {
            g6Var.a();
        }
        g6Var.t(charSequence, z10, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f36652a;
        g6 g6Var = this.f36654c;
        g6 g6Var2 = this.f36653b;
        this.f36656f.draw(canvas);
        if (this.f36657n > 0.0f) {
            if (this.H == null) {
                this.H = new cp(g6Var2.f33981a.getColor());
            }
            int L = (int) ((1.0f - this.f36657n) * org.telegram.messenger.g0.L(24.0f));
            this.H.setBounds(0, L, getWidth(), getHeight() + L);
            this.H.setAlpha((int) (this.f36657n * 255.0f));
            this.H.draw(canvas);
            invalidate();
        }
        float f10 = this.f36657n;
        if (f10 < 1.0f) {
            if (f10 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.f36657n * org.telegram.messenger.g0.L(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.f36657n * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float c2 = g6Var2.c();
            float e10 = this.f36655e.e(false, this.d);
            float c10 = ((g6Var.c() + org.telegram.messenger.g0.L(15.66f)) * e10) + c2;
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set((int) (((getMeasuredWidth() - c10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - g6Var2.f33986e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.k5.a(getMeasuredWidth() - c10, getWidth(), 2.0f, c2), (int) (((getMeasuredHeight() + g6Var2.f33986e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
            g6Var2.B = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.E) * (1.0f - this.f36657n) * 255.0f);
            g6Var2.setBounds(rect);
            g6Var2.draw(canvas);
            rect.set((int) (com.google.android.recaptcha.internal.a.z(getMeasuredWidth(), c10, 2.0f, c2) + org.telegram.messenger.g0.L(5.0f)), (int) ((getMeasuredHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f), (int) (Math.max(org.telegram.messenger.g0.L(9.0f), g6Var.c()) + com.google.android.recaptcha.internal.a.z(getMeasuredWidth(), c10, 2.0f, c2) + org.telegram.messenger.g0.L(13.0f)), (int) ((org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            if (this.f36660w != 1.0f) {
                canvas.save();
                float f11 = this.f36660w;
                canvas.scale(f11, f11, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.f36657n) * 255.0f * e10 * e10));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
            rect.offset(-org.telegram.messenger.g0.L(0.3f), -org.telegram.messenger.g0.L(0.4f));
            g6Var.B = (int) org.telegram.messenger.k5.A(1.0f, this.f36657n, 255.0f, e10);
            g6Var.setBounds(rect);
            g6Var.draw(canvas);
            if (this.f36660w != 1.0f) {
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
        sb2.append((Object) this.f36653b.f33989i);
        if (this.f36662y > 0) {
            str = ", " + org.telegram.messenger.bd.G(this.f36662y, "Chats", new Object[0]);
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
            ofFloat.addUpdateListener(new mz(this, 0));
            this.G.addListener(new ei.m1(1));
            this.G.start();
        }
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.h;
        g6 g6Var = this.f36653b;
        Paint paint = this.f36652a;
        if (paint != null && g6Var != null) {
            int i3 = org.telegram.ui.ActionBar.k6.Ci;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
            if (x02 != this.I || this.J != org.telegram.ui.ActionBar.k6.I.q()) {
                this.I = x02;
                this.J = org.telegram.ui.ActionBar.k6.I.q();
                View view = this.f36656f;
                if (view != null) {
                    view.setBackground(org.telegram.ui.ActionBar.y5.d(0, org.telegram.ui.ActionBar.y5.b(x02), 8.0f));
                }
                if (shapeDrawable != null) {
                    shapeDrawable.getPaint().setColor(x02);
                    shapeDrawable.invalidateSelf();
                }
            }
            int i10 = org.telegram.ui.ActionBar.k6.Gi;
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            g6Var.u(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            try {
                g6 g6Var2 = this.f36654c;
                if (g6Var2 != null) {
                    g6Var2.u(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f36653b != drawable && this.f36654c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
