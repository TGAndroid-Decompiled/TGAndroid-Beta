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
public abstract class ez extends FrameLayout {
    public static final int A0 = 0;
    public boolean D;
    public boolean E;
    public final bi.q1 F;
    public final int G;
    public final jg.i0 H;
    public final org.telegram.ui.l4 I;
    public az J;
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
    public final org.telegram.ui.ActionBar.f6 f33371a;
    public int f33372a0;
    public final TextPaint f33373b;
    public int f33374b0;
    public final TextPaint f33375c;
    public int f33376c0;
    public final TextPaint d;
    public int f33377d0;
    public final Paint f33378e;
    public int f33379e0;
    public PorterDuffColorFilter f33380f;
    public int f33381f0;
    public int f33382g0;
    public final ArrayList h;
    public boolean f33383h0;
    public final xq f33384i0;
    public final SparseIntArray f33385j0;
    public final SparseIntArray f33386k0;
    public final SparseIntArray f33387l0;
    public final SparseIntArray m0;
    public boolean f33388n;
    public final SparseIntArray f33389n0;
    public final SparseIntArray f33390o0;
    public float f33391p0;
    public int f33392q0;
    public long f33393r;
    public int f33394r0;
    public boolean f33395s;
    public final yy f33396s0;
    public Drawable f33397t0;
    public int f33398u0;
    public final dt f33399v0;
    public float f33400w;
    public float f33401w0;
    public float f33402x;
    public final org.telegram.ui.Cells.f2 f33403x0;
    public AnimatorSet f33404y;
    public fh.g f33405y0;
    public final Path f33406z0;

