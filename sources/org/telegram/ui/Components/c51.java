package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public class c51 extends FrameLayout {
    public ValueAnimator f33508a;
    public float f33509b;
    public boolean f33510c;
    public Boolean d;
    public final e51 f33511e;

    public c51(e51 e51Var, Context context) {
        super(context);
        this.f33511e = e51Var;
        this.f33510c = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        canvas.save();
        e51 e51Var = this.f33511e;
        Drawable drawable = e51Var.f34207r1;
        RectF rectF = e51Var.f34213x1;
        int L = org.telegram.messenger.g0.L(6.0f) + (e51Var.f34214y1 - e51Var.f29716t0);
        int L2 = (e51Var.f34214y1 - e51Var.f29716t0) - org.telegram.messenger.g0.L(13.0f);
        int L3 = org.telegram.messenger.g0.L(50.0f) + getMeasuredHeight();
        int i12 = e51Var.f29716t0;
        int i13 = org.telegram.messenger.g0.f23603m;
        int i14 = L2 + i13;
        int i15 = L + i13;
        int i16 = (L3 + i12) - i13;
        float translationY = getTranslationY() + i12 + i14;
        int i17 = org.telegram.messenger.g0.f23603m;
        if (translationY < i17 * 2) {
            int min = (int) Math.min(i17, ((i7 - i14) - e51Var.f29716t0) - getTranslationY());
            i14 -= min;
            i16 += min;
            f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f23603m);
        } else {
            f10 = 1.0f;
        }
        float translationY2 = getTranslationY() + e51Var.f29716t0 + i14;
        float f11 = org.telegram.messenger.g0.f23603m;
        boolean z12 = false;
        if (translationY2 < f11) {
            i11 = (int) Math.min(f11, ((i10 - i14) - e51Var.f29716t0) - getTranslationY());
        } else {
            i11 = 0;
        }
        drawable.setBounds(0, i14, getMeasuredWidth(), i16);
        drawable.draw(canvas);
        if (!e51Var.N1) {
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.j6.f29140t0.setColor(e51Var.A1);
                rectF.set(e51Var.f29717u0, e51Var.f29716t0 + i14, getMeasuredWidth() - e51Var.f29717u0, org.telegram.messenger.g0.L(24.0f) + e51Var.f29716t0 + i14);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.j6.f29140t0);
            }
            int L4 = org.telegram.messenger.g0.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i15, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + i15);
            org.telegram.ui.ActionBar.j6.f29140t0.setColor(org.telegram.ui.ActionBar.j6.x0(null, e51Var.D1, false));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.j6.f29140t0);
        }
        if (i11 > 0) {
            org.telegram.ui.ActionBar.j6.f29140t0.setColor(e51Var.A1);
        }
        if (i11 > org.telegram.messenger.g0.f23603m / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, e51Var.J0)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, e51Var.J0), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.s3(e51Var.getWindow(), z11);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            e51 e51Var = this.f33511e;
            if (y10 < e51Var.f34214y1) {
                e51Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f33511e.Q0();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        int size = View.MeasureSpec.getSize(i10);
        this.f33510c = true;
        e51 e51Var = this.f33511e;
        di.c1 c1Var = e51Var.f34204o1;
        int i11 = e51Var.f29717u0;
        setPadding(i11, org.telegram.messenger.g0.f23603m, i11, 0);
        this.f33510c = false;
        int paddingTop = size - getPaddingTop();
        if (e51Var.d) {
            L = org.telegram.messenger.g0.L(8.0f);
            e51Var.u0(false);
            int i12 = e51Var.f34214y1;
            if (i12 != 0) {
                float f10 = i12;
                this.f33509b = f10;
                setTranslationY(f10);
                ValueAnimator valueAnimator = this.f33508a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f33508a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f33509b, 0.0f);
                this.f33508a = ofFloat;
                ofFloat.addUpdateListener(new f60(this, 29));
                this.f33508a.setDuration(250L);
                this.f33508a.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
                this.f33508a.addListener(new i11(this, 5));
                this.f33508a.start();
            } else if (this.f33508a != null) {
                setTranslationY(this.f33509b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + org.telegram.messenger.g0.L(8.0f);
            e51Var.f29713r0 = true;
        }
        if (c1Var.getPaddingTop() != L) {
            this.f33510c = true;
            c1Var.setPadding(0, L, 0, 0);
            this.f33510c = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f33511e.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f33510c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        invalidate();
    }
}
