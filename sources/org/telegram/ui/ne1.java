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
public final class ne1 extends org.telegram.ui.Components.d91 implements d10 {
    public final FrameLayout T;
    public final org.telegram.ui.Components.im0 U;
    public final s4.b0 V;
    public final ke1 W;
    public k71 f39557a0;
    public String f39558b0;
    public final ArrayList f39559c0;
    public final ArrayList f39560d0;
    public int f39561e0;
    public int f39562f0;
    public int f39563g0;
    public int f39564h0;
    public int f39565i0;
    public int f39566j0;
    public int f39567k0;
    public boolean f39568l0;
    public boolean m0;
    public final org.telegram.ui.Components.sx0 f39569n0;
    public final org.telegram.ui.Components.nl0 f39570o0;
    public boolean f39571p0;
    public final me1 f39572q0;
    public final ko0 f39573r0;
    public final ArrayList f39574s0;
    public final re1 f39575t0;

    public ne1(re1 re1Var, Context context) {
        super(context, null);
        this.f39575t0 = re1Var;
        this.f39558b0 = "empty";
        this.f39559c0 = new ArrayList();
        this.f39560d0 = new ArrayList();
        this.f39574s0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        this.f39573r0 = new ko0(this, 8);
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.U = im0Var;
        ke1 ke1Var = new ke1(this);
        this.W = ke1Var;
        im0Var.setAdapter(ke1Var);
        s4.b0 b0Var = new s4.b0();
        this.V = b0Var;
        im0Var.setLayoutManager(b0Var);
        im0Var.setOnItemClickListener(new f11(this, 11));
        im0Var.setOnScrollListener(new bd1(this, 1));
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        b10Var.setViewType(7);
        b10Var.f24770w = false;
        b10Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.sx0 sx0Var = new org.telegram.ui.Components.sx0(context, b10Var, 1, null);
        this.f39569n0 = sx0Var;
        sx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        sx0Var.e.setVisibility(8);
        sx0Var.setVisibility(8);
        sx0Var.addView(b10Var, 0);
        sx0Var.setAnimateLayoutChange(true);
        im0Var.setEmptyView(sx0Var);
        im0Var.W1 = true;
        im0Var.X1 = 0;
        frameLayout.addView(sx0Var);
        frameLayout.addView(im0Var);
        L();
        org.telegram.ui.Components.nl0 nl0Var = new org.telegram.ui.Components.nl0(im0Var, true);
        this.f39570o0 = nl0Var;
        im0Var.setItemsEnterAnimator(nl0Var);
        me1 me1Var = new me1(this);
        this.f39572q0 = me1Var;
        setAdapter(me1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.f39571p0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        re1 re1Var = this.f39575t0;
        tL_messages_search.peer = re1Var.getMessagesController().getInputPeer(-re1Var.f41142a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f20382q = str;
        ArrayList arrayList = this.f39560d0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) i2.e.h(1, arrayList)).getId();
        }
        this.f39571p0 = true;
        i10 = ((org.telegram.ui.ActionBar.n2) re1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new m71(4, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.f39558b0 = str;
        FrameLayout frameLayout = this.T;
        re1 re1Var = this.f39575t0;
        int i11 = 0;
        if (view == frameLayout) {
            k71 k71Var = this.f39557a0;
            if (k71Var != null) {
                AndroidUtilities.cancelRunOnUIThread(k71Var);
                this.f39557a0 = null;
            }
            this.f39571p0 = false;
            this.m0 = false;
            ArrayList arrayList = this.f39559c0;
            arrayList.clear();
            this.f39560d0.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f39568l0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = re1Var.f41145b;
                    if (i11 < arrayList2.size()) {
                        if (((ie1) arrayList2.get(i11)).f37952c != null) {
                            arrayList.add(((ie1) arrayList2.get(i11)).f37952c);
                            ((ie1) arrayList2.get(i11)).f37952c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f39568l0 = true;
                this.f39569n0.e(true, true);
                k71 k71Var2 = new k71(13, this, str);
                this.f39557a0 = k71Var2;
                AndroidUtilities.runOnUIThread(k71Var2, 200L);
            }
        } else if (view instanceof e10) {
            e10 e10Var = (e10) view;
            e10Var.f36489c.b(0, false);
            e10Var.h(-re1Var.f41142a, 0L, 0L, 0L, hg.q0.f12015a3[((je1) this.f39572q0.f39220a.get(i10)).f38236b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.tn0) {
            org.telegram.ui.Components.tn0 tn0Var = (org.telegram.ui.Components.tn0) view;
            tn0Var.f30628a.b(0, false);
            tn0Var.K = str;
            tn0Var.d(false);
        }
    }

    public final void L() {
        this.f39561e0 = -1;
        this.f39562f0 = -1;
        this.f39563g0 = -1;
        this.f39564h0 = -1;
        this.f39565i0 = -1;
        this.f39566j0 = -1;
        this.f39567k0 = 0;
        ArrayList arrayList = this.f39559c0;
        if (!arrayList.isEmpty()) {
            int i10 = this.f39567k0;
            int i11 = i10 + 1;
            this.f39567k0 = i11;
            this.f39561e0 = i10;
            this.f39562f0 = i11;
            int size = arrayList.size() + i11;
            this.f39567k0 = size;
            this.f39563g0 = size;
        }
        ArrayList arrayList2 = this.f39560d0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f39567k0;
            int i13 = i12 + 1;
            this.f39567k0 = i13;
            this.f39564h0 = i12;
            this.f39565i0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f39567k0 = size2;
            this.f39566j0 = size2;
        }
        this.W.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f39575t0).actionBar;
        kVar.O(null, null);
    }

    @Override
    public final boolean b(w00 w00Var) {
        if (w00Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f39574s0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == w00Var.f42420b && messageObject.getDialogId() == w00Var.f42419a) {
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
        re1 re1Var = this.f39575t0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.n2) re1Var).currentAccount;
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
        re1Var.presentFragment(new qn(bundle));
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f39574s0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.n2) this.f39575t0).actionBar;
            kVar.s();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f39575t0).actionBar;
        return kVar.t();
    }
}
