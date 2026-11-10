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
public final class rz extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public float D;
    public boolean E;
    public ValueAnimator F;
    public cp G;
    public int H;
    public boolean I;
    public Paint f37771a;
    public h6 f37772b;
    public h6 f37773c;
    public float d;
    public v5 f37774e;
    public View f37775f;
    public ShapeDrawable h;
    public float f37776n;
    public boolean f37777r;
    public ValueAnimator f37778s;
    public float f37779w;
    public ValueAnimator f37780x;
    public int f37781y;

    public final void a(boolean z9) {
        float f10;
        if (this.f37777r != z9) {
            ValueAnimator valueAnimator = this.f37778s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f37778s = null;
            }
            float f11 = this.f37776n;
            this.f37777r = z9;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f37778s = ofFloat;
            ofFloat.addUpdateListener(new pz(this, 2));
            this.f37778s.addListener(new s9(9, this, z9));
            this.f37778s.setDuration(320L);
            this.f37778s.setInterpolator(wq.h);
            this.f37778s.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z9) {
        h6 h6Var = this.f37772b;
        if (z9) {
            h6Var.a();
        }
        h6Var.t(charSequence, z9, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z9;
        Paint paint = this.f37771a;
        h6 h6Var = this.f37773c;
        h6 h6Var2 = this.f37772b;
        this.f37775f.draw(canvas);
        if (this.f37776n > 0.0f) {
            if (this.G == null) {
                this.G = new cp(h6Var2.f34185a.getColor());
            }
            int L = (int) ((1.0f - this.f37776n) * org.telegram.messenger.g0.L(24.0f));
            this.G.setBounds(0, L, getWidth(), getHeight() + L);
            this.G.setAlpha((int) (this.f37776n * 255.0f));
            this.G.draw(canvas);
            invalidate();
        }
        float f10 = this.f37776n;
        if (f10 < 1.0f) {
            if (f10 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.f37776n * org.telegram.messenger.g0.L(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.f37776n * 0.4f));
                z9 = true;
            } else {
                z9 = false;
            }
            float c10 = h6Var2.c();
            float e10 = this.f37774e.e(false, this.d);
            float c11 = ((h6Var.c() + org.telegram.messenger.g0.L(15.66f)) * e10) + c10;
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set((int) (((getMeasuredWidth() - c11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - h6Var2.f34190e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.k5.a(getMeasuredWidth() - c11, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + h6Var2.f34190e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
            h6Var2.B = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.D) * (1.0f - this.f37776n) * 255.0f);
            h6Var2.setBounds(rect);
            h6Var2.draw(canvas);
            rect.set((int) (com.google.android.recaptcha.internal.a.A(getMeasuredWidth(), c11, 2.0f, c10) + org.telegram.messenger.g0.L(5.0f)), (int) ((getMeasuredHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f), (int) (Math.max(org.telegram.messenger.g0.L(9.0f), h6Var.c()) + com.google.android.recaptcha.internal.a.A(getMeasuredWidth(), c11, 2.0f, c10) + org.telegram.messenger.g0.L(13.0f)), (int) ((org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            if (this.f37779w != 1.0f) {
                canvas.save();
                float f11 = this.f37779w;
                canvas.scale(f11, f11, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.f37776n) * 255.0f * e10 * e10));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
            rect.offset(-org.telegram.messenger.g0.L(0.3f), -org.telegram.messenger.g0.L(0.4f));
            h6Var.B = (int) org.telegram.messenger.k5.A(1.0f, this.f37776n, 255.0f, e10);
            h6Var.setBounds(rect);
            h6Var.draw(canvas);
            if (this.f37779w != 1.0f) {
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
        sb2.append((Object) this.f37772b.f34193i);
        if (this.f37781y > 0) {
            str = ", " + org.telegram.messenger.id.G(this.f37781y, "Chats", new Object[0]);
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
            ofFloat.addUpdateListener(new pz(this, 0));
            this.F.addListener(new AnimatorListenerAdapter());
            this.F.start();
        }
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.h;
        h6 h6Var = this.f37772b;
        Paint paint = this.f37771a;
        if (paint != null && h6Var != null) {
            int i7 = org.telegram.ui.ActionBar.m6.Ci;
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            if (x02 != this.H || this.I != org.telegram.ui.ActionBar.m6.I.q()) {
                this.H = x02;
                this.I = org.telegram.ui.ActionBar.m6.I.q();
                View view = this.f37775f;
                if (view != null) {
                    view.setBackground(org.telegram.ui.ActionBar.b6.d(0, org.telegram.ui.ActionBar.b6.b(x02), 8.0f));
                }
                if (shapeDrawable != null) {
                    shapeDrawable.getPaint().setColor(x02);
                    shapeDrawable.invalidateSelf();
                }
            }
            int i10 = org.telegram.ui.ActionBar.m6.Gi;
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            h6Var.u(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            try {
                h6 h6Var2 = this.f37773c;
                if (h6Var2 != null) {
                    h6Var2.u(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f37772b != drawable && this.f37773c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
