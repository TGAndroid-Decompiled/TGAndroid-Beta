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
public abstract class m61 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final int f36025t0 = 0;
    public l61 E;
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
    public float f36026a;
    public float f36027a0;
    public org.telegram.messenger.o10 f36028b;
    public final xq f36029b0;
    public final TextPaint f36030c;
    public final SparseIntArray f36031c0;
    public final TextPaint d;
    public final SparseIntArray f36032d0;
    public final TextPaint f36033e;
    public final SparseIntArray f36034e0;
    public final Paint f36035f;
    public final SparseIntArray f36036f0;
    public float f36037g0;
    public final ArrayList h;
    public int f36038h0;
    public int f36039i0;
    public final lt f36040j0;
    public final org.telegram.ui.ActionBar.e6 f36041k0;
    public ValueAnimator f36042l0;
    public org.telegram.messenger.o10 m0;
    public boolean f36043n;
    public boolean f36044n0;
    public u4.y f36045o0;
    public i61 f36046p0;
    public float f36047q0;
    public int f36048r;
    public final Paint f36049r0;
    public boolean f36050s;
    public gh.g f36051s0;
    public final ci.j1 f36052w;
    public final kg.f0 f36053x;
    public final org.telegram.ui.n4 f36054y;

    public m61(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        float f10;
        boolean z11;
        int i10;
        int i11;
        this.f36026a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f36030c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f36033e = textPaint3;
        this.f36035f = new Paint(1);
        this.h = new ArrayList();
        this.f36048r = 16;
        this.H = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.Q = org.telegram.ui.ActionBar.k6.f28207ui;
        this.R = org.telegram.ui.ActionBar.k6.f28188ti;
        this.S = org.telegram.ui.ActionBar.k6.f28169si;
        this.T = org.telegram.ui.ActionBar.k6.f28226vi;
        this.U = org.telegram.ui.ActionBar.k6.f28160s8;
        this.f36029b0 = xq.h;
        this.f36031c0 = new SparseIntArray(5);
        this.f36032d0 = new SparseIntArray(5);
        this.f36034e0 = new SparseIntArray(5);
        this.f36036f0 = new SparseIntArray(5);
        this.f36040j0 = new lt(this, 16);
        this.f36049r0 = new Paint(1);
        this.f36041k0 = e6Var;
        this.F = i3;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        if (i3 != 9 && i3 != 10 && i3 != -2) {
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.w0(this.Q, e6Var));
        if (i3 == -2) {
            float N = org.telegram.messenger.g0.N(13.0f);
            z11 = true;
            gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
            i10 = 3;
        } else {
            z11 = true;
            float N2 = org.telegram.messenger.g0.N(3.0f);
            i10 = 3;
            gradientDrawable.setCornerRadii(new float[]{N2, N2, N2, N2, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        ci.j1 j1Var = new ci.j1(29, context, this);
        this.f36052w = j1Var;
        j1Var.setOverScrollMode(2);
        if (z10) {
            j1Var.setItemAnimator(null);
        } else {
            ((u4.k) j1Var.getItemAnimator()).C = false;
        }
        if (i3 == -2) {
            j1Var.setSelectorType(9);
            j1Var.setSelectorRadius(6);
        } else {
            if (i3 == 10) {
                i11 = 9;
            } else {
                i11 = i3;
            }
            j1Var.setSelectorType(i11);
            if (i3 == i10) {
                j1Var.setSelectorRadius(0);
            } else {
                j1Var.setSelectorRadius(6);
            }
        }
        org.telegram.ui.ActionBar.r6.m(j1Var, 20, this.T, e6Var);
        kg.f0 f0Var = new kg.f0((ViewGroup) this, 8);
        this.f36053x = f0Var;
        j1Var.setLayoutManager(f0Var);
        j1Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        j1Var.setClipToPadding(false);
        j1Var.setDrawSelectorBehind(z11);
        org.telegram.ui.n4 n4Var = new org.telegram.ui.n4(7, this, context);
        this.f36054y = n4Var;
        n4Var.C(z10);
        j1Var.setAdapter(n4Var);
        j1Var.setOnItemClickListener(new g61(this));
        j1Var.setOnItemLongClickListener(new g61(this));
        j1Var.setOnScrollListener(new ji(this, 22));
        if (i3 != 9 && i3 != 10) {
            addView(j1Var, b8.mf.c(-1.0f, -1));
        } else {
            addView(j1Var, b8.mf.e(-2, -1, 1));
        }
    }

    public final void a(int i3, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.H == -1) {
            this.H = i3;
        }
        this.f36031c0.put(size, i3);
        this.f36032d0.put(i3, size);
        int i10 = this.H;
        if (i10 != -1 && i10 == i3) {
            this.G = size;
        }
        ?? obj = new Object();
        obj.f34971a = i3;
        obj.f34972b = charSequence;
        int i11 = this.I;
        this.I = org.telegram.messenger.k5.C(this.f36048r * 2, obj.a(this.f36030c), i11);
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
        int i3 = 0;
        ci.j1 j1Var = this.f36052w;
        float f16 = 1.0f;
        if (z11) {
            while (i3 < j1Var.getChildCount()) {
                ViewPropertyAnimator animate = j1Var.getChildAt(i3).animate();
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
                scaleX.scaleY(f15).setInterpolator(xq.f40452f).setDuration(220L).start();
                i3++;
            }
        } else {
            while (i3 < j1Var.getChildCount()) {
                View childAt = j1Var.getChildAt(i3);
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
                i3++;
            }
            if (!z10) {
                f16 = 0.0f;
            }
            this.f36027a0 = f16;
        }
        invalidate();
    }

    public final void c(int i3) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.O != i3 && i3 >= 0 && i3 < arrayList.size()) {
            this.O = i3;
            ci.j1 j1Var = this.f36052w;
            if (j1Var.getVisibility() != 8 && j1Var.getMeasuredWidth() != 0) {
                j1Var.y0(i3);
            } else {
                org.telegram.messenger.g0.i3(new o2(this, i3, 11), 100L);
            }
        }
    }

    public final void d(int i3, int i10) {
        boolean z10;
        int i11 = this.G;
        int i12 = 0;
        if (i11 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.O = -1;
        this.f36038h0 = i11;
        this.f36039i0 = this.H;
        this.G = i10;
        this.H = i3;
        ValueAnimator valueAnimator = this.f36042l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.K) {
            this.K = false;
        }
        this.f36037g0 = 0.0f;
        this.L = 0.0f;
        this.K = true;
        setEnabled(false);
        l61 l61Var = this.E;
        if (l61Var != null) {
            n61 n61Var = (n61) ((y00) l61Var).f40562a;
            n61Var.E = z10;
            View[] viewArr = n61Var.f36386e;
            n61Var.d = i10;
            n61Var.K(1);
            n61Var.y(i10, z10);
            View view = viewArr[0];
            if (view != null) {
                i12 = view.getMeasuredWidth();
            }
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    n61Var.E(view2, i12);
                } else {
                    n61Var.E(view2, -i12);
                }
            }
        }
        c(this.G);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f36042l0 = ofFloat;
        ofFloat.addUpdateListener(new m41(2, this));
        this.f36042l0.setDuration(250L);
        this.f36042l0.setInterpolator(xq.f40452f);
        this.f36042l0.addListener(new j01(this, 7));
        this.f36042l0.start();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m61.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public abstract void e(float f10, int i3, int i10);

    public final void f(float f10, int i3) {
        int i10 = this.f36032d0.get(i3, -1);
        if (i10 >= 0) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (f10 > 0.0f) {
                this.M = i10;
                this.N = i3;
            } else {
                this.M = -1;
                this.N = -1;
            }
            this.L = f10;
            this.f36052w.g1();
            invalidate();
            c(i10);
            if (f10 >= 1.0f) {
                this.M = -1;
                this.N = -1;
                this.G = i10;
                this.H = i3;
            }
        }
    }

    public final void g(int i3, int i10, int i11, int i12, int i13) {
        this.Q = i3;
        this.R = i10;
        this.S = i11;
        this.T = i12;
        this.U = i13;
        this.P.setColor(org.telegram.ui.ActionBar.k6.w0(i3, this.f36041k0));
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
        return this.f36031c0.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.f36038h0;
    }

    public Drawable getSelectorDrawable() {
        return this.P;
    }

    public tj0 getTabsContainer() {
        return this.f36052w;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        int i13 = i11 - i3;
        if (this.V != i13) {
            this.V = i13;
            this.O = -1;
            if (this.K) {
                org.telegram.messenger.g0.r(this.f36040j0);
                this.K = false;
                setEnabled(true);
                l61 l61Var = this.E;
                if (l61Var != null) {
                    ((y00) l61Var).x(1.0f);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = (View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(7.0f)) - org.telegram.messenger.g0.L(7.0f);
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
                this.f36050s = true;
                this.f36054y.f();
                this.f36050s = false;
            }
            SparseIntArray sparseIntArray = this.f36036f0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.f36034e0;
            sparseIntArray2.clear();
            int L = org.telegram.messenger.g0.L(7.0f);
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                int a10 = ((j61) arrayList.get(i15)).a(this.f36030c);
                sparseIntArray2.put(i15, a10);
                sparseIntArray.put(i15, (this.J / 2) + L);
                L += org.telegram.messenger.g0.L(this.f36048r * 2) + a10 + this.J;
            }
        }
        super.onMeasure(i3, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f36050s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.L = f10;
        this.f36052w.g1();
        invalidate();
        l61 l61Var = this.E;
        if (l61Var != null) {
            ((y00) l61Var).x(f10);
        }
    }

    public void setBlurredBackground(gh.g gVar) {
        this.f36051s0 = gVar;
        setBackground(gVar);
    }

    public void setDelegate(l61 l61Var) {
        this.E = l61Var;
    }

    public void setIsEditing(boolean z10) {
        this.f36043n = z10;
        this.f36052w.g1();
        invalidate();
    }

    public void setOnTabLongClick(org.telegram.messenger.o10 o10Var) {
        this.f36028b = o10Var;
    }

    public void setPreTabClick(org.telegram.messenger.o10 o10Var) {
        this.m0 = o10Var;
    }

    public void setReordering(boolean z10) {
        ci.j1 j1Var;
        if (this.f36044n0 == z10) {
            return;
        }
        this.f36044n0 = z10;
        if (z10 && this.f36045o0 == null) {
            this.f36045o0 = new u4.y(new fi.c(this, 8));
        }
        if (this.f36044n0 && this.f36046p0 == null) {
            i61 i61Var = new i61(this);
            this.f36046p0 = i61Var;
            i61Var.f55567m = false;
            i61Var.C = false;
            i61Var.o(xq.h);
            this.f36046p0.n(350L);
        }
        u4.y yVar = this.f36045o0;
        i61 i61Var2 = null;
        ci.j1 j1Var2 = this.f36052w;
        if (yVar != null) {
            if (z10) {
                j1Var = j1Var2;
            } else {
                j1Var = null;
            }
            yVar.h(j1Var);
        }
        if (z10) {
            i61Var2 = this.f36046p0;
        }
        j1Var2.setItemAnimator(i61Var2);
        org.telegram.messenger.g0.d0(j1Var2, new ci.b8(6, this, z10));
    }

    @Override
    public final void updateColors() {
        gh.g gVar = this.f36051s0;
        if (gVar != null) {
            gVar.updateColors();
        }
        GradientDrawable gradientDrawable = this.P;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.w0(this.Q, this.f36041k0));
        }
        ci.j1 j1Var = this.f36052w;
        if (j1Var != null) {
            j1Var.g1();
            j1Var.invalidate();
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
