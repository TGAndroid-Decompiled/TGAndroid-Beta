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
public final class ql0 extends FrameLayout implements org.telegram.messenger.fs {
    public int E;
    public int F;
    public final Activity G;
    public final org.telegram.ui.ActionBar.h2 H;
    public boolean I;
    public org.telegram.ui.b00 J;
    public final org.telegram.ui.vz K;
    public String L;
    public String M;
    public kl0 N;
    public final fj0 O;
    public boolean P;
    public boolean Q;
    public final kv0 f38827a;
    public final di.b1 f38828b;
    public final di.l4 f38829c;
    public final int d;
    public final ArrayList f38830e;
    public final ArrayList f38831f;
    public final ArrayList h;
    public final ArrayList f38832n;
    public int f38833r;
    public int f38834s;
    public int f38835w;
    public int f38836x;
    public int f38837y;

    public ql0(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        super(h2Var.getParentActivity());
        di.l4 l4Var = new di.l4(this, 3);
        this.f38829c = l4Var;
        ArrayList arrayList = new ArrayList();
        this.f38830e = arrayList;
        this.f38831f = new ArrayList();
        this.h = new ArrayList();
        this.f38832n = new ArrayList();
        this.f38834s = -1;
        this.f38835w = -1;
        this.f38836x = -1;
        this.f38837y = -1;
        this.E = -1;
        this.F = -1;
        this.K = new org.telegram.ui.vz(0, 0L);
        this.H = h2Var;
        this.G = h2Var.getParentActivity();
        this.d = i7;
        di.b1 b1Var = new di.b1(23, getContext(), this);
        this.f38828b = b1Var;
        new v4.z(new gi.c(this, 5)).h(b1Var);
        addView(b1Var);
        h2Var.getParentActivity();
        b1Var.setLayoutManager(new jg.b0(10));
        b1Var.setAdapter(l4Var);
        b1Var.setOnScrollListener(new oa(this, 17));
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.f59151m = false;
        b1Var.setItemAnimator(kVar);
        b1Var.setOnItemClickListener(new ll0(this, i7, 0));
        b1Var.setOnItemLongClickListener(new iy(this, 16));
        this.O = new fj0(b1Var, true);
        wz wzVar = new wz(getContext(), null);
        addView(wzVar);
        wzVar.setUseHeaderOffset(true);
        wzVar.setViewType(3);
        wzVar.setVisibility(8);
        kv0 kv0Var = new kv0(getContext(), wzVar, 1, null);
        this.f38827a = kv0Var;
        addView(kv0Var);
        b1Var.setEmptyView(kv0Var);
        org.telegram.messenger.w7.G(i7).y(arrayList);
    }

