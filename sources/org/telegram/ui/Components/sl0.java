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
public final class sl0 extends FrameLayout implements org.telegram.messenger.gs {
    public int E;
    public int F;
    public final Activity G;
    public final org.telegram.ui.ActionBar.g2 H;
    public boolean I;
    public org.telegram.ui.b00 J;
    public final org.telegram.ui.vz K;
    public String L;
    public String M;
    public ml0 N;
    public final hj0 O;
    public boolean P;
    public boolean Q;
    public final nv0 f39616a;
    public final di.b1 f39617b;
    public final di.l4 f39618c;
    public final int d;
    public final ArrayList f39619e;
    public final ArrayList f39620f;
    public final ArrayList h;
    public final ArrayList f39621n;
    public int f39622r;
    public int f39623s;
    public int f39624w;
    public int f39625x;
    public int f39626y;

    public sl0(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        super(g2Var.getParentActivity());
        di.l4 l4Var = new di.l4(this, 3);
        this.f39618c = l4Var;
        ArrayList arrayList = new ArrayList();
        this.f39619e = arrayList;
        this.f39620f = new ArrayList();
        this.h = new ArrayList();
        this.f39621n = new ArrayList();
        this.f39623s = -1;
        this.f39624w = -1;
        this.f39625x = -1;
        this.f39626y = -1;
        this.E = -1;
        this.F = -1;
        this.K = new org.telegram.ui.vz(0, 0L);
        this.H = g2Var;
        this.G = g2Var.getParentActivity();
        this.d = i7;
        di.b1 b1Var = new di.b1(23, getContext(), this);
        this.f39617b = b1Var;
        new v4.z(new gi.c(this, 5)).h(b1Var);
        addView(b1Var);
        g2Var.getParentActivity();
        b1Var.setLayoutManager(new jg.b0(10));
        b1Var.setAdapter(l4Var);
        b1Var.setOnScrollListener(new oa(this, 17));
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.f59194m = false;
        b1Var.setItemAnimator(kVar);
        b1Var.setOnItemClickListener(new nl0(this, i7, 0));
        b1Var.setOnItemLongClickListener(new ky(this, 16));
        this.O = new hj0(b1Var, true);
        yz yzVar = new yz(getContext(), null);
        addView(yzVar);
        yzVar.setUseHeaderOffset(true);
        yzVar.setViewType(3);
        yzVar.setVisibility(8);
        nv0 nv0Var = new nv0(getContext(), yzVar, 1, null);
        this.f39616a = nv0Var;
        addView(nv0Var);
        b1Var.setEmptyView(nv0Var);
        org.telegram.messenger.w7.G(i7).y(arrayList);
    }

