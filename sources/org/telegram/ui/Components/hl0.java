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
public final class hl0 extends FrameLayout implements org.telegram.messenger.cs {
    public int E;
    public int F;
    public final Activity G;
    public final org.telegram.ui.ActionBar.d2 H;
    public boolean I;
    public org.telegram.ui.vz J;
    public final org.telegram.ui.pz K;
    public String L;
    public String M;
    public bl0 N;
    public final wi0 O;
    public boolean P;
    public boolean Q;
    public final zu0 f34442a;
    public final ci.j1 f34443b;
    public final ci.r4 f34444c;
    public final int d;
    public final ArrayList f34445e;
    public final ArrayList f34446f;
    public final ArrayList h;
    public final ArrayList f34447n;
    public int f34448r;
    public int f34449s;
    public int f34450w;
    public int f34451x;
    public int f34452y;

    public hl0(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        super(d2Var.getParentActivity());
        ci.r4 r4Var = new ci.r4(this, 3);
        this.f34444c = r4Var;
        ArrayList arrayList = new ArrayList();
        this.f34445e = arrayList;
        this.f34446f = new ArrayList();
        this.h = new ArrayList();
        this.f34447n = new ArrayList();
        this.f34449s = -1;
        this.f34450w = -1;
        this.f34451x = -1;
        this.f34452y = -1;
        this.E = -1;
        this.F = -1;
        this.K = new org.telegram.ui.pz(0, 0L);
        this.H = d2Var;
        this.G = d2Var.getParentActivity();
        this.d = i3;
        ci.j1 j1Var = new ci.j1(23, getContext(), this);
        this.f34443b = j1Var;
        new u4.y(new fi.c(this, 5)).h(j1Var);
        addView(j1Var);
        d2Var.getParentActivity();
        j1Var.setLayoutManager(new kg.y(10));
        j1Var.setAdapter(r4Var);
        j1Var.setOnScrollListener(new ji(this, 16));
        u4.k kVar = new u4.k();
        kVar.C = false;
        kVar.f55567m = false;
        j1Var.setItemAnimator(kVar);
        j1Var.setOnItemClickListener(new cl0(this, i3, 0));
        j1Var.setOnItemLongClickListener(new zw(this, 17));
        this.O = new wi0(j1Var, true);
        iz izVar = new iz(getContext(), null);
        addView(izVar);
        izVar.setUseHeaderOffset(true);
        izVar.setViewType(3);
        izVar.setVisibility(8);
        zu0 zu0Var = new zu0(getContext(), izVar, 1, null);
        this.f34442a = zu0Var;
        addView(zu0Var);
        j1Var.setEmptyView(zu0Var);
        org.telegram.messenger.w7.G(i3).y(arrayList);
    }

