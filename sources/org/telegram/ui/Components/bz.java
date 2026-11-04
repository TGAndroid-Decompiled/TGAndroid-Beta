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
public abstract class bz extends FrameLayout {
    public static final int B0 = 0;
    public final Path A0;
    public boolean E;
    public boolean F;
    public final ci.j1 G;
    public final int H;
    public final kg.f0 I;
    public final org.telegram.ui.n4 J;
    public xy K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public float Q;
    public int R;
    public int S;
    public int T;
    public final GradientDrawable U;
    public int V;
    public int W;
    public final org.telegram.ui.ActionBar.e6 f32442a;
    public int f32443a0;
    public final TextPaint f32444b;
    public int f32445b0;
    public final TextPaint f32446c;
    public int f32447c0;
    public final TextPaint d;
    public int f32448d0;
    public final Paint f32449e;
    public int f32450e0;
    public PorterDuffColorFilter f32451f;
    public int f32452f0;
    public int f32453g0;
    public final ArrayList h;
    public int f32454h0;
    public boolean f32455i0;
    public final xq f32456j0;
    public final SparseIntArray f32457k0;
    public final SparseIntArray f32458l0;
    public final SparseIntArray m0;
    public boolean f32459n;
    public final SparseIntArray f32460n0;
    public final SparseIntArray f32461o0;
    public final SparseIntArray f32462p0;
    public float f32463q0;
    public long f32464r;
    public int f32465r0;
    public boolean f32466s;
    public int f32467s0;
    public final vy f32468t0;
    public Drawable f32469u0;
    public int f32470v0;
    public float f32471w;
    public final lt f32472w0;
    public float f32473x;
    public float f32474x0;
    public AnimatorSet f32475y;
    public final org.telegram.ui.Cells.f2 f32476y0;
    public gh.g f32477z0;

    public bz(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f32444b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f32446c = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.d = textPaint3;
        this.f32449e = new Paint(1);
        this.f32451f = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.h = new ArrayList();
        this.M = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.V = org.telegram.ui.ActionBar.k6.K8;
        this.W = org.telegram.ui.ActionBar.k6.I8;
        this.f32443a0 = org.telegram.ui.ActionBar.k6.J8;
        this.f32445b0 = org.telegram.ui.ActionBar.k6.L8;
        this.f32447c0 = org.telegram.ui.ActionBar.k6.f28160s8;
        this.f32448d0 = -1;
        this.f32450e0 = -1;
        this.f32452f0 = -1;
        this.f32453g0 = -1;
        this.f32456j0 = xq.h;
        this.f32457k0 = new SparseIntArray(5);
        this.f32458l0 = new SparseIntArray(5);
        this.m0 = new SparseIntArray(5);
        this.f32460n0 = new SparseIntArray(5);
        this.f32461o0 = new SparseIntArray(5);
        this.f32462p0 = new SparseIntArray(5);
        this.f32472w0 = new lt(this, 2);
        this.f32476y0 = new org.telegram.ui.Cells.f2(3, this);
        this.A0 = new Path();
        this.f32442a = e6Var;
        textPaint2.setTextSize(org.telegram.messenger.g0.N(11.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.N(14.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.U = gradientDrawable;
        float N = org.telegram.messenger.g0.N(14.0f);
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.w0(this.V, e6Var));
        setHorizontalScrollBarEnabled(false);
        ci.j1 j1Var = new ci.j1(19, context, this);
        this.G = j1Var;
        j1Var.setClipChildren(false);
        vy vyVar = new vy(this);
        this.f32468t0 = vyVar;
        vyVar.C = false;
        j1Var.setItemAnimator(vyVar);
        j1Var.setSelectorType(9);
        j1Var.setSelectorRadius(6);
        org.telegram.ui.ActionBar.r6.m(j1Var, 20, this.f32445b0, e6Var);
        kg.f0 f0Var = new kg.f0((ViewGroup) this, 2);
        this.I = f0Var;
        j1Var.setLayoutManager(f0Var);
        new u4.y(new az(this)).h(j1Var);
        int max = Math.max(0, org.telegram.messenger.g0.L(11.5f));
        this.H = max;
        j1Var.setPadding(max, 0, max, 0);
        j1Var.setClipToPadding(false);
        j1Var.setDrawSelectorBehind(true);
        org.telegram.ui.n4 n4Var = new org.telegram.ui.n4(2, this, context);
        this.J = n4Var;
        n4Var.C(true);
        j1Var.setAdapter(n4Var);
        j1Var.setOnItemClickListener(new ty(this));
        j1Var.setOnItemLongClickListener(new ty(this));
        j1Var.setOnScrollListener(new ji(this, 9));
        j1Var.f38482z2 = true;
        j1Var.setOverScrollMode(2);
        addView(j1Var, b8.mf.c(-1.0f, -1));
    }

    public final void a(int i3, int i10, String str, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.M == -1) {
            this.M = i3;
        }
        this.f32457k0.put(size, i3);
        this.f32458l0.put(size, i10);
        this.m0.put(i3, size);
        int i11 = this.M;
        if (i11 != -1 && i11 == i3) {
            this.L = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.f32444b;
        yy yyVar = new yy(this, i3, org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), arrayList, textPaint.getFontMetricsInt(), false), z10);
        yyVar.f40856e = z11;
        yyVar.f40857f = z12;
        this.N = org.telegram.messenger.k5.C(24.0f, yyVar.a(true), this.N);
        arrayList2.add(yyVar);
    }

