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
public final class ag1 extends org.telegram.ui.Components.p91 implements u10 {
    public final FrameLayout T;
    public final org.telegram.ui.Components.rm0 U;
    public final s4.d0 V;
    public final xf1 W;
    public m31 f36104a0;
    public String f36105b0;
    public final ArrayList f36106c0;
    public final ArrayList f36107d0;
    public int f36108e0;
    public int f36109f0;
    public int f36110g0;
    public int f36111h0;
    public int f36112i0;
    public int f36113j0;
    public int f36114k0;
    public boolean f36115l0;
    public boolean m0;
    public final org.telegram.ui.Components.by0 f36116n0;
    public final org.telegram.ui.Components.wl0 f36117o0;
    public boolean f36118p0;
    public final zf1 f36119q0;
    public final iw0 f36120r0;
    public final ArrayList f36121s0;
    public final eg1 f36122t0;

    public ag1(eg1 eg1Var, Context context) {
        super(context, null);
        this.f36122t0 = eg1Var;
        this.f36105b0 = "empty";
        this.f36106c0 = new ArrayList();
        this.f36107d0 = new ArrayList();
        this.f36121s0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        this.f36120r0 = new iw0(this, 7);
        org.telegram.ui.Components.rm0 rm0Var = new org.telegram.ui.Components.rm0(context, null);
        this.U = rm0Var;
        xf1 xf1Var = new xf1(this);
        this.W = xf1Var;
        rm0Var.setAdapter(xf1Var);
        s4.d0 d0Var = new s4.d0();
        this.V = d0Var;
        rm0Var.setLayoutManager(d0Var);
        rm0Var.setOnItemClickListener(new y21(this, 11));
        rm0Var.setOnScrollListener(new oe1(this, 1));
        org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(context, null);
        k10Var.setViewType(7);
        k10Var.f27916w = false;
        k10Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.by0 by0Var = new org.telegram.ui.Components.by0(context, k10Var, 1, null);
        this.f36116n0 = by0Var;
        by0Var.d.setText(LocaleController.getString(R.string.NoResult));
        by0Var.f25123e.setVisibility(8);
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
        this.f36117o0 = wl0Var;
        rm0Var.setItemsEnterAnimator(wl0Var);
        zf1 zf1Var = new zf1(this);
        this.f36119q0 = zf1Var;
        setAdapter(zf1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.f36118p0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        eg1 eg1Var = this.f36122t0;
        tL_messages_search.peer = eg1Var.getMessagesController().getInputPeer(-eg1Var.f37345a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f20177q = str;
        ArrayList arrayList = this.f36107d0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) hg.c.g(1, arrayList)).getId();
        }
        this.f36118p0 = true;
        i10 = ((org.telegram.ui.ActionBar.m2) eg1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new zb0(27, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.f36105b0 = str;
        FrameLayout frameLayout = this.T;
        eg1 eg1Var = this.f36122t0;
        int i11 = 0;
        if (view == frameLayout) {
            m31 m31Var = this.f36104a0;
            if (m31Var != null) {
                AndroidUtilities.cancelRunOnUIThread(m31Var);
                this.f36104a0 = null;
            }
            this.f36118p0 = false;
            this.m0 = false;
            ArrayList arrayList = this.f36106c0;
            arrayList.clear();
            this.f36107d0.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f36115l0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = eg1Var.f37348b;
                    if (i11 < arrayList2.size()) {
                        if (((vf1) arrayList2.get(i11)).f43040c != null) {
                            arrayList.add(((vf1) arrayList2.get(i11)).f43040c);
                            ((vf1) arrayList2.get(i11)).f43040c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f36115l0 = true;
                this.f36116n0.e(true, true);
                m31 m31Var2 = new m31(20, this, str);
                this.f36104a0 = m31Var2;
                AndroidUtilities.runOnUIThread(m31Var2, 200L);
            }
        } else if (view instanceof v10) {
            v10 v10Var = (v10) view;
            v10Var.f42866c.b(0, false);
            v10Var.h(-eg1Var.f37345a, 0L, 0L, 0L, gg.r0.f10778a3[((wf1) this.f36119q0.f44689a.get(i10)).f43802b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.co0) {
            org.telegram.ui.Components.co0 co0Var = (org.telegram.ui.Components.co0) view;
            co0Var.f25403a.b(0, false);
            co0Var.K = str;
            co0Var.d(false);
        }
    }

    public final void L() {
        this.f36108e0 = -1;
        this.f36109f0 = -1;
        this.f36110g0 = -1;
        this.f36111h0 = -1;
        this.f36112i0 = -1;
        this.f36113j0 = -1;
        this.f36114k0 = 0;
        ArrayList arrayList = this.f36106c0;
        if (!arrayList.isEmpty()) {
            int i10 = this.f36114k0;
            int i11 = i10 + 1;
            this.f36114k0 = i11;
            this.f36108e0 = i10;
            this.f36109f0 = i11;
            int size = arrayList.size() + i11;
            this.f36114k0 = size;
            this.f36110g0 = size;
        }
        ArrayList arrayList2 = this.f36107d0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f36114k0;
            int i13 = i12 + 1;
            this.f36114k0 = i13;
            this.f36111h0 = i12;
            this.f36112i0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f36114k0 = size2;
            this.f36113j0 = size2;
        }
        this.W.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.m2) this.f36122t0).actionBar;
        kVar.O(null, null);
    }

    @Override
    public final boolean c(n10 n10Var) {
        if (n10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36121s0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == n10Var.f40145b && messageObject.getDialogId() == n10Var.f40144a) {
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
        eg1 eg1Var = this.f36122t0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.m2) eg1Var).currentAccount;
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
        eg1Var.presentFragment(new zn(bundle));
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f36121s0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.m2) this.f36122t0).actionBar;
            kVar.s();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.m2) this.f36122t0).actionBar;
        return kVar.t();
    }
}
