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
public final class h8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.j5 f37533a;
    public int f37534b;
    public int f37535c;
    public int d;
    public int e;
    public int f37536f;
    public int h;
    public SparseArray f37537n;
    public SparseArray f37538r;
    public final le.b f37539s;
    public final SparseArray v;
    public final SparseArray f37540w;
    public final k8 f37541x;

    public h8(k8 k8Var, Context context) {
        super(context);
        this.f37541x = k8Var;
        this.f37537n = new SparseArray();
        this.f37538r = new SparseArray();
        this.v = new SparseArray();
        this.f37540w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f37533a = j5Var;
        if (k8Var.f38450e0 == 0 && k8Var.f38449d0) {
            j5Var.setOnLongClickListener(new u(this, 1));
            j5Var.setOnClickListener(new b8(this, 0));
        }
        j5Var.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21082i6, false), 2, -1));
        j5Var.setTextSize(15);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setGravity(17);
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        addView(j5Var, w7.z5.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        le.b bVar = new le.b(context, new f8(this, context));
        this.f37539s = bVar;
        ((GestureDetector) bVar.f16009b).setIsLongpressEnabled(k8Var.f38450e0 == 0);
    }

    public static void a(h8 h8Var, int i10, int i11) {
        float f7;
        if (h8Var.f37537n != null) {
            for (int i12 = 0; i12 < h8Var.d; i12++) {
                i8 i8Var = (i8) h8Var.f37537n.get(i12, null);
                if (i8Var != null) {
                    i8Var.f37886m = i8Var.f37885l;
                    int i13 = i8Var.h;
                    if (i13 >= i10 && i13 <= i11) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    i8Var.f37887n = f7;
                    i8Var.f37883j = i8Var.f37882i;
                    if (i13 != i10 && i13 != i11) {
                        i8Var.f37884k = 0.0f;
                    } else {
                        i8Var.f37884k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(h8 h8Var, float f7) {
        if (h8Var.f37537n != null) {
            for (int i10 = 0; i10 < h8Var.d; i10++) {
                i8 i8Var = (i8) h8Var.f37537n.get(i10, null);
                if (i8Var != null) {
                    float f10 = i8Var.f37886m;
                    i8Var.f37885l = com.google.android.gms.internal.play_billing.k3.y(i8Var.f37887n, f10, f7, f10);
                    float f11 = i8Var.f37883j;
                    i8Var.f37882i = com.google.android.gms.internal.play_billing.k3.y(i8Var.f37884k, f11, f7, f11);
                }
            }
        }
        h8Var.invalidate();
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
        SparseArray sparseArray2 = this.f37540w;
        j8 j8Var = (j8) sparseArray2.get(i10);
        float f14 = 0.0f;
        if (j8Var != null) {
            float f15 = j8Var.f38202a;
            f10 = j8Var.f38203b;
            f11 = j8Var.f38204c;
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
        obj.f38202a = f7;
        obj.f38203b = f10;
        sparseArray2.put(i10, obj);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.st.e);
            final float f16 = f10;
            final float f17 = f14;
            final float f18 = f7;
            final float f19 = f12;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    h8 h8Var = h8.this;
                    h8Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f20 = f19;
                    float f21 = f18;
                    float y3 = com.google.android.gms.internal.play_billing.k3.y(f20, f21, floatValue, f21);
                    j8 j8Var2 = obj;
                    j8Var2.f38202a = y3;
                    float f22 = f13;
                    float f23 = f16;
                    j8Var2.f38203b = com.google.android.gms.internal.play_billing.k3.y(f22, f23, floatValue, f23);
                    float f24 = f17;
                    float f25 = f11;
                    j8Var2.f38204c = com.google.android.gms.internal.play_billing.k3.y(f24, f25, floatValue, f25);
                    h8Var.invalidate();
                }
            });
            duration.addListener(new g8(this, obj, f19, f13, f17, i10, z10));
            duration.start();
            sparseArray.put(i10, duration);
            return;
        }
        obj.f38202a = f12;
        obj.f38203b = f13;
        obj.f38204c = f14;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f37538r != null) {
            for (int i10 = 0; i10 < this.f37538r.size(); i10++) {
                ((ImageReceiver) this.f37538r.valueAt(i10)).onAttachedToWindow();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37538r != null) {
            for (int i10 = 0; i10 < this.f37538r.size(); i10++) {
                ((ImageReceiver) this.f37538r.valueAt(i10)).onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f37536f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f37539s.f16009b).onTouchEvent(motionEvent);
    }
}
