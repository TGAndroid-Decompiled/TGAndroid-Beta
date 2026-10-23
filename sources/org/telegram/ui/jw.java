package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class jw extends hg.m {
    public final ay f38377d0;
    public final cy f38378e0;

    public jw(cy cyVar, cy cyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, ay ayVar) {
        super(cyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.f38378e0 = cyVar;
        this.f38377d0 = ayVar;
    }

    @Override
    public final void J() {
        this.f38378e0.presentFragment(new l());
    }

    @Override
    public final void K() {
        int i10;
        cy cyVar = this.f38378e0;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(cyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = cyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle i11 = org.telegram.ui.Cells.c1.i(0, "step");
            Boolean bool = cyVar.G.has_username;
            if (bool != null) {
                i11.putBoolean("forcePublic", bool.booleanValue());
            }
            md mdVar = new md(i11);
            mdVar.f39207t0 = new p6(cyVar, mdVar, b2Var, 2);
            cyVar.presentFragment(mdVar);
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
            s60 s60Var = new s60(bundle);
            s60Var.Y = new bx(cyVar, b2Var);
            cyVar.presentFragment(s60Var);
        }
    }

    @Override
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.n2) this.f38378e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override
    public final boolean S() {
        if (this.f38378e0.R0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
        ay ayVar = this.f38377d0;
        ayVar.f35447a.getClass();
        this.f38378e0.m4(r2Var, RecyclerView.R(r2Var), 0.0f, ayVar.d);
    }

    @Override
    public final void e(org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        if (r2Var.getMessage() != null) {
            cy cyVar = this.f38378e0;
            i10 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = cyVar.getMessagesController().getTopicsController().findTopic(-r2Var.getDialogId(), MessageObject.getTopicId(i10, r2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (cyVar.f36133l2) {
                    cyVar.M3(r2Var.getDialogId(), findTopic.f20332id, false, null);
                } else {
                    og.d.m(cyVar, -r2Var.getDialogId(), findTopic, 0);
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
        cy cyVar = this.f38378e0;
        if (cyVar.R0 == 15) {
            org.telegram.ui.ActionBar.u0 u0Var = cyVar.f36122j0;
            if (this.U) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            u0Var.setVisibility(i10);
        }
    }
}
