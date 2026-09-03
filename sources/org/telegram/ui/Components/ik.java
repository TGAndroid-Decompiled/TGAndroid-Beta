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
public final class ik extends ol0 {
    public long B;
    public long C;
    public int D;
    public String F;
    public String G;
    public String H;
    public boolean P;
    public int Q;
    public boolean S;
    public final jk U;
    public final Context f27844r;
    public dk v;
    public org.telegram.ui.mp f27846w;
    public long f27847x;
    public uf.e0 f27848y;
    public ArrayList f27845s = new ArrayList();
    public final org.telegram.ui.l10 E = new org.telegram.ui.l10(0, 0);
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final ArrayList K = new ArrayList();
    public final SparseArray L = new SparseArray();
    public final ArrayList M = new ArrayList();
    public final HashMap N = new HashMap();
    public final ArrayList O = new ArrayList();
    public final AnimationNotificationsLocker R = new AnimationNotificationsLocker();
    public final m2.b T = new m2.b(this, 15);

    public ik(jk jkVar, Context context) {
        this.U = jkVar;
        this.f27844r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(sl0 sl0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 == 0) {
            return this.f27845s.size();
        }
        int i11 = i10 - 1;
        ArrayList arrayList = this.M;
        int i12 = 1;
        if (i11 >= arrayList.size()) {
            return 1;
        }
        ArrayList arrayList2 = (ArrayList) this.N.get(arrayList.get(i11));
        if (arrayList2 == null) {
            return 0;
        }
        int size = arrayList2.size();
        if (i11 == 0 && this.f27845s.isEmpty()) {
            i12 = 0;
        }
        return size + i12;
    }

