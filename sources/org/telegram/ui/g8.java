package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class g8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.n5 f48158a;
    public int f48159b;
    public int f48160c;
    public int d;
    public int f48161e;
    public int f48162f;
    public int h;
    public SparseArray f48163n;
    public SparseArray f48164r;
    public final org.telegram.ui.Components.nd0 f48165s;
    public final SparseArray f48166w;
    public final SparseArray f48167x;
    public final j8 f48168y;

    public g8(j8 j8Var, Context context) {
        super(context);
        this.f48168y = j8Var;
        this.f48163n = new SparseArray();
        this.f48164r = new SparseArray();
        this.f48166w = new SparseArray();
        this.f48167x = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f48158a = n5Var;
        if (j8Var.f49023f0 == 0 && j8Var.f49021e0) {
            n5Var.setOnLongClickListener(new t(this, 1));
            n5Var.setOnClickListener(new b8(this, 0));
        }
        int i7 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i7, false), 2, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        n5Var.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(n5Var, h02, null, M, null);
        n5Var.setTextSize(15);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setGravity(17);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, null);
        addView(n5Var, c8.na.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        org.telegram.ui.Components.nd0 nd0Var = new org.telegram.ui.Components.nd0(context, new e8(this, context));
        this.f48165s = nd0Var;
        ((GestureDetector) nd0Var.f37766b).setIsLongpressEnabled(j8Var.f49023f0 == 0);
    }

    public static void a(g8 g8Var, int i7, int i10) {
        float f10;
        if (g8Var.f48163n != null) {
            for (int i11 = 0; i11 < g8Var.d; i11++) {
                h8 h8Var = (h8) g8Var.f48163n.get(i11, null);
                if (h8Var != null) {
                    h8Var.f48479m = h8Var.f48478l;
                    int i12 = h8Var.h;
                    if (i12 >= i7 && i12 <= i10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    h8Var.f48480n = f10;
                    h8Var.f48476j = h8Var.f48475i;
                    if (i12 != i7 && i12 != i10) {
                        h8Var.f48477k = 0.0f;
                    } else {
                        h8Var.f48477k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(g8 g8Var, float f10) {
        if (g8Var.f48163n != null) {
            for (int i7 = 0; i7 < g8Var.d; i7++) {
                h8 h8Var = (h8) g8Var.f48163n.get(i7, null);
                if (h8Var != null) {
                    float f11 = h8Var.f48479m;
                    h8Var.f48478l = com.google.android.gms.internal.vision.e2.z(h8Var.f48480n, f11, f10, f11);
                    float f12 = h8Var.f48476j;
                    h8Var.f48475i = com.google.android.gms.internal.vision.e2.z(h8Var.f48477k, f12, f10, f12);
                }
            }
        }
        g8Var.invalidate();
    }

    public final void c(int i7, int i10, int i11, boolean z10, boolean z11) {
        float f10;
        float f11;
        final float f12;
        float f13;
        final float f14;
        SparseArray sparseArray = this.f48166w;
        ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i7);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float measuredWidth = getMeasuredWidth() / 7.0f;
        SparseArray sparseArray2 = this.f48167x;
        i8 i8Var = (i8) sparseArray2.get(i7);
        float f15 = 0.0f;
        if (i8Var != null) {
            float f16 = i8Var.f48742a;
            f11 = i8Var.f48743b;
            f12 = i8Var.f48744c;
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
        obj.f48742a = f10;
        obj.f48743b = f11;
        sparseArray2.put(i7, obj);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.ws.f41716e);
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
                    float z12 = com.google.android.gms.internal.vision.e2.z(f21, f22, floatValue, f22);
                    i8 i8Var2 = obj;
                    i8Var2.f48742a = z12;
                    float f23 = f14;
                    float f24 = f17;
                    i8Var2.f48743b = com.google.android.gms.internal.vision.e2.z(f23, f24, floatValue, f24);
                    float f25 = f18;
                    float f26 = f12;
                    i8Var2.f48744c = com.google.android.gms.internal.vision.e2.z(f25, f26, floatValue, f26);
                    g8Var.invalidate();
                }
            });
            duration.addListener(new f8(this, obj, f20, f14, f18, i7, z10));
            duration.start();
            sparseArray.put(i7, duration);
            return;
        }
        obj.f48742a = f13;
        obj.f48743b = f14;
        obj.f48744c = f15;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f48164r != null) {
            for (int i7 = 0; i7 < this.f48164r.size(); i7++) {
                ((ImageReceiver) this.f48164r.valueAt(i7)).Q();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f48164r != null) {
            for (int i7 = 0; i7 < this.f48164r.size(); i7++) {
                ((ImageReceiver) this.f48164r.valueAt(i7)).S();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((this.f48162f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f48165s.f37766b).onTouchEvent(motionEvent);
    }
}
