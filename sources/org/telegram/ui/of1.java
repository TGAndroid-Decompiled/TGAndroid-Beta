package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class of1 extends org.telegram.ui.Components.l81 implements s10 {
    public final FrameLayout Q;
    public final org.telegram.ui.Components.sl0 R;
    public final f2.j0 S;
    public final lf1 T;
    public h21 U;
    public String V;
    public final ArrayList W;
    public final ArrayList f39691a0;
    public int f39692b0;
    public int f39693c0;
    public int f39694d0;
    public int f39695e0;
    public int f39696f0;
    public int f39697g0;
    public int f39698h0;
    public boolean f39699i0;
    public boolean f39700j0;
    public final org.telegram.ui.Components.zw0 f39701k0;
    public final org.telegram.ui.Components.zk0 f39702l0;
    public boolean m0;
    public final nf1 f39703n0;
    public final vv0 f39704o0;
    public final ArrayList f39705p0;
    public final sf1 f39706q0;

    public of1(sf1 sf1Var, Context context) {
        super(context, null);
        this.f39706q0 = sf1Var;
        this.V = "empty";
        this.W = new ArrayList();
        this.f39691a0 = new ArrayList();
        this.f39705p0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        this.f39704o0 = new vv0(this, 7);
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.R = sl0Var;
        lf1 lf1Var = new lf1(this);
        this.T = lf1Var;
        sl0Var.setAdapter(lf1Var);
        f2.j0 j0Var = new f2.j0();
        this.S = j0Var;
        sl0Var.setLayoutManager(j0Var);
        sl0Var.setOnItemClickListener(new p21(this, 10));
        sl0Var.setOnScrollListener(new ce1(this, 1));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        u00Var.setViewType(7);
        u00Var.f31465w = false;
        u00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, u00Var, 1, null);
        this.f39701k0 = zw0Var;
        zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        zw0Var.f34033e.setVisibility(8);
        zw0Var.setVisibility(8);
        zw0Var.addView(u00Var, 0);
        zw0Var.setAnimateLayoutChange(true);
        sl0Var.setEmptyView(zw0Var);
        sl0Var.V1 = true;
        sl0Var.W1 = 0;
        frameLayout.addView(zw0Var);
        frameLayout.addView(sl0Var);
        L();
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(sl0Var, true);
        this.f39702l0 = zk0Var;
        sl0Var.setItemsEnterAnimator(zk0Var);
        nf1 nf1Var = new nf1(this);
        this.f39703n0 = nf1Var;
        setAdapter(nf1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.m0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        sf1 sf1Var = this.f39706q0;
        tL_messages_search.peer = sf1Var.getMessagesController().getInputPeer(-sf1Var.f41188a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f20954q = str;
        ArrayList arrayList = this.f39691a0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) l.d.i(1, arrayList)).getId();
        }
        this.m0 = true;
        i10 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new tb0(27, this, str));
    }

    public final void K(View view, int i10, String str, boolean z4) {
        this.V = str;
        FrameLayout frameLayout = this.Q;
        sf1 sf1Var = this.f39706q0;
        int i11 = 0;
        if (view == frameLayout) {
            h21 h21Var = this.U;
            if (h21Var != null) {
                AndroidUtilities.cancelRunOnUIThread(h21Var);
                this.U = null;
            }
            this.m0 = false;
            this.f39700j0 = false;
            ArrayList arrayList = this.W;
            arrayList.clear();
            this.f39691a0.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f39699i0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = sf1Var.f41191b;
                    if (i11 < arrayList2.size()) {
                        if (((jf1) arrayList2.get(i11)).f38044c != null) {
                            arrayList.add(((jf1) arrayList2.get(i11)).f38044c);
                            ((jf1) arrayList2.get(i11)).f38044c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f39699i0 = true;
                this.f39701k0.e(true, true);
                h21 h21Var2 = new h21(23, this, str);
                this.U = h21Var2;
                AndroidUtilities.runOnUIThread(h21Var2, 200L);
            }
        } else if (view instanceof t10) {
            t10 t10Var = (t10) view;
            t10Var.f41359c.b(0, false);
            t10Var.h(-sf1Var.f41188a, 0L, 0L, 0L, uf.g0.Z2[((kf1) this.f39703n0.f39339a.get(i10)).f38301b], false, str, z4);
        } else if (view instanceof org.telegram.ui.Components.dn0) {
            org.telegram.ui.Components.dn0 dn0Var = (org.telegram.ui.Components.dn0) view;
            dn0Var.f26309a.b(0, false);
            dn0Var.H = str;
            dn0Var.d(false);
        }
    }

    public final void L() {
        this.f39692b0 = -1;
        this.f39693c0 = -1;
        this.f39694d0 = -1;
        this.f39695e0 = -1;
        this.f39696f0 = -1;
        this.f39697g0 = -1;
        this.f39698h0 = 0;
        ArrayList arrayList = this.W;
        if (!arrayList.isEmpty()) {
            int i10 = this.f39698h0;
            int i11 = i10 + 1;
            this.f39698h0 = i11;
            this.f39692b0 = i10;
            this.f39693c0 = i11;
            int size = arrayList.size() + i11;
            this.f39698h0 = size;
            this.f39694d0 = size;
        }
        ArrayList arrayList2 = this.f39691a0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f39698h0;
            int i13 = i12 + 1;
            this.f39698h0 = i13;
            this.f39695e0 = i12;
            this.f39696f0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f39698h0 = size2;
            this.f39697g0 = size2;
        }
        this.T.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.p2) this.f39706q0).actionBar;
        kVar.O(null, null);
    }

    @Override
    public final boolean b(l10 l10Var) {
        if (l10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f39705p0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == l10Var.f38465b && messageObject.getDialogId() == l10Var.f38464a) {
                return true;
            }
            i10++;
        }
    }

    @Override
    public final void c(MessageObject messageObject) {
        int i10;
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
        sf1 sf1Var = this.f39706q0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        } else {
            bundle.putLong("user_id", dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        sf1Var.presentFragment(new xn(bundle));
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f39705p0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.p2) this.f39706q0).actionBar;
            kVar.r();
        }
    }

    @Override
    public final boolean f() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.p2) this.f39706q0).actionBar;
        return kVar.s();
    }
}
