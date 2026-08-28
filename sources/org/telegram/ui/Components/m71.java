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
public abstract class m71 extends FrameLayout {
    public static final int f30735o0 = 0;
    public final int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public float G;
    public int H;
    public int I;
    public int J;
    public final GradientDrawable K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public float S;
    public final gr T;
    public final SparseIntArray U;
    public final SparseIntArray V;
    public final SparseIntArray W;
    public float f30736a;
    public final SparseIntArray f30737a0;
    public Utilities.Callback2Return f30738b;
    public float f30739b0;
    public final TextPaint f30740c;
    public int f30741c0;
    public final TextPaint d;
    public int f30742d0;
    public final TextPaint f30743e;
    public final ju0 f30744e0;
    public final Paint f30745f;
    public final org.telegram.ui.ActionBar.b6 f30746f0;
    public ValueAnimator f30747g0;
    public final ArrayList h;
    public Utilities.Callback2Return f30748h0;
    public boolean f30749i0;
    public f2.h0 f30750j0;
    public h71 f30751k0;
    public float f30752l0;
    public final Paint m0;
    public boolean f30753n;
    public kg.d f30754n0;
    public int f30755r;
    public boolean f30756s;
    public final gh.f1 v;
    public final of.g0 f30757w;
    public final i71 f30758x;
    public l71 f30759y;

