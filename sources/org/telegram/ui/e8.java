package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class e8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 f45221a;
    public int f45222b;
    public int f45223c;
    public int d;
    public int f45224e;
    public int f45225f;
    public int h;
    public SparseArray f45226n;
    public SparseArray f45227r;
    public final org.telegram.ui.Components.vy f45228s;
    public final SparseArray f45229w;
    public final SparseArray f45230x;
    public final h8 f45231y;

    public e8(h8 h8Var, Context context) {
        super(context);
        this.f45231y = h8Var;
        this.f45226n = new SparseArray();
        this.f45227r = new SparseArray();
        this.f45229w = new SparseArray();
        this.f45230x = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f45221a = k5Var;
        if (h8Var.f46268e0 == 0 && h8Var.f46266d0) {
            k5Var.setOnLongClickListener(new t(this, 1));
            k5Var.setOnClickListener(new z7(this, 0));
        }
        int i7 = org.telegram.ui.ActionBar.k6.f27944i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i7, false), 2, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        k5Var.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(k5Var, h02, null, N, null);
        k5Var.setTextSize(15);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, null);
        addView(k5Var, c8.ha.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        org.telegram.ui.Components.vy vyVar = new org.telegram.ui.Components.vy(context, new c8(this, context));
        this.f45228s = vyVar;
        ((GestureDetector) vyVar.f39747b).setIsLongpressEnabled(h8Var.f46268e0 == 0);
    }

    public static void a(e8 e8Var, int i7, int i10) {
        float f10;
        if (e8Var.f45226n != null) {
            for (int i11 = 0; i11 < e8Var.d; i11++) {
                f8 f8Var = (f8) e8Var.f45226n.get(i11, null);
                if (f8Var != null) {
                    f8Var.f45484m = f8Var.f45483l;
                    int i12 = f8Var.h;
                    if (i12 >= i7 && i12 <= i10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    f8Var.f45485n = f10;
                    f8Var.f45481j = f8Var.f45480i;
                    if (i12 != i7 && i12 != i10) {
                        f8Var.f45482k = 0.0f;
                    } else {
                        f8Var.f45482k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(e8 e8Var, float f10) {
        if (e8Var.f45226n != null) {
            for (int i7 = 0; i7 < e8Var.d; i7++) {
                f8 f8Var = (f8) e8Var.f45226n.get(i7, null);
                if (f8Var != null) {
                    float f11 = f8Var.f45484m;
                    f8Var.f45483l = com.google.android.recaptcha.internal.a.z(f8Var.f45485n, f11, f10, f11);
                    float f12 = f8Var.f45481j;
                    f8Var.f45480i = com.google.android.recaptcha.internal.a.z(f8Var.f45482k, f12, f10, f12);
                }
            }
        }
        e8Var.invalidate();
    }

    public final void c(int i7, int i10, int i11, boolean z9, boolean z10) {
        float f10;
        float f11;
        final float f12;
        float f13;
        final float f14;
        SparseArray sparseArray = this.f45229w;
        ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i7);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float measuredWidth = getMeasuredWidth() / 7.0f;
        SparseArray sparseArray2 = this.f45230x;
        g8 g8Var = (g8) sparseArray2.get(i7);
        float f15 = 0.0f;
        if (g8Var != null) {
            float f16 = g8Var.f45894a;
            f11 = g8Var.f45895b;
            f12 = g8Var.f45896c;
            f10 = f16;
        } else {
            f10 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            f11 = f10;
            f12 = 0.0f;
        }
        if (z9) {
            f13 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
        } else {
            f13 = f10;
        }
        if (z9) {
            f14 = (measuredWidth / 2.0f) + (i11 * measuredWidth);
        } else {
            f14 = f11;
        }
        if (z9) {
            f15 = 1.0f;
        }
        final ?? obj = new Object();
        obj.f45894a = f10;
        obj.f45895b = f11;
        sparseArray2.put(i7, obj);
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.ks.f35429e);
            final float f17 = f11;
            final float f18 = f15;
            final float f19 = f10;
            final float f20 = f13;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    e8 e8Var = e8.this;
                    e8Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f21 = f20;
                    float f22 = f19;
                    float z11 = com.google.android.recaptcha.internal.a.z(f21, f22, floatValue, f22);
                    g8 g8Var2 = obj;
                    g8Var2.f45894a = z11;
                    float f23 = f14;
                    float f24 = f17;
                    g8Var2.f45895b = com.google.android.recaptcha.internal.a.z(f23, f24, floatValue, f24);
                    float f25 = f18;
                    float f26 = f12;
                    g8Var2.f45896c = com.google.android.recaptcha.internal.a.z(f25, f26, floatValue, f26);
                    e8Var.invalidate();
                }
            });
            duration.addListener(new d8(this, obj, f20, f14, f18, i7, z9));
            duration.start();
            sparseArray.put(i7, duration);
            return;
        }
        obj.f45894a = f13;
        obj.f45895b = f14;
        obj.f45896c = f15;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f45227r != null) {
            for (int i7 = 0; i7 < this.f45227r.size(); i7++) {
                ((ImageReceiver) this.f45227r.valueAt(i7)).P();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f45227r != null) {
            for (int i7 = 0; i7 < this.f45227r.size(); i7++) {
                ((ImageReceiver) this.f45227r.valueAt(i7)).R();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((this.f45225f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f45228s.f39747b).onTouchEvent(motionEvent);
    }
}
