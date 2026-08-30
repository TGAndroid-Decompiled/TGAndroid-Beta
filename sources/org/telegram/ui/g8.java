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
    public final org.telegram.ui.ActionBar.k5 f34470a;
    public int f34471b;
    public int f34472c;
    public int d;
    public int e;
    public int f34473f;
    public int h;
    public SparseArray f34474n;
    public SparseArray f34475r;
    public final org.telegram.ui.Cells.f1 f34476s;
    public final SparseArray v;
    public final SparseArray f34477w;
    public final j8 f34478x;

    public g8(j8 j8Var, Context context) {
        super(context);
        this.f34478x = j8Var;
        this.f34474n = new SparseArray();
        this.f34475r = new SparseArray();
        this.v = new SparseArray();
        this.f34477w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f34470a = k5Var;
        if (j8Var.f35258b0 == 0 && j8Var.f35256a0) {
            k5Var.setOnLongClickListener(new w(this, 1));
            k5Var.setOnClickListener(new a8(this, 0));
        }
        k5Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19996i6, false), 2, -1));
        k5Var.setTextSize(15);
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setGravity(17);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        addView(k5Var, k7.b6.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        org.telegram.ui.Cells.f1 f1Var = new org.telegram.ui.Cells.f1(context, new e8(this, context));
        this.f34476s = f1Var;
        ((GestureDetector) f1Var.f21045b).setIsLongpressEnabled(j8Var.f35258b0 == 0);
    }

    public static void a(g8 g8Var, int i10, int i11) {
        float f10;
        if (g8Var.f34474n != null) {
            for (int i12 = 0; i12 < g8Var.d; i12++) {
                h8 h8Var = (h8) g8Var.f34474n.get(i12, null);
                if (h8Var != null) {
                    h8Var.f34788m = h8Var.f34787l;
                    int i13 = h8Var.h;
                    if (i13 >= i10 && i13 <= i11) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    h8Var.f34789n = f10;
                    h8Var.f34785j = h8Var.f34784i;
                    if (i13 != i10 && i13 != i11) {
                        h8Var.f34786k = 0.0f;
                    } else {
                        h8Var.f34786k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(g8 g8Var, float f10) {
        if (g8Var.f34474n != null) {
            for (int i10 = 0; i10 < g8Var.d; i10++) {
                h8 h8Var = (h8) g8Var.f34474n.get(i10, null);
                if (h8Var != null) {
                    float f11 = h8Var.f34788m;
                    h8Var.f34787l = e2.c.w(h8Var.f34789n, f11, f10, f11);
                    float f12 = h8Var.f34785j;
                    h8Var.f34784i = e2.c.w(h8Var.f34786k, f12, f10, f12);
                }
            }
        }
        g8Var.invalidate();
    }

    public final void c(int i10, int i11, int i12, boolean z4, boolean z10) {
        float f10;
        float f11;
        final float f12;
        float f13;
        final float f14;
        SparseArray sparseArray = this.v;
        ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i10);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float measuredWidth = getMeasuredWidth() / 7.0f;
        SparseArray sparseArray2 = this.f34477w;
        i8 i8Var = (i8) sparseArray2.get(i10);
        float f15 = 0.0f;
        if (i8Var != null) {
            float f16 = i8Var.f35039a;
            f11 = i8Var.f35040b;
            f12 = i8Var.f35041c;
            f10 = f16;
        } else {
            f10 = (measuredWidth / 2.0f) + (i11 * measuredWidth);
            f11 = f10;
            f12 = 0.0f;
        }
        if (z4) {
            f13 = (measuredWidth / 2.0f) + (i11 * measuredWidth);
        } else {
            f13 = f10;
        }
        if (z4) {
            f14 = (measuredWidth / 2.0f) + (i12 * measuredWidth);
        } else {
            f14 = f11;
        }
        if (z4) {
            f15 = 1.0f;
        }
        final ?? obj = new Object();
        obj.f35039a = f10;
        obj.f35040b = f11;
        sparseArray2.put(i10, obj);
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.gt.e);
            final float f17 = f11;
            final float f18 = f15;
            final float f19 = f10;
            final float f20 = f13;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    g8 g8Var = g8.this;
                    g8Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f21 = f20;
                    float f22 = f19;
                    float w10 = e2.c.w(f21, f22, floatValue, f22);
                    i8 i8Var2 = obj;
                    i8Var2.f35039a = w10;
                    float f23 = f14;
                    float f24 = f17;
                    i8Var2.f35040b = e2.c.w(f23, f24, floatValue, f24);
                    float f25 = f18;
                    float f26 = f12;
                    i8Var2.f35041c = e2.c.w(f25, f26, floatValue, f26);
                    g8Var.invalidate();
                }
            });
            duration.addListener(new f8(this, obj, f20, f14, f18, i10, z4));
            duration.start();
            sparseArray.put(i10, duration);
            return;
        }
        obj.f35039a = f13;
        obj.f35040b = f14;
        obj.f35041c = f15;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f34475r != null) {
            for (int i10 = 0; i10 < this.f34475r.size(); i10++) {
                ((ImageReceiver) this.f34475r.valueAt(i10)).onAttachedToWindow();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f34475r != null) {
            for (int i10 = 0; i10 < this.f34475r.size(); i10++) {
                ((ImageReceiver) this.f34475r.valueAt(i10)).onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f34473f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f34476s.f21045b).onTouchEvent(motionEvent);
    }
}
