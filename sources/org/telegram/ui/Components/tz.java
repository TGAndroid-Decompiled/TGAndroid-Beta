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
public abstract class tz extends FrameLayout {
    public static final int A0 = 0;
    public boolean D;
    public boolean E;
    public final ag.b1 F;
    public final int G;
    public final org.telegram.ui.br H;
    public final fg.j I;
    public oz J;
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
    public final org.telegram.ui.ActionBar.p6 f30701a;
    public int f30702a0;
    public final TextPaint f30703b;
    public int f30704b0;
    public final TextPaint f30705c;
    public int f30706c0;
    public final TextPaint d;
    public int f30707d0;
    public final Paint e;
    public int f30708e0;
    public PorterDuffColorFilter f30709f;
    public int f30710f0;
    public int f30711g0;
    public final ArrayList h;
    public boolean f30712h0;
    public final gr f30713i0;
    public final SparseIntArray f30714j0;
    public final SparseIntArray f30715k0;
    public final SparseIntArray f30716l0;
    public final SparseIntArray m0;
    public boolean f30717n;
    public final SparseIntArray f30718n0;
    public final SparseIntArray f30719o0;
    public float f30720p0;
    public int f30721q0;
    public long f30722r;
    public int f30723r0;
    public boolean f30724s;
    public final mz f30725s0;
    public Drawable f30726t0;
    public int f30727u0;
    public final ew f30728v0;
    public float f30729w;
    public float f30730w0;
    public float f30731x;
    public final org.telegram.ui.Cells.f2 f30732x0;
    public AnimatorSet f30733y;
    public vg.f f30734y0;
    public final Path f30735z0;

    public tz(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f30703b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f30705c = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.d = textPaint3;
        this.e = new Paint(1);
        this.f30709f = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.h = new ArrayList();
        this.L = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.U = org.telegram.ui.ActionBar.t6.K8;
        this.V = org.telegram.ui.ActionBar.t6.I8;
        this.W = org.telegram.ui.ActionBar.t6.J8;
        this.f30702a0 = org.telegram.ui.ActionBar.t6.L8;
        this.f30704b0 = org.telegram.ui.ActionBar.t6.f21206s8;
        this.f30706c0 = -1;
        this.f30707d0 = -1;
        this.f30708e0 = -1;
        this.f30710f0 = -1;
        this.f30713i0 = gr.h;
        this.f30714j0 = new SparseIntArray(5);
        this.f30715k0 = new SparseIntArray(5);
        this.f30716l0 = new SparseIntArray(5);
        this.m0 = new SparseIntArray(5);
        this.f30718n0 = new SparseIntArray(5);
        this.f30719o0 = new SparseIntArray(5);
        this.f30728v0 = new ew(this, 1);
        this.f30732x0 = new org.telegram.ui.Cells.f2(3, this);
        this.f30735z0 = new Path();
        this.f30701a = p6Var;
        textPaint2.setTextSize(org.telegram.messenger.i0.N(11.0f));
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.N(14.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.T = gradientDrawable;
        float N = org.telegram.messenger.i0.N(14.0f);
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        gradientDrawable.setColor(org.telegram.ui.ActionBar.t6.w0(this.U, p6Var));
        setHorizontalScrollBarEnabled(false);
        ag.b1 b1Var = new ag.b1(this, context, 14);
        this.F = b1Var;
        b1Var.setClipChildren(false);
        mz mzVar = new mz(this);
        this.f30725s0 = mzVar;
        mzVar.C = false;
        b1Var.setItemAnimator(mzVar);
        b1Var.setSelectorType(9);
        b1Var.setSelectorRadius(6);
        org.telegram.ui.ActionBar.a7.m(b1Var, 20, this.f30702a0, p6Var);
        org.telegram.ui.br brVar = new org.telegram.ui.br((ViewGroup) this, 1);
        this.H = brVar;
        b1Var.setLayoutManager(brVar);
        new s4.x(new sz(this)).h(b1Var);
        int max = Math.max(0, org.telegram.messenger.i0.L(11.5f));
        this.G = max;
        b1Var.setPadding(max, 0, max, 0);
        b1Var.setClipToPadding(false);
        b1Var.setDrawSelectorBehind(true);
        fg.j jVar = new fg.j(3, this, context);
        this.I = jVar;
        jVar.C(true);
        b1Var.setAdapter(jVar);
        b1Var.setOnItemClickListener(new kz(this));
        b1Var.setOnItemLongClickListener(new kz(this));
        b1Var.setOnScrollListener(new ag.u(this, 22));
        b1Var.f30647y2 = true;
        b1Var.setOverScrollMode(2);
        addView(b1Var, w7.b6.c(-1.0f, -1));
    }

    public final void a(int i10, int i11, String str, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.L == -1) {
            this.L = i10;
        }
        this.f30714j0.put(size, i10);
        this.f30715k0.put(size, i11);
        this.f30716l0.put(i10, size);
        int i12 = this.L;
        if (i12 != -1 && i12 == i10) {
            this.K = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.f30703b;
        pz pzVar = new pz(this, i10, org.telegram.messenger.jj.A5(org.telegram.messenger.k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), arrayList, textPaint.getFontMetricsInt(), false), z10);
        pzVar.e = z11;
        pzVar.f29474f = z12;
        this.M = org.telegram.messenger.m5.C(24.0f, pzVar.a(true), this.M);
        arrayList2.add(pzVar);
    }

