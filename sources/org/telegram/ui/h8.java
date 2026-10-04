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
    public final org.telegram.ui.ActionBar.i5 f36988a;
    public int f36989b;
    public int f36990c;
    public int d;
    public int f36991e;
    public int f36992f;
    public int h;
    public SparseArray f36993n;
    public SparseArray f36994r;
    public final k2.e f36995s;
    public final SparseArray v;
    public final SparseArray f36996w;
    public final k8 f36997x;

    public h8(k8 k8Var, Context context) {
        super(context);
        this.f36997x = k8Var;
        this.f36993n = new SparseArray();
        this.f36994r = new SparseArray();
        this.v = new SparseArray();
        this.f36996w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f36988a = i5Var;
        if (k8Var.f37860e0 == 0 && k8Var.f37858d0) {
            i5Var.setOnLongClickListener(new v(this, 1));
            i5Var.setOnClickListener(new b8(this, 0));
        }
        i5Var.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20908i6, false), 2, -1));
        i5Var.setTextSize(15);
        i5Var.setTypeface(AndroidUtilities.bold());
        i5Var.setGravity(17);
        i5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        addView(i5Var, w7.z5.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        k2.e eVar = new k2.e(context, new f8(this, context));
        this.f36995s = eVar;
        ((GestureDetector) eVar.f14388b).setIsLongpressEnabled(k8Var.f37860e0 == 0);
    }

    public static void a(h8 h8Var, int i10, int i11) {
        float f7;
        if (h8Var.f36993n != null) {
            for (int i12 = 0; i12 < h8Var.d; i12++) {
                i8 i8Var = (i8) h8Var.f36993n.get(i12, null);
                if (i8Var != null) {
                    i8Var.f37306m = i8Var.f37305l;
                    int i13 = i8Var.h;
                    if (i13 >= i10 && i13 <= i11) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    i8Var.f37307n = f7;
                    i8Var.f37303j = i8Var.f37302i;
                    if (i13 != i10 && i13 != i11) {
                        i8Var.f37304k = 0.0f;
                    } else {
                        i8Var.f37304k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(h8 h8Var, float f7) {
        if (h8Var.f36993n != null) {
            for (int i10 = 0; i10 < h8Var.d; i10++) {
                i8 i8Var = (i8) h8Var.f36993n.get(i10, null);
                if (i8Var != null) {
                    float f10 = i8Var.f37306m;
                    i8Var.f37305l = com.google.android.gms.internal.vision.e2.z(i8Var.f37307n, f10, f7, f10);
                    float f11 = i8Var.f37303j;
                    i8Var.f37302i = com.google.android.gms.internal.vision.e2.z(i8Var.f37304k, f11, f7, f11);
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
        SparseArray sparseArray2 = this.f36996w;
        j8 j8Var = (j8) sparseArray2.get(i10);
        float f14 = 0.0f;
        if (j8Var != null) {
            float f15 = j8Var.f37592a;
            f10 = j8Var.f37593b;
            f11 = j8Var.f37594c;
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
        obj.f37592a = f7;
        obj.f37593b = f10;
        sparseArray2.put(i10, obj);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.nt.f29061e);
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
                    float z12 = com.google.android.gms.internal.vision.e2.z(f20, f21, floatValue, f21);
                    j8 j8Var2 = obj;
                    j8Var2.f37592a = z12;
                    float f22 = f13;
                    float f23 = f16;
                    j8Var2.f37593b = com.google.android.gms.internal.vision.e2.z(f22, f23, floatValue, f23);
                    float f24 = f17;
                    float f25 = f11;
                    j8Var2.f37594c = com.google.android.gms.internal.vision.e2.z(f24, f25, floatValue, f25);
                    h8Var.invalidate();
                }
            });
            duration.addListener(new g8(this, obj, f19, f13, f17, i10, z10));
            duration.start();
            sparseArray.put(i10, duration);
            return;
        }
        obj.f37592a = f12;
        obj.f37593b = f13;
        obj.f37594c = f14;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f36994r != null) {
            for (int i10 = 0; i10 < this.f36994r.size(); i10++) {
                ((ImageReceiver) this.f36994r.valueAt(i10)).onAttachedToWindow();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f36994r != null) {
            for (int i10 = 0; i10 < this.f36994r.size(); i10++) {
                ((ImageReceiver) this.f36994r.valueAt(i10)).onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f36992f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f36995s.f14388b).onTouchEvent(motionEvent);
    }
}
