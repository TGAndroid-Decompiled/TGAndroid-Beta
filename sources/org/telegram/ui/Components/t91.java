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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public abstract class t91 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public static final int f32918s0 = 0;
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
    public float f32919a;
    public final ds f32920a0;
    public Utilities.Callback2Return f32921b;
    public final SparseIntArray f32922b0;
    public final TextPaint f32923c;
    public final SparseIntArray f32924c0;
    public final TextPaint d;
    public final SparseIntArray f32925d0;
    public final TextPaint e;
    public final SparseIntArray f32926e0;
    public final Paint f32927f;
    public float f32928f0;
    public int f32929g0;
    public final ArrayList h;
    public int f32930h0;
    public final cy0 f32931i0;
    public final org.telegram.ui.ActionBar.u6 f32932j0;
    public ValueAnimator f32933k0;
    public Utilities.Callback2Return f32934l0;
    public boolean m0;
    public boolean f32935n;
    public s4.z f32936n0;
    public p91 f32937o0;
    public float f32938p0;
    public final Paint f32939q0;
    public int f32940r;
    public eh.d f32941r0;
    public boolean f32942s;
    public final bi.r1 v;
    public final ig.j0 f32943w;
    public final og.g f32944x;
    public s91 f32945y;

    public t91(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        float f7;
        int i11;
        this.f32919a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f32923c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f32927f = new Paint(1);
        this.h = new ArrayList();
        this.f32940r = 16;
        this.G = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = org.telegram.ui.ActionBar.y6.Gh;
        this.Q = org.telegram.ui.ActionBar.y6.Fh;
        this.R = org.telegram.ui.ActionBar.y6.Eh;
        this.S = org.telegram.ui.ActionBar.y6.Hh;
        this.T = org.telegram.ui.ActionBar.y6.f23634s8;
        this.f32920a0 = ds.h;
        this.f32922b0 = new SparseIntArray(5);
        this.f32924c0 = new SparseIntArray(5);
        this.f32925d0 = new SparseIntArray(5);
        this.f32926e0 = new SparseIntArray(5);
        this.f32931i0 = new cy0(this, 2);
        this.f32939q0 = new Paint(1);
        this.f32932j0 = u6Var;
        this.E = i10;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        if (i10 != 9 && i10 != 10 && i10 != -2) {
            f7 = 15.0f;
        } else {
            f7 = 14.0f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.O = gradientDrawable;
        gradientDrawable.setColor(org.telegram.ui.ActionBar.y6.w0(this.P, u6Var));
        if (i10 == -2) {
            float dpf2 = AndroidUtilities.dpf2(13.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        } else {
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf22, dpf22, dpf22, dpf22, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        bi.r1 r1Var = new bi.r1(this, context, 26);
        this.v = r1Var;
        r1Var.setOverScrollMode(2);
        if (z10) {
            r1Var.setItemAnimator(null);
        } else {
            ((s4.l) r1Var.getItemAnimator()).C = false;
        }
        if (i10 == -2) {
            r1Var.setSelectorType(9);
            r1Var.setSelectorRadius(6);
        } else {
            if (i10 == 10) {
                i11 = 9;
            } else {
                i11 = i10;
            }
            r1Var.setSelectorType(i11);
            if (i10 == 3) {
                r1Var.setSelectorRadius(0);
            } else {
                r1Var.setSelectorRadius(6);
            }
        }
        org.telegram.ui.ActionBar.f7.m(r1Var, 20, this.S, u6Var);
        ig.j0 j0Var = new ig.j0((ViewGroup) this, 7);
        this.f32943w = j0Var;
        r1Var.setLayoutManager(j0Var);
        r1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        r1Var.setClipToPadding(false);
        r1Var.setDrawSelectorBehind(true);
        og.g gVar = new og.g(this, context);
        this.f32944x = gVar;
        gVar.C(z10);
        r1Var.setAdapter(gVar);
        r1Var.setOnItemClickListener(new n91(this));
        r1Var.setOnItemLongClickListener(new n91(this));
        r1Var.setOnScrollListener(new ml(this, 18));
        if (i10 != 9 && i10 != 10) {
            addView(r1Var, gb1.g(-1.0f, -1));
        } else {
            addView(r1Var, gb1.i(-2, -1, 1));
        }
    }

    public final void a(int i10, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.G == -1) {
            this.G = i10;
        }
        this.f32922b0.put(size, i10);
        this.f32924c0.put(i10, size);
        int i11 = this.G;
        if (i11 != -1 && i11 == i10) {
            this.F = size;
        }
        ?? obj = new Object();
        obj.f31862a = i10;
        obj.f31863b = charSequence;
        int i12 = this.H;
        this.H = org.telegram.messenger.t.D(this.f32940r * 2, obj.a(this.f32923c), i12);
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
        bi.r1 r1Var = this.v;
        float f15 = 1.0f;
        if (z11) {
            while (i10 < r1Var.getChildCount()) {
                ViewPropertyAnimator animate = r1Var.getChildAt(i10).animate();
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
                scaleX.scaleY(f14).setInterpolator(ds.f27584f).setDuration(220L).start();
                i10++;
            }
        } else {
            while (i10 < r1Var.getChildCount()) {
                View childAt = r1Var.getChildAt(i10);
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
            bi.r1 r1Var = this.v;
            if (r1Var.getVisibility() != 8 && r1Var.getMeasuredWidth() != 0) {
                r1Var.y0(i10);
            } else {
                AndroidUtilities.runOnUIThread(new h2(this, i10, 12), 100L);
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
        this.f32929g0 = i12;
        this.f32930h0 = this.G;
        this.F = i11;
        this.G = i10;
        ValueAnimator valueAnimator = this.f32933k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.J) {
            this.J = false;
        }
        this.f32928f0 = 0.0f;
        this.K = 0.0f;
        this.J = true;
        setEnabled(false);
        s91 s91Var = this.f32945y;
        if (s91Var != null) {
            u91 u91Var = (u91) ((jg.i) s91Var).f15726a;
            u91Var.f33322y = z10;
            View[] viewArr = u91Var.e;
            u91Var.d = i11;
            u91Var.K(1);
            u91Var.z(i11, z10);
            View view = viewArr[0];
            if (view != null) {
                i13 = view.getMeasuredWidth();
            }
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    u91Var.F(view2, i13);
                } else {
                    u91Var.F(view2, -i13);
                }
            }
        }
        c(this.F);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f32933k0 = ofFloat;
        ofFloat.addUpdateListener(new s71(2, this));
        this.f32933k0.setDuration(250L);
        this.f32933k0.setInterpolator(ds.f27584f);
        this.f32933k0.addListener(new h31(this, 7));
        this.f32933k0.start();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t91.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public abstract void e(float f7, int i10, int i11);

    public final void f(float f7, int i10) {
        int i11 = this.f32924c0.get(i10, -1);
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
            this.v.g1();
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
        this.O.setColor(org.telegram.ui.ActionBar.y6.w0(i10, this.f32932j0));
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
        return this.f32922b0.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.f32929g0;
    }

    public Drawable getSelectorDrawable() {
        return this.O;
    }

    public mm0 getTabsContainer() {
        return this.v;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.U != i14) {
            this.U = i14;
            this.N = -1;
            if (this.J) {
                AndroidUtilities.cancelRunOnUIThread(this.f32931i0);
                this.J = false;
                setEnabled(true);
                s91 s91Var = this.f32945y;
                if (s91Var != null) {
                    ((jg.i) s91Var).e0(1.0f);
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
                this.f32942s = true;
                this.f32944x.l();
                this.f32942s = false;
            }
            SparseIntArray sparseIntArray = this.f32926e0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.f32925d0;
            sparseIntArray2.clear();
            int dp = AndroidUtilities.dp(7.0f);
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                int a2 = ((q91) arrayList.get(i16)).a(this.f32923c);
                sparseIntArray2.put(i16, a2);
                sparseIntArray.put(i16, (this.I / 2) + dp);
                dp += AndroidUtilities.dp(this.f32940r * 2) + a2 + this.I;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f32942s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.K = f7;
        this.v.g1();
        invalidate();
        s91 s91Var = this.f32945y;
        if (s91Var != null) {
            ((jg.i) s91Var).e0(f7);
        }
    }

    public void setBlurredBackground(eh.d dVar) {
        this.f32941r0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(s91 s91Var) {
        this.f32945y = s91Var;
    }

    public void setIsEditing(boolean z10) {
        this.f32935n = z10;
        this.v.g1();
        invalidate();
    }

    public void setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> callback2Return) {
        this.f32921b = callback2Return;
    }

    public void setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> callback2Return) {
        this.f32934l0 = callback2Return;
    }

    public void setReordering(boolean z10) {
        bi.r1 r1Var;
        if (this.m0 == z10) {
            return;
        }
        this.m0 = z10;
        if (z10 && this.f32936n0 == null) {
            this.f32936n0 = new s4.z(new ei.f(this, 5));
        }
        if (this.m0 && this.f32937o0 == null) {
            p91 p91Var = new p91(this);
            this.f32937o0 = p91Var;
            p91Var.f47760m = false;
            p91Var.C = false;
            p91Var.o(ds.h);
            this.f32937o0.n(350L);
        }
        s4.z zVar = this.f32936n0;
        p91 p91Var2 = null;
        bi.r1 r1Var2 = this.v;
        if (zVar != null) {
            if (z10) {
                r1Var = r1Var2;
            } else {
                r1Var = null;
            }
            zVar.h(r1Var);
        }
        if (z10) {
            p91Var2 = this.f32937o0;
        }
        r1Var2.setItemAnimator(p91Var2);
        AndroidUtilities.forEachViews((RecyclerView) r1Var2, (Utilities.Callback<View>) new bi.t8(6, this, z10));
    }

    @Override
    public final void updateColors() {
        eh.d dVar = this.f32941r0;
        if (dVar != null) {
            dVar.updateColors();
        }
        GradientDrawable gradientDrawable = this.O;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(org.telegram.ui.ActionBar.y6.w0(this.P, this.f32932j0));
        }
        bi.r1 r1Var = this.v;
        if (r1Var != null) {
            r1Var.g1();
            r1Var.invalidate();
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
