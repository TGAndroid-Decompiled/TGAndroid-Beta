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
public final class dg1 extends org.telegram.ui.Components.u91 implements x10 {
    public final FrameLayout T;
    public final org.telegram.ui.Components.wm0 U;
    public final s4.d0 V;
    public final ag1 W;
    public u31 f36808a0;
    public String f36809b0;
    public final ArrayList f36810c0;
    public final ArrayList f36811d0;
    public int f36812e0;
    public int f36813f0;
    public int f36814g0;
    public int f36815h0;
    public int f36816i0;
    public int f36817j0;
    public int f36818k0;
    public boolean f36819l0;
    public boolean m0;
    public final org.telegram.ui.Components.gy0 f36820n0;
    public final org.telegram.ui.Components.bm0 f36821o0;
    public boolean f36822p0;
    public final cg1 f36823q0;
    public final lw0 f36824r0;
    public final ArrayList f36825s0;
    public final hg1 f36826t0;

    public dg1(hg1 hg1Var, Context context) {
        super(context, null);
        this.f36826t0 = hg1Var;
        this.f36809b0 = "empty";
        this.f36810c0 = new ArrayList();
        this.f36811d0 = new ArrayList();
        this.f36825s0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        this.f36824r0 = new lw0(this, 7);
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(context, null);
        this.U = wm0Var;
        ag1 ag1Var = new ag1(this);
        this.W = ag1Var;
        wm0Var.setAdapter(ag1Var);
        s4.d0 d0Var = new s4.d0();
        this.V = d0Var;
        wm0Var.setLayoutManager(d0Var);
        wm0Var.setOnItemClickListener(new d21(this, 12));
        wm0Var.setOnScrollListener(new re1(this, 1));
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, null);
        m10Var.setViewType(7);
        m10Var.f28350w = false;
        m10Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.gy0 gy0Var = new org.telegram.ui.Components.gy0(context, m10Var, 1, null);
        this.f36820n0 = gy0Var;
        gy0Var.d.setText(LocaleController.getString(R.string.NoResult));
        gy0Var.f26561e.setVisibility(8);
        gy0Var.setVisibility(8);
        gy0Var.addView(m10Var, 0);
        gy0Var.setAnimateLayoutChange(true);
        wm0Var.setEmptyView(gy0Var);
        wm0Var.W1 = true;
        wm0Var.X1 = 0;
        frameLayout.addView(gy0Var);
        frameLayout.addView(wm0Var);
        L();
        org.telegram.ui.Components.bm0 bm0Var = new org.telegram.ui.Components.bm0(wm0Var, true);
        this.f36821o0 = bm0Var;
        wm0Var.setItemsEnterAnimator(bm0Var);
        cg1 cg1Var = new cg1(this);
        this.f36823q0 = cg1Var;
        setAdapter(cg1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.f36822p0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        hg1 hg1Var = this.f36826t0;
        tL_messages_search.peer = hg1Var.getMessagesController().getInputPeer(-hg1Var.f38376a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f19912q = str;
        ArrayList arrayList = this.f36811d0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) hg.c.h(1, arrayList)).getId();
        }
        this.f36822p0 = true;
        i10 = ((org.telegram.ui.ActionBar.m2) hg1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new bc0(27, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.f36809b0 = str;
        FrameLayout frameLayout = this.T;
        hg1 hg1Var = this.f36826t0;
        int i11 = 0;
        if (view == frameLayout) {
            u31 u31Var = this.f36808a0;
            if (u31Var != null) {
                AndroidUtilities.cancelRunOnUIThread(u31Var);
                this.f36808a0 = null;
            }
            this.f36822p0 = false;
            this.m0 = false;
            ArrayList arrayList = this.f36810c0;
            arrayList.clear();
            this.f36811d0.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f36819l0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = hg1Var.f38379b;
                    if (i11 < arrayList2.size()) {
                        if (((yf1) arrayList2.get(i11)).f44474c != null) {
                            arrayList.add(((yf1) arrayList2.get(i11)).f44474c);
                            ((yf1) arrayList2.get(i11)).f44474c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f36819l0 = true;
                this.f36820n0.e(true, true);
                u31 u31Var2 = new u31(19, this, str);
                this.f36808a0 = u31Var2;
                AndroidUtilities.runOnUIThread(u31Var2, 200L);
            }
        } else if (view instanceof y10) {
            y10 y10Var = (y10) view;
            y10Var.f44250c.b(0, false);
            y10Var.h(-hg1Var.f38376a, 0L, 0L, 0L, gg.r0.f10777a3[((zf1) this.f36823q0.f36427a.get(i10)).f44843b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.ho0) {
            org.telegram.ui.Components.ho0 ho0Var = (org.telegram.ui.Components.ho0) view;
            ho0Var.f26839a.b(0, false);
            ho0Var.K = str;
            ho0Var.d(false);
        }
    }

    public final void L() {
        this.f36812e0 = -1;
        this.f36813f0 = -1;
        this.f36814g0 = -1;
        this.f36815h0 = -1;
        this.f36816i0 = -1;
        this.f36817j0 = -1;
        this.f36818k0 = 0;
        ArrayList arrayList = this.f36810c0;
        if (!arrayList.isEmpty()) {
            int i10 = this.f36818k0;
            int i11 = i10 + 1;
            this.f36818k0 = i11;
            this.f36812e0 = i10;
            this.f36813f0 = i11;
            int size = arrayList.size() + i11;
            this.f36818k0 = size;
            this.f36814g0 = size;
        }
        ArrayList arrayList2 = this.f36811d0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f36818k0;
            int i13 = i12 + 1;
            this.f36818k0 = i13;
            this.f36815h0 = i12;
            this.f36816i0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f36818k0 = size2;
            this.f36817j0 = size2;
        }
        this.W.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.m2) this.f36826t0).actionBar;
        kVar.P(null, null);
    }

    @Override
    public final boolean c(q10 q10Var) {
        if (q10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36825s0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == q10Var.f41141b && messageObject.getDialogId() == q10Var.f41140a) {
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
        hg1 hg1Var = this.f36826t0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.m2) hg1Var).currentAccount;
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
        hg1Var.presentFragment(new eo(bundle));
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f36825s0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.m2) this.f36826t0).actionBar;
            kVar.t();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.m2) this.f36826t0).actionBar;
        return kVar.u();
    }
}
