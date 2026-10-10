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
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rk extends nm0 {
    public long E;
    public long F;
    public int G;
    public String I;
    public String J;
    public String K;
    public boolean S;
    public int T;
    public boolean V;
    public final sk X;
    public final Context f30475r;
    public nk v;
    public ea f30477w;
    public long f30478x;
    public gg.p0 f30479y;
    public ArrayList f30476s = new ArrayList();
    public final org.telegram.ui.o10 H = new org.telegram.ui.o10(0, 0);
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final SparseArray O = new SparseArray();
    public final ArrayList P = new ArrayList();
    public final HashMap Q = new HashMap();
    public final ArrayList R = new ArrayList();
    public final AnimationNotificationsLocker U = new AnimationNotificationsLocker();
    public final org.telegram.ui.Cells.t6 W = new org.telegram.ui.Cells.t6(this, 6);

    public rk(sk skVar, Context context) {
        this.X = skVar;
        this.f30475r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(rm0 rm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 == 0) {
            return this.f30476s.size();
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
        if (i11 == 0 && this.f30476s.isEmpty()) {
            i12 = 0;
        }
        return size + i12;
    }

    @Override
    public final Object O(int i10, int i11) {
        ArrayList arrayList;
        int i12;
        if (i10 == 0) {
            if (i11 < this.f30476s.size()) {
                return this.f30476s.get(i11);
            }
            return null;
        }
        int i13 = i10 - 1;
        ArrayList arrayList2 = this.P;
        if (i13 < arrayList2.size() && (arrayList = (ArrayList) this.Q.get(arrayList2.get(i13))) != null) {
            if (i13 == 0 && this.f30476s.isEmpty()) {
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
            if ((i12 != 0 || !this.f30476s.isEmpty()) && i11 == 0) {
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
        String formatSectionDate;
        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
        if (v3Var == null) {
            Context context = this.f30475r;
            sk skVar = this.X;
            v3Var = new org.telegram.ui.Cells.v3(context, skVar.f30210a);
            v3Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.e7, skVar.f30210a) & (-218103809));
        }
        if (i10 != 0 && (i10 != 1 || !this.f30476s.isEmpty())) {
            int i11 = i10 - 1;
            ArrayList arrayList = this.P;
            if (i11 < arrayList.size()) {
                v3Var.setAlpha(1.0f);
                ArrayList arrayList2 = (ArrayList) this.Q.get((String) arrayList.get(i11));
                if (arrayList2 != null) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(0);
                    if (i11 == 0 && !this.f30476s.isEmpty()) {
                        formatSectionDate = LocaleController.getString(R.string.GlobalSearch);
                    } else {
                        formatSectionDate = LocaleController.formatSectionDate(messageObject.messageOwner.date);
                    }
                    v3Var.setText(formatSectionDate);
                }
            }
            return view;
        }
        v3Var.setAlpha(0.0f);
        return v3Var;
    }

    @Override
    public final boolean V(int i10, int i11, s4.d1 d1Var) {
        int i12 = d1Var.f47706f;
        if (i12 == 1 || i12 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.d1 d1Var) {
        String formatSectionDate;
        boolean z10;
        int i12 = i11;
        int i13 = d1Var.f47706f;
        View view = d1Var.f47702a;
        if (i13 != 2 && i13 != 3) {
            HashMap hashMap = this.Q;
            ArrayList arrayList = this.P;
            boolean z11 = false;
            if (i13 != 0) {
                if (i13 == 1 || i13 == 4) {
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                    if (i10 == 0) {
                        mk mkVar = (mk) O(S(i12), Q(i12));
                        int i14 = mkVar.f28825a;
                        if (i14 != 0) {
                            k7Var.d(mkVar.f28826b, mkVar.f28827c, null, null, i14, false);
                        } else {
                            k7Var.d(mkVar.f28826b, mkVar.f28827c, mkVar.d.toUpperCase().substring(0, Math.min(mkVar.d.length(), 4)), mkVar.f28828e, 0, false);
                        }
                        File file = mkVar.f28829f;
                        sk skVar = this.X;
                        if (file != null) {
                            k7Var.b(skVar.R.containsKey(file.toString()), !skVar.U);
                            return;
                        } else {
                            k7Var.b(false, !skVar.U);
                            return;
                        }
                    }
                    int i15 = i10 - 1;
                    if (i15 != 0 || !this.f30476s.isEmpty()) {
                        i12--;
                    }
                    ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i15));
                    if (arrayList2 != null) {
                        MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                        if (k7Var.getMessage() != null && k7Var.getMessage().getId() == messageObject.getId()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i12 != arrayList2.size() - 1 || (i15 == arrayList.size() - 1 && this.S)) {
                            z11 = true;
                        }
                        k7Var.c(messageObject, z11);
                        k7Var.getViewTreeObserver().addOnPreDrawListener(new qk(this, k7Var, messageObject, z10, 0));
                        return;
                    }
                    return;
                }
                return;
            }
            int i16 = i10 - 1;
            ArrayList arrayList3 = (ArrayList) hashMap.get((String) arrayList.get(i16));
            if (arrayList3 != null) {
                MessageObject messageObject2 = (MessageObject) arrayList3.get(0);
                if (i16 == 0 && !this.f30476s.isEmpty()) {
                    formatSectionDate = LocaleController.getString(R.string.GlobalSearch);
                } else {
                    formatSectionDate = LocaleController.formatSectionDate(messageObject2.messageOwner.date);
                }
                ((org.telegram.ui.Cells.v3) view).setText(formatSectionDate);
            }
        }
    }

    public final void Y(String str, boolean z10) {
        long j3;
        sk skVar = this.X;
        lk lkVar = skVar.v;
        hk hkVar = skVar.f30810r;
        ea eaVar = this.f30477w;
        if (eaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(eaVar);
            this.f30477w = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.f30476s.isEmpty()) {
                this.f30476s.clear();
            }
            if (hkVar.getAdapter() != lkVar) {
                hkVar.setAdapter(lkVar);
            }
            l();
        } else {
            ea eaVar2 = new ea(17, this, str);
            this.f30477w = eaVar2;
            AndroidUtilities.runOnUIThread(eaVar2, 300L);
        }
        if (!skVar.W && lkVar.d.isEmpty()) {
            int i10 = 0;
            long j10 = 0;
            long j11 = 0;
            long j12 = 0;
            while (true) {
                ArrayList arrayList = this.R;
                if (i10 < arrayList.size()) {
                    gg.p0 p0Var = (gg.p0) arrayList.get(i10);
                    int i11 = p0Var.d;
                    if (i11 == 4) {
                        TLObject tLObject = p0Var.f10764f;
                        if (tLObject instanceof TLRPC.User) {
                            j3 = ((TLRPC.User) tLObject).f20189id;
                        } else if (tLObject instanceof TLRPC.Chat) {
                            j3 = -((TLRPC.Chat) tLObject).f20042id;
                        }
                        j10 = j3;
                    } else if (i11 == 6) {
                        gg.n0 n0Var = p0Var.f10765g;
                        j11 = n0Var.f10737b;
                        j12 = n0Var.f10738c;
                    }
                    i10++;
                } else {
                    Z(j10, j11, j12, gg.r0.f10779a3[2], str, z10);
                    return;
                }
            }
        }
    }

    public final void Z(final long j3, final long j10, final long j11, gg.p0 p0Var, final String str, boolean z10) {
        final boolean z11;
        boolean z12;
        long j12;
        sk skVar = this.X;
        hk hkVar = skVar.f30810r;
        ai.e7 e7Var = skVar.L;
        Locale locale = Locale.ENGLISH;
        final String str2 = j3 + j10 + j11 + p0Var.d + str;
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
        this.f30479y = p0Var;
        this.f30478x = j3;
        this.E = j10;
        this.F = j11;
        nk nkVar = this.v;
        if (nkVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nkVar);
        }
        org.telegram.ui.Cells.t6 t6Var = this.W;
        AndroidUtilities.cancelRunOnUIThread(t6Var);
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
            e7Var.setVisibility(0);
            l();
            this.T++;
            if (hkVar.getPinnedHeader() != null) {
                hkVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.S = true;
        l();
        if (!z11) {
            t6Var.run();
            e7Var.e(true, !z10);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i10 = 1 + this.T;
        this.T = i10;
        final AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
        ?? r02 = new Runnable() {
            @Override
            public final void run() {
                long j13;
                boolean z13;
                long j14;
                long j15;
                int i11;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                long j16;
                final rk rkVar = rk.this;
                ArrayList arrayList4 = rkVar.N;
                long j17 = j3;
                int i12 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
                final String str4 = str;
                final AccountInstance accountInstance2 = accountInstance;
                long j18 = j10;
                long j19 = j11;
                boolean z14 = z11;
                ArrayList<Object> arrayList5 = null;
                if (i12 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.f20151q = str4;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = rkVar.f30479y.f10763e;
                    tL_messages_search.peer = accountInstance2.getMessagesController().getInputPeer(j17);
                    j13 = j17;
                    z13 = z14;
                    if (j18 > 0) {
                        tL_messages_search.min_date = (int) (j18 / 1000);
                    }
                    if (j19 > 0) {
                        tL_messages_search.max_date = (int) (j19 / 1000);
                    }
                    if (z13 && str4.equals(rkVar.J) && !arrayList4.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) hg.c.g(1, arrayList4)).getId();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    tL_messages_searchGlobal = tL_messages_search;
                    j14 = j18;
                } else {
                    j13 = j17;
                    z13 = z14;
                    if (!TextUtils.isEmpty(str4)) {
                        j15 = j19;
                        ArrayList<Object> arrayList6 = new ArrayList<>();
                        i11 = 20;
                        j14 = j18;
                        accountInstance2.getMessagesStorage().localSearch(0, str4, arrayList6, new ArrayList<>(), new ArrayList<>(), null, -1);
                        arrayList5 = arrayList6;
                    } else {
                        j14 = j18;
                        j15 = j19;
                        i11 = 20;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i11;
                    tL_messages_searchGlobal2.f20153q = str4;
                    tL_messages_searchGlobal2.filter = rkVar.f30479y.f10763e;
                    if (j14 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j14 / 1000);
                    }
                    if (j15 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j15 / 1000);
                    }
                    if (z13 && str4.equals(rkVar.J) && !arrayList4.isEmpty()) {
                        MessageObject messageObject = (MessageObject) hg.c.g(1, arrayList4);
                        tL_messages_searchGlobal2.offset_id = messageObject.getId();
                        tL_messages_searchGlobal2.offset_rate = rkVar.G;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        long j20 = peer.channel_id;
                        if (j20 == 0) {
                            j20 = peer.chat_id;
                            if (j20 == 0) {
                                j16 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = accountInstance2.getMessagesController().getInputPeer(j16);
                            }
                        }
                        j16 = -j20;
                        tL_messages_searchGlobal2.offset_peer = accountInstance2.getMessagesController().getInputPeer(j16);
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                }
                rkVar.J = str4;
                rkVar.I = str2;
                final ArrayList arrayList7 = new ArrayList();
                gg.r0.z1(rkVar.J, arrayList7);
                ConnectionsManager connectionsManager = accountInstance2.getConnectionsManager();
                final int i13 = i10;
                final boolean z15 = z13;
                final ArrayList<Object> arrayList8 = arrayList5;
                final long j21 = j13;
                final long j22 = j14;
                connectionsManager.sendRequest(tL_messages_searchGlobal, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList9 = new ArrayList();
                        AccountInstance accountInstance3 = accountInstance2;
                        String str5 = str4;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            int size = messages_messages.messages.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                MessageObject messageObject2 = new MessageObject(accountInstance3.getCurrentAccount(), messages_messages.messages.get(i14), false, true);
                                messageObject2.setQuery(str5);
                                arrayList9.add(messageObject2);
                            }
                        }
                        AndroidUtilities.runOnUIThread(new ei.t3(rk.this, i13, tL_error, tLObject, accountInstance3, z15, str5, arrayList9, j21, j22, arrayList8, arrayList7));
                    }
                });
            }
        };
        this.v = r02;
        if (z11 && !arrayList3.isEmpty()) {
            j12 = 0;
        } else {
            j12 = 350;
        }
        AndroidUtilities.runOnUIThread(r02, j12);
        skVar.J.setViewType(3);
    }

    public final void a0(java.util.ArrayList r12, java.util.ArrayList r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rk.a0(java.util.ArrayList, java.util.ArrayList, boolean):void");
    }

    @Override
    public final void l() {
        X(false);
        this.X.W();
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v3 v3Var;
        View view;
        sk skVar = this.X;
        Context context = this.f30475r;
        if (i10 != 0) {
            int i11 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        view = new View(context);
                        view.setTag(-33024);
                        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
                    }
                } else {
                    k10 k10Var = new k10(context, skVar.f30210a);
                    k10Var.setViewType(3);
                    k10Var.setIsSingleCell(true);
                    v3Var = k10Var;
                }
            }
            if (i10 == 1) {
                i11 = 1;
            }
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, i11, skVar.f30210a);
            k7Var.setDrawDownloadIcon(false);
            view = k7Var;
            return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
        }
        v3Var = new org.telegram.ui.Cells.v3(context, skVar.f30210a);
        view = v3Var;
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
