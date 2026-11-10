package org.telegram.ui.Components;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class dl0 extends FrameLayout implements org.telegram.messenger.ls {
    public int D;
    public int E;
    public final Activity F;
    public final org.telegram.ui.ActionBar.f2 G;
    public boolean H;
    public org.telegram.ui.a00 I;
    public final org.telegram.ui.uz J;
    public String K;
    public String L;
    public xk0 M;
    public final si0 N;
    public boolean O;
    public boolean P;
    public final bv0 f33022a;
    public final bi.q1 f33023b;
    public final bi.k5 f33024c;
    public final int d;
    public final ArrayList f33025e;
    public final ArrayList f33026f;
    public final ArrayList h;
    public final ArrayList f33027n;
    public int f33028r;
    public int f33029s;
    public int f33030w;
    public int f33031x;
    public int f33032y;

    public dl0(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        super(f2Var.getParentActivity());
        bi.k5 k5Var = new bi.k5(this, 3);
        this.f33024c = k5Var;
        ArrayList arrayList = new ArrayList();
        this.f33025e = arrayList;
        this.f33026f = new ArrayList();
        this.h = new ArrayList();
        this.f33027n = new ArrayList();
        this.f33029s = -1;
        this.f33030w = -1;
        this.f33031x = -1;
        this.f33032y = -1;
        this.D = -1;
        this.E = -1;
        this.J = new org.telegram.ui.uz(0, 0L);
        this.G = f2Var;
        this.F = f2Var.getParentActivity();
        this.d = i7;
        bi.q1 q1Var = new bi.q1(23, getContext(), this);
        this.f33023b = q1Var;
        new v4.y(new ei.d(this, 5)).h(q1Var);
        addView(q1Var);
        f2Var.getParentActivity();
        q1Var.setLayoutManager(new jg.b0(10));
        q1Var.setAdapter(k5Var);
        q1Var.setOnScrollListener(new ti(this, 14));
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.f57079m = false;
        q1Var.setItemAnimator(kVar);
        q1Var.setOnItemClickListener(new yk0(this, i7, 0));
        q1Var.setOnItemLongClickListener(new ax(this, 17));
        this.N = new si0(q1Var, true);
        lz lzVar = new lz(getContext(), null);
        addView(lzVar);
        lzVar.setUseHeaderOffset(true);
        lzVar.setViewType(3);
        lzVar.setVisibility(8);
        bv0 bv0Var = new bv0(getContext(), lzVar, 1, null);
        this.f33022a = bv0Var;
        addView(bv0Var);
        q1Var.setEmptyView(bv0Var);
        org.telegram.messenger.w7.G(i7).y(arrayList);
    }

    public final void a() {
        bi.q1 q1Var;
        org.telegram.messenger.ij message;
        int i7 = this.d;
        if (!org.telegram.messenger.p10.i(i7).q() && (q1Var = this.f33023b) != null) {
            for (int i10 = 0; i10 < q1Var.getChildCount(); i10++) {
                try {
                    View childAt = q1Var.getChildAt(i10);
                    if ((childAt instanceof al0) && (message = ((al0) childAt).f31878a.getMessage()) != null) {
                        if (org.telegram.messenger.w7.G(i7).k(message.S0())) {
                            c(false);
                        } else if (org.telegram.messenger.w7.G(i7).k(message.S0())) {
                            c(true);
                        } else {
                            continue;
                        }
                        return;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
    }

    public final void b(int i7, int i10, boolean z9) {
        setClipToPadding(false);
        this.P = z9;
        setPadding(0, i7, 0, i10);
        bi.q1 q1Var = this.f33023b;
        if (z9) {
            q1Var.q1(0, i7, 0, i10);
        } else {
            q1Var.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) q1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
        this.P = false;
    }

    public final void c(boolean z9) {
        float f10;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.f2 f2Var = this.G;
        if (f2Var != null && this.f33023b.G) {
            long currentTimeMillis = System.currentTimeMillis();
            int i11 = this.d;
            if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= org.telegram.messenger.qp.s1(i11).E5 * 1000) {
                ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
                if (!org.telegram.messenger.p10.i(i11).q() && !org.telegram.messenger.qp.s1(i11).D3()) {
                    if (z9) {
                        f10 = org.telegram.messenger.qp.s1(i11).C5;
                    } else {
                        f10 = org.telegram.messenger.qp.s1(i11).D5;
                    }
                    SpannableString spannableString = new SpannableString(Double.toString(Math.round(f10 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                    spannableString.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                    if (!f2Var.hasStoryViewer()) {
                        gc a02 = gc.a0(f2Var);
                        if (z9) {
                            i7 = 2131743802;
                        } else {
                            i7 = 2131751348;
                        }
                        String M0 = org.telegram.messenger.id.M0(i7, null);
                        if (z9) {
                            i10 = 2131743801;
                        } else {
                            i10 = 2131751347;
                        }
                        bc I = a02.I(2131624210, M0, org.telegram.messenger.g0.K2(org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(i10, null), new bi.k1(28, this, z9)), spannableString, "%d"));
                        I.f32203j = 8000;
                        I.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z9) {
        long j3;
        bi.k5 k5Var = this.f33024c;
        k5Var.k(0, ((dl0) k5Var.d).f33028r);
        if (!TextUtils.isEmpty(this.K)) {
            int i7 = this.d;
            if (!org.telegram.messenger.z5.q(i7).G.isEmpty() || !org.telegram.messenger.z5.q(i7).H.isEmpty()) {
                this.f33022a.setStickerType(1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.w7.G(this.d).y(arrayList);
                org.telegram.messenger.w7.G(this.d).P(arrayList2);
                String lowerCase = this.K.toLowerCase();
                boolean equals = lowerCase.equals(this.L);
                this.L = lowerCase;
                Utilities.f21343g.a(this.M);
                org.telegram.messenger.p5 p5Var = Utilities.f21343g;
                xk0 xk0Var = new xk0(this, arrayList, lowerCase, arrayList2);
                this.M = xk0Var;
                if (equals) {
                    j3 = 0;
                } else {
                    j3 = 300;
                }
                p5Var.d(xk0Var, j3);
                this.f33027n.clear();
                this.h.clear();
                if (!equals) {
                    this.f33022a.e(true, true);
                    e(this.h, this.f33027n, z9);
                    return;
                }
                return;
            }
        }
        if (this.f33028r == 0) {
            this.N.b(0);
        }
        if (this.O) {
            this.h.clear();
            this.f33027n.clear();
        }
        org.telegram.messenger.w7.G(this.d).y(this.h);
        org.telegram.messenger.w7.G(this.d).P(this.f33027n);
        for (int i10 = 0; i10 < this.f33025e.size(); i10++) {
            ((org.telegram.messenger.ij) this.f33025e.get(i10)).K5(null, true);
        }
        for (int i11 = 0; i11 < this.f33026f.size(); i11++) {
            ((org.telegram.messenger.ij) this.f33026f.get(i11)).K5(null, true);
        }
        this.L = null;
        e(this.h, this.f33027n, z9);
        if (this.f33028r == 0) {
            this.f33022a.e(false, false);
            this.f33022a.d.setText(org.telegram.messenger.id.M0(2131745808, null));
            this.f33022a.f32368e.setVisibility(8);
        }
        this.f33022a.setStickerType(9);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f24982b5) {
            if (getVisibility() == 0) {
                org.telegram.messenger.z5.q(this.d).I.clear();
            }
            d(true);
        } else if (i7 == org.telegram.messenger.qs.f25084t3) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z9) {
        v4.d1 T;
        bi.k5 k5Var = this.f33024c;
        if (z9) {
            int i7 = this.f33029s;
            int i10 = this.f33030w;
            int i11 = this.f33031x;
            int i12 = this.f33032y;
            int i13 = this.D;
            int i14 = this.E;
            int i15 = this.f33028r;
            ArrayList arrayList3 = new ArrayList(this.f33025e);
            ArrayList arrayList4 = new ArrayList(this.f33026f);
            f(arrayList, arrayList2);
            v4.o.c(new zk0(this, i15, i7, i12, i10, i11, arrayList3, i13, i14, arrayList4), true).c(k5Var);
            int i16 = 0;
            while (true) {
                bi.q1 q1Var = this.f33023b;
                if (i16 < q1Var.getChildCount()) {
                    View childAt = q1Var.getChildAt(i16);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = q1Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.x3) {
                            k5Var.t(T, R);
                        } else if (childAt instanceof al0) {
                            org.telegram.ui.Cells.h7 h7Var = ((al0) childAt).f31878a;
                            h7Var.f(true);
                            int e12 = h7Var.getMessage().e1();
                            long B0 = org.telegram.messenger.ij.B0(h7Var.getMessage().f23266k);
                            org.telegram.ui.uz uzVar = this.J;
                            uzVar.f50595a = B0;
                            uzVar.f50596b = e12;
                            h7Var.b(this.I.f(uzVar), true);
                        }
                    }
                    i16++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            k5Var.f();
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.f33025e;
        arrayList3.clear();
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
            if (!ijVar.h4() && !org.telegram.messenger.ij.R4(ijVar.f23266k)) {
                arrayList3.add(ijVar);
            }
        }
        ArrayList arrayList4 = this.f33026f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) obj2;
            if (!ijVar2.h4() && !org.telegram.messenger.ij.R4(ijVar2.f23266k)) {
                arrayList4.add(ijVar2);
            }
        }
        this.f33028r = 0;
        this.f33029s = -1;
        this.f33030w = -1;
        this.f33031x = -1;
        this.f33032y = -1;
        this.D = -1;
        this.E = -1;
        this.H = false;
        if (!arrayList3.isEmpty()) {
            int i12 = this.f33028r;
            int i13 = i12 + 1;
            this.f33028r = i13;
            this.f33029s = i12;
            this.f33030w = i13;
            int size3 = arrayList3.size() + i13;
            this.f33028r = size3;
            this.f33031x = size3;
            while (true) {
                if (i7 >= arrayList3.size()) {
                    break;
                } else if (org.telegram.messenger.w7.G(this.d).S(((org.telegram.messenger.ij) arrayList3.get(i7)).S0())) {
                    this.H = true;
                    break;
                } else {
                    i7++;
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            int i14 = this.f33028r;
            int i15 = i14 + 1;
            this.f33028r = i15;
            this.f33032y = i14;
            this.D = i15;
            int size4 = arrayList4.size() + i15;
            this.f33028r = size4;
            this.E = size4;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.f(this.d).c(this, org.telegram.messenger.qs.f24982b5);
        org.telegram.messenger.qs.f(this.d).c(this, org.telegram.messenger.qs.f25084t3);
        if (getVisibility() == 0) {
            org.telegram.messenger.z5.q(this.d).I.clear();
        }
        if (!this.O) {
            this.O = true;
            Utilities.f21343g.c(new ob0(this, 16));
        }
        d(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.d;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f24982b5);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25084t3);
    }

    @Override
    public final void requestLayout() {
        if (this.P) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.a00 a00Var) {
        this.I = a00Var;
    }
}
