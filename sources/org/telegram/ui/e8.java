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
    public final org.telegram.ui.ActionBar.l5 f32109a;
    public int f32110b;
    public int f32111c;
    public int d;
    public int e;
    public int f32112f;
    public int h;
    public SparseArray f32113n;
    public SparseArray f32114r;
    public final l2.h f32115s;
    public final SparseArray v;
    public final SparseArray f32116w;
    public final h8 f32117x;

    public e8(h8 h8Var, Context context) {
        super(context);
        this.f32117x = h8Var;
        this.f32113n = new SparseArray();
        this.f32114r = new SparseArray();
        this.v = new SparseArray();
        this.f32116w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f32109a = l5Var;
        if (h8Var.f33307e0 == 0 && h8Var.f33306d0) {
            l5Var.setOnLongClickListener(new v(this, 1));
            l5Var.setOnClickListener(new y7(this, 0));
        }
        l5Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 2, -1));
        l5Var.setTextSize(15);
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setGravity(17);
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        addView(l5Var, w7.a6.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        l2.h hVar = new l2.h(context, new c8(this, context));
        this.f32115s = hVar;
        ((GestureDetector) hVar.f12721b).setIsLongpressEnabled(h8Var.f33307e0 == 0);
    }

    public static void a(e8 e8Var, int i10, int i11) {
        float f7;
        if (e8Var.f32113n != null) {
            for (int i12 = 0; i12 < e8Var.d; i12++) {
                f8 f8Var = (f8) e8Var.f32113n.get(i12, null);
                if (f8Var != null) {
                    f8Var.f32712m = f8Var.f32711l;
                    int i13 = f8Var.h;
                    if (i13 >= i10 && i13 <= i11) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    f8Var.f32713n = f7;
                    f8Var.f32709j = f8Var.f32708i;
                    if (i13 != i10 && i13 != i11) {
                        f8Var.f32710k = 0.0f;
                    } else {
                        f8Var.f32710k = 1.0f;
                    }
                }
            }
        }
    }

    public static void b(e8 e8Var, float f7) {
        if (e8Var.f32113n != null) {
            for (int i10 = 0; i10 < e8Var.d; i10++) {
                f8 f8Var = (f8) e8Var.f32113n.get(i10, null);
                if (f8Var != null) {
                    float f10 = f8Var.f32712m;
                    f8Var.f32711l = com.google.android.gms.internal.vision.e2.z(f8Var.f32713n, f10, f7, f10);
                    float f11 = f8Var.f32709j;
                    f8Var.f32708i = com.google.android.gms.internal.vision.e2.z(f8Var.f32710k, f11, f7, f11);
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
        SparseArray sparseArray2 = this.f32116w;
        g8 g8Var = (g8) sparseArray2.get(i10);
        float f14 = 0.0f;
        if (g8Var != null) {
            float f15 = g8Var.f33035a;
            f10 = g8Var.f33036b;
            f11 = g8Var.f33037c;
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
        obj.f33035a = f7;
        obj.f33036b = f10;
        sparseArray2.put(i10, obj);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(org.telegram.ui.Components.pt.e);
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
                    g8Var2.f33035a = z12;
                    float f22 = f13;
                    float f23 = f16;
                    g8Var2.f33036b = com.google.android.gms.internal.vision.e2.z(f22, f23, floatValue, f23);
                    float f24 = f17;
                    float f25 = f11;
                    g8Var2.f33037c = com.google.android.gms.internal.vision.e2.z(f24, f25, floatValue, f25);
                    e8Var.invalidate();
                }
            });
            duration.addListener(new d8(this, obj, f19, f13, f17, i10, z10));
            duration.start();
            sparseArray.put(i10, duration);
            return;
        }
        obj.f33035a = f12;
        obj.f33036b = f13;
        obj.f33037c = f14;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f32114r != null) {
            for (int i10 = 0; i10 < this.f32114r.size(); i10++) {
                ((ImageReceiver) this.f32114r.valueAt(i10)).onAttachedToWindow();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f32114r != null) {
            for (int i10 = 0; i10 < this.f32114r.size(); i10++) {
                ((ImageReceiver) this.f32114r.valueAt(i10)).onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f32112f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.f32115s.f12721b).onTouchEvent(motionEvent);
    }
}
