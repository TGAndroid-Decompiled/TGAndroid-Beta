package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class v61 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final int f38960s0 = 0;
    public u61 D;
    public final int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public float K;
    public int L;
    public int M;
    public int N;
    public final GradientDrawable O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public float W;
    public float f38961a;
    public final xq f38962a0;
    public org.telegram.messenger.w10 f38963b;
    public final SparseIntArray f38964b0;
    public final TextPaint f38965c;
    public final SparseIntArray f38966c0;
    public final TextPaint d;
    public final SparseIntArray f38967d0;
    public final TextPaint f38968e;
    public final SparseIntArray f38969e0;
    public final Paint f38970f;
    public float f38971f0;
    public int f38972g0;
    public final ArrayList h;
    public int f38973h0;
    public final et f38974i0;
    public final org.telegram.ui.ActionBar.g6 f38975j0;
    public ValueAnimator f38976k0;
    public org.telegram.messenger.w10 f38977l0;
    public boolean m0;
    public boolean f38978n;
    public v4.y f38979n0;
    public r61 f38980o0;
    public float f38981p0;
    public final Paint f38982q0;
    public int f38983r;
    public fh.g f38984r0;
    public boolean f38985s;
    public final bi.q1 f38986w;
    public final jg.i0 f38987x;
    public final org.telegram.ui.l4 f38988y;

    public v61(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        super(context);
        float f10;
        boolean z10;
        int i10;
        int i11;
        this.f38961a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f38965c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f38968e = textPaint3;
        this.f38970f = new Paint(1);
        this.h = new ArrayList();
        this.f38983r = 16;
        this.G = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = org.telegram.ui.ActionBar.l6.f28193ui;
        this.Q = org.telegram.ui.ActionBar.l6.f28173ti;
        this.R = org.telegram.ui.ActionBar.l6.f28154si;
        this.S = org.telegram.ui.ActionBar.l6.f28211vi;
        this.T = org.telegram.ui.ActionBar.l6.f28145s8;
        this.f38962a0 = xq.h;
        this.f38964b0 = new SparseIntArray(5);
        this.f38966c0 = new SparseIntArray(5);
        this.f38967d0 = new SparseIntArray(5);
        this.f38969e0 = new SparseIntArray(5);
        this.f38974i0 = new et(this, 17);
        this.f38982q0 = new Paint(1);
        this.f38975j0 = g6Var;
        this.E = i7;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        if (i7 != 9 && i7 != 10 && i7 != -2) {
            f10 = 15.0f;
        } else {
            f10 = 14.0f;
        }
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.O = gradientDrawable;
        gradientDrawable.setColor(org.telegram.ui.ActionBar.l6.w0(this.P, g6Var));
        if (i7 == -2) {
            float N = org.telegram.messenger.g0.N(13.0f);
            z10 = true;
            gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
            i10 = 3;
        } else {
            z10 = true;
            float N2 = org.telegram.messenger.g0.N(3.0f);
            i10 = 3;
            gradientDrawable.setCornerRadii(new float[]{N2, N2, N2, N2, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        bi.q1 q1Var = new bi.q1(29, context, this);
        this.f38986w = q1Var;
        q1Var.setOverScrollMode(2);
        if (z9) {
            q1Var.setItemAnimator(null);
        } else {
            ((v4.k) q1Var.getItemAnimator()).C = false;
        }
        if (i7 == -2) {
            q1Var.setSelectorType(9);
            q1Var.setSelectorRadius(6);
        } else {
            if (i7 == 10) {
                i11 = 9;
            } else {
                i11 = i7;
            }
            q1Var.setSelectorType(i11);
            if (i7 == i10) {
                q1Var.setSelectorRadius(0);
            } else {
                q1Var.setSelectorRadius(6);
            }
        }
        org.telegram.ui.ActionBar.s6.l(q1Var, 20, this.S, g6Var);
        jg.i0 i0Var = new jg.i0((ViewGroup) this, 8);
        this.f38987x = i0Var;
        q1Var.setLayoutManager(i0Var);
        q1Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        q1Var.setClipToPadding(false);
        q1Var.setDrawSelectorBehind(z10);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(7, this, context);
        this.f38988y = l4Var;
        l4Var.C(z9);
        q1Var.setAdapter(l4Var);
        q1Var.setOnItemClickListener(new p61(this));
        q1Var.setOnItemLongClickListener(new p61(this));
        q1Var.setOnScrollListener(new ui(this, 20));
        if (i7 != 9 && i7 != 10) {
            addView(q1Var, c8.ha.c(-1.0f, -1));
        } else {
            addView(q1Var, c8.ha.e(-2, -1, 1));
        }
    }

    public final void a(int i7, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.G == -1) {
            this.G = i7;
        }
        this.f38964b0.put(size, i7);
        this.f38966c0.put(i7, size);
        int i10 = this.G;
        if (i10 != -1 && i10 == i7) {
            this.F = size;
        }
        ?? obj = new Object();
        obj.f37938a = i7;
        obj.f37939b = charSequence;
        int i11 = this.H;
        this.H = org.telegram.messenger.k5.C(this.f38983r * 2, obj.a(this.f38965c), i11);
        arrayList.add(obj);
    }

    public final void b(boolean z9, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        this.V = z9;
        int i7 = 0;
        bi.q1 q1Var = this.f38986w;
        float f16 = 1.0f;
        if (z10) {
            while (i7 < q1Var.getChildCount()) {
                ViewPropertyAnimator animate = q1Var.getChildAt(i7).animate();
                if (z9) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f13);
                if (z9) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f14);
                if (z9) {
                    f15 = 0.0f;
                } else {
                    f15 = 1.0f;
                }
                scaleX.scaleY(f15).setInterpolator(xq.f40458f).setDuration(220L).start();
                i7++;
            }
        } else {
            while (i7 < q1Var.getChildCount()) {
                View childAt = q1Var.getChildAt(i7);
                if (z9) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                childAt.setScaleX(f10);
                if (z9) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                childAt.setScaleY(f11);
                if (z9) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                childAt.setAlpha(f12);
                i7++;
            }
            if (!z9) {
                f16 = 0.0f;
            }
            this.W = f16;
        }
        invalidate();
    }

    public final void c(int i7) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.N != i7 && i7 >= 0 && i7 < arrayList.size()) {
            this.N = i7;
            bi.q1 q1Var = this.f38986w;
            if (q1Var.getVisibility() != 8 && q1Var.getMeasuredWidth() != 0) {
                q1Var.y0(i7);
            } else {
                org.telegram.messenger.g0.i3(new r2(this, i7, 11), 100L);
            }
        }
    }

    public final void d(int i7, int i10) {
        boolean z9;
        int i11;
        int i12 = this.F;
        if (i12 < i10) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.N = -1;
        this.f38972g0 = i12;
        this.f38973h0 = this.G;
        this.F = i10;
        this.G = i7;
        ValueAnimator valueAnimator = this.f38976k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.J) {
            this.J = false;
        }
        this.f38971f0 = 0.0f;
        this.K = 0.0f;
        this.J = true;
        setEnabled(false);
        u61 u61Var = this.D;
        if (u61Var != null) {
            w61 w61Var = (w61) ((n) u61Var).f36185a;
            w61Var.D = z9;
            View[] viewArr = w61Var.f39950e;
            w61Var.d = i10;
            w61Var.K(1);
            w61Var.z(i10, z9);
            View view = viewArr[0];
            if (view != null) {
                i11 = view.getMeasuredWidth();
            } else {
                i11 = 0;
            }
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z9) {
                    w61Var.F(view2, i11);
                } else {
                    w61Var.F(view2, -i11);
                }
            }
        }
        c(this.F);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f38976k0 = ofFloat;
        ofFloat.addUpdateListener(new o61(this, 0));
        this.f38976k0.setDuration(250L);
        this.f38976k0.setInterpolator(xq.f40458f);
        this.f38976k0.addListener(new g11(this, 6));
        this.f38976k0.start();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v61.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public abstract void e(float f10, int i7, int i10);

    public final void f(float f10, int i7) {
        int i10 = this.f38966c0.get(i7, -1);
        if (i10 >= 0) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (f10 > 0.0f) {
                this.L = i10;
                this.M = i7;
            } else {
                this.L = -1;
                this.M = -1;
            }
            this.K = f10;
            this.f38986w.g1();
            invalidate();
            c(i10);
            if (f10 >= 1.0f) {
                this.L = -1;
                this.M = -1;
                this.F = i10;
                this.G = i7;
            }
        }
    }

    public final void g(int i7, int i10, int i11, int i12, int i13) {
        this.P = i7;
        this.Q = i10;
        this.R = i11;
        this.S = i12;
        this.T = i13;
        this.O.setColor(org.telegram.ui.ActionBar.l6.w0(i7, this.f38975j0));
    }

    public float getAnimatingIndicatorProgress() {
        return this.K;
    }

    public int getCurrentPosition() {
        return this.F;
    }

    public int getCurrentTabId() {
        return this.G;
    }

    public int getFirstTabId() {
        return this.f38964b0.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.f38972g0;
    }

    public Drawable getSelectorDrawable() {
        return this.O;
    }

    public qj0 getTabsContainer() {
        return this.f38986w;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int i13 = i11 - i7;
        if (this.U != i13) {
            this.U = i13;
            this.N = -1;
            if (this.J) {
                org.telegram.messenger.g0.r(this.f38974i0);
                this.J = false;
                setEnabled(true);
                u61 u61Var = this.D;
                if (u61Var != null) {
                    ((n) u61Var).y(1.0f);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(7.0f)) - org.telegram.messenger.g0.L(7.0f);
            int i13 = this.I;
            if (arrayList.size() != 1 && (i11 = this.E) != 9 && i11 != 10) {
                int i14 = this.H;
                if (i14 < size) {
                    i12 = (size - i14) / arrayList.size();
                } else {
                    i12 = 0;
                }
                this.I = i12;
            } else {
                this.I = 0;
            }
            if (i13 != this.I) {
                this.f38985s = true;
                this.f38988y.f();
                this.f38985s = false;
            }
            SparseIntArray sparseIntArray = this.f38969e0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.f38967d0;
            sparseIntArray2.clear();
            int L = org.telegram.messenger.g0.L(7.0f);
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                int a10 = ((s61) arrayList.get(i15)).a(this.f38965c);
                sparseIntArray2.put(i15, a10);
                sparseIntArray.put(i15, (this.I / 2) + L);
                L += org.telegram.messenger.g0.L(this.f38983r * 2) + a10 + this.I;
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f38985s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.K = f10;
        this.f38986w.g1();
        invalidate();
        u61 u61Var = this.D;
        if (u61Var != null) {
            ((n) u61Var).y(f10);
        }
    }

    public void setBlurredBackground(fh.g gVar) {
        this.f38984r0 = gVar;
        setBackground(gVar);
    }

    public void setDelegate(u61 u61Var) {
        this.D = u61Var;
    }

    public void setIsEditing(boolean z9) {
        this.f38978n = z9;
        this.f38986w.g1();
        invalidate();
    }

    public void setOnTabLongClick(org.telegram.messenger.w10 w10Var) {
        this.f38963b = w10Var;
    }

    public void setPreTabClick(org.telegram.messenger.w10 w10Var) {
        this.f38977l0 = w10Var;
    }

    public void setReordering(boolean z9) {
        bi.q1 q1Var;
        if (this.m0 == z9) {
            return;
        }
        this.m0 = z9;
        if (z9 && this.f38979n0 == null) {
            this.f38979n0 = new v4.y(new ei.d(this, 8));
        }
        if (this.m0 && this.f38980o0 == null) {
            r61 r61Var = new r61(this);
            this.f38980o0 = r61Var;
            r61Var.f57083m = false;
            r61Var.C = false;
            r61Var.o(xq.h);
            this.f38980o0.n(350L);
        }
        v4.y yVar = this.f38979n0;
        r61 r61Var2 = null;
        bi.q1 q1Var2 = this.f38986w;
        if (yVar != null) {
            if (z9) {
                q1Var = q1Var2;
            } else {
                q1Var = null;
            }
            yVar.h(q1Var);
        }
        if (z9) {
            r61Var2 = this.f38980o0;
        }
        q1Var2.setItemAnimator(r61Var2);
        org.telegram.messenger.g0.d0(q1Var2, new bi.b9(6, this, z9));
    }

    @Override
    public final void updateColors() {
        fh.g gVar = this.f38984r0;
        if (gVar != null) {
            gVar.updateColors();
        }
        GradientDrawable gradientDrawable = this.O;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(org.telegram.ui.ActionBar.l6.w0(this.P, this.f38975j0));
        }
        bi.q1 q1Var = this.f38986w;
        if (q1Var != null) {
            q1Var.g1();
            q1Var.invalidate();
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
