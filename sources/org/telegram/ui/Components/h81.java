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
public abstract class h81 extends FrameLayout {
    public static final int f26631s0 = 0;
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
    public float f26632a;
    public final pr f26633a0;
    public Utilities.Callback2Return f26634b;
    public final SparseIntArray f26635b0;
    public final TextPaint f26636c;
    public final SparseIntArray f26637c0;
    public final TextPaint d;
    public final SparseIntArray f26638d0;
    public final TextPaint f26639e;
    public final SparseIntArray f26640e0;
    public final Paint f26641f;
    public float f26642f0;
    public int f26643g0;
    public final ArrayList h;
    public int f26644h0;
    public final org.telegram.ui.Cells.l7 f26645i0;
    public final org.telegram.ui.ActionBar.f6 f26646j0;
    public ValueAnimator f26647k0;
    public Utilities.Callback2Return f26648l0;
    public boolean m0;
    public boolean f26649n;
    public s4.y f26650n0;
    public d81 f26651o0;
    public float f26652p0;
    public final Paint f26653q0;
    public int f26654r;
    public dh.d f26655r0;
    public boolean f26656s;
    public final bi.o0 v;
    public final hg.j0 f26657w;
    public final ng.g f26658x;
    public g81 f26659y;

    public h81(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        float f7;
        int i11;
        this.f26632a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f26636c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f26639e = textPaint3;
        this.f26641f = new Paint(1);
        this.h = new ArrayList();
        this.f26654r = 16;
        this.G = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = org.telegram.ui.ActionBar.j6.Gh;
        this.Q = org.telegram.ui.ActionBar.j6.Fh;
        this.R = org.telegram.ui.ActionBar.j6.Eh;
        this.S = org.telegram.ui.ActionBar.j6.Hh;
        this.T = org.telegram.ui.ActionBar.j6.f20937s8;
        this.f26633a0 = pr.h;
        this.f26635b0 = new SparseIntArray(5);
        this.f26637c0 = new SparseIntArray(5);
        this.f26638d0 = new SparseIntArray(5);
        this.f26640e0 = new SparseIntArray(5);
        this.f26645i0 = new org.telegram.ui.Cells.l7(this, 25);
        this.f26653q0 = new Paint(1);
        this.f26646j0 = f6Var;
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
        bi.o0 o0Var = new bi.o0(this, context, 25);
        this.v = o0Var;
        o0Var.setOverScrollMode(2);
        if (z10) {
            o0Var.setItemAnimator(null);
        } else {
            ((s4.j) o0Var.getItemAnimator()).C = false;
        }
        if (i10 == -2) {
            o0Var.setSelectorType(9);
            o0Var.setSelectorRadius(6);
        } else {
            if (i10 == 10) {
                i11 = 9;
            } else {
                i11 = i10;
            }
            o0Var.setSelectorType(i11);
            if (i10 == 3) {
                o0Var.setSelectorRadius(0);
            } else {
                o0Var.setSelectorRadius(6);
            }
        }
        o0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(this.S, f6Var));
        hg.j0 j0Var = new hg.j0((ViewGroup) this, 6);
        this.f26657w = j0Var;
        o0Var.setLayoutManager(j0Var);
        o0Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        o0Var.setClipToPadding(false);
        o0Var.setDrawSelectorBehind(true);
        ng.g gVar = new ng.g(this, context);
        this.f26658x = gVar;
        gVar.C(z10);
        o0Var.setAdapter(gVar);
        o0Var.setOnItemClickListener(new b81(this));
        o0Var.setOnItemLongClickListener(new b81(this));
        o0Var.setOnScrollListener(new lb0(this, 9));
        if (i10 != 9 && i10 != 10) {
            addView(o0Var, w7.x5.c(-1.0f, -1));
        } else {
            addView(o0Var, w7.x5.e(-2, -1, 1));
        }
    }

    public final void a(int i10, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.G == -1) {
            this.G = i10;
        }
        this.f26635b0.put(size, i10);
        this.f26637c0.put(i10, size);
        int i11 = this.G;
        if (i11 != -1 && i11 == i10) {
            this.F = size;
        }
        ?? obj = new Object();
        obj.f25602a = i10;
        obj.f25603b = charSequence;
        int i12 = this.H;
        this.H = org.telegram.messenger.w1.C(this.f26654r * 2, obj.a(this.f26636c), i12);
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
        bi.o0 o0Var = this.v;
        float f15 = 1.0f;
        if (z11) {
            while (i10 < o0Var.getChildCount()) {
                ViewPropertyAnimator animate = o0Var.getChildAt(i10).animate();
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
                scaleX.scaleY(f14).setInterpolator(pr.f29466f).setDuration(220L).start();
                i10++;
            }
        } else {
            while (i10 < o0Var.getChildCount()) {
                View childAt = o0Var.getChildAt(i10);
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
            bi.o0 o0Var = this.v;
            if (o0Var.getVisibility() != 8 && o0Var.getMeasuredWidth() != 0) {
                o0Var.x0(i10);
            } else {
                AndroidUtilities.runOnUIThread(new m8(this, i10, 13), 100L);
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
        this.f26643g0 = i12;
        this.f26644h0 = this.G;
        g81 g81Var = this.f26659y;
        if (g81Var != null) {
            a81 a81Var = ((i81) ((k2.g0) g81Var).f14578b).L;
        }
        this.F = i11;
        this.G = i10;
        ValueAnimator valueAnimator = this.f26647k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.J) {
            this.J = false;
        }
        this.f26642f0 = 0.0f;
        this.K = 0.0f;
        this.J = true;
        setEnabled(false);
        g81 g81Var2 = this.f26659y;
        if (g81Var2 != null) {
            i81 i81Var = (i81) ((k2.g0) g81Var2).f14578b;
            i81Var.f27024y = z10;
            View[] viewArr = i81Var.f27017e;
            i81Var.d = i11;
            i81Var.I(1);
            i81Var.y(i11, z10);
            View view = viewArr[0];
            if (view != null) {
                i13 = view.getMeasuredWidth();
            }
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    i81Var.E(view2, i13);
                } else {
                    i81Var.E(view2, -i13);
                }
            }
        }
        c(this.F);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f26647k0 = ofFloat;
        ofFloat.addUpdateListener(new e61(2, this));
        this.f26647k0.setDuration(250L);
        this.f26647k0.setInterpolator(pr.f29466f);
        this.f26647k0.addListener(new k61(this, 2));
        this.f26647k0.start();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h81.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public abstract void e(float f7, int i10, int i11);

    public final void f(float f7, int i10) {
        int i11 = this.f26637c0.get(i10, -1);
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
        return this.f26635b0.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.f26643g0;
    }

    public Drawable getSelectorDrawable() {
        return this.O;
    }

    public ll0 getTabsContainer() {
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
                AndroidUtilities.cancelRunOnUIThread(this.f26645i0);
                this.J = false;
                setEnabled(true);
                g81 g81Var = this.f26659y;
                if (g81Var != null) {
                    ((k2.g0) g81Var).A(1.0f);
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
                this.f26656s = true;
                this.f26658x.l();
                this.f26656s = false;
            }
            SparseIntArray sparseIntArray = this.f26640e0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.f26638d0;
            sparseIntArray2.clear();
            int dp = AndroidUtilities.dp(7.0f);
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                int a2 = ((e81) arrayList.get(i16)).a(this.f26636c);
                sparseIntArray2.put(i16, a2);
                sparseIntArray.put(i16, (this.I / 2) + dp);
                dp += AndroidUtilities.dp(this.f26654r * 2) + a2 + this.I;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26656s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.K = f7;
        this.v.e1();
        invalidate();
        g81 g81Var = this.f26659y;
        if (g81Var != null) {
            ((k2.g0) g81Var).A(f7);
        }
    }

    public void setBlurredBackground(dh.d dVar) {
        this.f26655r0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(g81 g81Var) {
        this.f26659y = g81Var;
    }

    public void setIsEditing(boolean z10) {
        this.f26649n = z10;
        this.v.e1();
        invalidate();
    }

    public void setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> callback2Return) {
        this.f26634b = callback2Return;
    }

    public void setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> callback2Return) {
        this.f26648l0 = callback2Return;
    }

    public void setReordering(boolean z10) {
        bi.o0 o0Var;
        if (this.m0 == z10) {
            return;
        }
        this.m0 = z10;
        if (z10 && this.f26650n0 == null) {
            this.f26650n0 = new s4.y(new ci.f(this, 5));
        }
        if (this.m0 && this.f26651o0 == null) {
            d81 d81Var = new d81(this);
            this.f26651o0 = d81Var;
            d81Var.f45777m = false;
            d81Var.C = false;
            d81Var.o(pr.h);
            this.f26651o0.n(350L);
        }
        s4.y yVar = this.f26650n0;
        d81 d81Var2 = null;
        bi.o0 o0Var2 = this.v;
        if (yVar != null) {
            if (z10) {
                o0Var = o0Var2;
            } else {
                o0Var = null;
            }
            yVar.d(o0Var);
        }
        if (z10) {
            d81Var2 = this.f26651o0;
        }
        o0Var2.setItemAnimator(d81Var2);
        AndroidUtilities.forEachViews((RecyclerView) o0Var2, (e2.h) new m4.s0(3, this, z10));
    }
}
