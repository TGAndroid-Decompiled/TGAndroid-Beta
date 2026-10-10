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
public abstract class o91 extends FrameLayout {
    public static final int f29399s0 = 0;
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
    public float f29400a;
    public final is f29401a0;
    public Utilities.Callback2Return f29402b;
    public final SparseIntArray f29403b0;
    public final TextPaint f29404c;
    public final SparseIntArray f29405c0;
    public final TextPaint d;
    public final SparseIntArray f29406d0;
    public final TextPaint f29407e;
    public final SparseIntArray f29408e0;
    public final Paint f29409f;
    public float f29410f0;
    public int f29411g0;
    public final ArrayList h;
    public int f29412h0;
    public final org.telegram.ui.Cells.t6 f29413i0;
    public final org.telegram.ui.ActionBar.e6 f29414j0;
    public ValueAnimator f29415k0;
    public Utilities.Callback2Return f29416l0;
    public boolean m0;
    public boolean f29417n;
    public s4.z f29418n0;
    public k91 f29419o0;
    public float f29420p0;
    public final Paint f29421q0;
    public int f29422r;
    public ch.d f29423r0;
    public boolean f29424s;
    public final ai.w0 v;
    public final gg.i0 f29425w;
    public final mg.g f29426x;
    public n91 f29427y;

