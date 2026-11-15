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
public abstract class iz extends FrameLayout {
    public static final int B0 = 0;
    public final Path A0;
    public boolean E;
    public boolean F;
    public final di.c1 G;
    public final int H;
    public final jg.i0 I;
    public final org.telegram.ui.l4 J;
    public ez K;
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
    public final org.telegram.ui.ActionBar.e6 f35781a;
    public int f35782a0;
    public final TextPaint f35783b;
    public int f35784b0;
    public final TextPaint f35785c;
    public int f35786c0;
    public final TextPaint d;
    public int f35787d0;
    public final Paint f35788e;
    public int f35789e0;
    public PorterDuffColorFilter f35790f;
    public int f35791f0;
    public int f35792g0;
    public final ArrayList h;
    public int f35793h0;
    public boolean f35794i0;
    public final er f35795j0;
    public final SparseIntArray f35796k0;
    public final SparseIntArray f35797l0;
    public final SparseIntArray m0;
    public boolean f35798n;
    public final SparseIntArray f35799n0;
    public final SparseIntArray f35800o0;
    public final SparseIntArray f35801p0;
    public float f35802q0;
    public long f35803r;
    public int f35804r0;
    public boolean f35805s;
    public int f35806s0;
    public final cz f35807t0;
    public Drawable f35808u0;
    public int f35809v0;
    public float f35810w;
    public final zj f35811w0;
    public float f35812x;
    public float f35813x0;
    public AnimatorSet f35814y;
    public final org.telegram.ui.Cells.f2 f35815y0;
    public fh.g f35816z0;

