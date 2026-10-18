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
public final class pe1 extends org.telegram.ui.Components.c91 implements f10 {
    public final FrameLayout T;
    public final org.telegram.ui.Components.im0 U;
    public final s4.b0 V;
    public final me1 W;
    public m71 f40121a0;
    public String f40122b0;
    public final ArrayList f40123c0;
    public final ArrayList f40124d0;
    public int f40125e0;
    public int f40126f0;
    public int f40127g0;
    public int f40128h0;
    public int f40129i0;
    public int f40130j0;
    public int f40131k0;
    public boolean f40132l0;
    public boolean m0;
    public final org.telegram.ui.Components.rx0 f40133n0;
    public final org.telegram.ui.Components.nl0 f40134o0;
    public boolean f40135p0;
    public final oe1 f40136q0;
    public final mo0 f40137r0;
    public final ArrayList f40138s0;
    public final te1 f40139t0;

    public pe1(te1 te1Var, Context context) {
        super(context, null);
        this.f40139t0 = te1Var;
        this.f40122b0 = "empty";
        this.f40123c0 = new ArrayList();
        this.f40124d0 = new ArrayList();
        this.f40138s0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        this.f40137r0 = new mo0(this, 8);
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.U = im0Var;
        me1 me1Var = new me1(this);
        this.W = me1Var;
        im0Var.setAdapter(me1Var);
        s4.b0 b0Var = new s4.b0();
        this.V = b0Var;
        im0Var.setLayoutManager(b0Var);
        im0Var.setOnItemClickListener(new h11(this, 11));
        im0Var.setOnScrollListener(new dd1(this, 1));
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        b10Var.setViewType(7);
        b10Var.f24774w = false;
        b10Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.rx0 rx0Var = new org.telegram.ui.Components.rx0(context, b10Var, 1, null);
        this.f40133n0 = rx0Var;
        rx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        rx0Var.e.setVisibility(8);
        rx0Var.setVisibility(8);
        rx0Var.addView(b10Var, 0);
        rx0Var.setAnimateLayoutChange(true);
        im0Var.setEmptyView(rx0Var);
        im0Var.W1 = true;
        im0Var.X1 = 0;
        frameLayout.addView(rx0Var);
        frameLayout.addView(im0Var);
        L();
        org.telegram.ui.Components.nl0 nl0Var = new org.telegram.ui.Components.nl0(im0Var, true);
        this.f40134o0 = nl0Var;
        im0Var.setItemsEnterAnimator(nl0Var);
        oe1 oe1Var = new oe1(this);
        this.f40136q0 = oe1Var;
        setAdapter(oe1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.f40135p0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        te1 te1Var = this.f40139t0;
        tL_messages_search.peer = te1Var.getMessagesController().getInputPeer(-te1Var.f41705a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f20388q = str;
        ArrayList arrayList = this.f40124d0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) i2.d.h(1, arrayList)).getId();
        }
        this.f40135p0 = true;
        i10 = ((org.telegram.ui.ActionBar.n2) te1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new o71(4, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.f40122b0 = str;
        FrameLayout frameLayout = this.T;
        te1 te1Var = this.f40139t0;
        int i11 = 0;
        if (view == frameLayout) {
            m71 m71Var = this.f40121a0;
            if (m71Var != null) {
                AndroidUtilities.cancelRunOnUIThread(m71Var);
                this.f40121a0 = null;
            }
            this.f40135p0 = false;
            this.m0 = false;
            ArrayList arrayList = this.f40123c0;
            arrayList.clear();
            this.f40124d0.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f40132l0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = te1Var.f41708b;
                    if (i11 < arrayList2.size()) {
                        if (((ke1) arrayList2.get(i11)).f38515c != null) {
                            arrayList.add(((ke1) arrayList2.get(i11)).f38515c);
                            ((ke1) arrayList2.get(i11)).f38515c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f40132l0 = true;
                this.f40133n0.e(true, true);
                m71 m71Var2 = new m71(13, this, str);
                this.f40121a0 = m71Var2;
                AndroidUtilities.runOnUIThread(m71Var2, 200L);
            }
        } else if (view instanceof g10) {
            g10 g10Var = (g10) view;
            g10Var.f37055c.b(0, false);
            g10Var.h(-te1Var.f41705a, 0L, 0L, 0L, hg.q0.f12018a3[((le1) this.f40136q0.f39780a.get(i10)).f38853b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.tn0) {
            org.telegram.ui.Components.tn0 tn0Var = (org.telegram.ui.Components.tn0) view;
            tn0Var.f30675a.b(0, false);
            tn0Var.K = str;
            tn0Var.d(false);
        }
    }

    public final void L() {
        this.f40125e0 = -1;
        this.f40126f0 = -1;
        this.f40127g0 = -1;
        this.f40128h0 = -1;
        this.f40129i0 = -1;
        this.f40130j0 = -1;
        this.f40131k0 = 0;
        ArrayList arrayList = this.f40123c0;
        if (!arrayList.isEmpty()) {
            int i10 = this.f40131k0;
            int i11 = i10 + 1;
            this.f40131k0 = i11;
            this.f40125e0 = i10;
            this.f40126f0 = i11;
            int size = arrayList.size() + i11;
            this.f40131k0 = size;
            this.f40127g0 = size;
        }
        ArrayList arrayList2 = this.f40124d0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f40131k0;
            int i13 = i12 + 1;
            this.f40131k0 = i13;
            this.f40128h0 = i12;
            this.f40129i0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f40131k0 = size2;
            this.f40130j0 = size2;
        }
        this.W.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f40139t0).actionBar;
        kVar.O(null, null);
    }

    @Override
    public final boolean b(y00 y00Var) {
        if (y00Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f40138s0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == y00Var.f43326b && messageObject.getDialogId() == y00Var.f43325a) {
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
        te1 te1Var = this.f40139t0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.n2) te1Var).currentAccount;
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
        te1Var.presentFragment(new sn(bundle));
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f40138s0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.n2) this.f40139t0).actionBar;
            kVar.r();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f40139t0).actionBar;
        return kVar.s();
    }
}
