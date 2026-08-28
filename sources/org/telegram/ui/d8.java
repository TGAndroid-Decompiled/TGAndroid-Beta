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
public final class d8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.h5 f37433a;
    public int f37434b;
    public int f37435c;
    public int d;
    public int f37436e;
    public int f37437f;
    public int h;
    public SparseArray f37438n;
    public SparseArray f37439r;
    public final m5.c0 f37440s;
    public final SparseArray v;
    public final SparseArray f37441w;
    public final g8 f37442x;

    public d8(g8 g8Var, Context context) {
        super(context);
        this.f37442x = g8Var;
        this.f37438n = new SparseArray();
        this.f37439r = new SparseArray();
        this.v = new SparseArray();
        this.f37441w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f37433a = h5Var;
        if (g8Var.f38447a0 == 0 && g8Var.Z) {
            h5Var.setOnLongClickListener(new u(this, 1));
            h5Var.setOnClickListener(new x7(this, 0));
        }
        h5Var.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 2, -1));
        h5Var.setTextSize(15);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setGravity(17);
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        addView(h5Var, g7.e6.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        m5.c0 c0Var = new m5.c0(context, new b8(this, context));
        this.f37440s = c0Var;
        ((GestureDetector) c0Var.f17378b).setIsLongpressEnabled(g8Var.f38447a0 == 0);
    }

    public static void a(d8 d8Var, int i9, int i10) {
        float f10;
        if (d8Var.f37438n != null) {
            for (int i11 = 0; i11 < d8Var.d; i11++) {
                e8 e8Var = (e8) d8Var.f37438n.get(i11, null);
                if (e8Var != null) {
                    e8Var.f37849m = e8Var.f37848l;
                    int i12 = e8Var.h;
                    if (i12 >= i9 && i12 <= i10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    e8Var.f37850n = f10;
                    e8Var.f37846j = e8Var.f37845i;
                    if (i12 != i9 && i12 != i10) {
                        e8Var.f37847k = 0.0f;
                    } else {
                        e8Var.f37847k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(d8 d8Var, float f10) {
        if (d8Var.f37438n != null) {
            for (int i9 = 0; i9 < d8Var.d; i9++) {
                e8 e8Var = (e8) d8Var.f37438n.get(i9, null);
                if (e8Var != null) {
                    float f11 = e8Var.f37849m;
                    e8Var.f37848l = e2.c.z(e8Var.f37850n, f11, f10, f11);
                    float f12 = e8Var.f37846j;
                    e8Var.f37845i = e2.c.z(e8Var.f37847k, f12, f10, f12);
                }
            }
        }
        d8Var.invalidate();
    }

    public final void c(int i9, int i10, int i11, boolean z10, boolean z11) {
        float f10;
        float f11;
        final float f12;
        float f13;
        final float f14;
        SparseArray sparseArray = this.v;
        ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i9);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float measuredWidth = getMeasuredWidth() / 7.0f;
        SparseArray sparseArray2 = this.f37441w;
        f8 f8Var = (f8) sparseArray2.get(i9);
        float f15 = 0.0f;
        if (f8Var != null) {
            float f16 = f8Var.f38152a;
            f11 = f8Var.f38153b;
            f12 = f8Var.f38154c;
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
        obj.f38152a = f10;
        obj.f38153b = f11;
        sparseArray2.put(i9, obj);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.xs.f34754e);
            final float f17 = f11;
            final float f18 = f15;
            final float f19 = f10;
            final float f20 = f13;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    d8 d8Var = d8.this;
                    d8Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f21 = f20;
                    float f22 = f19;
                    float z12 = e2.c.z(f21, f22, floatValue, f22);
                    f8 f8Var2 = obj;
                    f8Var2.f38152a = z12;
                    float f23 = f14;
                    float f24 = f17;
                    f8Var2.f38153b = e2.c.z(f23, f24, floatValue, f24);
                    float f25 = f18;
                    float f26 = f12;
                    f8Var2.f38154c = e2.c.z(f25, f26, floatValue, f26);
                    d8Var.invalidate();
                }
            });
            duration.addListener(new c8(this, obj, f20, f14, f18, i9, z10));
            duration.start();
            sparseArray.put(i9, duration);
            return;
        }
        obj.f38152a = f13;
        obj.f38153b = f14;
        obj.f38154c = f15;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f37439r != null) {
            for (int i9 = 0; i9 < this.f37439r.size(); i9++) {
                ((ImageReceiver) this.f37439r.valueAt(i9)).onAttachedToWindow();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37439r != null) {
            for (int i9 = 0; i9 < this.f37439r.size(); i9++) {
                ((ImageReceiver) this.f37439r.valueAt(i9)).onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f37437f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f37440s.f17378b).onTouchEvent(motionEvent);
    }
}
