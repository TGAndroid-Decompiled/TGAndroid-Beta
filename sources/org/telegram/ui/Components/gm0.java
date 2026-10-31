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
public final class gm0 extends FrameLayout implements org.telegram.messenger.us {
    public int D;
    public int E;
    public final Activity F;
    public final org.telegram.ui.ActionBar.k2 G;
    public boolean H;
    public org.telegram.ui.y00 I;
    public final org.telegram.ui.s00 J;
    public String K;
    public String L;
    public am0 M;
    public final wj0 N;
    public boolean O;
    public boolean P;
    public final dw0 f26437a;
    public final ag.b1 f26438b;
    public final kg.f f26439c;
    public final int d;
    public final ArrayList e;
    public final ArrayList f26440f;
    public final ArrayList h;
    public final ArrayList f26441n;
    public int f26442r;
    public int f26443s;
    public int f26444w;
    public int f26445x;
    public int f26446y;

    public gm0(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        super(k2Var.getParentActivity());
        kg.f fVar = new kg.f(this, 3);
        this.f26439c = fVar;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f26440f = new ArrayList();
        this.h = new ArrayList();
        this.f26441n = new ArrayList();
        this.f26443s = -1;
        this.f26444w = -1;
        this.f26445x = -1;
        this.f26446y = -1;
        this.D = -1;
        this.E = -1;
        this.J = new org.telegram.ui.s00(0, 0L);
        this.G = k2Var;
        this.F = k2Var.getParentActivity();
        this.d = i10;
        ag.b1 b1Var = new ag.b1(this, getContext(), 18);
        this.f26438b = b1Var;
        new s4.x(new org.telegram.ui.ja(this, 4)).h(b1Var);
        addView(b1Var);
        k2Var.getParentActivity();
        b1Var.setLayoutManager(new dh.f(9));
        b1Var.setAdapter(fVar);
        b1Var.setOnScrollListener(new ag.u(this, 29));
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f47927m = false;
        b1Var.setItemAnimator(jVar);
        b1Var.setOnItemClickListener(new bm0(this, i10, 0));
        b1Var.setOnItemLongClickListener(new px(this, 17));
        this.N = new wj0(b1Var, true);
        zz zzVar = new zz(getContext(), null);
        addView(zzVar);
        zzVar.setUseHeaderOffset(true);
        zzVar.setViewType(3);
        zzVar.setVisibility(8);
        dw0 dw0Var = new dw0(getContext(), zzVar, 1, null);
        this.f26437a = dw0Var;
        addView(dw0Var);
        b1Var.setEmptyView(dw0Var);
        org.telegram.messenger.b8.G(i10).y(arrayList);
    }