    public ez(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f33373b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f33375c = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.d = textPaint3;
        this.f33378e = new Paint(1);
        this.f33380f = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.h = new ArrayList();
        this.L = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.U = org.telegram.ui.ActionBar.k6.K8;
        this.V = org.telegram.ui.ActionBar.k6.I8;
        this.W = org.telegram.ui.ActionBar.k6.J8;
        this.f33372a0 = org.telegram.ui.ActionBar.k6.L8;
        this.f33374b0 = org.telegram.ui.ActionBar.k6.f28128s8;
        this.f33376c0 = -1;
        this.f33377d0 = -1;
        this.f33379e0 = -1;
        this.f33381f0 = -1;
        this.f33384i0 = xq.h;
        this.f33385j0 = new SparseIntArray(5);
        this.f33386k0 = new SparseIntArray(5);
        this.f33387l0 = new SparseIntArray(5);
        this.m0 = new SparseIntArray(5);
        this.f33389n0 = new SparseIntArray(5);
        this.f33390o0 = new SparseIntArray(5);
        this.f33399v0 = new dt(this, 3);
        this.f33403x0 = new org.telegram.ui.Cells.f2(3, this);
        this.f33406z0 = new Path();
        this.f33371a = f6Var;
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.w0(this.U, f6Var));
        setHorizontalScrollBarEnabled(false);
        bi.q1 q1Var = new bi.q1(19, context, this);
        this.F = q1Var;
        q1Var.setClipChildren(false);
        yy yyVar = new yy(this);
        this.f33396s0 = yyVar;
        yyVar.C = false;
        q1Var.setItemAnimator(yyVar);
        q1Var.setSelectorType(9);
        q1Var.setSelectorRadius(6);
        org.telegram.ui.ActionBar.r6.m(q1Var, 20, this.f33372a0, f6Var);
        jg.i0 i0Var = new jg.i0((ViewGroup) this, 2);
        this.H = i0Var;
        q1Var.setLayoutManager(i0Var);
        new v4.y(new dz(this)).h(q1Var);
        int max = Math.max(0, org.telegram.messenger.g0.L(11.5f));
        this.G = max;
        q1Var.setPadding(max, 0, max, 0);
        q1Var.setClipToPadding(false);
        q1Var.setDrawSelectorBehind(true);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(2, this, context);
        this.I = l4Var;
        l4Var.C(true);
        q1Var.setAdapter(l4Var);
        q1Var.setOnItemClickListener(new wy(this));
        q1Var.setOnItemLongClickListener(new wy(this));
        q1Var.setOnScrollListener(new ui(this, 7));
        q1Var.f36961y2 = true;
        q1Var.setOverScrollMode(2);
        addView(q1Var, c8.ha.c(-1.0f, -1));
    }

    public final void a(int i7, int i10, String str, ArrayList arrayList, boolean z9, boolean z10, boolean z11) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.L == -1) {
            this.L = i7;
        }
        this.f33385j0.put(size, i7);
        this.f33386k0.put(size, i10);
        this.f33387l0.put(i7, size);
        int i11 = this.L;
        if (i11 != -1 && i11 == i7) {
            this.K = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.f33373b;
        bz bzVar = new bz(this, i7, org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), arrayList, textPaint.getFontMetricsInt(), false), z9);
        bzVar.f32330e = z10;
        bzVar.f32331f = z11;
        this.M = org.telegram.messenger.k5.C(24.0f, bzVar.a(true), this.M);
        arrayList2.add(bzVar);
    }

    public final void b(int i7, int i10, int i11, int i12, int i13) {
        AnimatorSet animatorSet = this.f33404y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f33376c0 = i7;
        this.f33377d0 = i10;
        this.f33379e0 = i11;
        this.f33381f0 = i13;
        this.f33372a0 = i12;
        org.telegram.ui.ActionBar.r6.K(this.F, i12, this.f33371a);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33404y = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f33403x0, 0.0f, 1.0f));
        this.f33404y.setDuration(320L);
        this.f33404y.addListener(new z5(this, 27));
        this.f33404y.start();
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ez.c():void");
    }

    public final bz d() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                if (((bz) arrayList.get(i7)).f32330e) {
                    return (bz) arrayList.get(i7);
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
        canvas.clipPath(this.f33406z0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r17, android.view.View r18, long r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ez.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void e(int i7) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.S != i7 && i7 >= 0 && i7 < arrayList.size()) {
            this.S = i7;
            this.F.y0(i7);
        }
    }

    public final void f(bz bzVar, int i7) {
        boolean z9;
        if (bzVar.f32331f) {
            az azVar = this.J;
            if (azVar != null) {
                ((org.telegram.ui.nw) azVar).c(bzVar, false);
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
        this.f33392q0 = i10;
        this.f33394r0 = this.L;
        this.K = i7;
        this.L = bzVar.f32327a;
        boolean z10 = this.O;
        dt dtVar = this.f33399v0;
        if (z10) {
            org.telegram.messenger.g0.r(dtVar);
            this.O = false;
        }
        this.f33391p0 = 0.0f;
        this.P = 0.0f;
        this.O = true;
        setEnabled(false);
        org.telegram.messenger.g0.i3(dtVar, 16L);
        az azVar2 = this.J;
        if (azVar2 != null) {
            ((org.telegram.ui.nw) azVar2).c(bzVar, z9);
        }
        e(i7);
    }

    public final void g(float f10, int i7) {
        int i10 = this.f33387l0.get(i7, -1);
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
        return this.f33386k0.get(this.K, -1);
    }

    public int getDefaultTabId() {
        bz d = d();
        if (d == null) {
            return -1;
        }
        return d.f32327a;
    }

    public int getFirstTabId() {
        return this.f33385j0.get(0, 0);
    }

    public int getLastTabId() {
        return this.f33385j0.get(getTabsCount() - 1, 0);
    }

    public pj0 getListView() {
        return this.F;
    }

    public int getSelectorColorKey() {
        return this.f33372a0;
    }

    public Drawable getSelectorDrawable() {
        return this.T;
    }

    public pj0 getTabsContainer() {
        return this.F;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i7) {
        for (int i10 = 0; i10 < this.h.size(); i10++) {
            if (this.f33386k0.get(i10, -1) == i7) {
                this.K = i10;
                this.L = this.f33385j0.get(i10);
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
                if (q1Var.getChildAt(i10) instanceof cz) {
                    cz czVar = (cz) q1Var.getChildAt(i10);
                    if (czVar.f32704b.f32327a == i7) {
                        czVar.b(1.0f, 0);
                        try {
                            czVar.performHapticFeedback(3);
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
        SparseIntArray sparseIntArray = this.f33390o0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.m0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.f33389n0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i7 = this.G;
        for (int i10 = 0; i10 < size; i10++) {
            int a10 = ((bz) arrayList.get(i10)).a(false);
            sparseIntArray2.put(i10, a10);
            sparseIntArray3.put(i10, ((bz) arrayList.get(i10)).d);
            sparseIntArray.put(i10, (this.N / 2) + i7);
            i7 += org.telegram.messenger.g0.L(24.0f) + a10 + this.N;
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int i13 = i11 - i7;
        if (this.f33382g0 != i13) {
            this.f33382g0 = i13;
            this.S = -1;
            if (this.O) {
                org.telegram.messenger.g0.r(this.f33399v0);
                this.O = false;
                setEnabled(true);
                az azVar = this.J;
                if (azVar != null) {
                    ((org.telegram.ui.nw) azVar).b(1.0f);
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
            bz d = d();
            if (d != null) {
                int i12 = 2131750808;
                d.b(org.telegram.messenger.hd.M0(2131750808, null));
                int a10 = d.a(false);
                if (this.M > size) {
                    i12 = 2131750807;
                }
                d.b(org.telegram.messenger.hd.M0(i12, null));
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
                this.f33383h0 = false;
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Path path = this.f33406z0;
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
        az azVar = this.J;
        if (azVar != null) {
            ((org.telegram.ui.nw) azVar).b(f10);
        }
    }

    public void setBlurredBackground(fh.g gVar) {
        this.f33405y0 = gVar;
        setBackground(gVar);
    }

    public void setDelegate(az azVar) {
        this.J = azVar;
    }

    public void setIsEditing(boolean z9) {
        this.f33388n = z9;
        this.f33395s = true;
        bi.q1 q1Var = this.F;
        q1Var.g1();
        q1Var.invalidate();
        this.I.f();
        invalidate();
        if (!this.f33388n && this.D) {
            org.telegram.messenger.yr.a0(org.telegram.messenger.p10.f24459s0).y1();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList T0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).T0();
            int size = T0.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) T0.get(i7);
                if (voVar.e()) {
                    tL_messages_updateDialogFiltersOrder.order.add(0);
                } else {
                    tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(voVar.f26056a));
                }
            }
            org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).i3();
            ConnectionsManager.getInstance(org.telegram.messenger.p10.f24459s0).sendRequest(tL_messages_updateDialogFiltersOrder, new di.u5(20));
            this.D = false;
        }
    }
}
