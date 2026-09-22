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
public final class f8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.j5 f33556a;
    public int f33557b;
    public int f33558c;
    public int d;
    public int e;
    public int f33559f;
    public int h;
    public SparseArray f33560n;
    public SparseArray f33561r;
    public final l.d f33562s;
    public final SparseArray v;
    public final SparseArray f33563w;
    public final i8 f33564x;

    public f8(i8 i8Var, Context context) {
        super(context);
        this.f33564x = i8Var;
        this.f33560n = new SparseArray();
        this.f33561r = new SparseArray();
        this.v = new SparseArray();
        this.f33563w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f33556a = j5Var;
        if (i8Var.f34498e0 == 0 && i8Var.f34497d0) {
            j5Var.setOnLongClickListener(new u(this, 1));
            j5Var.setOnClickListener(new z7(this, 0));
        }
        j5Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19199i6, false), 2, -1));
        j5Var.setTextSize(15);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setGravity(17);
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        addView(j5Var, w7.y5.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        l.d dVar = new l.d(context, new d8(this, context));
        this.f33562s = dVar;
        ((GestureDetector) dVar.f13912b).setIsLongpressEnabled(i8Var.f34498e0 == 0);
    }

    public static void a(f8 f8Var, int i10, int i11) {
        float f7;
        if (f8Var.f33560n != null) {
            for (int i12 = 0; i12 < f8Var.d; i12++) {
                g8 g8Var = (g8) f8Var.f33560n.get(i12, null);
                if (g8Var != null) {
                    g8Var.f33857m = g8Var.f33856l;
                    int i13 = g8Var.h;
                    if (i13 >= i10 && i13 <= i11) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    g8Var.f33858n = f7;
                    g8Var.f33854j = g8Var.f33853i;
                    if (i13 != i10 && i13 != i11) {
                        g8Var.f33855k = 0.0f;
                    } else {
                        g8Var.f33855k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(f8 f8Var, float f7) {
        if (f8Var.f33560n != null) {
            for (int i10 = 0; i10 < f8Var.d; i10++) {
                g8 g8Var = (g8) f8Var.f33560n.get(i10, null);
                if (g8Var != null) {
                    float f10 = g8Var.f33857m;
                    g8Var.f33856l = com.google.android.gms.internal.vision.e2.z(g8Var.f33858n, f10, f7, f10);
                    float f11 = g8Var.f33854j;
                    g8Var.f33853i = com.google.android.gms.internal.vision.e2.z(g8Var.f33855k, f11, f7, f11);
                }
            }
        }
        f8Var.invalidate();
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
        SparseArray sparseArray2 = this.f33563w;
        h8 h8Var = (h8) sparseArray2.get(i10);
        float f14 = 0.0f;
        if (h8Var != null) {
            float f15 = h8Var.f34152a;
            f10 = h8Var.f34153b;
            f11 = h8Var.f34154c;
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
        obj.f34152a = f7;
        obj.f34153b = f10;
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
                    f8 f8Var = f8.this;
                    f8Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f20 = f19;
                    float f21 = f18;
                    float z12 = com.google.android.gms.internal.vision.e2.z(f20, f21, floatValue, f21);
                    h8 h8Var2 = obj;
                    h8Var2.f34152a = z12;
                    float f22 = f13;
                    float f23 = f16;
                    h8Var2.f34153b = com.google.android.gms.internal.vision.e2.z(f22, f23, floatValue, f23);
                    float f24 = f17;
                    float f25 = f11;
                    h8Var2.f34154c = com.google.android.gms.internal.vision.e2.z(f24, f25, floatValue, f25);
                    f8Var.invalidate();
                }
            });
            duration.addListener(new e8(this, obj, f19, f13, f17, i10, z10));
            duration.start();
            sparseArray.put(i10, duration);
            return;
        }
        obj.f34152a = f12;
        obj.f34153b = f13;
        obj.f34154c = f14;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f33561r != null) {
            for (int i10 = 0; i10 < this.f33561r.size(); i10++) {
                ((ImageReceiver) this.f33561r.valueAt(i10)).onAttachedToWindow();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f33561r != null) {
            for (int i10 = 0; i10 < this.f33561r.size(); i10++) {
                ((ImageReceiver) this.f33561r.valueAt(i10)).onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f33559f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f33562s.f13912b).onTouchEvent(motionEvent);
    }
}