    public final void b(int i3, int i10, int i11, int i12, int i13) {
        AnimatorSet animatorSet = this.f32475y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f32448d0 = i3;
        this.f32450e0 = i10;
        this.f32452f0 = i11;
        this.f32453g0 = i13;
        this.f32445b0 = i12;
        org.telegram.ui.ActionBar.r6.K(this.G, i12, this.f32442a);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f32475y = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f32476y0, 0.0f, 1.0f));
        this.f32475y.setDuration(320L);
        this.f32475y.addListener(new x5(this, 27));
        this.f32475y.start();
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bz.c():void");
    }

    public final yy d() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i3 < arrayList.size()) {
                if (((yy) arrayList.get(i3)).f40856e) {
                    return (yy) arrayList.get(i3);
                }
                i3++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.A0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r17, android.view.View r18, long r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bz.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void e(int i3) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.T != i3 && i3 >= 0 && i3 < arrayList.size()) {
            this.T = i3;
            this.G.y0(i3);
        }
    }

    public final void f(yy yyVar, int i3) {
        boolean z10;
        if (yyVar.f40857f) {
            xy xyVar = this.K;
            if (xyVar != null) {
                ((org.telegram.ui.kw) xyVar).c(yyVar, false);
                return;
            }
            return;
        }
        int i10 = this.L;
        if (i10 < i3) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.T = -1;
        this.f32465r0 = i10;
        this.f32467s0 = this.M;
        this.L = i3;
        this.M = yyVar.f40853a;
        boolean z11 = this.P;
        lt ltVar = this.f32472w0;
        if (z11) {
            org.telegram.messenger.g0.r(ltVar);
            this.P = false;
        }
        this.f32463q0 = 0.0f;
        this.Q = 0.0f;
        this.P = true;
        setEnabled(false);
        org.telegram.messenger.g0.i3(ltVar, 16L);
        xy xyVar2 = this.K;
        if (xyVar2 != null) {
            ((org.telegram.ui.kw) xyVar2).c(yyVar, z10);
        }
        e(i3);
    }

    public final void g(float f10, int i3) {
        int i10 = this.m0.get(i3, -1);
        if (i10 >= 0) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (f10 > 0.0f) {
                this.R = i10;
                this.S = i3;
            } else {
                this.R = -1;
                this.S = -1;
            }
            this.Q = f10;
            ci.j1 j1Var = this.G;
            j1Var.g1();
            j1Var.invalidate();
            invalidate();
            e(i10);
            if (f10 >= 1.0f) {
                this.R = -1;
                this.S = -1;
                this.L = i10;
                this.M = i3;
            }
        }
    }

    public int getCurrentTabId() {
        return this.M;
    }

    public int getCurrentTabStableId() {
        return this.f32458l0.get(this.L, -1);
    }

    public int getDefaultTabId() {
        yy d = d();
        if (d == null) {
            return -1;
        }
        return d.f40853a;
    }

    public int getFirstTabId() {
        return this.f32457k0.get(0, 0);
    }

    public int getLastTabId() {
        return this.f32457k0.get(getTabsCount() - 1, 0);
    }

    public tj0 getListView() {
        return this.G;
    }

    public int getSelectorColorKey() {
        return this.f32445b0;
    }

    public Drawable getSelectorDrawable() {
        return this.U;
    }

    public tj0 getTabsContainer() {
        return this.G;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i3) {
        for (int i10 = 0; i10 < this.h.size(); i10++) {
            if (this.f32458l0.get(i10, -1) == i3) {
                this.L = i10;
                this.M = this.f32457k0.get(i10);
                return true;
            }
        }
        return false;
    }

    public final void i(int i3) {
        int i10 = 0;
        while (true) {
            ci.j1 j1Var = this.G;
            if (i10 < j1Var.getChildCount()) {
                if (j1Var.getChildAt(i10) instanceof zy) {
                    zy zyVar = (zy) j1Var.getChildAt(i10);
                    if (zyVar.f41148b.f40853a == i3) {
                        zyVar.b(1.0f, 0);
                        try {
                            zyVar.performHapticFeedback(3);
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
        SparseIntArray sparseIntArray = this.f32462p0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.f32460n0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.f32461o0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i3 = this.H;
        for (int i10 = 0; i10 < size; i10++) {
            int a10 = ((yy) arrayList.get(i10)).a(false);
            sparseIntArray2.put(i10, a10);
            sparseIntArray3.put(i10, ((yy) arrayList.get(i10)).d);
            sparseIntArray.put(i10, (this.O / 2) + i3);
            i3 += org.telegram.messenger.g0.L(24.0f) + a10 + this.O;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        int i13 = i11 - i3;
        if (this.f32454h0 != i13) {
            this.f32454h0 = i13;
            this.T = -1;
            if (this.P) {
                org.telegram.messenger.g0.r(this.f32472w0);
                this.P = false;
                setEnabled(true);
                xy xyVar = this.K;
                if (xyVar != null) {
                    ((org.telegram.ui.kw) xyVar).b(1.0f);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i3) - (this.H * 2);
            yy d = d();
            if (d != null) {
                int i12 = 2131750808;
                d.b(org.telegram.messenger.bd.M0(2131750808, null));
                int a10 = d.a(false);
                if (this.N > size) {
                    i12 = 2131750807;
                }
                d.b(org.telegram.messenger.bd.M0(i12, null));
                int a11 = d.a(false) + (this.N - a10);
                int i13 = this.O;
                if (a11 < size) {
                    i11 = (size - a11) / arrayList.size();
                } else {
                    i11 = 0;
                }
                this.O = i11;
                if (i13 != i11) {
                    this.F = true;
                    ci.j1 j1Var = this.G;
                    u4.m0 itemAnimator = j1Var.getItemAnimator();
                    j1Var.setItemAnimator(null);
                    this.J.f();
                    j1Var.setItemAnimator(itemAnimator);
                    this.F = false;
                }
                j();
                this.f32455i0 = false;
            }
        }
        super.onMeasure(i3, i10);
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        Path path = this.A0;
        path.rewind();
        path.addRoundRect(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), i3 - org.telegram.messenger.g0.L(9.0f), i10 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), Path.Direction.CW);
    }

    @Override
    public final void requestLayout() {
        if (this.F) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.Q = f10;
        ci.j1 j1Var = this.G;
        j1Var.g1();
        j1Var.invalidate();
        invalidate();
        xy xyVar = this.K;
        if (xyVar != null) {
            ((org.telegram.ui.kw) xyVar).b(f10);
        }
    }

    public void setBlurredBackground(gh.g gVar) {
        this.f32477z0 = gVar;
        setBackground(gVar);
    }

    public void setDelegate(xy xyVar) {
        this.K = xyVar;
    }

    public void setIsEditing(boolean z10) {
        this.f32459n = z10;
        this.f32466s = true;
        ci.j1 j1Var = this.G;
        j1Var.g1();
        j1Var.invalidate();
        this.J.f();
        invalidate();
        if (!this.f32459n && this.E) {
            org.telegram.messenger.qr.a0(org.telegram.messenger.h10.f22829t0).y1();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList T0 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).T0();
            int size = T0.size();
            for (int i3 = 0; i3 < size; i3++) {
                org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) T0.get(i3);
                if (moVar.e()) {
                    tL_messages_updateDialogFiltersOrder.order.add(0);
                } else {
                    tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(moVar.f24237a));
                }
            }
            org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).i3();
            ConnectionsManager.getInstance(org.telegram.messenger.h10.f22829t0).sendRequest(tL_messages_updateDialogFiltersOrder, new ei.u5(20));
            this.E = false;
        }
    }
}
