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
public final class f00 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public float D;
    public boolean E;
    public ValueAnimator F;
    public kp G;
    public int H;
    public boolean I;
    public Paint f25905a;
    public e6 f25906b;
    public e6 f25907c;
    public float d;
    public t5 e;
    public View f25908f;
    public ShapeDrawable h;
    public float f25909n;
    public boolean f25910r;
    public ValueAnimator f25911s;
    public float f25912w;
    public ValueAnimator f25913x;
    public int f25914y;

    public final void a(boolean z10) {
        float f7;
        if (this.f25910r != z10) {
            ValueAnimator valueAnimator = this.f25911s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f25911s = null;
            }
            float f10 = this.f25909n;
            this.f25910r = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f25911s = ofFloat;
            ofFloat.addUpdateListener(new d00(this, 2));
            this.f25911s.addListener(new eg.m(25, this, z10));
            this.f25911s.setDuration(320L);
            this.f25911s.setInterpolator(gr.h);
            this.f25911s.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        e6 e6Var = this.f25906b;
        if (z10) {
            e6Var.a();
        }
        e6Var.t(charSequence, z10, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f25905a;
        e6 e6Var = this.f25907c;
        e6 e6Var2 = this.f25906b;
        this.f25908f.draw(canvas);
        if (this.f25909n > 0.0f) {
            if (this.G == null) {
                this.G = new kp(e6Var2.f25693a.getColor());
            }
            int L = (int) ((1.0f - this.f25909n) * org.telegram.messenger.i0.L(24.0f));
            this.G.setBounds(0, L, getWidth(), getHeight() + L);
            this.G.setAlpha((int) (this.f25909n * 255.0f));
            this.G.draw(canvas);
            invalidate();
        }
        float f7 = this.f25909n;
        if (f7 < 1.0f) {
            if (f7 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.f25909n * org.telegram.messenger.i0.L(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.f25909n * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float c10 = e6Var2.c();
            float e = this.e.e(false, this.d);
            float c11 = ((e6Var.c() + org.telegram.messenger.i0.L(15.66f)) * e) + c10;
            Rect rect = org.telegram.messenger.i0.Q;
            rect.set((int) (((getMeasuredWidth() - c11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - e6Var2.e) / 2.0f) - org.telegram.messenger.i0.L(1.0f)), (int) org.telegram.messenger.m5.a(getMeasuredWidth() - c11, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + e6Var2.e) / 2.0f) - org.telegram.messenger.i0.L(1.0f)));
            e6Var2.B = (int) (org.telegram.messenger.i0.T1(0.5f, 1.0f, this.D) * (1.0f - this.f25909n) * 255.0f);
            e6Var2.setBounds(rect);
            e6Var2.draw(canvas);
            rect.set((int) (c3.i0.B(getMeasuredWidth(), c11, 2.0f, c10) + org.telegram.messenger.i0.L(5.0f)), (int) ((getMeasuredHeight() - org.telegram.messenger.i0.L(18.0f)) / 2.0f), (int) (Math.max(org.telegram.messenger.i0.L(9.0f), e6Var.c()) + c3.i0.B(getMeasuredWidth(), c11, 2.0f, c10) + org.telegram.messenger.i0.L(13.0f)), (int) ((org.telegram.messenger.i0.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(rect);
            if (this.f25912w != 1.0f) {
                canvas.save();
                float f10 = this.f25912w;
                canvas.scale(f10, f10, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.f25909n) * 255.0f * e * e));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), paint);
            rect.offset(-org.telegram.messenger.i0.L(0.3f), -org.telegram.messenger.i0.L(0.4f));
            e6Var.B = (int) org.telegram.messenger.m5.A(1.0f, this.f25909n, 255.0f, e);
            e6Var.setBounds(rect);
            e6Var.draw(canvas);
            if (this.f25912w != 1.0f) {
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
        sb2.append((Object) this.f25906b.f25700i);
        if (this.f25914y > 0) {
            str = ", " + org.telegram.messenger.cd.G(this.f25914y, "Chats", new Object[0]);
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
            float f10 = this.D;
            this.E = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new d00(this, 0));
            this.F.addListener(new e00(0));
            this.F.start();
        }
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.h;
        e6 e6Var = this.f25906b;
        Paint paint = this.f25905a;
        if (paint != null && e6Var != null) {
            int i10 = org.telegram.ui.ActionBar.t6.Ci;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            if (x02 != this.H || this.I != org.telegram.ui.ActionBar.t6.I.q()) {
                this.H = x02;
                this.I = org.telegram.ui.ActionBar.t6.I.q();
                View view = this.f25908f;
                if (view != null) {
                    view.setBackground(org.telegram.ui.ActionBar.j6.d(0, org.telegram.ui.ActionBar.j6.b(x02), 8.0f));
                }
                if (shapeDrawable != null) {
                    shapeDrawable.getPaint().setColor(x02);
                    shapeDrawable.invalidateSelf();
                }
            }
            int i11 = org.telegram.ui.ActionBar.t6.Gi;
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            e6Var.u(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            try {
                e6 e6Var2 = this.f25907c;
                if (e6Var2 != null) {
                    e6Var2.u(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f25906b != drawable && this.f25907c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
