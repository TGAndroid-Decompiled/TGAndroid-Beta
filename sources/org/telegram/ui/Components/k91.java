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
public abstract class k91 extends FrameLayout {
    public static final int f26304s0 = 0;
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
    public float f26305a;
    public final es f26306a0;
    public Utilities.Callback2Return f26307b;
    public final SparseIntArray f26308b0;
    public final TextPaint f26309c;
    public final SparseIntArray f26310c0;
    public final TextPaint d;
    public final SparseIntArray f26311d0;
    public final TextPaint e;
    public final SparseIntArray f26312e0;
    public final Paint f26313f;
    public float f26314f0;
    public int f26315g0;
    public final ArrayList h;
    public int f26316h0;
    public final org.telegram.ui.Cells.l7 f26317i0;
    public final org.telegram.ui.ActionBar.c6 f26318j0;
    public ValueAnimator f26319k0;
    public Utilities.Callback2Return f26320l0;
    public boolean m0;
    public boolean f26321n;
    public s4.y f26322n0;
    public g91 f26323o0;
    public float f26324p0;
    public final Paint f26325q0;
    public int f26326r;
    public dh.d f26327r0;
    public boolean f26328s;
    public final bi.o0 v;
    public final hg.i0 f26329w;
    public final ng.g f26330x;
    public j91 f26331y;

