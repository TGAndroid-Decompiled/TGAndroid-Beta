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
public final class eg1 extends org.telegram.ui.Components.v81 implements y10 {
    public final FrameLayout T;
    public final org.telegram.ui.Components.vl0 U;
    public final s4.c0 V;
    public final bg1 W;
    public r91 f32187a0;
    public String f32188b0;
    public final ArrayList f32189c0;
    public final ArrayList f32190d0;
    public int f32191e0;
    public int f32192f0;
    public int f32193g0;
    public int f32194h0;
    public int f32195i0;
    public int f32196j0;
    public int f32197k0;
    public boolean f32198l0;
    public boolean m0;
    public final org.telegram.ui.Components.jx0 f32199n0;
    public final org.telegram.ui.Components.zk0 f32200o0;
    public boolean f32201p0;
    public final dg1 f32202q0;
    public final lw0 f32203r0;
    public final ArrayList f32204s0;
    public final ig1 f32205t0;

    public eg1(ig1 ig1Var, Context context) {
        super(context, null);
        this.f32205t0 = ig1Var;
        this.f32188b0 = "empty";
        this.f32189c0 = new ArrayList();
        this.f32190d0 = new ArrayList();
        this.f32204s0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        this.f32203r0 = new lw0(this, 7);
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.U = vl0Var;
        bg1 bg1Var = new bg1(this);
        this.W = bg1Var;
        vl0Var.setAdapter(bg1Var);
        s4.c0 c0Var = new s4.c0();
        this.V = c0Var;
        vl0Var.setLayoutManager(c0Var);
        vl0Var.setOnItemClickListener(new f31(this, 10));
        vl0Var.setOnScrollListener(new se1(this, 1));
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, null);
        a10Var.setViewType(7);
        a10Var.f21345w = false;
        a10Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.jx0 jx0Var = new org.telegram.ui.Components.jx0(context, a10Var, 1, null);
        this.f32199n0 = jx0Var;
        jx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        jx0Var.e.setVisibility(8);
        jx0Var.setVisibility(8);
        jx0Var.addView(a10Var, 0);
        jx0Var.setAnimateLayoutChange(true);
        vl0Var.setEmptyView(jx0Var);
        vl0Var.Y1 = true;
        vl0Var.Z1 = 0;
        frameLayout.addView(jx0Var);
        frameLayout.addView(vl0Var);
        L();
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(vl0Var, true);
        this.f32200o0 = zk0Var;
        vl0Var.setItemsEnterAnimator(zk0Var);
        dg1 dg1Var = new dg1(this);
        this.f32202q0 = dg1Var;
        setAdapter(dg1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.f32201p0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        ig1 ig1Var = this.f32205t0;
        tL_messages_search.peer = ig1Var.getMessagesController().getInputPeer(-ig1Var.f33681a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f17304q = str;
        ArrayList arrayList = this.f32190d0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) hc.b.i(1, arrayList)).getId();
        }
        this.f32201p0 = true;
        i10 = ((org.telegram.ui.ActionBar.p2) ig1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new rg0(22, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.f32188b0 = str;
        FrameLayout frameLayout = this.T;
        ig1 ig1Var = this.f32205t0;
        int i11 = 0;
        if (view == frameLayout) {
            r91 r91Var = this.f32187a0;
            if (r91Var != null) {
                AndroidUtilities.cancelRunOnUIThread(r91Var);
                this.f32187a0 = null;
            }
            this.f32201p0 = false;
            this.m0 = false;
            ArrayList arrayList = this.f32189c0;
            arrayList.clear();
            this.f32190d0.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f32198l0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = ig1Var.f33684b;
                    if (i11 < arrayList2.size()) {
                        if (((zf1) arrayList2.get(i11)).f39309c != null) {
                            arrayList.add(((zf1) arrayList2.get(i11)).f39309c);
                            ((zf1) arrayList2.get(i11)).f39309c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f32198l0 = true;
                this.f32199n0.e(true, true);
                r91 r91Var2 = new r91(10, this, str);
                this.f32187a0 = r91Var2;
                AndroidUtilities.runOnUIThread(r91Var2, 200L);
            }
        } else if (view instanceof z10) {
            z10 z10Var = (z10) view;
            z10Var.f39164c.b(0, false);
            z10Var.h(-ig1Var.f33681a, 0L, 0L, 0L, fg.s0.f8199c3[((ag1) this.f32202q0.f31905a.get(i10)).f31004b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.fn0) {
            org.telegram.ui.Components.fn0 fn0Var = (org.telegram.ui.Components.fn0) view;
            fn0Var.f23039a.b(0, false);
            fn0Var.K = str;
            fn0Var.d(false);
        }
    }

    public final void L() {
        this.f32191e0 = -1;
        this.f32192f0 = -1;
        this.f32193g0 = -1;
        this.f32194h0 = -1;
        this.f32195i0 = -1;
        this.f32196j0 = -1;
        this.f32197k0 = 0;
        ArrayList arrayList = this.f32189c0;
        if (!arrayList.isEmpty()) {
            int i10 = this.f32197k0;
            int i11 = i10 + 1;
            this.f32197k0 = i11;
            this.f32191e0 = i10;
            this.f32192f0 = i11;
            int size = arrayList.size() + i11;
            this.f32197k0 = size;
            this.f32193g0 = size;
        }
        ArrayList arrayList2 = this.f32190d0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f32197k0;
            int i13 = i12 + 1;
            this.f32197k0 = i13;
            this.f32194h0 = i12;
            this.f32195i0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f32197k0 = size2;
            this.f32196j0 = size2;
        }
        this.W.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.p2) this.f32205t0).actionBar;
        lVar.O(null, null);
    }

    @Override
    public final boolean b(r10 r10Var) {
        if (r10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f32204s0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == r10Var.f36169b && messageObject.getDialogId() == r10Var.f36168a) {
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
        ig1 ig1Var = this.f32205t0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.p2) ig1Var).currentAccount;
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
        ig1Var.presentFragment(new eo(bundle));
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        ArrayList arrayList = this.f32204s0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            lVar = ((org.telegram.ui.ActionBar.p2) this.f32205t0).actionBar;
            lVar.r();
        }
    }

    @Override
    public final boolean f() {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.p2) this.f32205t0).actionBar;
        return lVar.s();
    }
}
