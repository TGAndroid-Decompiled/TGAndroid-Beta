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
public abstract class v71 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final int f31159s0 = 0;
    public u71 D;
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
    public float f31160a;
    public final gr f31161a0;
    public org.telegram.messenger.k20 f31162b;
    public final SparseIntArray f31163b0;
    public final TextPaint f31164c;
    public final SparseIntArray f31165c0;
    public final TextPaint d;
    public final SparseIntArray f31166d0;
    public final TextPaint e;
    public final SparseIntArray f31167e0;
    public final Paint f31168f;
    public float f31169f0;
    public int f31170g0;
    public final ArrayList h;
    public int f31171h0;
    public final ew f31172i0;
    public final org.telegram.ui.ActionBar.p6 f31173j0;
    public ValueAnimator f31174k0;
    public org.telegram.messenger.k20 f31175l0;
    public boolean m0;
    public boolean f31176n;
    public s4.x f31177n0;
    public r71 f31178o0;
    public float f31179p0;
    public final Paint f31180q0;
    public int f31181r;
    public vg.f f31182r0;
    public boolean f31183s;
    public final ag.b1 f31184w;
    public final org.telegram.ui.br f31185x;
    public final fg.j f31186y;

    public v71(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        float f7;
        int i11;
        int i12;
        int i13;
        this.f31160a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f31164c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f31168f = new Paint(1);
        this.h = new ArrayList();
        this.f31181r = 16;
        this.G = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = org.telegram.ui.ActionBar.t6.ui;
        this.Q = org.telegram.ui.ActionBar.t6.ti;
        this.R = org.telegram.ui.ActionBar.t6.si;
        this.S = org.telegram.ui.ActionBar.t6.vi;
        this.T = org.telegram.ui.ActionBar.t6.f21206s8;
        this.f31161a0 = gr.h;
        this.f31163b0 = new SparseIntArray(5);
        this.f31165c0 = new SparseIntArray(5);
        this.f31166d0 = new SparseIntArray(5);
        this.f31167e0 = new SparseIntArray(5);
        this.f31172i0 = new ew(this, 15);
        this.f31180q0 = new Paint(1);
        this.f31173j0 = p6Var;
        this.E = i10;
        textPaint2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
        if (i10 != 9 && i10 != 10 && i10 != -2) {
            f7 = 15.0f;
        } else {
            f7 = 14.0f;
        }
        textPaint.setTextSize(org.telegram.messenger.i0.L(f7));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.O = gradientDrawable;
        gradientDrawable.setColor(org.telegram.ui.ActionBar.t6.w0(this.P, p6Var));
        if (i10 == -2) {
            float N = org.telegram.messenger.i0.N(13.0f);
            i11 = 7;
            gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
            i12 = 3;
        } else {
            i11 = 7;
            float N2 = org.telegram.messenger.i0.N(3.0f);
            i12 = 3;
            gradientDrawable.setCornerRadii(new float[]{N2, N2, N2, N2, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        ag.b1 b1Var = new ag.b1(this, context, 24);
        this.f31184w = b1Var;
        b1Var.setOverScrollMode(2);
        if (z10) {
            b1Var.setItemAnimator(null);
        } else {
            ((s4.j) b1Var.getItemAnimator()).C = false;
        }
        if (i10 == -2) {
            b1Var.setSelectorType(9);
            b1Var.setSelectorRadius(6);
        } else {
            if (i10 == 10) {
                i13 = 9;
            } else {
                i13 = i10;
            }
            b1Var.setSelectorType(i13);
            if (i10 == i12) {
                b1Var.setSelectorRadius(0);
            } else {
                b1Var.setSelectorRadius(6);
            }
        }
        org.telegram.ui.ActionBar.a7.m(b1Var, 20, this.S, p6Var);
        org.telegram.ui.br brVar = new org.telegram.ui.br((ViewGroup) this, i11);
        this.f31185x = brVar;
        b1Var.setLayoutManager(brVar);
        b1Var.setPadding(org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f), 0);
        b1Var.setClipToPadding(false);
        b1Var.setDrawSelectorBehind(true);
        fg.j jVar = new fg.j(8, this, context);
        this.f31186y = jVar;
        jVar.C(z10);
        b1Var.setAdapter(jVar);
        b1Var.setOnItemClickListener(new p71(this));
        b1Var.setOnItemLongClickListener(new p71(this));
        b1Var.setOnScrollListener(new bu0(this, 5));
        if (i10 != 9 && i10 != 10) {
            addView(b1Var, w7.b6.c(-1.0f, -1));
        } else {
            addView(b1Var, w7.b6.e(-2, -1, 1));
        }
    }

    public final void a(int i10, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.G == -1) {
            this.G = i10;
        }
        this.f31163b0.put(size, i10);
        this.f31165c0.put(i10, size);
        int i11 = this.G;
        if (i11 != -1 && i11 == i10) {
            this.F = size;
        }
        ?? obj = new Object();
        obj.f30173a = i10;
        obj.f30174b = charSequence;
        int i12 = this.H;
        this.H = org.telegram.messenger.m5.C(this.f31181r * 2, obj.a(this.f31164c), i12);
        arrayList.add(obj);
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        this.V = z10;
        int i10 = 0;
        ag.b1 b1Var = this.f31184w;
        float f15 = 1.0f;
        if (z11) {
            while (i10 < b1Var.getChildCount()) {
                ViewPropertyAnimator animate = b1Var.getChildAt(i10).animate();
                if (z10) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (z10) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (z10) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                scaleX.scaleY(f14).setInterpolator(gr.f26495f).setDuration(220L).start();
                i10++;
            }
        } else {
            while (i10 < b1Var.getChildCount()) {
                View childAt = b1Var.getChildAt(i10);
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                childAt.setScaleX(f7);
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                childAt.setScaleY(f10);
                if (z10) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                childAt.setAlpha(f11);
                i10++;
            }
            if (!z10) {
                f15 = 0.0f;
            }
            this.W = f15;
        }
        invalidate();
    }

    public final void c(int i10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.N != i10 && i10 >= 0 && i10 < arrayList.size()) {
            this.N = i10;
            ag.b1 b1Var = this.f31184w;
            if (b1Var.getVisibility() != 8 && b1Var.getMeasuredWidth() != 0) {
                b1Var.y0(i10);
            } else {
                org.telegram.messenger.i0.h3(new qq(this, i10, 6), 100L);
            }
        }
    }

    public final void d(int i10, int i11) {
        boolean z10;
        int i12 = this.F;
        int i13 = 0;
        if (i12 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.N = -1;
        this.f31170g0 = i12;
        this.f31171h0 = this.G;
        this.F = i11;
        this.G = i10;
        ValueAnimator valueAnimator = this.f31174k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.J) {
            this.J = false;
        }
        this.f31169f0 = 0.0f;
        this.K = 0.0f;
        this.J = true;
        setEnabled(false);
        u71 u71Var = this.D;
        if (u71Var != null) {
            w71 w71Var = (w71) ((n2.u) u71Var).f13480b;
            w71Var.D = z10;
            View[] viewArr = w71Var.e;
            w71Var.d = i11;
            w71Var.K(1);
            w71Var.z(i11, z10);
            View view = viewArr[0];
            if (view != null) {
                i13 = view.getMeasuredWidth();
            }
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    w71Var.F(view2, i13);
                } else {
                    w71Var.F(view2, -i13);
                }
            }
        }
        c(this.F);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f31174k0 = ofFloat;
        ofFloat.addUpdateListener(new v51(2, this));
        this.f31174k0.setDuration(250L);
        this.f31174k0.setInterpolator(gr.f26495f);
        this.f31174k0.addListener(new p11(this, 7));
        this.f31174k0.start();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v71.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public abstract void e(float f7, int i10, int i11);

    public final void f(float f7, int i10) {
        int i11 = this.f31165c0.get(i10, -1);
        if (i11 >= 0) {
            if (f7 < 0.0f) {
                f7 = 0.0f;
            } else if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            if (f7 > 0.0f) {
                this.L = i11;
                this.M = i10;
            } else {
                this.L = -1;
                this.M = -1;
            }
            this.K = f7;
            this.f31184w.g1();
            invalidate();
            c(i11);
            if (f7 >= 1.0f) {
                this.L = -1;
                this.M = -1;
                this.F = i11;
                this.G = i10;
            }
        }
    }

    public final void g(int i10, int i11, int i12, int i13, int i14) {
        this.P = i10;
        this.Q = i11;
        this.R = i12;
        this.S = i13;
        this.T = i14;
        this.O.setColor(org.telegram.ui.ActionBar.t6.w0(i10, this.f31173j0));
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
        return this.f31163b0.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.f31170g0;
    }

    public Drawable getSelectorDrawable() {
        return this.O;
    }

    public tk0 getTabsContainer() {
        return this.f31184w;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.U != i14) {
            this.U = i14;
            this.N = -1;
            if (this.J) {
                org.telegram.messenger.i0.r(this.f31172i0);
                this.J = false;
                setEnabled(true);
                u71 u71Var = this.D;
                if (u71Var != null) {
                    ((n2.u) u71Var).J(1.0f);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(7.0f)) - org.telegram.messenger.i0.L(7.0f);
            int i14 = this.I;
            if (arrayList.size() != 1 && (i12 = this.E) != 9 && i12 != 10) {
                int i15 = this.H;
                if (i15 < size) {
                    i13 = (size - i15) / arrayList.size();
                } else {
                    i13 = 0;
                }
                this.I = i13;
            } else {
                this.I = 0;
            }
            if (i14 != this.I) {
                this.f31183s = true;
                this.f31186y.f();
                this.f31183s = false;
            }
            SparseIntArray sparseIntArray = this.f31167e0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.f31166d0;
            sparseIntArray2.clear();
            int L = org.telegram.messenger.i0.L(7.0f);
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                int a2 = ((s71) arrayList.get(i16)).a(this.f31164c);
                sparseIntArray2.put(i16, a2);
                sparseIntArray.put(i16, (this.I / 2) + L);
                L += org.telegram.messenger.i0.L(this.f31181r * 2) + a2 + this.I;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f31183s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.K = f7;
        this.f31184w.g1();
        invalidate();
        u71 u71Var = this.D;
        if (u71Var != null) {
            ((n2.u) u71Var).J(f7);
        }
    }

    public void setBlurredBackground(vg.f fVar) {
        this.f31182r0 = fVar;
        setBackground(fVar);
    }

    public void setDelegate(u71 u71Var) {
        this.D = u71Var;
    }

    public void setIsEditing(boolean z10) {
        this.f31176n = z10;
        this.f31184w.g1();
        invalidate();
    }

    public void setOnTabLongClick(org.telegram.messenger.k20 k20Var) {
        this.f31162b = k20Var;
    }

    public void setPreTabClick(org.telegram.messenger.k20 k20Var) {
        this.f31175l0 = k20Var;
    }

    public void setReordering(boolean z10) {
        ag.b1 b1Var;
        if (this.m0 == z10) {
            return;
        }
        this.m0 = z10;
        if (z10 && this.f31177n0 == null) {
            this.f31177n0 = new s4.x(new org.telegram.ui.ja(this, 7));
        }
        if (this.m0 && this.f31178o0 == null) {
            r71 r71Var = new r71(this);
            this.f31178o0 = r71Var;
            r71Var.f47927m = false;
            r71Var.C = false;
            r71Var.o(gr.h);
            this.f31178o0.n(350L);
        }
        s4.x xVar = this.f31177n0;
        r71 r71Var2 = null;
        ag.b1 b1Var2 = this.f31184w;
        if (xVar != null) {
            if (z10) {
                b1Var = b1Var2;
            } else {
                b1Var = null;
            }
            xVar.h(b1Var);
        }
        if (z10) {
            r71Var2 = this.f31178o0;
        }
        b1Var2.setItemAnimator(r71Var2);
        org.telegram.messenger.i0.d0(b1Var2, new org.telegram.ui.nc(2, this, z10));
    }

    @Override
    public final void updateColors() {
        vg.f fVar = this.f31182r0;
        if (fVar != null) {
            fVar.updateColors();
        }
        GradientDrawable gradientDrawable = this.O;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(org.telegram.ui.ActionBar.t6.w0(this.P, this.f31173j0));
        }
        ag.b1 b1Var = this.f31184w;
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
