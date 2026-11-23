package org.telegram.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class gb implements org.telegram.ui.Cells.s0 {
    public final ib f48201a;

    public gb(ib ibVar) {
        this.f48201a = ibVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.g2 B() {
        return this.f48201a.f48771n;
    }

    @Override
    public final void H(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        Object obj;
        lb lbVar = this.f48201a.f48771n;
        if (lbVar.B0) {
            return;
        }
        if (lbVar.f49713z0.containsKey(tL_chatInviteExported.link)) {
            obj = lbVar.f49713z0.get(tL_chatInviteExported.link);
        } else {
            obj = null;
        }
        if (obj == null) {
            TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
            tL_messages_getExportedChatInvite.peer = lbVar.getMessagesController().l1(-lbVar.f49687f.f28492id);
            tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
            lbVar.B0 = true;
            final boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, lbVar.getParentActivity(), null);
            t1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    gb.this.f48201a.f48771n.B0 = false;
                    zArr[0] = true;
                }
            });
            t1Var.r(300L);
            lbVar.getConnectionsManager().bindRequestToGuid(lbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new bi.m2(this, tL_chatInviteExported, zArr, t1Var)), lb.E0(lbVar));
        } else if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
            lb.F0(lbVar, (TLRPC.TL_messages_exportedChatInvite) obj, lbVar.A0);
        } else {
            org.telegram.messenger.f3.n(null, 2131748720, org.telegram.ui.Components.kc.b0(lbVar), 2131624080, 36);
        }
    }

    @Override
    public final void Q(long j3) {
        lb lbVar = this.f48201a.f48771n;
        if (j3 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            if (org.telegram.messenger.mp.u1(lb.C0(lbVar)).E(bundle, lbVar, null, null)) {
                lbVar.presentFragment(new bn(bundle), true);
            }
        } else if (j3 != org.telegram.messenger.i10.i(lb.D0(lbVar)).e()) {
            Bundle j10 = a8.p0.j(j3, "user_id");
            lb.u0(lbVar, j10, j3);
            ProfileActivity profileActivity = new ProfileActivity(j10, null);
            profileActivity.j5(0);
            lbVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final long a() {
        return -this.f48201a.f48771n.f49687f.f28492id;
    }

    @Override
    public final long b() {
        return 0L;
    }

    @Override
    public final boolean g0(org.telegram.ui.Cells.v0 v0Var, float f10, float f11) {
        lb lbVar = this.f48201a.f48771n;
        int i7 = lb.R0;
        return lbVar.U0(v0Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final void r(org.telegram.ui.Cells.v0 v0Var) {
        lb lbVar = this.f48201a.f48771n;
        org.telegram.messenger.fj messageObject = v0Var.getMessageObject();
        if (messageObject.D == 22) {
            qc qcVar = new qc(a());
            qcVar.m0 = lbVar;
            lbVar.presentFragment(qcVar);
            return;
        }
        PhotoViewer.p1().J2(null, lbVar, null);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(messageObject.f24093p0, 640, false, null, false);
        if (w10 != null) {
            PhotoViewer.p1().d2(w10.location, org.telegram.messenger.fc.i(w10, messageObject.f24073k.action.photo), lbVar.C0);
            return;
        }
        PhotoViewer.p1().f2(messageObject, null, 0L, 0L, 0L, lbVar.C0);
    }

    @Override
    public final void S(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override
    public final void l(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override
    public final void w(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override
    public final void V(org.telegram.ui.Cells.v0 v0Var, String str) {
    }

    @Override
    public final void j(org.telegram.ui.Cells.v0 v0Var, int i7) {
    }

    @Override
    public final void K(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void T(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.v0 v0Var, int i7, int i10) {
    }

    @Override
    public final void s0(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }
}
