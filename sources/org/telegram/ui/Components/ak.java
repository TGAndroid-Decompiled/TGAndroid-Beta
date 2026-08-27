package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.Property;
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

public final class ak extends vk0 {
    public long A;
    public long B;
    public int C;
    public String E;
    public String F;
    public String G;
    public boolean O;
    public int P;
    public boolean R;
    public final bk T;

    public final Context f26754r;
    public wj v;

    public org.telegram.ui.yq f26756w;

    public long f26757x;

    public pf.e0 f26758y;

    public ArrayList f26755s = new ArrayList();
    public final org.telegram.ui.a10 D = new org.telegram.ui.a10(0, 0);
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final SparseArray K = new SparseArray();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList N = new ArrayList();
    public final AnimationNotificationsLocker Q = new AnimationNotificationsLocker();
    public final m.i3 S = new m.i3(this, 13);

    public ak(bk bkVar, Context context) {
        this.T = bkVar;
        this.f26754r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(zk0 zk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 == 0) {
            return this.f26755s.size();
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
        if (i11 == 0 && this.f26755s.isEmpty()) {
            i12 = 0;
        }
        return size + i12;
    }

    @Override
    public final Object O(int i10, int i11) {
        ArrayList arrayList;
        if (i10 == 0) {
            if (i11 < this.f26755s.size()) {
                return this.f26755s.get(i11);
            }
            return null;
        }
        int i12 = i10 - 1;
        ArrayList arrayList2 = this.L;
        if (i12 >= arrayList2.size() || (arrayList = (ArrayList) this.M.get(arrayList2.get(i12))) == null) {
            return null;
        }
        int i13 = i11 - ((i12 == 0 && this.f26755s.isEmpty()) ? 0 : 1);
        if (i13 < 0 || i13 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i13);
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
            return (!(i12 == 0 && this.f26755s.isEmpty()) && i11 == 0) ? 0 : 4;
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
        org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
        if (s3Var == null) {
            Context context = this.f26754r;
            bk bkVar = this.T;
            s3Var = new org.telegram.ui.Cells.s3(context, bkVar.f34899a);
            s3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23073e7, bkVar.f34899a) & (-218103809));
        }
        if (i10 == 0 || (i10 == 1 && this.f26755s.isEmpty())) {
            s3Var.setAlpha(0.0f);
            return s3Var;
        }
        int i11 = i10 - 1;
        ArrayList arrayList = this.L;
        if (i11 < arrayList.size()) {
            s3Var.setAlpha(1.0f);
            ArrayList arrayList2 = (ArrayList) this.M.get((String) arrayList.get(i11));
            if (arrayList2 != null) {
                s3Var.setText((i11 != 0 || this.f26755s.isEmpty()) ? LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date) : LocaleController.getString(R.string.GlobalSearch));
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, f2.o1 o1Var) {
        int i12 = o1Var.f5793f;
        return i12 == 1 || i12 == 4;
    }

