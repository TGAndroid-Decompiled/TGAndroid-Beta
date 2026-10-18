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
public final class mk extends em0 {
    public long E;
    public long F;
    public int G;
    public String I;
    public String J;
    public String K;
    public boolean S;
    public int T;
    public boolean V;
    public final nk X;
    public final Context f28532r;
    public ik v;
    public ee f28534w;
    public long f28535x;
    public hg.o0 f28536y;
    public ArrayList f28533s = new ArrayList();
    public final org.telegram.ui.y00 H = new org.telegram.ui.y00(0, 0);
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final SparseArray O = new SparseArray();
    public final ArrayList P = new ArrayList();
    public final HashMap Q = new HashMap();
    public final ArrayList R = new ArrayList();
    public final AnimationNotificationsLocker U = new AnimationNotificationsLocker();
    public final org.telegram.ui.Cells.k7 W = new org.telegram.ui.Cells.k7(this, 5);

    public mk(nk nkVar, Context context) {
        this.X = nkVar;
        this.f28532r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(im0 im0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 == 0) {
            return this.f28533s.size();
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
        if (i11 == 0 && this.f28533s.isEmpty()) {
            i12 = 0;
        }
        return size + i12;
    }

    @Override
    public final Object O(int i10, int i11) {
        ArrayList arrayList;
        int i12;
        if (i10 == 0) {
            if (i11 < this.f28533s.size()) {
                return this.f28533s.get(i11);
            }
            return null;
        }
        int i13 = i10 - 1;
        ArrayList arrayList2 = this.P;
        if (i13 < arrayList2.size() && (arrayList = (ArrayList) this.Q.get(arrayList2.get(i13))) != null) {
            if (i13 == 0 && this.f28533s.isEmpty()) {
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
            if ((i12 != 0 || !this.f28533s.isEmpty()) && i11 == 0) {
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
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
        if (u3Var == null) {
            Context context = this.f28532r;
            nk nkVar = this.X;
            u3Var = new org.telegram.ui.Cells.u3(context, nkVar.f28237a);
            u3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.e7, nkVar.f28237a) & (-218103809));
        }
        if (i10 != 0 && (i10 != 1 || !this.f28533s.isEmpty())) {
            int i11 = i10 - 1;
            ArrayList arrayList = this.P;
            if (i11 < arrayList.size()) {
                u3Var.setAlpha(1.0f);
                ArrayList arrayList2 = (ArrayList) this.Q.get((String) arrayList.get(i11));
                if (arrayList2 != null) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(0);
                    if (i11 == 0 && !this.f28533s.isEmpty()) {
                        formatSectionDate = LocaleController.getString(R.string.GlobalSearch);
                    } else {
                        formatSectionDate = LocaleController.formatSectionDate(messageObject.messageOwner.date);
                    }
                    u3Var.setText(formatSectionDate);
                }
            }
            return view;
        }
        u3Var.setAlpha(0.0f);
        return u3Var;
    }

    @Override
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        int i12 = b1Var.f45913f;
        if (i12 == 1 || i12 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.b1 b1Var) {
        String formatSectionDate;
        boolean z10;
        int i12 = i11;
        int i13 = b1Var.f45913f;
        View view = b1Var.f45910a;
        if (i13 != 2 && i13 != 3) {
            HashMap hashMap = this.Q;
            ArrayList arrayList = this.P;
            boolean z11 = false;
            if (i13 != 0) {
                if (i13 == 1 || i13 == 4) {
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                    if (i10 == 0) {
                        hk hkVar = (hk) O(S(i12), Q(i12));
                        int i14 = hkVar.f26894a;
                        if (i14 != 0) {
                            i7Var.d(hkVar.f26895b, hkVar.f26896c, null, null, i14, false);
                        } else {
                            i7Var.d(hkVar.f26895b, hkVar.f26896c, hkVar.d.toUpperCase().substring(0, Math.min(hkVar.d.length(), 4)), hkVar.e, 0, false);
                        }
                        File file = hkVar.f26897f;
                        nk nkVar = this.X;
                        if (file != null) {
                            i7Var.b(nkVar.R.containsKey(file.toString()), !nkVar.U);
                            return;
                        } else {
                            i7Var.b(false, !nkVar.U);
                            return;
                        }
                    }
                    int i15 = i10 - 1;
                    if (i15 != 0 || !this.f28533s.isEmpty()) {
                        i12--;
                    }
                    ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i15));
                    if (arrayList2 != null) {
                        MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                        if (i7Var.getMessage() != null && i7Var.getMessage().getId() == messageObject.getId()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i12 != arrayList2.size() - 1 || (i15 == arrayList.size() - 1 && this.S)) {
                            z11 = true;
                        }
                        i7Var.c(messageObject, z11);
                        i7Var.getViewTreeObserver().addOnPreDrawListener(new lk(this, i7Var, messageObject, z10, 0));
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
                if (i16 == 0 && !this.f28533s.isEmpty()) {
                    formatSectionDate = LocaleController.getString(R.string.GlobalSearch);
                } else {
                    formatSectionDate = LocaleController.formatSectionDate(messageObject2.messageOwner.date);
                }
                ((org.telegram.ui.Cells.u3) view).setText(formatSectionDate);
            }
        }
    }

    public final void Y(String str, boolean z10) {
        long j10;
        nk nkVar = this.X;
        gk gkVar = nkVar.v;
        ck ckVar = nkVar.f28774r;
        ee eeVar = this.f28534w;
        if (eeVar != null) {
            AndroidUtilities.cancelRunOnUIThread(eeVar);
            this.f28534w = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.f28533s.isEmpty()) {
                this.f28533s.clear();
            }
            if (ckVar.getAdapter() != gkVar) {
                ckVar.setAdapter(gkVar);
            }
            l();
        } else {
            ee eeVar2 = new ee(12, this, str);
            this.f28534w = eeVar2;
            AndroidUtilities.runOnUIThread(eeVar2, 300L);
        }
        if (!nkVar.W && gkVar.d.isEmpty()) {
            int i10 = 0;
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            while (true) {
                ArrayList arrayList = this.R;
                if (i10 < arrayList.size()) {
                    hg.o0 o0Var = (hg.o0) arrayList.get(i10);
                    int i11 = o0Var.d;
                    if (i11 == 4) {
                        TLObject tLObject = o0Var.f12005f;
                        if (tLObject instanceof TLRPC.User) {
                            j10 = ((TLRPC.User) tLObject).f20419id;
                        } else if (tLObject instanceof TLRPC.Chat) {
                            j10 = -((TLRPC.Chat) tLObject).f20272id;
                        }
                        j11 = j10;
                    } else if (i11 == 6) {
                        hg.m0 m0Var = o0Var.f12006g;
                        j12 = m0Var.f11979b;
                        j13 = m0Var.f11980c;
                    }
                    i10++;
                } else {
                    Z(j11, j12, j13, hg.q0.f12016a3[2], str, z10);
                    return;
                }
            }
        }
    }

