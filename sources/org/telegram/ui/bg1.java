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
public final class bg1 extends org.telegram.ui.Components.p91 implements v10 {
    public final FrameLayout T;
    public final org.telegram.ui.Components.rm0 U;
    public final s4.d0 V;
    public final yf1 W;
    public n31 f36357a0;
    public String f36358b0;
    public final ArrayList f36359c0;
    public final ArrayList f36360d0;
    public int f36361e0;
    public int f36362f0;
    public int f36363g0;
    public int f36364h0;
    public int f36365i0;
    public int f36366j0;
    public int f36367k0;
    public boolean f36368l0;
    public boolean m0;
    public final org.telegram.ui.Components.by0 f36369n0;
    public final org.telegram.ui.Components.wl0 f36370o0;
    public boolean f36371p0;
    public final ag1 f36372q0;
    public final jw0 f36373r0;
    public final ArrayList f36374s0;
    public final fg1 f36375t0;

    public bg1(fg1 fg1Var, Context context) {
        super(context, null);
        this.f36375t0 = fg1Var;
        this.f36358b0 = "empty";
        this.f36359c0 = new ArrayList();
        this.f36360d0 = new ArrayList();
        this.f36374s0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        this.f36373r0 = new jw0(this, 7);
        org.telegram.ui.Components.rm0 rm0Var = new org.telegram.ui.Components.rm0(context, null);
        this.U = rm0Var;
        yf1 yf1Var = new yf1(this);
        this.W = yf1Var;
        rm0Var.setAdapter(yf1Var);
        s4.d0 d0Var = new s4.d0();
        this.V = d0Var;
        rm0Var.setLayoutManager(d0Var);
        rm0Var.setOnItemClickListener(new z21(this, 11));
        rm0Var.setOnScrollListener(new pe1(this, 1));
        org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(context, null);
        k10Var.setViewType(7);
        k10Var.f27857w = false;
        k10Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.by0 by0Var = new org.telegram.ui.Components.by0(context, k10Var, 1, null);
        this.f36369n0 = by0Var;
        by0Var.d.setText(LocaleController.getString(R.string.NoResult));
        by0Var.f25085e.setVisibility(8);
        by0Var.setVisibility(8);
        by0Var.addView(k10Var, 0);
        by0Var.setAnimateLayoutChange(true);
        rm0Var.setEmptyView(by0Var);
        rm0Var.W1 = true;
        rm0Var.X1 = 0;
        frameLayout.addView(by0Var);
        frameLayout.addView(rm0Var);
        L();
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(rm0Var, true);
        this.f36370o0 = wl0Var;
        rm0Var.setItemsEnterAnimator(wl0Var);
        ag1 ag1Var = new ag1(this);
        this.f36372q0 = ag1Var;
        setAdapter(ag1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.f36371p0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        fg1 fg1Var = this.f36375t0;
        tL_messages_search.peer = fg1Var.getMessagesController().getInputPeer(-fg1Var.f37602a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f20151q = str;
        ArrayList arrayList = this.f36360d0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) hg.c.g(1, arrayList)).getId();
        }
        this.f36371p0 = true;
        i10 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new ac0(27, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.f36358b0 = str;
        FrameLayout frameLayout = this.T;
        fg1 fg1Var = this.f36375t0;
        int i11 = 0;
        if (view == frameLayout) {
            n31 n31Var = this.f36357a0;
            if (n31Var != null) {
                AndroidUtilities.cancelRunOnUIThread(n31Var);
                this.f36357a0 = null;
            }
            this.f36371p0 = false;
            this.m0 = false;
            ArrayList arrayList = this.f36359c0;
            arrayList.clear();
            this.f36360d0.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f36368l0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = fg1Var.f37605b;
                    if (i11 < arrayList2.size()) {
                        if (((wf1) arrayList2.get(i11)).f43614c != null) {
                            arrayList.add(((wf1) arrayList2.get(i11)).f43614c);
                            ((wf1) arrayList2.get(i11)).f43614c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f36368l0 = true;
                this.f36369n0.e(true, true);
                n31 n31Var2 = new n31(21, this, str);
                this.f36357a0 = n31Var2;
                AndroidUtilities.runOnUIThread(n31Var2, 200L);
            }
        } else if (view instanceof w10) {
            w10 w10Var = (w10) view;
            w10Var.f43090c.b(0, false);
            w10Var.h(-fg1Var.f37602a, 0L, 0L, 0L, gg.r0.f10779a3[((xf1) this.f36372q0.f35971a.get(i10)).f44071b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.co0) {
            org.telegram.ui.Components.co0 co0Var = (org.telegram.ui.Components.co0) view;
            co0Var.f25341a.b(0, false);
            co0Var.K = str;
            co0Var.d(false);
        }
    }

    public final void L() {
        this.f36361e0 = -1;
        this.f36362f0 = -1;
        this.f36363g0 = -1;
        this.f36364h0 = -1;
        this.f36365i0 = -1;
        this.f36366j0 = -1;
        this.f36367k0 = 0;
        ArrayList arrayList = this.f36359c0;
        if (!arrayList.isEmpty()) {
            int i10 = this.f36367k0;
            int i11 = i10 + 1;
            this.f36367k0 = i11;
            this.f36361e0 = i10;
            this.f36362f0 = i11;
            int size = arrayList.size() + i11;
            this.f36367k0 = size;
            this.f36363g0 = size;
        }
        ArrayList arrayList2 = this.f36360d0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f36367k0;
            int i13 = i12 + 1;
            this.f36367k0 = i13;
            this.f36364h0 = i12;
            this.f36365i0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f36367k0 = size2;
            this.f36366j0 = size2;
        }
        this.W.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f36375t0).actionBar;
        kVar.O(null, null);
    }

    @Override
    public final boolean c(o10 o10Var) {
        if (o10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36374s0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == o10Var.f40444b && messageObject.getDialogId() == o10Var.f40443a) {
                return true;
            }
            i10++;
        }
    }

    @Override
    public final void d(MessageObject messageObject) {
        int i10;
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
        fg1 fg1Var = this.f36375t0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
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
        fg1Var.presentFragment(new zn(bundle));
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f36374s0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.n2) this.f36375t0).actionBar;
            kVar.s();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f36375t0).actionBar;
        return kVar.t();
    }
}