    @Override
    public final void W(int i10, int i11, f2.o1 o1Var) {
        int i12 = i11;
        int i13 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i13 == 2 || i13 == 3) {
            return;
        }
        HashMap map = this.M;
        ArrayList arrayList = this.L;
        boolean z10 = false;
        if (i13 == 0) {
            int i14 = i10 - 1;
            ArrayList arrayList2 = (ArrayList) map.get((String) arrayList.get(i14));
            if (arrayList2 == null) {
                return;
            }
            ((org.telegram.ui.Cells.s3) view).setText((i14 != 0 || this.f26755s.isEmpty()) ? LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date) : LocaleController.getString(R.string.GlobalSearch));
            return;
        }
        if (i13 == 1 || i13 == 4) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            if (i10 == 0) {
                vj vjVar = (vj) O(S(i12), Q(i12));
                int i15 = vjVar.f33427a;
                if (i15 != 0) {
                    f7Var.d(false, vjVar.f33428b, i15, vjVar.f33429c, null, null);
                } else {
                    f7Var.d(false, vjVar.f33428b, 0, vjVar.f33429c, vjVar.d.toUpperCase().substring(0, Math.min(vjVar.d.length(), 4)), vjVar.f33430e);
                }
                File file = vjVar.f33431f;
                bk bkVar = this.T;
                if (file != null) {
                    f7Var.b(bkVar.N.containsKey(file.toString()), !bkVar.Q);
                    return;
                } else {
                    f7Var.b(false, !bkVar.Q);
                    return;
                }
            }
            int i16 = i10 - 1;
            if (i16 != 0 || !this.f26755s.isEmpty()) {
                i12--;
            }
            ArrayList arrayList3 = (ArrayList) map.get((String) arrayList.get(i16));
            if (arrayList3 == null) {
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList3.get(i12);
            boolean z11 = f7Var.getMessage() != null && f7Var.getMessage().getId() == messageObject.getId();
            if (i12 != arrayList3.size() - 1 || (i16 == arrayList.size() - 1 && this.O)) {
                z10 = true;
            }
            f7Var.c(messageObject, z10);
            f7Var.getViewTreeObserver().addOnPreDrawListener(new zj(this, f7Var, messageObject, z11, 0));
        }
    }

    public final void Y(String str, boolean z10) {
        long j10;
        bk bkVar = this.T;
        uj ujVar = bkVar.v;
        qj qjVar = bkVar.f27115r;
        org.telegram.ui.yq yqVar = this.f26756w;
        if (yqVar != null) {
            AndroidUtilities.cancelRunOnUIThread(yqVar);
            this.f26756w = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.f26755s.isEmpty()) {
                this.f26755s.clear();
            }
            if (qjVar.getAdapter() != ujVar) {
                qjVar.setAdapter(ujVar);
            }
            l();
        } else {
            org.telegram.ui.yq yqVar2 = new org.telegram.ui.yq(20, this, str);
            this.f26756w = yqVar2;
            AndroidUtilities.runOnUIThread(yqVar2, 300L);
        }
        if (bkVar.S || !ujVar.d.isEmpty()) {
            return;
        }
        int i10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            ArrayList arrayList = this.N;
            if (i10 >= arrayList.size()) {
                Z(j11, j12, j13, pf.g0.Y2[2], str, z10);
                return;
            }
            pf.e0 e0Var = (pf.e0) arrayList.get(i10);
            int i11 = e0Var.d;
            if (i11 == 4) {
                TLObject tLObject = e0Var.f45783f;
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).f22527id;
                } else if (tLObject instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) tLObject).f22380id;
                }
                j11 = j10;
            } else if (i11 == 6) {
                pf.c0 c0Var = e0Var.f45784g;
                j12 = c0Var.f45750b;
                j13 = c0Var.f45751c;
            }
            i10++;
        }
    }

    public final void Z(final long j10, final long j11, final long j12, pf.e0 e0Var, final String str, boolean z10) {
        bk bkVar = this.T;
        qj qjVar = bkVar.f27115r;
        jh.x4 x4Var = bkVar.H;
        Locale locale = Locale.ENGLISH;
        final String str2 = j10 + j11 + j12 + e0Var.d + str;
        String str3 = this.E;
        final boolean z11 = str3 != null && str3.equals(str2);
        boolean z12 = !z11 && z10;
        if (j10 == this.f26757x && this.A == j11) {
            int i10 = (this.B > j12 ? 1 : (this.B == j12 ? 0 : -1));
        }
        this.f26758y = e0Var;
        this.f26757x = j10;
        this.A = j11;
        this.B = j12;
        wj wjVar = this.v;
        if (wjVar != null) {
            AndroidUtilities.cancelRunOnUIThread(wjVar);
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
            x4Var.setVisibility(0);
            l();
            this.P++;
            if (qjVar.getPinnedHeader() != null) {
                qjVar.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.O = true;
        l();
        if (!z11) {
            i3Var.run();
            x4Var.e(true, !z10);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i11 = 1 + this.P;
        this.P = i11;
        final AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
        ?? r10 = new Runnable() {
            @Override
            public final void run() throws Throwable {
                String str4;
                int i12;
                ArrayList<Object> arrayList4;
                long j13;
                TLObject tLObject;
                final ak akVar = this.f34225a;
                ArrayList arrayList5 = akVar.J;
                final long j14 = j10;
                String str5 = str;
                final AccountInstance accountInstance2 = accountInstance;
                final long j15 = j11;
                long j16 = j12;
                final boolean z13 = z11;
                if (j14 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.f22489q = str5;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = akVar.f26758y.f45782e;
                    tL_messages_search.peer = accountInstance2.getMessagesController().getInputPeer(j14);
                    if (j15 > 0) {
                        tL_messages_search.min_date = (int) (j15 / 1000);
                    }
                    if (j16 > 0) {
                        tL_messages_search.max_date = (int) (j16 / 1000);
                    }
                    if (z13 && str5.equals(akVar.F) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) i0.a.i(1, arrayList5)).getId();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    str4 = str5;
                    arrayList4 = null;
                    tLObject = tL_messages_search;
                } else {
                    if (TextUtils.isEmpty(str5)) {
                        str4 = str5;
                        i12 = 20;
                        arrayList4 = null;
                    } else {
                        ArrayList<Object> arrayList6 = new ArrayList<>();
                        str4 = str5;
                        i12 = 20;
                        accountInstance2.getMessagesStorage().localSearch(0, str4, arrayList6, new ArrayList<>(), new ArrayList<>(), null, -1);
                        arrayList4 = arrayList6;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal.limit = i12;
                    tL_messages_searchGlobal.f22491q = str4;
                    tL_messages_searchGlobal.filter = akVar.f26758y.f45782e;
                    if (j15 > 0) {
                        tL_messages_searchGlobal.min_date = (int) (j15 / 1000);
                    }
                    if (j16 > 0) {
                        tL_messages_searchGlobal.max_date = (int) (j16 / 1000);
                    }
                    if (z13 && str4.equals(akVar.F) && !arrayList5.isEmpty()) {
                        MessageObject messageObject = (MessageObject) i0.a.i(1, arrayList5);
                        tL_messages_searchGlobal.offset_id = messageObject.getId();
                        tL_messages_searchGlobal.offset_rate = akVar.C;
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        long j17 = peer.channel_id;
                        if (j17 != 0) {
                            j13 = -j17;
                        } else {
                            j17 = peer.chat_id;
                            if (j17 != 0) {
                                j13 = -j17;
                            } else {
                                j13 = peer.user_id;
                            }
                        }
                        tL_messages_searchGlobal.offset_peer = accountInstance2.getMessagesController().getInputPeer(j13);
                        tLObject = tL_messages_searchGlobal;
                    } else {
                        tL_messages_searchGlobal.offset_rate = 0;
                        tL_messages_searchGlobal.offset_id = 0;
                        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        tLObject = tL_messages_searchGlobal;
                    }
                }
                akVar.F = str4;
                akVar.E = str2;
                final ArrayList arrayList7 = new ArrayList();
                pf.g0.y1(akVar.F, arrayList7);
                ConnectionsManager connectionsManager = accountInstance2.getConnectionsManager();
                final int i13 = i11;
                final String str6 = str4;
                final ArrayList<Object> arrayList8 = arrayList4;
                connectionsManager.sendRequest(tLObject, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                        ArrayList arrayList9 = new ArrayList();
                        AccountInstance accountInstance3 = accountInstance2;
                        String str7 = str6;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                            int size = messages_messages.messages.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                MessageObject messageObject2 = new MessageObject(accountInstance3.getCurrentAccount(), messages_messages.messages.get(i14), false, true);
                                messageObject2.setQuery(str7);
                                arrayList9.add(messageObject2);
                            }
                        }
                        AndroidUtilities.runOnUIThread(new nh.h3(akVar, i13, tL_error, tLObject2, accountInstance3, z13, str7, arrayList9, j14, j15, arrayList8, arrayList7));
                    }
                });
            }
        };
        this.v = r10;
        AndroidUtilities.runOnUIThread(r10, (!z11 || arrayList3.isEmpty()) ? 350L : 0L);
        bkVar.F.setViewType(3);
    }

    public final void a0(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        boolean z11;
        bk bkVar = this.T;
        pf.g0 g0Var = bkVar.D;
        int i10 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            ArrayList arrayList3 = this.N;
            if (i10 >= arrayList3.size()) {
                break;
            }
            if (((pf.e0) arrayList3.get(i10)).a()) {
                z12 = true;
            } else if (((pf.e0) arrayList3.get(i10)).d == 4) {
                z13 = true;
            } else if (((pf.e0) arrayList3.get(i10)).d == 6) {
                z14 = true;
            }
            i10++;
        }
        boolean z15 = ((arrayList == null || arrayList.isEmpty()) && (arrayList2 == null || arrayList2.isEmpty())) ? false : true;
        if ((z12 || z15 || !z10) && z15) {
            if (arrayList == null || arrayList.isEmpty() || z13) {
                arrayList = null;
            }
            if (arrayList2 == null || arrayList2.isEmpty() || z14) {
                arrayList2 = null;
            }
            if (arrayList == null && arrayList2 == null) {
                z11 = false;
            } else {
                g0Var.A1(arrayList, arrayList2, false);
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (!z11) {
            g0Var.A1(null, null, false);
        }
        g0Var.setEnabled(z11);
        if (!z11 || g0Var.getTag() == null) {
            if (z11 || g0Var.getTag() != null) {
                g0Var.setTag(z11 ? 1 : null);
                AnimatorSet animatorSet = bkVar.E;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (z11) {
                    g0Var.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                bkVar.E = animatorSet2;
                qj qjVar = bkVar.f27115r;
                Property property = View.TRANSLATION_Y;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(qjVar, (Property<qj, Float>) property, z11 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(g0Var, (Property<pf.g0, Float>) property, z11 ? 0.0f : -AndroidUtilities.dp(44.0f)), ObjectAnimator.ofFloat(bkVar.F, (Property<h00, Float>) property, z11 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(bkVar.H, (Property<jh.x4, Float>) property, z11 ? AndroidUtilities.dp(44.0f) : 0.0f));
                bkVar.E.addListener(new org.telegram.ui.am(this, 16));
                bkVar.E.setInterpolator(er.f28123g);
                bkVar.E.setDuration(180L);
                bkVar.E.start();
            }
        }
    }

    @Override
    public final void l() {
        X(false);
        this.T.T();
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View s3Var;
        View view;
        bk bkVar = this.T;
        Context context = this.f26754r;
        if (i10 != 0) {
            if (i10 == 1) {
                org.telegram.ui.Cells.f7 f7Var = new org.telegram.ui.Cells.f7(context, i10 == 1 ? 1 : 2, bkVar.f34899a);
                f7Var.setDrawDownloadIcon(false);
                view = f7Var;
            } else if (i10 == 2) {
                h00 h00Var = new h00(context, bkVar.f34899a);
                h00Var.setViewType(3);
                h00Var.setIsSingleCell(true);
                s3Var = h00Var;
            } else if (i10 != 4) {
                View view2 = new View(context);
                view2.setTag(-33024);
                view = view2;
            } else {
                org.telegram.ui.Cells.f7 f7Var2 = new org.telegram.ui.Cells.f7(context, i10 == 1 ? 1 : 2, bkVar.f34899a);
                f7Var2.setDrawDownloadIcon(false);
                view = f7Var2;
            }
            return org.telegram.ui.Cells.pa.l(view, view, -1, -2);
        }
        s3Var = new org.telegram.ui.Cells.s3(context, bkVar.f34899a);
        view = s3Var;
        return org.telegram.ui.Cells.pa.l(view, view, -1, -2);
    }
}
