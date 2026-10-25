package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class gw extends ig.n {
    public final ay f39786d0;
    public final cy f39787e0;

    public gw(cy cyVar, cy cyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, ay ayVar) {
        super(cyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.f39787e0 = cyVar;
        this.f39786d0 = ayVar;
    }

    @Override
    public final void K() {
        this.f39787e0.presentFragment(new k());
    }

    @Override
    public final void L() {
        int i10;
        cy cyVar = this.f39787e0;
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(cyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = cyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle g7 = org.telegram.ui.Components.b10.g(0, "step");
            Boolean bool = cyVar.G.has_username;
            if (bool != null) {
                g7.putBoolean("forcePublic", bool.booleanValue());
            }
            nd ndVar = new nd(g7);
            ndVar.f41865u0 = new q6(cyVar, ndVar, e2Var, 2);
            cyVar.presentFragment(ndVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = cyVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{cyVar.getUserConfig().getClientUserId()} : new long[]{cyVar.getUserConfig().getClientUserId(), cyVar.H});
            Boolean bool3 = cyVar.G.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i10 = 5;
            } else {
                i10 = 4;
            }
            bundle.putInt("chatType", i10);
            bundle.putBoolean("canToggleTopics", false);
            x60 x60Var = new x60(bundle);
            x60Var.Y = new yw(cyVar, e2Var);
            cyVar.presentFragment(x60Var);
        }
    }

    @Override
    public final void M(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.r2) this.f39787e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override
    public final boolean T() {
        if (this.f39787e0.R0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(org.telegram.ui.Cells.p2 p2Var) {
        ay ayVar = this.f39786d0;
        ayVar.f37910a.getClass();
        this.f39787e0.w4(p2Var, RecyclerView.R(p2Var), 0.0f, ayVar.d);
    }

    @Override
    public final void d(org.telegram.ui.Cells.p2 p2Var) {
        int i10;
        if (p2Var.getMessage() != null) {
            cy cyVar = this.f39787e0;
            i10 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = cyVar.getMessagesController().getTopicsController().findTopic(-p2Var.getDialogId(), MessageObject.getTopicId(i10, p2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (cyVar.f38620l2) {
                    cyVar.W3(p2Var.getDialogId(), findTopic.f22079id, false, null);
                } else {
                    pg.d.m(cyVar, -p2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override
    public final void l() {
        int i10;
        h();
        int i11 = ay.L;
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
        cy cyVar = this.f39787e0;
        if (cyVar.R0 == 15) {
            org.telegram.ui.ActionBar.w0 w0Var = cyVar.f38609j0;
            if (this.U) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            w0Var.setVisibility(i10);
        }
    }
}
