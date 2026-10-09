package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ax extends gg.m {
    public final sy f36070d0;
    public final ty f36071e0;

    public ax(ty tyVar, ty tyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, sy syVar) {
        super(tyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.f36071e0 = tyVar;
        this.f36070d0 = syVar;
    }

    @Override
    public final void J() {
        this.f36071e0.presentFragment(new l());
    }

    @Override
    public final void K() {
        int i10;
        ty tyVar = this.f36071e0;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(tyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = tyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle f7 = org.telegram.ui.Cells.c1.f(0, "step");
            Boolean bool = tyVar.G.has_username;
            if (bool != null) {
                f7.putBoolean("forcePublic", bool.booleanValue());
            }
            md mdVar = new md(f7);
            mdVar.f39864t0 = new l6(tyVar, mdVar, b2Var, 2);
            tyVar.presentFragment(mdVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = tyVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{tyVar.getUserConfig().getClientUserId()} : new long[]{tyVar.getUserConfig().getClientUserId(), tyVar.H});
            Boolean bool3 = tyVar.G.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i10 = 5;
            } else {
                i10 = 4;
            }
            bundle.putInt("chatType", i10);
            bundle.putBoolean("canToggleTopics", false);
            j70 j70Var = new j70(bundle);
            j70Var.Y = new sx(tyVar, b2Var);
            tyVar.presentFragment(j70Var);
        }
    }

    @Override
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.n2) this.f36071e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override
    public final boolean S() {
        if (this.f36071e0.R0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(org.telegram.ui.Cells.s2 s2Var) {
        sy syVar = this.f36070d0;
        syVar.f41790a.getClass();
        this.f36071e0.l4(s2Var, RecyclerView.R(s2Var), 0.0f, syVar.d);
    }

    @Override
    public final void d(org.telegram.ui.Cells.s2 s2Var) {
        int i10;
        if (s2Var.getMessage() != null) {
            ty tyVar = this.f36071e0;
            i10 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = tyVar.getMessagesController().getTopicsController().findTopic(-s2Var.getDialogId(), MessageObject.getTopicId(i10, s2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (tyVar.f42210l2) {
                    tyVar.L3(s2Var.getDialogId(), findTopic.f20090id, false, null);
                } else {
                    ng.d.m(tyVar, -s2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override
    public final void l() {
        int i10;
        h();
        int i11 = sy.L;
        try {
            super.l();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        ty tyVar = this.f36071e0;
        if (tyVar.R0 == 15) {
            org.telegram.ui.ActionBar.v0 v0Var = tyVar.f42200j0;
            if (this.U) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            v0Var.setVisibility(i10);
        }
    }
}
