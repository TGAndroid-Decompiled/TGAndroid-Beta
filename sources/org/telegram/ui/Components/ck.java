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
public final class ck extends pj0 {
    public jg.o0 E;
    public long F;
    public long G;
    public int H;
    public String J;
    public String K;
    public String L;
    public boolean T;
    public int U;
    public boolean W;
    public final dk Y;
    public final Context f33614r;
    public xj f33616w;
    public od f33617x;
    public long f33618y;
    public ArrayList f33615s = new ArrayList();
    public final org.telegram.ui.sz I = new org.telegram.ui.sz(0, 0);
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final ArrayList O = new ArrayList();
    public final SparseArray P = new SparseArray();
    public final ArrayList Q = new ArrayList();
    public final HashMap R = new HashMap();
    public final ArrayList S = new ArrayList();
    public final h2.f V = new h2.f((int[]) null);
    public final zj X = new zj(this, 0);

    public ck(dk dkVar, Context context) {
        this.Y = dkVar;
        this.f33614r = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(uj0 uj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        if (i7 == 0) {
            return this.f33615s.size();
        }
        int i10 = i7 - 1;
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
        if (i10 == 0 && this.f33615s.isEmpty()) {
            i11 = 0;
        }
        return size + i11;
    }

    @Override
    public final Object O(int i7, int i10) {
        ArrayList arrayList;
        int i11;
        if (i7 == 0) {
            if (i10 < this.f33615s.size()) {
                return this.f33615s.get(i10);
            }
            return null;
        }
        int i12 = i7 - 1;
        ArrayList arrayList2 = this.Q;
        if (i12 < arrayList2.size() && (arrayList = (ArrayList) this.R.get(arrayList2.get(i12))) != null) {
            if (i12 == 0 && this.f33615s.isEmpty()) {
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
    public final int P(int i7, int i10) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == R() - 1) {
            return 3;
        }
        int i11 = i7 - 1;
        if (i11 < this.Q.size()) {
            if ((i11 != 0 || !this.f33615s.isEmpty()) && i10 == 0) {
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
    public final View T(int i7, View view) {
        String e02;
        org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
        if (x3Var == null) {
            Context context = this.f33614r;
            dk dkVar = this.Y;
            x3Var = new org.telegram.ui.Cells.x3(context, dkVar.f33606a);
            x3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28869e7, dkVar.f33606a) & (-218103809));
        }
        if (i7 != 0 && (i7 != 1 || !this.f33615s.isEmpty())) {
            int i10 = i7 - 1;
            ArrayList arrayList = this.Q;
            if (i10 < arrayList.size()) {
                x3Var.setAlpha(1.0f);
                ArrayList arrayList2 = (ArrayList) this.R.get((String) arrayList.get(i10));
                if (arrayList2 != null) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList2.get(0);
                    if (i10 == 0 && !this.f33615s.isEmpty()) {
                        e02 = org.telegram.messenger.hd.M0(2131749535, null);
                    } else {
                        e02 = org.telegram.messenger.hd.e0(gjVar.f23817k.date, false);
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
    public final boolean V(int i7, int i10, v4.e1 e1Var) {
        int i11 = e1Var.f58539f;
        if (i11 == 1 || i11 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.e1 e1Var) {
        String e02;
        boolean z10;
        int i11 = i10;
        int i12 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i12 != 2 && i12 != 3) {
            HashMap hashMap = this.R;
            ArrayList arrayList = this.Q;
            boolean z11 = false;
            if (i12 != 0) {
                if (i12 == 1 || i12 == 4) {
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                    if (i7 == 0) {
                        wj wjVar = (wj) O(S(i11), Q(i11));
                        int i13 = wjVar.f41362a;
                        if (i13 != 0) {
                            g7Var.d(wjVar.f41363b, wjVar.f41364c, null, null, i13, false);
                        } else {
                            g7Var.d(wjVar.f41363b, wjVar.f41364c, wjVar.d.toUpperCase().substring(0, Math.min(wjVar.d.length(), 4)), wjVar.f41365e, 0, false);
                        }
                        File file = wjVar.f41366f;
                        dk dkVar = this.Y;
                        if (file != null) {
                            g7Var.b(dkVar.S.containsKey(file.toString()), !dkVar.V);
                            return;
                        } else {
                            g7Var.b(false, !dkVar.V);
                            return;
                        }
                    }
                    int i14 = i7 - 1;
                    if (i14 != 0 || !this.f33615s.isEmpty()) {
                        i11--;
                    }
                    ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i14));
                    if (arrayList2 != null) {
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList2.get(i11);
                        if (g7Var.getMessage() != null && g7Var.getMessage().e1() == gjVar.e1()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i11 != arrayList2.size() - 1 || (i14 == arrayList.size() - 1 && this.T)) {
                            z11 = true;
                        }
                        g7Var.c(gjVar, z11);
                        g7Var.getViewTreeObserver().addOnPreDrawListener(new bk(this, g7Var, gjVar, z10, 0));
                        return;
                    }
                    return;
                }
                return;
            }
            int i15 = i7 - 1;
            ArrayList arrayList3 = (ArrayList) hashMap.get((String) arrayList.get(i15));
            if (arrayList3 != null) {
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList3.get(0);
                if (i15 == 0 && !this.f33615s.isEmpty()) {
                    e02 = org.telegram.messenger.hd.M0(2131749535, null);
                } else {
                    e02 = org.telegram.messenger.hd.e0(gjVar2.f23817k.date, false);
                }
                ((org.telegram.ui.Cells.x3) view).setText(e02);
            }
        }
    }

    public final void Y(String str, boolean z10) {
        long j3;
        dk dkVar = this.Y;
        vj vjVar = dkVar.f33967w;
        rj rjVar = dkVar.f33965r;
        od odVar = this.f33617x;
        if (odVar != null) {
            org.telegram.messenger.g0.r(odVar);
            this.f33617x = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.f33615s.isEmpty()) {
                this.f33615s.clear();
            }
            if (rjVar.getAdapter() != vjVar) {
                rjVar.setAdapter(vjVar);
            }
            f();
        } else {
            od odVar2 = new od(13, this, str);
            this.f33617x = odVar2;
            org.telegram.messenger.g0.i3(odVar2, 300L);
        }
        if (!dkVar.f33957a0 && vjVar.f40445f.isEmpty()) {
            int i7 = 0;
            long j10 = 0;
            long j11 = 0;
            long j12 = 0;
            while (true) {
                ArrayList arrayList = this.S;
                if (i7 < arrayList.size()) {
                    jg.o0 o0Var = (jg.o0) arrayList.get(i7);
                    int i10 = o0Var.d;
                    if (i10 == 4) {
                        TLObject tLObject = o0Var.f17223f;
                        if (tLObject instanceof TLRPC.User) {
                            j3 = ((TLRPC.User) tLObject).f28200id;
                        } else if (tLObject instanceof TLRPC.Chat) {
                            j3 = -((TLRPC.Chat) tLObject).f28051id;
                        }
                        j10 = j3;
                    } else if (i10 == 6) {
                        jg.m0 m0Var = o0Var.f17224g;
                        j11 = m0Var.f17202b;
                        j12 = m0Var.f17203c;
                    }
                    i7++;
                } else {
                    Z(j10, j11, j12, jg.q0.f17237k3[2], str, z10);
                    return;
                }
            }
        }
    }

    public final void Z(final long j3, final long j10, final long j11, jg.o0 o0Var, final String str, boolean z10) {
        final boolean z11;
        boolean z12;
        long j12;
        dk dkVar = this.Y;
        rj rjVar = dkVar.f33965r;
        fi.x4 x4Var = dkVar.M;
        Locale locale = Locale.ENGLISH;
        final String str2 = j3 + j10 + j11 + o0Var.d + str;
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
        this.E = o0Var;
        this.f33618y = j3;
        this.F = j10;
        this.G = j11;
        xj xjVar = this.f33616w;
        if (xjVar != null) {
            org.telegram.messenger.g0.r(xjVar);
        }
        zj zjVar = this.X;
        org.telegram.messenger.g0.r(zjVar);
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
            x4Var.setVisibility(0);
            f();
            this.U++;
            if (rjVar.getPinnedHeader() != null) {
                rjVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.T = true;
        f();
        if (!z11) {
            zjVar.run();
            x4Var.e(true, !z10);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i7 = 1 + this.U;
        this.U = i7;
        final org.telegram.messenger.c a10 = org.telegram.messenger.c.a(org.telegram.messenger.m10.f24934t0);
        ?? r02 = new Runnable() {
            @Override
            public final void run() {
                int i10;
                long j13;
                ArrayList arrayList4;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final ArrayList arrayList5;
                long j14;
                final org.telegram.messenger.c cVar = a10;
                int i11 = cVar.f22778a;
                final ck ckVar = ck.this;
                ArrayList arrayList6 = ckVar.O;
                final long j15 = j3;
                int i12 = (j15 > 0L ? 1 : (j15 == 0L ? 0 : -1));
                final String str4 = str;
                long j16 = j10;
                long j17 = j11;
                final boolean z13 = z11;
                if (i12 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.f28162q = str4;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = ckVar.E.f17222e;
                    tL_messages_search.peer = org.telegram.messenger.np.s1(i11).j1(j15);
                    if (j16 > 0) {
                        tL_messages_search.min_date = (int) (j16 / 1000);
                    }
                    if (j17 > 0) {
                        tL_messages_search.max_date = (int) (j17 / 1000);
                    }
                    if (z13 && str4.equals(ckVar.K) && !arrayList6.isEmpty()) {
                        tL_messages_search.offset_id = ((org.telegram.messenger.gj) i5.c.h(1, arrayList6)).e1();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    tL_messages_searchGlobal = tL_messages_search;
                    j13 = j16;
                    arrayList5 = null;
                } else {
                    if (!TextUtils.isEmpty(str4)) {
                        ArrayList arrayList7 = new ArrayList();
                        i10 = 20;
                        j13 = j16;
                        org.telegram.messenger.vr.a0(i11).M0(0, str4, arrayList7, new ArrayList(), new ArrayList(), null, -1);
                        arrayList4 = arrayList7;
                    } else {
                        i10 = 20;
                        j13 = j16;
                        arrayList4 = null;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i10;
                    tL_messages_searchGlobal2.f28164q = str4;
                    tL_messages_searchGlobal2.filter = ckVar.E.f17222e;
                    if (j13 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j13 / 1000);
                    }
                    if (j17 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j17 / 1000);
                    }
                    if (z13 && str4.equals(ckVar.K) && !arrayList6.isEmpty()) {
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, arrayList6);
                        tL_messages_searchGlobal2.offset_id = gjVar.e1();
                        tL_messages_searchGlobal2.offset_rate = ckVar.H;
                        TLRPC.Peer peer = gjVar.f23817k.peer_id;
                        long j18 = peer.channel_id;
                        if (j18 == 0) {
                            j18 = peer.chat_id;
                            if (j18 == 0) {
                                j14 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.np.s1(i11).j1(j14);
                            }
                        }
                        j14 = -j18;
                        tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.np.s1(i11).j1(j14);
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    arrayList5 = arrayList4;
                }
                ckVar.K = str4;
                ckVar.J = str2;
                final ArrayList arrayList8 = new ArrayList();
                jg.q0.B1(ckVar.K, arrayList8);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                final int i13 = i7;
                final long j19 = j13;
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
                                org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(cVar2.f22778a, messages_messages.messages.get(i14), false, true);
                                gjVar2.K5(str5, true);
                                arrayList9.add(gjVar2);
                            }
                        }
                        org.telegram.messenger.g0.h3(new ki.d3(ck.this, i13, tL_error, tLObject, cVar2, z13, str5, arrayList9, j15, j19, arrayList5, arrayList8));
                    }
                });
            }
        };
        this.f33616w = r02;
        if (z11 && !arrayList3.isEmpty()) {
            j12 = 0;
        } else {
            j12 = 350;
        }
        org.telegram.messenger.g0.i3(r02, j12);
        dkVar.K.setViewType(3);
    }

    public final void a0(java.util.ArrayList r12, java.util.ArrayList r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ck.a0(java.util.ArrayList, java.util.ArrayList, boolean):void");
    }

    @Override
    public final void f() {
        X(false);
        this.Y.Y();
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        View view;
        dk dkVar = this.Y;
        Context context = this.f33614r;
        if (i7 != 0) {
            int i10 = 2;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        view = new View(context);
                        view.setTag(-33024);
                        return i5.c.q(view, view, -1, -2);
                    }
                } else {
                    pz pzVar = new pz(context, dkVar.f33606a);
                    pzVar.setViewType(3);
                    pzVar.setIsSingleCell(true);
                    x3Var = pzVar;
                }
            }
            if (i7 == 1) {
                i10 = 1;
            }
            org.telegram.ui.Cells.g7 g7Var = new org.telegram.ui.Cells.g7(i10, context, dkVar.f33606a);
            g7Var.setDrawDownloadIcon(false);
            view = g7Var;
            return i5.c.q(view, view, -1, -2);
        }
        x3Var = new org.telegram.ui.Cells.x3(context, dkVar.f33606a);
        view = x3Var;
        return i5.c.q(view, view, -1, -2);
    }
}
