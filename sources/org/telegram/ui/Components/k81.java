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
public abstract class k81 extends FrameLayout {
    public static final int f26207p0 = 0;
    public final int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public float H;
    public int I;
    public int J;
    public int K;
    public final GradientDrawable L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public float T;
    public final mr U;
    public final SparseIntArray V;
    public final SparseIntArray W;
    public float f26208a;
    public final SparseIntArray f26209a0;
    public Utilities.Callback2Return f26210b;
    public final SparseIntArray f26211b0;
    public final TextPaint f26212c;
    public float f26213c0;
    public final TextPaint d;
    public int f26214d0;
    public final TextPaint e;
    public int f26215e0;
    public final Paint f26216f;
    public final sl0 f26217f0;
    public final org.telegram.ui.ActionBar.f6 f26218g0;
    public final ArrayList h;
    public ValueAnimator f26219h0;
    public Utilities.Callback2Return f26220i0;
    public boolean f26221j0;
    public f2.e0 f26222k0;
    public f81 f26223l0;
    public float m0;
    public boolean f26224n;
    public final Paint f26225n0;
    public pg.b f26226o0;
    public int f26227r;
    public boolean f26228s;
    public final lh.e1 v;
    public final org.telegram.ui.dr f26229w;
    public final g81 f26230x;
    public j81 f26231y;

