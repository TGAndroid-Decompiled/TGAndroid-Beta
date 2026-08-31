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
    public final org.telegram.ui.ActionBar.l5 f37110a;
    public int f37111b;
    public int f37112c;
    public int d;
    public int f37113e;
    public int f37114f;
    public int h;
    public SparseArray f37115n;
    public SparseArray f37116r;
    public final org.telegram.ui.Cells.f1 f37117s;
    public final SparseArray v;
    public final SparseArray f37118w;
    public final j8 f37119x;

    public g8(j8 j8Var, Context context) {
        super(context);
        this.f37119x = j8Var;
        this.f37115n = new SparseArray();
        this.f37116r = new SparseArray();
        this.v = new SparseArray();
        this.f37118w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f37110a = l5Var;
        if (j8Var.f38036b0 == 0 && j8Var.f38034a0) {
            l5Var.setOnLongClickListener(new w(this, 1));
            l5Var.setOnClickListener(new a8(this, 0));
        }
        l5Var.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21750i6, false), 2, -1));
        l5Var.setTextSize(15);
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setGravity(17);
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        addView(l5Var, k7.c6.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        org.telegram.ui.Cells.f1 f1Var = new org.telegram.ui.Cells.f1(context, new e8(this, context));
        this.f37117s = f1Var;
        ((GestureDetector) f1Var.f22788b).setIsLongpressEnabled(j8Var.f38036b0 == 0);
    }

    public static void a(g8 g8Var, int i10, int i11) {
        float f10;
        if (g8Var.f37115n != null) {
            for (int i12 = 0; i12 < g8Var.d; i12++) {
                h8 h8Var = (h8) g8Var.f37115n.get(i12, null);
                if (h8Var != null) {
                    h8Var.f37361m = h8Var.f37360l;
                    int i13 = h8Var.h;
                    if (i13 >= i10 && i13 <= i11) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    h8Var.f37362n = f10;
                    h8Var.f37358j = h8Var.f37357i;
                    if (i13 != i10 && i13 != i11) {
                        h8Var.f37359k = 0.0f;
                    } else {
                        h8Var.f37359k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(g8 g8Var, float f10) {
        if (g8Var.f37115n != null) {
            for (int i10 = 0; i10 < g8Var.d; i10++) {
                h8 h8Var = (h8) g8Var.f37115n.get(i10, null);
                if (h8Var != null) {
                    float f11 = h8Var.f37361m;
                    h8Var.f37360l = e2.c.w(h8Var.f37362n, f11, f10, f11);
                    float f12 = h8Var.f37358j;
                    h8Var.f37357i = e2.c.w(h8Var.f37359k, f12, f10, f12);
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
        SparseArray sparseArray2 = this.f37118w;
        i8 i8Var = (i8) sparseArray2.get(i10);
        float f15 = 0.0f;
        if (i8Var != null) {
            float f16 = i8Var.f37769a;
            f11 = i8Var.f37770b;
            f12 = i8Var.f37771c;
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
        obj.f37769a = f10;
        obj.f37770b = f11;
        sparseArray2.put(i10, obj);
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.jt.f28199e);
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
                    i8Var2.f37769a = w10;
                    float f23 = f14;
                    float f24 = f17;
                    i8Var2.f37770b = e2.c.w(f23, f24, floatValue, f24);
                    float f25 = f18;
                    float f26 = f12;
                    i8Var2.f37771c = e2.c.w(f25, f26, floatValue, f26);
                    g8Var.invalidate();
                }
            });
            duration.addListener(new f8(this, obj, f20, f14, f18, i10, z4));
            duration.start();
            sparseArray.put(i10, duration);
            return;
        }
        obj.f37769a = f13;
        obj.f37770b = f14;
        obj.f37771c = f15;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f37116r != null) {
            for (int i10 = 0; i10 < this.f37116r.size(); i10++) {
                ((ImageReceiver) this.f37116r.valueAt(i10)).onAttachedToWindow();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37116r != null) {
            for (int i10 = 0; i10 < this.f37116r.size(); i10++) {
                ((ImageReceiver) this.f37116r.valueAt(i10)).onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f37114f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f37117s.f22788b).onTouchEvent(motionEvent);
    }
}
