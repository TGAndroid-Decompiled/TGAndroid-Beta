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
public abstract class y71 extends FrameLayout {
    public static final int f34939o0 = 0;
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
    public final jr T;
    public final SparseIntArray U;
    public final SparseIntArray V;
    public final SparseIntArray W;
    public float f34940a;
    public final SparseIntArray f34941a0;
    public Utilities.Callback2Return f34942b;
    public float f34943b0;
    public final TextPaint f34944c;
    public int f34945c0;
    public final TextPaint d;
    public int f34946d0;
    public final TextPaint f34947e;
    public final rk0 f34948e0;
    public final Paint f34949f;
    public final org.telegram.ui.ActionBar.c6 f34950f0;
    public ValueAnimator f34951g0;
    public final ArrayList h;
    public Utilities.Callback2Return f34952h0;
    public boolean f34953i0;
    public f2.e0 f34954j0;
    public t71 f34955k0;
    public float f34956l0;
    public final Paint m0;
    public boolean f34957n;
    public ng.d f34958n0;
    public int f34959r;
    public boolean f34960s;
    public final jh.e1 v;
    public final org.telegram.ui.vq f34961w;
    public final u71 f34962x;
    public x71 f34963y;

    public y71(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        float f9;
        int i11;
        this.f34940a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f34944c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f34947e = textPaint3;
        this.f34949f = new Paint(1);
        this.h = new ArrayList();
        this.f34959r = 16;
        this.C = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.L = org.telegram.ui.ActionBar.g6.Gh;
        this.M = org.telegram.ui.ActionBar.g6.Fh;
        this.N = org.telegram.ui.ActionBar.g6.Eh;
        this.O = org.telegram.ui.ActionBar.g6.Hh;
        this.P = org.telegram.ui.ActionBar.g6.f23329s8;
        this.T = jr.h;
        this.U = new SparseIntArray(5);
        this.V = new SparseIntArray(5);
        this.W = new SparseIntArray(5);
        this.f34941a0 = new SparseIntArray(5);
        this.f34948e0 = new rk0(this, 5);
        this.m0 = new Paint(1);
        this.f34950f0 = c6Var;
        this.A = i10;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        if (i10 != 9 && i10 != 10 && i10 != -2) {
            f9 = 15.0f;
        } else {
            f9 = 14.0f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(f9));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.K = gradientDrawable;
        gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.v0(this.L, c6Var));
        if (i10 == -2) {
            float dpf2 = AndroidUtilities.dpf2(13.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        } else {
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf22, dpf22, dpf22, dpf22, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        jh.e1 e1Var = new jh.e1(this, context, 24);
        this.v = e1Var;
        e1Var.setOverScrollMode(2);
        if (z10) {
            e1Var.setItemAnimator(null);
        } else {
            ((f2.l) e1Var.getItemAnimator()).C = false;
        }
        if (i10 == -2) {
            e1Var.setSelectorType(9);
            e1Var.setSelectorRadius(6);
        } else {
            if (i10 == 10) {
                i11 = 9;
            } else {
                i11 = i10;
            }
            e1Var.setSelectorType(i11);
            if (i10 == 3) {
                e1Var.setSelectorRadius(0);
            } else {
                e1Var.setSelectorRadius(6);
            }
        }
        e1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(this.O, c6Var));
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq((ViewGroup) this, 5);
        this.f34961w = vqVar;
        e1Var.setLayoutManager(vqVar);
        e1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        e1Var.setClipToPadding(false);
        e1Var.setDrawSelectorBehind(true);
        u71 u71Var = new u71(this, context);
        this.f34962x = u71Var;
        u71Var.C(z10);
        e1Var.setAdapter(u71Var);
        e1Var.setOnItemClickListener(new r71(this));
        e1Var.setOnItemLongClickListener(new r71(this));
        e1Var.setOnScrollListener(new h00(this, 11));
        if (i10 != 9 && i10 != 10) {
            addView(e1Var, i7.f6.c(-1.0f, -1));
        } else {
            addView(e1Var, i7.f6.e(-2, -1, 1));
        }
    }

