package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public abstract class o71 extends FrameLayout {

    public static final int f31203o0 = 0;
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
    public final er T;
    public final SparseIntArray U;
    public final SparseIntArray V;
    public final SparseIntArray W;

    public float f31204a;

    public final SparseIntArray f31205a0;

    public Utilities.Callback2Return f31206b;

    public float f31207b0;

    public final TextPaint f31208c;

    public int f31209c0;
    public final TextPaint d;

    public int f31210d0;

    public final TextPaint f31211e;

    public final mu0 f31212e0;

    public final Paint f31213f;

    public final org.telegram.ui.ActionBar.c6 f31214f0;

    public ValueAnimator f31215g0;
    public final ArrayList h;

    public Utilities.Callback2Return f31216h0;

    public boolean f31217i0;

    public f2.f0 f31218j0;

    public j71 f31219k0;

    public float f31220l0;
    public final Paint m0;

    public boolean f31221n;

    public lg.d f31222n0;

    public int f31223r;

    public boolean f31224s;
    public final hh.f1 v;

    public final org.telegram.ui.vq f31225w;

    public final k71 f31226x;

    public n71 f31227y;

    public o71(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f31204a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f31208c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f31211e = textPaint3;
        this.f31213f = new Paint(1);
        this.h = new ArrayList();
        this.f31223r = 16;
        this.C = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.L = org.telegram.ui.ActionBar.g6.Gh;
        this.M = org.telegram.ui.ActionBar.g6.Fh;
        this.N = org.telegram.ui.ActionBar.g6.Eh;
        this.O = org.telegram.ui.ActionBar.g6.Hh;
        this.P = org.telegram.ui.ActionBar.g6.f23322s8;
        this.T = er.h;
        int i11 = 5;
        this.U = new SparseIntArray(5);
        this.V = new SparseIntArray(5);
        this.W = new SparseIntArray(5);
        this.f31205a0 = new SparseIntArray(5);
        this.f31212e0 = new mu0(this, 2);
        this.m0 = new Paint(1);
        this.f31214f0 = c6Var;
        this.A = i10;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp((i10 == 9 || i10 == 10 || i10 == -2) ? 14.0f : 15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.K = gradientDrawable;
        gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.v0(this.L, c6Var));
        if (i10 == -2) {
            float fDpf2 = AndroidUtilities.dpf2(13.0f);
            gradientDrawable.setCornerRadii(new float[]{fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2});
        } else {
            float fDpf3 = AndroidUtilities.dpf2(3.0f);
            gradientDrawable.setCornerRadii(new float[]{fDpf3, fDpf3, fDpf3, fDpf3, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        hh.f1 f1Var = new hh.f1(this, context, 25);
        this.v = f1Var;
        f1Var.setOverScrollMode(2);
        if (z10) {
            f1Var.setItemAnimator(null);
        } else {
            ((f2.l) f1Var.getItemAnimator()).C = false;
        }
        if (i10 == -2) {
            f1Var.setSelectorType(9);
            f1Var.setSelectorRadius(6);
        } else {
            f1Var.setSelectorType(i10 == 10 ? 9 : i10);
            if (i10 == 3) {
                f1Var.setSelectorRadius(0);
            } else {
                f1Var.setSelectorRadius(6);
            }
        }
        f1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(this.O, c6Var));
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq((ViewGroup) this, i11);
        this.f31225w = vqVar;
        f1Var.setLayoutManager(vqVar);
        f1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        f1Var.setClipToPadding(false);
        f1Var.setDrawSelectorBehind(true);
        k71 k71Var = new k71(this, context);
        this.f31226x = k71Var;
        k71Var.C(z10);
        f1Var.setAdapter(k71Var);
        f1Var.setOnItemClickListener(new h71(this));
        f1Var.setOnItemLongClickListener(new h71(this));
        f1Var.setOnScrollListener(new xm(this, 16));
        if (i10 == 9 || i10 == 10) {
            addView(f1Var, h7.z5.e(-2, -1, 1));
        } else {
            addView(f1Var, h7.z5.c(-1.0f, -1));
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
        l71 l71Var = new l71();
        l71Var.f30318a = i10;
        l71Var.f30319b = charSequence;
        this.D = org.telegram.messenger.y1.C(this.f31223r * 2, l71Var.a(this.f31208c), this.D);
        arrayList.add(l71Var);
    }

    public final void b(boolean z10, boolean z11) {
        this.R = z10;
        int i10 = 0;
        hh.f1 f1Var = this.v;
        if (z11) {
            while (i10 < f1Var.getChildCount()) {
                f1Var.getChildAt(i10).animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.0f : 1.0f).scaleY(z10 ? 0.0f : 1.0f).setInterpolator(er.f28122f).setDuration(220L).start();
                i10++;
            }
        } else {
            while (i10 < f1Var.getChildCount()) {
                View childAt = f1Var.getChildAt(i10);
                childAt.setScaleX(z10 ? 0.0f : 1.0f);
                childAt.setScaleY(z10 ? 0.0f : 1.0f);
                childAt.setAlpha(z10 ? 0.0f : 1.0f);
                i10++;
            }
            this.S = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void c(int i10) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty() || this.J == i10 || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        this.J = i10;
        hh.f1 f1Var = this.v;
        if (f1Var.getVisibility() == 8 || f1Var.getMeasuredWidth() == 0) {
            AndroidUtilities.runOnUIThread(new xl(this, i10, 10), 100L);
        } else {
            f1Var.x0(i10);
        }
    }

    public final void d(int i10, int i11) {
        int i12 = this.B;
        boolean z10 = i12 < i11;
        this.J = -1;
        this.f31209c0 = i12;
        this.f31210d0 = this.C;
        n71 n71Var = this.f31227y;
        if (n71Var != null) {
            g71 g71Var = ((p71) ((m5.o) n71Var).f17823b).H;
        }
        this.B = i11;
        this.C = i10;
        ValueAnimator valueAnimator = this.f31215g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.F) {
            this.F = false;
        }
        this.f31207b0 = 0.0f;
        this.G = 0.0f;
        this.F = true;
        setEnabled(false);
        n71 n71Var2 = this.f31227y;
        if (n71Var2 != null) {
            p71 p71Var = (p71) ((m5.o) n71Var2).f17823b;
            p71Var.f31552y = z10;
            View[] viewArr = p71Var.f31545e;
            p71Var.d = i11;
            p71Var.I(1);
            p71Var.y(i11, z10);
            View view = viewArr[0];
            int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    p71Var.E(view2, measuredWidth);
                } else {
                    p71Var.E(view2, -measuredWidth);
                }
            }
        }
        c(this.B);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f31215g0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new l51(2, this));
        this.f31215g0.setDuration(250L);
        this.f31215g0.setInterpolator(er.f28122f);
        this.f31215g0.addListener(new f11(this, 7));
        this.f31215g0.start();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f10;
        float f11;
        f2.o1 o1VarK;
        int i10;
        int i11;
        int iDp;
        int i12;
        int iLerp;
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        hh.f1 f1Var = this.v;
        if (view == f1Var) {
            int measuredHeight = getMeasuredHeight();
            boolean z10 = this.R;
            if (z10) {
                float f12 = this.S;
                if (f12 != 1.0f) {
                    float f13 = f12 + 0.1f;
                    this.S = f13;
                    if (f13 > 1.0f) {
                        this.S = 1.0f;
                    }
                    invalidate();
                } else if (!z10) {
                    f10 = this.S;
                    if (f10 != 0.0f) {
                        f11 = f10 - 0.12f;
                        this.S = f11;
                        if (f11 < 0.0f) {
                            this.S = 0.0f;
                        }
                        invalidate();
                    }
                }
            } else if (!z10) {
                f10 = this.S;
                if (f10 != 0.0f) {
                    f11 = f10 - 0.12f;
                    this.S = f11;
                    if (f11 < 0.0f) {
                        this.S = 0.0f;
                    }
                    invalidate();
                }
            }
            int alpha = (int) (f1Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable = this.K;
            gradientDrawable.setAlpha(alpha);
            int i13 = 0;
            if (this.F || this.H != -1) {
                int iL0 = this.f31225w.L0();
                if (iL0 == -1 || (o1VarK = f1Var.K(iL0)) == null) {
                    iLerp = 0;
                } else {
                    if (this.F) {
                        i10 = this.f31209c0;
                        i11 = this.B;
                    } else {
                        i10 = this.B;
                        i11 = this.H;
                    }
                    SparseIntArray sparseIntArray = this.f31205a0;
                    int i14 = sparseIntArray.get(i10);
                    int i15 = sparseIntArray.get(i11);
                    SparseIntArray sparseIntArray2 = this.W;
                    int i16 = sparseIntArray2.get(i10);
                    int i17 = sparseIntArray2.get(i11);
                    if (this.E != 0) {
                        iDp = AndroidUtilities.dp(this.f31223r) + ((int) (((i15 - i14) * this.G) + i14));
                    } else {
                        iDp = AndroidUtilities.dp(this.f31223r) + (((int) (((i15 - i14) * this.G) + i14)) - (sparseIntArray.get(iL0) - o1VarK.f5789a.getLeft()));
                    }
                    i12 = (int) (((i17 - i16) * this.G) + i16);
                    int i18 = i12;
                    i13 = iDp;
                    iLerp = i18;
                }
            } else {
                f2.o1 o1VarK2 = f1Var.K(this.B);
                if (o1VarK2 != null) {
                    m71 m71Var = (m71) o1VarK2.f5789a;
                    i12 = m71Var.f30610b;
                    iDp = (int) (m71Var.getX() + ((m71Var.getMeasuredWidth() - i12) / 2));
                    int i19 = i12;
                    i13 = iDp;
                    iLerp = i19;
                } else {
                    iLerp = 0;
                }
            }
            int x8 = (int) (f1Var.getX() + i13);
            if (iLerp != 0) {
                int i20 = this.A;
                if (i20 != 9 && i20 != 10) {
                    float f14 = x8;
                    float f15 = iLerp;
                    this.f31220l0 = f15;
                    float f16 = this.f31204a;
                    if (f16 != 1.0f) {
                        x8 = (int) AndroidUtilities.lerp(f14, f14, f16);
                        iLerp = (int) AndroidUtilities.lerp(this.f31220l0, f15, this.f31204a);
                    }
                    if (i20 != -2) {
                        gradientDrawable.setBounds(x8, (int) ((this.S * AndroidUtilities.dpr(4.0f)) + (measuredHeight - AndroidUtilities.dpr(4.0f))), iLerp + x8, (int) ((this.S * AndroidUtilities.dpr(4.0f)) + measuredHeight));
                        gradientDrawable.draw(canvas);
                        return zDrawChild;
                    }
                    float f17 = this.E / 2.0f;
                    int iDp2 = (measuredHeight / 2) - AndroidUtilities.dp(14.0f);
                    gradientDrawable.setBounds((int) ((x8 - AndroidUtilities.dp(12.5f)) - f17), iDp2, (int) (AndroidUtilities.dp(12.5f) + x8 + iLerp + f17), AndroidUtilities.dp(28.0f) + iDp2);
                    gradientDrawable.setAlpha(31);
                    gradientDrawable.draw(canvas);
                    return zDrawChild;
                }
                int iL1 = org.telegram.ui.ActionBar.g6.l1(0.15f, this.f31208c.getColor());
                Paint paint = this.m0;
                paint.setColor(iL1);
                float f18 = measuredHeight / 2.0f;
                float fDp = AndroidUtilities.dp(26.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f19 = fDp / 2.0f;
                rectF.set(x8 - AndroidUtilities.dp(12.0f), f18 - f19, AndroidUtilities.dp(12.0f) + x8 + iLerp, f18 + f19);
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
            }
        }
        return zDrawChild;
    }

    public abstract void e(float f10, int i10, int i11);

    public final void f(float f10, int i10) {
        int i11 = this.V.get(i10, -1);
        if (i11 < 0) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            this.H = i11;
            this.I = i10;
        } else {
            this.H = -1;
            this.I = -1;
        }
        this.G = f10;
        this.v.f1();
        invalidate();
        c(i11);
        if (f10 >= 1.0f) {
            this.H = -1;
            this.I = -1;
            this.B = i11;
            this.C = i10;
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
        return this.f31209c0;
    }

    public Drawable getSelectorDrawable() {
        return this.K;
    }

    public zk0 getTabsContainer() {
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
                AndroidUtilities.cancelRunOnUIThread(this.f31212e0);
                this.F = false;
                setEnabled(true);
                n71 n71Var = this.f31227y;
                if (n71Var != null) {
                    ((m5.o) n71Var).x(1.0f);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(7.0f)) - AndroidUtilities.dp(7.0f);
            int i13 = this.E;
            if (arrayList.size() == 1 || (i12 = this.A) == 9 || i12 == 10) {
                this.E = 0;
            } else {
                int i14 = this.D;
                this.E = i14 < size ? (size - i14) / arrayList.size() : 0;
            }
            if (i13 != this.E) {
                this.f31224s = true;
                this.f31226x.l();
                this.f31224s = false;
            }
            SparseIntArray sparseIntArray = this.f31205a0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.W;
            sparseIntArray2.clear();
            int iDp = AndroidUtilities.dp(7.0f);
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                int iA = ((l71) arrayList.get(i15)).a(this.f31208c);
                sparseIntArray2.put(i15, iA);
                sparseIntArray.put(i15, (this.E / 2) + iDp);
                iDp += AndroidUtilities.dp(this.f31223r * 2) + iA + this.E;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f31224s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.G = f10;
        this.v.f1();
        invalidate();
        n71 n71Var = this.f31227y;
        if (n71Var != null) {
            ((m5.o) n71Var).x(f10);
        }
    }

    public void setBlurredBackground(lg.d dVar) {
        this.f31222n0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(n71 n71Var) {
        this.f31227y = n71Var;
    }

    public void setIsEditing(boolean z10) {
        this.f31221n = z10;
        this.v.f1();
        invalidate();
    }

    public void setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> callback2Return) {
        this.f31206b = callback2Return;
    }

    public void setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> callback2Return) {
        this.f31216h0 = callback2Return;
    }

    public void setReordering(boolean z10) {
        if (this.f31217i0 == z10) {
            return;
        }
        this.f31217i0 = z10;
        if (z10 && this.f31218j0 == null) {
            this.f31218j0 = new f2.f0(new kh.g(this, 5));
        }
        if (this.f31217i0 && this.f31219k0 == null) {
            j71 j71Var = new j71(this);
            this.f31219k0 = j71Var;
            j71Var.f5819m = false;
            j71Var.C = false;
            j71Var.o(er.h);
            this.f31219k0.n(350L);
        }
        f2.f0 f0Var = this.f31218j0;
        hh.f1 f1Var = this.v;
        if (f0Var != null) {
            f0Var.d(z10 ? f1Var : null);
        }
        f1Var.setItemAnimator(z10 ? this.f31219k0 : null);
        AndroidUtilities.forEachViews((RecyclerView) f1Var, (d5.d) new org.telegram.ui.lc(2, this, z10));
    }
}
