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
public abstract class b91 extends FrameLayout {
    public static final int f24851s0 = 0;
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
    public float f24852a;
    public final bs f24853a0;
    public Utilities.Callback2Return f24854b;
    public final SparseIntArray f24855b0;
    public final TextPaint f24856c;
    public final SparseIntArray f24857c0;
    public final TextPaint d;
    public final SparseIntArray f24858d0;
    public final TextPaint e;
    public final SparseIntArray f24859e0;
    public final Paint f24860f;
    public float f24861f0;
    public int f24862g0;
    public final ArrayList h;
    public int f24863h0;
    public final org.telegram.ui.Cells.k7 f24864i0;
    public final org.telegram.ui.ActionBar.d6 f24865j0;
    public ValueAnimator f24866k0;
    public Utilities.Callback2Return f24867l0;
    public boolean m0;
    public boolean f24868n;
    public s4.y f24869n0;
    public x81 f24870o0;
    public float f24871p0;
    public final Paint f24872q0;
    public int f24873r;
    public dh.d f24874r0;
    public boolean f24875s;
    public final ai.u1 v;
    public final hg.i0 f24876w;
    public final ng.g f24877x;
    public a91 f24878y;

    public b91(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        float f7;
        int i11;
        this.f24852a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f24856c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f24860f = new Paint(1);
        this.h = new ArrayList();
        this.f24873r = 16;
        this.G = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = org.telegram.ui.ActionBar.h6.Gh;
        this.Q = org.telegram.ui.ActionBar.h6.Fh;
        this.R = org.telegram.ui.ActionBar.h6.Eh;
        this.S = org.telegram.ui.ActionBar.h6.Hh;
        this.T = org.telegram.ui.ActionBar.h6.f21272s8;
        this.f24853a0 = bs.h;
        this.f24855b0 = new SparseIntArray(5);
        this.f24857c0 = new SparseIntArray(5);
        this.f24858d0 = new SparseIntArray(5);
        this.f24859e0 = new SparseIntArray(5);
        this.f24864i0 = new org.telegram.ui.Cells.k7(this, 24);
        this.f24872q0 = new Paint(1);
        this.f24865j0 = d6Var;
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.h6.w0(this.P, d6Var));
        if (i10 == -2) {
            float dpf2 = AndroidUtilities.dpf2(13.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        } else {
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf22, dpf22, dpf22, dpf22, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        ai.u1 u1Var = new ai.u1(this, context, 26);
        this.v = u1Var;
        u1Var.setOverScrollMode(2);
        if (z10) {
            u1Var.setItemAnimator(null);
        } else {
            ((s4.k) u1Var.getItemAnimator()).C = false;
        }
        if (i10 == -2) {
            u1Var.setSelectorType(9);
            u1Var.setSelectorRadius(6);
        } else {
            if (i10 == 10) {
                i11 = 9;
            } else {
                i11 = i10;
            }
            u1Var.setSelectorType(i11);
            if (i10 == 3) {
                u1Var.setSelectorRadius(0);
            } else {
                u1Var.setSelectorRadius(6);
            }
        }
        u1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(this.S, d6Var));
        hg.i0 i0Var = new hg.i0((ViewGroup) this, 6);
        this.f24876w = i0Var;
        u1Var.setLayoutManager(i0Var);
        u1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        u1Var.setClipToPadding(false);
        u1Var.setDrawSelectorBehind(true);
        ng.g gVar = new ng.g(this, context);
        this.f24877x = gVar;
        gVar.C(z10);
        u1Var.setAdapter(gVar);
        u1Var.setOnItemClickListener(new v81(this));
        u1Var.setOnItemLongClickListener(new v81(this));
        u1Var.setOnScrollListener(new kv(this, 13));
        if (i10 != 9 && i10 != 10) {
            addView(u1Var, w7.z5.d(-1.0f, -1));
        } else {
            addView(u1Var, w7.z5.e(-2, -1, 1));
        }
    }

