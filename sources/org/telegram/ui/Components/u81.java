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
public abstract class u81 extends FrameLayout {
    public static final int f27613s0 = 0;
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
    public float f27614a;
    public final wr f27615a0;
    public Utilities.Callback2Return f27616b;
    public final SparseIntArray f27617b0;
    public final TextPaint f27618c;
    public final SparseIntArray f27619c0;
    public final TextPaint d;
    public final SparseIntArray f27620d0;
    public final TextPaint e;
    public final SparseIntArray f27621e0;
    public final Paint f27622f;
    public float f27623f0;
    public int f27624g0;
    public final ArrayList h;
    public int f27625h0;
    public final org.telegram.ui.Cells.l9 f27626i0;
    public final org.telegram.ui.ActionBar.f6 f27627j0;
    public ValueAnimator f27628k0;
    public Utilities.Callback2Return f27629l0;
    public boolean m0;
    public boolean f27630n;
    public s4.y f27631n0;
    public q81 f27632o0;
    public float f27633p0;
    public final Paint f27634q0;
    public int f27635r;
    public bh.d f27636r0;
    public boolean f27637s;
    public final bi.y1 v;
    public final fg.i0 f27638w;
    public final lg.g f27639x;
    public t81 f27640y;

    public u81(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        float f7;
        int i11;
        this.f27614a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f27618c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f27622f = new Paint(1);
        this.h = new ArrayList();
        this.f27635r = 16;
        this.G = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = org.telegram.ui.ActionBar.j6.Gh;
        this.Q = org.telegram.ui.ActionBar.j6.Fh;
        this.R = org.telegram.ui.ActionBar.j6.Eh;
        this.S = org.telegram.ui.ActionBar.j6.Hh;
        this.T = org.telegram.ui.ActionBar.j6.f18201s8;
        this.f27615a0 = wr.h;
        this.f27617b0 = new SparseIntArray(5);
        this.f27619c0 = new SparseIntArray(5);
        this.f27620d0 = new SparseIntArray(5);
        this.f27621e0 = new SparseIntArray(5);
        this.f27626i0 = new org.telegram.ui.Cells.l9(this, 23);
        this.f27634q0 = new Paint(1);
        this.f27627j0 = f6Var;
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.v0(this.P, f6Var));
        if (i10 == -2) {
            float dpf2 = AndroidUtilities.dpf2(13.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        } else {
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf22, dpf22, dpf22, dpf22, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        bi.y1 y1Var = new bi.y1(this, context, 24);
        this.v = y1Var;
        y1Var.setOverScrollMode(2);
        if (z10) {
            y1Var.setItemAnimator(null);
        } else {
            ((s4.j) y1Var.getItemAnimator()).C = false;
        }
        if (i10 == -2) {
            y1Var.setSelectorType(9);
            y1Var.setSelectorRadius(6);
        } else {
            if (i10 == 10) {
                i11 = 9;
            } else {
                i11 = i10;
            }
            y1Var.setSelectorType(i11);
            if (i10 == 3) {
                y1Var.setSelectorRadius(0);
            } else {
                y1Var.setSelectorRadius(6);
            }
        }
        y1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(this.S, f6Var));
        fg.i0 i0Var = new fg.i0((ViewGroup) this, 6);
        this.f27638w = i0Var;
        y1Var.setLayoutManager(i0Var);
        y1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        y1Var.setClipToPadding(false);
        y1Var.setDrawSelectorBehind(true);
        lg.g gVar = new lg.g(this, context);
        this.f27639x = gVar;
        gVar.C(z10);
        y1Var.setAdapter(gVar);
        y1Var.setOnItemClickListener(new o81(this));
        y1Var.setOnItemLongClickListener(new o81(this));
        y1Var.setOnScrollListener(new al0(this, 6));
        if (i10 != 9 && i10 != 10) {
            addView(y1Var, w7.a6.c(-1.0f, -1));
        } else {
            addView(y1Var, w7.a6.e(-2, -1, 1));
        }
    }

