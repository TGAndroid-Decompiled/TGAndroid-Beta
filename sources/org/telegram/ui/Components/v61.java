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
public abstract class v61 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final int f40290t0 = 0;
    public u61 E;
    public final int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public float L;
    public int M;
    public int N;
    public int O;
    public final GradientDrawable P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public float f40291a;
    public float f40292a0;
    public org.telegram.messenger.t10 f40293b;
    public final er f40294b0;
    public final TextPaint f40295c;
    public final SparseIntArray f40296c0;
    public final TextPaint d;
    public final SparseIntArray f40297d0;
    public final TextPaint f40298e;
    public final SparseIntArray f40299e0;
    public final Paint f40300f;
    public final SparseIntArray f40301f0;
    public float f40302g0;
    public final ArrayList h;
    public int f40303h0;
    public int f40304i0;
    public final zj f40305j0;
    public final org.telegram.ui.ActionBar.e6 f40306k0;
    public ValueAnimator f40307l0;
    public org.telegram.messenger.t10 m0;
    public boolean f40308n;
    public boolean f40309n0;
    public v4.y f40310o0;
    public r61 f40311p0;
    public float f40312q0;
    public int f40313r;
    public final Paint f40314r0;
    public boolean f40315s;
    public fh.g f40316s0;
    public final di.c1 f40317w;
    public final jg.i0 f40318x;
    public final org.telegram.ui.l4 f40319y;

    public v61(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        float f10;
        int i10;
        int i11;
        this.f40291a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f40295c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f40298e = textPaint3;
        this.f40300f = new Paint(1);
        this.h = new ArrayList();
        this.f40313r = 16;
        this.H = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.Q = org.telegram.ui.ActionBar.j6.f29233xi;
        this.R = org.telegram.ui.ActionBar.j6.f29214wi;
        this.S = org.telegram.ui.ActionBar.j6.f29195vi;
        this.T = org.telegram.ui.ActionBar.j6.f29252yi;
        this.U = org.telegram.ui.ActionBar.j6.f29129s8;
        this.f40294b0 = er.h;
        this.f40296c0 = new SparseIntArray(5);
        this.f40297d0 = new SparseIntArray(5);
        this.f40299e0 = new SparseIntArray(5);
        this.f40301f0 = new SparseIntArray(5);
        this.f40305j0 = new zj(this, 20);
        this.f40314r0 = new Paint(1);
        this.f40306k0 = e6Var;
        this.F = i7;
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
        this.P = gradientDrawable;
        gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.w0(this.Q, e6Var));
        if (i7 == -2) {
            float N = org.telegram.messenger.g0.N(13.0f);
            gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
            i10 = 3;
        } else {
            float N2 = org.telegram.messenger.g0.N(3.0f);
            i10 = 3;
            gradientDrawable.setCornerRadii(new float[]{N2, N2, N2, N2, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        di.c1 c1Var = new di.c1(29, context, this);
        this.f40317w = c1Var;
        c1Var.setOverScrollMode(2);
        if (z10) {
            c1Var.setItemAnimator(null);
        } else {
            ((v4.k) c1Var.getItemAnimator()).C = false;
        }
        if (i7 == -2) {
            c1Var.setSelectorType(9);
            c1Var.setSelectorRadius(6);
        } else {
            if (i7 == 10) {
                i11 = 9;
            } else {
                i11 = i7;
            }
            c1Var.setSelectorType(i11);
            if (i7 == i10) {
                c1Var.setSelectorRadius(0);
            } else {
                c1Var.setSelectorRadius(6);
            }
        }
        org.telegram.ui.ActionBar.q6.l(c1Var, 20, this.T, e6Var);
        jg.i0 i0Var = new jg.i0((ViewGroup) this, 8);
        this.f40318x = i0Var;
        c1Var.setLayoutManager(i0Var);
        c1Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        c1Var.setClipToPadding(false);
        c1Var.setDrawSelectorBehind(true);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(7, this, context);
        this.f40319y = l4Var;
        l4Var.C(z10);
        c1Var.setAdapter(l4Var);
        c1Var.setOnItemClickListener(new p61(this));
        c1Var.setOnItemLongClickListener(new p61(this));
        c1Var.setOnScrollListener(new ri(this, 22));
        if (i7 != 9 && i7 != 10) {
            addView(c1Var, c8.ja.c(-1.0f, -1));
        } else {
            addView(c1Var, c8.ja.e(-2, -1, 1));
        }
    }

    public final void a(int i7, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.H == -1) {
            this.H = i7;
        }
        this.f40296c0.put(size, i7);
        this.f40297d0.put(i7, size);
        int i10 = this.H;
        if (i10 != -1 && i10 == i7) {
            this.G = size;
        }
        ?? obj = new Object();
        obj.f39185a = i7;
        obj.f39186b = charSequence;
        int i11 = this.I;
        this.I = org.telegram.messenger.k5.C(this.f40313r * 2, obj.a(this.f40295c), i11);
        arrayList.add(obj);
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        this.W = z10;
        int i7 = 0;
        di.c1 c1Var = this.f40317w;
        float f16 = 1.0f;
        if (z11) {
            while (i7 < c1Var.getChildCount()) {
                ViewPropertyAnimator animate = c1Var.getChildAt(i7).animate();
                if (z10) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f13);
                if (z10) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f14);
                if (z10) {
                    f15 = 0.0f;
                } else {
                    f15 = 1.0f;
                }
                scaleX.scaleY(f15).setInterpolator(er.f34419f).setDuration(220L).start();
                i7++;
            }
        } else {
            while (i7 < c1Var.getChildCount()) {
                View childAt = c1Var.getChildAt(i7);
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                childAt.setScaleX(f10);
                if (z10) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                childAt.setScaleY(f11);
                if (z10) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                childAt.setAlpha(f12);
                i7++;
            }
            if (!z10) {
                f16 = 0.0f;
            }
            this.f40292a0 = f16;
        }
        invalidate();
    }

    public final void c(int i7) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.O != i7 && i7 >= 0 && i7 < arrayList.size()) {
            this.O = i7;
            di.c1 c1Var = this.f40317w;
            if (c1Var.getVisibility() != 8 && c1Var.getMeasuredWidth() != 0) {
                c1Var.y0(i7);
            } else {
                org.telegram.messenger.g0.i3(new a2(this, i7, 14), 100L);
            }
        }
    }

    public final void d(int i7, int i10) {
        boolean z10;
        int i11;
        int i12 = this.G;
        if (i12 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.O = -1;
        this.f40303h0 = i12;
        this.f40304i0 = this.H;
        this.G = i10;
        this.H = i7;
        ValueAnimator valueAnimator = this.f40307l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.K) {
            this.K = false;
        }
        this.f40302g0 = 0.0f;
        this.L = 0.0f;
        this.K = true;
        setEnabled(false);
        u61 u61Var = this.E;
        if (u61Var != null) {
            w61 w61Var = (w61) ((cf) u61Var).f33545a;
            w61Var.E = z10;
            View[] viewArr = w61Var.f41300e;
            w61Var.d = i10;
            w61Var.I(1);
            w61Var.w(i10, z10);
            View view = viewArr[0];
            if (view != null) {
                i11 = view.getMeasuredWidth();
            } else {
                i11 = 0;
            }
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    w61Var.D(view2, i11);
                } else {
                    w61Var.D(view2, -i11);
                }
            }
        }
        c(this.G);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f40307l0 = ofFloat;
        ofFloat.addUpdateListener(new o61(this, 0));
        this.f40307l0.setDuration(250L);
        this.f40307l0.setInterpolator(er.f34419f);
        this.f40307l0.addListener(new i11(this, 6));
        this.f40307l0.start();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v61.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public abstract void e(float f10, int i7, int i10);

    public final void f(float f10, int i7) {
        int i10 = this.f40297d0.get(i7, -1);
        if (i10 >= 0) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (f10 > 0.0f) {
                this.M = i10;
                this.N = i7;
            } else {
                this.M = -1;
                this.N = -1;
            }
            this.L = f10;
            this.f40317w.g1();
            invalidate();
            c(i10);
            if (f10 >= 1.0f) {
                this.M = -1;
                this.N = -1;
                this.G = i10;
                this.H = i7;
            }
        }
    }

    public final void g(int i7, int i10, int i11, int i12, int i13) {
        this.Q = i7;
        this.R = i10;
        this.S = i11;
        this.T = i12;
        this.U = i13;
        this.P.setColor(org.telegram.ui.ActionBar.j6.w0(i7, this.f40306k0));
    }

    public float getAnimatingIndicatorProgress() {
        return this.L;
    }

    public int getCurrentPosition() {
        return this.G;
    }

    public int getCurrentTabId() {
        return this.H;
    }

    public int getFirstTabId() {
        return this.f40296c0.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.f40303h0;
    }

    public Drawable getSelectorDrawable() {
        return this.P;
    }

    public uj0 getTabsContainer() {
        return this.f40317w;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = i11 - i7;
        if (this.V != i13) {
            this.V = i13;
            this.O = -1;
            if (this.K) {
                org.telegram.messenger.g0.r(this.f40305j0);
                this.K = false;
                setEnabled(true);
                u61 u61Var = this.E;
                if (u61Var != null) {
                    ((cf) u61Var).q(1.0f);
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
            int i13 = this.J;
            if (arrayList.size() != 1 && (i11 = this.F) != 9 && i11 != 10) {
                int i14 = this.I;
                if (i14 < size) {
                    i12 = (size - i14) / arrayList.size();
                } else {
                    i12 = 0;
                }
                this.J = i12;
            } else {
                this.J = 0;
            }
            if (i13 != this.J) {
                this.f40315s = true;
                this.f40319y.f();
                this.f40315s = false;
            }
            SparseIntArray sparseIntArray = this.f40301f0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.f40299e0;
            sparseIntArray2.clear();
            int L = org.telegram.messenger.g0.L(7.0f);
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                int a10 = ((s61) arrayList.get(i15)).a(this.f40295c);
                sparseIntArray2.put(i15, a10);
                sparseIntArray.put(i15, (this.J / 2) + L);
                L += org.telegram.messenger.g0.L(this.f40313r * 2) + a10 + this.J;
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f40315s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.L = f10;
        this.f40317w.g1();
        invalidate();
        u61 u61Var = this.E;
        if (u61Var != null) {
            ((cf) u61Var).q(f10);
        }
    }

    public void setBlurredBackground(fh.g gVar) {
        this.f40316s0 = gVar;
        setBackground(gVar);
    }

    public void setDelegate(u61 u61Var) {
        this.E = u61Var;
    }

    public void setIsEditing(boolean z10) {
        this.f40308n = z10;
        this.f40317w.g1();
        invalidate();
    }

    public void setOnTabLongClick(org.telegram.messenger.t10 t10Var) {
        this.f40293b = t10Var;
    }

    public void setPreTabClick(org.telegram.messenger.t10 t10Var) {
        this.m0 = t10Var;
    }

    public void setReordering(boolean z10) {
        di.c1 c1Var;
        if (this.f40309n0 == z10) {
            return;
        }
        this.f40309n0 = z10;
        if (z10 && this.f40310o0 == null) {
            this.f40310o0 = new v4.y(new gi.c(this, 8));
        }
        if (this.f40309n0 && this.f40311p0 == null) {
            r61 r61Var = new r61(this);
            this.f40311p0 = r61Var;
            r61Var.f58564m = false;
            r61Var.C = false;
            r61Var.o(er.h);
            this.f40311p0.n(350L);
        }
        v4.y yVar = this.f40310o0;
        r61 r61Var2 = null;
        di.c1 c1Var2 = this.f40317w;
        if (yVar != null) {
            if (z10) {
                c1Var = c1Var2;
            } else {
                c1Var = null;
            }
            yVar.h(c1Var);
        }
        if (z10) {
            r61Var2 = this.f40311p0;
        }
        c1Var2.setItemAnimator(r61Var2);
        org.telegram.messenger.g0.d0(c1Var2, new ai.u2(7, this, z10));
    }

    @Override
    public final void updateColors() {
        fh.g gVar = this.f40316s0;
        if (gVar != null) {
            gVar.updateColors();
        }
        GradientDrawable gradientDrawable = this.P;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.w0(this.Q, this.f40306k0));
        }
        di.c1 c1Var = this.f40317w;
        if (c1Var != null) {
            c1Var.g1();
            c1Var.invalidate();
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
