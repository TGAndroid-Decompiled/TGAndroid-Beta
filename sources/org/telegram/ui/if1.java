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
public final class if1 extends org.telegram.ui.Components.m81 implements s10 {
    public final FrameLayout Q;
    public final org.telegram.ui.Components.tl0 R;
    public final f2.j0 S;
    public final ff1 T;
    public w01 U;
    public String V;
    public final ArrayList W;
    public final ArrayList f37834a0;
    public int f37835b0;
    public int f37836c0;
    public int f37837d0;
    public int f37838e0;
    public int f37839f0;
    public int f37840g0;
    public int f37841h0;
    public boolean f37842i0;
    public boolean f37843j0;
    public final org.telegram.ui.Components.ax0 f37844k0;
    public final org.telegram.ui.Components.al0 f37845l0;
    public boolean m0;
    public final hf1 f37846n0;
    public final qv0 f37847o0;
    public final ArrayList f37848p0;
    public final mf1 f37849q0;

    public if1(mf1 mf1Var, Context context) {
        super(context, null);
        this.f37849q0 = mf1Var;
        this.V = "empty";
        this.W = new ArrayList();
        this.f37834a0 = new ArrayList();
        this.f37848p0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        this.f37847o0 = new qv0(this, 7);
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(context, null);
        this.R = tl0Var;
        ff1 ff1Var = new ff1(this);
        this.T = ff1Var;
        tl0Var.setAdapter(ff1Var);
        f2.j0 j0Var = new f2.j0();
        this.S = j0Var;
        tl0Var.setLayoutManager(j0Var);
        tl0Var.setOnItemClickListener(new r21(this, 9));
        tl0Var.setOnScrollListener(new zb1(this, 2));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        u00Var.setViewType(7);
        u00Var.f31509w = false;
        u00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.ax0 ax0Var = new org.telegram.ui.Components.ax0(context, u00Var, 1, null);
        this.f37844k0 = ax0Var;
        ax0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ax0Var.f25364e.setVisibility(8);
        ax0Var.setVisibility(8);
        ax0Var.addView(u00Var, 0);
        ax0Var.setAnimateLayoutChange(true);
        tl0Var.setEmptyView(ax0Var);
        tl0Var.V1 = true;
        tl0Var.W1 = 0;
        frameLayout.addView(ax0Var);
        frameLayout.addView(tl0Var);
        L();
        org.telegram.ui.Components.al0 al0Var = new org.telegram.ui.Components.al0(tl0Var, true);
        this.f37845l0 = al0Var;
        tl0Var.setItemsEnterAnimator(al0Var);
        hf1 hf1Var = new hf1(this);
        this.f37846n0 = hf1Var;
        setAdapter(hf1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.m0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        mf1 mf1Var = this.f37849q0;
        tL_messages_search.peer = mf1Var.getMessagesController().getInputPeer(-mf1Var.f39102a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f20952q = str;
        ArrayList arrayList = this.f37834a0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) l.d.i(1, arrayList)).getId();
        }
        this.m0 = true;
        i10 = ((org.telegram.ui.ActionBar.p2) mf1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new tb0(27, this, str));
    }

    public final void K(View view, int i10, String str, boolean z4) {
        this.V = str;
        FrameLayout frameLayout = this.Q;
        mf1 mf1Var = this.f37849q0;
        int i11 = 0;
        if (view == frameLayout) {
            w01 w01Var = this.U;
            if (w01Var != null) {
                AndroidUtilities.cancelRunOnUIThread(w01Var);
                this.U = null;
            }
            this.m0 = false;
            this.f37843j0 = false;
            ArrayList arrayList = this.W;
            arrayList.clear();
            this.f37834a0.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f37842i0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = mf1Var.f39105b;
                    if (i11 < arrayList2.size()) {
                        if (((df1) arrayList2.get(i11)).f36216c != null) {
                            arrayList.add(((df1) arrayList2.get(i11)).f36216c);
                            ((df1) arrayList2.get(i11)).f36216c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f37842i0 = true;
                this.f37844k0.e(true, true);
                w01 w01Var2 = new w01(24, this, str);
                this.U = w01Var2;
                AndroidUtilities.runOnUIThread(w01Var2, 200L);
            }
        } else if (view instanceof t10) {
            t10 t10Var = (t10) view;
            t10Var.f41429c.b(0, false);
            t10Var.h(-mf1Var.f39102a, 0L, 0L, 0L, uf.g0.Z2[((ef1) this.f37846n0.f37487a.get(i10)).f36585b], false, str, z4);
        } else if (view instanceof org.telegram.ui.Components.en0) {
            org.telegram.ui.Components.en0 en0Var = (org.telegram.ui.Components.en0) view;
            en0Var.f26583a.b(0, false);
            en0Var.H = str;
            en0Var.d(false);
        }
    }

    public final void L() {
        this.f37835b0 = -1;
        this.f37836c0 = -1;
        this.f37837d0 = -1;
        this.f37838e0 = -1;
        this.f37839f0 = -1;
        this.f37840g0 = -1;
        this.f37841h0 = 0;
        ArrayList arrayList = this.W;
        if (!arrayList.isEmpty()) {
            int i10 = this.f37841h0;
            int i11 = i10 + 1;
            this.f37841h0 = i11;
            this.f37835b0 = i10;
            this.f37836c0 = i11;
            int size = arrayList.size() + i11;
            this.f37841h0 = size;
            this.f37837d0 = size;
        }
        ArrayList arrayList2 = this.f37834a0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f37841h0;
            int i13 = i12 + 1;
            this.f37841h0 = i13;
            this.f37838e0 = i12;
            this.f37839f0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f37841h0 = size2;
            this.f37840g0 = size2;
        }
        this.T.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.p2) this.f37849q0).actionBar;
        kVar.O(null, null);
    }

    @Override
    public final boolean b(l10 l10Var) {
        if (l10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f37848p0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == l10Var.f38558b && messageObject.getDialogId() == l10Var.f38557a) {
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
        mf1 mf1Var = this.f37849q0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.p2) mf1Var).currentAccount;
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
        mf1Var.presentFragment(new xn(bundle));
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f37848p0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.p2) this.f37849q0).actionBar;
            kVar.r();
        }
    }

    @Override
    public final boolean f() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.p2) this.f37849q0).actionBar;
        return kVar.s();
    }
}