    public final void a(int i10, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.G == -1) {
            this.G = i10;
        }
        this.f24855b0.put(size, i10);
        this.f24857c0.put(i10, size);
        int i11 = this.G;
        if (i11 != -1 && i11 == i10) {
            this.F = size;
        }
        ?? obj = new Object();
        obj.f32578a = i10;
        obj.f32579b = charSequence;
        int i12 = this.H;
        this.H = org.telegram.messenger.g0.C(this.f24873r * 2, obj.a(this.f24856c), i12);
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
        ai.u1 u1Var = this.v;
        float f15 = 1.0f;
        if (z11) {
            while (i10 < u1Var.getChildCount()) {
                ViewPropertyAnimator animate = u1Var.getChildAt(i10).animate();
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
                scaleX.scaleY(f14).setInterpolator(bs.f25037f).setDuration(220L).start();
                i10++;
            }
        } else {
            while (i10 < u1Var.getChildCount()) {
                View childAt = u1Var.getChildAt(i10);
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
            ai.u1 u1Var = this.v;
            if (u1Var.getVisibility() != 8 && u1Var.getMeasuredWidth() != 0) {
                u1Var.x0(i10);
            } else {
                AndroidUtilities.runOnUIThread(new e2(this, i10, 14), 100L);
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
        this.f24862g0 = i12;
        this.f24863h0 = this.G;
        a91 a91Var = this.f24878y;
        if (a91Var != null) {
            u81 u81Var = ((c91) ((l2.f) a91Var).f15844b).L;
        }
        this.F = i11;
        this.G = i10;
        ValueAnimator valueAnimator = this.f24866k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.J) {
            this.J = false;
        }
        this.f24861f0 = 0.0f;
        this.K = 0.0f;
        this.J = true;
        setEnabled(false);
        a91 a91Var2 = this.f24878y;
        if (a91Var2 != null) {
            c91 c91Var = (c91) ((l2.f) a91Var2).f15844b;
            c91Var.f25182y = z10;
            View[] viewArr = c91Var.e;
            c91Var.d = i11;
            c91Var.I(1);
            c91Var.y(i11, z10);
            View view = viewArr[0];
            if (view != null) {
                i13 = view.getMeasuredWidth();
            }
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    c91Var.E(view2, i13);
                } else {
                    c91Var.E(view2, -i13);
                }
            }
        }
        c(this.F);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f24866k0 = ofFloat;
        ofFloat.addUpdateListener(new k51(3, this));
        this.f24866k0.setDuration(250L);
        this.f24866k0.setInterpolator(bs.f25037f);
        this.f24866k0.addListener(new n31(this, 5));
        this.f24866k0.start();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b91.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public abstract void e(float f7, int i10, int i11);

    public final void f(float f7, int i10) {
        int i11 = this.f24857c0.get(i10, -1);
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
        this.O.setColor(org.telegram.ui.ActionBar.h6.w0(i10, this.f24865j0));
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
        return this.f24855b0.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.f24862g0;
    }

    public Drawable getSelectorDrawable() {
        return this.O;
    }

    public im0 getTabsContainer() {
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
                AndroidUtilities.cancelRunOnUIThread(this.f24864i0);
                this.J = false;
                setEnabled(true);
                a91 a91Var = this.f24878y;
                if (a91Var != null) {
                    ((l2.f) a91Var).z(1.0f);
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
                this.f24875s = true;
                this.f24877x.l();
                this.f24875s = false;
            }
            SparseIntArray sparseIntArray = this.f24859e0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.f24858d0;
            sparseIntArray2.clear();
            int dp = AndroidUtilities.dp(7.0f);
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                int a2 = ((y81) arrayList.get(i16)).a(this.f24856c);
                sparseIntArray2.put(i16, a2);
                sparseIntArray.put(i16, (this.I / 2) + dp);
                dp += AndroidUtilities.dp(this.f24873r * 2) + a2 + this.I;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f24875s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.K = f7;
        this.v.f1();
        invalidate();
        a91 a91Var = this.f24878y;
        if (a91Var != null) {
            ((l2.f) a91Var).z(f7);
        }
    }

    public void setBlurredBackground(dh.d dVar) {
        this.f24874r0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(a91 a91Var) {
        this.f24878y = a91Var;
    }

    public void setIsEditing(boolean z10) {
        this.f24868n = z10;
        this.v.f1();
        invalidate();
    }

    public void setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> callback2Return) {
        this.f24854b = callback2Return;
    }

    public void setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> callback2Return) {
        this.f24867l0 = callback2Return;
    }

    public void setReordering(boolean z10) {
        ai.u1 u1Var;
        if (this.m0 == z10) {
            return;
        }
        this.m0 = z10;
        if (z10 && this.f24869n0 == null) {
            this.f24869n0 = new s4.y(new di.f(this, 5));
        }
        if (this.m0 && this.f24870o0 == null) {
            x81 x81Var = new x81(this);
            this.f24870o0 = x81Var;
            x81Var.f45992m = false;
            x81Var.C = false;
            x81Var.o(bs.h);
            this.f24870o0.n(350L);
        }
        s4.y yVar = this.f24869n0;
        x81 x81Var2 = null;
        ai.u1 u1Var2 = this.v;
        if (yVar != null) {
            if (z10) {
                u1Var = u1Var2;
            } else {
                u1Var = null;
            }
            yVar.d(u1Var);
        }
        if (z10) {
            x81Var2 = this.f24870o0;
        }
        u1Var2.setItemAnimator(x81Var2);
        AndroidUtilities.forEachViews((RecyclerView) u1Var2, (Utilities.Callback<View>) new ai.x8(6, this, z10));
    }
}