    public o91(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        float f7;
        int i11;
        int i12;
        this.f29400a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f29404c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f29407e = textPaint3;
        this.f29409f = new Paint(1);
        this.h = new ArrayList();
        this.f29422r = 16;
        this.G = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = org.telegram.ui.ActionBar.i6.Gh;
        this.Q = org.telegram.ui.ActionBar.i6.Fh;
        this.R = org.telegram.ui.ActionBar.i6.Eh;
        this.S = org.telegram.ui.ActionBar.i6.Hh;
        this.T = org.telegram.ui.ActionBar.i6.f21079s8;
        this.f29401a0 = is.h;
        this.f29403b0 = new SparseIntArray(5);
        this.f29405c0 = new SparseIntArray(5);
        this.f29406d0 = new SparseIntArray(5);
        this.f29408e0 = new SparseIntArray(5);
        this.f29413i0 = new org.telegram.ui.Cells.t6(this, 25);
        this.f29421q0 = new Paint(1);
        this.f29414j0 = e6Var;
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.i6.w0(this.P, e6Var));
        if (i10 == -2) {
            float dpf2 = AndroidUtilities.dpf2(13.0f);
            i11 = 3;
            gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        } else {
            i11 = 3;
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf22, dpf22, dpf22, dpf22, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        ai.w0 w0Var = new ai.w0(this, context, 25);
        this.v = w0Var;
        w0Var.setOverScrollMode(2);
        if (z10) {
            w0Var.setItemAnimator(null);
        } else {
            ((s4.j) w0Var.getItemAnimator()).C = false;
        }
        if (i10 == -2) {
            w0Var.setSelectorType(9);
            w0Var.setSelectorRadius(6);
        } else {
            if (i10 == 10) {
                i12 = 9;
            } else {
                i12 = i10;
            }
            w0Var.setSelectorType(i12);
            if (i10 == i11) {
                w0Var.setSelectorRadius(0);
            } else {
                w0Var.setSelectorRadius(6);
            }
        }
        w0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.w0(this.S, e6Var));
        gg.i0 i0Var = new gg.i0((ViewGroup) this, 6);
        this.f29425w = i0Var;
        w0Var.setLayoutManager(i0Var);
        w0Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        w0Var.setClipToPadding(false);
        w0Var.setDrawSelectorBehind(true);
        mg.g gVar = new mg.g(this, context);
        this.f29426x = gVar;
        gVar.C(z10);
        w0Var.setAdapter(gVar);
        w0Var.setOnItemClickListener(new h91(this));
        w0Var.setOnItemLongClickListener(new h91(this));
        w0Var.setOnScrollListener(new nh0(this, 8));
        if (i10 != 9 && i10 != 10) {
            addView(w0Var, w7.x5.d(-1.0f, -1));
        } else {
            addView(w0Var, w7.x5.e(-2, -1, 1));
        }
    }

    public final void a(int i10, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.G == -1) {
            this.G = i10;
        }
        this.f29403b0.put(size, i10);
        this.f29405c0.put(i10, size);
        int i11 = this.G;
        if (i11 != -1 && i11 == i10) {
            this.F = size;
        }
        ?? obj = new Object();
        obj.f28275a = i10;
        obj.f28276b = charSequence;
        int i12 = this.H;
        this.H = org.telegram.messenger.q.C(this.f29422r * 2, obj.a(this.f29404c), i12);
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
        ai.w0 w0Var = this.v;
        float f15 = 1.0f;
        if (z11) {
            while (i10 < w0Var.getChildCount()) {
                ViewPropertyAnimator animate = w0Var.getChildAt(i10).animate();
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
                scaleX.scaleY(f14).setInterpolator(is.f27443f).setDuration(220L).start();
                i10++;
            }
        } else {
            while (i10 < w0Var.getChildCount()) {
                View childAt = w0Var.getChildAt(i10);
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
            ai.w0 w0Var = this.v;
            if (w0Var.getVisibility() != 8 && w0Var.getMeasuredWidth() != 0) {
                w0Var.x0(i10);
            } else {
                AndroidUtilities.runOnUIThread(new nd(this, i10, 13), 100L);
            }
        }
    }

    public final void d(int i10, int i11) {
        boolean z10;
        int i12;
        int i13 = this.F;
        if (i13 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.N = -1;
        this.f29411g0 = i13;
        this.f29412h0 = this.G;
        n91 n91Var = this.f29427y;
        if (n91Var != null) {
            g91 g91Var = ((p91) ((m2.t) n91Var).f15976b).L;
        }
        this.F = i11;
        this.G = i10;
        ValueAnimator valueAnimator = this.f29415k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.J) {
            this.J = false;
        }
        this.f29410f0 = 0.0f;
        this.K = 0.0f;
        this.J = true;
        setEnabled(false);
        n91 n91Var2 = this.f29427y;
        if (n91Var2 != null) {
            p91 p91Var = (p91) ((m2.t) n91Var2).f15976b;
            p91Var.f29741y = z10;
            View[] viewArr = p91Var.f29734e;
            p91Var.d = i11;
            p91Var.I(1);
            p91Var.y(i11, z10);
            View view = viewArr[0];
            if (view != null) {
                i12 = view.getMeasuredWidth();
            } else {
                i12 = 0;
            }
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    p91Var.E(view2, i12);
                } else {
                    p91Var.E(view2, -i12);
                }
            }
        }
        c(this.F);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f29415k0 = ofFloat;
        ofFloat.addUpdateListener(new v51(3, this));
        this.f29415k0.setDuration(250L);
        this.f29415k0.setInterpolator(is.f27443f);
        this.f29415k0.addListener(new j91(this, 0));
        this.f29415k0.start();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o91.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public abstract void e(float f7, int i10, int i11);

    public final void f(float f7, int i10) {
        int i11 = this.f29405c0.get(i10, -1);
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
            this.v.f1();
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
        this.O.setColor(org.telegram.ui.ActionBar.i6.w0(i10, this.f29414j0));
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
        return this.f29403b0.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.f29411g0;
    }

    public Drawable getSelectorDrawable() {
        return this.O;
    }

    public rm0 getTabsContainer() {
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
                AndroidUtilities.cancelRunOnUIThread(this.f29413i0);
                this.J = false;
                setEnabled(true);
                n91 n91Var = this.f29427y;
                if (n91Var != null) {
                    ((m2.t) n91Var).D(1.0f);
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
                this.f29424s = true;
                this.f29426x.l();
                this.f29424s = false;
            }
            SparseIntArray sparseIntArray = this.f29408e0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.f29406d0;
            sparseIntArray2.clear();
            int dp = AndroidUtilities.dp(7.0f);
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                int a2 = ((l91) arrayList.get(i16)).a(this.f29404c);
                sparseIntArray2.put(i16, a2);
                sparseIntArray.put(i16, (this.I / 2) + dp);
                dp += AndroidUtilities.dp(this.f29422r * 2) + a2 + this.I;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f29424s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.K = f7;
        this.v.f1();
        invalidate();
        n91 n91Var = this.f29427y;
        if (n91Var != null) {
            ((m2.t) n91Var).D(f7);
        }
    }

    public void setBlurredBackground(ch.d dVar) {
        this.f29423r0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(n91 n91Var) {
        this.f29427y = n91Var;
    }

    public void setIsEditing(boolean z10) {
        this.f29417n = z10;
        this.v.f1();
        invalidate();
    }

    public void setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> callback2Return) {
        this.f29402b = callback2Return;
    }

    public void setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> callback2Return) {
        this.f29416l0 = callback2Return;
    }

    public void setReordering(boolean z10) {
        ai.w0 w0Var;
        if (this.m0 == z10) {
            return;
        }
        this.m0 = z10;
        if (z10 && this.f29418n0 == null) {
            this.f29418n0 = new s4.z(new bi.g(this, 5));
        }
        if (this.m0 && this.f29419o0 == null) {
            k91 k91Var = new k91(this);
            this.f29419o0 = k91Var;
            k91Var.f47742m = false;
            k91Var.C = false;
            k91Var.o(is.h);
            this.f29419o0.n(350L);
        }
        s4.z zVar = this.f29418n0;
        k91 k91Var2 = null;
        ai.w0 w0Var2 = this.v;
        if (zVar != null) {
            if (z10) {
                w0Var = w0Var2;
            } else {
                w0Var = null;
            }
            zVar.e(w0Var);
        }
        if (z10) {
            k91Var2 = this.f29419o0;
        }
        w0Var2.setItemAnimator(k91Var2);
        AndroidUtilities.forEachViews((RecyclerView) w0Var2, (Utilities.Callback<View>) new ai.j3(5, this, z10));
    }
}
