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
public final class gk extends nl0 {
    public long B;
    public long C;
    public int D;
    public String F;
    public String G;
    public String H;
    public boolean P;
    public int Q;
    public boolean S;
    public final hk U;
    public final Context f25187r;
    public bk v;
    public org.telegram.ui.np f25189w;
    public long f25190x;
    public tf.e0 f25191y;
    public ArrayList f25188s = new ArrayList();
    public final org.telegram.ui.m10 E = new org.telegram.ui.m10(0, 0);
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final ArrayList K = new ArrayList();
    public final SparseArray L = new SparseArray();
    public final ArrayList M = new ArrayList();
    public final HashMap N = new HashMap();
    public final ArrayList O = new ArrayList();
    public final AnimationNotificationsLocker R = new AnimationNotificationsLocker();
    public final m2.b T = new m2.b(this, 15);

    public gk(hk hkVar, Context context) {
        this.U = hkVar;
        this.f25187r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(rl0 rl0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 == 0) {
            return this.f25188s.size();
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
        if (i11 == 0 && this.f25188s.isEmpty()) {
            i12 = 0;
        }
        return size + i12;
    }

    @Override
    public final Object O(int i10, int i11) {
        ArrayList arrayList;
        int i12;
        if (i10 == 0) {
            if (i11 < this.f25188s.size()) {
                return this.f25188s.get(i11);
            }
            return null;
        }
        int i13 = i10 - 1;
        ArrayList arrayList2 = this.M;
        if (i13 < arrayList2.size() && (arrayList = (ArrayList) this.N.get(arrayList2.get(i13))) != null) {
            if (i13 == 0 && this.f25188s.isEmpty()) {
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
            if ((i12 != 0 || !this.f25188s.isEmpty()) && i11 == 0) {
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
        org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
        if (t3Var == null) {
            Context context = this.f25187r;
            hk hkVar = this.U;
            t3Var = new org.telegram.ui.Cells.t3(context, hkVar.f24281a);
            t3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19899e7, hkVar.f24281a) & (-218103809));
        }
        if (i10 != 0 && (i10 != 1 || !this.f25188s.isEmpty())) {
            int i11 = i10 - 1;
            ArrayList arrayList = this.M;
            if (i11 < arrayList.size()) {
                t3Var.setAlpha(1.0f);
                ArrayList arrayList2 = (ArrayList) this.N.get((String) arrayList.get(i11));
                if (arrayList2 != null) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(0);
                    if (i11 == 0 && !this.f25188s.isEmpty()) {
                        formatSectionDate = LocaleController.getString(R.string.GlobalSearch);
                    } else {
                        formatSectionDate = LocaleController.formatSectionDate(messageObject.messageOwner.date);
                    }
                    t3Var.setText(formatSectionDate);
                }
            }
            return view;
        }
        t3Var.setAlpha(0.0f);
        return t3Var;
    }

    @Override
    public final boolean V(int i10, int i11, f2.l1 l1Var) {
        int i12 = l1Var.f5777f;
        if (i12 == 1 || i12 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, f2.l1 l1Var) {
        String formatSectionDate;
        boolean z4;
        int i12 = i11;
        int i13 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i13 != 2 && i13 != 3) {
            HashMap hashMap = this.N;
            ArrayList arrayList = this.M;
            boolean z10 = false;
            if (i13 != 0) {
                if (i13 == 1 || i13 == 4) {
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                    if (i10 == 0) {
                        ak akVar = (ak) O(S(i12), Q(i12));
                        int i14 = akVar.f23393a;
                        if (i14 != 0) {
                            h7Var.d(akVar.f23394b, akVar.f23395c, null, null, i14, false);
                        } else {
                            h7Var.d(akVar.f23394b, akVar.f23395c, akVar.d.toUpperCase().substring(0, Math.min(akVar.d.length(), 4)), akVar.e, 0, false);
                        }
                        File file = akVar.f23396f;
                        hk hkVar = this.U;
                        if (file != null) {
                            h7Var.b(hkVar.O.containsKey(file.toString()), !hkVar.R);
                            return;
                        } else {
                            h7Var.b(false, !hkVar.R);
                            return;
                        }
                    }
                    int i15 = i10 - 1;
                    if (i15 != 0 || !this.f25188s.isEmpty()) {
                        i12--;
                    }
                    ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i15));
                    if (arrayList2 != null) {
                        MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                        if (h7Var.getMessage() != null && h7Var.getMessage().getId() == messageObject.getId()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (i12 != arrayList2.size() - 1 || (i15 == arrayList.size() - 1 && this.P)) {
                            z10 = true;
                        }
                        h7Var.c(messageObject, z10);
                        h7Var.getViewTreeObserver().addOnPreDrawListener(new fk(this, h7Var, messageObject, z4, 0));
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
                if (i16 == 0 && !this.f25188s.isEmpty()) {
                    formatSectionDate = LocaleController.getString(R.string.GlobalSearch);
                } else {
                    formatSectionDate = LocaleController.formatSectionDate(messageObject2.messageOwner.date);
                }
                ((org.telegram.ui.Cells.t3) view).setText(formatSectionDate);
            }
        }
    }

    public final void Y(String str, boolean z4) {
        long j10;
        hk hkVar = this.U;
        zj zjVar = hkVar.v;
        vj vjVar = hkVar.f25436r;
        org.telegram.ui.np npVar = this.f25189w;
        if (npVar != null) {
            AndroidUtilities.cancelRunOnUIThread(npVar);
            this.f25189w = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.f25188s.isEmpty()) {
                this.f25188s.clear();
            }
            if (vjVar.getAdapter() != zjVar) {
                vjVar.setAdapter(zjVar);
            }
            l();
        } else {
            org.telegram.ui.np npVar2 = new org.telegram.ui.np(25, this, str);
            this.f25189w = npVar2;
            AndroidUtilities.runOnUIThread(npVar2, 300L);
        }
        if (!hkVar.T && zjVar.d.isEmpty()) {
            int i10 = 0;
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            while (true) {
                ArrayList arrayList = this.O;
                if (i10 < arrayList.size()) {
                    tf.e0 e0Var = (tf.e0) arrayList.get(i10);
                    int i11 = e0Var.d;
                    if (i11 == 4) {
                        TLObject tLObject = e0Var.f44768f;
                        if (tLObject instanceof TLRPC.User) {
                            j10 = ((TLRPC.User) tLObject).f19306id;
                        } else if (tLObject instanceof TLRPC.Chat) {
                            j10 = -((TLRPC.Chat) tLObject).f19159id;
                        }
                        j11 = j10;
                    } else if (i11 == 6) {
                        tf.c0 c0Var = e0Var.f44769g;
                        j12 = c0Var.f44739b;
                        j13 = c0Var.f44740c;
                    }
                    i10++;
                } else {
                    Z(j11, j12, j13, tf.g0.Z2[2], str, z4);
                    return;
                }
            }
        }
    }

    public final void Z(final long j10, final long j11, final long j12, tf.e0 e0Var, final String str, boolean z4) {
        final boolean z10;
        boolean z11;
        long j13;
        hk hkVar = this.U;
        vj vjVar = hkVar.f25436r;
        nh.y4 y4Var = hkVar.I;
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
        this.f25191y = e0Var;
        this.f25190x = j10;
        this.B = j11;
        this.C = j12;
        bk bkVar = this.v;
        if (bkVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bkVar);
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
            y4Var.setVisibility(0);
            l();
            this.Q++;
            if (vjVar.getPinnedHeader() != null) {
                vjVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.P = true;
        l();
        if (!z10) {
            bVar.run();
            y4Var.e(true, !z4);
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
                final gk gkVar = gk.this;
                ArrayList arrayList5 = gkVar.K;
                final long j16 = j10;
                String str5 = str;
                final AccountInstance accountInstance2 = accountInstance;
                final long j17 = j11;
                long j18 = j12;
                final boolean z12 = z10;
                if (j16 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.f19268q = str5;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = gkVar.f25191y.e;
                    tL_messages_search.peer = accountInstance2.getMessagesController().getInputPeer(j16);
                    if (j17 > 0) {
                        tL_messages_search.min_date = (int) (j17 / 1000);
                    }
                    if (j18 > 0) {
                        tL_messages_search.max_date = (int) (j18 / 1000);
                    }
                    if (z12 && str5.equals(gkVar.G) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) kf.k0.i(1, arrayList5)).getId();
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
                    tL_messages_searchGlobal2.f19270q = str4;
                    tL_messages_searchGlobal2.filter = gkVar.f25191y.e;
                    if (j17 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j17 / 1000);
                    }
                    if (j14 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j14 / 1000);
                    }
                    if (z12 && str4.equals(gkVar.G) && !arrayList5.isEmpty()) {
                        MessageObject messageObject = (MessageObject) kf.k0.i(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = messageObject.getId();
                        tL_messages_searchGlobal2.offset_rate = gkVar.D;
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
                gkVar.G = str4;
                gkVar.F = str2;
                final ArrayList arrayList7 = new ArrayList();
                tf.g0.x1(gkVar.G, arrayList7);
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
                        AndroidUtilities.runOnUIThread(new dk(gk.this, i12, tL_error, tLObject, accountInstance3, z12, str7, arrayList9, j16, j17, arrayList8, arrayList7));
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
        hkVar.G.setViewType(3);
    }

    public final void a0(java.util.ArrayList r12, java.util.ArrayList r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gk.a0(java.util.ArrayList, java.util.ArrayList, boolean):void");
    }

    @Override
    public final void l() {
        X(false);
        this.U.T();
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t3 t3Var;
        View view;
        hk hkVar = this.U;
        Context context = this.f25187r;
        if (i10 != 0) {
            int i11 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        view = new View(context);
                        view.setTag(-33024);
                        return org.telegram.ui.ai.n(view, view, -1, -2);
                    }
                } else {
                    u00 u00Var = new u00(context, hkVar.f24281a);
                    u00Var.setViewType(3);
                    u00Var.setIsSingleCell(true);
                    t3Var = u00Var;
                }
            }
            if (i10 == 1) {
                i11 = 1;
            }
            org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(context, i11, hkVar.f24281a);
            h7Var.setDrawDownloadIcon(false);
            view = h7Var;
            return org.telegram.ui.ai.n(view, view, -1, -2);
        }
        t3Var = new org.telegram.ui.Cells.t3(context, hkVar.f24281a);
        view = t3Var;
        return org.telegram.ui.ai.n(view, view, -1, -2);
    }
}