    public final void a() {
        ag.b1 b1Var;
        org.telegram.messenger.jj message;
        int i10 = this.d;
        if (!org.telegram.messenger.d20.i(i10).q() && (b1Var = this.f26438b) != null) {
            for (int i11 = 0; i11 < b1Var.getChildCount(); i11++) {
                try {
                    View childAt = b1Var.getChildAt(i11);
                    if ((childAt instanceof dm0) && (message = ((dm0) childAt).f25468a.getMessage()) != null) {
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
        ag.b1 b1Var = this.f26438b;
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
        if (k2Var != null && this.f26438b.G) {
            long currentTimeMillis = System.currentTimeMillis();
            int i12 = this.d;
            if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= org.telegram.messenger.vp.r1(i12).F5 * 1000) {
                ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
                if (!org.telegram.messenger.d20.i(i12).q() && !org.telegram.messenger.vp.r1(i12).A3()) {
                    if (z10) {
                        f7 = org.telegram.messenger.vp.r1(i12).D5;
                    } else {
                        f7 = org.telegram.messenger.vp.r1(i12).E5;
                    }
                    SpannableString spannableString = new SpannableString(Double.toString(Math.round(f7 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                    spannableString.setSpan(new x41(org.telegram.messenger.i0.o()), 0, spannableString.length(), 33);
                    if (!k2Var.hasStoryViewer()) {
                        cc a02 = cc.a0(k2Var);
                        if (z10) {
                            i10 = 2131743828;
                        } else {
                            i10 = 2131751349;
                        }
                        String L0 = org.telegram.messenger.cd.L0(i10, null);
                        if (z10) {
                            i11 = 2131743827;
                        } else {
                            i11 = 2131751348;
                        }
                        wb I = a02.I(2131624208, L0, org.telegram.messenger.i0.J2(org.telegram.messenger.i0.x2(org.telegram.messenger.cd.L0(i11, null), new k2.v(18, this, z10)), spannableString, "%d"));
                        I.f32135j = 8000;
                        I.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j10;
        kg.f fVar = this.f26439c;
        fVar.k(0, ((gm0) fVar.d).f26442r);
        if (!TextUtils.isEmpty(this.K)) {
            int i10 = this.d;
            if (!org.telegram.messenger.b6.q(i10).G.isEmpty() || !org.telegram.messenger.b6.q(i10).H.isEmpty()) {
                this.f26437a.setStickerType(1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.b8.G(this.d).y(arrayList);
                org.telegram.messenger.b8.G(this.d).Q(arrayList2);
                String lowerCase = this.K.toLowerCase();
                boolean equals = lowerCase.equals(this.L);
                this.L = lowerCase;
                Utilities.f14522g.a(this.M);
                org.telegram.messenger.r5 r5Var = Utilities.f14522g;
                am0 am0Var = new am0(this, arrayList, lowerCase, arrayList2);
                this.M = am0Var;
                if (equals) {
                    j10 = 0;
                } else {
                    j10 = 300;
                }
                r5Var.d(am0Var, j10);
                this.f26441n.clear();
                this.h.clear();
                if (!equals) {
                    this.f26437a.e(true, true);
                    e(this.h, this.f26441n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f26442r == 0) {
            this.N.b(0);
        }
        if (this.O) {
            this.h.clear();
            this.f26441n.clear();
        }
        org.telegram.messenger.b8.G(this.d).y(this.h);
        org.telegram.messenger.b8.G(this.d).Q(this.f26441n);
        for (int i11 = 0; i11 < this.e.size(); i11++) {
            ((org.telegram.messenger.jj) this.e.get(i11)).J5(null, true);
        }
        for (int i12 = 0; i12 < this.f26440f.size(); i12++) {
            ((org.telegram.messenger.jj) this.f26440f.get(i12)).J5(null, true);
        }
        this.L = null;
        e(this.h, this.f26441n, z10);
        if (this.f26442r == 0) {
            this.f26437a.e(false, false);
            this.f26437a.d.setText(org.telegram.messenger.cd.L0(2131745825, null));
            this.f26437a.e.setVisibility(8);
        }
        this.f26437a.setStickerType(9);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19589b5) {
            if (getVisibility() == 0) {
                org.telegram.messenger.b6.q(this.d).I.clear();
            }
            d(true);
        } else if (i10 == org.telegram.messenger.zs.f19694t3) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        s4.c1 T;
        kg.f fVar = this.f26439c;
        if (z10) {
            int i10 = this.f26443s;
            int i11 = this.f26444w;
            int i12 = this.f26445x;
            int i13 = this.f26446y;
            int i14 = this.D;
            int i15 = this.E;
            int i16 = this.f26442r;
            ArrayList arrayList3 = new ArrayList(this.e);
            ArrayList arrayList4 = new ArrayList(this.f26440f);
            f(arrayList, arrayList2);
            s4.n.c(new cm0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).c(fVar);
            int i17 = 0;
            while (true) {
                ag.b1 b1Var = this.f26438b;
                if (i17 < b1Var.getChildCount()) {
                    View childAt = b1Var.getChildAt(i17);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = b1Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.z3) {
                            fVar.t(T, R);
                        } else if (childAt instanceof dm0) {
                            org.telegram.ui.Cells.l7 l7Var = ((dm0) childAt).f25468a;
                            l7Var.f(true);
                            int f12 = l7Var.getMessage().f1();
                            long B0 = org.telegram.messenger.jj.B0(l7Var.getMessage().f16337k);
                            org.telegram.ui.s00 s00Var = this.J;
                            s00Var.f41322a = B0;
                            s00Var.f41323b = f12;
                            l7Var.b(this.I.b(s00Var), true);
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
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
            if (!jjVar.h4() && !org.telegram.messenger.jj.R4(jjVar.f16337k)) {
                arrayList3.add(jjVar);
            }
        }
        ArrayList arrayList4 = this.f26440f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) obj2;
            if (!jjVar2.h4() && !org.telegram.messenger.jj.R4(jjVar2.f16337k)) {
                arrayList4.add(jjVar2);
            }
        }
        this.f26442r = 0;
        this.f26443s = -1;
        this.f26444w = -1;
        this.f26445x = -1;
        this.f26446y = -1;
        this.D = -1;
        this.E = -1;
        this.H = false;
        if (!arrayList3.isEmpty()) {
            int i13 = this.f26442r;
            int i14 = i13 + 1;
            this.f26442r = i14;
            this.f26443s = i13;
            this.f26444w = i14;
            int size3 = arrayList3.size() + i14;
            this.f26442r = size3;
            this.f26445x = size3;
            while (true) {
                if (i10 >= arrayList3.size()) {
                    break;
                } else if (org.telegram.messenger.b8.G(this.d).T(((org.telegram.messenger.jj) arrayList3.get(i10)).S0())) {
                    this.H = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            int i15 = this.f26442r;
            int i16 = i15 + 1;
            this.f26442r = i16;
            this.f26446y = i15;
            this.D = i16;
            int size4 = arrayList4.size() + i16;
            this.f26442r = size4;
            this.E = size4;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.f(this.d).c(this, org.telegram.messenger.zs.f19589b5);
        org.telegram.messenger.zs.f(this.d).c(this, org.telegram.messenger.zs.f19694t3);
        if (getVisibility() == 0) {
            org.telegram.messenger.b6.q(this.d).I.clear();
        }
        if (!this.O) {
            this.O = true;
            Utilities.f14522g.c(new eb0(this, 21));
        }
        d(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.d;
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.f19589b5);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.f19694t3);
    }

    @Override
    public final void requestLayout() {
        if (this.P) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.y00 y00Var) {
        this.I = y00Var;
    }
}