    public m71(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        float f10;
        int i10;
        this.f30736a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f30740c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f30743e = textPaint3;
        this.f30745f = new Paint(1);
        this.h = new ArrayList();
        this.f30755r = 16;
        this.C = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.L = org.telegram.ui.ActionBar.f6.Gh;
        this.M = org.telegram.ui.ActionBar.f6.Fh;
        this.N = org.telegram.ui.ActionBar.f6.Eh;
        this.O = org.telegram.ui.ActionBar.f6.Hh;
        this.P = org.telegram.ui.ActionBar.f6.f23269s8;
        this.T = gr.h;
        this.U = new SparseIntArray(5);
        this.V = new SparseIntArray(5);
        this.W = new SparseIntArray(5);
        this.f30737a0 = new SparseIntArray(5);
        this.f30744e0 = new ju0(this, 2);
        this.m0 = new Paint(1);
        this.f30746f0 = b6Var;
        this.A = i9;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        if (i9 != 9 && i9 != 10 && i9 != -2) {
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
        this.K = gradientDrawable;
        gradientDrawable.setColor(org.telegram.ui.ActionBar.f6.v0(this.L, b6Var));
        if (i9 == -2) {
            float dpf2 = AndroidUtilities.dpf2(13.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        } else {
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf22, dpf22, dpf22, dpf22, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        gh.f1 f1Var = new gh.f1(this, context, 25);
        this.v = f1Var;
        f1Var.setOverScrollMode(2);
        if (z10) {
            f1Var.setItemAnimator(null);
        } else {
            ((f2.n) f1Var.getItemAnimator()).C = false;
        }
        if (i9 == -2) {
            f1Var.setSelectorType(9);
            f1Var.setSelectorRadius(6);
        } else {
            if (i9 == 10) {
                i10 = 9;
            } else {
                i10 = i9;
            }
            f1Var.setSelectorType(i10);
            if (i9 == 3) {
                f1Var.setSelectorRadius(0);
            } else {
                f1Var.setSelectorRadius(6);
            }
        }
        f1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.v0(this.O, b6Var));
        of.g0 g0Var = new of.g0((ViewGroup) this, 6);
        this.f30757w = g0Var;
        f1Var.setLayoutManager(g0Var);
        f1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        f1Var.setClipToPadding(false);
        f1Var.setDrawSelectorBehind(true);
        i71 i71Var = new i71(this, context);
        this.f30758x = i71Var;
        i71Var.C(z10);
        f1Var.setAdapter(i71Var);
        f1Var.setOnItemClickListener(new f71(this));
        f1Var.setOnItemLongClickListener(new f71(this));
        f1Var.setOnScrollListener(new kn(this, 15));
        if (i9 != 9 && i9 != 10) {
            addView(f1Var, g7.e6.c(-1.0f, -1));
        } else {
            addView(f1Var, g7.e6.e(-2, -1, 1));
        }
    }

    public final void a(int i9, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.C == -1) {
            this.C = i9;
        }
        this.U.put(size, i9);
        this.V.put(i9, size);
        int i10 = this.C;
        if (i10 != -1 && i10 == i9) {
            this.B = size;
        }
        ?? obj = new Object();
        obj.f29664a = i9;
        obj.f29665b = charSequence;
        int i11 = this.D;
        this.D = org.telegram.messenger.l0.C(this.f30755r * 2, obj.a(this.f30740c), i11);
        arrayList.add(obj);
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        this.R = z10;
        int i9 = 0;
        gh.f1 f1Var = this.v;
        float f16 = 1.0f;
        if (z11) {
            while (i9 < f1Var.getChildCount()) {
                ViewPropertyAnimator animate = f1Var.getChildAt(i9).animate();
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
                scaleX.scaleY(f15).setInterpolator(gr.f28844f).setDuration(220L).start();
                i9++;
            }
        } else {
            while (i9 < f1Var.getChildCount()) {
                View childAt = f1Var.getChildAt(i9);
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
                i9++;
            }
            if (!z10) {
                f16 = 0.0f;
            }
            this.S = f16;
        }
        invalidate();
    }

    public final void c(int i9) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.J != i9 && i9 >= 0 && i9 < arrayList.size()) {
            this.J = i9;
            gh.f1 f1Var = this.v;
            if (f1Var.getVisibility() != 8 && f1Var.getMeasuredWidth() != 0) {
                f1Var.x0(i9);
            } else {
                AndroidUtilities.runOnUIThread(new qd(this, i9, 11), 100L);
            }
        }
    }

    public final void d(int i9, int i10) {
        boolean z10;
        int i11 = this.B;
        int i12 = 0;
        if (i11 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.J = -1;
        this.f30741c0 = i11;
        this.f30742d0 = this.C;
        l71 l71Var = this.f30759y;
        if (l71Var != null) {
            e71 e71Var = ((n71) ((n2.p) l71Var).f18343b).H;
        }
        this.B = i10;
        this.C = i9;
        ValueAnimator valueAnimator = this.f30747g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.F) {
            this.F = false;
        }
        this.f30739b0 = 0.0f;
        this.G = 0.0f;
        this.F = true;
        setEnabled(false);
        l71 l71Var2 = this.f30759y;
        if (l71Var2 != null) {
            n71 n71Var = (n71) ((n2.p) l71Var2).f18343b;
            n71Var.f31042y = z10;
            View[] viewArr = n71Var.f31035e;
            n71Var.d = i10;
            n71Var.I(1);
            n71Var.y(i10, z10);
            View view = viewArr[0];
            if (view != null) {
                i12 = view.getMeasuredWidth();
            }
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    n71Var.E(view2, i12);
                } else {
                    n71Var.E(view2, -i12);
                }
            }
        }
        c(this.B);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f30747g0 = ofFloat;
        ofFloat.addUpdateListener(new j51(2, this));
        this.f30747g0.setDuration(250L);
        this.f30747g0.setInterpolator(gr.f28844f);
        this.f30747g0.addListener(new y11(this, 5));
        this.f30747g0.start();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m71.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public abstract void e(float f10, int i9, int i10);

    public final void f(float f10, int i9) {
        int i10 = this.V.get(i9, -1);
        if (i10 >= 0) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (f10 > 0.0f) {
                this.H = i10;
                this.I = i9;
            } else {
                this.H = -1;
                this.I = -1;
            }
            this.G = f10;
            this.v.f1();
            invalidate();
            c(i10);
            if (f10 >= 1.0f) {
                this.H = -1;
                this.I = -1;
                this.B = i10;
                this.C = i9;
            }
        }
    }

    public float getAnimatingIndicatorProgress() {
        return this.G;
    }

    public int getCurrentPosition() {
        return this.B;
    }

    public int getCurrentTabId() {
        return this.C;
    }

    public int getFirstTabId() {
        return this.U.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.f30741c0;
    }

    public Drawable getSelectorDrawable() {
        return this.K;
    }

    public wk0 getTabsContainer() {
        return this.v;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        int i13 = i11 - i9;
        if (this.Q != i13) {
            this.Q = i13;
            this.J = -1;
            if (this.F) {
                AndroidUtilities.cancelRunOnUIThread(this.f30744e0);
                this.F = false;
                setEnabled(true);
                l71 l71Var = this.f30759y;
                if (l71Var != null) {
                    ((n2.p) l71Var).F(1.0f);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = (View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(7.0f)) - AndroidUtilities.dp(7.0f);
            int i13 = this.E;
            if (arrayList.size() != 1 && (i11 = this.A) != 9 && i11 != 10) {
                int i14 = this.D;
                if (i14 < size) {
                    i12 = (size - i14) / arrayList.size();
                } else {
                    i12 = 0;
                }
                this.E = i12;
            } else {
                this.E = 0;
            }
            if (i13 != this.E) {
                this.f30756s = true;
                this.f30758x.l();
                this.f30756s = false;
            }
            SparseIntArray sparseIntArray = this.f30737a0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.W;
            sparseIntArray2.clear();
            int dp = AndroidUtilities.dp(7.0f);
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                int a2 = ((j71) arrayList.get(i15)).a(this.f30740c);
                sparseIntArray2.put(i15, a2);
                sparseIntArray.put(i15, (this.E / 2) + dp);
                dp += AndroidUtilities.dp(this.f30755r * 2) + a2 + this.E;
            }
        }
        super.onMeasure(i9, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f30756s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.G = f10;
        this.v.f1();
        invalidate();
        l71 l71Var = this.f30759y;
        if (l71Var != null) {
            ((n2.p) l71Var).F(f10);
        }
    }

    public void setBlurredBackground(kg.d dVar) {
        this.f30754n0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(l71 l71Var) {
        this.f30759y = l71Var;
    }

    public void setIsEditing(boolean z10) {
        this.f30753n = z10;
        this.v.f1();
        invalidate();
    }

    public void setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> callback2Return) {
        this.f30738b = callback2Return;
    }

    public void setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> callback2Return) {
        this.f30748h0 = callback2Return;
    }

    public void setReordering(boolean z10) {
        gh.f1 f1Var;
        if (this.f30749i0 == z10) {
            return;
        }
        this.f30749i0 = z10;
        if (z10 && this.f30750j0 == null) {
            this.f30750j0 = new f2.h0(new jh.f(this, 5));
        }
        if (this.f30749i0 && this.f30751k0 == null) {
            h71 h71Var = new h71(this);
            this.f30751k0 = h71Var;
            h71Var.f5532m = false;
            h71Var.C = false;
            h71Var.o(gr.h);
            this.f30751k0.n(350L);
        }
        f2.h0 h0Var = this.f30750j0;
        h71 h71Var2 = null;
        gh.f1 f1Var2 = this.v;
        if (h0Var != null) {
            if (z10) {
                f1Var = f1Var2;
            } else {
                f1Var = null;
            }
            h0Var.d(f1Var);
        }
        if (z10) {
            h71Var2 = this.f30751k0;
        }
        f1Var2.setItemAnimator(h71Var2);
        AndroidUtilities.forEachViews((RecyclerView) f1Var2, (d5.d) new org.telegram.ui.kc(2, this, z10));
    }
}
