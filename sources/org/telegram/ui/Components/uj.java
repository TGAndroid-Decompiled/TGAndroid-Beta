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
public final class uj extends kj0 {
    public jg.o0 D;
    public long E;
    public long F;
    public int G;
    public String I;
    public String J;
    public String K;
    public boolean S;
    public int T;
    public boolean V;
    public final vj X;
    public final Context f38676r;
    public qj f38678w;
    public f f38679x;
    public long f38680y;
    public ArrayList f38677s = new ArrayList();
    public final org.telegram.ui.rz H = new org.telegram.ui.rz(0, 0);
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final SparseArray O = new SparseArray();
    public final ArrayList P = new ArrayList();
    public final HashMap Q = new HashMap();
    public final ArrayList R = new ArrayList();
    public final h2.f U = new h2.f((int[]) null);
    public final m.f3 W = new m.f3(this, 27);

    public uj(vj vjVar, Context context) {
        this.X = vjVar;
        this.f38676r = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        if (i7 == 0) {
            return this.f38677s.size();
        }
        int i10 = i7 - 1;
        ArrayList arrayList = this.P;
        int i11 = 1;
        if (i10 >= arrayList.size()) {
            return 1;
        }
        ArrayList arrayList2 = (ArrayList) this.Q.get(arrayList.get(i10));
        if (arrayList2 == null) {
            return 0;
        }
        int size = arrayList2.size();
        if (i10 == 0 && this.f38677s.isEmpty()) {
            i11 = 0;
        }
        return size + i11;
    }

