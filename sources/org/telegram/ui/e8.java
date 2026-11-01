package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class e8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.u5 f36766a;
    public int f36767b;
    public int f36768c;
    public int d;
    public int e;
    public int f36769f;
    public int h;
    public SparseArray f36770n;
    public SparseArray f36771r;
    public final m2.t f36772s;
    public final SparseArray f36773w;
    public final SparseArray f36774x;
    public final h8 f36775y;

    public e8(h8 h8Var, Context context) {
        super(context);
        this.f36775y = h8Var;
        this.f36770n = new SparseArray();
        this.f36771r = new SparseArray();
        this.f36773w = new SparseArray();
        this.f36774x = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f36766a = u5Var;
        if (h8Var.f37730e0 == 0 && h8Var.f37729d0) {
            u5Var.setOnLongClickListener(new s(this, 1));
            u5Var.setOnClickListener(new z7(this, 0));
        }
        int i10 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i10, false), 2, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        u5Var.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(u5Var, h02, null, N, null);
        u5Var.setTextSize(15);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setGravity(17);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, null);
        addView(u5Var, w7.b6.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        m2.t tVar = new m2.t(context, new c8(this, context));
        this.f36772s = tVar;
        ((GestureDetector) tVar.f12685b).setIsLongpressEnabled(h8Var.f37730e0 == 0);
    }

    public static void a(e8 e8Var, int i10, int i11) {
        float f7;
        if (e8Var.f36770n != null) {
            for (int i12 = 0; i12 < e8Var.d; i12++) {
                f8 f8Var = (f8) e8Var.f36770n.get(i12, null);
                if (f8Var != null) {
                    f8Var.f37044m = f8Var.f37043l;
                    int i13 = f8Var.h;
                    if (i13 >= i10 && i13 <= i11) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    f8Var.f37045n = f7;
                    f8Var.f37041j = f8Var.f37040i;
                    if (i13 != i10 && i13 != i11) {
                        f8Var.f37042k = 0.0f;
                    } else {
                        f8Var.f37042k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(e8 e8Var, float f7) {
        if (e8Var.f36770n != null) {
            for (int i10 = 0; i10 < e8Var.d; i10++) {
                f8 f8Var = (f8) e8Var.f36770n.get(i10, null);
                if (f8Var != null) {
                    float f10 = f8Var.f37044m;
                    f8Var.f37043l = c3.i0.z(f8Var.f37045n, f10, f7, f10);
                    float f11 = f8Var.f37041j;
                    f8Var.f37040i = c3.i0.z(f8Var.f37042k, f11, f7, f11);
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
        SparseArray sparseArray = this.f36773w;
        ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i10);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float measuredWidth = getMeasuredWidth() / 7.0f;
        SparseArray sparseArray2 = this.f36774x;
        g8 g8Var = (g8) sparseArray2.get(i10);
        float f14 = 0.0f;
        if (g8Var != null) {
            float f15 = g8Var.f37373a;
            f10 = g8Var.f37374b;
            f11 = g8Var.f37375c;
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
        obj.f37373a = f7;
        obj.f37374b = f10;
        sparseArray2.put(i10, obj);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.vs.e);
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
                    float z12 = c3.i0.z(f20, f21, floatValue, f21);
                    g8 g8Var2 = obj;
                    g8Var2.f37373a = z12;
                    float f22 = f13;
                    float f23 = f16;
                    g8Var2.f37374b = c3.i0.z(f22, f23, floatValue, f23);
                    float f24 = f17;
                    float f25 = f11;
                    g8Var2.f37375c = c3.i0.z(f24, f25, floatValue, f25);
                    e8Var.invalidate();
                }
            });
            duration.addListener(new d8(this, obj, f19, f13, f17, i10, z10));
            duration.start();
            sparseArray.put(i10, duration);
            return;
        }
        obj.f37373a = f12;
        obj.f37374b = f13;
        obj.f37375c = f14;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f36771r != null) {
            for (int i10 = 0; i10 < this.f36771r.size(); i10++) {
                ((ImageReceiver) this.f36771r.valueAt(i10)).P();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f36771r != null) {
            for (int i10 = 0; i10 < this.f36771r.size(); i10++) {
                ((ImageReceiver) this.f36771r.valueAt(i10)).R();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L((this.f36769f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f36772s.f12685b).onTouchEvent(motionEvent);
    }
}
