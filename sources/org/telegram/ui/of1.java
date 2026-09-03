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
public final class of1 extends org.telegram.ui.Components.l81 implements t10 {
    public final FrameLayout Q;
    public final org.telegram.ui.Components.rl0 R;
    public final f2.i0 S;
    public final lf1 T;
    public b11 U;
    public String V;
    public final ArrayList W;
    public final ArrayList f36777a0;
    public int f36778b0;
    public int f36779c0;
    public int f36780d0;
    public int f36781e0;
    public int f36782f0;
    public int f36783g0;
    public int f36784h0;
    public boolean f36785i0;
    public boolean f36786j0;
    public final org.telegram.ui.Components.zw0 f36787k0;
    public final org.telegram.ui.Components.yk0 f36788l0;
    public boolean m0;
    public final nf1 f36789n0;
    public final vv0 f36790o0;
    public final ArrayList f36791p0;
    public final sf1 f36792q0;

    public of1(sf1 sf1Var, Context context) {
        super(context, null);
        this.f36792q0 = sf1Var;
        this.V = "empty";
        this.W = new ArrayList();
        this.f36777a0 = new ArrayList();
        this.f36791p0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        this.f36790o0 = new vv0(this, 7);
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.R = rl0Var;
        lf1 lf1Var = new lf1(this);
        this.T = lf1Var;
        rl0Var.setAdapter(lf1Var);
        f2.i0 i0Var = new f2.i0();
        this.S = i0Var;
        rl0Var.setLayoutManager(i0Var);
        rl0Var.setOnItemClickListener(new p21(this, 10));
        rl0Var.setOnScrollListener(new be1(this, 1));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        u00Var.setViewType(7);
        u00Var.f29071w = false;
        u00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, u00Var, 1, null);
        this.f36787k0 = zw0Var;
        zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        zw0Var.e.setVisibility(8);
        zw0Var.setVisibility(8);
        zw0Var.addView(u00Var, 0);
        zw0Var.setAnimateLayoutChange(true);
        rl0Var.setEmptyView(zw0Var);
        rl0Var.V1 = true;
        rl0Var.W1 = 0;
        frameLayout.addView(zw0Var);
        frameLayout.addView(rl0Var);
        L();
        org.telegram.ui.Components.yk0 yk0Var = new org.telegram.ui.Components.yk0(rl0Var, true);
        this.f36788l0 = yk0Var;
        rl0Var.setItemsEnterAnimator(yk0Var);
        nf1 nf1Var = new nf1(this);
        this.f36789n0 = nf1Var;
        setAdapter(nf1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.m0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        sf1 sf1Var = this.f36792q0;
        tL_messages_search.peer = sf1Var.getMessagesController().getInputPeer(-sf1Var.f38175a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f19268q = str;
        ArrayList arrayList = this.f36777a0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) kf.k0.i(1, arrayList)).getId();
        }
        this.m0 = true;
        i10 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new ub0(27, this, str));
    }

    public final void K(View view, int i10, String str, boolean z4) {
        this.V = str;
        FrameLayout frameLayout = this.Q;
        sf1 sf1Var = this.f36792q0;
        int i11 = 0;
        if (view == frameLayout) {
            b11 b11Var = this.U;
            if (b11Var != null) {
                AndroidUtilities.cancelRunOnUIThread(b11Var);
                this.U = null;
            }
            this.m0 = false;
            this.f36786j0 = false;
            ArrayList arrayList = this.W;
            arrayList.clear();
            this.f36777a0.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f36785i0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = sf1Var.f38178b;
                    if (i11 < arrayList2.size()) {
                        if (((jf1) arrayList2.get(i11)).f35268c != null) {
                            arrayList.add(((jf1) arrayList2.get(i11)).f35268c);
                            ((jf1) arrayList2.get(i11)).f35268c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f36785i0 = true;
                this.f36787k0.e(true, true);
                b11 b11Var2 = new b11(24, this, str);
                this.U = b11Var2;
                AndroidUtilities.runOnUIThread(b11Var2, 200L);
            }
        } else if (view instanceof u10) {
            u10 u10Var = (u10) view;
            u10Var.f38642c.b(0, false);
            u10Var.h(-sf1Var.f38175a, 0L, 0L, 0L, tf.g0.Z2[((kf1) this.f36789n0.f36506a.get(i10)).f35531b], false, str, z4);
        } else if (view instanceof org.telegram.ui.Components.cn0) {
            org.telegram.ui.Components.cn0 cn0Var = (org.telegram.ui.Components.cn0) view;
            cn0Var.f23973a.b(0, false);
            cn0Var.H = str;
            cn0Var.d(false);
        }
    }

    public final void L() {
        this.f36778b0 = -1;
        this.f36779c0 = -1;
        this.f36780d0 = -1;
        this.f36781e0 = -1;
        this.f36782f0 = -1;
        this.f36783g0 = -1;
        this.f36784h0 = 0;
        ArrayList arrayList = this.W;
        if (!arrayList.isEmpty()) {
            int i10 = this.f36784h0;
            int i11 = i10 + 1;
            this.f36784h0 = i11;
            this.f36778b0 = i10;
            this.f36779c0 = i11;
            int size = arrayList.size() + i11;
            this.f36784h0 = size;
            this.f36780d0 = size;
        }
        ArrayList arrayList2 = this.f36777a0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f36784h0;
            int i13 = i12 + 1;
            this.f36784h0 = i13;
            this.f36781e0 = i12;
            this.f36782f0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f36784h0 = size2;
            this.f36783g0 = size2;
        }
        this.T.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.p2) this.f36792q0).actionBar;
        kVar.O(null, null);
    }

    @Override
    public final boolean b(m10 m10Var) {
        if (m10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36791p0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == m10Var.f35954b && messageObject.getDialogId() == m10Var.f35953a) {
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
        sf1 sf1Var = this.f36792q0;
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
        sf1Var.presentFragment(new zn(bundle));
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f36791p0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.p2) this.f36792q0).actionBar;
            kVar.r();
        }
    }

    @Override
    public final boolean f() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.p2) this.f36792q0).actionBar;
        return kVar.s();
    }
}
