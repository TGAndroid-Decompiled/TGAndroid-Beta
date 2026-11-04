package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class f8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 f45175a;
    public int f45176b;
    public int f45177c;
    public int d;
    public int f45178e;
    public int f45179f;
    public int h;
    public SparseArray f45180n;
    public SparseArray f45181r;
    public final org.telegram.ui.Components.y00 f45182s;
    public final SparseArray f45183w;
    public final SparseArray f45184x;
    public final i8 f45185y;

    public f8(i8 i8Var, Context context) {
        super(context);
        this.f45185y = i8Var;
        this.f45180n = new SparseArray();
        this.f45181r = new SparseArray();
        this.f45183w = new SparseArray();
        this.f45184x = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f45175a = k5Var;
        if (i8Var.f46173f0 == 0 && i8Var.f46171e0) {
            k5Var.setOnLongClickListener(new t(this, 1));
            k5Var.setOnClickListener(new a8(this, 0));
        }
        int i3 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i3, false), 2, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        k5Var.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(k5Var, h02, null, N, null);
        k5Var.setTextSize(15);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, null);
        addView(k5Var, b8.mf.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        org.telegram.ui.Components.y00 y00Var = new org.telegram.ui.Components.y00(context, new d8(this, context));
        this.f45182s = y00Var;
        ((GestureDetector) y00Var.f40562a).setIsLongpressEnabled(i8Var.f46173f0 == 0);
    }

    public static void a(f8 f8Var, int i3, int i10) {
        float f10;
        if (f8Var.f45180n != null) {
            for (int i11 = 0; i11 < f8Var.d; i11++) {
                g8 g8Var = (g8) f8Var.f45180n.get(i11, null);
                if (g8Var != null) {
                    g8Var.f45598m = g8Var.f45597l;
                    int i12 = g8Var.h;
                    if (i12 >= i3 && i12 <= i10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    g8Var.f45599n = f10;
                    g8Var.f45595j = g8Var.f45594i;
                    if (i12 != i3 && i12 != i10) {
                        g8Var.f45596k = 0.0f;
                    } else {
                        g8Var.f45596k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(f8 f8Var, float f10) {
        if (f8Var.f45180n != null) {
            for (int i3 = 0; i3 < f8Var.d; i3++) {
                g8 g8Var = (g8) f8Var.f45180n.get(i3, null);
                if (g8Var != null) {
                    float f11 = g8Var.f45598m;
                    g8Var.f45597l = com.google.android.recaptcha.internal.a.y(g8Var.f45599n, f11, f10, f11);
                    float f12 = g8Var.f45595j;
                    g8Var.f45594i = com.google.android.recaptcha.internal.a.y(g8Var.f45596k, f12, f10, f12);
                }
            }
        }
        f8Var.invalidate();
    }

    public final void c(int i3, int i10, int i11, boolean z10, boolean z11) {
        float f10;
        float f11;
        final float f12;
        float f13;
        final float f14;
        SparseArray sparseArray = this.f45183w;
        ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i3);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float measuredWidth = getMeasuredWidth() / 7.0f;
        SparseArray sparseArray2 = this.f45184x;
        h8 h8Var = (h8) sparseArray2.get(i3);
        float f15 = 0.0f;
        if (h8Var != null) {
            float f16 = h8Var.f45850a;
            f11 = h8Var.f45851b;
            f12 = h8Var.f45852c;
            f10 = f16;
        } else {
            f10 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            f11 = f10;
            f12 = 0.0f;
        }
        if (z10) {
            f13 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
        } else {
            f13 = f10;
        }
        if (z10) {
            f14 = (measuredWidth / 2.0f) + (i11 * measuredWidth);
        } else {
            f14 = f11;
        }
        if (z10) {
            f15 = 1.0f;
        }
        final ?? obj = new Object();
        obj.f45850a = f10;
        obj.f45851b = f11;
        sparseArray2.put(i3, obj);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.ks.f35477e);
            final float f17 = f11;
            final float f18 = f15;
            final float f19 = f10;
            final float f20 = f13;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    f8 f8Var = f8.this;
                    f8Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f21 = f20;
                    float f22 = f19;
                    float y9 = com.google.android.recaptcha.internal.a.y(f21, f22, floatValue, f22);
                    h8 h8Var2 = obj;
                    h8Var2.f45850a = y9;
                    float f23 = f14;
                    float f24 = f17;
                    h8Var2.f45851b = com.google.android.recaptcha.internal.a.y(f23, f24, floatValue, f24);
                    float f25 = f18;
                    float f26 = f12;
                    h8Var2.f45852c = com.google.android.recaptcha.internal.a.y(f25, f26, floatValue, f26);
                    f8Var.invalidate();
                }
            });
            duration.addListener(new e8(this, obj, f20, f14, f18, i3, z10));
            duration.start();
            sparseArray.put(i3, duration);
            return;
        }
        obj.f45850a = f13;
        obj.f45851b = f14;
        obj.f45852c = f15;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f45181r != null) {
            for (int i3 = 0; i3 < this.f45181r.size(); i3++) {
                ((ImageReceiver) this.f45181r.valueAt(i3)).P();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f45181r != null) {
            for (int i3 = 0; i3 < this.f45181r.size(); i3++) {
                ((ImageReceiver) this.f45181r.valueAt(i3)).R();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((this.f45179f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f45182s.f40562a).onTouchEvent(motionEvent);
    }
}