    public final void a() {
        di.b1 b1Var;
        org.telegram.messenger.fj message;
        int i7 = this.d;
        if (!org.telegram.messenger.j10.i(i7).q() && (b1Var = this.f38828b) != null) {
            for (int i10 = 0; i10 < b1Var.getChildCount(); i10++) {
                try {
                    View childAt = b1Var.getChildAt(i10);
                    if ((childAt instanceof nl0) && (message = ((nl0) childAt).f37805a.getMessage()) != null) {
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
        di.b1 b1Var = this.f38828b;
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
        org.telegram.ui.ActionBar.h2 h2Var = this.H;
        if (h2Var != null && this.f38828b.H) {
            long currentTimeMillis = System.currentTimeMillis();
            int i11 = this.d;
            if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= org.telegram.messenger.mp.u1(i11).H5 * 1000) {
                ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
                if (!org.telegram.messenger.j10.i(i11).q() && !org.telegram.messenger.mp.u1(i11).K3()) {
                    if (z10) {
                        f10 = org.telegram.messenger.mp.u1(i11).F5;
                    } else {
                        f10 = org.telegram.messenger.mp.u1(i11).G5;
                    }
                    SpannableString spannableString = new SpannableString(Double.toString(Math.round(f10 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                    spannableString.setSpan(new i41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                    if (!h2Var.hasStoryViewer()) {
                        lc b02 = lc.b0(h2Var);
                        if (z10) {
                            i7 = 2131743565;
                        } else {
                            i7 = 2131751337;
                        }
                        String M0 = org.telegram.messenger.gd.M0(i7, null);
                        if (z10) {
                            i10 = 2131743564;
                        } else {
                            i10 = 2131751336;
                        }
                        gc I = b02.I(2131624211, M0, org.telegram.messenger.g0.K2(org.telegram.messenger.g0.x2(org.telegram.messenger.gd.M0(i10, null), new ch.k(29, this, z10)), spannableString, "%d"));
                        I.f35461j = 8000;
                        I.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j3;
        di.l4 l4Var = this.f38829c;
        l4Var.k(0, ((ql0) l4Var.d).f38833r);
        if (!TextUtils.isEmpty(this.L)) {
            int i7 = this.d;
            if (!org.telegram.messenger.a6.q(i7).H.isEmpty() || !org.telegram.messenger.a6.q(i7).I.isEmpty()) {
                this.f38827a.setStickerType(1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.w7.G(this.d).y(arrayList);
                org.telegram.messenger.w7.G(this.d).P(arrayList2);
                String lowerCase = this.L.toLowerCase();
                boolean equals = lowerCase.equals(this.M);
                this.M = lowerCase;
                Utilities.f22784g.a(this.N);
                org.telegram.messenger.q5 q5Var = Utilities.f22784g;
                kl0 kl0Var = new kl0(this, arrayList, lowerCase, arrayList2);
                this.N = kl0Var;
                if (equals) {
                    j3 = 0;
                } else {
                    j3 = 300;
                }
                q5Var.d(kl0Var, j3);
                this.f38832n.clear();
                this.h.clear();
                if (!equals) {
                    this.f38827a.e(true, true);
                    e(this.h, this.f38832n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f38833r == 0) {
            this.O.b(0);
        }
        if (this.P) {
            this.h.clear();
            this.f38832n.clear();
        }
        org.telegram.messenger.w7.G(this.d).y(this.h);
        org.telegram.messenger.w7.G(this.d).P(this.f38832n);
        for (int i10 = 0; i10 < this.f38830e.size(); i10++) {
            ((org.telegram.messenger.fj) this.f38830e.get(i10)).K5(null, true);
        }
        for (int i11 = 0; i11 < this.f38831f.size(); i11++) {
            ((org.telegram.messenger.fj) this.f38831f.get(i11)).K5(null, true);
        }
        this.M = null;
        e(this.h, this.f38832n, z10);
        if (this.f38833r == 0) {
            this.f38827a.e(false, false);
            this.f38827a.d.setText(org.telegram.messenger.gd.M0(2131745613, null));
            this.f38827a.f36896e.setVisibility(8);
        }
        this.f38827a.setStickerType(9);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25105d5) {
            if (getVisibility() == 0) {
                org.telegram.messenger.a6.q(this.d).J.clear();
            }
            d(true);
        } else if (i7 == org.telegram.messenger.ks.f25209v3) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        v4.f1 T;
        di.l4 l4Var = this.f38829c;
        if (z10) {
            int i7 = this.f38834s;
            int i10 = this.f38835w;
            int i11 = this.f38836x;
            int i12 = this.f38837y;
            int i13 = this.E;
            int i14 = this.F;
            int i15 = this.f38833r;
            ArrayList arrayList3 = new ArrayList(this.f38830e);
            ArrayList arrayList4 = new ArrayList(this.f38831f);
            f(arrayList, arrayList2);
            v4.o.c(new ml0(this, i15, i7, i12, i10, i11, arrayList3, i13, i14, arrayList4), true).c(l4Var);
            int i16 = 0;
            while (true) {
                di.b1 b1Var = this.f38828b;
                if (i16 < b1Var.getChildCount()) {
                    View childAt = b1Var.getChildAt(i16);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = b1Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.x3) {
                            l4Var.t(T, R);
                        } else if (childAt instanceof nl0) {
                            org.telegram.ui.Cells.h7 h7Var = ((nl0) childAt).f37805a;
                            h7Var.f(true);
                            int e12 = h7Var.getMessage().e1();
                            long B0 = org.telegram.messenger.fj.B0(h7Var.getMessage().f23968k);
                            org.telegram.ui.vz vzVar = this.K;
                            vzVar.f52886a = B0;
                            vzVar.f52887b = e12;
                            h7Var.b(this.J.r0(vzVar), true);
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
        ArrayList arrayList3 = this.f38830e;
        arrayList3.clear();
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
            if (!fjVar.h4() && !org.telegram.messenger.fj.R4(fjVar.f23968k)) {
                arrayList3.add(fjVar);
            }
        }
        ArrayList arrayList4 = this.f38831f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) obj2;
            if (!fjVar2.h4() && !org.telegram.messenger.fj.R4(fjVar2.f23968k)) {
                arrayList4.add(fjVar2);
            }
        }
        this.f38833r = 0;
        this.f38834s = -1;
        this.f38835w = -1;
        this.f38836x = -1;
        this.f38837y = -1;
        this.E = -1;
        this.F = -1;
        this.I = false;
        if (!arrayList3.isEmpty()) {
            int i12 = this.f38833r;
            int i13 = i12 + 1;
            this.f38833r = i13;
            this.f38834s = i12;
            this.f38835w = i13;
            int size3 = arrayList3.size() + i13;
            this.f38833r = size3;
            this.f38836x = size3;
            while (true) {
                if (i7 >= arrayList3.size()) {
                    break;
                } else if (org.telegram.messenger.w7.G(this.d).S(((org.telegram.messenger.fj) arrayList3.get(i7)).S0())) {
                    this.I = true;
                    break;
                } else {
                    i7++;
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            int i14 = this.f38833r;
            int i15 = i14 + 1;
            this.f38833r = i15;
            this.f38837y = i14;
            this.E = i15;
            int size4 = arrayList4.size() + i15;
            this.f38833r = size4;
            this.F = size4;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.f(this.d).c(this, org.telegram.messenger.ks.f25105d5);
        org.telegram.messenger.ks.f(this.d).c(this, org.telegram.messenger.ks.f25209v3);
        if (getVisibility() == 0) {
            org.telegram.messenger.a6.q(this.d).J.clear();
        }
        if (!this.P) {
            this.P = true;
            Utilities.f22784g.c(new gb0(this, 19));
        }
        d(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.d;
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.f25105d5);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.f25209v3);
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
