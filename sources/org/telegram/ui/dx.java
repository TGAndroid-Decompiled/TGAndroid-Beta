package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class dx extends gg.m {
    public final vy f33235d0;
    public final wy f33236e0;

    public dx(wy wyVar, wy wyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, vy vyVar) {
        super(wyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.f33236e0 = wyVar;
        this.f33235d0 = vyVar;
    }

    @Override
    public final void J() {
        this.f33236e0.presentFragment(new l());
    }

    @Override
    public final void K() {
        int i10;
        wy wyVar = this.f33236e0;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(wyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = wyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle e = org.telegram.ui.Cells.p6.e(0, "step");
            Boolean bool = wyVar.G.has_username;
            if (bool != null) {
                e.putBoolean("forcePublic", bool.booleanValue());
            }
            nd ndVar = new nd(e);
            ndVar.f36067t0 = new n6(wyVar, ndVar, c2Var, 2);
            wyVar.presentFragment(ndVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = wyVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{wyVar.getUserConfig().getClientUserId()} : new long[]{wyVar.getUserConfig().getClientUserId(), wyVar.H});
            Boolean bool3 = wyVar.G.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i10 = 5;
            } else {
                i10 = 4;
            }
            bundle.putInt("chatType", i10);
            bundle.putBoolean("canToggleTopics", false);
            n70 n70Var = new n70(bundle);
            n70Var.Y = new vx(wyVar, c2Var);
            wyVar.presentFragment(n70Var);
        }
    }

    @Override
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.o2) this.f33236e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override
    public final boolean S() {
        if (this.f33236e0.R0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
        vy vyVar = this.f33235d0;
        vyVar.f38527a.getClass();
        this.f33236e0.o4(r2Var, RecyclerView.S(r2Var), 0.0f, vyVar.d);
    }

    @Override
    public final void d(org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        if (r2Var.getMessage() != null) {
            wy wyVar = this.f33236e0;
            i10 = ((org.telegram.ui.ActionBar.o2) wyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = wyVar.getMessagesController().getTopicsController().findTopic(-r2Var.getDialogId(), MessageObject.getTopicId(i10, r2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (wyVar.f39257l2) {
                    wyVar.O3(r2Var.getDialogId(), findTopic.f18173id, false, null);
                } else {
                    ng.d.m(wyVar, -r2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override
    public final void l() {
        int i10;
        h();
        int i11 = vy.L;
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
        wy wyVar = this.f33236e0;
        if (wyVar.R0 == 15) {
            org.telegram.ui.ActionBar.w0 w0Var = wyVar.f39247j0;
            if (this.U) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            w0Var.setVisibility(i10);
        }
    }
}
