package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class nw extends rf.l {
    public final ey Z;
    public final fy f40911a0;

    public nw(fy fyVar, fy fyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, ey eyVar) {
        super(fyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.f40911a0 = fyVar;
        this.Z = eyVar;
    }

    @Override
    public final void J() {
        this.f40911a0.presentFragment(new n());
    }

    @Override
    public final void K() {
        int i10;
        fy fyVar = this.f40911a0;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(fyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = fyVar.C;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle h = a4.w.h(0, "step");
            Boolean bool = fyVar.C.has_username;
            if (bool != null) {
                h.putBoolean("forcePublic", bool.booleanValue());
            }
            hd hdVar = new hd(h);
            hdVar.f38869p0 = new l6(fyVar, hdVar, c2Var, 2);
            fyVar.presentFragment(hdVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = fyVar.C.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{fyVar.getUserConfig().getClientUserId()} : new long[]{fyVar.getUserConfig().getClientUserId(), fyVar.D});
            Boolean bool3 = fyVar.C.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i10 = 5;
            } else {
                i10 = 4;
            }
            bundle.putInt("chatType", i10);
            bundle.putBoolean("canToggleTopics", false);
            t60 t60Var = new t60(bundle);
            t60Var.U = new fx(fyVar, c2Var);
            fyVar.presentFragment(t60Var);
        }
    }

    @Override
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.o2) this.f40911a0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override
    public final boolean S() {
        if (this.f40911a0.N0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(org.telegram.ui.Cells.p2 p2Var) {
        ey eyVar = this.Z;
        eyVar.f37921a.getClass();
        this.f40911a0.o4(p2Var, RecyclerView.R(p2Var), 0.0f, eyVar.d);
    }

    @Override
    public final void d(org.telegram.ui.Cells.p2 p2Var) {
        int i10;
        if (p2Var.getMessage() != null) {
            fy fyVar = this.f40911a0;
            i10 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = fyVar.getMessagesController().getTopicsController().findTopic(-p2Var.getDialogId(), MessageObject.getTopicId(i10, p2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (fyVar.f38295h2) {
                    fyVar.O3(p2Var.getDialogId(), findTopic.f22444id, false, null);
                } else {
                    yf.d.m(fyVar, -p2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override
    public final void l() {
        int i10;
        h();
        int i11 = ey.H;
        try {
            super.l();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        fy fyVar = this.f40911a0;
        if (fyVar.N0 == 15) {
            org.telegram.ui.ActionBar.w0 w0Var = fyVar.f38283f0;
            if (this.Q) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            w0Var.setVisibility(i10);
        }
    }
}
