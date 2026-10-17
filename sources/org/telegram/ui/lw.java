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
    public final dy f38958d0;
    public final ey f38959e0;

    public lw(ey eyVar, ey eyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, dy dyVar) {
        super(eyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.f38959e0 = eyVar;
        this.f38958d0 = dyVar;
    }

    @Override
    public final void J() {
        this.f38959e0.presentFragment(new l());
    }

    @Override
    public final void K() {
        int i10;
        ey eyVar = this.f38959e0;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(eyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = eyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle j10 = org.telegram.ui.Cells.t0.j(0, "step");
            Boolean bool = eyVar.G.has_username;
            if (bool != null) {
                j10.putBoolean("forcePublic", bool.booleanValue());
            }
            od odVar = new od(j10);
            odVar.f39735t0 = new p6(eyVar, odVar, b2Var, 2);
            eyVar.presentFragment(odVar);
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
            u60 u60Var = new u60(bundle);
            u60Var.Y = new dx(eyVar, b2Var);
            eyVar.presentFragment(u60Var);
        }
    }

    @Override
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.n2) this.f38959e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override
    public final boolean S() {
        if (this.f38959e0.R0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
        dy dyVar = this.f38958d0;
        dyVar.f36333a.getClass();
        this.f38959e0.m4(r2Var, RecyclerView.R(r2Var), 0.0f, dyVar.d);
    }

    @Override
    public final void e(org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        if (r2Var.getMessage() != null) {
            ey eyVar = this.f38959e0;
            i10 = ((org.telegram.ui.ActionBar.n2) eyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = eyVar.getMessagesController().getTopicsController().findTopic(-r2Var.getDialogId(), MessageObject.getTopicId(i10, r2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (eyVar.f36667l2) {
                    eyVar.M3(r2Var.getDialogId(), findTopic.f20324id, false, null);
                } else {
                    og.d.m(eyVar, -r2Var.getDialogId(), findTopic, 0);
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
        ey eyVar = this.f38959e0;
        if (eyVar.R0 == 15) {
            org.telegram.ui.ActionBar.u0 u0Var = eyVar.f36656j0;
            if (this.U) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            u0Var.setVisibility(i10);
        }
    }
}
