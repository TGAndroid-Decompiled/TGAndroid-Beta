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
public final class bg1 extends org.telegram.ui.Components.x81 implements w10 {
    public final FrameLayout U;
    public final org.telegram.ui.Components.vl0 V;
    public final s4.c0 W;
    public final yf1 f32440a0;
    public w81 f32441b0;
    public String f32442c0;
    public final ArrayList f32443d0;
    public final ArrayList f32444e0;
    public int f32445f0;
    public int f32446g0;
    public int f32447h0;
    public int f32448i0;
    public int f32449j0;
    public int f32450k0;
    public int f32451l0;
    public boolean m0;
    public boolean f32452n0;
    public final org.telegram.ui.Components.jx0 f32453o0;
    public final org.telegram.ui.Components.al0 f32454p0;
    public boolean f32455q0;
    public final ag1 f32456r0;
    public final jw0 f32457s0;
    public final ArrayList f32458t0;
    public final fg1 f32459u0;

    public bg1(fg1 fg1Var, Context context) {
        super(context, null);
        this.f32459u0 = fg1Var;
        this.f32442c0 = "empty";
        this.f32443d0 = new ArrayList();
        this.f32444e0 = new ArrayList();
        this.f32458t0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        this.f32457s0 = new jw0(this, 7);
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.V = vl0Var;
        yf1 yf1Var = new yf1(this);
        this.f32440a0 = yf1Var;
        vl0Var.setAdapter(yf1Var);
        s4.c0 c0Var = new s4.c0();
        this.W = c0Var;
        vl0Var.setLayoutManager(c0Var);
        vl0Var.setOnItemClickListener(new a31(this, 11));
        vl0Var.setOnScrollListener(new pe1(this, 1));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(7);
        t00Var.f28252w = false;
        t00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.jx0 jx0Var = new org.telegram.ui.Components.jx0(context, t00Var, 1, null);
        this.f32453o0 = jx0Var;
        jx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        jx0Var.e.setVisibility(8);
        jx0Var.setVisibility(8);
        jx0Var.addView(t00Var, 0);
        jx0Var.setAnimateLayoutChange(true);
        vl0Var.setEmptyView(jx0Var);
        vl0Var.Y1 = true;
        vl0Var.Z1 = 0;
        frameLayout.addView(jx0Var);
        frameLayout.addView(vl0Var);
        M();
        org.telegram.ui.Components.al0 al0Var = new org.telegram.ui.Components.al0(vl0Var, true);
        this.f32454p0 = al0Var;
        vl0Var.setItemsEnterAnimator(al0Var);
        ag1 ag1Var = new ag1(this);
        this.f32456r0 = ag1Var;
        setAdapter(ag1Var);
    }

    public final void K(String str) {
        int i10;
        if (this.f32455q0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        fg1 fg1Var = this.f32459u0;
        tL_messages_search.peer = fg1Var.getMessagesController().getInputPeer(-fg1Var.f33596a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f18437q = str;
        ArrayList arrayList = this.f32444e0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) hg.k0.g(1, arrayList)).getId();
        }
        this.f32455q0 = true;
        i10 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new dc0(27, this, str));
    }

    public final void L(View view, int i10, String str, boolean z10) {
        this.f32442c0 = str;
        FrameLayout frameLayout = this.U;
        fg1 fg1Var = this.f32459u0;
        int i11 = 0;
        if (view == frameLayout) {
            w81 w81Var = this.f32441b0;
            if (w81Var != null) {
                AndroidUtilities.cancelRunOnUIThread(w81Var);
                this.f32441b0 = null;
            }
            this.f32455q0 = false;
            this.f32452n0 = false;
            ArrayList arrayList = this.f32443d0;
            arrayList.clear();
            this.f32444e0.clear();
            M();
            if (TextUtils.isEmpty(str)) {
                this.m0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = fg1Var.f33599b;
                    if (i11 < arrayList2.size()) {
                        if (((wf1) arrayList2.get(i11)).f39142c != null) {
                            arrayList.add(((wf1) arrayList2.get(i11)).f39142c);
                            ((wf1) arrayList2.get(i11)).f39142c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        M();
                        return;
                    }
                }
            } else {
                M();
                this.m0 = true;
                this.f32453o0.e(true, true);
                w81 w81Var2 = new w81(13, this, str);
                this.f32441b0 = w81Var2;
                AndroidUtilities.runOnUIThread(w81Var2, 200L);
            }
        } else if (view instanceof x10) {
            x10 x10Var = (x10) view;
            x10Var.f39296c.b(0, false);
            x10Var.h(-fg1Var.f33596a, 0L, 0L, 0L, gg.s0.f9915c3[((xf1) this.f32456r0.f32054a.get(i10)).f39557b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.in0) {
            org.telegram.ui.Components.in0 in0Var = (org.telegram.ui.Components.in0) view;
            in0Var.f25086a.b(0, false);
            in0Var.K = str;
            in0Var.d(false);
        }
    }

    public final void M() {
        this.f32445f0 = -1;
        this.f32446g0 = -1;
        this.f32447h0 = -1;
        this.f32448i0 = -1;
        this.f32449j0 = -1;
        this.f32450k0 = -1;
        this.f32451l0 = 0;
        ArrayList arrayList = this.f32443d0;
        if (!arrayList.isEmpty()) {
            int i10 = this.f32451l0;
            int i11 = i10 + 1;
            this.f32451l0 = i11;
            this.f32445f0 = i10;
            this.f32446g0 = i11;
            int size = arrayList.size() + i11;
            this.f32451l0 = size;
            this.f32447h0 = size;
        }
        ArrayList arrayList2 = this.f32444e0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f32451l0;
            int i13 = i12 + 1;
            this.f32451l0 = i13;
            this.f32448i0 = i12;
            this.f32449j0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f32451l0 = size2;
            this.f32450k0 = size2;
        }
        this.f32440a0.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f32459u0).actionBar;
        kVar.O(null, null);
    }

    @Override
    public final boolean c(p10 p10Var) {
        if (p10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f32458t0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == p10Var.f36424b && messageObject.getDialogId() == p10Var.f36423a) {
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
        fg1 fg1Var = this.f32459u0;
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
        ArrayList arrayList = this.f32458t0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.n2) this.f32459u0).actionBar;
            kVar.r();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f32459u0).actionBar;
        return kVar.s();
    }
}
