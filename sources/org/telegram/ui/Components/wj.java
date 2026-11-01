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
public final class wj extends pk0 {
    public zf.e0 D;
    public long E;
    public long F;
    public int G;
    public String I;
    public String J;
    public String K;
    public boolean S;
    public int T;
    public boolean V;
    public final xj X;
    public final Context f32261r;
    public rj f32263w;
    public cd f32264x;
    public long f32265y;
    public ArrayList f32262s = new ArrayList();
    public final org.telegram.ui.r00 H = new org.telegram.ui.r00(0, 0);
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final SparseArray O = new SparseArray();
    public final ArrayList P = new ArrayList();
    public final HashMap Q = new HashMap();
    public final ArrayList R = new ArrayList();
    public final e2.f U = new e2.f((int[]) null);
    public final mg.c2 W = new mg.c2(this, 25);

    public wj(xj xjVar, Context context) {
        this.X = xjVar;
        this.f32261r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(uk0 uk0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 == 0) {
            return this.f32262s.size();
        }
        int i11 = i10 - 1;
        ArrayList arrayList = this.P;
        int i12 = 1;
        if (i11 >= arrayList.size()) {
            return 1;
        }
        ArrayList arrayList2 = (ArrayList) this.Q.get(arrayList.get(i11));
        if (arrayList2 == null) {
            return 0;
        }
        int size = arrayList2.size();
        if (i11 == 0 && this.f32262s.isEmpty()) {
            i12 = 0;
        }
        return size + i12;
    }

