package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class iw extends ig.n {
    public final dy f40277d0;
    public final ey f40278e0;

    public iw(ey eyVar, ey eyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, dy dyVar) {
        super(eyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.f40278e0 = eyVar;
        this.f40277d0 = dyVar;
    }

    @Override
    public final void K() {
        this.f40278e0.presentFragment(new k());
    }

    @Override
    public final void L() {
        int i10;
        ey eyVar = this.f40278e0;
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(eyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = eyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle g7 = org.telegram.ui.Components.b10.g(0, "step");
            Boolean bool = eyVar.G.has_username;
            if (bool != null) {
                g7.putBoolean("forcePublic", bool.booleanValue());
            }
            nd ndVar = new nd(g7);
            ndVar.f41769u0 = new q6(eyVar, ndVar, e2Var, 2);
            eyVar.presentFragment(ndVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = eyVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{eyVar.getUserConfig().getClientUserId()} : new long[]{eyVar.getUserConfig().getClientUserId(), eyVar.H});
            Boolean bool3 = eyVar.G.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i10 = 5;
            } else {
                i10 = 4;
            }
            bundle.putInt("chatType", i10);
            bundle.putBoolean("canToggleTopics", false);
            z60 z60Var = new z60(bundle);
            z60Var.Y = new ax(eyVar, e2Var);
            eyVar.presentFragment(z60Var);
        }
    }

    @Override
    public final void M(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.r2) this.f40278e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override
    public final boolean T() {
        if (this.f40278e0.R0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(org.telegram.ui.Cells.p2 p2Var) {
        dy dyVar = this.f40277d0;
        dyVar.f38702a.getClass();
        this.f40278e0.w4(p2Var, RecyclerView.R(p2Var), 0.0f, dyVar.d);
    }

    @Override
    public final void d(org.telegram.ui.Cells.p2 p2Var) {
        int i10;
        if (p2Var.getMessage() != null) {
            ey eyVar = this.f40278e0;
            i10 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = eyVar.getMessagesController().getTopicsController().findTopic(-p2Var.getDialogId(), MessageObject.getTopicId(i10, p2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (eyVar.f39035l2) {
                    eyVar.W3(p2Var.getDialogId(), findTopic.f22080id, false, null);
                } else {
                    pg.d.m(eyVar, -p2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override
    public final void l() {
        int i10;
        h();
        int i11 = dy.L;
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
        ey eyVar = this.f40278e0;
        if (eyVar.R0 == 15) {
            org.telegram.ui.ActionBar.w0 w0Var = eyVar.f39024j0;
            if (this.U) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            w0Var.setVisibility(i10);
        }
    }
}
