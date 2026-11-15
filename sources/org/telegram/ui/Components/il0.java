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
public final class il0 extends FrameLayout implements org.telegram.messenger.is {
    public int E;
    public int F;
    public final Activity G;
    public final org.telegram.ui.ActionBar.e2 H;
    public boolean I;
    public org.telegram.ui.yz J;
    public final org.telegram.ui.sz K;
    public String L;
    public String M;
    public cl0 N;
    public final xi0 O;
    public boolean P;
    public boolean Q;
    public final cv0 f35638a;
    public final di.c1 f35639b;
    public final di.i4 f35640c;
    public final int d;
    public final ArrayList f35641e;
    public final ArrayList f35642f;
    public final ArrayList h;
    public final ArrayList f35643n;
    public int f35644r;
    public int f35645s;
    public int f35646w;
    public int f35647x;
    public int f35648y;

    public il0(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        super(e2Var.getParentActivity());
        di.i4 i4Var = new di.i4(this, 3);
        this.f35640c = i4Var;
        ArrayList arrayList = new ArrayList();
        this.f35641e = arrayList;
        this.f35642f = new ArrayList();
        this.h = new ArrayList();
        this.f35643n = new ArrayList();
        this.f35645s = -1;
        this.f35646w = -1;
        this.f35647x = -1;
        this.f35648y = -1;
        this.E = -1;
        this.F = -1;
        this.K = new org.telegram.ui.sz(0, 0L);
        this.H = e2Var;
        this.G = e2Var.getParentActivity();
        this.d = i7;
        di.c1 c1Var = new di.c1(23, getContext(), this);
        this.f35639b = c1Var;
        new v4.y(new gi.c(this, 5)).h(c1Var);
        addView(c1Var);
        e2Var.getParentActivity();
        c1Var.setLayoutManager(new jg.b0(10));
        c1Var.setAdapter(i4Var);
        c1Var.setOnScrollListener(new ri(this, 16));
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.f58564m = false;
        c1Var.setItemAnimator(kVar);
        c1Var.setOnItemClickListener(new dl0(this, i7, 0));
        c1Var.setOnItemLongClickListener(new gx(this, 17));
        this.O = new xi0(c1Var, true);
        pz pzVar = new pz(getContext(), null);
        addView(pzVar);
        pzVar.setUseHeaderOffset(true);
        pzVar.setViewType(3);
        pzVar.setVisibility(8);
        cv0 cv0Var = new cv0(getContext(), pzVar, 1, null);
        this.f35638a = cv0Var;
        addView(cv0Var);
        c1Var.setEmptyView(cv0Var);
        org.telegram.messenger.w7.G(i7).y(arrayList);
    }

