package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class cx extends gg.m {
    public final uy f36574d0;
    public final vy f36575e0;

    public cx(vy vyVar, vy vyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, uy uyVar) {
        super(vyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.f36575e0 = vyVar;
        this.f36574d0 = uyVar;
    }

    @Override
    public final void J() {
        this.f36575e0.presentFragment(new l());
    }

    @Override
    public final void K() {
        int i10;
        vy vyVar = this.f36575e0;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(vyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = vyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle f7 = org.telegram.ui.Cells.c1.f(0, "step");
            Boolean bool = vyVar.G.has_username;
            if (bool != null) {
                f7.putBoolean("forcePublic", bool.booleanValue());
            }
            qd qdVar = new qd(f7);
            qdVar.f41296t0 = new o6(vyVar, qdVar, a2Var, 2);
            vyVar.presentFragment(qdVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = vyVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{vyVar.getUserConfig().getClientUserId()} : new long[]{vyVar.getUserConfig().getClientUserId(), vyVar.H});
            Boolean bool3 = vyVar.G.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i10 = 5;
            } else {
                i10 = 4;
            }
            bundle.putInt("chatType", i10);
            bundle.putBoolean("canToggleTopics", false);
            l70 l70Var = new l70(bundle);
            l70Var.Y = new ux(vyVar, a2Var);
            vyVar.presentFragment(l70Var);
        }
    }

    @Override
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.m2) this.f36575e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override
    public final boolean S() {
        if (this.f36575e0.R0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(org.telegram.ui.Cells.s2 s2Var) {
        uy uyVar = this.f36574d0;
        uyVar.f42611a.getClass();
        this.f36575e0.l4(s2Var, RecyclerView.R(s2Var), 0.0f, uyVar.d);
    }

    @Override
    public final void d(org.telegram.ui.Cells.s2 s2Var) {
        int i10;
        if (s2Var.getMessage() != null) {
            vy vyVar = this.f36575e0;
            i10 = ((org.telegram.ui.ActionBar.m2) vyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = vyVar.getMessagesController().getTopicsController().findTopic(-s2Var.getDialogId(), MessageObject.getTopicId(i10, s2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (vyVar.f42939l2) {
                    vyVar.L3(s2Var.getDialogId(), findTopic.f19854id, false, null);
                } else {
                    ng.d.m(vyVar, -s2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override
    public final void l() {
        int i10;
        h();
        int i11 = uy.L;
        try {
            super.l();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        vy vyVar = this.f36575e0;
        if (vyVar.R0 == 15) {
            org.telegram.ui.ActionBar.u0 u0Var = vyVar.f42929j0;
            if (this.U) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            u0Var.setVisibility(i10);
        }
    }
}
