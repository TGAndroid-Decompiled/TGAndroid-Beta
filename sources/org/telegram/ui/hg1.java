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
public final class hg1 extends org.telegram.ui.Components.k91 implements b20 {
    public final FrameLayout T;
    public final org.telegram.ui.Components.mm0 U;
    public final s4.b0 V;
    public final eg1 W;
    public je1 f36796a0;
    public String f36797b0;
    public final ArrayList f36798c0;
    public final ArrayList f36799d0;
    public int f36800e0;
    public int f36801f0;
    public int f36802g0;
    public int f36803h0;
    public int f36804i0;
    public int f36805j0;
    public int f36806k0;
    public boolean f36807l0;
    public boolean m0;
    public final org.telegram.ui.Components.wx0 f36808n0;
    public final org.telegram.ui.Components.rl0 f36809o0;
    public boolean f36810p0;
    public final gg1 f36811q0;
    public final pw0 f36812r0;
    public final ArrayList f36813s0;
    public final lg1 f36814t0;

    public hg1(lg1 lg1Var, Context context) {
        super(context, null);
        this.f36814t0 = lg1Var;
        this.f36797b0 = "empty";
        this.f36798c0 = new ArrayList();
        this.f36799d0 = new ArrayList();
        this.f36813s0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        this.f36812r0 = new pw0(this, 7);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.U = mm0Var;
        eg1 eg1Var = new eg1(this);
        this.W = eg1Var;
        mm0Var.setAdapter(eg1Var);
        s4.b0 b0Var = new s4.b0();
        this.V = b0Var;
        mm0Var.setLayoutManager(b0Var);
        mm0Var.setOnItemClickListener(new i21(this, 12));
        mm0Var.setOnScrollListener(new ve1(this, 1));
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
        f10Var.setViewType(7);
        f10Var.f24856w = false;
        f10Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(context, f10Var, 1, null);
        this.f36808n0 = wx0Var;
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
        this.f36809o0 = rl0Var;
        mm0Var.setItemsEnterAnimator(rl0Var);
        gg1 gg1Var = new gg1(this);
        this.f36811q0 = gg1Var;
        setAdapter(gg1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.f36810p0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        lg1 lg1Var = this.f36814t0;
        tL_messages_search.peer = lg1Var.getMessagesController().getInputPeer(-lg1Var.f37957a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f19325q = str;
        ArrayList arrayList = this.f36799d0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) i2.d.g(1, arrayList)).getId();
        }
        this.f36810p0 = true;
        i10 = ((org.telegram.ui.ActionBar.m2) lg1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new fc0(27, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.f36797b0 = str;
        FrameLayout frameLayout = this.T;
        lg1 lg1Var = this.f36814t0;
        int i11 = 0;
        if (view == frameLayout) {
            je1 je1Var = this.f36796a0;
            if (je1Var != null) {
                AndroidUtilities.cancelRunOnUIThread(je1Var);
                this.f36796a0 = null;
            }
            this.f36810p0 = false;
            this.m0 = false;
            ArrayList arrayList = this.f36798c0;
            arrayList.clear();
            this.f36799d0.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f36807l0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = lg1Var.f37960b;
                    if (i11 < arrayList2.size()) {
                        if (((cg1) arrayList2.get(i11)).f34947c != null) {
                            arrayList.add(((cg1) arrayList2.get(i11)).f34947c);
                            ((cg1) arrayList2.get(i11)).f34947c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f36807l0 = true;
                this.f36808n0.e(true, true);
                je1 je1Var2 = new je1(2, this, str);
                this.f36796a0 = je1Var2;
                AndroidUtilities.runOnUIThread(je1Var2, 200L);
            }
        } else if (view instanceof c20) {
            c20 c20Var = (c20) view;
            c20Var.f34683c.b(0, false);
            c20Var.h(-lg1Var.f37957a, 0L, 0L, 0L, hg.r0.f10714a3[((dg1) this.f36811q0.f36395a.get(i10)).f35257b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.yn0) {
            org.telegram.ui.Components.yn0 yn0Var = (org.telegram.ui.Components.yn0) view;
            yn0Var.f31653a.b(0, false);
            yn0Var.K = str;
            yn0Var.d(false);
        }
    }

    public final void L() {
        this.f36800e0 = -1;
        this.f36801f0 = -1;
        this.f36802g0 = -1;
        this.f36803h0 = -1;
        this.f36804i0 = -1;
        this.f36805j0 = -1;
        this.f36806k0 = 0;
        ArrayList arrayList = this.f36798c0;
        if (!arrayList.isEmpty()) {
            int i10 = this.f36806k0;
            int i11 = i10 + 1;
            this.f36806k0 = i11;
            this.f36800e0 = i10;
            this.f36801f0 = i11;
            int size = arrayList.size() + i11;
            this.f36806k0 = size;
            this.f36802g0 = size;
        }
        ArrayList arrayList2 = this.f36799d0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f36806k0;
            int i13 = i12 + 1;
            this.f36806k0 = i13;
            this.f36803h0 = i12;
            this.f36804i0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f36806k0 = size2;
            this.f36805j0 = size2;
        }
        this.W.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.m2) this.f36814t0).actionBar;
        kVar.O(null, null);
    }

    @Override
    public final boolean b(u10 u10Var) {
        if (u10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36813s0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == u10Var.f40517b && messageObject.getDialogId() == u10Var.f40516a) {
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
        lg1 lg1Var = this.f36814t0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.m2) lg1Var).currentAccount;
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
        lg1Var.presentFragment(new fo(bundle));
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f36813s0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.m2) this.f36814t0).actionBar;
            kVar.s();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.m2) this.f36814t0).actionBar;
        return kVar.t();
    }
}
