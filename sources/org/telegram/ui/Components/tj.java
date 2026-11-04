package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tj extends oj0 {
    public kg.l0 E;
    public long F;
    public long G;
    public int H;
    public String J;
    public String K;
    public String L;
    public boolean T;
    public int U;
    public boolean W;
    public final uj Y;
    public final Context f38424r;
    public pj f38426w;
    public org.telegram.ui.lo f38427x;
    public long f38428y;
    public ArrayList f38425s = new ArrayList();
    public final org.telegram.ui.pz I = new org.telegram.ui.pz(0, 0);
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final ArrayList O = new ArrayList();
    public final SparseArray P = new SparseArray();
    public final ArrayList Q = new ArrayList();
    public final HashMap R = new HashMap();
    public final ArrayList S = new ArrayList();
    public final g2.g V = new g2.g((int[]) null);
    public final mi.b0 X = new mi.b0(this, 26);

    public tj(uj ujVar, Context context) {
        this.Y = ujVar;
        this.f38424r = context;
    }

    @Override
    public final String F(int i3) {
        return null;
    }

    @Override
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i3) {
        if (i3 == 0) {
            return this.f38425s.size();
        }
        int i10 = i3 - 1;
        ArrayList arrayList = this.Q;
        int i11 = 1;
        if (i10 >= arrayList.size()) {
            return 1;
        }
        ArrayList arrayList2 = (ArrayList) this.R.get(arrayList.get(i10));
        if (arrayList2 == null) {
            return 0;
        }
        int size = arrayList2.size();
        if (i10 == 0 && this.f38425s.isEmpty()) {
            i11 = 0;
        }
        return size + i11;
    }

    @Override
    public final Object O(int i3, int i10) {
        ArrayList arrayList;
        int i11;
        if (i3 == 0) {
            if (i10 < this.f38425s.size()) {
                return this.f38425s.get(i10);
            }
            return null;
        }
        int i12 = i3 - 1;
        ArrayList arrayList2 = this.Q;
        if (i12 < arrayList2.size() && (arrayList = (ArrayList) this.R.get(arrayList2.get(i12))) != null) {
            if (i12 == 0 && this.f38425s.isEmpty()) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            int i13 = i10 - i11;
            if (i13 >= 0 && i13 < arrayList.size()) {
                return arrayList.get(i13);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int P(int i3, int i10) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == R() - 1) {
            return 3;
        }
        int i11 = i3 - 1;
        if (i11 < this.Q.size()) {
            if ((i11 != 0 || !this.f38425s.isEmpty()) && i10 == 0) {
                return 0;
            }
            return 4;
        }
        return 2;
    }

    @Override
    public final int R() {
        ArrayList arrayList = this.Q;
        if (arrayList.isEmpty()) {
            return 2;
        }
        return arrayList.size() + (!this.W ? 1 : 0) + 2;
    }

    @Override
    public final View T(int i3, View view) {
        String e02;
        org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
        if (x3Var == null) {
            Context context = this.f38424r;
            uj ujVar = this.Y;
            x3Var = new org.telegram.ui.Cells.x3(context, ujVar.f38415a);
            x3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27899e7, ujVar.f38415a) & (-218103809));
        }
        if (i3 != 0 && (i3 != 1 || !this.f38425s.isEmpty())) {
            int i10 = i3 - 1;
            ArrayList arrayList = this.Q;
            if (i10 < arrayList.size()) {
                x3Var.setAlpha(1.0f);
                ArrayList arrayList2 = (ArrayList) this.R.get((String) arrayList.get(i10));
                if (arrayList2 != null) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList2.get(0);
                    if (i10 == 0 && !this.f38425s.isEmpty()) {
                        e02 = org.telegram.messenger.bd.M0(2131749543, null);
                    } else {
                        e02 = org.telegram.messenger.bd.e0(ziVar.f26868k.date, false);
                    }
                    x3Var.setText(e02);
                }
            }
            return view;
        }
        x3Var.setAlpha(0.0f);
        return x3Var;
    }

    @Override
    public final boolean V(int i3, int i10, u4.d1 d1Var) {
        int i11 = d1Var.f55544f;
        if (i11 == 1 || i11 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i3, int i10, u4.d1 d1Var) {
        String e02;
        boolean z10;
        int i11 = i10;
        int i12 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i12 != 2 && i12 != 3) {
            HashMap hashMap = this.R;
            ArrayList arrayList = this.Q;
            boolean z11 = false;
            if (i12 != 0) {
                if (i12 == 1 || i12 == 4) {
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                    if (i3 == 0) {
                        oj ojVar = (oj) O(S(i11), Q(i11));
                        int i13 = ojVar.f36839a;
                        if (i13 != 0) {
                            g7Var.d(ojVar.f36840b, ojVar.f36841c, null, null, i13, false);
                        } else {
                            g7Var.d(ojVar.f36840b, ojVar.f36841c, ojVar.d.toUpperCase().substring(0, Math.min(ojVar.d.length(), 4)), ojVar.f36842e, 0, false);
                        }
                        File file = ojVar.f36843f;
                        uj ujVar = this.Y;
                        if (file != null) {
                            g7Var.b(ujVar.S.containsKey(file.toString()), !ujVar.V);
                            return;
                        } else {
                            g7Var.b(false, !ujVar.V);
                            return;
                        }
                    }
                    int i14 = i3 - 1;
                    if (i14 != 0 || !this.f38425s.isEmpty()) {
                        i11--;
                    }
                    ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i14));
                    if (arrayList2 != null) {
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList2.get(i11);
                        if (g7Var.getMessage() != null && g7Var.getMessage().f1() == ziVar.f1()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i11 != arrayList2.size() - 1 || (i14 == arrayList.size() - 1 && this.T)) {
                            z11 = true;
                        }
                        g7Var.c(ziVar, z11);
                        g7Var.getViewTreeObserver().addOnPreDrawListener(new sj(this, g7Var, ziVar, z10, 0));
                        return;
                    }
                    return;
                }
                return;
            }
            int i15 = i3 - 1;
            ArrayList arrayList3 = (ArrayList) hashMap.get((String) arrayList.get(i15));
            if (arrayList3 != null) {
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList3.get(0);
                if (i15 == 0 && !this.f38425s.isEmpty()) {
                    e02 = org.telegram.messenger.bd.M0(2131749543, null);
                } else {
                    e02 = org.telegram.messenger.bd.e0(ziVar2.f26868k.date, false);
                }
                ((org.telegram.ui.Cells.x3) view).setText(e02);
            }
        }
    }

    public final void Y(String str, boolean z10) {
        long j10;
        uj ujVar = this.Y;
        nj njVar = ujVar.f38772w;
        jj jjVar = ujVar.f38770r;
        org.telegram.ui.lo loVar = this.f38427x;
        if (loVar != null) {
            org.telegram.messenger.g0.r(loVar);
            this.f38427x = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.f38425s.isEmpty()) {
                this.f38425s.clear();
            }
            if (jjVar.getAdapter() != njVar) {
                jjVar.setAdapter(njVar);
            }
            f();
        } else {
            org.telegram.ui.lo loVar2 = new org.telegram.ui.lo(24, this, str);
            this.f38427x = loVar2;
            org.telegram.messenger.g0.i3(loVar2, 300L);
        }
        if (!ujVar.f38762a0 && njVar.f36568f.isEmpty()) {
            int i3 = 0;
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            while (true) {
                ArrayList arrayList = this.S;
                if (i3 < arrayList.size()) {
                    kg.l0 l0Var = (kg.l0) arrayList.get(i3);
                    int i10 = l0Var.d;
                    if (i10 == 4) {
                        TLObject tLObject = l0Var.f17084f;
                        if (tLObject instanceof TLRPC.User) {
                            j10 = ((TLRPC.User) tLObject).f27150id;
                        } else if (tLObject instanceof TLRPC.Chat) {
                            j10 = -((TLRPC.Chat) tLObject).f27001id;
                        }
                        j11 = j10;
                    } else if (i10 == 6) {
                        kg.j0 j0Var = l0Var.f17085g;
                        j12 = j0Var.f17057b;
                        j13 = j0Var.f17058c;
                    }
                    i3++;
                } else {
                    Z(j11, j12, j13, kg.n0.f17105k3[2], str, z10);
                    return;
                }
            }
        }
    }

    public final void Z(final long j10, final long j11, final long j12, kg.l0 l0Var, final String str, boolean z10) {
        final boolean z11;
        boolean z12;
        long j13;
        uj ujVar = this.Y;
        jj jjVar = ujVar.f38770r;
        ei.f5 f5Var = ujVar.M;
        Locale locale = Locale.ENGLISH;
        final String str2 = j10 + j11 + j12 + l0Var.d + str;
        String str3 = this.J;
        if (str3 != null && str3.equals(str2)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.E = l0Var;
        this.f38428y = j10;
        this.F = j11;
        this.G = j12;
        pj pjVar = this.f38426w;
        if (pjVar != null) {
            org.telegram.messenger.g0.r(pjVar);
        }
        mi.b0 b0Var = this.X;
        org.telegram.messenger.g0.r(b0Var);
        if (z11 && z10) {
            return;
        }
        ArrayList arrayList = this.N;
        ArrayList arrayList2 = this.M;
        ArrayList arrayList3 = this.O;
        if (z12) {
            arrayList3.clear();
            this.Q.clear();
            this.R.clear();
            this.T = true;
            f5Var.setVisibility(0);
            f();
            this.U++;
            if (jjVar.getPinnedHeader() != null) {
                jjVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.T = true;
        f();
        if (!z11) {
            b0Var.run();
            f5Var.e(true, !z10);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i3 = 1 + this.U;
        this.U = i3;
        final org.telegram.messenger.c a10 = org.telegram.messenger.c.a(org.telegram.messenger.h10.f22829t0);
        ?? r02 = new Runnable() {
            @Override
            public final void run() {
                int i10;
                long j14;
                ArrayList arrayList4;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final ArrayList arrayList5;
                long j15;
                final org.telegram.messenger.c cVar = a10;
                int i11 = cVar.f21919a;
                final tj tjVar = tj.this;
                ArrayList arrayList6 = tjVar.O;
                final long j16 = j10;
                int i12 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
                final String str4 = str;
                long j17 = j11;
                long j18 = j12;
                final boolean z13 = z11;
                if (i12 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.f27112q = str4;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = tjVar.E.f17083e;
                    tL_messages_search.peer = org.telegram.messenger.hp.s1(i11).j1(j16);
                    if (j17 > 0) {
                        tL_messages_search.min_date = (int) (j17 / 1000);
                    }
                    if (j18 > 0) {
                        tL_messages_search.max_date = (int) (j18 / 1000);
                    }
                    if (z13 && str4.equals(tjVar.K) && !arrayList6.isEmpty()) {
                        tL_messages_search.offset_id = ((org.telegram.messenger.zi) k2.p1.h(1, arrayList6)).f1();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    tL_messages_searchGlobal = tL_messages_search;
                    j14 = j17;
                    arrayList5 = null;
                } else {
                    if (!TextUtils.isEmpty(str4)) {
                        ArrayList arrayList7 = new ArrayList();
                        i10 = 20;
                        j14 = j17;
                        org.telegram.messenger.qr.a0(i11).M0(0, str4, arrayList7, new ArrayList(), new ArrayList(), null, -1);
                        arrayList4 = arrayList7;
                    } else {
                        i10 = 20;
                        j14 = j17;
                        arrayList4 = null;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i10;
                    tL_messages_searchGlobal2.f27114q = str4;
                    tL_messages_searchGlobal2.filter = tjVar.E.f17083e;
                    if (j14 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j14 / 1000);
                    }
                    if (j18 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j18 / 1000);
                    }
                    if (z13 && str4.equals(tjVar.K) && !arrayList6.isEmpty()) {
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) k2.p1.h(1, arrayList6);
                        tL_messages_searchGlobal2.offset_id = ziVar.f1();
                        tL_messages_searchGlobal2.offset_rate = tjVar.H;
                        TLRPC.Peer peer = ziVar.f26868k.peer_id;
                        long j19 = peer.channel_id;
                        if (j19 == 0) {
                            j19 = peer.chat_id;
                            if (j19 == 0) {
                                j15 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.hp.s1(i11).j1(j15);
                            }
                        }
                        j15 = -j19;
                        tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.hp.s1(i11).j1(j15);
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    arrayList5 = arrayList4;
                }
                tjVar.K = str4;
                tjVar.J = str2;
                final ArrayList arrayList8 = new ArrayList();
                kg.n0.B1(tjVar.K, arrayList8);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                final int i13 = i3;
                final long j20 = j14;
                connectionsManager.sendRequest(tL_messages_searchGlobal, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList9 = new ArrayList();
                        org.telegram.messenger.c cVar2 = cVar;
                        String str5 = str4;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            int size = messages_messages.messages.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(cVar2.f21919a, messages_messages.messages.get(i14), false, true);
                                ziVar2.L5(str5, true);
                                arrayList9.add(ziVar2);
                            }
                        }
                        org.telegram.messenger.g0.h3(new ii.g3(tj.this, i13, tL_error, tLObject, cVar2, z13, str5, arrayList9, j16, j20, arrayList5, arrayList8));
                    }
                });
            }
        };
        this.f38426w = r02;
        if (z11 && !arrayList3.isEmpty()) {
            j13 = 0;
        } else {
            j13 = 350;
        }
        org.telegram.messenger.g0.i3(r02, j13);
        ujVar.K.setViewType(3);
    }

    public final void a0(java.util.ArrayList r12, java.util.ArrayList r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tj.a0(java.util.ArrayList, java.util.ArrayList, boolean):void");
    }

    @Override
    public final void f() {
        X(false);
        this.Y.X();
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.x3 x3Var;
        View view;
        uj ujVar = this.Y;
        Context context = this.f38424r;
        if (i3 != 0) {
            int i10 = 2;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 4) {
                        view = new View(context);
                        view.setTag(-33024);
                        return k2.p1.p(view, view, -1, -2);
                    }
                } else {
                    iz izVar = new iz(context, ujVar.f38415a);
                    izVar.setViewType(3);
                    izVar.setIsSingleCell(true);
                    x3Var = izVar;
                }
            }
            if (i3 == 1) {
                i10 = 1;
            }
            org.telegram.ui.Cells.g7 g7Var = new org.telegram.ui.Cells.g7(i10, context, ujVar.f38415a);
            g7Var.setDrawDownloadIcon(false);
            view = g7Var;
            return k2.p1.p(view, view, -1, -2);
        }
        x3Var = new org.telegram.ui.Cells.x3(context, ujVar.f38415a);
        view = x3Var;
        return k2.p1.p(view, view, -1, -2);
    }
}
