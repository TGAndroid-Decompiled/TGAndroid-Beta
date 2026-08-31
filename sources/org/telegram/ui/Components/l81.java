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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public abstract class l81 extends FrameLayout {
    public static final int f28646p0 = 0;
    public final int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public float H;
    public int I;
    public int J;
    public int K;
    public final GradientDrawable L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public float T;
    public final pr U;
    public final SparseIntArray V;
    public final SparseIntArray W;
    public float f28647a;
    public final SparseIntArray f28648a0;
    public Utilities.Callback2Return f28649b;
    public final SparseIntArray f28650b0;
    public final TextPaint f28651c;
    public float f28652c0;
    public final TextPaint d;
    public int f28653d0;
    public final TextPaint f28654e;
    public int f28655e0;
    public final Paint f28656f;
    public final ul0 f28657f0;
    public final org.telegram.ui.ActionBar.g6 f28658g0;
    public final ArrayList h;
    public ValueAnimator f28659h0;
    public Utilities.Callback2Return f28660i0;
    public boolean f28661j0;
    public f2.f0 f28662k0;
    public h81 f28663l0;
    public float m0;
    public boolean f28664n;
    public final Paint f28665n0;
    public qg.b f28666o0;
    public int f28667r;
    public boolean f28668s;
    public final mh.d1 v;
    public final org.telegram.ui.cr f28669w;
    public final ag.m f28670x;
    public k81 f28671y;

    public l81(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        float f10;
        int i11;
        this.f28647a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f28651c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f28654e = textPaint3;
        this.f28656f = new Paint(1);
        this.h = new ArrayList();
        this.f28667r = 16;
        this.D = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.M = org.telegram.ui.ActionBar.k6.Gh;
        this.N = org.telegram.ui.ActionBar.k6.Fh;
        this.O = org.telegram.ui.ActionBar.k6.Eh;
        this.P = org.telegram.ui.ActionBar.k6.Hh;
        this.Q = org.telegram.ui.ActionBar.k6.f21930s8;
        this.U = pr.h;
        this.V = new SparseIntArray(5);
        this.W = new SparseIntArray(5);
        this.f28648a0 = new SparseIntArray(5);
        this.f28650b0 = new SparseIntArray(5);
        this.f28657f0 = new ul0(this, 4);
        this.f28665n0 = new Paint(1);
        this.f28658g0 = g6Var;
        this.B = i10;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        if (i10 != 9 && i10 != 10 && i10 != -2) {
            f10 = 15.0f;
        } else {
            f10 = 14.0f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(f10));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.L = gradientDrawable;
        gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.v0(this.M, g6Var));
        if (i10 == -2) {
            float dpf2 = AndroidUtilities.dpf2(13.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        } else {
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf22, dpf22, dpf22, dpf22, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        mh.d1 d1Var = new mh.d1(this, context, 23);
        this.v = d1Var;
        d1Var.setOverScrollMode(2);
        if (z4) {
            d1Var.setItemAnimator(null);
        } else {
            ((f2.l) d1Var.getItemAnimator()).C = false;
        }
        if (i10 == -2) {
            d1Var.setSelectorType(9);
            d1Var.setSelectorRadius(6);
        } else {
            if (i10 == 10) {
                i11 = 9;
            } else {
                i11 = i10;
            }
            d1Var.setSelectorType(i11);
            if (i10 == 3) {
                d1Var.setSelectorRadius(0);
            } else {
                d1Var.setSelectorRadius(6);
            }
        }
        d1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.v0(this.P, g6Var));
        org.telegram.ui.cr crVar = new org.telegram.ui.cr((ViewGroup) this, 5);
        this.f28669w = crVar;
        d1Var.setLayoutManager(crVar);
        d1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        d1Var.setClipToPadding(false);
        d1Var.setDrawSelectorBehind(true);
        ag.m mVar = new ag.m(this, context);
        this.f28670x = mVar;
        mVar.C(z4);
        d1Var.setAdapter(mVar);
        d1Var.setOnItemClickListener(new f81(this));
        d1Var.setOnItemLongClickListener(new f81(this));
        d1Var.setOnScrollListener(new nb0(this, 9));
        if (i10 != 9 && i10 != 10) {
            addView(d1Var, k7.c6.c(-1.0f, -1));
        } else {
            addView(d1Var, k7.c6.e(-2, -1, 1));
        }
    }

    public final void a(int i10, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.D == -1) {
            this.D = i10;
        }
        this.V.put(size, i10);
        this.W.put(i10, size);
        int i11 = this.D;
        if (i11 != -1 && i11 == i10) {
            this.C = size;
        }
        ?? obj = new Object();
        obj.f27698a = i10;
        obj.f27699b = charSequence;
        int i12 = this.E;
        this.E = org.telegram.messenger.y3.C(this.f28667r * 2, obj.a(this.f28651c), i12);
        arrayList.add(obj);
    }

    public final void b(boolean z4, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        this.S = z4;
        int i10 = 0;
        mh.d1 d1Var = this.v;
        float f16 = 1.0f;
        if (z10) {
            while (i10 < d1Var.getChildCount()) {
                ViewPropertyAnimator animate = d1Var.getChildAt(i10).animate();
                if (z4) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f13);
                if (z4) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f14);
                if (z4) {
                    f15 = 0.0f;
                } else {
                    f15 = 1.0f;
                }
                scaleX.scaleY(f15).setInterpolator(pr.f30183f).setDuration(220L).start();
                i10++;
            }
        } else {
            while (i10 < d1Var.getChildCount()) {
                View childAt = d1Var.getChildAt(i10);
                if (z4) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                childAt.setScaleX(f10);
                if (z4) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                childAt.setScaleY(f11);
                if (z4) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                childAt.setAlpha(f12);
                i10++;
            }
            if (!z4) {
                f16 = 0.0f;
            }
            this.T = f16;
        }
        invalidate();
    }

    public final void c(int i10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.K != i10 && i10 >= 0 && i10 < arrayList.size()) {
            this.K = i10;
            mh.d1 d1Var = this.v;
            if (d1Var.getVisibility() != 8 && d1Var.getMeasuredWidth() != 0) {
                d1Var.x0(i10);
            } else {
                AndroidUtilities.runOnUIThread(new jm(this, i10, 10), 100L);
            }
        }
    }

    public final void d(int i10, int i11) {
        boolean z4;
        int i12 = this.C;
        int i13 = 0;
        if (i12 < i11) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.K = -1;
        this.f28653d0 = i12;
        this.f28655e0 = this.D;
        k81 k81Var = this.f28671y;
        if (k81Var != null) {
            e81 e81Var = ((m81) ((oh.h4) k81Var).f17180b).I;
        }
        this.C = i11;
        this.D = i10;
        ValueAnimator valueAnimator = this.f28659h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.G) {
            this.G = false;
        }
        this.f28652c0 = 0.0f;
        this.H = 0.0f;
        this.G = true;
        setEnabled(false);
        k81 k81Var2 = this.f28671y;
        if (k81Var2 != null) {
            m81 m81Var = (m81) ((oh.h4) k81Var2).f17180b;
            m81Var.f28994y = z4;
            View[] viewArr = m81Var.f28987e;
            m81Var.d = i11;
            m81Var.I(1);
            m81Var.y(i11, z4);
            View view = viewArr[0];
            if (view != null) {
                i13 = view.getMeasuredWidth();
            }
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z4) {
                    m81Var.E(view2, i13);
                } else {
                    m81Var.E(view2, -i13);
                }
            }
        }
        c(this.C);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f28659h0 = ofFloat;
        ofFloat.addUpdateListener(new j61(2, this));
        this.f28659h0.setDuration(250L);
        this.f28659h0.setInterpolator(pr.f30183f);
        this.f28659h0.addListener(new pd0(this, 28));
        this.f28659h0.start();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l81.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public abstract void e(float f10, int i10, int i11);

    public final void f(float f10, int i10) {
        int i11 = this.W.get(i10, -1);
        if (i11 >= 0) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (f10 > 0.0f) {
                this.I = i11;
                this.J = i10;
            } else {
                this.I = -1;
                this.J = -1;
            }
            this.H = f10;
            this.v.f1();
            invalidate();
            c(i11);
            if (f10 >= 1.0f) {
                this.I = -1;
                this.J = -1;
                this.C = i11;
                this.D = i10;
            }
        }
    }

    public float getAnimatingIndicatorProgress() {
        return this.H;
    }

    public int getCurrentPosition() {
        return this.C;
    }

    public int getCurrentTabId() {
        return this.D;
    }

    public int getFirstTabId() {
        return this.V.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.f28653d0;
    }

    public Drawable getSelectorDrawable() {
        return this.L;
    }

    public tl0 getTabsContainer() {
        return this.v;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.R != i14) {
            this.R = i14;
            this.K = -1;
            if (this.G) {
                AndroidUtilities.cancelRunOnUIThread(this.f28657f0);
                this.G = false;
                setEnabled(true);
                k81 k81Var = this.f28671y;
                if (k81Var != null) {
                    ((oh.h4) k81Var).f0(1.0f);
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
            int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(7.0f)) - AndroidUtilities.dp(7.0f);
            int i14 = this.F;
            if (arrayList.size() != 1 && (i12 = this.B) != 9 && i12 != 10) {
                int i15 = this.E;
                if (i15 < size) {
                    i13 = (size - i15) / arrayList.size();
                } else {
                    i13 = 0;
                }
                this.F = i13;
            } else {
                this.F = 0;
            }
            if (i14 != this.F) {
                this.f28668s = true;
                this.f28670x.l();
                this.f28668s = false;
            }
            SparseIntArray sparseIntArray = this.f28650b0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.f28648a0;
            sparseIntArray2.clear();
            int dp = AndroidUtilities.dp(7.0f);
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                int a2 = ((i81) arrayList.get(i16)).a(this.f28651c);
                sparseIntArray2.put(i16, a2);
                sparseIntArray.put(i16, (this.F / 2) + dp);
                dp += AndroidUtilities.dp(this.f28667r * 2) + a2 + this.F;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f28668s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.H = f10;
        this.v.f1();
        invalidate();
        k81 k81Var = this.f28671y;
        if (k81Var != null) {
            ((oh.h4) k81Var).f0(f10);
        }
    }

    public void setBlurredBackground(qg.b bVar) {
        this.f28666o0 = bVar;
        setBackground(bVar);
    }

    public void setDelegate(k81 k81Var) {
        this.f28671y = k81Var;
    }

    public void setIsEditing(boolean z4) {
        this.f28664n = z4;
        this.v.f1();
        invalidate();
    }

    public void setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> callback2Return) {
        this.f28649b = callback2Return;
    }

    public void setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> callback2Return) {
        this.f28660i0 = callback2Return;
    }

    public void setReordering(boolean z4) {
        mh.d1 d1Var;
        if (this.f28661j0 == z4) {
            return;
        }
        this.f28661j0 = z4;
        if (z4 && this.f28662k0 == null) {
            this.f28662k0 = new f2.f0(new org.telegram.ui.cp(this, 4));
        }
        if (this.f28661j0 && this.f28663l0 == null) {
            h81 h81Var = new h81(this);
            this.f28663l0 = h81Var;
            h81Var.f5910m = false;
            h81Var.C = false;
            h81Var.o(pr.h);
            this.f28663l0.n(350L);
        }
        f2.f0 f0Var = this.f28662k0;
        h81 h81Var2 = null;
        mh.d1 d1Var2 = this.v;
        if (f0Var != null) {
            if (z4) {
                d1Var = d1Var2;
            } else {
                d1Var = null;
            }
            f0Var.d(d1Var);
        }
        if (z4) {
            h81Var2 = this.f28663l0;
        }
        d1Var2.setItemAnimator(h81Var2);
        AndroidUtilities.forEachViews((RecyclerView) d1Var2, (h5.d) new org.telegram.ui.pc(2, this, z4));
    }
}
