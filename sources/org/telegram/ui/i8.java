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
    public final org.telegram.ui.ActionBar.h5 f37056a;
    public int f37057b;
    public int f37058c;
    public int d;
    public int e;
    public int f37059f;
    public int h;
    public SparseArray f37060n;
    public SparseArray f37061r;
    public final ji.d4 f37062s;
    public final SparseArray v;
    public final SparseArray f37063w;
    public final l8 f37064x;

    public i8(l8 l8Var, Context context) {
        super(context);
        this.f37064x = l8Var;
        this.f37060n = new SparseArray();
        this.f37061r = new SparseArray();
        this.v = new SparseArray();
        this.f37063w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f37056a = h5Var;
        if (l8Var.f37873e0 == 0 && l8Var.f37872d0) {
            h5Var.setOnLongClickListener(new u(this, 1));
            h5Var.setOnClickListener(new c8(this, 0));
        }
        h5Var.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19990i6, false), 2, -1));
        h5Var.setTextSize(15);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setGravity(17);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        addView(h5Var, w7.a6.a(28.0f, 0.0f, 12.0f, 0.0f, 4.0f, -1, 0));
        ji.d4 d4Var = new ji.d4(context, new g8(this, context));
        this.f37062s = d4Var;
        ((GestureDetector) d4Var.f13233b).setIsLongpressEnabled(l8Var.f37873e0 == 0);
    }

    public static void a(i8 i8Var, int i10, int i11) {
        float f7;
        if (i8Var.f37060n != null) {
            for (int i12 = 0; i12 < i8Var.d; i12++) {
                j8 j8Var = (j8) i8Var.f37060n.get(i12, null);
                if (j8Var != null) {
                    j8Var.f37311m = j8Var.f37310l;
                    int i13 = j8Var.h;
                    if (i13 >= i10 && i13 <= i11) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    j8Var.f37312n = f7;
                    j8Var.f37308j = j8Var.f37307i;
                    if (i13 != i10 && i13 != i11) {
                        j8Var.f37309k = 0.0f;
                    } else {
                        j8Var.f37309k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(i8 i8Var, float f7) {
        if (i8Var.f37060n != null) {
            for (int i10 = 0; i10 < i8Var.d; i10++) {
                j8 j8Var = (j8) i8Var.f37060n.get(i10, null);
                if (j8Var != null) {
                    float f10 = j8Var.f37311m;
                    j8Var.f37310l = com.google.android.gms.internal.play_billing.k3.y(j8Var.f37312n, f10, f7, f10);
                    float f11 = j8Var.f37308j;
                    j8Var.f37307i = com.google.android.gms.internal.play_billing.k3.y(j8Var.f37309k, f11, f7, f11);
                }
            }
        }
        i8Var.invalidate();
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
        SparseArray sparseArray2 = this.f37063w;
        k8 k8Var = (k8) sparseArray2.get(i10);
        float f14 = 0.0f;
        if (k8Var != null) {
            float f15 = k8Var.f37600a;
            f10 = k8Var.f37601b;
            f11 = k8Var.f37602c;
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
        obj.f37600a = f7;
        obj.f37601b = f10;
        sparseArray2.put(i10, obj);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.xt.e);
            final float f16 = f10;
            final float f17 = f14;
            final float f18 = f7;
            final float f19 = f12;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    i8 i8Var = i8.this;
                    i8Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f20 = f19;
                    float f21 = f18;
                    float y3 = com.google.android.gms.internal.play_billing.k3.y(f20, f21, floatValue, f21);
                    k8 k8Var2 = obj;
                    k8Var2.f37600a = y3;
                    float f22 = f13;
                    float f23 = f16;
                    k8Var2.f37601b = com.google.android.gms.internal.play_billing.k3.y(f22, f23, floatValue, f23);
                    float f24 = f17;
                    float f25 = f11;
                    k8Var2.f37602c = com.google.android.gms.internal.play_billing.k3.y(f24, f25, floatValue, f25);
                    i8Var.invalidate();
                }
            });
            duration.addListener(new h8(this, obj, f19, f13, f17, i10, z10));
            duration.start();
            sparseArray.put(i10, duration);
            return;
        }
        obj.f37600a = f12;
        obj.f37601b = f13;
        obj.f37602c = f14;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f37061r != null) {
            for (int i10 = 0; i10 < this.f37061r.size(); i10++) {
                ((ImageReceiver) this.f37061r.valueAt(i10)).onAttachedToWindow();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37061r != null) {
            for (int i10 = 0; i10 < this.f37061r.size(); i10++) {
                ((ImageReceiver) this.f37061r.valueAt(i10)).onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f37059f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f37062s.f13233b).onTouchEvent(motionEvent);
    }
}