    @Override
    public final Object O(int i10, int i11) {
        ArrayList arrayList;
        int i12;
        if (i10 == 0) {
            if (i11 < this.f27845s.size()) {
                return this.f27845s.get(i11);
            }
            return null;
        }
        int i13 = i10 - 1;
        ArrayList arrayList2 = this.M;
        if (i13 < arrayList2.size() && (arrayList = (ArrayList) this.N.get(arrayList2.get(i13))) != null) {
            if (i13 == 0 && this.f27845s.isEmpty()) {
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
        if (i12 < this.M.size()) {
            if ((i12 != 0 || !this.f27845s.isEmpty()) && i11 == 0) {
                return 0;
            }
            return 4;
        }
        return 2;
    }

    @Override
    public final int R() {
        ArrayList arrayList = this.M;
        if (arrayList.isEmpty()) {
            return 2;
        }
        return arrayList.size() + (!this.S ? 1 : 0) + 2;
    }

    @Override
    public final View T(int i10, View view) {
        String formatSectionDate;
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
        if (u3Var == null) {
            Context context = this.f27844r;
            jk jkVar = this.U;
            u3Var = new org.telegram.ui.Cells.u3(context, jkVar.f26589a);
            u3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21680e7, jkVar.f26589a) & (-218103809));
        }
        if (i10 != 0 && (i10 != 1 || !this.f27845s.isEmpty())) {
            int i11 = i10 - 1;
            ArrayList arrayList = this.M;
            if (i11 < arrayList.size()) {
                u3Var.setAlpha(1.0f);
                ArrayList arrayList2 = (ArrayList) this.N.get((String) arrayList.get(i11));
                if (arrayList2 != null) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(0);
                    if (i11 == 0 && !this.f27845s.isEmpty()) {
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
    public final boolean V(int i10, int i11, f2.m1 m1Var) {
        int i12 = m1Var.f5879f;
        if (i12 == 1 || i12 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, f2.m1 m1Var) {
        String formatSectionDate;
        boolean z4;
        int i12 = i11;
        int i13 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i13 != 2 && i13 != 3) {
            HashMap hashMap = this.N;
            ArrayList arrayList = this.M;
            boolean z10 = false;
            if (i13 != 0) {
                if (i13 == 1 || i13 == 4) {
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                    if (i10 == 0) {
                        ck ckVar = (ck) O(S(i12), Q(i12));
                        int i14 = ckVar.f25966a;
                        if (i14 != 0) {
                            i7Var.d(ckVar.f25967b, ckVar.f25968c, null, null, i14, false);
                        } else {
                            i7Var.d(ckVar.f25967b, ckVar.f25968c, ckVar.d.toUpperCase().substring(0, Math.min(ckVar.d.length(), 4)), ckVar.f25969e, 0, false);
                        }
                        File file = ckVar.f25970f;
                        jk jkVar = this.U;
                        if (file != null) {
                            i7Var.b(jkVar.O.containsKey(file.toString()), !jkVar.R);
                            return;
                        } else {
                            i7Var.b(false, !jkVar.R);
                            return;
                        }
                    }
                    int i15 = i10 - 1;
                    if (i15 != 0 || !this.f27845s.isEmpty()) {
                        i12--;
                    }
                    ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i15));
                    if (arrayList2 != null) {
                        MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                        if (i7Var.getMessage() != null && i7Var.getMessage().getId() == messageObject.getId()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (i12 != arrayList2.size() - 1 || (i15 == arrayList.size() - 1 && this.P)) {
                            z10 = true;
                        }
                        i7Var.c(messageObject, z10);
                        i7Var.getViewTreeObserver().addOnPreDrawListener(new hk(this, i7Var, messageObject, z4, 0));
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
                if (i16 == 0 && !this.f27845s.isEmpty()) {
                    formatSectionDate = LocaleController.getString(R.string.GlobalSearch);
                } else {
                    formatSectionDate = LocaleController.formatSectionDate(messageObject2.messageOwner.date);
                }
                ((org.telegram.ui.Cells.u3) view).setText(formatSectionDate);
            }
        }
    }

    public final void Y(String str, boolean z4) {
        long j10;
        jk jkVar = this.U;
        bk bkVar = jkVar.v;
        xj xjVar = jkVar.f28132r;
        org.telegram.ui.mp mpVar = this.f27846w;
        if (mpVar != null) {
            AndroidUtilities.cancelRunOnUIThread(mpVar);
            this.f27846w = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.f27845s.isEmpty()) {
                this.f27845s.clear();
            }
            if (xjVar.getAdapter() != bkVar) {
                xjVar.setAdapter(bkVar);
            }
            l();
        } else {
            org.telegram.ui.mp mpVar2 = new org.telegram.ui.mp(24, this, str);
            this.f27846w = mpVar2;
            AndroidUtilities.runOnUIThread(mpVar2, 300L);
        }
        if (!jkVar.T && bkVar.d.isEmpty()) {
            int i10 = 0;
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            while (true) {
                ArrayList arrayList = this.O;
                if (i10 < arrayList.size()) {
                    uf.e0 e0Var = (uf.e0) arrayList.get(i10);
                    int i11 = e0Var.d;
                    if (i11 == 4) {
                        TLObject tLObject = e0Var.f48586f;
                        if (tLObject instanceof TLRPC.User) {
                            j10 = ((TLRPC.User) tLObject).f20992id;
                        } else if (tLObject instanceof TLRPC.Chat) {
                            j10 = -((TLRPC.Chat) tLObject).f20845id;
                        }
                        j11 = j10;
                    } else if (i11 == 6) {
                        uf.c0 c0Var = e0Var.f48587g;
                        j12 = c0Var.f48553b;
                        j13 = c0Var.f48554c;
                    }
                    i10++;
                } else {
                    Z(j11, j12, j13, uf.g0.Z2[2], str, z4);
                    return;
                }
            }
        }
    }

    public final void Z(final long j10, final long j11, final long j12, uf.e0 e0Var, final String str, boolean z4) {
        final boolean z10;
        boolean z11;
        long j13;
        jk jkVar = this.U;
        xj xjVar = jkVar.f28132r;
        oh.z4 z4Var = jkVar.I;
        Locale locale = Locale.ENGLISH;
        final String str2 = j10 + j11 + j12 + e0Var.d + str;
        String str3 = this.F;
        if (str3 != null && str3.equals(str2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && z4) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27848y = e0Var;
        this.f27847x = j10;
        this.B = j11;
        this.C = j12;
        dk dkVar = this.v;
        if (dkVar != null) {
            AndroidUtilities.cancelRunOnUIThread(dkVar);
        }
        m2.b bVar = this.T;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        if (z10 && z4) {
            return;
        }
        ArrayList arrayList = this.J;
        ArrayList arrayList2 = this.I;
        ArrayList arrayList3 = this.K;
        if (z11) {
            arrayList3.clear();
            this.M.clear();
            this.N.clear();
            this.P = true;
            z4Var.setVisibility(0);
            l();
            this.Q++;
            if (xjVar.getPinnedHeader() != null) {
                xjVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.P = true;
        l();
        if (!z10) {
            bVar.run();
            z4Var.e(true, !z4);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i10 = 1 + this.Q;
        this.Q = i10;
        final AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
        ?? r02 = new Runnable() {
            @Override
            public final void run() {
                String str4;
                long j14;
                int i11;
                ArrayList<Object> arrayList4;
                long j15;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final ik ikVar = ik.this;
                ArrayList arrayList5 = ikVar.K;
                final long j16 = j10;
                String str5 = str;
                final AccountInstance accountInstance2 = accountInstance;
                final long j17 = j11;
                long j18 = j12;
                final boolean z12 = z10;
                if (j16 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.f20954q = str5;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = ikVar.f27848y.f48585e;
                    tL_messages_search.peer = accountInstance2.getMessagesController().getInputPeer(j16);
                    if (j17 > 0) {
                        tL_messages_search.min_date = (int) (j17 / 1000);
                    }
                    if (j18 > 0) {
                        tL_messages_search.max_date = (int) (j18 / 1000);
                    }
                    if (z12 && str5.equals(ikVar.G) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) l.d.i(1, arrayList5)).getId();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    str4 = str5;
                    arrayList4 = null;
                    tL_messages_searchGlobal = tL_messages_search;
                } else {
                    if (!TextUtils.isEmpty(str5)) {
                        ArrayList<Object> arrayList6 = new ArrayList<>();
                        j14 = j18;
                        str4 = str5;
                        i11 = 20;
                        accountInstance2.getMessagesStorage().localSearch(0, str4, arrayList6, new ArrayList<>(), new ArrayList<>(), null, -1);
                        arrayList4 = arrayList6;
                    } else {
                        str4 = str5;
                        j14 = j18;
                        i11 = 20;
                        arrayList4 = null;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i11;
                    tL_messages_searchGlobal2.f20956q = str4;
                    tL_messages_searchGlobal2.filter = ikVar.f27848y.f48585e;
                    if (j17 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j17 / 1000);
                    }
                    if (j14 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j14 / 1000);
                    }
                    if (z12 && str4.equals(ikVar.G) && !arrayList5.isEmpty()) {
                        MessageObject messageObject = (MessageObject) l.d.i(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = messageObject.getId();
                        tL_messages_searchGlobal2.offset_rate = ikVar.D;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        long j19 = peer.channel_id;
                        if (j19 == 0) {
                            j19 = peer.chat_id;
                            if (j19 == 0) {
                                j15 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = accountInstance2.getMessagesController().getInputPeer(j15);
                                tL_messages_searchGlobal = tL_messages_searchGlobal2;
                            }
                        }
                        j15 = -j19;
                        tL_messages_searchGlobal2.offset_peer = accountInstance2.getMessagesController().getInputPeer(j15);
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                }
                ikVar.G = str4;
                ikVar.F = str2;
                final ArrayList arrayList7 = new ArrayList();
                uf.g0.x1(ikVar.G, arrayList7);
                ConnectionsManager connectionsManager = accountInstance2.getConnectionsManager();
                final int i12 = i10;
                final String str6 = str4;
                final ArrayList<Object> arrayList8 = arrayList4;
                connectionsManager.sendRequest(tL_messages_searchGlobal, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList9 = new ArrayList();
                        AccountInstance accountInstance3 = accountInstance2;
                        String str7 = str6;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            int size = messages_messages.messages.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                MessageObject messageObject2 = new MessageObject(accountInstance3.getCurrentAccount(), messages_messages.messages.get(i13), false, true);
                                messageObject2.setQuery(str7);
                                arrayList9.add(messageObject2);
                            }
                        }
                        AndroidUtilities.runOnUIThread(new fk(ik.this, i12, tL_error, tLObject, accountInstance3, z12, str7, arrayList9, j16, j17, arrayList8, arrayList7));
                    }
                });
            }
        };
        this.v = r02;
        if (z10 && !arrayList3.isEmpty()) {
            j13 = 0;
        } else {
            j13 = 350;
        }
        AndroidUtilities.runOnUIThread(r02, j13);
        jkVar.G.setViewType(3);
    }

    public final void a0(java.util.ArrayList r12, java.util.ArrayList r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ik.a0(java.util.ArrayList, java.util.ArrayList, boolean):void");
    }

    @Override
    public final void l() {
        X(false);
        this.U.T();
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        View view;
        jk jkVar = this.U;
        Context context = this.f27844r;
        if (i10 != 0) {
            int i11 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        view = new View(context);
                        view.setTag(-33024);
                        return org.telegram.ui.yh.o(view, view, -1, -2);
                    }
                } else {
                    u00 u00Var = new u00(context, jkVar.f26589a);
                    u00Var.setViewType(3);
                    u00Var.setIsSingleCell(true);
                    u3Var = u00Var;
                }
            }
            if (i10 == 1) {
                i11 = 1;
            }
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, i11, jkVar.f26589a);
            i7Var.setDrawDownloadIcon(false);
            view = i7Var;
            return org.telegram.ui.yh.o(view, view, -1, -2);
        }
        u3Var = new org.telegram.ui.Cells.u3(context, jkVar.f26589a);
        view = u3Var;
        return org.telegram.ui.yh.o(view, view, -1, -2);
    }
}
