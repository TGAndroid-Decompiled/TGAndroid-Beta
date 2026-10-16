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
public final class gg1 extends org.telegram.ui.Components.l91 implements a20 {
    public final FrameLayout T;
    public final org.telegram.ui.Components.mm0 U;
    public final s4.b0 V;
    public final dg1 W;
    public i11 f36196a0;
    public String f36197b0;
    public final ArrayList f36198c0;
    public final ArrayList f36199d0;
    public int f36200e0;
    public int f36201f0;
    public int f36202g0;
    public int f36203h0;
    public int f36204i0;
    public int f36205j0;
    public int f36206k0;
    public boolean f36207l0;
    public boolean m0;
    public final org.telegram.ui.Components.wx0 f36208n0;
    public final org.telegram.ui.Components.rl0 f36209o0;
    public boolean f36210p0;
    public final fg1 f36211q0;
    public final ow0 f36212r0;
    public final ArrayList f36213s0;
    public final kg1 f36214t0;

    public gg1(kg1 kg1Var, Context context) {
        super(context, null);
        this.f36214t0 = kg1Var;
        this.f36197b0 = "empty";
        this.f36198c0 = new ArrayList();
        this.f36199d0 = new ArrayList();
        this.f36213s0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        this.f36212r0 = new ow0(this, 7);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.U = mm0Var;
        dg1 dg1Var = new dg1(this);
        this.W = dg1Var;
        mm0Var.setAdapter(dg1Var);
        s4.b0 b0Var = new s4.b0();
        this.V = b0Var;
        mm0Var.setLayoutManager(b0Var);
        mm0Var.setOnItemClickListener(new i21(this, 12));
        mm0Var.setOnScrollListener(new ue1(this, 1));
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
        f10Var.setViewType(7);
        f10Var.f24549w = false;
        f10Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(context, f10Var, 1, null);
        this.f36208n0 = wx0Var;
        wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        wx0Var.e.setVisibility(8);
        wx0Var.setVisibility(8);
        wx0Var.addView(f10Var, 0);
        wx0Var.setAnimateLayoutChange(true);
        mm0Var.setEmptyView(wx0Var);
        mm0Var.W1 = true;
        mm0Var.X1 = 0;
        frameLayout.addView(wx0Var);
        frameLayout.addView(mm0Var);
        L();
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(mm0Var, true);
        this.f36209o0 = rl0Var;
        mm0Var.setItemsEnterAnimator(rl0Var);
        fg1 fg1Var = new fg1(this);
        this.f36211q0 = fg1Var;
        setAdapter(fg1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.f36210p0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        kg1 kg1Var = this.f36214t0;
        tL_messages_search.peer = kg1Var.getMessagesController().getInputPeer(-kg1Var.f37380a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f19025q = str;
        ArrayList arrayList = this.f36199d0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) i2.d.h(1, arrayList)).getId();
        }
        this.f36210p0 = true;
        i10 = ((org.telegram.ui.ActionBar.m2) kg1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new ec0(27, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.f36197b0 = str;
        FrameLayout frameLayout = this.T;
        kg1 kg1Var = this.f36214t0;
        int i11 = 0;
        if (view == frameLayout) {
            i11 i11Var = this.f36196a0;
            if (i11Var != null) {
                AndroidUtilities.cancelRunOnUIThread(i11Var);
                this.f36196a0 = null;
            }
            this.f36210p0 = false;
            this.m0 = false;
            ArrayList arrayList = this.f36198c0;
            arrayList.clear();
            this.f36199d0.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f36207l0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = kg1Var.f37383b;
                    if (i11 < arrayList2.size()) {
                        if (((bg1) arrayList2.get(i11)).f34328c != null) {
                            arrayList.add(((bg1) arrayList2.get(i11)).f34328c);
                            ((bg1) arrayList2.get(i11)).f34328c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f36207l0 = true;
                this.f36208n0.e(true, true);
                i11 i11Var2 = new i11(27, this, str);
                this.f36196a0 = i11Var2;
                AndroidUtilities.runOnUIThread(i11Var2, 200L);
            }
        } else if (view instanceof b20) {
            b20 b20Var = (b20) view;
            b20Var.f34165c.b(0, false);
            b20Var.h(-kg1Var.f37380a, 0L, 0L, 0L, hg.r0.f10718a3[((cg1) this.f36211q0.f35530a.get(i10)).f34662b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.xn0) {
            org.telegram.ui.Components.xn0 xn0Var = (org.telegram.ui.Components.xn0) view;
            xn0Var.f30965a.b(0, false);
            xn0Var.K = str;
            xn0Var.d(false);
        }
    }

    public final void L() {
        this.f36200e0 = -1;
        this.f36201f0 = -1;
        this.f36202g0 = -1;
        this.f36203h0 = -1;
        this.f36204i0 = -1;
        this.f36205j0 = -1;
        this.f36206k0 = 0;
        ArrayList arrayList = this.f36198c0;
        if (!arrayList.isEmpty()) {
            int i10 = this.f36206k0;
            int i11 = i10 + 1;
            this.f36206k0 = i11;
            this.f36200e0 = i10;
            this.f36201f0 = i11;
            int size = arrayList.size() + i11;
            this.f36206k0 = size;
            this.f36202g0 = size;
        }
        ArrayList arrayList2 = this.f36199d0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f36206k0;
            int i13 = i12 + 1;
            this.f36206k0 = i13;
            this.f36203h0 = i12;
            this.f36204i0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f36206k0 = size2;
            this.f36205j0 = size2;
        }
        this.W.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.m2) this.f36214t0).actionBar;
        kVar.O(null, null);
    }

    @Override
    public final boolean b(t10 t10Var) {
        if (t10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36213s0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == t10Var.f39981b && messageObject.getDialogId() == t10Var.f39980a) {
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
        kg1 kg1Var = this.f36214t0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.m2) kg1Var).currentAccount;
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
        kg1Var.presentFragment(new fo(bundle));
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f36213s0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.m2) this.f36214t0).actionBar;
            kVar.s();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.m2) this.f36214t0).actionBar;
        return kVar.t();
    }
}