    public final void a(int i10, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.C == -1) {
            this.C = i10;
        }
        this.U.put(size, i10);
        this.V.put(i10, size);
        int i11 = this.C;
        if (i11 != -1 && i11 == i10) {
            this.B = size;
        }
        ?? obj = new Object();
        obj.f33488a = i10;
        obj.f33489b = charSequence;
        int i12 = this.D;
        this.D = org.telegram.messenger.x3.C(this.f34959r * 2, obj.a(this.f34944c), i12);
        arrayList.add(obj);
    }

    public final void b(boolean z10, boolean z11) {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        this.R = z10;
        int i10 = 0;
        jh.e1 e1Var = this.v;
        float f15 = 1.0f;
        if (z11) {
            while (i10 < e1Var.getChildCount()) {
                ViewPropertyAnimator animate = e1Var.getChildAt(i10).animate();
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
                scaleX.scaleY(f14).setInterpolator(jr.f29800f).setDuration(220L).start();
                i10++;
            }
        } else {
            while (i10 < e1Var.getChildCount()) {
                View childAt = e1Var.getChildAt(i10);
                if (z10) {
                    f9 = 0.0f;
                } else {
                    f9 = 1.0f;
                }
                childAt.setScaleX(f9);
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
            this.S = f15;
        }
        invalidate();
    }

    public final void c(int i10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.J != i10 && i10 >= 0 && i10 < arrayList.size()) {
            this.J = i10;
            jh.e1 e1Var = this.v;
            if (e1Var.getVisibility() != 8 && e1Var.getMeasuredWidth() != 0) {
                e1Var.x0(i10);
            } else {
                AndroidUtilities.runOnUIThread(new i8(this, i10, 13), 100L);
            }
        }
    }

    public final void d(int i10, int i11) {
        boolean z10;
        int i12 = this.B;
        int i13 = 0;
        if (i12 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.J = -1;
        this.f34945c0 = i12;
        this.f34946d0 = this.C;
        x71 x71Var = this.f34963y;
        if (x71Var != null) {
            q71 q71Var = ((z71) ((n) x71Var).f30787b).H;
        }
        this.B = i11;
        this.C = i10;
        ValueAnimator valueAnimator = this.f34951g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.F) {
            this.F = false;
        }
        this.f34943b0 = 0.0f;
        this.G = 0.0f;
        this.F = true;
        setEnabled(false);
        x71 x71Var2 = this.f34963y;
        if (x71Var2 != null) {
            z71 z71Var = (z71) ((n) x71Var2).f30787b;
            z71Var.f35268y = z10;
            View[] viewArr = z71Var.f35261e;
            z71Var.d = i11;
            z71Var.I(1);
            z71Var.y(i11, z10);
            View view = viewArr[0];
            if (view != null) {
                i13 = view.getMeasuredWidth();
            }
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    z71Var.E(view2, i13);
                } else {
                    z71Var.E(view2, -i13);
                }
            }
        }
        c(this.B);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f34951g0 = ofFloat;
        ofFloat.addUpdateListener(new v51(2, this));
        this.f34951g0.setDuration(250L);
        this.f34951g0.setInterpolator(jr.f29800f);
        this.f34951g0.addListener(new p11(this, 7));
        this.f34951g0.start();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y71.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public abstract void e(float f9, int i10, int i11);

    public final void f(float f9, int i10) {
        int i11 = this.V.get(i10, -1);
        if (i11 >= 0) {
            if (f9 < 0.0f) {
                f9 = 0.0f;
            } else if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            if (f9 > 0.0f) {
                this.H = i11;
                this.I = i10;
            } else {
                this.H = -1;
                this.I = -1;
            }
            this.G = f9;
            this.v.f1();
            invalidate();
            c(i11);
            if (f9 >= 1.0f) {
                this.H = -1;
                this.I = -1;
                this.B = i11;
                this.C = i10;
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
        return this.f34945c0;
    }

    public Drawable getSelectorDrawable() {
        return this.K;
    }

    public jl0 getTabsContainer() {
        return this.v;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.Q != i14) {
            this.Q = i14;
            this.J = -1;
            if (this.F) {
                AndroidUtilities.cancelRunOnUIThread(this.f34948e0);
                this.F = false;
                setEnabled(true);
                x71 x71Var = this.f34963y;
                if (x71Var != null) {
                    ((n) x71Var).j(1.0f);
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
            int i14 = this.E;
            if (arrayList.size() != 1 && (i12 = this.A) != 9 && i12 != 10) {
                int i15 = this.D;
                if (i15 < size) {
                    i13 = (size - i15) / arrayList.size();
                } else {
                    i13 = 0;
                }
                this.E = i13;
            } else {
                this.E = 0;
            }
            if (i14 != this.E) {
                this.f34960s = true;
                this.f34962x.l();
                this.f34960s = false;
            }
            SparseIntArray sparseIntArray = this.f34941a0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.W;
            sparseIntArray2.clear();
            int dp = AndroidUtilities.dp(7.0f);
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                int a2 = ((v71) arrayList.get(i16)).a(this.f34944c);
                sparseIntArray2.put(i16, a2);
                sparseIntArray.put(i16, (this.E / 2) + dp);
                dp += AndroidUtilities.dp(this.f34959r * 2) + a2 + this.E;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f34960s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f9) {
        this.G = f9;
        this.v.f1();
        invalidate();
        x71 x71Var = this.f34963y;
        if (x71Var != null) {
            ((n) x71Var).j(f9);
        }
    }

    public void setBlurredBackground(ng.d dVar) {
        this.f34958n0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(x71 x71Var) {
        this.f34963y = x71Var;
    }

    public void setIsEditing(boolean z10) {
        this.f34957n = z10;
        this.v.f1();
        invalidate();
    }

    public void setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> callback2Return) {
        this.f34942b = callback2Return;
    }

    public void setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> callback2Return) {
        this.f34952h0 = callback2Return;
    }

    public void setReordering(boolean z10) {
        jh.e1 e1Var;
        if (this.f34953i0 == z10) {
            return;
        }
        this.f34953i0 = z10;
        if (z10 && this.f34954j0 == null) {
            this.f34954j0 = new f2.e0(new mh.f(this, 5));
        }
        if (this.f34953i0 && this.f34955k0 == null) {
            t71 t71Var = new t71(this);
            this.f34955k0 = t71Var;
            t71Var.f6463m = false;
            t71Var.C = false;
            t71Var.o(jr.h);
            this.f34955k0.n(350L);
        }
        f2.e0 e0Var = this.f34954j0;
        t71 t71Var2 = null;
        jh.e1 e1Var2 = this.v;
        if (e0Var != null) {
            if (z10) {
                e1Var = e1Var2;
            } else {
                e1Var = null;
            }
            e0Var.d(e1Var);
        }
        if (z10) {
            t71Var2 = this.f34955k0;
        }
        e1Var2.setItemAnimator(t71Var2);
        AndroidUtilities.forEachViews((RecyclerView) e1Var2, (f5.d) new org.telegram.ui.jc(2, this, z10));
    }
}
