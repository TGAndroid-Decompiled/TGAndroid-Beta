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
public abstract class g91 extends FrameLayout {
    public static final int f26766s0 = 0;
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
    public float f26767a;
    public final tr f26768a0;
    public Utilities.Callback2Return f26769b;
    public final SparseIntArray f26770b0;
    public final TextPaint f26771c;
    public final SparseIntArray f26772c0;
    public final TextPaint d;
    public final SparseIntArray f26773d0;
    public final TextPaint f26774e;
    public final SparseIntArray f26775e0;
    public final Paint f26776f;
    public float f26777f0;
    public int f26778g0;
    public final ArrayList h;
    public int f26779h0;
    public final org.telegram.ui.Cells.t6 f26780i0;
    public final org.telegram.ui.ActionBar.d6 f26781j0;
    public ValueAnimator f26782k0;
    public Utilities.Callback2Return f26783l0;
    public boolean m0;
    public boolean f26784n;
    public s4.y f26785n0;
    public c91 f26786o0;
    public float f26787p0;
    public final Paint f26788q0;
    public int f26789r;
    public ch.d f26790r0;
    public boolean f26791s;
    public final ai.w0 v;
    public final gg.j0 f26792w;
    public final mg.g f26793x;
    public f91 f26794y;

    public g91(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        float f7;
        int i11;
        this.f26767a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f26771c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f26774e = textPaint3;
        this.f26776f = new Paint(1);
        this.h = new ArrayList();
        this.f26789r = 16;
        this.G = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = org.telegram.ui.ActionBar.i6.Gh;
        this.Q = org.telegram.ui.ActionBar.i6.Fh;
        this.R = org.telegram.ui.ActionBar.i6.Eh;
        this.S = org.telegram.ui.ActionBar.i6.Hh;
        this.T = org.telegram.ui.ActionBar.i6.f21109s8;
        this.f26768a0 = tr.h;
        this.f26770b0 = new SparseIntArray(5);
        this.f26772c0 = new SparseIntArray(5);
        this.f26773d0 = new SparseIntArray(5);
        this.f26775e0 = new SparseIntArray(5);
        this.f26780i0 = new org.telegram.ui.Cells.t6(this, 26);
        this.f26788q0 = new Paint(1);
        this.f26781j0 = d6Var;
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.i6.v0(this.P, d6Var));
        if (i10 == -2) {
            float dpf2 = AndroidUtilities.dpf2(13.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        } else {
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
                i11 = 9;
            } else {
                i11 = i10;
            }
            w0Var.setSelectorType(i11);
            if (i10 == 3) {
                w0Var.setSelectorRadius(0);
            } else {
                w0Var.setSelectorRadius(6);
            }
        }
        w0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(this.S, d6Var));
        gg.j0 j0Var = new gg.j0((ViewGroup) this, 7);
        this.f26792w = j0Var;
        w0Var.setLayoutManager(j0Var);
        w0Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        w0Var.setClipToPadding(false);
        w0Var.setDrawSelectorBehind(true);
        mg.g gVar = new mg.g(this, context);
        this.f26793x = gVar;
        gVar.C(z10);
        w0Var.setAdapter(gVar);
        w0Var.setOnItemClickListener(new z81(this));
        w0Var.setOnItemLongClickListener(new z81(this));
        w0Var.setOnScrollListener(new xb0(this, 10));
        if (i10 != 9 && i10 != 10) {
            addView(w0Var, w7.z5.c(-1.0f, -1));
        } else {
            addView(w0Var, w7.z5.e(-2, -1, 1));
        }
    }

    public final void a(int i10, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.G == -1) {
            this.G = i10;
        }
        this.f26770b0.put(size, i10);
        this.f26772c0.put(i10, size);
        int i11 = this.G;
        if (i11 != -1 && i11 == i10) {
            this.F = size;
        }
        ?? obj = new Object();
        obj.f25731a = i10;
        obj.f25732b = charSequence;
        int i12 = this.H;
        this.H = org.telegram.messenger.q.C(this.f26789r * 2, obj.a(this.f26771c), i12);
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
                scaleX.scaleY(f14).setInterpolator(tr.f31215f).setDuration(220L).start();
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
                w0Var.y0(i10);
            } else {
                AndroidUtilities.runOnUIThread(new ld(this, i10, 11), 100L);
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
        this.f26778g0 = i13;
        this.f26779h0 = this.G;
        this.F = i11;
        this.G = i10;
        ValueAnimator valueAnimator = this.f26782k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.J) {
            this.J = false;
        }
        this.f26777f0 = 0.0f;
        this.K = 0.0f;
        this.J = true;
        setEnabled(false);
        f91 f91Var = this.f26794y;
        if (f91Var != null) {
            h91 h91Var = (h91) ((n2.c) f91Var).f16532b;
            h91Var.f27175y = z10;
            View[] viewArr = h91Var.f27168e;
            h91Var.d = i11;
            h91Var.K(1);
            h91Var.z(i11, z10);
            View view = viewArr[0];
            if (view != null) {
                i12 = view.getMeasuredWidth();
            } else {
                i12 = 0;
            }
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    h91Var.F(view2, i12);
                } else {
                    h91Var.F(view2, -i12);
                }
            }
        }
        c(this.F);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f26782k0 = ofFloat;
        ofFloat.addUpdateListener(new f71(2, this));
        this.f26782k0.setDuration(250L);
        this.f26782k0.setInterpolator(tr.f31215f);
        this.f26782k0.addListener(new b91(this, 0));
        this.f26782k0.start();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g91.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public abstract void e(float f7, int i10, int i11);

    public final void f(float f7, int i10) {
        int i11 = this.f26772c0.get(i10, -1);
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
        return this.f26770b0.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.f26778g0;
    }

    public Drawable getSelectorDrawable() {
        return this.O;
    }

    public zl0 getTabsContainer() {
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
                AndroidUtilities.cancelRunOnUIThread(this.f26780i0);
                this.J = false;
                setEnabled(true);
                f91 f91Var = this.f26794y;
                if (f91Var != null) {
                    ((n2.c) f91Var).k(1.0f);
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
                this.f26791s = true;
                this.f26793x.l();
                this.f26791s = false;
            }
            SparseIntArray sparseIntArray = this.f26775e0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.f26773d0;
            sparseIntArray2.clear();
            int dp = AndroidUtilities.dp(7.0f);
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                int a2 = ((d91) arrayList.get(i16)).a(this.f26771c);
                sparseIntArray2.put(i16, a2);
                sparseIntArray.put(i16, (this.I / 2) + dp);
                dp += AndroidUtilities.dp(this.f26789r * 2) + a2 + this.I;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26791s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.K = f7;
        this.v.g1();
        invalidate();
        f91 f91Var = this.f26794y;
        if (f91Var != null) {
            ((n2.c) f91Var).k(f7);
        }
    }

    public void setBlurredBackground(ch.d dVar) {
        this.f26790r0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(f91 f91Var) {
        this.f26794y = f91Var;
    }

    public void setIsEditing(boolean z10) {
        this.f26784n = z10;
        this.v.g1();
        invalidate();
    }

    public void setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> callback2Return) {
        this.f26769b = callback2Return;
    }

    public void setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> callback2Return) {
        this.f26783l0 = callback2Return;
    }

    public void setReordering(boolean z10) {
        ai.w0 w0Var;
        if (this.m0 == z10) {
            return;
        }
        this.m0 = z10;
        if (z10 && this.f26785n0 == null) {
            this.f26785n0 = new s4.y(new bi.g(this, 5));
        }
        if (this.m0 && this.f26786o0 == null) {
            c91 c91Var = new c91(this);
            this.f26786o0 = c91Var;
            c91Var.f46577m = false;
            c91Var.C = false;
            c91Var.o(tr.h);
            this.f26786o0.n(350L);
        }
        s4.y yVar = this.f26785n0;
        c91 c91Var2 = null;
        ai.w0 w0Var2 = this.v;
        if (yVar != null) {
            if (z10) {
                w0Var = w0Var2;
            } else {
                w0Var = null;
            }
            yVar.e(w0Var);
        }
        if (z10) {
            c91Var2 = this.f26786o0;
        }
        w0Var2.setItemAnimator(c91Var2);
        AndroidUtilities.forEachViews((RecyclerView) w0Var2, (Utilities.Callback<View>) new ai.i3(5, this, z10));
    }
}
