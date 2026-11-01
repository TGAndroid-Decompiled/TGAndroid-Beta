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
public final class hm0 extends FrameLayout implements org.telegram.messenger.vs {
    public int D;
    public int E;
    public final Activity F;
    public final org.telegram.ui.ActionBar.k2 G;
    public boolean H;
    public org.telegram.ui.x00 I;
    public final org.telegram.ui.r00 J;
    public String K;
    public String L;
    public bm0 M;
    public final xj0 N;
    public boolean O;
    public boolean P;
    public final ew0 f26858a;
    public final ag.b1 f26859b;
    public final kg.f f26860c;
    public final int d;
    public final ArrayList e;
    public final ArrayList f26861f;
    public final ArrayList h;
    public final ArrayList f26862n;
    public int f26863r;
    public int f26864s;
    public int f26865w;
    public int f26866x;
    public int f26867y;

    public hm0(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        super(k2Var.getParentActivity());
        kg.f fVar = new kg.f(this, 3);
        this.f26860c = fVar;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f26861f = new ArrayList();
        this.h = new ArrayList();
        this.f26862n = new ArrayList();
        this.f26864s = -1;
        this.f26865w = -1;
        this.f26866x = -1;
        this.f26867y = -1;
        this.D = -1;
        this.E = -1;
        this.J = new org.telegram.ui.r00(0, 0L);
        this.G = k2Var;
        this.F = k2Var.getParentActivity();
        this.d = i10;
        ag.b1 b1Var = new ag.b1(this, getContext(), 18);
        this.f26859b = b1Var;
        new s4.x(new org.telegram.ui.ja(this, 4)).h(b1Var);
        addView(b1Var);
        k2Var.getParentActivity();
        b1Var.setLayoutManager(new dh.f(9));
        b1Var.setAdapter(fVar);
        b1Var.setOnScrollListener(new ag.u(this, 29));
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f47938m = false;
        b1Var.setItemAnimator(jVar);
        b1Var.setOnItemClickListener(new cm0(this, i10, 0));
        b1Var.setOnItemLongClickListener(new px(this, 17));
        this.N = new xj0(b1Var, true);
        zz zzVar = new zz(getContext(), null);
        addView(zzVar);
        zzVar.setUseHeaderOffset(true);
        zzVar.setViewType(3);
        zzVar.setVisibility(8);
        ew0 ew0Var = new ew0(getContext(), zzVar, 1, null);
        this.f26858a = ew0Var;
        addView(ew0Var);
        b1Var.setEmptyView(ew0Var);
        org.telegram.messenger.b8.G(i10).y(arrayList);
    }