    @Override
    public final Object O(int i7, int i10) {
        ArrayList arrayList;
        int i11;
        if (i7 == 0) {
            if (i10 < this.f38677s.size()) {
                return this.f38677s.get(i10);
            }
            return null;
        }
        int i12 = i7 - 1;
        ArrayList arrayList2 = this.P;
        if (i12 < arrayList2.size() && (arrayList = (ArrayList) this.Q.get(arrayList2.get(i12))) != null) {
            if (i12 == 0 && this.f38677s.isEmpty()) {
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
        if (i11 < this.P.size()) {
            if ((i11 != 0 || !this.f38677s.isEmpty()) && i10 == 0) {
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
    public final View T(int i7, View view) {
        String e02;
        org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
        if (x3Var == null) {
            Context context = this.f38676r;
            vj vjVar = this.X;
            x3Var = new org.telegram.ui.Cells.x3(context, vjVar.f38950a);
            x3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27868e7, vjVar.f38950a) & (-218103809));
        }
        if (i7 != 0 && (i7 != 1 || !this.f38677s.isEmpty())) {
            int i10 = i7 - 1;
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                x3Var.setAlpha(1.0f);
                ArrayList arrayList2 = (ArrayList) this.Q.get((String) arrayList.get(i10));
                if (arrayList2 != null) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(0);
                    if (i10 == 0 && !this.f38677s.isEmpty()) {
                        e02 = org.telegram.messenger.hd.M0(2131749534, null);
                    } else {
                        e02 = org.telegram.messenger.hd.e0(ijVar.f23237k.date, false);
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
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        int i11 = d1Var.f56931f;
        if (i11 == 1 || i11 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.d1 d1Var) {
        String e02;
        boolean z9;
        int i11 = i10;
        int i12 = d1Var.f56931f;
        View view = d1Var.f56927a;
        if (i12 != 2 && i12 != 3) {
            HashMap hashMap = this.Q;
            ArrayList arrayList = this.P;
            boolean z10 = false;
            if (i12 != 0) {
                if (i12 == 1 || i12 == 4) {
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                    if (i7 == 0) {
                        pj pjVar = (pj) O(S(i11), Q(i11));
                        int i13 = pjVar.f37027a;
                        if (i13 != 0) {
                            h7Var.d(pjVar.f37028b, pjVar.f37029c, null, null, i13, false);
                        } else {
                            h7Var.d(pjVar.f37028b, pjVar.f37029c, pjVar.d.toUpperCase().substring(0, Math.min(pjVar.d.length(), 4)), pjVar.f37030e, 0, false);
                        }
                        File file = pjVar.f37031f;
                        vj vjVar = this.X;
                        if (file != null) {
                            h7Var.b(vjVar.R.containsKey(file.toString()), !vjVar.U);
                            return;
                        } else {
                            h7Var.b(false, !vjVar.U);
                            return;
                        }
                    }
                    int i14 = i7 - 1;
                    if (i14 != 0 || !this.f38677s.isEmpty()) {
                        i11--;
                    }
                    ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i14));
                    if (arrayList2 != null) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(i11);
                        if (h7Var.getMessage() != null && h7Var.getMessage().f1() == ijVar.f1()) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (i11 != arrayList2.size() - 1 || (i14 == arrayList.size() - 1 && this.S)) {
                            z10 = true;
                        }
                        h7Var.c(ijVar, z10);
                        h7Var.getViewTreeObserver().addOnPreDrawListener(new tj(this, h7Var, ijVar, z9, 0));
                        return;
                    }
                    return;
                }
                return;
            }
            int i15 = i7 - 1;
            ArrayList arrayList3 = (ArrayList) hashMap.get((String) arrayList.get(i15));
            if (arrayList3 != null) {
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList3.get(0);
                if (i15 == 0 && !this.f38677s.isEmpty()) {
                    e02 = org.telegram.messenger.hd.M0(2131749534, null);
                } else {
                    e02 = org.telegram.messenger.hd.e0(ijVar2.f23237k.date, false);
                }
                ((org.telegram.ui.Cells.x3) view).setText(e02);
            }
        }
    }

    public final void Y(String str, boolean z9) {
        long j3;
        vj vjVar = this.X;
        oj ojVar = vjVar.f38969w;
        kj kjVar = vjVar.f38967r;
        f fVar = this.f38679x;
        if (fVar != null) {
            org.telegram.messenger.g0.r(fVar);
            this.f38679x = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.f38677s.isEmpty()) {
                this.f38677s.clear();
            }
            if (kjVar.getAdapter() != ojVar) {
                kjVar.setAdapter(ojVar);
            }
            f();
        } else {
            f fVar2 = new f(19, this, str);
            this.f38679x = fVar2;
            org.telegram.messenger.g0.i3(fVar2, 300L);
        }
        if (!vjVar.W && ojVar.f36735f.isEmpty()) {
            int i7 = 0;
            long j10 = 0;
            long j11 = 0;
            long j12 = 0;
            while (true) {
                ArrayList arrayList = this.R;
                if (i7 < arrayList.size()) {
                    jg.o0 o0Var = (jg.o0) arrayList.get(i7);
                    int i10 = o0Var.d;
                    if (i10 == 4) {
                        TLObject tLObject = o0Var.f16871f;
                        if (tLObject instanceof TLRPC.User) {
                            j3 = ((TLRPC.User) tLObject).f27101id;
                        } else if (tLObject instanceof TLRPC.Chat) {
                            j3 = -((TLRPC.Chat) tLObject).f26952id;
                        }
                        j10 = j3;
                    } else if (i10 == 6) {
                        jg.m0 m0Var = o0Var.f16872g;
                        j11 = m0Var.f16836b;
                        j12 = m0Var.f16837c;
                    }
                    i7++;
                } else {
                    Z(j10, j11, j12, jg.q0.j3[2], str, z9);
                    return;
                }
            }
        }
    }

    public final void Z(final long j3, final long j10, final long j11, jg.o0 o0Var, final String str, boolean z9) {
        final boolean z10;
        boolean z11;
        long j12;
        vj vjVar = this.X;
        kj kjVar = vjVar.f38967r;
        di.f5 f5Var = vjVar.L;
        Locale locale = Locale.ENGLISH;
        final String str2 = j3 + j10 + j11 + o0Var.d + str;
        String str3 = this.I;
        if (str3 != null && str3.equals(str2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && z9) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.D = o0Var;
        this.f38680y = j3;
        this.E = j10;
        this.F = j11;
        qj qjVar = this.f38678w;
        if (qjVar != null) {
            org.telegram.messenger.g0.r(qjVar);
        }
        m.f3 f3Var = this.W;
        org.telegram.messenger.g0.r(f3Var);
        if (z10 && z9) {
            return;
        }
        ArrayList arrayList = this.M;
        ArrayList arrayList2 = this.L;
        ArrayList arrayList3 = this.N;
        if (z11) {
            arrayList3.clear();
            this.P.clear();
            this.Q.clear();
            this.S = true;
            f5Var.setVisibility(0);
            f();
            this.T++;
            if (kjVar.getPinnedHeader() != null) {
                kjVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.S = true;
        f();
        if (!z10) {
            f3Var.run();
            f5Var.e(true, !z9);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i7 = 1 + this.T;
        this.T = i7;
        final org.telegram.messenger.c a10 = org.telegram.messenger.c.a(org.telegram.messenger.p10.f24459s0);
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
                int i11 = cVar.f21723a;
                final uj ujVar = uj.this;
                ArrayList arrayList6 = ujVar.N;
                final long j15 = j3;
                int i12 = (j15 > 0L ? 1 : (j15 == 0L ? 0 : -1));
                final String str4 = str;
                long j16 = j10;
                long j17 = j11;
                final boolean z12 = z10;
                if (i12 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.f27063q = str4;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = ujVar.D.f16870e;
                    tL_messages_search.peer = org.telegram.messenger.qp.s1(i11).j1(j15);
                    if (j16 > 0) {
                        tL_messages_search.min_date = (int) (j16 / 1000);
                    }
                    if (j17 > 0) {
                        tL_messages_search.max_date = (int) (j17 / 1000);
                    }
                    if (z12 && str4.equals(ujVar.J) && !arrayList6.isEmpty()) {
                        tL_messages_search.offset_id = ((org.telegram.messenger.ij) jg.g.i(1, arrayList6)).f1();
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
                        org.telegram.messenger.yr.a0(i11).M0(0, str4, arrayList7, new ArrayList(), new ArrayList(), null, -1);
                        arrayList4 = arrayList7;
                    } else {
                        i10 = 20;
                        j13 = j16;
                        arrayList4 = null;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i10;
                    tL_messages_searchGlobal2.f27065q = str4;
                    tL_messages_searchGlobal2.filter = ujVar.D.f16870e;
                    if (j13 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j13 / 1000);
                    }
                    if (j17 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j17 / 1000);
                    }
                    if (z12 && str4.equals(ujVar.J) && !arrayList6.isEmpty()) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, arrayList6);
                        tL_messages_searchGlobal2.offset_id = ijVar.f1();
                        tL_messages_searchGlobal2.offset_rate = ujVar.G;
                        TLRPC.Peer peer = ijVar.f23237k.peer_id;
                        long j18 = peer.channel_id;
                        if (j18 == 0) {
                            j18 = peer.chat_id;
                            if (j18 == 0) {
                                j14 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.qp.s1(i11).j1(j14);
                            }
                        }
                        j14 = -j18;
                        tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.qp.s1(i11).j1(j14);
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    arrayList5 = arrayList4;
                }
                ujVar.J = str4;
                ujVar.I = str2;
                final ArrayList arrayList8 = new ArrayList();
                jg.q0.B1(ujVar.J, arrayList8);
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
                                org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(cVar2.f21723a, messages_messages.messages.get(i14), false, true);
                                ijVar2.L5(str5, true);
                                arrayList9.add(ijVar2);
                            }
                        }
                        org.telegram.messenger.g0.h3(new hi.g3(uj.this, i13, tL_error, tLObject, cVar2, z12, str5, arrayList9, j15, j19, arrayList5, arrayList8));
                    }
                });
            }
        };
        this.f38678w = r02;
        if (z10 && !arrayList3.isEmpty()) {
            j12 = 0;
        } else {
            j12 = 350;
        }
        org.telegram.messenger.g0.i3(r02, j12);
        vjVar.J.setViewType(3);
    }

    public final void a0(java.util.ArrayList r12, java.util.ArrayList r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uj.a0(java.util.ArrayList, java.util.ArrayList, boolean):void");
    }

    @Override
    public final void f() {
        X(false);
        this.X.X();
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        View view;
        vj vjVar = this.X;
        Context context = this.f38676r;
        if (i7 != 0) {
            int i10 = 2;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        view = new View(context);
                        view.setTag(-33024);
                        return jg.g.r(view, view, -1, -2);
                    }
                } else {
                    lz lzVar = new lz(context, vjVar.f38950a);
                    lzVar.setViewType(3);
                    lzVar.setIsSingleCell(true);
                    x3Var = lzVar;
                }
            }
            if (i7 == 1) {
                i10 = 1;
            }
            org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(i10, context, vjVar.f38950a);
            h7Var.setDrawDownloadIcon(false);
            view = h7Var;
            return jg.g.r(view, view, -1, -2);
        }
        x3Var = new org.telegram.ui.Cells.x3(context, vjVar.f38950a);
        view = x3Var;
        return jg.g.r(view, view, -1, -2);
    }
}