    public final void Z(final long j10, final long j11, final long j12, hg.o0 o0Var, final String str, boolean z10) {
        final boolean z11;
        boolean z12;
        long j13;
        nk nkVar = this.X;
        ck ckVar = nkVar.f28774r;
        ci.n5 n5Var = nkVar.L;
        Locale locale = Locale.ENGLISH;
        final String str2 = j10 + j11 + j12 + o0Var.d + str;
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
        this.f28536y = o0Var;
        this.f28535x = j10;
        this.E = j11;
        this.F = j12;
        ik ikVar = this.v;
        if (ikVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ikVar);
        }
        org.telegram.ui.Cells.k7 k7Var = this.W;
        AndroidUtilities.cancelRunOnUIThread(k7Var);
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
            n5Var.setVisibility(0);
            l();
            this.T++;
            if (ckVar.getPinnedHeader() != null) {
                ckVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.S = true;
        l();
        if (!z11) {
            k7Var.run();
            n5Var.e(true, !z10);
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
                long j14;
                boolean z13;
                long j15;
                long j16;
                int i11;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                long j17;
                final mk mkVar = mk.this;
                ArrayList arrayList4 = mkVar.N;
                long j18 = j10;
                int i12 = (j18 > 0L ? 1 : (j18 == 0L ? 0 : -1));
                final String str4 = str;
                final AccountInstance accountInstance2 = accountInstance;
                long j19 = j11;
                long j20 = j12;
                boolean z14 = z11;
                ArrayList<Object> arrayList5 = null;
                if (i12 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.f20381q = str4;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = mkVar.f28536y.e;
                    tL_messages_search.peer = accountInstance2.getMessagesController().getInputPeer(j18);
                    j14 = j18;
                    z13 = z14;
                    if (j19 > 0) {
                        tL_messages_search.min_date = (int) (j19 / 1000);
                    }
                    if (j20 > 0) {
                        tL_messages_search.max_date = (int) (j20 / 1000);
                    }
                    if (z13 && str4.equals(mkVar.J) && !arrayList4.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) i2.d.h(1, arrayList4)).getId();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    tL_messages_searchGlobal = tL_messages_search;
                    j15 = j19;
                } else {
                    j14 = j18;
                    z13 = z14;
                    if (!TextUtils.isEmpty(str4)) {
                        j16 = j20;
                        ArrayList<Object> arrayList6 = new ArrayList<>();
                        i11 = 20;
                        j15 = j19;
                        accountInstance2.getMessagesStorage().localSearch(0, str4, arrayList6, new ArrayList<>(), new ArrayList<>(), null, -1);
                        arrayList5 = arrayList6;
                    } else {
                        j15 = j19;
                        j16 = j20;
                        i11 = 20;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i11;
                    tL_messages_searchGlobal2.f20383q = str4;
                    tL_messages_searchGlobal2.filter = mkVar.f28536y.e;
                    if (j15 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j15 / 1000);
                    }
                    if (j16 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j16 / 1000);
                    }
                    if (z13 && str4.equals(mkVar.J) && !arrayList4.isEmpty()) {
                        MessageObject messageObject = (MessageObject) i2.d.h(1, arrayList4);
                        tL_messages_searchGlobal2.offset_id = messageObject.getId();
                        tL_messages_searchGlobal2.offset_rate = mkVar.G;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        long j21 = peer.channel_id;
                        if (j21 == 0) {
                            j21 = peer.chat_id;
                            if (j21 == 0) {
                                j17 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = accountInstance2.getMessagesController().getInputPeer(j17);
                            }
                        }
                        j17 = -j21;
                        tL_messages_searchGlobal2.offset_peer = accountInstance2.getMessagesController().getInputPeer(j17);
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                }
                mkVar.J = str4;
                mkVar.I = str2;
                final ArrayList arrayList7 = new ArrayList();
                hg.q0.z1(mkVar.J, arrayList7);
                ConnectionsManager connectionsManager = accountInstance2.getConnectionsManager();
                final int i13 = i10;
                final boolean z15 = z13;
                final ArrayList<Object> arrayList8 = arrayList5;
                final long j22 = j14;
                final long j23 = j15;
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
                        AndroidUtilities.runOnUIThread(new gi.j3(mk.this, i13, tL_error, tLObject, accountInstance3, z15, str5, arrayList9, j22, j23, arrayList8, arrayList7));
                    }
                });
            }
        };
        this.v = r02;
        if (z11 && !arrayList3.isEmpty()) {
            j13 = 0;
        } else {
            j13 = 350;
        }
        AndroidUtilities.runOnUIThread(r02, j13);
        nkVar.J.setViewType(3);
    }

    public final void a0(java.util.ArrayList r12, java.util.ArrayList r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mk.a0(java.util.ArrayList, java.util.ArrayList, boolean):void");
    }

    @Override
    public final void l() {
        X(false);
        this.X.W();
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        View view;
        nk nkVar = this.X;
        Context context = this.f28532r;
        if (i10 != 0) {
            int i11 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        view = new View(context);
                        view.setTag(-33024);
                        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
                    }
                } else {
                    b10 b10Var = new b10(context, nkVar.f28237a);
                    b10Var.setViewType(3);
                    b10Var.setIsSingleCell(true);
                    u3Var = b10Var;
                }
            }
            if (i10 == 1) {
                i11 = 1;
            }
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, i11, nkVar.f28237a);
            i7Var.setDrawDownloadIcon(false);
            view = i7Var;
            return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
        }
        u3Var = new org.telegram.ui.Cells.u3(context, nkVar.f28237a);
        view = u3Var;
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