    public final void a() {
        ci.j1 j1Var;
        org.telegram.messenger.zi message;
        int i3 = this.d;
        if (!org.telegram.messenger.h10.i(i3).q() && (j1Var = this.f34443b) != null) {
            for (int i10 = 0; i10 < j1Var.getChildCount(); i10++) {
                try {
                    View childAt = j1Var.getChildAt(i10);
                    if ((childAt instanceof el0) && (message = ((el0) childAt).f33416a.getMessage()) != null) {
                        if (org.telegram.messenger.w7.G(i3).k(message.S0())) {
                            c(false);
                        } else if (org.telegram.messenger.w7.G(i3).k(message.S0())) {
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

    public final void b(int i3, int i10, boolean z10) {
        setClipToPadding(false);
        this.Q = z10;
        setPadding(0, i3, 0, i10);
        ci.j1 j1Var = this.f34443b;
        if (z10) {
            j1Var.q1(0, i3, 0, i10);
        } else {
            j1Var.setPadding(0, i3, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) j1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i3;
        marginLayoutParams.bottomMargin = -i10;
        this.Q = false;
    }

    public final void c(boolean z10) {
        float f10;
        int i3;
        int i10;
        org.telegram.ui.ActionBar.d2 d2Var = this.H;
        if (d2Var != null && this.f34443b.H) {
            long currentTimeMillis = System.currentTimeMillis();
            int i11 = this.d;
            if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= org.telegram.messenger.hp.s1(i11).E5 * 1000) {
                ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
                if (!org.telegram.messenger.h10.i(i11).q() && !org.telegram.messenger.hp.s1(i11).D3()) {
                    if (z10) {
                        f10 = org.telegram.messenger.hp.s1(i11).C5;
                    } else {
                        f10 = org.telegram.messenger.hp.s1(i11).D5;
                    }
                    SpannableString spannableString = new SpannableString(Double.toString(Math.round(f10 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                    spannableString.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                    if (!d2Var.hasStoryViewer()) {
                        fc a02 = fc.a0(d2Var);
                        if (z10) {
                            i3 = 2131743812;
                        } else {
                            i3 = 2131751349;
                        }
                        String M0 = org.telegram.messenger.bd.M0(i3, null);
                        if (z10) {
                            i10 = 2131743811;
                        } else {
                            i10 = 2131751348;
                        }
                        ac I = a02.I(2131624210, M0, org.telegram.messenger.g0.K2(org.telegram.messenger.g0.x2(org.telegram.messenger.bd.M0(i10, null), new ci.e1(28, this, z10)), spannableString, "%d"));
                        I.f31792j = 8000;
                        I.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j10;
        ci.r4 r4Var = this.f34444c;
        r4Var.k(0, ((hl0) r4Var.d).f34448r);
        if (!TextUtils.isEmpty(this.L)) {
            int i3 = this.d;
            if (!org.telegram.messenger.z5.q(i3).H.isEmpty() || !org.telegram.messenger.z5.q(i3).I.isEmpty()) {
                this.f34442a.setStickerType(1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.w7.G(this.d).y(arrayList);
                org.telegram.messenger.w7.G(this.d).Q(arrayList2);
                String lowerCase = this.L.toLowerCase();
                boolean equals = lowerCase.equals(this.M);
                this.M = lowerCase;
                Utilities.f21389g.a(this.N);
                org.telegram.messenger.p5 p5Var = Utilities.f21389g;
                bl0 bl0Var = new bl0(this, arrayList, lowerCase, arrayList2);
                this.N = bl0Var;
                if (equals) {
                    j10 = 0;
                } else {
                    j10 = 300;
                }
                p5Var.e(bl0Var, j10);
                this.f34447n.clear();
                this.h.clear();
                if (!equals) {
                    this.f34442a.e(true, true);
                    e(this.h, this.f34447n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f34448r == 0) {
            this.O.b(0);
        }
        if (this.P) {
            this.h.clear();
            this.f34447n.clear();
        }
        org.telegram.messenger.w7.G(this.d).y(this.h);
        org.telegram.messenger.w7.G(this.d).Q(this.f34447n);
        for (int i10 = 0; i10 < this.f34445e.size(); i10++) {
            ((org.telegram.messenger.zi) this.f34445e.get(i10)).L5(null, true);
        }
        for (int i11 = 0; i11 < this.f34446f.size(); i11++) {
            ((org.telegram.messenger.zi) this.f34446f.get(i11)).L5(null, true);
        }
        this.M = null;
        e(this.h, this.f34447n, z10);
        if (this.f34448r == 0) {
            this.f34442a.e(false, false);
            this.f34442a.d.setText(org.telegram.messenger.bd.M0(2131745818, null));
            this.f34442a.f41128e.setVisibility(8);
        }
        this.f34442a.setStickerType(9);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23207b5) {
            if (getVisibility() == 0) {
                org.telegram.messenger.z5.q(this.d).J.clear();
            }
            d(true);
        } else if (i3 == org.telegram.messenger.hs.f23309t3) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        u4.d1 T;
        ci.r4 r4Var = this.f34444c;
        if (z10) {
            int i3 = this.f34449s;
            int i10 = this.f34450w;
            int i11 = this.f34451x;
            int i12 = this.f34452y;
            int i13 = this.E;
            int i14 = this.F;
            int i15 = this.f34448r;
            ArrayList arrayList3 = new ArrayList(this.f34445e);
            ArrayList arrayList4 = new ArrayList(this.f34446f);
            f(arrayList, arrayList2);
            u4.o.c(new dl0(this, i15, i3, i12, i10, i11, arrayList3, i13, i14, arrayList4), true).c(r4Var);
            int i16 = 0;
            while (true) {
                ci.j1 j1Var = this.f34443b;
                if (i16 < j1Var.getChildCount()) {
                    View childAt = j1Var.getChildAt(i16);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = j1Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.x3) {
                            r4Var.t(T, R);
                        } else if (childAt instanceof el0) {
                            org.telegram.ui.Cells.g7 g7Var = ((el0) childAt).f33416a;
                            g7Var.f(true);
                            int f12 = g7Var.getMessage().f1();
                            long B0 = org.telegram.messenger.zi.B0(g7Var.getMessage().f26868k);
                            org.telegram.ui.pz pzVar = this.K;
                            pzVar.f48707a = B0;
                            pzVar.f48708b = f12;
                            g7Var.b(this.J.n(pzVar), true);
                        }
                    }
                    i16++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            r4Var.f();
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.f34445e;
        arrayList3.clear();
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
            if (!ziVar.i4() && !org.telegram.messenger.zi.S4(ziVar.f26868k)) {
                arrayList3.add(ziVar);
            }
        }
        ArrayList arrayList4 = this.f34446f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) obj2;
            if (!ziVar2.i4() && !org.telegram.messenger.zi.S4(ziVar2.f26868k)) {
                arrayList4.add(ziVar2);
            }
        }
        this.f34448r = 0;
        this.f34449s = -1;
        this.f34450w = -1;
        this.f34451x = -1;
        this.f34452y = -1;
        this.E = -1;
        this.F = -1;
        this.I = false;
        if (!arrayList3.isEmpty()) {
            int i12 = this.f34448r;
            int i13 = i12 + 1;
            this.f34448r = i13;
            this.f34449s = i12;
            this.f34450w = i13;
            int size3 = arrayList3.size() + i13;
            this.f34448r = size3;
            this.f34451x = size3;
            while (true) {
                if (i3 >= arrayList3.size()) {
                    break;
                } else if (org.telegram.messenger.w7.G(this.d).T(((org.telegram.messenger.zi) arrayList3.get(i3)).S0())) {
                    this.I = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            int i14 = this.f34448r;
            int i15 = i14 + 1;
            this.f34448r = i15;
            this.f34452y = i14;
            this.E = i15;
            int size4 = arrayList4.size() + i15;
            this.f34448r = size4;
            this.F = size4;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.f(this.d).c(this, org.telegram.messenger.hs.f23207b5);
        org.telegram.messenger.hs.f(this.d).c(this, org.telegram.messenger.hs.f23309t3);
        if (getVisibility() == 0) {
            org.telegram.messenger.z5.q(this.d).J.clear();
        }
        if (!this.P) {
            this.P = true;
            Utilities.f21389g.c(new jb0(this, 18));
        }
        d(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = this.d;
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23207b5);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23309t3);
    }

    @Override
    public final void requestLayout() {
        if (this.Q) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.vz vzVar) {
        this.J = vzVar;
    }
}