    public final void a() {
        di.b1 b1Var;
        org.telegram.messenger.gj message;
        int i7 = this.d;
        if (!org.telegram.messenger.k10.i(i7).q() && (b1Var = this.f39617b) != null) {
            for (int i10 = 0; i10 < b1Var.getChildCount(); i10++) {
                try {
                    View childAt = b1Var.getChildAt(i10);
                    if ((childAt instanceof pl0) && (message = ((pl0) childAt).f38614a.getMessage()) != null) {
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
        di.b1 b1Var = this.f39617b;
        if (z10) {
            b1Var.q1(0, i7, 0, i10);
        } else {
            b1Var.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
        this.Q = false;
    }

    public final void c(boolean z10) {
        float f10;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.g2 g2Var = this.H;
        if (g2Var != null && this.f39617b.H) {
            long currentTimeMillis = System.currentTimeMillis();
            int i11 = this.d;
            if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= org.telegram.messenger.np.u1(i11).H5 * 1000) {
                ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
                if (!org.telegram.messenger.k10.i(i11).q() && !org.telegram.messenger.np.u1(i11).K3()) {
                    if (z10) {
                        f10 = org.telegram.messenger.np.u1(i11).F5;
                    } else {
                        f10 = org.telegram.messenger.np.u1(i11).G5;
                    }
                    SpannableString spannableString = new SpannableString(Double.toString(Math.round(f10 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                    spannableString.setSpan(new l41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                    if (!g2Var.hasStoryViewer()) {
                        lc b02 = lc.b0(g2Var);
                        if (z10) {
                            i7 = 2131743557;
                        } else {
                            i7 = 2131751336;
                        }
                        String N0 = org.telegram.messenger.hd.N0(i7, null);
                        if (z10) {
                            i10 = 2131743556;
                        } else {
                            i10 = 2131751335;
                        }
                        gc I = b02.I(2131624211, N0, org.telegram.messenger.g0.K2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.N0(i10, null), new ch.k(29, this, z10)), spannableString, "%d"));
                        I.f35527j = 8000;
                        I.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j3;
        di.l4 l4Var = this.f39618c;
        l4Var.k(0, ((sl0) l4Var.d).f39622r);
        if (!TextUtils.isEmpty(this.L)) {
            int i7 = this.d;
            if (!org.telegram.messenger.a6.q(i7).H.isEmpty() || !org.telegram.messenger.a6.q(i7).I.isEmpty()) {
                this.f39616a.setStickerType(1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.w7.G(this.d).y(arrayList);
                org.telegram.messenger.w7.G(this.d).P(arrayList2);
                String lowerCase = this.L.toLowerCase();
                boolean equals = lowerCase.equals(this.M);
                this.M = lowerCase;
                Utilities.f22812g.a(this.N);
                org.telegram.messenger.q5 q5Var = Utilities.f22812g;
                ml0 ml0Var = new ml0(this, arrayList, lowerCase, arrayList2);
                this.N = ml0Var;
                if (equals) {
                    j3 = 0;
                } else {
                    j3 = 300;
                }
                q5Var.d(ml0Var, j3);
                this.f39621n.clear();
                this.h.clear();
                if (!equals) {
                    this.f39616a.e(true, true);
                    e(this.h, this.f39621n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f39622r == 0) {
            this.O.b(0);
        }
        if (this.P) {
            this.h.clear();
            this.f39621n.clear();
        }
        org.telegram.messenger.w7.G(this.d).y(this.h);
        org.telegram.messenger.w7.G(this.d).P(this.f39621n);
        for (int i10 = 0; i10 < this.f39619e.size(); i10++) {
            ((org.telegram.messenger.gj) this.f39619e.get(i10)).K5(null, true);
        }
        for (int i11 = 0; i11 < this.f39620f.size(); i11++) {
            ((org.telegram.messenger.gj) this.f39620f.get(i11)).K5(null, true);
        }
        this.M = null;
        e(this.h, this.f39621n, z10);
        if (this.f39622r == 0) {
            this.f39616a.e(false, false);
            this.f39616a.d.setText(org.telegram.messenger.hd.N0(2131745612, null));
            this.f39616a.f37996e.setVisibility(8);
        }
        this.f39616a.setStickerType(9);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f25303e5) {
            if (getVisibility() == 0) {
                org.telegram.messenger.a6.q(this.d).J.clear();
            }
            d(true);
        } else if (i7 == org.telegram.messenger.ls.f25401v3) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        v4.f1 T;
        di.l4 l4Var = this.f39618c;
        if (z10) {
            int i7 = this.f39623s;
            int i10 = this.f39624w;
            int i11 = this.f39625x;
            int i12 = this.f39626y;
            int i13 = this.E;
            int i14 = this.F;
            int i15 = this.f39622r;
            ArrayList arrayList3 = new ArrayList(this.f39619e);
            ArrayList arrayList4 = new ArrayList(this.f39620f);
            f(arrayList, arrayList2);
            v4.o.c(new ol0(this, i15, i7, i12, i10, i11, arrayList3, i13, i14, arrayList4), true).c(l4Var);
            int i16 = 0;
            while (true) {
                di.b1 b1Var = this.f39617b;
                if (i16 < b1Var.getChildCount()) {
                    View childAt = b1Var.getChildAt(i16);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = b1Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.y3) {
                            l4Var.t(T, R);
                        } else if (childAt instanceof pl0) {
                            org.telegram.ui.Cells.i7 i7Var = ((pl0) childAt).f38614a;
                            i7Var.f(true);
                            int e12 = i7Var.getMessage().e1();
                            long B0 = org.telegram.messenger.gj.B0(i7Var.getMessage().f24213k);
                            org.telegram.ui.vz vzVar = this.K;
                            vzVar.f52921a = B0;
                            vzVar.f52922b = e12;
                            i7Var.b(this.J.r0(vzVar), true);
                        }
                    }
                    i16++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            l4Var.f();
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.f39619e;
        arrayList3.clear();
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
            if (!gjVar.h4() && !org.telegram.messenger.gj.R4(gjVar.f24213k)) {
                arrayList3.add(gjVar);
            }
        }
        ArrayList arrayList4 = this.f39620f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) obj2;
            if (!gjVar2.h4() && !org.telegram.messenger.gj.R4(gjVar2.f24213k)) {
                arrayList4.add(gjVar2);
            }
        }
        this.f39622r = 0;
        this.f39623s = -1;
        this.f39624w = -1;
        this.f39625x = -1;
        this.f39626y = -1;
        this.E = -1;
        this.F = -1;
        this.I = false;
        if (!arrayList3.isEmpty()) {
            int i12 = this.f39622r;
            int i13 = i12 + 1;
            this.f39622r = i13;
            this.f39623s = i12;
            this.f39624w = i13;
            int size3 = arrayList3.size() + i13;
            this.f39622r = size3;
            this.f39625x = size3;
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
            int i14 = this.f39622r;
            int i15 = i14 + 1;
            this.f39622r = i15;
            this.f39626y = i14;
            this.E = i15;
            int size4 = arrayList4.size() + i15;
            this.f39622r = size4;
            this.F = size4;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ls.f(this.d).c(this, org.telegram.messenger.ls.f25303e5);
        org.telegram.messenger.ls.f(this.d).c(this, org.telegram.messenger.ls.f25401v3);
        if (getVisibility() == 0) {
            org.telegram.messenger.a6.q(this.d).J.clear();
        }
        if (!this.P) {
            this.P = true;
            Utilities.f22812g.c(new hb0(this, 19));
        }
        d(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.d;
        org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.f25303e5);
        org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.f25401v3);
    }

    @Override
    public final void requestLayout() {
        if (this.Q) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.b00 b00Var) {
        this.J = b00Var;
    }
}
