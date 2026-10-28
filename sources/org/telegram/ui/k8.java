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
public final class k8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 f40677a;
    public int f40678b;
    public int f40679c;
    public int d;
    public int e;
    public int f40680f;
    public int h;
    public SparseArray f40681n;
    public SparseArray f40682r;
    public final jg.s0 f40683s;
    public final SparseArray v;
    public final SparseArray f40684w;
    public final n8 f40685x;

    public k8(n8 n8Var, Context context) {
        super(context);
        this.f40685x = n8Var;
        this.f40681n = new SparseArray();
        this.f40682r = new SparseArray();
        this.v = new SparseArray();
        this.f40684w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f40677a = b6Var;
        if (n8Var.f41656e0 == 0 && n8Var.f41655d0) {
            b6Var.setOnLongClickListener(new t(this, 1));
            b6Var.setOnClickListener(new e8(this, 0));
        }
        int i10 = org.telegram.ui.ActionBar.y6.f23449i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i10, false), 2, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        b6Var.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(b6Var, g02, null, N, null);
        b6Var.setTextSize(15);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setGravity(17);
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, null);
        addView(b6Var, org.telegram.ui.Components.kb1.h(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        jg.s0 s0Var = new jg.s0(context, new i8(this, context));
        this.f40683s = s0Var;
        ((GestureDetector) s0Var.f15827b).setIsLongpressEnabled(n8Var.f41656e0 == 0);
    }

    public static void a(k8 k8Var, int i10, int i11) {
        float f7;
        if (k8Var.f40681n != null) {
            for (int i12 = 0; i12 < k8Var.d; i12++) {
                l8 l8Var = (l8) k8Var.f40681n.get(i12, null);
                if (l8Var != null) {
                    l8Var.f41000m = l8Var.f40999l;
                    int i13 = l8Var.h;
                    if (i13 >= i10 && i13 <= i11) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    l8Var.f41001n = f7;
                    l8Var.f40997j = l8Var.f40996i;
                    if (i13 != i10 && i13 != i11) {
                        l8Var.f40998k = 0.0f;
                    } else {
                        l8Var.f40998k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(k8 k8Var, float f7) {
        if (k8Var.f40681n != null) {
            for (int i10 = 0; i10 < k8Var.d; i10++) {
                l8 l8Var = (l8) k8Var.f40681n.get(i10, null);
                if (l8Var != null) {
                    float f10 = l8Var.f41000m;
                    l8Var.f40999l = c3.h0.z(l8Var.f41001n, f10, f7, f10);
                    float f11 = l8Var.f40997j;
                    l8Var.f40996i = c3.h0.z(l8Var.f40998k, f11, f7, f11);
                }
            }
        }
        k8Var.invalidate();
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
        SparseArray sparseArray2 = this.f40684w;
        m8 m8Var = (m8) sparseArray2.get(i10);
        float f14 = 0.0f;
        if (m8Var != null) {
            float f15 = m8Var.f41349a;
            f10 = m8Var.f41350b;
            f11 = m8Var.f41351c;
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
        obj.f41349a = f7;
        obj.f41350b = f10;
        sparseArray2.put(i10, obj);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.ut.e);
            final float f16 = f10;
            final float f17 = f14;
            final float f18 = f7;
            final float f19 = f12;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    k8 k8Var = k8.this;
                    k8Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f20 = f19;
                    float f21 = f18;
                    float z12 = c3.h0.z(f20, f21, floatValue, f21);
                    m8 m8Var2 = obj;
                    m8Var2.f41349a = z12;
                    float f22 = f13;
                    float f23 = f16;
                    m8Var2.f41350b = c3.h0.z(f22, f23, floatValue, f23);
                    float f24 = f17;
                    float f25 = f11;
                    m8Var2.f41351c = c3.h0.z(f24, f25, floatValue, f25);
                    k8Var.invalidate();
                }
            });
            duration.addListener(new j8(this, obj, f19, f13, f17, i10, z10));
            duration.start();
            sparseArray.put(i10, duration);
            return;
        }
        obj.f41349a = f12;
        obj.f41350b = f13;
        obj.f41351c = f14;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f40682r != null) {
            for (int i10 = 0; i10 < this.f40682r.size(); i10++) {
                ((ImageReceiver) this.f40682r.valueAt(i10)).onAttachedToWindow();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f40682r != null) {
            for (int i10 = 0; i10 < this.f40682r.size(); i10++) {
                ((ImageReceiver) this.f40682r.valueAt(i10)).onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f40680f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f40683s.f15827b).onTouchEvent(motionEvent);
    }
}
