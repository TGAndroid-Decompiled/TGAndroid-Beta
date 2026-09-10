package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class dx extends fg.m {
    public final vy f31988d0;
    public final wy f31989e0;

    public dx(wy wyVar, wy wyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, vy vyVar) {
        super(wyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.f31989e0 = wyVar;
        this.f31988d0 = vyVar;
    }

    @Override
    public final void J() {
        this.f31989e0.presentFragment(new l());
    }

    @Override
    public final void K() {
        int i10;
        wy wyVar = this.f31989e0;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(wyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = wyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle e = org.telegram.ui.Cells.r6.e(0, "step");
            Boolean bool = wyVar.G.has_username;
            if (bool != null) {
                e.putBoolean("forcePublic", bool.booleanValue());
            }
            nd ndVar = new nd(e);
            ndVar.f35243t0 = new m6(wyVar, ndVar, d2Var, 2);
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
            k70 k70Var = new k70(bundle);
            k70Var.Y = new vx(wyVar, d2Var);
            wyVar.presentFragment(k70Var);
        }
    }

    @Override
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.p2) this.f31989e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override
    public final boolean S() {
        if (this.f31989e0.R0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
        vy vyVar = this.f31988d0;
        vyVar.f37645a.getClass();
        this.f31989e0.o4(r2Var, RecyclerView.R(r2Var), 0.0f, vyVar.d);
    }

    @Override
    public final void d(org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        if (r2Var.getMessage() != null) {
            wy wyVar = this.f31989e0;
            i10 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = wyVar.getMessagesController().getTopicsController().findTopic(-r2Var.getDialogId(), MessageObject.getTopicId(i10, r2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (wyVar.f38467l2) {
                    wyVar.O3(r2Var.getDialogId(), findTopic.f17247id, false, null);
                } else {
                    mg.d.m(wyVar, -r2Var.getDialogId(), findTopic, 0);
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
        wy wyVar = this.f31989e0;
        if (wyVar.R0 == 15) {
            org.telegram.ui.ActionBar.w0 w0Var = wyVar.f38457j0;
            if (this.U) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            w0Var.setVisibility(i10);
        }
    }
}
