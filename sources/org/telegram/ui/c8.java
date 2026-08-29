package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class c8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.h5 f37027a;
    public int f37028b;
    public int f37029c;
    public int d;
    public int f37030e;
    public int f37031f;
    public int h;
    public SparseArray f37032n;
    public SparseArray f37033r;
    public final o4.g f37034s;
    public final SparseArray v;
    public final SparseArray f37035w;
    public final f8 f37036x;

    public c8(f8 f8Var, Context context) {
        super(context);
        this.f37036x = f8Var;
        this.f37032n = new SparseArray();
        this.f37033r = new SparseArray();
        this.v = new SparseArray();
        this.f37035w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f37027a = h5Var;
        if (f8Var.f38020a0 == 0 && f8Var.Z) {
            h5Var.setOnLongClickListener(new w(this, 1));
            h5Var.setOnClickListener(new w7(this, 0));
        }
        h5Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 2, -1));
        h5Var.setTextSize(15);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setGravity(17);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        addView(h5Var, i7.f6.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        o4.g gVar = new o4.g(context, new a8(this, context));
        this.f37034s = gVar;
        ((GestureDetector) gVar.f19159b).setIsLongpressEnabled(f8Var.f38020a0 == 0);
    }

    public static void a(c8 c8Var, int i10, int i11) {
        float f9;
        if (c8Var.f37032n != null) {
            for (int i12 = 0; i12 < c8Var.d; i12++) {
                d8 d8Var = (d8) c8Var.f37032n.get(i12, null);
                if (d8Var != null) {
                    d8Var.f37402m = d8Var.f37401l;
                    int i13 = d8Var.h;
                    if (i13 >= i10 && i13 <= i11) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    d8Var.f37403n = f9;
                    d8Var.f37399j = d8Var.f37398i;
                    if (i13 != i10 && i13 != i11) {
                        d8Var.f37400k = 0.0f;
                    } else {
                        d8Var.f37400k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(c8 c8Var, float f9) {
        if (c8Var.f37032n != null) {
            for (int i10 = 0; i10 < c8Var.d; i10++) {
                d8 d8Var = (d8) c8Var.f37032n.get(i10, null);
                if (d8Var != null) {
                    float f10 = d8Var.f37402m;
                    d8Var.f37401l = com.google.android.recaptcha.internal.a.z(d8Var.f37403n, f10, f9, f10);
                    float f11 = d8Var.f37399j;
                    d8Var.f37398i = com.google.android.recaptcha.internal.a.z(d8Var.f37400k, f11, f9, f11);
                }
            }
        }
        c8Var.invalidate();
    }

    public final void c(int i10, int i11, int i12, boolean z10, boolean z11) {
        float f9;
        float f10;
        final float f11;
        float f12;
        final float f13;
        SparseArray sparseArray = this.v;
        ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i10);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float measuredWidth = getMeasuredWidth() / 7.0f;
        SparseArray sparseArray2 = this.f37035w;
        e8 e8Var = (e8) sparseArray2.get(i10);
        float f14 = 0.0f;
        if (e8Var != null) {
            float f15 = e8Var.f37719a;
            f10 = e8Var.f37720b;
            f11 = e8Var.f37721c;
            f9 = f15;
        } else {
            f9 = (measuredWidth / 2.0f) + (i11 * measuredWidth);
            f10 = f9;
            f11 = 0.0f;
        }
        if (z10) {
            f12 = (measuredWidth / 2.0f) + (i11 * measuredWidth);
        } else {
            f12 = f9;
        }
        if (z10) {
            f13 = (measuredWidth / 2.0f) + (i12 * measuredWidth);
        } else {
            f13 = f10;
        }
        if (z10) {
            f14 = 1.0f;
        }
        final ?? obj = new Object();
        obj.f37719a = f9;
        obj.f37720b = f10;
        sparseArray2.put(i10, obj);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.ct.f27567e);
            final float f16 = f10;
            final float f17 = f14;
            final float f18 = f9;
            final float f19 = f12;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    c8 c8Var = c8.this;
                    c8Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f20 = f19;
                    float f21 = f18;
                    float z12 = com.google.android.recaptcha.internal.a.z(f20, f21, floatValue, f21);
                    e8 e8Var2 = obj;
                    e8Var2.f37719a = z12;
                    float f22 = f13;
                    float f23 = f16;
                    e8Var2.f37720b = com.google.android.recaptcha.internal.a.z(f22, f23, floatValue, f23);
                    float f24 = f17;
                    float f25 = f11;
                    e8Var2.f37721c = com.google.android.recaptcha.internal.a.z(f24, f25, floatValue, f25);
                    c8Var.invalidate();
                }
            });
            duration.addListener(new b8(this, obj, f19, f13, f17, i10, z10));
            duration.start();
            sparseArray.put(i10, duration);
            return;
        }
        obj.f37719a = f12;
        obj.f37720b = f13;
        obj.f37721c = f14;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f37033r != null) {
            for (int i10 = 0; i10 < this.f37033r.size(); i10++) {
                ((ImageReceiver) this.f37033r.valueAt(i10)).onAttachedToWindow();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37033r != null) {
            for (int i10 = 0; i10 < this.f37033r.size(); i10++) {
                ((ImageReceiver) this.f37033r.valueAt(i10)).onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f37031f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f37034s.f19159b).onTouchEvent(motionEvent);
    }
}
