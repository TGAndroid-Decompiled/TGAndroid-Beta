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
    public final org.telegram.ui.ActionBar.j5 f36925a;
    public int f36926b;
    public int f36927c;
    public int d;
    public int f36928e;
    public int f36929f;
    public int h;
    public SparseArray f36930n;
    public SparseArray f36931r;
    public final m.f3 f36932s;
    public final SparseArray v;
    public final SparseArray f36933w;
    public final g8 f36934x;

    public d8(g8 g8Var, Context context) {
        super(context);
        this.f36934x = g8Var;
        this.f36930n = new SparseArray();
        this.f36931r = new SparseArray();
        this.v = new SparseArray();
        this.f36933w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f36925a = j5Var;
        if (g8Var.f37965e0 == 0 && g8Var.f37963d0) {
            j5Var.setOnLongClickListener(new v(this, 1));
            j5Var.setOnClickListener(new x7(this, 0));
        }
        j5Var.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20892i6, false), 2, -1));
        j5Var.setTextSize(15);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setGravity(17);
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
        addView(j5Var, w7.x5.a(28.0f, 0.0f, 12.0f, 0.0f, 4.0f, -1, 0));
        m.f3 f3Var = new m.f3(context, new b8(this, context));
        this.f36932s = f3Var;
        ((GestureDetector) f3Var.f15672b).setIsLongpressEnabled(g8Var.f37965e0 == 0);
    }

    public static void a(d8 d8Var, int i10, int i11) {
        float f7;
        if (d8Var.f36930n != null) {
            for (int i12 = 0; i12 < d8Var.d; i12++) {
                e8 e8Var = (e8) d8Var.f36930n.get(i12, null);
                if (e8Var != null) {
                    e8Var.f37235m = e8Var.f37234l;
                    int i13 = e8Var.h;
                    if (i13 >= i10 && i13 <= i11) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    e8Var.f37236n = f7;
                    e8Var.f37232j = e8Var.f37231i;
                    if (i13 != i10 && i13 != i11) {
                        e8Var.f37233k = 0.0f;
                    } else {
                        e8Var.f37233k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(d8 d8Var, float f7) {
        if (d8Var.f36930n != null) {
            for (int i10 = 0; i10 < d8Var.d; i10++) {
                e8 e8Var = (e8) d8Var.f36930n.get(i10, null);
                if (e8Var != null) {
                    float f10 = e8Var.f37235m;
                    e8Var.f37234l = com.google.android.gms.internal.vision.e2.y(e8Var.f37236n, f10, f7, f10);
                    float f11 = e8Var.f37232j;
                    e8Var.f37231i = com.google.android.gms.internal.vision.e2.y(e8Var.f37233k, f11, f7, f11);
                }
            }
        }
        d8Var.invalidate();
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
        SparseArray sparseArray2 = this.f36933w;
        f8 f8Var = (f8) sparseArray2.get(i10);
        float f14 = 0.0f;
        if (f8Var != null) {
            float f15 = f8Var.f37521a;
            f10 = f8Var.f37522b;
            f11 = f8Var.f37523c;
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
        obj.f37521a = f7;
        obj.f37522b = f10;
        sparseArray2.put(i10, obj);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.bu.f25059e);
            final float f16 = f10;
            final float f17 = f14;
            final float f18 = f7;
            final float f19 = f12;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    d8 d8Var = d8.this;
                    d8Var.getClass();
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f20 = f19;
                    float f21 = f18;
                    float y3 = com.google.android.gms.internal.vision.e2.y(f20, f21, floatValue, f21);
                    f8 f8Var2 = obj;
                    f8Var2.f37521a = y3;
                    float f22 = f13;
                    float f23 = f16;
                    f8Var2.f37522b = com.google.android.gms.internal.vision.e2.y(f22, f23, floatValue, f23);
                    float f24 = f17;
                    float f25 = f11;
                    f8Var2.f37523c = com.google.android.gms.internal.vision.e2.y(f24, f25, floatValue, f25);
                    d8Var.invalidate();
                }
            });
            duration.addListener(new c8(this, obj, f19, f13, f17, i10, z10));
            duration.start();
            sparseArray.put(i10, duration);
            return;
        }
        obj.f37521a = f12;
        obj.f37522b = f13;
        obj.f37523c = f14;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f36931r != null) {
            for (int i10 = 0; i10 < this.f36931r.size(); i10++) {
                ((ImageReceiver) this.f36931r.valueAt(i10)).onAttachedToWindow();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f36931r != null) {
            for (int i10 = 0; i10 < this.f36931r.size(); i10++) {
                ((ImageReceiver) this.f36931r.valueAt(i10)).onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f36929f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f36932s.f15672b).onTouchEvent(motionEvent);
    }
}