    public iz(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f35783b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f35785c = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.d = textPaint3;
        this.f35788e = new Paint(1);
        this.f35790f = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.h = new ArrayList();
        this.M = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.V = org.telegram.ui.ActionBar.j6.K8;
        this.W = org.telegram.ui.ActionBar.j6.I8;
        this.f35782a0 = org.telegram.ui.ActionBar.j6.J8;
        this.f35784b0 = org.telegram.ui.ActionBar.j6.L8;
        this.f35786c0 = org.telegram.ui.ActionBar.j6.f29129s8;
        this.f35787d0 = -1;
        this.f35789e0 = -1;
        this.f35791f0 = -1;
        this.f35792g0 = -1;
        this.f35795j0 = er.h;
        this.f35796k0 = new SparseIntArray(5);
        this.f35797l0 = new SparseIntArray(5);
        this.m0 = new SparseIntArray(5);
        this.f35799n0 = new SparseIntArray(5);
        this.f35800o0 = new SparseIntArray(5);
        this.f35801p0 = new SparseIntArray(5);
        this.f35811w0 = new zj(this, 6);
        this.f35815y0 = new org.telegram.ui.Cells.f2(3, this);
        this.A0 = new Path();
        this.f35781a = e6Var;
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.w0(this.V, e6Var));
        setHorizontalScrollBarEnabled(false);
        di.c1 c1Var = new di.c1(19, context, this);
        this.G = c1Var;
        c1Var.setClipChildren(false);
        cz czVar = new cz(this);
        this.f35807t0 = czVar;
        czVar.C = false;
        c1Var.setItemAnimator(czVar);
        c1Var.setSelectorType(9);
        c1Var.setSelectorRadius(6);
        org.telegram.ui.ActionBar.q6.l(c1Var, 20, this.f35784b0, e6Var);
        jg.i0 i0Var = new jg.i0((ViewGroup) this, 2);
        this.I = i0Var;
        c1Var.setLayoutManager(i0Var);
        new v4.y(new hz(this)).h(c1Var);
        int max = Math.max(0, org.telegram.messenger.g0.L(11.5f));
        this.H = max;
        c1Var.setPadding(max, 0, max, 0);
        c1Var.setClipToPadding(false);
        c1Var.setDrawSelectorBehind(true);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(2, this, context);
        this.J = l4Var;
        l4Var.C(true);
        c1Var.setAdapter(l4Var);
        c1Var.setOnItemClickListener(new az(this));
        c1Var.setOnItemLongClickListener(new az(this));
        c1Var.setOnScrollListener(new ri(this, 9));
        c1Var.f40091z2 = true;
        c1Var.setOverScrollMode(2);
        addView(c1Var, c8.ja.c(-1.0f, -1));
    }

    public final void a(int i7, int i10, String str, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.M == -1) {
            this.M = i7;
        }
        this.f35796k0.put(size, i7);
        this.f35797l0.put(size, i10);
        this.m0.put(i7, size);
        int i11 = this.M;
        if (i11 != -1 && i11 == i7) {
            this.L = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.f35783b;
        fz fzVar = new fz(this, i7, org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), arrayList, textPaint.getFontMetricsInt(), false), z10);
        fzVar.f34751e = z11;
        fzVar.f34752f = z12;
        this.N = org.telegram.messenger.k5.C(24.0f, fzVar.a(true), this.N);
        arrayList2.add(fzVar);
    }

    public final void b(int i7, int i10, int i11, int i12, int i13) {
        AnimatorSet animatorSet = this.f35814y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f35787d0 = i7;
        this.f35789e0 = i10;
        this.f35791f0 = i11;
        this.f35792g0 = i13;
        this.f35784b0 = i12;
        org.telegram.ui.ActionBar.q6.J(this.G, i12, this.f35781a);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f35814y = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f35815y0, 0.0f, 1.0f));
        this.f35814y.setDuration(320L);
        this.f35814y.addListener(new x5(this, 27));
        this.f35814y.start();
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iz.c():void");
    }

    public final fz d() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                if (((fz) arrayList.get(i7)).f34751e) {
                    return (fz) arrayList.get(i7);
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
        canvas.clipPath(this.A0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r17, android.view.View r18, long r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iz.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void e(int i7) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty() && this.T != i7 && i7 >= 0 && i7 < arrayList.size()) {
            this.T = i7;
            this.G.y0(i7);
        }
    }

    public final void f(fz fzVar, int i7) {
        boolean z10;
        if (fzVar.f34752f) {
            ez ezVar = this.K;
            if (ezVar != null) {
                ((org.telegram.ui.pw) ezVar).c(fzVar, false);
                return;
            }
            return;
        }
        int i10 = this.L;
        if (i10 < i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.T = -1;
        this.f35804r0 = i10;
        this.f35806s0 = this.M;
        this.L = i7;
        this.M = fzVar.f34748a;
        boolean z11 = this.P;
        zj zjVar = this.f35811w0;
        if (z11) {
            org.telegram.messenger.g0.r(zjVar);
            this.P = false;
        }
        this.f35802q0 = 0.0f;
        this.Q = 0.0f;
        this.P = true;
        setEnabled(false);
        org.telegram.messenger.g0.i3(zjVar, 16L);
        ez ezVar2 = this.K;
        if (ezVar2 != null) {
            ((org.telegram.ui.pw) ezVar2).c(fzVar, z10);
        }
        e(i7);
    }

    public final void g(float f10, int i7) {
        int i10 = this.m0.get(i7, -1);
        if (i10 >= 0) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (f10 > 0.0f) {
                this.R = i10;
                this.S = i7;
            } else {
                this.R = -1;
                this.S = -1;
            }
            this.Q = f10;
            di.c1 c1Var = this.G;
            c1Var.g1();
            c1Var.invalidate();
            invalidate();
            e(i10);
            if (f10 >= 1.0f) {
                this.R = -1;
                this.S = -1;
                this.L = i10;
                this.M = i7;
            }
        }
    }

    public int getCurrentTabId() {
        return this.M;
    }

    public int getCurrentTabStableId() {
        return this.f35797l0.get(this.L, -1);
    }

    public int getDefaultTabId() {
        fz d = d();
        if (d == null) {
            return -1;
        }
        return d.f34748a;
    }

    public int getFirstTabId() {
        return this.f35796k0.get(0, 0);
    }

    public int getLastTabId() {
        return this.f35796k0.get(getTabsCount() - 1, 0);
    }

    public uj0 getListView() {
        return this.G;
    }

    public int getSelectorColorKey() {
        return this.f35784b0;
    }

    public Drawable getSelectorDrawable() {
        return this.U;
    }

    public uj0 getTabsContainer() {
        return this.G;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i7) {
        for (int i10 = 0; i10 < this.h.size(); i10++) {
            if (this.f35797l0.get(i10, -1) == i7) {
                this.L = i10;
                this.M = this.f35796k0.get(i10);
                return true;
            }
        }
        return false;
    }

    public final void i(int i7) {
        int i10 = 0;
        while (true) {
            di.c1 c1Var = this.G;
            if (i10 < c1Var.getChildCount()) {
                if (c1Var.getChildAt(i10) instanceof gz) {
                    gz gzVar = (gz) c1Var.getChildAt(i10);
                    if (gzVar.f35105b.f34748a == i7) {
                        gzVar.b(1.0f, 0);
                        try {
                            gzVar.performHapticFeedback(3);
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
        SparseIntArray sparseIntArray = this.f35801p0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.f35799n0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.f35800o0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i7 = this.H;
        for (int i10 = 0; i10 < size; i10++) {
            int a10 = ((fz) arrayList.get(i10)).a(false);
            sparseIntArray2.put(i10, a10);
            sparseIntArray3.put(i10, ((fz) arrayList.get(i10)).d);
            sparseIntArray.put(i10, (this.O / 2) + i7);
            i7 += org.telegram.messenger.g0.L(24.0f) + a10 + this.O;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = i11 - i7;
        if (this.f35793h0 != i13) {
            this.f35793h0 = i13;
            this.T = -1;
            if (this.P) {
                org.telegram.messenger.g0.r(this.f35811w0);
                this.P = false;
                setEnabled(true);
                ez ezVar = this.K;
                if (ezVar != null) {
                    ((org.telegram.ui.pw) ezVar).b(1.0f);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i7) - (this.H * 2);
            fz d = d();
            if (d != null) {
                int i12 = 2131750807;
                d.b(org.telegram.messenger.hd.M0(2131750807, null));
                int a10 = d.a(false);
                if (this.N > size) {
                    i12 = 2131750806;
                }
                d.b(org.telegram.messenger.hd.M0(i12, null));
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
                    di.c1 c1Var = this.G;
                    v4.m0 itemAnimator = c1Var.getItemAnimator();
                    c1Var.setItemAnimator(null);
                    this.J.f();
                    c1Var.setItemAnimator(itemAnimator);
                    this.F = false;
                }
                j();
                this.f35794i0 = false;
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Path path = this.A0;
        path.rewind();
        path.addRoundRect(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), i7 - org.telegram.messenger.g0.L(9.0f), i10 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), Path.Direction.CW);
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
        di.c1 c1Var = this.G;
        c1Var.g1();
        c1Var.invalidate();
        invalidate();
        ez ezVar = this.K;
        if (ezVar != null) {
            ((org.telegram.ui.pw) ezVar).b(f10);
        }
    }

    public void setBlurredBackground(fh.g gVar) {
        this.f35816z0 = gVar;
        setBackground(gVar);
    }

    public void setDelegate(ez ezVar) {
        this.K = ezVar;
    }

    public void setIsEditing(boolean z10) {
        this.f35798n = z10;
        this.f35805s = true;
        di.c1 c1Var = this.G;
        c1Var.g1();
        c1Var.invalidate();
        this.J.f();
        invalidate();
        if (!this.f35798n && this.E) {
            org.telegram.messenger.vr.a0(org.telegram.messenger.m10.f24934t0).y1();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList T0 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).T0();
            int size = T0.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.so soVar = (org.telegram.messenger.so) T0.get(i7);
                if (soVar.e()) {
                    tL_messages_updateDialogFiltersOrder.order.add(0);
                } else {
                    tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(soVar.f26542a));
                }
            }
            org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).i3();
            ConnectionsManager.getInstance(org.telegram.messenger.m10.f24934t0).sendRequest(tL_messages_updateDialogFiltersOrder, new fi.m5(20));
            this.E = false;
        }
    }
}
