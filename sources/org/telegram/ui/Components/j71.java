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
public class j71 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static final int f36321t0 = 0;
    public i71 E;
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
    public float f36322a;
    public float f36323a0;
    public org.telegram.messenger.q10 f36324b;
    public final kr f36325b0;
    public final TextPaint f36326c;
    public final SparseIntArray f36327c0;
    public final TextPaint d;
    public final SparseIntArray f36328d0;
    public final TextPaint f36329e;
    public final SparseIntArray f36330e0;
    public final Paint f36331f;
    public final SparseIntArray f36332f0;
    public float f36333g0;
    public final ArrayList h;
    public int f36334h0;
    public int f36335i0;
    public final rc f36336j0;
    public final org.telegram.ui.ActionBar.i6 f36337k0;
    public ValueAnimator f36338l0;
    public org.telegram.messenger.q10 m0;
    public boolean f36339n;
    public boolean f36340n0;
    public v4.z f36341o0;
    public f71 f36342p0;
    public float f36343q0;
    public int f36344r;
    public final Paint f36345r0;
    public boolean f36346s;
    public fh.g f36347s0;
    public final di.b1 f36348w;
    public final jg.i0 f36349x;
    public final org.telegram.ui.l4 f36350y;

    public j71(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        float f10;
        boolean z11;
        int i10;
        int i11;
        this.f36322a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f36326c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f36329e = textPaint3;
        this.f36331f = new Paint(1);
        this.h = new ArrayList();
        this.f36344r = 16;
        this.H = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.Q = org.telegram.ui.ActionBar.n6.f29835xi;
        this.R = org.telegram.ui.ActionBar.n6.f29816wi;
        this.S = org.telegram.ui.ActionBar.n6.f29797vi;
        this.T = org.telegram.ui.ActionBar.n6.f29854yi;
        this.U = org.telegram.ui.ActionBar.n6.f29731s8;
        this.f36325b0 = kr.h;
        this.f36327c0 = new SparseIntArray(5);
        this.f36328d0 = new SparseIntArray(5);
        this.f36330e0 = new SparseIntArray(5);
        this.f36332f0 = new SparseIntArray(5);
        this.f36336j0 = new rc(this, 23);
        this.f36345r0 = new Paint(1);
        this.f36337k0 = i6Var;
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.n6.w0(this.Q, i6Var));
        if (i7 == -2) {
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
        di.b1 b1Var = new di.b1(29, context, this);
        this.f36348w = b1Var;
        b1Var.setOverScrollMode(2);
        if (z10) {
            b1Var.setItemAnimator(null);
        } else {
            ((v4.l) b1Var.getItemAnimator()).C = false;
        }
        if (i7 == -2) {
            b1Var.setSelectorType(9);
            b1Var.setSelectorRadius(6);
        } else {
            if (i7 == 10) {
                i11 = 9;
            } else {
                i11 = i7;
            }
            b1Var.setSelectorType(i11);
            if (i7 == i10) {
                b1Var.setSelectorRadius(0);
            } else {
                b1Var.setSelectorRadius(6);
            }
        }
        org.telegram.ui.ActionBar.u6.l(b1Var, 20, this.T, i6Var);
        jg.i0 i0Var = new jg.i0((ViewGroup) this, 8);
        this.f36349x = i0Var;
        b1Var.setLayoutManager(i0Var);
        b1Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        b1Var.setClipToPadding(false);
        b1Var.setDrawSelectorBehind(z11);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(7, this, context);
        this.f36350y = l4Var;
        l4Var.C(z10);
        b1Var.setAdapter(l4Var);
        b1Var.setOnItemClickListener(new d71(this));
        b1Var.setOnItemLongClickListener(new d71(this));
        b1Var.setOnScrollListener(new na(this, 23));
        if (i7 != 9 && i7 != 10) {
            addView(b1Var, c8.na.c(-1.0f, -1));
        } else {
            addView(b1Var, c8.na.e(-2, -1, 1));
        }
    }

    public final void a(int i7, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.H == -1) {
            this.H = i7;
        }
        this.f36327c0.put(size, i7);
        this.f36328d0.put(i7, size);
        int i10 = this.H;
        if (i10 != -1 && i10 == i7) {
            this.G = size;
        }
        ?? obj = new Object();
        obj.f35349a = i7;
        obj.f35350b = charSequence;
        int i11 = this.I;
        this.I = org.telegram.messenger.f3.C(this.f36344r * 2, obj.a(this.f36326c), i11);
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
        di.b1 b1Var = this.f36348w;
        float f16 = 1.0f;
        if (z11) {
            while (i7 < b1Var.getChildCount()) {
                ViewPropertyAnimator animate = b1Var.getChildAt(i7).animate();
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
                scaleX.scaleY(f15).setInterpolator(kr.f36858f).setDuration(220L).start();
                i7++;
            }
        } else {
            while (i7 < b1Var.getChildCount()) {
                View childAt = b1Var.getChildAt(i7);
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
            this.f36323a0 = f16;
        }
        invalidate();
    }

    public final void c() {
        this.h.clear();
        this.f36327c0.clear();
        this.f36328d0.clear();
        this.f36330e0.clear();
        this.f36332f0.clear();
        this.I = 0;
    }

    public final void d(int i7) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.O != i7 && i7 >= 0 && i7 < arrayList.size()) {
            this.O = i7;
            di.b1 b1Var = this.f36348w;
            if (b1Var.getVisibility() != 8 && b1Var.getMeasuredWidth() != 0) {
                b1Var.y0(i7);
            } else {
                org.telegram.messenger.g0.h3(new org.telegram.ui.ii(this, i7, 19), 100L);
            }
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j71.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void e(int i7, int i10) {
        boolean z10;
        int i11 = this.G;
        if (i11 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.O = -1;
        this.f36334h0 = i11;
        this.f36335i0 = this.H;
        i71 i71Var = this.E;
        if (i71Var != null) {
            i71Var.p();
        }
        this.G = i10;
        this.H = i7;
        ValueAnimator valueAnimator = this.f36338l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.K) {
            this.K = false;
        }
        this.f36333g0 = 0.0f;
        this.L = 0.0f;
        this.K = true;
        setEnabled(false);
        i71 i71Var2 = this.E;
        if (i71Var2 != null) {
            i71Var2.a(i10, z10);
        }
        d(this.G);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f36338l0 = ofFloat;
        ofFloat.addUpdateListener(new h51(2, this));
        this.f36338l0.setDuration(250L);
        this.f36338l0.setInterpolator(kr.f36858f);
        this.f36338l0.addListener(new s11(this, 6));
        this.f36338l0.start();
    }

    public void f(float f10, int i7, int i10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        this.G = i7;
        SparseIntArray sparseIntArray = this.f36327c0;
        this.H = sparseIntArray.get(i7);
        if (f10 > 0.0f) {
            i71 i71Var = this.E;
            if (i71Var != null) {
                i71Var.p();
            }
            this.M = i10;
            this.N = sparseIntArray.get(i10);
        } else {
            this.M = -1;
            this.N = -1;
        }
        this.L = f10;
        this.f36348w.g1();
        invalidate();
        d(i7);
        if (f10 >= 1.0f) {
            this.M = -1;
            this.N = -1;
            this.G = i10;
            this.H = sparseIntArray.get(i10);
        }
        i71 i71Var2 = this.E;
        if (i71Var2 != null) {
            i71Var2.e();
        }
    }

    public final void g(float f10, int i7) {
        int i10 = this.f36328d0.get(i7, -1);
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
            this.f36348w.g1();
            invalidate();
            d(i10);
            if (f10 >= 1.0f) {
                this.M = -1;
                this.N = -1;
                this.G = i10;
                this.H = i7;
            }
        }
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
        return this.f36327c0.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.f36334h0;
    }

    public Drawable getSelectorDrawable() {
        return this.P;
    }

    public ek0 getTabsContainer() {
        return this.f36348w;
    }

    public final void h(int i7, int i10, int i11, int i12, int i13) {
        this.Q = i7;
        this.R = i10;
        this.S = i11;
        this.T = i12;
        this.U = i13;
        this.P.setColor(org.telegram.ui.ActionBar.n6.w0(i7, this.f36337k0));
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = i11 - i7;
        if (this.V != i13) {
            this.V = i13;
            this.O = -1;
            if (this.K) {
                org.telegram.messenger.g0.r(this.f36336j0);
                this.K = false;
                setEnabled(true);
                i71 i71Var = this.E;
                if (i71Var != null) {
                    i71Var.c(1.0f);
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
                this.f36346s = true;
                this.f36350y.f();
                this.f36346s = false;
            }
            SparseIntArray sparseIntArray = this.f36332f0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.f36330e0;
            sparseIntArray2.clear();
            int L = org.telegram.messenger.g0.L(7.0f);
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                int a10 = ((g71) arrayList.get(i15)).a(this.f36326c);
                sparseIntArray2.put(i15, a10);
                sparseIntArray.put(i15, (this.J / 2) + L);
                L += org.telegram.messenger.g0.L(this.f36344r * 2) + a10 + this.J;
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f36346s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.L = f10;
        this.f36348w.g1();
        invalidate();
        i71 i71Var = this.E;
        if (i71Var != null) {
            i71Var.c(f10);
        }
    }

    public void setBlurredBackground(fh.g gVar) {
        this.f36347s0 = gVar;
        setBackground(gVar);
    }

    public void setDelegate(i71 i71Var) {
        this.E = i71Var;
    }

    public void setIsEditing(boolean z10) {
        this.f36339n = z10;
        this.f36348w.g1();
        invalidate();
    }

    public void setOnTabLongClick(org.telegram.messenger.q10 q10Var) {
        this.f36324b = q10Var;
    }

    public void setPreTabClick(org.telegram.messenger.q10 q10Var) {
        this.m0 = q10Var;
    }

    public void setReordering(boolean z10) {
        di.b1 b1Var;
        if (this.f36340n0 == z10) {
            return;
        }
        this.f36340n0 = z10;
        if (z10 && this.f36341o0 == null) {
            this.f36341o0 = new v4.z(new gi.c(this, 8));
        }
        if (this.f36340n0 && this.f36342p0 == null) {
            f71 f71Var = new f71(this);
            this.f36342p0 = f71Var;
            f71Var.f59274m = false;
            f71Var.C = false;
            f71Var.o(kr.h);
            this.f36342p0.n(350L);
        }
        v4.z zVar = this.f36341o0;
        f71 f71Var2 = null;
        di.b1 b1Var2 = this.f36348w;
        if (zVar != null) {
            if (z10) {
                b1Var = b1Var2;
            } else {
                b1Var = null;
            }
            zVar.h(b1Var);
        }
        if (z10) {
            f71Var2 = this.f36342p0;
        }
        b1Var2.setItemAnimator(f71Var2);
        org.telegram.messenger.g0.d0(b1Var2, new ai.o2(7, this, z10));
    }

    @Override
    public final void updateColors() {
        fh.g gVar = this.f36347s0;
        if (gVar != null) {
            gVar.updateColors();
        }
        GradientDrawable gradientDrawable = this.P;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(org.telegram.ui.ActionBar.n6.w0(this.Q, this.f36337k0));
        }
        di.b1 b1Var = this.f36348w;
        if (b1Var != null) {
            b1Var.g1();
            b1Var.invalidate();
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
