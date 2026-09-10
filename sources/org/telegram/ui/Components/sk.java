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
public final class sk extends rl0 {
    public long E;
    public long F;
    public int G;
    public String I;
    public String J;
    public String K;
    public boolean S;
    public int T;
    public boolean V;
    public final tk X;
    public final Context f27086r;
    public ok v;
    public ee f27088w;
    public long f27089x;
    public fg.q0 f27090y;
    public ArrayList f27087s = new ArrayList();
    public final org.telegram.ui.r10 H = new org.telegram.ui.r10(0, 0);
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final SparseArray O = new SparseArray();
    public final ArrayList P = new ArrayList();
    public final HashMap Q = new HashMap();
    public final ArrayList R = new ArrayList();
    public final AnimationNotificationsLocker U = new AnimationNotificationsLocker();
    public final org.telegram.ui.Cells.l9 W = new org.telegram.ui.Cells.l9(this, 4);

    public sk(tk tkVar, Context context) {
        this.X = tkVar;
        this.f27086r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 == 0) {
            return this.f27087s.size();
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
        if (i11 == 0 && this.f27087s.isEmpty()) {
            i12 = 0;
        }
        return size + i12;
    }

    @Override
    public final Object O(int i10, int i11) {
        ArrayList arrayList;
        int i12;
        if (i10 == 0) {
            if (i11 < this.f27087s.size()) {
                return this.f27087s.get(i11);
            }
            return null;
        }
        int i13 = i10 - 1;
        ArrayList arrayList2 = this.P;
        if (i13 < arrayList2.size() && (arrayList = (ArrayList) this.Q.get(arrayList2.get(i13))) != null) {
            if (i13 == 0 && this.f27087s.isEmpty()) {
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
            if ((i12 != 0 || !this.f27087s.isEmpty()) && i11 == 0) {
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
            Context context = this.f27086r;
            tk tkVar = this.X;
            u3Var = new org.telegram.ui.Cells.u3(context, tkVar.f26421a);
            u3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.e7, tkVar.f26421a) & (-218103809));
        }
        if (i10 != 0 && (i10 != 1 || !this.f27087s.isEmpty())) {
            int i11 = i10 - 1;
            ArrayList arrayList = this.P;
            if (i11 < arrayList.size()) {
                u3Var.setAlpha(1.0f);
                ArrayList arrayList2 = (ArrayList) this.Q.get((String) arrayList.get(i11));
                if (arrayList2 != null) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(0);
                    if (i11 == 0 && !this.f27087s.isEmpty()) {
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
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        int i12 = c1Var.f41613f;
        if (i12 == 1 || i12 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        String formatSectionDate;
        boolean z10;
        int i12 = i11;
        int i13 = c1Var.f41613f;
        View view = c1Var.f41610a;
        if (i13 != 2 && i13 != 3) {
            HashMap hashMap = this.Q;
            ArrayList arrayList = this.P;
            boolean z11 = false;
            if (i13 != 0) {
                if (i13 == 1 || i13 == 4) {
                    org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                    if (i10 == 0) {
                        nk nkVar = (nk) O(S(i12), Q(i12));
                        int i14 = nkVar.f25536a;
                        if (i14 != 0) {
                            l7Var.d(nkVar.f25537b, nkVar.f25538c, null, null, i14, false);
                        } else {
                            l7Var.d(nkVar.f25537b, nkVar.f25538c, nkVar.d.toUpperCase().substring(0, Math.min(nkVar.d.length(), 4)), nkVar.e, 0, false);
                        }
                        File file = nkVar.f25539f;
                        tk tkVar = this.X;
                        if (file != null) {
                            l7Var.b(tkVar.R.containsKey(file.toString()), !tkVar.U);
                            return;
                        } else {
                            l7Var.b(false, !tkVar.U);
                            return;
                        }
                    }
                    int i15 = i10 - 1;
                    if (i15 != 0 || !this.f27087s.isEmpty()) {
                        i12--;
                    }
                    ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i15));
                    if (arrayList2 != null) {
                        MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                        if (l7Var.getMessage() != null && l7Var.getMessage().getId() == messageObject.getId()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i12 != arrayList2.size() - 1 || (i15 == arrayList.size() - 1 && this.S)) {
                            z11 = true;
                        }
                        l7Var.c(messageObject, z11);
                        l7Var.getViewTreeObserver().addOnPreDrawListener(new rk(this, l7Var, messageObject, z10, 0));
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
                if (i16 == 0 && !this.f27087s.isEmpty()) {
                    formatSectionDate = LocaleController.getString(R.string.GlobalSearch);
                } else {
                    formatSectionDate = LocaleController.formatSectionDate(messageObject2.messageOwner.date);
                }
                ((org.telegram.ui.Cells.u3) view).setText(formatSectionDate);
            }
        }
    }

    public final void Y(String str, boolean z10) {
        long j3;
        tk tkVar = this.X;
        mk mkVar = tkVar.v;
        ik ikVar = tkVar.f27428r;
        ee eeVar = this.f27088w;
        if (eeVar != null) {
            AndroidUtilities.cancelRunOnUIThread(eeVar);
            this.f27088w = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.f27087s.isEmpty()) {
                this.f27087s.clear();
            }
            if (ikVar.getAdapter() != mkVar) {
                ikVar.setAdapter(mkVar);
            }
            l();
        } else {
            ee eeVar2 = new ee(11, this, str);
            this.f27088w = eeVar2;
            AndroidUtilities.runOnUIThread(eeVar2, 300L);
        }
        if (!tkVar.W && mkVar.d.isEmpty()) {
            int i10 = 0;
            long j10 = 0;
            long j11 = 0;
            long j12 = 0;
            while (true) {
                ArrayList arrayList = this.R;
                if (i10 < arrayList.size()) {
                    fg.q0 q0Var = (fg.q0) arrayList.get(i10);
                    int i11 = q0Var.d;
                    if (i11 == 4) {
                        TLObject tLObject = q0Var.f8183f;
                        if (tLObject instanceof TLRPC.User) {
                            j3 = ((TLRPC.User) tLObject).f17342id;
                        } else if (tLObject instanceof TLRPC.Chat) {
                            j3 = -((TLRPC.Chat) tLObject).f17195id;
                        }
                        j10 = j3;
                    } else if (i11 == 6) {
                        fg.o0 o0Var = q0Var.f8184g;
                        j11 = o0Var.f8156b;
                        j12 = o0Var.f8157c;
                    }
                    i10++;
                } else {
                    Z(j10, j11, j12, fg.s0.f8199c3[2], str, z10);
                    return;
                }
            }
        }
    }

    public final void Z(final long j3, final long j10, final long j11, fg.q0 q0Var, final String str, boolean z10) {
        final boolean z11;
        boolean z12;
        long j12;
        tk tkVar = this.X;
        ik ikVar = tkVar.f27428r;
        hk hkVar = tkVar.L;
        Locale locale = Locale.ENGLISH;
        final String str2 = j3 + j10 + j11 + q0Var.d + str;
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
        this.f27090y = q0Var;
        this.f27089x = j3;
        this.E = j10;
        this.F = j11;
        ok okVar = this.v;
        if (okVar != null) {
            AndroidUtilities.cancelRunOnUIThread(okVar);
        }
        org.telegram.ui.Cells.l9 l9Var = this.W;
        AndroidUtilities.cancelRunOnUIThread(l9Var);
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
            hkVar.setVisibility(0);
            l();
            this.T++;
            if (ikVar.getPinnedHeader() != null) {
                ikVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.S = true;
        l();
        if (!z11) {
            l9Var.run();
            hkVar.e(true, !z10);
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
                String str4;
                long j13;
                int i11;
                ArrayList<Object> arrayList4;
                long j14;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final sk skVar = sk.this;
                ArrayList arrayList5 = skVar.N;
                final long j15 = j3;
                String str5 = str;
                final AccountInstance accountInstance2 = accountInstance;
                final long j16 = j10;
                long j17 = j11;
                final boolean z13 = z11;
                if (j15 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.f17304q = str5;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = skVar.f27090y.e;
                    tL_messages_search.peer = accountInstance2.getMessagesController().getInputPeer(j15);
                    if (j16 > 0) {
                        tL_messages_search.min_date = (int) (j16 / 1000);
                    }
                    if (j17 > 0) {
                        tL_messages_search.max_date = (int) (j17 / 1000);
                    }
                    if (z13 && str5.equals(skVar.J) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) hc.b.i(1, arrayList5)).getId();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    str4 = str5;
                    arrayList4 = null;
                    tL_messages_searchGlobal = tL_messages_search;
                } else {
                    if (!TextUtils.isEmpty(str5)) {
                        ArrayList<Object> arrayList6 = new ArrayList<>();
                        j13 = j17;
                        str4 = str5;
                        i11 = 20;
                        accountInstance2.getMessagesStorage().localSearch(0, str4, arrayList6, new ArrayList<>(), new ArrayList<>(), null, -1);
                        arrayList4 = arrayList6;
                    } else {
                        str4 = str5;
                        j13 = j17;
                        i11 = 20;
                        arrayList4 = null;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i11;
                    tL_messages_searchGlobal2.f17306q = str4;
                    tL_messages_searchGlobal2.filter = skVar.f27090y.e;
                    if (j16 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j16 / 1000);
                    }
                    if (j13 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j13 / 1000);
                    }
                    if (z13 && str4.equals(skVar.J) && !arrayList5.isEmpty()) {
                        MessageObject messageObject = (MessageObject) hc.b.i(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = messageObject.getId();
                        tL_messages_searchGlobal2.offset_rate = skVar.G;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        long j18 = peer.channel_id;
                        if (j18 == 0) {
                            j18 = peer.chat_id;
                            if (j18 == 0) {
                                j14 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = accountInstance2.getMessagesController().getInputPeer(j14);
                                tL_messages_searchGlobal = tL_messages_searchGlobal2;
                            }
                        }
                        j14 = -j18;
                        tL_messages_searchGlobal2.offset_peer = accountInstance2.getMessagesController().getInputPeer(j14);
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                }
                skVar.J = str4;
                skVar.I = str2;
                final ArrayList arrayList7 = new ArrayList();
                fg.s0.x1(skVar.J, arrayList7);
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
                        AndroidUtilities.runOnUIThread(new di.w3(sk.this, i12, tL_error, tLObject, accountInstance3, z13, str7, arrayList9, j15, j16, arrayList8, arrayList7));
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
        tkVar.J.setViewType(3);
    }

    public final void a0(java.util.ArrayList r12, java.util.ArrayList r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sk.a0(java.util.ArrayList, java.util.ArrayList, boolean):void");
    }

    @Override
    public final void l() {
        X(false);
        this.X.T();
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        View view;
        tk tkVar = this.X;
        Context context = this.f27086r;
        if (i10 != 0) {
            int i11 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        view = new View(context);
                        view.setTag(-33024);
                        return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
                    }
                } else {
                    a10 a10Var = new a10(context, tkVar.f26421a);
                    a10Var.setViewType(3);
                    a10Var.setIsSingleCell(true);
                    u3Var = a10Var;
                }
            }
            if (i10 == 1) {
                i11 = 1;
            }
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, i11, tkVar.f26421a);
            l7Var.setDrawDownloadIcon(false);
            view = l7Var;
            return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
        }
        u3Var = new org.telegram.ui.Cells.u3(context, tkVar.f26421a);
        view = u3Var;
        return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
    }
}
