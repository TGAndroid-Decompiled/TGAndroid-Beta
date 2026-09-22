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
public final class ag1 extends org.telegram.ui.Components.i81 implements w10 {
    public final FrameLayout T;
    public final org.telegram.ui.Components.ll0 U;
    public final s4.c0 V;
    public final xf1 W;
    public pb1 f31805a0;
    public String f31806b0;
    public final ArrayList f31807c0;
    public final ArrayList f31808d0;
    public int f31809e0;
    public int f31810f0;
    public int f31811g0;
    public int f31812h0;
    public int f31813i0;
    public int f31814j0;
    public int f31815k0;
    public boolean f31816l0;
    public boolean m0;
    public final org.telegram.ui.Components.yw0 f31817n0;
    public final org.telegram.ui.Components.qk0 f31818o0;
    public boolean f31819p0;
    public final zf1 f31820q0;
    public final jw0 f31821r0;
    public final ArrayList f31822s0;
    public final eg1 f31823t0;

    public ag1(eg1 eg1Var, Context context) {
        super(context, null);
        this.f31823t0 = eg1Var;
        this.f31806b0 = "empty";
        this.f31807c0 = new ArrayList();
        this.f31808d0 = new ArrayList();
        this.f31822s0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        this.f31821r0 = new jw0(this, 7);
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.U = ll0Var;
        xf1 xf1Var = new xf1(this);
        this.W = xf1Var;
        ll0Var.setAdapter(xf1Var);
        s4.c0 c0Var = new s4.c0();
        this.V = c0Var;
        ll0Var.setLayoutManager(c0Var);
        ll0Var.setOnItemClickListener(new a31(this, 10));
        ll0Var.setOnScrollListener(new oe1(this, 1));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(7);
        t00Var.f28015w = false;
        t00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.yw0 yw0Var = new org.telegram.ui.Components.yw0(context, t00Var, 1, null);
        this.f31817n0 = yw0Var;
        yw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        yw0Var.e.setVisibility(8);
        yw0Var.setVisibility(8);
        yw0Var.addView(t00Var, 0);
        yw0Var.setAnimateLayoutChange(true);
        ll0Var.setEmptyView(yw0Var);
        ll0Var.Y1 = true;
        ll0Var.Z1 = 0;
        frameLayout.addView(yw0Var);
        frameLayout.addView(ll0Var);
        L();
        org.telegram.ui.Components.qk0 qk0Var = new org.telegram.ui.Components.qk0(ll0Var, true);
        this.f31818o0 = qk0Var;
        ll0Var.setItemsEnterAnimator(qk0Var);
        zf1 zf1Var = new zf1(this);
        this.f31820q0 = zf1Var;
        setAdapter(zf1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.f31819p0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        eg1 eg1Var = this.f31823t0;
        tL_messages_search.peer = eg1Var.getMessagesController().getInputPeer(-eg1Var.f33291a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f18218q = str;
        ArrayList arrayList = this.f31808d0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) hg.c.h(1, arrayList)).getId();
        }
        this.f31819p0 = true;
        i10 = ((org.telegram.ui.ActionBar.n2) eg1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new bc0(27, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.f31806b0 = str;
        FrameLayout frameLayout = this.T;
        eg1 eg1Var = this.f31823t0;
        int i11 = 0;
        if (view == frameLayout) {
            pb1 pb1Var = this.f31805a0;
            if (pb1Var != null) {
                AndroidUtilities.cancelRunOnUIThread(pb1Var);
                this.f31805a0 = null;
            }
            this.f31819p0 = false;
            this.m0 = false;
            ArrayList arrayList = this.f31807c0;
            arrayList.clear();
            this.f31808d0.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f31816l0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = eg1Var.f33294b;
                    if (i11 < arrayList2.size()) {
                        if (((vf1) arrayList2.get(i11)).f38528c != null) {
                            arrayList.add(((vf1) arrayList2.get(i11)).f38528c);
                            ((vf1) arrayList2.get(i11)).f38528c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f31816l0 = true;
                this.f31817n0.e(true, true);
                pb1 pb1Var2 = new pb1(7, this, str);
                this.f31805a0 = pb1Var2;
                AndroidUtilities.runOnUIThread(pb1Var2, 200L);
            }
        } else if (view instanceof x10) {
            x10 x10Var = (x10) view;
            x10Var.f39439c.b(0, false);
            x10Var.h(-eg1Var.f33291a, 0L, 0L, 0L, gg.s0.f9911c3[((wf1) this.f31820q0.f40195a.get(i10)).f39192b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.vm0) {
            org.telegram.ui.Components.vm0 vm0Var = (org.telegram.ui.Components.vm0) view;
            vm0Var.f28829a.b(0, false);
            vm0Var.K = str;
            vm0Var.d(false);
        }
    }

    public final void L() {
        this.f31809e0 = -1;
        this.f31810f0 = -1;
        this.f31811g0 = -1;
        this.f31812h0 = -1;
        this.f31813i0 = -1;
        this.f31814j0 = -1;
        this.f31815k0 = 0;
        ArrayList arrayList = this.f31807c0;
        if (!arrayList.isEmpty()) {
            int i10 = this.f31815k0;
            int i11 = i10 + 1;
            this.f31815k0 = i11;
            this.f31809e0 = i10;
            this.f31810f0 = i11;
            int size = arrayList.size() + i11;
            this.f31815k0 = size;
            this.f31811g0 = size;
        }
        ArrayList arrayList2 = this.f31808d0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f31815k0;
            int i13 = i12 + 1;
            this.f31815k0 = i13;
            this.f31812h0 = i12;
            this.f31813i0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f31815k0 = size2;
            this.f31814j0 = size2;
        }
        this.W.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f31823t0).actionBar;
        kVar.O(null, null);
    }

    @Override
    public final boolean c(p10 p10Var) {
        if (p10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f31822s0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == p10Var.f36393b && messageObject.getDialogId() == p10Var.f36392a) {
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
        eg1 eg1Var = this.f31823t0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.n2) eg1Var).currentAccount;
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
        eg1Var.presentFragment(new bo(bundle));
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f31822s0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.n2) this.f31823t0).actionBar;
            kVar.r();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f31823t0).actionBar;
        return kVar.s();
    }
}
