package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

public final class ow extends pf.k {
    public final fy Z;

    public final gy f41196a0;

    public ow(gy gyVar, gy gyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, fy fyVar) {
        super(gyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.f41196a0 = gyVar;
        this.Z = fyVar;
    }

    @Override
    public final void J() {
        this.f41196a0.presentFragment(new m());
    }

    @Override
    public final void K() {
        gy gyVar = this.f41196a0;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(gyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = gyVar.C;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle bundleG = a9.p.g(0, "step");
            Boolean bool = gyVar.C.has_username;
            if (bool != null) {
                bundleG.putBoolean("forcePublic", bool.booleanValue());
            }
            id idVar = new id(bundleG);
            idVar.f39049p0 = new m6(gyVar, idVar, b2Var, 2);
            gyVar.presentFragment(idVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = gyVar.C.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{gyVar.getUserConfig().getClientUserId()} : new long[]{gyVar.getUserConfig().getClientUserId(), gyVar.D});
            Boolean bool3 = gyVar.C.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            u60 u60Var = new u60(bundle);
            u60Var.U = new gx(gyVar, b2Var);
            gyVar.presentFragment(u60Var);
        }
    }

    @Override
    public final void L(TLRPC.User user) {
        MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) this.f41196a0).currentAccount).openApp(user, 0);
    }

    @Override
    public final boolean S() {
        return this.f41196a0.N0 == 0;
    }

    @Override
    public final void a(org.telegram.ui.Cells.p2 p2Var) {
        fy fyVar = this.Z;
        fyVar.f38225a.getClass();
        this.f41196a0.o4(p2Var, RecyclerView.R(p2Var), 0.0f, fyVar.d);
    }

    @Override
    public final void d(org.telegram.ui.Cells.p2 p2Var) {
        if (p2Var.getMessage() != null) {
            gy gyVar = this.f41196a0;
            TLRPC.TL_forumTopic tL_forumTopicFindTopic = gyVar.getMessagesController().getTopicsController().findTopic(-p2Var.getDialogId(), MessageObject.getTopicId(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount, p2Var.getMessage().messageOwner, true));
            if (tL_forumTopicFindTopic != null) {
                if (gyVar.f38537h2) {
                    gyVar.O3(p2Var.getDialogId(), tL_forumTopicFindTopic.f22432id, false, null);
                } else {
                    wf.c.m(gyVar, -p2Var.getDialogId(), tL_forumTopicFindTopic, 0);
                }
            }
        }
    }

    @Override
    public final void l() {
        h();
        int i10 = fy.H;
        try {
            super.l();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        gy gyVar = this.f41196a0;
        if (gyVar.N0 == 15) {
            gyVar.f38525f0.setVisibility(this.Q ? 8 : 0);
        }
    }
}