    @Override
    public final Object O(int i10, int i11) {
        ArrayList arrayList;
        int i12;
        if (i10 == 0) {
            if (i11 < this.f32262s.size()) {
                return this.f32262s.get(i11);
            }
            return null;
        }
        int i13 = i10 - 1;
        ArrayList arrayList2 = this.P;
        if (i13 < arrayList2.size() && (arrayList = (ArrayList) this.Q.get(arrayList2.get(i13))) != null) {
            if (i13 == 0 && this.f32262s.isEmpty()) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            int i14 = i11 - i12;
            if (i14 >= 0 && i14 < arrayList.size()) {
                return arrayList.get(i14);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == R() - 1) {
            return 3;
        }
        int i12 = i10 - 1;
        if (i12 < this.P.size()) {
            if ((i12 != 0 || !this.f32262s.isEmpty()) && i11 == 0) {
                return 0;
            }
            return 4;
        }
        return 2;
    }

    @Override
    public final int R() {
        ArrayList arrayList = this.P;
        if (arrayList.isEmpty()) {
            return 2;
        }
        return arrayList.size() + (!this.V ? 1 : 0) + 2;
    }

    @Override
    public final View T(int i10, View view) {
        String e02;
        org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
        if (z3Var == null) {
            Context context = this.f32261r;
            xj xjVar = this.X;
            z3Var = new org.telegram.ui.Cells.z3(context, xjVar.f30963a);
            z3Var.setBackgroundColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.e7, xjVar.f30963a) & (-218103809));
        }
        if (i10 != 0 && (i10 != 1 || !this.f32262s.isEmpty())) {
            int i11 = i10 - 1;
            ArrayList arrayList = this.P;
            if (i11 < arrayList.size()) {
                z3Var.setAlpha(1.0f);
                ArrayList arrayList2 = (ArrayList) this.Q.get((String) arrayList.get(i11));
                if (arrayList2 != null) {
                    org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList2.get(0);
                    if (i11 == 0 && !this.f32262s.isEmpty()) {
                        e02 = org.telegram.messenger.dd.L0(2131749544, null);
                    } else {
                        e02 = org.telegram.messenger.dd.e0(kjVar.f16690k.date, false);
                    }
                    z3Var.setText(e02);
                }
            }
            return view;
        }
        z3Var.setAlpha(0.0f);
        return z3Var;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        int i12 = c1Var.f47912f;
        if (i12 == 1 || i12 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        String e02;
        boolean z10;
        int i12 = i11;
        int i13 = c1Var.f47912f;
        View view = c1Var.f47909a;
        if (i13 != 2 && i13 != 3) {
            HashMap hashMap = this.Q;
            ArrayList arrayList = this.P;
            boolean z11 = false;
            if (i13 != 0) {
                if (i13 == 1 || i13 == 4) {
                    org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                    if (i10 == 0) {
                        qj qjVar = (qj) O(S(i12), Q(i12));
                        int i14 = qjVar.f29741a;
                        if (i14 != 0) {
                            l7Var.d(qjVar.f29742b, qjVar.f29743c, null, null, i14, false);
                        } else {
                            l7Var.d(qjVar.f29742b, qjVar.f29743c, qjVar.d.toUpperCase().substring(0, Math.min(qjVar.d.length(), 4)), qjVar.e, 0, false);
                        }
                        File file = qjVar.f29744f;
                        xj xjVar = this.X;
                        if (file != null) {
                            l7Var.b(xjVar.R.containsKey(file.toString()), !xjVar.U);
                            return;
                        } else {
                            l7Var.b(false, !xjVar.U);
                            return;
                        }
                    }
                    int i15 = i10 - 1;
                    if (i15 != 0 || !this.f32262s.isEmpty()) {
                        i12--;
                    }
                    ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i15));
                    if (arrayList2 != null) {
                        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList2.get(i12);
                        if (l7Var.getMessage() != null && l7Var.getMessage().f1() == kjVar.f1()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i12 != arrayList2.size() - 1 || (i15 == arrayList.size() - 1 && this.S)) {
                            z11 = true;
                        }
                        l7Var.c(kjVar, z11);
                        l7Var.getViewTreeObserver().addOnPreDrawListener(new vj(this, l7Var, kjVar, z10, 0));
                        return;
                    }
                    return;
                }
                return;
            }
            int i16 = i10 - 1;
            ArrayList arrayList3 = (ArrayList) hashMap.get((String) arrayList.get(i16));
            if (arrayList3 != null) {
                org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList3.get(0);
                if (i16 == 0 && !this.f32262s.isEmpty()) {
                    e02 = org.telegram.messenger.dd.L0(2131749544, null);
                } else {
                    e02 = org.telegram.messenger.dd.e0(kjVar2.f16690k.date, false);
                }
                ((org.telegram.ui.Cells.z3) view).setText(e02);
            }
        }
    }

    public final void Y(String str, boolean z10) {
        long j10;
        xj xjVar = this.X;
        pj pjVar = xjVar.f32589w;
        lj ljVar = xjVar.f32587r;
        cd cdVar = this.f32264x;
        if (cdVar != null) {
            org.telegram.messenger.i0.r(cdVar);
            this.f32264x = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.f32262s.isEmpty()) {
                this.f32262s.clear();
            }
            if (ljVar.getAdapter() != pjVar) {
                ljVar.setAdapter(pjVar);
            }
            f();
        } else {
            cd cdVar2 = new cd(13, this, str);
            this.f32264x = cdVar2;
            org.telegram.messenger.i0.h3(cdVar2, 300L);
        }
        if (!xjVar.W && pjVar.f29437f.isEmpty()) {
            int i10 = 0;
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            while (true) {
                ArrayList arrayList = this.R;
                if (i10 < arrayList.size()) {
                    zf.e0 e0Var = (zf.e0) arrayList.get(i10);
                    int i11 = e0Var.d;
                    if (i11 == 4) {
                        TLObject tLObject = e0Var.f55496f;
                        if (tLObject instanceof TLRPC.User) {
                            j10 = ((TLRPC.User) tLObject).f19943id;
                        } else if (tLObject instanceof TLRPC.Chat) {
                            j10 = -((TLRPC.Chat) tLObject).f19794id;
                        }
                        j11 = j10;
                    } else if (i11 == 6) {
                        zf.c0 c0Var = e0Var.f55497g;
                        j12 = c0Var.f55478b;
                        j13 = c0Var.f55479c;
                    }
                    i10++;
                } else {
                    Z(j11, j12, j13, zf.g0.f55511j3[2], str, z10);
                    return;
                }
            }
        }
    }

    public final void Z(final long j10, final long j11, final long j12, zf.e0 e0Var, final String str, boolean z10) {
        final boolean z11;
        boolean z12;
        long j13;
        xj xjVar = this.X;
        lj ljVar = xjVar.f32587r;
        kj kjVar = xjVar.L;
        Locale locale = Locale.ENGLISH;
        final String str2 = j10 + j11 + j12 + e0Var.d + str;
        String str3 = this.I;
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
        this.D = e0Var;
        this.f32265y = j10;
        this.E = j11;
        this.F = j12;
        rj rjVar = this.f32263w;
        if (rjVar != null) {
            org.telegram.messenger.i0.r(rjVar);
        }
        mg.c2 c2Var = this.W;
        org.telegram.messenger.i0.r(c2Var);
        if (z11 && z10) {
            return;
        }
        ArrayList arrayList = this.M;
        ArrayList arrayList2 = this.L;
        ArrayList arrayList3 = this.N;
        if (z12) {
            arrayList3.clear();
            this.P.clear();
            this.Q.clear();
            this.S = true;
            kjVar.setVisibility(0);
            f();
            this.T++;
            if (ljVar.getPinnedHeader() != null) {
                ljVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.S = true;
        f();
        if (!z11) {
            c2Var.run();
            kjVar.e(true, !z10);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i10 = 1 + this.T;
        this.T = i10;
        final org.telegram.messenger.c a2 = org.telegram.messenger.c.a(org.telegram.messenger.e20.f15506s0);
        ?? r02 = new Runnable() {
            @Override
            public final void run() {
                int i11;
                long j14;
                ArrayList arrayList4;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final ArrayList arrayList5;
                long j15;
                final org.telegram.messenger.c cVar = a2;
                int i12 = cVar.f15043a;
                final wj wjVar = wj.this;
                ArrayList arrayList6 = wjVar.N;
                final long j16 = j10;
                int i13 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
                final String str4 = str;
                long j17 = j11;
                long j18 = j12;
                final boolean z13 = z11;
                if (i13 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.f19905q = str4;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = wjVar.D.e;
                    tL_messages_search.peer = org.telegram.messenger.wp.r1(i12).i1(j16);
                    if (j17 > 0) {
                        tL_messages_search.min_date = (int) (j17 / 1000);
                    }
                    if (j18 > 0) {
                        tL_messages_search.max_date = (int) (j18 / 1000);
                    }
                    if (z13 && str4.equals(wjVar.J) && !arrayList6.isEmpty()) {
                        tL_messages_search.offset_id = ((org.telegram.messenger.kj) i0.a.g(1, arrayList6)).f1();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    tL_messages_searchGlobal = tL_messages_search;
                    j14 = j17;
                    arrayList5 = null;
                } else {
                    if (!TextUtils.isEmpty(str4)) {
                        ArrayList arrayList7 = new ArrayList();
                        i11 = 20;
                        j14 = j17;
                        org.telegram.messenger.is.a0(i12).M0(0, str4, arrayList7, new ArrayList(), new ArrayList(), null, -1);
                        arrayList4 = arrayList7;
                    } else {
                        i11 = 20;
                        j14 = j17;
                        arrayList4 = null;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i11;
                    tL_messages_searchGlobal2.f19907q = str4;
                    tL_messages_searchGlobal2.filter = wjVar.D.e;
                    if (j14 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j14 / 1000);
                    }
                    if (j18 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j18 / 1000);
                    }
                    if (z13 && str4.equals(wjVar.J) && !arrayList6.isEmpty()) {
                        org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) i0.a.g(1, arrayList6);
                        tL_messages_searchGlobal2.offset_id = kjVar2.f1();
                        tL_messages_searchGlobal2.offset_rate = wjVar.G;
                        TLRPC.Peer peer = kjVar2.f16690k.peer_id;
                        long j19 = peer.channel_id;
                        if (j19 == 0) {
                            j19 = peer.chat_id;
                            if (j19 == 0) {
                                j15 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.wp.r1(i12).i1(j15);
                            }
                        }
                        j15 = -j19;
                        tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.wp.r1(i12).i1(j15);
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    arrayList5 = arrayList4;
                }
                wjVar.J = str4;
                wjVar.I = str2;
                final ArrayList arrayList8 = new ArrayList();
                zf.g0.B1(wjVar.J, arrayList8);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                final int i14 = i10;
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
                            for (int i15 = 0; i15 < size; i15++) {
                                org.telegram.messenger.kj kjVar3 = new org.telegram.messenger.kj(cVar2.f15043a, messages_messages.messages.get(i15), false, true);
                                kjVar3.J5(str5, true);
                                arrayList9.add(kjVar3);
                            }
                        }
                        org.telegram.messenger.i0.g3(new tj(wj.this, i14, tL_error, tLObject, cVar2, z13, str5, arrayList9, j16, j20, arrayList5, arrayList8));
                    }
                });
            }
        };
        this.f32263w = r02;
        if (z11 && !arrayList3.isEmpty()) {
            j13 = 0;
        } else {
            j13 = 350;
        }
        org.telegram.messenger.i0.h3(r02, j13);
        xjVar.J.setViewType(3);
    }

    public final void a0(java.util.ArrayList r12, java.util.ArrayList r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wj.a0(java.util.ArrayList, java.util.ArrayList, boolean):void");
    }

    @Override
    public final void f() {
        X(false);
        this.X.W();
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z3 z3Var;
        View view;
        xj xjVar = this.X;
        Context context = this.f32261r;
        if (i10 != 0) {
            int i11 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        view = new View(context);
                        view.setTag(-33024);
                        return sc.e.o(view, view, -1, -2);
                    }
                } else {
                    zz zzVar = new zz(context, xjVar.f30963a);
                    zzVar.setViewType(3);
                    zzVar.setIsSingleCell(true);
                    z3Var = zzVar;
                }
            }
            if (i10 == 1) {
                i11 = 1;
            }
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(i11, context, xjVar.f30963a);
            l7Var.setDrawDownloadIcon(false);
            view = l7Var;
            return sc.e.o(view, view, -1, -2);
        }
        z3Var = new org.telegram.ui.Cells.z3(context, xjVar.f30963a);
        view = z3Var;
        return sc.e.o(view, view, -1, -2);
    }
}
