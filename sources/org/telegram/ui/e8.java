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
public final class e8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.j5 f35963a;
    public int f35964b;
    public int f35965c;
    public int d;
    public int f35966e;
    public int f35967f;
    public int h;
    public SparseArray f35968n;
    public SparseArray f35969r;
    public final l.d f35970s;
    public final SparseArray v;
    public final SparseArray f35971w;
    public final h8 f35972x;

    public e8(h8 h8Var, Context context) {
        super(context);
        this.f35972x = h8Var;
        this.f35968n = new SparseArray();
        this.f35969r = new SparseArray();
        this.v = new SparseArray();
        this.f35971w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f35963a = j5Var;
        if (h8Var.f36905e0 == 0 && h8Var.f36903d0) {
            j5Var.setOnLongClickListener(new u(this, 1));
            j5Var.setOnClickListener(new y7(this, 0));
        }
        j5Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20754i6, false), 2, -1));
        j5Var.setTextSize(15);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setGravity(17);
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        addView(j5Var, w7.x5.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        l.d dVar = new l.d(context, new c8(this, context));
        this.f35970s = dVar;
        ((GestureDetector) dVar.f15072b).setIsLongpressEnabled(h8Var.f36905e0 == 0);
    }

    public static void a(e8 e8Var, int i10, int i11) {
        float f7;
        if (e8Var.f35968n != null) {
            for (int i12 = 0; i12 < e8Var.d; i12++) {
                f8 f8Var = (f8) e8Var.f35968n.get(i12, null);
                if (f8Var != null) {
                    f8Var.f36331m = f8Var.f36330l;
                    int i13 = f8Var.h;
                    if (i13 >= i10 && i13 <= i11) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    f8Var.f36332n = f7;
                    f8Var.f36328j = f8Var.f36327i;
                    if (i13 != i10 && i13 != i11) {
                        f8Var.f36329k = 0.0f;
                    } else {
                        f8Var.f36329k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(e8 e8Var, float f7) {
        if (e8Var.f35968n != null) {
            for (int i10 = 0; i10 < e8Var.d; i10++) {
                f8 f8Var = (f8) e8Var.f35968n.get(i10, null);
                if (f8Var != null) {
                    float f10 = f8Var.f36331m;
                    f8Var.f36330l = com.google.android.gms.internal.vision.e2.z(f8Var.f36332n, f10, f7, f10);
                    float f11 = f8Var.f36328j;
                    f8Var.f36327i = com.google.android.gms.internal.vision.e2.z(f8Var.f36329k, f11, f7, f11);
                }
            }
        }
        e8Var.invalidate();
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
        SparseArray sparseArray2 = this.f35971w;
        g8 g8Var = (g8) sparseArray2.get(i10);
        float f14 = 0.0f;
        if (g8Var != null) {
            float f15 = g8Var.f36593a;
            f10 = g8Var.f36594b;
            f11 = g8Var.f36595c;
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
        obj.f36593a = f7;
        obj.f36594b = f10;
        sparseArray2.put(i10, obj);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.jt.f27569e);
            final float f16 = f10;
            final float f17 = f14;
            final float f18 = f7;
            final float f19 = f12;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    e8 e8Var = e8.this;
                    e8Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f20 = f19;
                    float f21 = f18;
                    float z12 = com.google.android.gms.internal.vision.e2.z(f20, f21, floatValue, f21);
                    g8 g8Var2 = obj;
                    g8Var2.f36593a = z12;
                    float f22 = f13;
                    float f23 = f16;
                    g8Var2.f36594b = com.google.android.gms.internal.vision.e2.z(f22, f23, floatValue, f23);
                    float f24 = f17;
                    float f25 = f11;
                    g8Var2.f36595c = com.google.android.gms.internal.vision.e2.z(f24, f25, floatValue, f25);
                    e8Var.invalidate();
                }
            });
            duration.addListener(new d8(this, obj, f19, f13, f17, i10, z10));
            duration.start();
            sparseArray.put(i10, duration);
            return;
        }
        obj.f36593a = f12;
        obj.f36594b = f13;
        obj.f36595c = f14;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f35969r != null) {
            for (int i10 = 0; i10 < this.f35969r.size(); i10++) {
                ((ImageReceiver) this.f35969r.valueAt(i10)).onAttachedToWindow();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f35969r != null) {
            for (int i10 = 0; i10 < this.f35969r.size(); i10++) {
                ((ImageReceiver) this.f35969r.valueAt(i10)).onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f35967f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f35970s.f15072b).onTouchEvent(motionEvent);
    }
}