    public final void a() {
        di.c1 c1Var;
        org.telegram.messenger.gj message;
        int i7 = this.d;
        if (!org.telegram.messenger.m10.i(i7).q() && (c1Var = this.f35639b) != null) {
            for (int i10 = 0; i10 < c1Var.getChildCount(); i10++) {
                try {
                    View childAt = c1Var.getChildAt(i10);
                    if ((childAt instanceof fl0) && (message = ((fl0) childAt).f34627a.getMessage()) != null) {
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

    public final void b(int i7, int i10, boolean z10) {
        setClipToPadding(false);
        this.Q = z10;
        setPadding(0, i7, 0, i10);
        di.c1 c1Var = this.f35639b;
        if (z10) {
            c1Var.q1(0, i7, 0, i10);
        } else {
            c1Var.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
        this.Q = false;
    }

    public final void c(boolean z10) {
        float f10;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.e2 e2Var = this.H;
        if (e2Var != null && this.f35639b.H) {
            long currentTimeMillis = System.currentTimeMillis();
            int i11 = this.d;
            if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= org.telegram.messenger.np.s1(i11).F5 * 1000) {
                ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
                if (!org.telegram.messenger.m10.i(i11).q() && !org.telegram.messenger.np.s1(i11).D3()) {
                    if (z10) {
                        f10 = org.telegram.messenger.np.s1(i11).D5;
                    } else {
                        f10 = org.telegram.messenger.np.s1(i11).E5;
                    }
                    SpannableString spannableString = new SpannableString(Double.toString(Math.round(f10 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                    spannableString.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                    if (!e2Var.hasStoryViewer()) {
                        cc a02 = cc.a0(e2Var);
                        if (z10) {
                            i7 = 2131743802;
                        } else {
                            i7 = 2131751348;
                        }
                        String M0 = org.telegram.messenger.hd.M0(i7, null);
                        if (z10) {
                            i10 = 2131743801;
                        } else {
                            i10 = 2131751347;
                        }
                        xb I = a02.I(2131624211, M0, org.telegram.messenger.g0.K2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(i10, null), new ai.q(29, this, z10)), spannableString, "%d"));
                        I.f41635j = 8000;
                        I.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j3;
        di.i4 i4Var = this.f35640c;
        i4Var.k(0, ((il0) i4Var.d).f35644r);
        if (!TextUtils.isEmpty(this.L)) {
            int i7 = this.d;
            if (!org.telegram.messenger.z5.q(i7).H.isEmpty() || !org.telegram.messenger.z5.q(i7).I.isEmpty()) {
                this.f35638a.setStickerType(1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.w7.G(this.d).y(arrayList);
                org.telegram.messenger.w7.G(this.d).P(arrayList2);
                String lowerCase = this.L.toLowerCase();
                boolean equals = lowerCase.equals(this.M);
                this.M = lowerCase;
                Utilities.f22418g.a(this.N);
                org.telegram.messenger.p5 p5Var = Utilities.f22418g;
                cl0 cl0Var = new cl0(this, arrayList, lowerCase, arrayList2);
                this.N = cl0Var;
                if (equals) {
                    j3 = 0;
                } else {
                    j3 = 300;
                }
                p5Var.d(cl0Var, j3);
                this.f35643n.clear();
                this.h.clear();
                if (!equals) {
                    this.f35638a.e(true, true);
                    e(this.h, this.f35643n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f35644r == 0) {
            this.O.b(0);
        }
        if (this.P) {
            this.h.clear();
            this.f35643n.clear();
        }
        org.telegram.messenger.w7.G(this.d).y(this.h);
        org.telegram.messenger.w7.G(this.d).P(this.f35643n);
        for (int i10 = 0; i10 < this.f35641e.size(); i10++) {
            ((org.telegram.messenger.gj) this.f35641e.get(i10)).K5(null, true);
        }
        for (int i11 = 0; i11 < this.f35642f.size(); i11++) {
            ((org.telegram.messenger.gj) this.f35642f.get(i11)).K5(null, true);
        }
        this.M = null;
        e(this.h, this.f35643n, z10);
        if (this.f35644r == 0) {
            this.f35638a.e(false, false);
            this.f35638a.d.setText(org.telegram.messenger.hd.M0(2131745808, null));
            this.f35638a.f33709e.setVisibility(8);
        }
        this.f35638a.setStickerType(9);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25475b5) {
            if (getVisibility() == 0) {
                org.telegram.messenger.z5.q(this.d).J.clear();
            }
            d(true);
        } else if (i7 == org.telegram.messenger.ns.f25577t3) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        v4.e1 T;
        di.i4 i4Var = this.f35640c;
        if (z10) {
            int i7 = this.f35645s;
            int i10 = this.f35646w;
            int i11 = this.f35647x;
            int i12 = this.f35648y;
            int i13 = this.E;
            int i14 = this.F;
            int i15 = this.f35644r;
            ArrayList arrayList3 = new ArrayList(this.f35641e);
            ArrayList arrayList4 = new ArrayList(this.f35642f);
            f(arrayList, arrayList2);
            v4.o.c(new el0(this, i15, i7, i12, i10, i11, arrayList3, i13, i14, arrayList4), true).c(i4Var);
            int i16 = 0;
            while (true) {
                di.c1 c1Var = this.f35639b;
                if (i16 < c1Var.getChildCount()) {
                    View childAt = c1Var.getChildAt(i16);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = c1Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.x3) {
                            i4Var.t(T, R);
                        } else if (childAt instanceof fl0) {
                            org.telegram.ui.Cells.g7 g7Var = ((fl0) childAt).f34627a;
                            g7Var.f(true);
                            int e12 = g7Var.getMessage().e1();
                            long B0 = org.telegram.messenger.gj.B0(g7Var.getMessage().f23819k);
                            org.telegram.ui.sz szVar = this.K;
                            szVar.f51306a = B0;
                            szVar.f51307b = e12;
                            g7Var.b(this.J.l(szVar), true);
                        }
                    }
                    i16++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            i4Var.f();
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.f35641e;
        arrayList3.clear();
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
            if (!gjVar.h4() && !org.telegram.messenger.gj.R4(gjVar.f23819k)) {
                arrayList3.add(gjVar);
            }
        }
        ArrayList arrayList4 = this.f35642f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) obj2;
            if (!gjVar2.h4() && !org.telegram.messenger.gj.R4(gjVar2.f23819k)) {
                arrayList4.add(gjVar2);
            }
        }
        this.f35644r = 0;
        this.f35645s = -1;
        this.f35646w = -1;
        this.f35647x = -1;
        this.f35648y = -1;
        this.E = -1;
        this.F = -1;
        this.I = false;
        if (!arrayList3.isEmpty()) {
            int i12 = this.f35644r;
            int i13 = i12 + 1;
            this.f35644r = i13;
            this.f35645s = i12;
            this.f35646w = i13;
            int size3 = arrayList3.size() + i13;
            this.f35644r = size3;
            this.f35647x = size3;
            while (true) {
                if (i7 >= arrayList3.size()) {
                    break;
                } else if (org.telegram.messenger.w7.G(this.d).S(((org.telegram.messenger.gj) arrayList3.get(i7)).S0())) {
                    this.I = true;
                    break;
                } else {
                    i7++;
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            int i14 = this.f35644r;
            int i15 = i14 + 1;
            this.f35644r = i15;
            this.f35648y = i14;
            this.E = i15;
            int size4 = arrayList4.size() + i15;
            this.f35644r = size4;
            this.F = size4;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ns.f(this.d).c(this, org.telegram.messenger.ns.f25475b5);
        org.telegram.messenger.ns.f(this.d).c(this, org.telegram.messenger.ns.f25577t3);
        if (getVisibility() == 0) {
            org.telegram.messenger.z5.q(this.d).J.clear();
        }
        if (!this.P) {
            this.P = true;
            Utilities.f22418g.c(new wa0(this, 19));
        }
        d(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.d;
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.f25475b5);
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.f25577t3);
    }

    @Override
    public final void requestLayout() {
        if (this.Q) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.yz yzVar) {
        this.J = yzVar;
    }
}
