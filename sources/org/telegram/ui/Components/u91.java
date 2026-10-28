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
public abstract class u91 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public static final int f33295s0 = 0;
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
    public float f33296a;
    public final ds f33297a0;
    public Utilities.Callback2Return f33298b;
    public final SparseIntArray f33299b0;
    public final TextPaint f33300c;
    public final SparseIntArray f33301c0;
    public final TextPaint d;
    public final SparseIntArray f33302d0;
    public final TextPaint e;
    public final SparseIntArray f33303e0;
    public final Paint f33304f;
    public float f33305f0;
    public int f33306g0;
    public final ArrayList h;
    public int f33307h0;
    public final dy0 f33308i0;
    public final org.telegram.ui.ActionBar.u6 f33309j0;
    public ValueAnimator f33310k0;
    public Utilities.Callback2Return f33311l0;
    public boolean m0;
    public boolean f33312n;
    public s4.z f33313n0;
    public q91 f33314o0;
    public float f33315p0;
    public final Paint f33316q0;
    public int f33317r;
    public eh.d f33318r0;
    public boolean f33319s;
    public final bi.r1 v;
    public final ig.j0 f33320w;
    public final og.g f33321x;
    public t91 f33322y;

    public u91(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        float f7;
        int i11;
        this.f33296a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f33300c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f33304f = new Paint(1);
        this.h = new ArrayList();
        this.f33317r = 16;
        this.G = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = org.telegram.ui.ActionBar.y6.Gh;
        this.Q = org.telegram.ui.ActionBar.y6.Fh;
        this.R = org.telegram.ui.ActionBar.y6.Eh;
        this.S = org.telegram.ui.ActionBar.y6.Hh;
        this.T = org.telegram.ui.ActionBar.y6.f23637s8;
        this.f33297a0 = ds.h;
        this.f33299b0 = new SparseIntArray(5);
        this.f33301c0 = new SparseIntArray(5);
        this.f33302d0 = new SparseIntArray(5);
        this.f33303e0 = new SparseIntArray(5);
        this.f33308i0 = new dy0(this, 2);
        this.f33316q0 = new Paint(1);
        this.f33309j0 = u6Var;
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
        this.f33320w = j0Var;
        r1Var.setLayoutManager(j0Var);
        r1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        r1Var.setClipToPadding(false);
        r1Var.setDrawSelectorBehind(true);
        og.g gVar = new og.g(this, context);
        this.f33321x = gVar;
        gVar.C(z10);
        r1Var.setAdapter(gVar);
        r1Var.setOnItemClickListener(new o91(this));
        r1Var.setOnItemLongClickListener(new o91(this));
        r1Var.setOnScrollListener(new ml(this, 18));
        if (i10 != 9 && i10 != 10) {
            addView(r1Var, kb1.g(-1.0f, -1));
        } else {
            addView(r1Var, kb1.i(-2, -1, 1));
        }
    }

    public final void a(int i10, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.G == -1) {
            this.G = i10;
        }
        this.f33299b0.put(size, i10);
        this.f33301c0.put(i10, size);
        int i11 = this.G;
        if (i11 != -1 && i11 == i10) {
            this.F = size;
        }
        ?? obj = new Object();
        obj.f32186a = i10;
        obj.f32187b = charSequence;
        int i12 = this.H;
        this.H = org.telegram.messenger.t.D(this.f33317r * 2, obj.a(this.f33300c), i12);
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
                scaleX.scaleY(f14).setInterpolator(ds.f27530f).setDuration(220L).start();
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
        this.f33306g0 = i12;
        this.f33307h0 = this.G;
        this.F = i11;
        this.G = i10;
        ValueAnimator valueAnimator = this.f33310k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.J) {
            this.J = false;
        }
        this.f33305f0 = 0.0f;
        this.K = 0.0f;
        this.J = true;
        setEnabled(false);
        t91 t91Var = this.f33322y;
        if (t91Var != null) {
            v91 v91Var = (v91) ((jg.i) t91Var).f15725a;
            v91Var.f33640y = z10;
            View[] viewArr = v91Var.e;
            v91Var.d = i11;
            v91Var.K(1);
            v91Var.z(i11, z10);
            View view = viewArr[0];
            if (view != null) {
                i13 = view.getMeasuredWidth();
            }
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    v91Var.F(view2, i13);
                } else {
                    v91Var.F(view2, -i13);
                }
            }
        }
        c(this.F);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f33310k0 = ofFloat;
        ofFloat.addUpdateListener(new t71(2, this));
        this.f33310k0.setDuration(250L);
        this.f33310k0.setInterpolator(ds.f27530f);
        this.f33310k0.addListener(new i31(this, 7));
        this.f33310k0.start();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u91.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public abstract void e(float f7, int i10, int i11);

    public final void f(float f7, int i10) {
        int i11 = this.f33301c0.get(i10, -1);
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
        this.O.setColor(org.telegram.ui.ActionBar.y6.w0(i10, this.f33309j0));
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
        return this.f33299b0.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.f33306g0;
    }

    public Drawable getSelectorDrawable() {
        return this.O;
    }

    public nm0 getTabsContainer() {
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
                AndroidUtilities.cancelRunOnUIThread(this.f33308i0);
                this.J = false;
                setEnabled(true);
                t91 t91Var = this.f33322y;
                if (t91Var != null) {
                    ((jg.i) t91Var).e0(1.0f);
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
                this.f33319s = true;
                this.f33321x.l();
                this.f33319s = false;
            }
            SparseIntArray sparseIntArray = this.f33303e0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.f33302d0;
            sparseIntArray2.clear();
            int dp = AndroidUtilities.dp(7.0f);
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                int a2 = ((r91) arrayList.get(i16)).a(this.f33300c);
                sparseIntArray2.put(i16, a2);
                sparseIntArray.put(i16, (this.I / 2) + dp);
                dp += AndroidUtilities.dp(this.f33317r * 2) + a2 + this.I;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f33319s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.K = f7;
        this.v.g1();
        invalidate();
        t91 t91Var = this.f33322y;
        if (t91Var != null) {
            ((jg.i) t91Var).e0(f7);
        }
    }

    public void setBlurredBackground(eh.d dVar) {
        this.f33318r0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(t91 t91Var) {
        this.f33322y = t91Var;
    }

    public void setIsEditing(boolean z10) {
        this.f33312n = z10;
        this.v.g1();
        invalidate();
    }

    public void setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> callback2Return) {
        this.f33298b = callback2Return;
    }

    public void setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> callback2Return) {
        this.f33311l0 = callback2Return;
    }

    public void setReordering(boolean z10) {
        bi.r1 r1Var;
        if (this.m0 == z10) {
            return;
        }
        this.m0 = z10;
        if (z10 && this.f33313n0 == null) {
            this.f33313n0 = new s4.z(new ei.f(this, 5));
        }
        if (this.m0 && this.f33314o0 == null) {
            q91 q91Var = new q91(this);
            this.f33314o0 = q91Var;
            q91Var.f47798m = false;
            q91Var.C = false;
            q91Var.o(ds.h);
            this.f33314o0.n(350L);
        }
        s4.z zVar = this.f33313n0;
        q91 q91Var2 = null;
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
            q91Var2 = this.f33314o0;
        }
        r1Var2.setItemAnimator(q91Var2);
        AndroidUtilities.forEachViews((RecyclerView) r1Var2, (Utilities.Callback<View>) new bi.t8(6, this, z10));
    }

    @Override
    public final void updateColors() {
        eh.d dVar = this.f33318r0;
        if (dVar != null) {
            dVar.updateColors();
        }
        GradientDrawable gradientDrawable = this.O;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(org.telegram.ui.ActionBar.y6.w0(this.P, this.f33309j0));
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
