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
public final class i8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 f34828a;
    public int f34829b;
    public int f34830c;
    public int d;
    public int e;
    public int f34831f;
    public int h;
    public SparseArray f34832n;
    public SparseArray f34833r;
    public final org.telegram.ui.Components.zz f34834s;
    public final SparseArray v;
    public final SparseArray f34835w;
    public final l8 f34836x;

    public i8(l8 l8Var, Context context) {
        super(context);
        this.f34836x = l8Var;
        this.f34832n = new SparseArray();
        this.f34833r = new SparseArray();
        this.v = new SparseArray();
        this.f34835w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f34828a = k5Var;
        if (l8Var.f35675b0 == 0 && l8Var.f35673a0) {
            k5Var.setOnLongClickListener(new w(this, 1));
            k5Var.setOnClickListener(new c8(this, 0));
        }
        k5Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19971i6, false), 2, -1));
        k5Var.setTextSize(15);
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setGravity(17);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        addView(k5Var, k7.b6.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, new g8(this, context));
        this.f34834s = zzVar;
        ((GestureDetector) zzVar.f31508b).setIsLongpressEnabled(l8Var.f35675b0 == 0);
    }

    public static void a(i8 i8Var, int i10, int i11) {
        float f10;
        if (i8Var.f34832n != null) {
            for (int i12 = 0; i12 < i8Var.d; i12++) {
                j8 j8Var = (j8) i8Var.f34832n.get(i12, null);
                if (j8Var != null) {
                    j8Var.f35114m = j8Var.f35113l;
                    int i13 = j8Var.h;
                    if (i13 >= i10 && i13 <= i11) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    j8Var.f35115n = f10;
                    j8Var.f35111j = j8Var.f35110i;
                    if (i13 != i10 && i13 != i11) {
                        j8Var.f35112k = 0.0f;
                    } else {
                        j8Var.f35112k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(i8 i8Var, float f10) {
        if (i8Var.f34832n != null) {
            for (int i10 = 0; i10 < i8Var.d; i10++) {
                j8 j8Var = (j8) i8Var.f34832n.get(i10, null);
                if (j8Var != null) {
                    float f11 = j8Var.f35114m;
                    j8Var.f35113l = e2.c.w(j8Var.f35115n, f11, f10, f11);
                    float f12 = j8Var.f35111j;
                    j8Var.f35110i = e2.c.w(j8Var.f35112k, f12, f10, f12);
                }
            }
        }
        i8Var.invalidate();
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
        SparseArray sparseArray2 = this.f34835w;
        k8 k8Var = (k8) sparseArray2.get(i10);
        float f15 = 0.0f;
        if (k8Var != null) {
            float f16 = k8Var.f35439a;
            f11 = k8Var.f35440b;
            f12 = k8Var.f35441c;
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
        obj.f35439a = f10;
        obj.f35440b = f11;
        sparseArray2.put(i10, obj);
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.ft.e);
            final float f17 = f11;
            final float f18 = f15;
            final float f19 = f10;
            final float f20 = f13;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    i8 i8Var = i8.this;
                    i8Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f21 = f20;
                    float f22 = f19;
                    float w10 = e2.c.w(f21, f22, floatValue, f22);
                    k8 k8Var2 = obj;
                    k8Var2.f35439a = w10;
                    float f23 = f14;
                    float f24 = f17;
                    k8Var2.f35440b = e2.c.w(f23, f24, floatValue, f24);
                    float f25 = f18;
                    float f26 = f12;
                    k8Var2.f35441c = e2.c.w(f25, f26, floatValue, f26);
                    i8Var.invalidate();
                }
            });
            duration.addListener(new h8(this, obj, f20, f14, f18, i10, z4));
            duration.start();
            sparseArray.put(i10, duration);
            return;
        }
        obj.f35439a = f13;
        obj.f35440b = f14;
        obj.f35441c = f15;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f34833r != null) {
            for (int i10 = 0; i10 < this.f34833r.size(); i10++) {
                ((ImageReceiver) this.f34833r.valueAt(i10)).onAttachedToWindow();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f34833r != null) {
            for (int i10 = 0; i10 < this.f34833r.size(); i10++) {
                ((ImageReceiver) this.f34833r.valueAt(i10)).onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f34831f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f34834s.f31508b).onTouchEvent(motionEvent);
    }
}
