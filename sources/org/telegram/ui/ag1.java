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
    public w81 f34455a0;
    public String f34456b0;
    public final ArrayList f34457c0;
    public final ArrayList f34458d0;
    public int f34459e0;
    public int f34460f0;
    public int f34461g0;
    public int f34462h0;
    public int f34463i0;
    public int f34464j0;
    public int f34465k0;
    public boolean f34466l0;
    public boolean m0;
    public final org.telegram.ui.Components.xw0 f34467n0;
    public final org.telegram.ui.Components.qk0 f34468o0;
    public boolean f34469p0;
    public final zf1 f34470q0;
    public final iw0 f34471r0;
    public final ArrayList f34472s0;
    public final eg1 f34473t0;

    public ag1(eg1 eg1Var, Context context) {
        super(context, null);
        this.f34473t0 = eg1Var;
        this.f34456b0 = "empty";
        this.f34457c0 = new ArrayList();
        this.f34458d0 = new ArrayList();
        this.f34472s0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        this.f34471r0 = new iw0(this, 7);
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.U = ll0Var;
        xf1 xf1Var = new xf1(this);
        this.W = xf1Var;
        ll0Var.setAdapter(xf1Var);
        s4.c0 c0Var = new s4.c0();
        this.V = c0Var;
        ll0Var.setLayoutManager(c0Var);
        ll0Var.setOnItemClickListener(new b31(this, 10));
        ll0Var.setOnScrollListener(new oe1(this, 1));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(7);
        t00Var.f30493w = false;
        t00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.xw0 xw0Var = new org.telegram.ui.Components.xw0(context, t00Var, 1, null);
        this.f34467n0 = xw0Var;
        xw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        xw0Var.f32783e.setVisibility(8);
        xw0Var.setVisibility(8);
        xw0Var.addView(t00Var, 0);
        xw0Var.setAnimateLayoutChange(true);
        ll0Var.setEmptyView(xw0Var);
        ll0Var.Y1 = true;
        ll0Var.Z1 = 0;
        frameLayout.addView(xw0Var);
        frameLayout.addView(ll0Var);
        L();
        org.telegram.ui.Components.qk0 qk0Var = new org.telegram.ui.Components.qk0(ll0Var, true);
        this.f34468o0 = qk0Var;
        ll0Var.setItemsEnterAnimator(qk0Var);
        zf1 zf1Var = new zf1(this);
        this.f34470q0 = zf1Var;
        setAdapter(zf1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.f34469p0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        eg1 eg1Var = this.f34473t0;
        tL_messages_search.peer = eg1Var.getMessagesController().getInputPeer(-eg1Var.f36053a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f20005q = str;
        ArrayList arrayList = this.f34458d0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) i2.g.h(1, arrayList)).getId();
        }
        this.f34469p0 = true;
        i10 = ((org.telegram.ui.ActionBar.n2) eg1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new bc0(27, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.f34456b0 = str;
        FrameLayout frameLayout = this.T;
        eg1 eg1Var = this.f34473t0;
        int i11 = 0;
        if (view == frameLayout) {
            w81 w81Var = this.f34455a0;
            if (w81Var != null) {
                AndroidUtilities.cancelRunOnUIThread(w81Var);
                this.f34455a0 = null;
            }
            this.f34469p0 = false;
            this.m0 = false;
            ArrayList arrayList = this.f34457c0;
            arrayList.clear();
            this.f34458d0.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f34466l0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = eg1Var.f36056b;
                    if (i11 < arrayList2.size()) {
                        if (((vf1) arrayList2.get(i11)).f41561c != null) {
                            arrayList.add(((vf1) arrayList2.get(i11)).f41561c);
                            ((vf1) arrayList2.get(i11)).f41561c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f34466l0 = true;
                this.f34467n0.e(true, true);
                w81 w81Var2 = new w81(13, this, str);
                this.f34455a0 = w81Var2;
                AndroidUtilities.runOnUIThread(w81Var2, 200L);
            }
        } else if (view instanceof x10) {
            x10 x10Var = (x10) view;
            x10Var.f42567c.b(0, false);
            x10Var.h(-eg1Var.f36053a, 0L, 0L, 0L, hg.s0.f11263c3[((wf1) this.f34470q0.f43453a.get(i10)).f42382b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.vm0) {
            org.telegram.ui.Components.vm0 vm0Var = (org.telegram.ui.Components.vm0) view;
            vm0Var.f31391a.b(0, false);
            vm0Var.K = str;
            vm0Var.d(false);
        }
    }

    public final void L() {
        this.f34459e0 = -1;
        this.f34460f0 = -1;
        this.f34461g0 = -1;
        this.f34462h0 = -1;
        this.f34463i0 = -1;
        this.f34464j0 = -1;
        this.f34465k0 = 0;
        ArrayList arrayList = this.f34457c0;
        if (!arrayList.isEmpty()) {
            int i10 = this.f34465k0;
            int i11 = i10 + 1;
            this.f34465k0 = i11;
            this.f34459e0 = i10;
            this.f34460f0 = i11;
            int size = arrayList.size() + i11;
            this.f34465k0 = size;
            this.f34461g0 = size;
        }
        ArrayList arrayList2 = this.f34458d0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f34465k0;
            int i13 = i12 + 1;
            this.f34465k0 = i13;
            this.f34462h0 = i12;
            this.f34463i0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f34465k0 = size2;
            this.f34464j0 = size2;
        }
        this.W.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f34473t0).actionBar;
        kVar.O(null, null);
    }

    @Override
    public final boolean b(p10 p10Var) {
        if (p10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f34472s0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == p10Var.f39410b && messageObject.getDialogId() == p10Var.f39409a) {
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
        eg1 eg1Var = this.f34473t0;
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
        eg1Var.presentFragment(new co(bundle));
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f34472s0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.n2) this.f34473t0).actionBar;
            kVar.r();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f34473t0).actionBar;
        return kVar.s();
    }
}