    public k91(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        float f7;
        int i11;
        this.f26305a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f26309c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f26313f = new Paint(1);
        this.h = new ArrayList();
        this.f26326r = 16;
        this.G = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = org.telegram.ui.ActionBar.g6.Gh;
        this.Q = org.telegram.ui.ActionBar.g6.Fh;
        this.R = org.telegram.ui.ActionBar.g6.Eh;
        this.S = org.telegram.ui.ActionBar.g6.Hh;
        this.T = org.telegram.ui.ActionBar.g6.f19880s8;
        this.f26306a0 = es.h;
        this.f26308b0 = new SparseIntArray(5);
        this.f26310c0 = new SparseIntArray(5);
        this.f26311d0 = new SparseIntArray(5);
        this.f26312e0 = new SparseIntArray(5);
        this.f26317i0 = new org.telegram.ui.Cells.l7(this, 24);
        this.f26325q0 = new Paint(1);
        this.f26318j0 = c6Var;
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.w0(this.P, c6Var));
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
            ((s4.k) o0Var.getItemAnimator()).C = false;
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
        o0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.w0(this.S, c6Var));
        hg.i0 i0Var = new hg.i0((ViewGroup) this, 6);
        this.f26329w = i0Var;
        o0Var.setLayoutManager(i0Var);
        o0Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        o0Var.setClipToPadding(false);
        o0Var.setDrawSelectorBehind(true);
        ng.g gVar = new ng.g(this, context);
        this.f26330x = gVar;
        gVar.C(z10);
        o0Var.setAdapter(gVar);
        o0Var.setOnItemClickListener(new e91(this));
        o0Var.setOnItemLongClickListener(new e91(this));
        o0Var.setOnScrollListener(new kc0(this, 9));
        if (i10 != 9 && i10 != 10) {
            addView(o0Var, w7.z5.d(-1.0f, -1));
        } else {
            addView(o0Var, w7.z5.e(-2, -1, 1));
        }
    }

    public final void a(int i10, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.G == -1) {
            this.G = i10;
        }
        this.f26308b0.put(size, i10);
        this.f26310c0.put(i10, size);
        int i11 = this.G;
        if (i11 != -1 && i11 == i10) {
            this.F = size;
        }
        ?? obj = new Object();
        obj.f25223a = i10;
        obj.f25224b = charSequence;
        int i12 = this.H;
        this.H = org.telegram.messenger.g0.C(this.f26326r * 2, obj.a(this.f26309c), i12);
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
                scaleX.scaleY(f14).setInterpolator(es.f24465f).setDuration(220L).start();
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
                AndroidUtilities.runOnUIThread(new o8(this, i10, 13), 100L);
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
        this.f26315g0 = i12;
        this.f26316h0 = this.G;
        j91 j91Var = this.f26331y;
        if (j91Var != null) {
            d91 d91Var = ((l91) ((m.h) j91Var).f14848b).L;
        }
        this.F = i11;
        this.G = i10;
        ValueAnimator valueAnimator = this.f26319k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.J) {
            this.J = false;
        }
        this.f26314f0 = 0.0f;
        this.K = 0.0f;
        this.J = true;
        setEnabled(false);
        j91 j91Var2 = this.f26331y;
        if (j91Var2 != null) {
            l91 l91Var = (l91) ((m.h) j91Var2).f14848b;
            l91Var.f26700y = z10;
            View[] viewArr = l91Var.e;
            l91Var.d = i11;
            l91Var.I(1);
            l91Var.y(i11, z10);
            View view = viewArr[0];
            if (view != null) {
                i13 = view.getMeasuredWidth();
            }
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    l91Var.E(view2, i13);
                } else {
                    l91Var.E(view2, -i13);
                }
            }
        }
        c(this.F);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f26319k0 = ofFloat;
        ofFloat.addUpdateListener(new r51(3, this));
        this.f26319k0.setDuration(250L);
        this.f26319k0.setInterpolator(es.f24465f);
        this.f26319k0.addListener(new v61(this, 3));
        this.f26319k0.start();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k91.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public abstract void e(float f7, int i10, int i11);

    public final void f(float f7, int i10) {
        int i11 = this.f26310c0.get(i10, -1);
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
        this.O.setColor(org.telegram.ui.ActionBar.g6.w0(i10, this.f26318j0));
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
        return this.f26308b0.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.f26315g0;
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
                AndroidUtilities.cancelRunOnUIThread(this.f26317i0);
                this.J = false;
                setEnabled(true);
                j91 j91Var = this.f26331y;
                if (j91Var != null) {
                    ((m.h) j91Var).e(1.0f);
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
                this.f26328s = true;
                this.f26330x.l();
                this.f26328s = false;
            }
            SparseIntArray sparseIntArray = this.f26312e0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.f26311d0;
            sparseIntArray2.clear();
            int dp = AndroidUtilities.dp(7.0f);
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                int a2 = ((h91) arrayList.get(i16)).a(this.f26309c);
                sparseIntArray2.put(i16, a2);
                sparseIntArray.put(i16, (this.I / 2) + dp);
                dp += AndroidUtilities.dp(this.f26326r * 2) + a2 + this.I;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26328s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.K = f7;
        this.v.f1();
        invalidate();
        j91 j91Var = this.f26331y;
        if (j91Var != null) {
            ((m.h) j91Var).e(f7);
        }
    }

    public void setBlurredBackground(dh.d dVar) {
        this.f26327r0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(j91 j91Var) {
        this.f26331y = j91Var;
    }

    public void setIsEditing(boolean z10) {
        this.f26321n = z10;
        this.v.f1();
        invalidate();
    }

    public void setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> callback2Return) {
        this.f26307b = callback2Return;
    }

    public void setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> callback2Return) {
        this.f26320l0 = callback2Return;
    }

    public void setReordering(boolean z10) {
        bi.o0 o0Var;
        if (this.m0 == z10) {
            return;
        }
        this.m0 = z10;
        if (z10 && this.f26322n0 == null) {
            this.f26322n0 = new s4.y(new ci.f(this, 5));
        }
        if (this.m0 && this.f26323o0 == null) {
            g91 g91Var = new g91(this);
            this.f26323o0 = g91Var;
            g91Var.f44872m = false;
            g91Var.C = false;
            g91Var.o(es.h);
            this.f26323o0.n(350L);
        }
        s4.y yVar = this.f26322n0;
        g91 g91Var2 = null;
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
            g91Var2 = this.f26323o0;
        }
        o0Var2.setItemAnimator(g91Var2);
        AndroidUtilities.forEachViews((RecyclerView) o0Var2, (Utilities.Callback<View>) new bi.y2(5, this, z10));
    }
}
