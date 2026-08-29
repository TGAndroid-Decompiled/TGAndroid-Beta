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
public final class ik extends fl0 {
    public long A;
    public long B;
    public int C;
    public String E;
    public String F;
    public String G;
    public boolean O;
    public int P;
    public boolean R;
    public final jk T;
    public final Context f29400r;
    public dk v;
    public z2 f29402w;
    public long f29403x;
    public rf.f0 f29404y;
    public ArrayList f29401s = new ArrayList();
    public final org.telegram.ui.z00 D = new org.telegram.ui.z00(0, 0);
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final SparseArray K = new SparseArray();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList N = new ArrayList();
    public final AnimationNotificationsLocker Q = new AnimationNotificationsLocker();
    public final lh.m7 S = new lh.m7(this, 16);

    public ik(jk jkVar, Context context) {
        this.T = jkVar;
        this.f29400r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 == 0) {
            return this.f29401s.size();
        }
        int i11 = i10 - 1;
        ArrayList arrayList = this.L;
        int i12 = 1;
        if (i11 >= arrayList.size()) {
            return 1;
        }
        ArrayList arrayList2 = (ArrayList) this.M.get(arrayList.get(i11));
        if (arrayList2 == null) {
            return 0;
        }
        int size = arrayList2.size();
        if (i11 == 0 && this.f29401s.isEmpty()) {
            i12 = 0;
        }
        return size + i12;
    }

    @Override
    public final Object O(int i10, int i11) {
        ArrayList arrayList;
        int i12;
        if (i10 == 0) {
            if (i11 < this.f29401s.size()) {
                return this.f29401s.get(i11);
            }
            return null;
        }
        int i13 = i10 - 1;
        ArrayList arrayList2 = this.L;
        if (i13 < arrayList2.size() && (arrayList = (ArrayList) this.M.get(arrayList2.get(i13))) != null) {
            if (i13 == 0 && this.f29401s.isEmpty()) {
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
        if (i12 < this.L.size()) {
            if ((i12 != 0 || !this.f29401s.isEmpty()) && i11 == 0) {
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
    public final View T(int i10, View view) {
        String formatSectionDate;
        org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
        if (s3Var == null) {
            Context context = this.f29400r;
            jk jkVar = this.T;
            s3Var = new org.telegram.ui.Cells.s3(context, jkVar.f28402a);
            s3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23081e7, jkVar.f28402a) & (-218103809));
        }
        if (i10 != 0 && (i10 != 1 || !this.f29401s.isEmpty())) {
            int i11 = i10 - 1;
            ArrayList arrayList = this.L;
            if (i11 < arrayList.size()) {
                s3Var.setAlpha(1.0f);
                ArrayList arrayList2 = (ArrayList) this.M.get((String) arrayList.get(i11));
                if (arrayList2 != null) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(0);
                    if (i11 == 0 && !this.f29401s.isEmpty()) {
                        formatSectionDate = LocaleController.getString(R.string.GlobalSearch);
                    } else {
                        formatSectionDate = LocaleController.formatSectionDate(messageObject.messageOwner.date);
                    }
                    s3Var.setText(formatSectionDate);
                }
            }
            return view;
        }
        s3Var.setAlpha(0.0f);
        return s3Var;
    }

    @Override
    public final boolean V(int i10, int i11, f2.n1 n1Var) {
        int i12 = n1Var.f6436f;
        if (i12 == 1 || i12 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, f2.n1 n1Var) {
        String formatSectionDate;
        boolean z10;
        int i12 = i11;
        int i13 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i13 != 2 && i13 != 3) {
            HashMap hashMap = this.M;
            ArrayList arrayList = this.L;
            boolean z11 = false;
            if (i13 != 0) {
                if (i13 == 1 || i13 == 4) {
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                    if (i10 == 0) {
                        ck ckVar = (ck) O(S(i12), Q(i12));
                        int i14 = ckVar.f27496a;
                        if (i14 != 0) {
                            g7Var.d(false, ckVar.f27497b, i14, ckVar.f27498c, null, null);
                        } else {
                            g7Var.d(false, ckVar.f27497b, 0, ckVar.f27498c, ckVar.d.toUpperCase().substring(0, Math.min(ckVar.d.length(), 4)), ckVar.f27499e);
                        }
                        File file = ckVar.f27500f;
                        jk jkVar = this.T;
                        if (file != null) {
                            g7Var.b(jkVar.N.containsKey(file.toString()), !jkVar.Q);
                            return;
                        } else {
                            g7Var.b(false, !jkVar.Q);
                            return;
                        }
                    }
                    int i15 = i10 - 1;
                    if (i15 != 0 || !this.f29401s.isEmpty()) {
                        i12--;
                    }
                    ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i15));
                    if (arrayList2 != null) {
                        MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                        if (g7Var.getMessage() != null && g7Var.getMessage().getId() == messageObject.getId()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i12 != arrayList2.size() - 1 || (i15 == arrayList.size() - 1 && this.O)) {
                            z11 = true;
                        }
                        g7Var.c(messageObject, z11);
                        g7Var.getViewTreeObserver().addOnPreDrawListener(new hk(this, g7Var, messageObject, z10, 0));
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
                if (i16 == 0 && !this.f29401s.isEmpty()) {
                    formatSectionDate = LocaleController.getString(R.string.GlobalSearch);
                } else {
                    formatSectionDate = LocaleController.formatSectionDate(messageObject2.messageOwner.date);
                }
                ((org.telegram.ui.Cells.s3) view).setText(formatSectionDate);
            }
        }
    }

    public final void Y(String str, boolean z10) {
        long j10;
        jk jkVar = this.T;
        bk bkVar = jkVar.v;
        xj xjVar = jkVar.f29678r;
        z2 z2Var = this.f29402w;
        if (z2Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z2Var);
            this.f29402w = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.f29401s.isEmpty()) {
                this.f29401s.clear();
            }
            if (xjVar.getAdapter() != bkVar) {
                xjVar.setAdapter(bkVar);
            }
            l();
        } else {
            z2 z2Var2 = new z2(17, this, str);
            this.f29402w = z2Var2;
            AndroidUtilities.runOnUIThread(z2Var2, 300L);
        }
        if (!jkVar.S && bkVar.d.isEmpty()) {
            int i10 = 0;
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            while (true) {
                ArrayList arrayList = this.N;
                if (i10 < arrayList.size()) {
                    rf.f0 f0Var = (rf.f0) arrayList.get(i10);
                    int i11 = f0Var.d;
                    if (i11 == 4) {
                        TLObject tLObject = f0Var.f47224f;
                        if (tLObject instanceof TLRPC.User) {
                            j10 = ((TLRPC.User) tLObject).f22539id;
                        } else if (tLObject instanceof TLRPC.Chat) {
                            j10 = -((TLRPC.Chat) tLObject).f22392id;
                        }
                        j11 = j10;
                    } else if (i11 == 6) {
                        rf.d0 d0Var = f0Var.f47225g;
                        j12 = d0Var.f47191b;
                        j13 = d0Var.f47192c;
                    }
                    i10++;
                } else {
                    Z(j11, j12, j13, rf.h0.Y2[2], str, z10);
                    return;
                }
            }
        }
    }

    public final void Z(final long j10, final long j11, final long j12, rf.f0 f0Var, final String str, boolean z10) {
        final boolean z11;
        boolean z12;
        long j13;
        jk jkVar = this.T;
        xj xjVar = jkVar.f29678r;
        lh.x4 x4Var = jkVar.H;
        Locale locale = Locale.ENGLISH;
        final String str2 = j10 + j11 + j12 + f0Var.d + str;
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
        this.f29404y = f0Var;
        this.f29403x = j10;
        this.A = j11;
        this.B = j12;
        dk dkVar = this.v;
        if (dkVar != null) {
            AndroidUtilities.cancelRunOnUIThread(dkVar);
        }
        lh.m7 m7Var = this.S;
        AndroidUtilities.cancelRunOnUIThread(m7Var);
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
            x4Var.setVisibility(0);
            l();
            this.P++;
            if (xjVar.getPinnedHeader() != null) {
                xjVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.O = true;
        l();
        if (!z11) {
            m7Var.run();
            x4Var.e(true, !z10);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i10 = 1 + this.P;
        this.P = i10;
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
                ArrayList arrayList5 = ikVar.J;
                final long j16 = j10;
                String str5 = str;
                final AccountInstance accountInstance2 = accountInstance;
                final long j17 = j11;
                long j18 = j12;
                final boolean z13 = z11;
                if (j16 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.f22501q = str5;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = ikVar.f29404y.f47223e;
                    tL_messages_search.peer = accountInstance2.getMessagesController().getInputPeer(j16);
                    if (j17 > 0) {
                        tL_messages_search.min_date = (int) (j17 / 1000);
                    }
                    if (j18 > 0) {
                        tL_messages_search.max_date = (int) (j18 / 1000);
                    }
                    if (z13 && str5.equals(ikVar.F) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) j7.l1.i(1, arrayList5)).getId();
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
                    tL_messages_searchGlobal2.f22503q = str4;
                    tL_messages_searchGlobal2.filter = ikVar.f29404y.f47223e;
                    if (j17 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j17 / 1000);
                    }
                    if (j14 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j14 / 1000);
                    }
                    if (z13 && str4.equals(ikVar.F) && !arrayList5.isEmpty()) {
                        MessageObject messageObject = (MessageObject) j7.l1.i(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = messageObject.getId();
                        tL_messages_searchGlobal2.offset_rate = ikVar.C;
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
                ikVar.F = str4;
                ikVar.E = str2;
                final ArrayList arrayList7 = new ArrayList();
                rf.h0.y1(ikVar.F, arrayList7);
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
                        AndroidUtilities.runOnUIThread(new fk(ik.this, i12, tL_error, tLObject, accountInstance3, z13, str7, arrayList9, j16, j17, arrayList8, arrayList7));
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
        jkVar.F.setViewType(3);
    }

    public final void a0(java.util.ArrayList r12, java.util.ArrayList r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ik.a0(java.util.ArrayList, java.util.ArrayList, boolean):void");
    }

    @Override
    public final void l() {
        X(false);
        this.T.T();
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s3 s3Var;
        View view;
        jk jkVar = this.T;
        Context context = this.f29400r;
        if (i10 != 0) {
            int i11 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        view = new View(context);
                        view.setTag(-33024);
                        return org.telegram.ui.th.m(view, view, -1, -2);
                    }
                } else {
                    p00 p00Var = new p00(context, jkVar.f28402a);
                    p00Var.setViewType(3);
                    p00Var.setIsSingleCell(true);
                    s3Var = p00Var;
                }
            }
            if (i10 == 1) {
                i11 = 1;
            }
            org.telegram.ui.Cells.g7 g7Var = new org.telegram.ui.Cells.g7(context, i11, jkVar.f28402a);
            g7Var.setDrawDownloadIcon(false);
            view = g7Var;
            return org.telegram.ui.th.m(view, view, -1, -2);
        }
        s3Var = new org.telegram.ui.Cells.s3(context, jkVar.f28402a);
        view = s3Var;
        return org.telegram.ui.th.m(view, view, -1, -2);
    }
}
