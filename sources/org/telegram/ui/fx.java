package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fx extends hg.m {
    public final xy f36014d0;
    public final yy f36015e0;

    public fx(yy yyVar, yy yyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, xy xyVar) {
        super(yyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.f36015e0 = yyVar;
        this.f36014d0 = xyVar;
    }

    @Override
    public final void J() {
        this.f36015e0.presentFragment(new l());
    }

    @Override
    public final void K() {
        int i10;
        yy yyVar = this.f36015e0;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(yyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = yyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle f7 = org.telegram.ui.Cells.c1.f(0, "step");
            Boolean bool = yyVar.G.has_username;
            if (bool != null) {
                f7.putBoolean("forcePublic", bool.booleanValue());
            }
            sd sdVar = new sd(f7);
            sdVar.f39785t0 = new q6(yyVar, sdVar, a2Var, 2);
            yyVar.presentFragment(sdVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = yyVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{yyVar.getUserConfig().getClientUserId()} : new long[]{yyVar.getUserConfig().getClientUserId(), yyVar.H});
            Boolean bool3 = yyVar.G.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i10 = 5;
            } else {
                i10 = 4;
            }
            bundle.putInt("chatType", i10);
            bundle.putBoolean("canToggleTopics", false);
            p70 p70Var = new p70(bundle);
            p70Var.Y = new xx(yyVar, a2Var);
            yyVar.presentFragment(p70Var);
        }
    }

    @Override
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.m2) this.f36015e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override
    public final boolean S() {
        if (this.f36015e0.R0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(org.telegram.ui.Cells.s2 s2Var) {
        xy xyVar = this.f36014d0;
        xyVar.f41679a.getClass();
        this.f36015e0.m4(s2Var, RecyclerView.R(s2Var), 0.0f, xyVar.d);
    }

    @Override
    public final void e(org.telegram.ui.Cells.s2 s2Var) {
        int i10;
        if (s2Var.getMessage() != null) {
            yy yyVar = this.f36015e0;
            i10 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = yyVar.getMessagesController().getTopicsController().findTopic(-s2Var.getDialogId(), MessageObject.getTopicId(i10, s2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (yyVar.f42041l2) {
                    yyVar.M3(s2Var.getDialogId(), findTopic.f18968id, false, null);
                } else {
                    og.d.m(yyVar, -s2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override
    public final void l() {
        int i10;
        h();
        int i11 = xy.L;
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
        yy yyVar = this.f36015e0;
        if (yyVar.R0 == 15) {
            org.telegram.ui.ActionBar.u0 u0Var = yyVar.f42030j0;
            if (this.U) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            u0Var.setVisibility(i10);
        }
    }
}
