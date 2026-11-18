package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class f8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.n5 f47556a;
    public int f47557b;
    public int f47558c;
    public int d;
    public int f47559e;
    public int f47560f;
    public int h;
    public SparseArray f47561n;
    public SparseArray f47562r;
    public final org.telegram.ui.Components.hn f47563s;
    public final SparseArray f47564w;
    public final SparseArray f47565x;
    public final i8 f47566y;

    public f8(i8 i8Var, Context context) {
        super(context);
        this.f47566y = i8Var;
        this.f47561n = new SparseArray();
        this.f47562r = new SparseArray();
        this.f47564w = new SparseArray();
        this.f47565x = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f47556a = n5Var;
        if (i8Var.f48587f0 == 0 && i8Var.f48585e0) {
            n5Var.setOnLongClickListener(new t(this, 1));
            n5Var.setOnClickListener(new a8(this, 0));
        }
        int i7 = org.telegram.ui.ActionBar.n6.f29486i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i7, false), 2, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        n5Var.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(n5Var, h02, null, M, null);
        n5Var.setTextSize(15);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setGravity(17);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, null);
        addView(n5Var, c8.ma.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        org.telegram.ui.Components.hn hnVar = new org.telegram.ui.Components.hn(context, new d8(this, context));
        this.f47563s = hnVar;
        ((GestureDetector) hnVar.f35933b).setIsLongpressEnabled(i8Var.f48587f0 == 0);
    }

    public static void a(f8 f8Var, int i7, int i10) {
        float f10;
        if (f8Var.f47561n != null) {
            for (int i11 = 0; i11 < f8Var.d; i11++) {
                g8 g8Var = (g8) f8Var.f47561n.get(i11, null);
                if (g8Var != null) {
                    g8Var.f47931m = g8Var.f47930l;
                    int i12 = g8Var.h;
                    if (i12 >= i7 && i12 <= i10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    g8Var.f47932n = f10;
                    g8Var.f47928j = g8Var.f47927i;
                    if (i12 != i7 && i12 != i10) {
                        g8Var.f47929k = 0.0f;
                    } else {
                        g8Var.f47929k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(f8 f8Var, float f10) {
        if (f8Var.f47561n != null) {
            for (int i7 = 0; i7 < f8Var.d; i7++) {
                g8 g8Var = (g8) f8Var.f47561n.get(i7, null);
                if (g8Var != null) {
                    float f11 = g8Var.f47931m;
                    g8Var.f47930l = com.google.android.gms.internal.vision.e2.z(g8Var.f47932n, f11, f10, f11);
                    float f12 = g8Var.f47928j;
                    g8Var.f47927i = com.google.android.gms.internal.vision.e2.z(g8Var.f47929k, f12, f10, f12);
                }
            }
        }
        f8Var.invalidate();
    }

    public final void c(int i7, int i10, int i11, boolean z10, boolean z11) {
        float f10;
        float f11;
        final float f12;
        float f13;
        final float f14;
        SparseArray sparseArray = this.f47564w;
        ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i7);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float measuredWidth = getMeasuredWidth() / 7.0f;
        SparseArray sparseArray2 = this.f47565x;
        h8 h8Var = (h8) sparseArray2.get(i7);
        float f15 = 0.0f;
        if (h8Var != null) {
            float f16 = h8Var.f48213a;
            f11 = h8Var.f48214b;
            f12 = h8Var.f48215c;
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
        obj.f48213a = f10;
        obj.f48214b = f11;
        sparseArray2.put(i7, obj);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.xs.f42178e);
            final float f17 = f11;
            final float f18 = f15;
            final float f19 = f10;
            final float f20 = f13;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    f8 f8Var = f8.this;
                    f8Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f21 = f20;
                    float f22 = f19;
                    float z12 = com.google.android.gms.internal.vision.e2.z(f21, f22, floatValue, f22);
                    h8 h8Var2 = obj;
                    h8Var2.f48213a = z12;
                    float f23 = f14;
                    float f24 = f17;
                    h8Var2.f48214b = com.google.android.gms.internal.vision.e2.z(f23, f24, floatValue, f24);
                    float f25 = f18;
                    float f26 = f12;
                    h8Var2.f48215c = com.google.android.gms.internal.vision.e2.z(f25, f26, floatValue, f26);
                    f8Var.invalidate();
                }
            });
            duration.addListener(new e8(this, obj, f20, f14, f18, i7, z10));
            duration.start();
            sparseArray.put(i7, duration);
            return;
        }
        obj.f48213a = f13;
        obj.f48214b = f14;
        obj.f48215c = f15;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f47562r != null) {
            for (int i7 = 0; i7 < this.f47562r.size(); i7++) {
                ((ImageReceiver) this.f47562r.valueAt(i7)).P();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f47562r != null) {
            for (int i7 = 0; i7 < this.f47562r.size(); i7++) {
                ((ImageReceiver) this.f47562r.valueAt(i7)).R();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((this.f47560f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f47563s.f35933b).onTouchEvent(motionEvent);
    }
}
