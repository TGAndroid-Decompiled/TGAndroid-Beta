package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public abstract class fz extends FrameLayout {
    public static final int A0 = 0;
    public boolean D;
    public boolean E;
    public final bi.q1 F;
    public final int G;
    public final jg.i0 H;
    public final org.telegram.ui.l4 I;
    public bz J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public final GradientDrawable T;
    public int U;
    public int V;
    public int W;
    public final org.telegram.ui.ActionBar.g6 f33765a;
    public int f33766a0;
    public final TextPaint f33767b;
    public int f33768b0;
    public final TextPaint f33769c;
    public int f33770c0;
    public final TextPaint d;
    public int f33771d0;
    public final Paint f33772e;
    public int f33773e0;
    public PorterDuffColorFilter f33774f;
    public int f33775f0;
    public int f33776g0;
    public final ArrayList h;
    public boolean f33777h0;
    public final xq f33778i0;
    public final SparseIntArray f33779j0;
    public final SparseIntArray f33780k0;
    public final SparseIntArray f33781l0;
    public final SparseIntArray m0;
    public boolean f33782n;
    public final SparseIntArray f33783n0;
    public final SparseIntArray f33784o0;
    public float f33785p0;
    public int f33786q0;
    public long f33787r;
    public int f33788r0;
    public boolean f33789s;
    public final zy f33790s0;
    public Drawable f33791t0;
    public int f33792u0;
    public final et f33793v0;
    public float f33794w;
    public float f33795w0;
    public float f33796x;
    public final org.telegram.ui.Cells.f2 f33797x0;
    public AnimatorSet f33798y;
    public fh.g f33799y0;
    public final Path f33800z0;

    public fz(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f33767b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f33769c = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.d = textPaint3;
        this.f33772e = new Paint(1);
        this.f33774f = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.h = new ArrayList();
        this.L = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.U = org.telegram.ui.ActionBar.l6.K8;
        this.V = org.telegram.ui.ActionBar.l6.I8;
        this.W = org.telegram.ui.ActionBar.l6.J8;
        this.f33766a0 = org.telegram.ui.ActionBar.l6.L8;
        this.f33768b0 = org.telegram.ui.ActionBar.l6.f28145s8;
        this.f33770c0 = -1;
        this.f33771d0 = -1;
        this.f33773e0 = -1;
        this.f33775f0 = -1;
        this.f33778i0 = xq.h;
        this.f33779j0 = new SparseIntArray(5);
        this.f33780k0 = new SparseIntArray(5);
        this.f33781l0 = new SparseIntArray(5);
        this.m0 = new SparseIntArray(5);
        this.f33783n0 = new SparseIntArray(5);
        this.f33784o0 = new SparseIntArray(5);
        this.f33793v0 = new et(this, 3);
        this.f33797x0 = new org.telegram.ui.Cells.f2(3, this);
        this.f33800z0 = new Path();
        this.f33765a = g6Var;
        textPaint2.setTextSize(org.telegram.messenger.g0.N(11.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.N(14.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.T = gradientDrawable;
        float N = org.telegram.messenger.g0.N(14.0f);
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        gradientDrawable.setColor(org.telegram.ui.ActionBar.l6.w0(this.U, g6Var));
        setHorizontalScrollBarEnabled(false);
        bi.q1 q1Var = new bi.q1(19, context, this);
        this.F = q1Var;
        q1Var.setClipChildren(false);
        zy zyVar = new zy(this);
        this.f33790s0 = zyVar;
        zyVar.C = false;
        q1Var.setItemAnimator(zyVar);
        q1Var.setSelectorType(9);
        q1Var.setSelectorRadius(6);
        org.telegram.ui.ActionBar.s6.l(q1Var, 20, this.f33766a0, g6Var);
        jg.i0 i0Var = new jg.i0((ViewGroup) this, 2);
        this.H = i0Var;
        q1Var.setLayoutManager(i0Var);
        new v4.y(new ez(this)).h(q1Var);
        int max = Math.max(0, org.telegram.messenger.g0.L(11.5f));
        this.G = max;
        q1Var.setPadding(max, 0, max, 0);
        q1Var.setClipToPadding(false);
        q1Var.setDrawSelectorBehind(true);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(2, this, context);
        this.I = l4Var;
        l4Var.C(true);
        q1Var.setAdapter(l4Var);
        q1Var.setOnItemClickListener(new xy(this));
        q1Var.setOnItemLongClickListener(new xy(this));
        q1Var.setOnScrollListener(new ui(this, 7));
        q1Var.f37403y2 = true;
        q1Var.setOverScrollMode(2);
        addView(q1Var, c8.ha.c(-1.0f, -1));
    }

    public final void a(int i7, int i10, String str, ArrayList arrayList, boolean z9, boolean z10, boolean z11) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.L == -1) {
            this.L = i7;
        }
        this.f33779j0.put(size, i7);
        this.f33780k0.put(size, i10);
        this.f33781l0.put(i7, size);
        int i11 = this.L;
        if (i11 != -1 && i11 == i7) {
            this.K = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.f33767b;
        cz czVar = new cz(this, i7, org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), arrayList, textPaint.getFontMetricsInt(), false), z9);
        czVar.f32793e = z10;
        czVar.f32794f = z11;
        this.M = org.telegram.messenger.k5.C(24.0f, czVar.a(true), this.M);
        arrayList2.add(czVar);
    }

    public final void b(int i7, int i10, int i11, int i12, int i13) {
        AnimatorSet animatorSet = this.f33798y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f33770c0 = i7;
        this.f33771d0 = i10;
        this.f33773e0 = i11;
        this.f33775f0 = i13;
        this.f33766a0 = i12;
        org.telegram.ui.ActionBar.s6.J(this.F, i12, this.f33765a);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33798y = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f33797x0, 0.0f, 1.0f));
        this.f33798y.setDuration(320L);
        this.f33798y.addListener(new z5(this, 27));
        this.f33798y.start();
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fz.c():void");
    }

    public final cz d() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                if (((cz) arrayList.get(i7)).f32793e) {
                    return (cz) arrayList.get(i7);
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f33800z0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r17, android.view.View r18, long r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fz.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void e(int i7) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.S != i7 && i7 >= 0 && i7 < arrayList.size()) {
            this.S = i7;
            this.F.y0(i7);
        }
    }

    public final void f(cz czVar, int i7) {
        boolean z9;
        if (czVar.f32794f) {
            bz bzVar = this.J;
            if (bzVar != null) {
                ((org.telegram.ui.pw) bzVar).c(czVar, false);
                return;
            }
            return;
        }
        int i10 = this.K;
        if (i10 < i7) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.S = -1;
        this.f33786q0 = i10;
        this.f33788r0 = this.L;
        this.K = i7;
        this.L = czVar.f32790a;
        boolean z10 = this.O;
        et etVar = this.f33793v0;
        if (z10) {
            org.telegram.messenger.g0.r(etVar);
            this.O = false;
        }
        this.f33785p0 = 0.0f;
        this.P = 0.0f;
        this.O = true;
        setEnabled(false);
        org.telegram.messenger.g0.i3(etVar, 16L);
        bz bzVar2 = this.J;
        if (bzVar2 != null) {
            ((org.telegram.ui.pw) bzVar2).c(czVar, z9);
        }
        e(i7);
    }

    public final void g(float f10, int i7) {
        int i10 = this.f33781l0.get(i7, -1);
        if (i10 >= 0) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (f10 > 0.0f) {
                this.Q = i10;
                this.R = i7;
            } else {
                this.Q = -1;
                this.R = -1;
            }
            this.P = f10;
            bi.q1 q1Var = this.F;
            q1Var.g1();
            q1Var.invalidate();
            invalidate();
            e(i10);
            if (f10 >= 1.0f) {
                this.Q = -1;
                this.R = -1;
                this.K = i10;
                this.L = i7;
            }
        }
    }

    public int getCurrentTabId() {
        return this.L;
    }

    public int getCurrentTabStableId() {
        return this.f33780k0.get(this.K, -1);
    }

    public int getDefaultTabId() {
        cz d = d();
        if (d == null) {
            return -1;
        }
        return d.f32790a;
    }

    public int getFirstTabId() {
        return this.f33779j0.get(0, 0);
    }

    public int getLastTabId() {
        return this.f33779j0.get(getTabsCount() - 1, 0);
    }

    public qj0 getListView() {
        return this.F;
    }

    public int getSelectorColorKey() {
        return this.f33766a0;
    }

    public Drawable getSelectorDrawable() {
        return this.T;
    }

    public qj0 getTabsContainer() {
        return this.F;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i7) {
        for (int i10 = 0; i10 < this.h.size(); i10++) {
            if (this.f33780k0.get(i10, -1) == i7) {
                this.K = i10;
                this.L = this.f33779j0.get(i10);
                return true;
            }
        }
        return false;
    }

    public final void i(int i7) {
        int i10 = 0;
        while (true) {
            bi.q1 q1Var = this.F;
            if (i10 < q1Var.getChildCount()) {
                if (q1Var.getChildAt(i10) instanceof dz) {
                    dz dzVar = (dz) q1Var.getChildAt(i10);
                    if (dzVar.f33209b.f32790a == i7) {
                        dzVar.b(1.0f, 0);
                        try {
                            dzVar.performHapticFeedback(3);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void j() {
        SparseIntArray sparseIntArray = this.f33784o0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.m0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.f33783n0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i7 = this.G;
        for (int i10 = 0; i10 < size; i10++) {
            int a10 = ((cz) arrayList.get(i10)).a(false);
            sparseIntArray2.put(i10, a10);
            sparseIntArray3.put(i10, ((cz) arrayList.get(i10)).d);
            sparseIntArray.put(i10, (this.N / 2) + i7);
            i7 += org.telegram.messenger.g0.L(24.0f) + a10 + this.N;
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int i13 = i11 - i7;
        if (this.f33776g0 != i13) {
            this.f33776g0 = i13;
            this.S = -1;
            if (this.O) {
                org.telegram.messenger.g0.r(this.f33793v0);
                this.O = false;
                setEnabled(true);
                bz bzVar = this.J;
                if (bzVar != null) {
                    ((org.telegram.ui.pw) bzVar).b(1.0f);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i7) - (this.G * 2);
            cz d = d();
            if (d != null) {
                int i12 = 2131750807;
                d.b(org.telegram.messenger.id.M0(2131750807, null));
                int a10 = d.a(false);
                if (this.M > size) {
                    i12 = 2131750806;
                }
                d.b(org.telegram.messenger.id.M0(i12, null));
                int a11 = d.a(false) + (this.M - a10);
                int i13 = this.N;
                if (a11 < size) {
                    i11 = (size - a11) / arrayList.size();
                } else {
                    i11 = 0;
                }
                this.N = i11;
                if (i13 != i11) {
                    this.E = true;
                    bi.q1 q1Var = this.F;
                    v4.l0 itemAnimator = q1Var.getItemAnimator();
                    q1Var.setItemAnimator(null);
                    this.I.f();
                    q1Var.setItemAnimator(itemAnimator);
                    this.E = false;
                }
                j();
                this.f33777h0 = false;
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Path path = this.f33800z0;
        path.rewind();
        path.addRoundRect(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), i7 - org.telegram.messenger.g0.L(9.0f), i10 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), Path.Direction.CW);
    }

    @Override
    public final void requestLayout() {
        if (this.E) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.P = f10;
        bi.q1 q1Var = this.F;
        q1Var.g1();
        q1Var.invalidate();
        invalidate();
        bz bzVar = this.J;
        if (bzVar != null) {
            ((org.telegram.ui.pw) bzVar).b(f10);
        }
    }

    public void setBlurredBackground(fh.g gVar) {
        this.f33799y0 = gVar;
        setBackground(gVar);
    }

    public void setDelegate(bz bzVar) {
        this.J = bzVar;
    }

    public void setIsEditing(boolean z9) {
        this.f33782n = z9;
        this.f33789s = true;
        bi.q1 q1Var = this.F;
        q1Var.g1();
        q1Var.invalidate();
        this.I.f();
        invalidate();
        if (!this.f33782n && this.D) {
            org.telegram.messenger.yr.a0(org.telegram.messenger.p10.f24470s0).y1();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList T0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).T0();
            int size = T0.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) T0.get(i7);
                if (voVar.e()) {
                    tL_messages_updateDialogFiltersOrder.order.add(0);
                } else {
                    tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(voVar.f26070a));
                }
            }
            org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).i3();
            ConnectionsManager.getInstance(org.telegram.messenger.p10.f24470s0).sendRequest(tL_messages_updateDialogFiltersOrder, new di.v5(20));
            this.D = false;
        }
    }
}
