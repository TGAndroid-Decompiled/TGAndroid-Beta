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
public final class g8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 f33901a;
    public int f33902b;
    public int f33903c;
    public int d;
    public int e;
    public int f33904f;
    public int h;
    public SparseArray f33905n;
    public SparseArray f33906r;
    public final k2.u f33907s;
    public final SparseArray v;
    public final SparseArray f33908w;
    public final j8 f33909x;

    public g8(j8 j8Var, Context context) {
        super(context);
        this.f33909x = j8Var;
        this.f33905n = new SparseArray();
        this.f33906r = new SparseArray();
        this.v = new SparseArray();
        this.f33908w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f33901a = k5Var;
        if (j8Var.f34803e0 == 0 && j8Var.f34802d0) {
            k5Var.setOnLongClickListener(new u(this, 1));
            k5Var.setOnClickListener(new a8(this, 0));
        }
        k5Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18953i6, false), 2, -1));
        k5Var.setTextSize(15);
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setGravity(17);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        addView(k5Var, w7.x5.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        k2.u uVar = new k2.u(context, new e8(this, context));
        this.f33907s = uVar;
        ((GestureDetector) uVar.f13385b).setIsLongpressEnabled(j8Var.f34803e0 == 0);
    }

    public static void a(g8 g8Var, int i10, int i11) {
        float f7;
        if (g8Var.f33905n != null) {
            for (int i12 = 0; i12 < g8Var.d; i12++) {
                h8 h8Var = (h8) g8Var.f33905n.get(i12, null);
                if (h8Var != null) {
                    h8Var.f34209m = h8Var.f34208l;
                    int i13 = h8Var.h;
                    if (i13 >= i10 && i13 <= i11) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    h8Var.f34210n = f7;
                    h8Var.f34206j = h8Var.f34205i;
                    if (i13 != i10 && i13 != i11) {
                        h8Var.f34207k = 0.0f;
                    } else {
                        h8Var.f34207k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(g8 g8Var, float f7) {
        if (g8Var.f33905n != null) {
            for (int i10 = 0; i10 < g8Var.d; i10++) {
                h8 h8Var = (h8) g8Var.f33905n.get(i10, null);
                if (h8Var != null) {
                    float f10 = h8Var.f34209m;
                    h8Var.f34208l = com.google.android.gms.internal.vision.e2.z(h8Var.f34210n, f10, f7, f10);
                    float f11 = h8Var.f34206j;
                    h8Var.f34205i = com.google.android.gms.internal.vision.e2.z(h8Var.f34207k, f11, f7, f11);
                }
            }
        }
        g8Var.invalidate();
    }

    public final void c(int i10, int i11, int i12, boolean z10, boolean z11) {
        float f7;
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
        SparseArray sparseArray2 = this.f33908w;
        i8 i8Var = (i8) sparseArray2.get(i10);
        float f14 = 0.0f;
        if (i8Var != null) {
            float f15 = i8Var.f34508a;
            f10 = i8Var.f34509b;
            f11 = i8Var.f34510c;
            f7 = f15;
        } else {
            f7 = (measuredWidth / 2.0f) + (i11 * measuredWidth);
            f10 = f7;
            f11 = 0.0f;
        }
        if (z10) {
            f12 = (measuredWidth / 2.0f) + (i11 * measuredWidth);
        } else {
            f12 = f7;
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
        obj.f34508a = f7;
        obj.f34509b = f10;
        sparseArray2.put(i10, obj);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.kt.e);
            final float f16 = f10;
            final float f17 = f14;
            final float f18 = f7;
            final float f19 = f12;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    g8 g8Var = g8.this;
                    g8Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f20 = f19;
                    float f21 = f18;
                    float z12 = com.google.android.gms.internal.vision.e2.z(f20, f21, floatValue, f21);
                    i8 i8Var2 = obj;
                    i8Var2.f34508a = z12;
                    float f22 = f13;
                    float f23 = f16;
                    i8Var2.f34509b = com.google.android.gms.internal.vision.e2.z(f22, f23, floatValue, f23);
                    float f24 = f17;
                    float f25 = f11;
                    i8Var2.f34510c = com.google.android.gms.internal.vision.e2.z(f24, f25, floatValue, f25);
                    g8Var.invalidate();
                }
            });
            duration.addListener(new f8(this, obj, f19, f13, f17, i10, z10));
            duration.start();
            sparseArray.put(i10, duration);
            return;
        }
        obj.f34508a = f12;
        obj.f34509b = f13;
        obj.f34510c = f14;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f33906r != null) {
            for (int i10 = 0; i10 < this.f33906r.size(); i10++) {
                ((ImageReceiver) this.f33906r.valueAt(i10)).onAttachedToWindow();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f33906r != null) {
            for (int i10 = 0; i10 < this.f33906r.size(); i10++) {
                ((ImageReceiver) this.f33906r.valueAt(i10)).onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f33904f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f33907s.f13385b).onTouchEvent(motionEvent);
    }
}