    public k81(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        float f10;
        int i11;
        this.f26208a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f26212c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f26216f = new Paint(1);
        this.h = new ArrayList();
        this.f26227r = 16;
        this.D = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.M = org.telegram.ui.ActionBar.j6.Gh;
        this.N = org.telegram.ui.ActionBar.j6.Fh;
        this.O = org.telegram.ui.ActionBar.j6.Eh;
        this.P = org.telegram.ui.ActionBar.j6.Hh;
        this.Q = org.telegram.ui.ActionBar.j6.f20151s8;
        this.U = mr.h;
        this.V = new SparseIntArray(5);
        this.W = new SparseIntArray(5);
        this.f26209a0 = new SparseIntArray(5);
        this.f26211b0 = new SparseIntArray(5);
        this.f26217f0 = new sl0(this, 4);
        this.f26225n0 = new Paint(1);
        this.f26218g0 = f6Var;
        this.B = i10;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        if (i10 != 9 && i10 != 10 && i10 != -2) {
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
        this.L = gradientDrawable;
        gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.v0(this.M, f6Var));
        if (i10 == -2) {
            float dpf2 = AndroidUtilities.dpf2(13.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        } else {
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf22, dpf22, dpf22, dpf22, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        lh.e1 e1Var = new lh.e1(this, context, 23);
        this.v = e1Var;
        e1Var.setOverScrollMode(2);
        if (z4) {
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
        e1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(this.P, f6Var));
        org.telegram.ui.dr drVar = new org.telegram.ui.dr((ViewGroup) this, 5);
        this.f26229w = drVar;
        e1Var.setLayoutManager(drVar);
        e1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        e1Var.setClipToPadding(false);
        e1Var.setDrawSelectorBehind(true);
        g81 g81Var = new g81(this, context);
        this.f26230x = g81Var;
        g81Var.C(z4);
        e1Var.setAdapter(g81Var);
        e1Var.setOnItemClickListener(new d81(this));
        e1Var.setOnItemLongClickListener(new d81(this));
        e1Var.setOnScrollListener(new mb0(this, 9));
        if (i10 != 9 && i10 != 10) {
            addView(e1Var, k7.b6.c(-1.0f, -1));
        } else {
            addView(e1Var, k7.b6.e(-2, -1, 1));
        }
    }

    public final void a(int i10, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.D == -1) {
            this.D = i10;
        }
        this.V.put(size, i10);
        this.W.put(i10, size);
        int i11 = this.D;
        if (i11 != -1 && i11 == i10) {
            this.C = size;
        }
        ?? obj = new Object();
        obj.f25336a = i10;
        obj.f25337b = charSequence;
        int i12 = this.E;
        this.E = org.telegram.messenger.y3.C(this.f26227r * 2, obj.a(this.f26212c), i12);
        arrayList.add(obj);
    }

    public final void b(boolean z4, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        this.S = z4;
        int i10 = 0;
        lh.e1 e1Var = this.v;
        float f16 = 1.0f;
        if (z10) {
            while (i10 < e1Var.getChildCount()) {
                ViewPropertyAnimator animate = e1Var.getChildAt(i10).animate();
                if (z4) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f13);
                if (z4) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f14);
                if (z4) {
                    f15 = 0.0f;
                } else {
                    f15 = 1.0f;
                }
                scaleX.scaleY(f15).setInterpolator(mr.f27122f).setDuration(220L).start();
                i10++;
            }
        } else {
            while (i10 < e1Var.getChildCount()) {
                View childAt = e1Var.getChildAt(i10);
                if (z4) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                childAt.setScaleX(f10);
                if (z4) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                childAt.setScaleY(f11);
                if (z4) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                childAt.setAlpha(f12);
                i10++;
            }
            if (!z4) {
                f16 = 0.0f;
            }
            this.T = f16;
        }
        invalidate();
    }

    public final void c(int i10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.K != i10 && i10 >= 0 && i10 < arrayList.size()) {
            this.K = i10;
            lh.e1 e1Var = this.v;
            if (e1Var.getVisibility() != 8 && e1Var.getMeasuredWidth() != 0) {
                e1Var.x0(i10);
            } else {
                AndroidUtilities.runOnUIThread(new dw(this, i10, 9), 100L);
            }
        }
    }

    public final void d(int i10, int i11) {
        boolean z4;
        int i12 = this.C;
        int i13 = 0;
        if (i12 < i11) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.K = -1;
        this.f26214d0 = i12;
        this.f26215e0 = this.D;
        j81 j81Var = this.f26231y;
        if (j81Var != null) {
            c81 c81Var = ((l81) ((tp0) j81Var).f29015b).I;
        }
        this.C = i11;
        this.D = i10;
        ValueAnimator valueAnimator = this.f26219h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.G) {
            this.G = false;
        }
        this.f26213c0 = 0.0f;
        this.H = 0.0f;
        this.G = true;
        setEnabled(false);
        j81 j81Var2 = this.f26231y;
        if (j81Var2 != null) {
            l81 l81Var = (l81) ((tp0) j81Var2).f29015b;
            l81Var.f26625y = z4;
            View[] viewArr = l81Var.e;
            l81Var.d = i11;
            l81Var.I(1);
            l81Var.y(i11, z4);
            View view = viewArr[0];
            if (view != null) {
                i13 = view.getMeasuredWidth();
            }
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z4) {
                    l81Var.E(view2, i13);
                } else {
                    l81Var.E(view2, -i13);
                }
            }
        }
        c(this.C);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f26219h0 = ofFloat;
        ofFloat.addUpdateListener(new h61(2, this));
        this.f26219h0.setDuration(250L);
        this.f26219h0.setInterpolator(mr.f27122f);
        this.f26219h0.addListener(new od0(this, 28));
        this.f26219h0.start();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k81.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public abstract void e(float f10, int i10, int i11);

    public final void f(float f10, int i10) {
        int i11 = this.W.get(i10, -1);
        if (i11 >= 0) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (f10 > 0.0f) {
                this.I = i11;
                this.J = i10;
            } else {
                this.I = -1;
                this.J = -1;
            }
            this.H = f10;
            this.v.e1();
            invalidate();
            c(i11);
            if (f10 >= 1.0f) {
                this.I = -1;
                this.J = -1;
                this.C = i11;
                this.D = i10;
            }
        }
    }

    public float getAnimatingIndicatorProgress() {
        return this.H;
    }

    public int getCurrentPosition() {
        return this.C;
    }

    public int getCurrentTabId() {
        return this.D;
    }

    public int getFirstTabId() {
        return this.V.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.f26214d0;
    }

    public Drawable getSelectorDrawable() {
        return this.L;
    }

    public rl0 getTabsContainer() {
        return this.v;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.R != i14) {
            this.R = i14;
            this.K = -1;
            if (this.G) {
                AndroidUtilities.cancelRunOnUIThread(this.f26217f0);
                this.G = false;
                setEnabled(true);
                j81 j81Var = this.f26231y;
                if (j81Var != null) {
                    ((tp0) j81Var).n(1.0f);
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
            int i14 = this.F;
            if (arrayList.size() != 1 && (i12 = this.B) != 9 && i12 != 10) {
                int i15 = this.E;
                if (i15 < size) {
                    i13 = (size - i15) / arrayList.size();
                } else {
                    i13 = 0;
                }
                this.F = i13;
            } else {
                this.F = 0;
            }
            if (i14 != this.F) {
                this.f26228s = true;
                this.f26230x.l();
                this.f26228s = false;
            }
            SparseIntArray sparseIntArray = this.f26211b0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.f26209a0;
            sparseIntArray2.clear();
            int dp = AndroidUtilities.dp(7.0f);
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                int a2 = ((h81) arrayList.get(i16)).a(this.f26212c);
                sparseIntArray2.put(i16, a2);
                sparseIntArray.put(i16, (this.F / 2) + dp);
                dp += AndroidUtilities.dp(this.f26227r * 2) + a2 + this.F;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26228s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.H = f10;
        this.v.e1();
        invalidate();
        j81 j81Var = this.f26231y;
        if (j81Var != null) {
            ((tp0) j81Var).n(f10);
        }
    }

    public void setBlurredBackground(pg.b bVar) {
        this.f26226o0 = bVar;
        setBackground(bVar);
    }

    public void setDelegate(j81 j81Var) {
        this.f26231y = j81Var;
    }

    public void setIsEditing(boolean z4) {
        this.f26224n = z4;
        this.v.e1();
        invalidate();
    }

    public void setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> callback2Return) {
        this.f26210b = callback2Return;
    }

    public void setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> callback2Return) {
        this.f26220i0 = callback2Return;
    }

    public void setReordering(boolean z4) {
        lh.e1 e1Var;
        if (this.f26221j0 == z4) {
            return;
        }
        this.f26221j0 = z4;
        if (z4 && this.f26222k0 == null) {
            this.f26222k0 = new f2.e0(new oh.f(this, 5));
        }
        if (this.f26221j0 && this.f26223l0 == null) {
            f81 f81Var = new f81(this);
            this.f26223l0 = f81Var;
            f81Var.f5807m = false;
            f81Var.C = false;
            f81Var.o(mr.h);
            this.f26223l0.n(350L);
        }
        f2.e0 e0Var = this.f26222k0;
        f81 f81Var2 = null;
        lh.e1 e1Var2 = this.v;
        if (e0Var != null) {
            if (z4) {
                e1Var = e1Var2;
            } else {
                e1Var = null;
            }
            e0Var.d(e1Var);
        }
        if (z4) {
            f81Var2 = this.f26223l0;
        }
        e1Var2.setItemAnimator(f81Var2);
        AndroidUtilities.forEachViews((RecyclerView) e1Var2, (h5.d) new org.telegram.ui.rc(2, this, z4));
    }
}
