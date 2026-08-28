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
public final class ek extends sk0 {
    public long A;
    public long B;
    public int C;
    public String E;
    public String F;
    public String G;
    public boolean O;
    public int P;
    public boolean R;
    public final fk T;
    public final Context f28048r;
    public ak v;
    public org.telegram.ui.wq f28050w;
    public long f28051x;
    public of.m0 f28052y;
    public ArrayList f28049s = new ArrayList();
    public final org.telegram.ui.x00 D = new org.telegram.ui.x00(0, 0);
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final SparseArray K = new SparseArray();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList N = new ArrayList();
    public final AnimationNotificationsLocker Q = new AnimationNotificationsLocker();
    public final m.i3 S = new m.i3(this, 13);

    public ek(fk fkVar, Context context) {
        this.T = fkVar;
        this.f28048r = context;
    }

    @Override
    public final String F(int i9) {
        return null;
    }

    @Override
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i9) {
        if (i9 == 0) {
            return this.f28049s.size();
        }
        int i10 = i9 - 1;
        ArrayList arrayList = this.L;
        int i11 = 1;
        if (i10 >= arrayList.size()) {
            return 1;
        }
        ArrayList arrayList2 = (ArrayList) this.M.get(arrayList.get(i10));
        if (arrayList2 == null) {
            return 0;
        }
        int size = arrayList2.size();
        if (i10 == 0 && this.f28049s.isEmpty()) {
            i11 = 0;
        }
        return size + i11;
    }

    @Override
    public final Object O(int i9, int i10) {
        ArrayList arrayList;
        int i11;
        if (i9 == 0) {
            if (i10 < this.f28049s.size()) {
                return this.f28049s.get(i10);
            }
            return null;
        }
        int i12 = i9 - 1;
        ArrayList arrayList2 = this.L;
        if (i12 < arrayList2.size() && (arrayList = (ArrayList) this.M.get(arrayList2.get(i12))) != null) {
            if (i12 == 0 && this.f28049s.isEmpty()) {
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
    public final int P(int i9, int i10) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == R() - 1) {
            return 3;
        }
        int i11 = i9 - 1;
        if (i11 < this.L.size()) {
            if ((i11 != 0 || !this.f28049s.isEmpty()) && i10 == 0) {
                return 0;
            }
            return 4;
        }
        return 2;
    }

    @Override
    public final int R() {
        ArrayList arrayList = this.L;
        if (arrayList.isEmpty()) {
            return 2;
        }
        return arrayList.size() + (!this.R ? 1 : 0) + 2;
    }

    @Override
    public final View T(int i9, View view) {
        String formatSectionDate;
        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
        if (v3Var == null) {
            Context context = this.f28048r;
            fk fkVar = this.T;
            v3Var = new org.telegram.ui.Cells.v3(context, fkVar.f27492a);
            v3Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23020e7, fkVar.f27492a) & (-218103809));
        }
        if (i9 != 0 && (i9 != 1 || !this.f28049s.isEmpty())) {
            int i10 = i9 - 1;
            ArrayList arrayList = this.L;
            if (i10 < arrayList.size()) {
                v3Var.setAlpha(1.0f);
                ArrayList arrayList2 = (ArrayList) this.M.get((String) arrayList.get(i10));
                if (arrayList2 != null) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(0);
                    if (i10 == 0 && !this.f28049s.isEmpty()) {
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
    public final boolean V(int i9, int i10, f2.q1 q1Var) {
        int i11 = q1Var.f5505f;
        if (i11 == 1 || i11 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i9, int i10, f2.q1 q1Var) {
        String formatSectionDate;
        boolean z10;
        int i11 = i10;
        int i12 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i12 != 2 && i12 != 3) {
            HashMap hashMap = this.M;
            ArrayList arrayList = this.L;
            boolean z11 = false;
            if (i12 != 0) {
                if (i12 == 1 || i12 == 4) {
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                    if (i9 == 0) {
                        zj zjVar = (zj) O(S(i11), Q(i11));
                        int i13 = zjVar.f35317a;
                        if (i13 != 0) {
                            i7Var.d(false, zjVar.f35318b, i13, zjVar.f35319c, null, null);
                        } else {
                            i7Var.d(false, zjVar.f35318b, 0, zjVar.f35319c, zjVar.d.toUpperCase().substring(0, Math.min(zjVar.d.length(), 4)), zjVar.f35320e);
                        }
                        File file = zjVar.f35321f;
                        fk fkVar = this.T;
                        if (file != null) {
                            i7Var.b(fkVar.N.containsKey(file.toString()), !fkVar.Q);
                            return;
                        } else {
                            i7Var.b(false, !fkVar.Q);
                            return;
                        }
                    }
                    int i14 = i9 - 1;
                    if (i14 != 0 || !this.f28049s.isEmpty()) {
                        i11--;
                    }
                    ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i14));
                    if (arrayList2 != null) {
                        MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                        if (i7Var.getMessage() != null && i7Var.getMessage().getId() == messageObject.getId()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i11 != arrayList2.size() - 1 || (i14 == arrayList.size() - 1 && this.O)) {
                            z11 = true;
                        }
                        i7Var.c(messageObject, z11);
                        i7Var.getViewTreeObserver().addOnPreDrawListener(new dk(this, i7Var, messageObject, z10, 0));
                        return;
                    }
                    return;
                }
                return;
            }
            int i15 = i9 - 1;
            ArrayList arrayList3 = (ArrayList) hashMap.get((String) arrayList.get(i15));
            if (arrayList3 != null) {
                MessageObject messageObject2 = (MessageObject) arrayList3.get(0);
                if (i15 == 0 && !this.f28049s.isEmpty()) {
                    formatSectionDate = LocaleController.getString(R.string.GlobalSearch);
                } else {
                    formatSectionDate = LocaleController.formatSectionDate(messageObject2.messageOwner.date);
                }
                ((org.telegram.ui.Cells.v3) view).setText(formatSectionDate);
            }
        }
    }

    public final void Y(String str, boolean z10) {
        long j10;
        fk fkVar = this.T;
        yj yjVar = fkVar.v;
        uj ujVar = fkVar.f28459r;
        org.telegram.ui.wq wqVar = this.f28050w;
        if (wqVar != null) {
            AndroidUtilities.cancelRunOnUIThread(wqVar);
            this.f28050w = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.f28049s.isEmpty()) {
                this.f28049s.clear();
            }
            if (ujVar.getAdapter() != yjVar) {
                ujVar.setAdapter(yjVar);
            }
            l();
        } else {
            org.telegram.ui.wq wqVar2 = new org.telegram.ui.wq(20, this, str);
            this.f28050w = wqVar2;
            AndroidUtilities.runOnUIThread(wqVar2, 300L);
        }
        if (!fkVar.S && yjVar.d.isEmpty()) {
            int i9 = 0;
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            while (true) {
                ArrayList arrayList = this.N;
                if (i9 < arrayList.size()) {
                    of.m0 m0Var = (of.m0) arrayList.get(i9);
                    int i10 = m0Var.d;
                    if (i10 == 4) {
                        TLObject tLObject = m0Var.f19422f;
                        if (tLObject instanceof TLRPC.User) {
                            j10 = ((TLRPC.User) tLObject).f22527id;
                        } else if (tLObject instanceof TLRPC.Chat) {
                            j10 = -((TLRPC.Chat) tLObject).f22380id;
                        }
                        j11 = j10;
                    } else if (i10 == 6) {
                        of.k0 k0Var = m0Var.f19423g;
                        j12 = k0Var.f19396b;
                        j13 = k0Var.f19397c;
                    }
                    i9++;
                } else {
                    Z(j11, j12, j13, of.o0.Y2[2], str, z10);
                    return;
                }
            }
        }
    }

    public final void Z(final long j10, final long j11, final long j12, of.m0 m0Var, final String str, boolean z10) {
        final boolean z11;
        boolean z12;
        long j13;
        fk fkVar = this.T;
        uj ujVar = fkVar.f28459r;
        ih.b5 b5Var = fkVar.H;
        Locale locale = Locale.ENGLISH;
        final String str2 = j10 + j11 + j12 + m0Var.d + str;
        String str3 = this.E;
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
        this.f28052y = m0Var;
        this.f28051x = j10;
        this.A = j11;
        this.B = j12;
        ak akVar = this.v;
        if (akVar != null) {
            AndroidUtilities.cancelRunOnUIThread(akVar);
        }
        m.i3 i3Var = this.S;
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        if (z11 && z10) {
            return;
        }
        ArrayList arrayList = this.I;
        ArrayList arrayList2 = this.H;
        ArrayList arrayList3 = this.J;
        if (z12) {
            arrayList3.clear();
            this.L.clear();
            this.M.clear();
            this.O = true;
            b5Var.setVisibility(0);
            l();
            this.P++;
            if (ujVar.getPinnedHeader() != null) {
                ujVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.O = true;
        l();
        if (!z11) {
            i3Var.run();
            b5Var.e(true, !z10);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i9 = 1 + this.P;
        this.P = i9;
        final AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
        ?? r02 = new Runnable() {
            @Override
            public final void run() {
                String str4;
                long j14;
                int i10;
                ArrayList<Object> arrayList4;
                long j15;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final ek ekVar = ek.this;
                ArrayList arrayList5 = ekVar.J;
                final long j16 = j10;
                String str5 = str;
                final AccountInstance accountInstance2 = accountInstance;
                final long j17 = j11;
                long j18 = j12;
                final boolean z13 = z11;
                if (j16 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.f22489q = str5;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = ekVar.f28052y.f19421e;
                    tL_messages_search.peer = accountInstance2.getMessagesController().getInputPeer(j16);
                    if (j17 > 0) {
                        tL_messages_search.min_date = (int) (j17 / 1000);
                    }
                    if (j18 > 0) {
                        tL_messages_search.max_date = (int) (j18 / 1000);
                    }
                    if (z13 && str5.equals(ekVar.F) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) j3.r0.j(1, arrayList5)).getId();
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
                        i10 = 20;
                        accountInstance2.getMessagesStorage().localSearch(0, str4, arrayList6, new ArrayList<>(), new ArrayList<>(), null, -1);
                        arrayList4 = arrayList6;
                    } else {
                        str4 = str5;
                        j14 = j18;
                        i10 = 20;
                        arrayList4 = null;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i10;
                    tL_messages_searchGlobal2.f22491q = str4;
                    tL_messages_searchGlobal2.filter = ekVar.f28052y.f19421e;
                    if (j17 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j17 / 1000);
                    }
                    if (j14 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j14 / 1000);
                    }
                    if (z13 && str4.equals(ekVar.F) && !arrayList5.isEmpty()) {
                        MessageObject messageObject = (MessageObject) j3.r0.j(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = messageObject.getId();
                        tL_messages_searchGlobal2.offset_rate = ekVar.C;
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
                ekVar.F = str4;
                ekVar.E = str2;
                final ArrayList arrayList7 = new ArrayList();
                of.o0.y1(ekVar.F, arrayList7);
                ConnectionsManager connectionsManager = accountInstance2.getConnectionsManager();
                final int i11 = i9;
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
                            for (int i12 = 0; i12 < size; i12++) {
                                MessageObject messageObject2 = new MessageObject(accountInstance3.getCurrentAccount(), messages_messages.messages.get(i12), false, true);
                                messageObject2.setQuery(str7);
                                arrayList9.add(messageObject2);
                            }
                        }
                        AndroidUtilities.runOnUIThread(new mh.i3(ek.this, i11, tL_error, tLObject, accountInstance3, z13, str7, arrayList9, j16, j17, arrayList8, arrayList7));
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
        fkVar.F.setViewType(3);
    }

    public final void a0(java.util.ArrayList r12, java.util.ArrayList r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ek.a0(java.util.ArrayList, java.util.ArrayList, boolean):void");
    }

    @Override
    public final void l() {
        X(false);
        this.T.S();
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.v3 v3Var;
        View view;
        fk fkVar = this.T;
        Context context = this.f28048r;
        if (i9 != 0) {
            int i10 = 2;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 4) {
                        view = new View(context);
                        view.setTag(-33024);
                        return j3.r0.s(view, view, -1, -2);
                    }
                } else {
                    e00 e00Var = new e00(context, fkVar.f27492a);
                    e00Var.setViewType(3);
                    e00Var.setIsSingleCell(true);
                    v3Var = e00Var;
                }
            }
            if (i9 == 1) {
                i10 = 1;
            }
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, i10, fkVar.f27492a);
            i7Var.setDrawDownloadIcon(false);
            view = i7Var;
            return j3.r0.s(view, view, -1, -2);
        }
        v3Var = new org.telegram.ui.Cells.v3(context, fkVar.f27492a);
        view = v3Var;
        return j3.r0.s(view, view, -1, -2);
    }
}
