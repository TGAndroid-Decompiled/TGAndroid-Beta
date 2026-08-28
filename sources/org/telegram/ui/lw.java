package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class lw extends of.m {
    public final cy Z;
    public final dy f40235a0;

    public lw(dy dyVar, dy dyVar2, Context context, int i9, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType, cy cyVar) {
        super(dyVar2, context, i9, i10, z10, arrayList, i11, requestPeerType);
        this.f40235a0 = dyVar;
        this.Z = cyVar;
    }

    @Override
    public final void J() {
        this.f40235a0.presentFragment(new l());
    }

    @Override
    public final void K() {
        int i9;
        dy dyVar = this.f40235a0;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(dyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = dyVar.C;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle h = aa.d.h(0, "step");
            Boolean bool = dyVar.C.has_username;
            if (bool != null) {
                h.putBoolean("forcePublic", bool.booleanValue());
            }
            id idVar = new id(h);
            idVar.f39121p0 = new l6(dyVar, idVar, c2Var, 2);
            dyVar.presentFragment(idVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = dyVar.C.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{dyVar.getUserConfig().getClientUserId()} : new long[]{dyVar.getUserConfig().getClientUserId(), dyVar.D});
            Boolean bool3 = dyVar.C.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i9 = 5;
            } else {
                i9 = 4;
            }
            bundle.putInt("chatType", i9);
            bundle.putBoolean("canToggleTopics", false);
            r60 r60Var = new r60(bundle);
            r60Var.U = new dx(dyVar, c2Var);
            dyVar.presentFragment(r60Var);
        }
    }

    @Override
    public final void L(TLRPC.User user) {
        int i9;
        i9 = ((org.telegram.ui.ActionBar.o2) this.f40235a0).currentAccount;
        MessagesController.getInstance(i9).openApp(user, 0);
    }

    @Override
    public final boolean S() {
        if (this.f40235a0.N0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
        cy cyVar = this.Z;
        cyVar.f37350a.getClass();
        this.f40235a0.o4(r2Var, RecyclerView.R(r2Var), 0.0f, cyVar.d);
    }

    @Override
    public final void d(org.telegram.ui.Cells.r2 r2Var) {
        int i9;
        if (r2Var.getMessage() != null) {
            dy dyVar = this.f40235a0;
            i9 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = dyVar.getMessagesController().getTopicsController().findTopic(-r2Var.getDialogId(), MessageObject.getTopicId(i9, r2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (dyVar.f37668h2) {
                    dyVar.O3(r2Var.getDialogId(), findTopic.f22432id, false, null);
                } else {
                    vf.c.m(dyVar, -r2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override
    public final void l() {
        int i9;
        h();
        int i10 = cy.H;
        try {
            super.l();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        dy dyVar = this.f40235a0;
        if (dyVar.N0 == 15) {
            org.telegram.ui.ActionBar.w0 w0Var = dyVar.f37656f0;
            if (this.Q) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            w0Var.setVisibility(i9);
        }
    }
}
