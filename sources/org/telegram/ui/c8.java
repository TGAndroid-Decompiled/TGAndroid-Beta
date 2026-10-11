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
    public final org.telegram.ui.ActionBar.h5 f36617a;
    public int f36618b;
    public int f36619c;
    public int d;
    public int f36620e;
    public int f36621f;
    public int h;
    public SparseArray f36622n;
    public SparseArray f36623r;
    public final m.f3 f36624s;
    public final SparseArray v;
    public final SparseArray f36625w;
    public final f8 f36626x;

    public c8(f8 f8Var, Context context) {
        super(context);
        this.f36626x = f8Var;
        this.f36622n = new SparseArray();
        this.f36623r = new SparseArray();
        this.v = new SparseArray();
        this.f36625w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f36617a = h5Var;
        if (f8Var.f37583e0 == 0 && f8Var.f37581d0) {
            h5Var.setOnLongClickListener(new u(this, 1));
            h5Var.setOnClickListener(new w7(this, 0));
        }
        h5Var.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20877i6, false), 2, -1));
        h5Var.setTextSize(15);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setGravity(17);
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        addView(h5Var, w7.x5.a(28.0f, 0.0f, 12.0f, 0.0f, 4.0f, -1, 0));
        m.f3 f3Var = new m.f3(context, new a8(this, context));
        this.f36624s = f3Var;
        ((GestureDetector) f3Var.f15693b).setIsLongpressEnabled(f8Var.f37583e0 == 0);
    }

    public static void a(c8 c8Var, int i10, int i11) {
        float f7;
        if (c8Var.f36622n != null) {
            for (int i12 = 0; i12 < c8Var.d; i12++) {
                d8 d8Var = (d8) c8Var.f36622n.get(i12, null);
                if (d8Var != null) {
                    d8Var.f36945m = d8Var.f36944l;
                    int i13 = d8Var.h;
                    if (i13 >= i10 && i13 <= i11) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    d8Var.f36946n = f7;
                    d8Var.f36942j = d8Var.f36941i;
                    if (i13 != i10 && i13 != i11) {
                        d8Var.f36943k = 0.0f;
                    } else {
                        d8Var.f36943k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(c8 c8Var, float f7) {
        if (c8Var.f36622n != null) {
            for (int i10 = 0; i10 < c8Var.d; i10++) {
                d8 d8Var = (d8) c8Var.f36622n.get(i10, null);
                if (d8Var != null) {
                    float f10 = d8Var.f36945m;
                    d8Var.f36944l = com.google.android.gms.internal.vision.e2.y(d8Var.f36946n, f10, f7, f10);
                    float f11 = d8Var.f36942j;
                    d8Var.f36941i = com.google.android.gms.internal.vision.e2.y(d8Var.f36943k, f11, f7, f11);
                }
            }
        }
        c8Var.invalidate();
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
        SparseArray sparseArray2 = this.f36625w;
        e8 e8Var = (e8) sparseArray2.get(i10);
        float f14 = 0.0f;
        if (e8Var != null) {
            float f15 = e8Var.f37230a;
            f10 = e8Var.f37231b;
            f11 = e8Var.f37232c;
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
        obj.f37230a = f7;
        obj.f37231b = f10;
        sparseArray2.put(i10, obj);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.bu.f25024e);
            final float f16 = f10;
            final float f17 = f14;
            final float f18 = f7;
            final float f19 = f12;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    c8 c8Var = c8.this;
                    c8Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f20 = f19;
                    float f21 = f18;
                    float y3 = com.google.android.gms.internal.vision.e2.y(f20, f21, floatValue, f21);
                    e8 e8Var2 = obj;
                    e8Var2.f37230a = y3;
                    float f22 = f13;
                    float f23 = f16;
                    e8Var2.f37231b = com.google.android.gms.internal.vision.e2.y(f22, f23, floatValue, f23);
                    float f24 = f17;
                    float f25 = f11;
                    e8Var2.f37232c = com.google.android.gms.internal.vision.e2.y(f24, f25, floatValue, f25);
                    c8Var.invalidate();
                }
            });
            duration.addListener(new b8(this, obj, f19, f13, f17, i10, z10));
            duration.start();
            sparseArray.put(i10, duration);
            return;
        }
        obj.f37230a = f12;
        obj.f37231b = f13;
        obj.f37232c = f14;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f36623r != null) {
            for (int i10 = 0; i10 < this.f36623r.size(); i10++) {
                ((ImageReceiver) this.f36623r.valueAt(i10)).onAttachedToWindow();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f36623r != null) {
            for (int i10 = 0; i10 < this.f36623r.size(); i10++) {
                ((ImageReceiver) this.f36623r.valueAt(i10)).onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f36621f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f36624s.f15693b).onTouchEvent(motionEvent);
    }
}