    public final void b(int i10, int i11, int i12, int i13, int i14) {
        AnimatorSet animatorSet = this.f30733y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f30706c0 = i10;
        this.f30707d0 = i11;
        this.f30708e0 = i12;
        this.f30710f0 = i14;
        this.f30702a0 = i13;
        org.telegram.ui.ActionBar.a7.K(this.F, i13, this.f30701a);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f30733y = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f30732x0, 0.0f, 1.0f));
        this.f30733y.setDuration(320L);
        this.f30733y.addListener(new w5(this, 27));
        this.f30733y.start();
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tz.c():void");
    }

    public final pz d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((pz) arrayList.get(i10)).e) {
                    return (pz) arrayList.get(i10);
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f30735z0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r17, android.view.View r18, long r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tz.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void e(int i10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.S != i10 && i10 >= 0 && i10 < arrayList.size()) {
            this.S = i10;
            this.F.y0(i10);
        }
    }

    public final void f(pz pzVar, int i10) {
        boolean z10;
        if (pzVar.f29474f) {
            oz ozVar = this.J;
            if (ozVar != null) {
                ((org.telegram.ui.rx) ozVar).c(pzVar, false);
                return;
            }
            return;
        }
        int i11 = this.K;
        if (i11 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.S = -1;
        this.f30721q0 = i11;
        this.f30723r0 = this.L;
        this.K = i10;
        this.L = pzVar.f29471a;
        boolean z11 = this.O;
        ew ewVar = this.f30728v0;
        if (z11) {
            org.telegram.messenger.i0.r(ewVar);
            this.O = false;
        }
        this.f30720p0 = 0.0f;
        this.P = 0.0f;
        this.O = true;
        setEnabled(false);
        org.telegram.messenger.i0.h3(ewVar, 16L);
        oz ozVar2 = this.J;
        if (ozVar2 != null) {
            ((org.telegram.ui.rx) ozVar2).c(pzVar, z10);
        }
        e(i10);
    }

    public final void g(float f7, int i10) {
        int i11 = this.f30716l0.get(i10, -1);
        if (i11 >= 0) {
            if (f7 < 0.0f) {
                f7 = 0.0f;
            } else if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            if (f7 > 0.0f) {
                this.Q = i11;
                this.R = i10;
            } else {
                this.Q = -1;
                this.R = -1;
            }
            this.P = f7;
            ag.b1 b1Var = this.F;
            b1Var.g1();
            b1Var.invalidate();
            invalidate();
            e(i11);
            if (f7 >= 1.0f) {
                this.Q = -1;
                this.R = -1;
                this.K = i11;
                this.L = i10;
            }
        }
    }

    public int getCurrentTabId() {
        return this.L;
    }

    public int getCurrentTabStableId() {
        return this.f30715k0.get(this.K, -1);
    }

    public int getDefaultTabId() {
        pz d = d();
        if (d == null) {
            return -1;
        }
        return d.f29471a;
    }

    public int getFirstTabId() {
        return this.f30714j0.get(0, 0);
    }

    public int getLastTabId() {
        return this.f30714j0.get(getTabsCount() - 1, 0);
    }

    public tk0 getListView() {
        return this.F;
    }

    public int getSelectorColorKey() {
        return this.f30702a0;
    }

    public Drawable getSelectorDrawable() {
        return this.T;
    }

    public tk0 getTabsContainer() {
        return this.F;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i10) {
        for (int i11 = 0; i11 < this.h.size(); i11++) {
            if (this.f30715k0.get(i11, -1) == i10) {
                this.K = i11;
                this.L = this.f30714j0.get(i11);
                return true;
            }
        }
        return false;
    }

    public final void i(int i10) {
        int i11 = 0;
        while (true) {
            ag.b1 b1Var = this.F;
            if (i11 < b1Var.getChildCount()) {
                if (b1Var.getChildAt(i11) instanceof rz) {
                    rz rzVar = (rz) b1Var.getChildAt(i11);
                    if (rzVar.f30049b.f29471a == i10) {
                        rzVar.b(1.0f, 0);
                        try {
                            rzVar.performHapticFeedback(3);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final void j() {
        SparseIntArray sparseIntArray = this.f30719o0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.m0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.f30718n0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = this.G;
        for (int i11 = 0; i11 < size; i11++) {
            int a2 = ((pz) arrayList.get(i11)).a(false);
            sparseIntArray2.put(i11, a2);
            sparseIntArray3.put(i11, ((pz) arrayList.get(i11)).d);
            sparseIntArray.put(i11, (this.N / 2) + i10);
            i10 += org.telegram.messenger.i0.L(24.0f) + a2 + this.N;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.f30711g0 != i14) {
            this.f30711g0 = i14;
            this.S = -1;
            if (this.O) {
                org.telegram.messenger.i0.r(this.f30728v0);
                this.O = false;
                setEnabled(true);
                oz ozVar = this.J;
                if (ozVar != null) {
                    ((org.telegram.ui.rx) ozVar).b(1.0f);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i10) - (this.G * 2);
            pz d = d();
            if (d != null) {
                int i13 = 2131750808;
                d.b(org.telegram.messenger.cd.L0(2131750808, null));
                int a2 = d.a(false);
                if (this.M > size) {
                    i13 = 2131750807;
                }
                d.b(org.telegram.messenger.cd.L0(i13, null));
                int a10 = d.a(false) + (this.M - a2);
                int i14 = this.N;
                if (a10 < size) {
                    i12 = (size - a10) / arrayList.size();
                } else {
                    i12 = 0;
                }
                this.N = i12;
                if (i14 != i12) {
                    this.E = true;
                    ag.b1 b1Var = this.F;
                    s4.l0 itemAnimator = b1Var.getItemAnimator();
                    b1Var.setItemAnimator(null);
                    this.I.f();
                    b1Var.setItemAnimator(itemAnimator);
                    this.E = false;
                }
                j();
                this.f30712h0 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f30735z0;
        path.rewind();
        path.addRoundRect(org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), i10 - org.telegram.messenger.i0.L(9.0f), i11 - org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), Path.Direction.CW);
    }

    @Override
    public final void requestLayout() {
        if (this.E) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.P = f7;
        ag.b1 b1Var = this.F;
        b1Var.g1();
        b1Var.invalidate();
        invalidate();
        oz ozVar = this.J;
        if (ozVar != null) {
            ((org.telegram.ui.rx) ozVar).b(f7);
        }
    }

    public void setBlurredBackground(vg.f fVar) {
        this.f30734y0 = fVar;
        setBackground(fVar);
    }

    public void setDelegate(oz ozVar) {
        this.J = ozVar;
    }

    public void setIsEditing(boolean z10) {
        this.f30717n = z10;
        this.f30724s = true;
        ag.b1 b1Var = this.F;
        b1Var.g1();
        b1Var.invalidate();
        this.I.f();
        invalidate();
        if (!this.f30717n && this.D) {
            org.telegram.messenger.hs.a0(org.telegram.messenger.d20.f15147s0).y1();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList S0 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).S0();
            int size = S0.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) S0.get(i10);
                if (apVar.e()) {
                    tL_messages_updateDialogFiltersOrder.order.add(0);
                } else {
                    tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(apVar.f14645a));
                }
            }
            org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).g3();
            ConnectionsManager.getInstance(org.telegram.messenger.d20.f15147s0).sendRequest(tL_messages_updateDialogFiltersOrder, new ag.c3(15));
            this.D = false;
        }
    }
}