    public final void a() {
        ag.b1 b1Var;
        org.telegram.messenger.kj message;
        int i10 = this.d;
        if (!org.telegram.messenger.e20.i(i10).q() && (b1Var = this.f26859b) != null) {
            for (int i11 = 0; i11 < b1Var.getChildCount(); i11++) {
                try {
                    View childAt = b1Var.getChildAt(i11);
                    if ((childAt instanceof em0) && (message = ((em0) childAt).f25884a.getMessage()) != null) {
                        if (org.telegram.messenger.b8.G(i10).k(message.S0())) {
                            c(false);
                        } else if (org.telegram.messenger.b8.G(i10).k(message.S0())) {
                            c(true);
                        } else {
                            continue;
                        }
                        return;
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
    }

    public final void b(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.P = z10;
        setPadding(0, i10, 0, i11);
        ag.b1 b1Var = this.f26859b;
        if (z10) {
            b1Var.q1(0, i10, 0, i11);
        } else {
            b1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.P = false;
    }

    public final void c(boolean z10) {
        float f7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.k2 k2Var = this.G;
        if (k2Var != null && this.f26859b.G) {
            long currentTimeMillis = System.currentTimeMillis();
            int i12 = this.d;
            if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= org.telegram.messenger.wp.r1(i12).F5 * 1000) {
                ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
                if (!org.telegram.messenger.e20.i(i12).q() && !org.telegram.messenger.wp.r1(i12).A3()) {
                    if (z10) {
                        f7 = org.telegram.messenger.wp.r1(i12).D5;
                    } else {
                        f7 = org.telegram.messenger.wp.r1(i12).E5;
                    }
                    SpannableString spannableString = new SpannableString(Double.toString(Math.round(f7 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                    spannableString.setSpan(new y41(org.telegram.messenger.i0.o()), 0, spannableString.length(), 33);
                    if (!k2Var.hasStoryViewer()) {
                        cc a02 = cc.a0(k2Var);
                        if (z10) {
                            i10 = 2131743828;
                        } else {
                            i10 = 2131751349;
                        }
                        String L0 = org.telegram.messenger.dd.L0(i10, null);
                        if (z10) {
                            i11 = 2131743827;
                        } else {
                            i11 = 2131751348;
                        }
                        wb I = a02.I(2131624208, L0, org.telegram.messenger.i0.J2(org.telegram.messenger.i0.x2(org.telegram.messenger.dd.L0(i11, null), new k2.v(18, this, z10)), spannableString, "%d"));
                        I.f32201j = 8000;
                        I.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j10;
        kg.f fVar = this.f26860c;
        fVar.k(0, ((hm0) fVar.d).f26863r);
        if (!TextUtils.isEmpty(this.K)) {
            int i10 = this.d;
            if (!org.telegram.messenger.b6.q(i10).G.isEmpty() || !org.telegram.messenger.b6.q(i10).H.isEmpty()) {
                this.f26858a.setStickerType(1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.b8.G(this.d).y(arrayList);
                org.telegram.messenger.b8.G(this.d).Q(arrayList2);
                String lowerCase = this.K.toLowerCase();
                boolean equals = lowerCase.equals(this.L);
                this.L = lowerCase;
                Utilities.f14523g.a(this.M);
                org.telegram.messenger.r5 r5Var = Utilities.f14523g;
                bm0 bm0Var = new bm0(this, arrayList, lowerCase, arrayList2);
                this.M = bm0Var;
                if (equals) {
                    j10 = 0;
                } else {
                    j10 = 300;
                }
                r5Var.d(bm0Var, j10);
                this.f26862n.clear();
                this.h.clear();
                if (!equals) {
                    this.f26858a.e(true, true);
                    e(this.h, this.f26862n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f26863r == 0) {
            this.N.b(0);
        }
        if (this.O) {
            this.h.clear();
            this.f26862n.clear();
        }
        org.telegram.messenger.b8.G(this.d).y(this.h);
        org.telegram.messenger.b8.G(this.d).Q(this.f26862n);
        for (int i11 = 0; i11 < this.e.size(); i11++) {
            ((org.telegram.messenger.kj) this.e.get(i11)).J5(null, true);
        }
        for (int i12 = 0; i12 < this.f26861f.size(); i12++) {
            ((org.telegram.messenger.kj) this.f26861f.get(i12)).J5(null, true);
        }
        this.L = null;
        e(this.h, this.f26862n, z10);
        if (this.f26863r == 0) {
            this.f26858a.e(false, false);
            this.f26858a.d.setText(org.telegram.messenger.dd.L0(2131745825, null));
            this.f26858a.e.setVisibility(8);
        }
        this.f26858a.setStickerType(9);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14685b5) {
            if (getVisibility() == 0) {
                org.telegram.messenger.b6.q(this.d).I.clear();
            }
            d(true);
        } else if (i10 == org.telegram.messenger.at.f14790t3) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        s4.c1 T;
        kg.f fVar = this.f26860c;
        if (z10) {
            int i10 = this.f26864s;
            int i11 = this.f26865w;
            int i12 = this.f26866x;
            int i13 = this.f26867y;
            int i14 = this.D;
            int i15 = this.E;
            int i16 = this.f26863r;
            ArrayList arrayList3 = new ArrayList(this.e);
            ArrayList arrayList4 = new ArrayList(this.f26861f);
            f(arrayList, arrayList2);
            s4.n.c(new dm0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).c(fVar);
            int i17 = 0;
            while (true) {
                ag.b1 b1Var = this.f26859b;
                if (i17 < b1Var.getChildCount()) {
                    View childAt = b1Var.getChildAt(i17);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = b1Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.z3) {
                            fVar.t(T, R);
                        } else if (childAt instanceof em0) {
                            org.telegram.ui.Cells.l7 l7Var = ((em0) childAt).f25884a;
                            l7Var.f(true);
                            int f12 = l7Var.getMessage().f1();
                            long B0 = org.telegram.messenger.kj.B0(l7Var.getMessage().f16690k);
                            org.telegram.ui.r00 r00Var = this.J;
                            r00Var.f40933a = B0;
                            r00Var.f40934b = f12;
                            l7Var.b(this.I.b(r00Var), true);
                        }
                    }
                    i17++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            fVar.f();
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj;
            if (!kjVar.h4() && !org.telegram.messenger.kj.R4(kjVar.f16690k)) {
                arrayList3.add(kjVar);
            }
        }
        ArrayList arrayList4 = this.f26861f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) obj2;
            if (!kjVar2.h4() && !org.telegram.messenger.kj.R4(kjVar2.f16690k)) {
                arrayList4.add(kjVar2);
            }
        }
        this.f26863r = 0;
        this.f26864s = -1;
        this.f26865w = -1;
        this.f26866x = -1;
        this.f26867y = -1;
        this.D = -1;
        this.E = -1;
        this.H = false;
        if (!arrayList3.isEmpty()) {
            int i13 = this.f26863r;
            int i14 = i13 + 1;
            this.f26863r = i14;
            this.f26864s = i13;
            this.f26865w = i14;
            int size3 = arrayList3.size() + i14;
            this.f26863r = size3;
            this.f26866x = size3;
            while (true) {
                if (i10 >= arrayList3.size()) {
                    break;
                } else if (org.telegram.messenger.b8.G(this.d).T(((org.telegram.messenger.kj) arrayList3.get(i10)).S0())) {
                    this.H = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            int i15 = this.f26863r;
            int i16 = i15 + 1;
            this.f26863r = i16;
            this.f26867y = i15;
            this.D = i16;
            int size4 = arrayList4.size() + i16;
            this.f26863r = size4;
            this.E = size4;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.at.f(this.d).c(this, org.telegram.messenger.at.f14685b5);
        org.telegram.messenger.at.f(this.d).c(this, org.telegram.messenger.at.f14790t3);
        if (getVisibility() == 0) {
            org.telegram.messenger.b6.q(this.d).I.clear();
        }
        if (!this.O) {
            this.O = true;
            Utilities.f14523g.c(new eb0(this, 21));
        }
        d(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.d;
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.f14685b5);
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.f14790t3);
    }

    @Override
    public final void requestLayout() {
        if (this.P) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.x00 x00Var) {
        this.I = x00Var;
    }
}