    public final void a(int i10, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.G == -1) {
            this.G = i10;
        }
        this.f27617b0.put(size, i10);
        this.f27619c0.put(i10, size);
        int i11 = this.G;
        if (i11 != -1 && i11 == i10) {
            this.F = size;
        }
        ?? obj = new Object();
        obj.f26629a = i10;
        obj.f26630b = charSequence;
        int i12 = this.H;
        this.H = org.telegram.messenger.a2.C(this.f27635r * 2, obj.a(this.f27618c), i12);
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
        bi.y1 y1Var = this.v;
        float f15 = 1.0f;
        if (z11) {
            while (i10 < y1Var.getChildCount()) {
                ViewPropertyAnimator animate = y1Var.getChildAt(i10).animate();
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
                scaleX.scaleY(f14).setInterpolator(wr.f28819f).setDuration(220L).start();
                i10++;
            }
        } else {
            while (i10 < y1Var.getChildCount()) {
                View childAt = y1Var.getChildAt(i10);
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
            bi.y1 y1Var = this.v;
            if (y1Var.getVisibility() != 8 && y1Var.getMeasuredWidth() != 0) {
                y1Var.x0(i10);
            } else {
                AndroidUtilities.runOnUIThread(new zd(this, i10, 11), 100L);
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
        this.f27624g0 = i12;
        this.f27625h0 = this.G;
        t81 t81Var = this.f27640y;
        if (t81Var != null) {
            n81 n81Var = ((v81) ((l2.h) t81Var).f12721b).L;
        }
        this.F = i11;
        this.G = i10;
        ValueAnimator valueAnimator = this.f27628k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.J) {
            this.J = false;
        }
        this.f27623f0 = 0.0f;
        this.K = 0.0f;
        this.J = true;
        setEnabled(false);
        t81 t81Var2 = this.f27640y;
        if (t81Var2 != null) {
            v81 v81Var = (v81) ((l2.h) t81Var2).f12721b;
            v81Var.f27894y = z10;
            View[] viewArr = v81Var.e;
            v81Var.d = i11;
            v81Var.I(1);
            v81Var.y(i11, z10);
            View view = viewArr[0];
            if (view != null) {
                i13 = view.getMeasuredWidth();
            }
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    v81Var.E(view2, i13);
                } else {
                    v81Var.E(view2, -i13);
                }
            }
        }
        c(this.F);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f27628k0 = ofFloat;
        ofFloat.addUpdateListener(new s61(2, this));
        this.f27628k0.setDuration(250L);
        this.f27628k0.setInterpolator(wr.f28819f);
        this.f27628k0.addListener(new zn0(this, 19));
        this.f27628k0.start();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u81.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public abstract void e(float f7, int i10, int i11);

    public final void f(float f7, int i10) {
        int i11 = this.f27619c0.get(i10, -1);
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
            this.v.e1();
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
        return this.f27617b0.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.f27624g0;
    }

    public Drawable getSelectorDrawable() {
        return this.O;
    }

    public vl0 getTabsContainer() {
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
                AndroidUtilities.cancelRunOnUIThread(this.f27626i0);
                this.J = false;
                setEnabled(true);
                t81 t81Var = this.f27640y;
                if (t81Var != null) {
                    ((l2.h) t81Var).z(1.0f);
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
                this.f27637s = true;
                this.f27639x.l();
                this.f27637s = false;
            }
            SparseIntArray sparseIntArray = this.f27621e0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.f27620d0;
            sparseIntArray2.clear();
            int dp = AndroidUtilities.dp(7.0f);
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                int a2 = ((r81) arrayList.get(i16)).a(this.f27618c);
                sparseIntArray2.put(i16, a2);
                sparseIntArray.put(i16, (this.I / 2) + dp);
                dp += AndroidUtilities.dp(this.f27635r * 2) + a2 + this.I;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f27637s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.K = f7;
        this.v.e1();
        invalidate();
        t81 t81Var = this.f27640y;
        if (t81Var != null) {
            ((l2.h) t81Var).z(f7);
        }
    }

    public void setBlurredBackground(bh.d dVar) {
        this.f27636r0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(t81 t81Var) {
        this.f27640y = t81Var;
    }

    public void setIsEditing(boolean z10) {
        this.f27630n = z10;
        this.v.e1();
        invalidate();
    }

    public void setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> callback2Return) {
        this.f27616b = callback2Return;
    }

    public void setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> callback2Return) {
        this.f27629l0 = callback2Return;
    }

    public void setReordering(boolean z10) {
        bi.y1 y1Var;
        if (this.m0 == z10) {
            return;
        }
        this.m0 = z10;
        if (z10 && this.f27631n0 == null) {
            this.f27631n0 = new s4.y(new ai.k(this, 5));
        }
        if (this.m0 && this.f27632o0 == null) {
            q81 q81Var = new q81(this);
            this.f27632o0 = q81Var;
            q81Var.f41645m = false;
            q81Var.C = false;
            q81Var.o(wr.h);
            this.f27632o0.n(350L);
        }
        s4.y yVar = this.f27631n0;
        q81 q81Var2 = null;
        bi.y1 y1Var2 = this.v;
        if (yVar != null) {
            if (z10) {
                y1Var = y1Var2;
            } else {
                y1Var = null;
            }
            yVar.d(y1Var);
        }
        if (z10) {
            q81Var2 = this.f27632o0;
        }
        y1Var2.setItemAnimator(q81Var2);
        AndroidUtilities.forEachViews((RecyclerView) y1Var2, (e2.h) new m4.v0(3, this, z10));
    }
}
