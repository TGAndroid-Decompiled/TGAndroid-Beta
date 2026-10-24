package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class lw extends hg.m {
    public final dy f39402d0;
    public final ey f39403e0;

    public lw(ey eyVar, ey eyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, dy dyVar) {
        super(eyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.f39403e0 = eyVar;
        this.f39402d0 = dyVar;
    }

    @Override
    public final void K() {
        this.f39403e0.presentFragment(new k());
    }

    @Override
    public final void L() {
        int i10;
        ey eyVar = this.f39403e0;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(eyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = eyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle i11 = org.telegram.ui.Cells.b1.i(0, "step");
            Boolean bool = eyVar.G.has_username;
            if (bool != null) {
                i11.putBoolean("forcePublic", bool.booleanValue());
            }
            md mdVar = new md(i11);
            mdVar.f39560u0 = new p6(eyVar, mdVar, c2Var, 2);
            eyVar.presentFragment(mdVar);
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
            w60 w60Var = new w60(bundle);
            w60Var.Y = new dx(eyVar, c2Var);
            eyVar.presentFragment(w60Var);
        }
    }

    @Override
    public final void M(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.o2) this.f39403e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override
    public final boolean T() {
        if (this.f39403e0.R0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(org.telegram.ui.Cells.q2 q2Var) {
        dy dyVar = this.f39402d0;
        dyVar.f36737a.getClass();
        this.f39403e0.m4(q2Var, RecyclerView.R(q2Var), 0.0f, dyVar.d);
    }

    @Override
    public final void d(org.telegram.ui.Cells.q2 q2Var) {
        int i10;
        if (q2Var.getMessage() != null) {
            ey eyVar = this.f39403e0;
            i10 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = eyVar.getMessagesController().getTopicsController().findTopic(-q2Var.getDialogId(), MessageObject.getTopicId(i10, q2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (eyVar.f37071l2) {
                    eyVar.M3(q2Var.getDialogId(), findTopic.f20396id, false, null);
                } else {
                    og.d.m(eyVar, -q2Var.getDialogId(), findTopic, 0);
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
        ey eyVar = this.f39403e0;
        if (eyVar.R0 == 15) {
            org.telegram.ui.ActionBar.u0 u0Var = eyVar.f37060j0;
            if (this.U) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            u0Var.setVisibility(i10);
        }
    }
}
