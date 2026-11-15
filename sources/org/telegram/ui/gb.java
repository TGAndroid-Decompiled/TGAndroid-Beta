package org.telegram.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class gb implements org.telegram.ui.Cells.q0 {
    public final ib f47386a;

    public gb(ib ibVar) {
        this.f47386a = ibVar;
    }

    @Override
    public final void C(org.telegram.ui.Cells.t0 t0Var) {
        lb lbVar = this.f47386a.f48003n;
        org.telegram.messenger.gj messageObject = t0Var.getMessageObject();
        if (messageObject.D == 22) {
            qc qcVar = new qc(a());
            qcVar.m0 = lbVar;
            lbVar.presentFragment(qcVar);
            return;
        }
        PhotoViewer.p1().I2(null, lbVar, null);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(messageObject.f23839p0, 640, false, null, false);
        if (w10 != null) {
            PhotoViewer.p1().c2(w10.location, org.telegram.messenger.gc.i(w10, messageObject.f23819k.action.photo), lbVar.C0);
            return;
        }
        PhotoViewer.p1().e2(messageObject, null, 0L, 0L, 0L, lbVar.C0);
    }

    @Override
    public final org.telegram.ui.ActionBar.e2 F() {
        return this.f47386a.f48003n;
    }

    @Override
    public final void M(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        Object obj;
        lb lbVar = this.f47386a.f48003n;
        if (lbVar.B0) {
            return;
        }
        if (lbVar.f48960z0.containsKey(tL_chatInviteExported.link)) {
            obj = lbVar.f48960z0.get(tL_chatInviteExported.link);
        } else {
            obj = null;
        }
        if (obj == null) {
            TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
            tL_messages_getExportedChatInvite.peer = lbVar.getMessagesController().j1(-lbVar.f48934f.f28051id);
            tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
            lbVar.B0 = true;
            final boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, lbVar.getParentActivity(), null);
            t1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    gb.this.f47386a.f48003n.B0 = false;
                    zArr[0] = true;
                }
            });
            t1Var.r(300L);
            lbVar.getConnectionsManager().bindRequestToGuid(lbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new bi.l1(this, tL_chatInviteExported, zArr, t1Var)), lb.E0(lbVar));
        } else if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
            lb.F0(lbVar, (TLRPC.TL_messages_exportedChatInvite) obj, lbVar.A0);
        } else {
            org.telegram.messenger.k5.n(null, 2131748913, org.telegram.ui.Components.cc.a0(lbVar), 2131624080, 36);
        }
    }

    @Override
    public final long a() {
        return -this.f47386a.f48003n.f48934f.f28051id;
    }

    @Override
    public final long b() {
        return 0L;
    }

    @Override
    public final void b0(long j3) {
        lb lbVar = this.f47386a.f48003n;
        if (j3 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            if (org.telegram.messenger.np.s1(lb.C0(lbVar)).E(bundle, lbVar, null, null)) {
                lbVar.presentFragment(new an(bundle), true);
            }
        } else if (j3 != org.telegram.messenger.m10.i(lb.D0(lbVar)).e()) {
            Bundle j10 = a8.p0.j(j3, "user_id");
            lb.u0(lbVar, j10, j3);
            ProfileActivity profileActivity = new ProfileActivity(j10, null);
            profileActivity.i5(0);
            lbVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final boolean p0(org.telegram.ui.Cells.t0 t0Var, float f10, float f11) {
        lb lbVar = this.f47386a.f48003n;
        int i7 = lb.R0;
        return lbVar.U0(t0Var, 0.0f, 0.0f);
    }

    @Override
    public final void E(org.telegram.ui.Cells.t0 t0Var) {
    }

    @Override
    public final void d0(org.telegram.ui.Cells.t0 t0Var) {
    }

    @Override
    public final void q(org.telegram.ui.Cells.t0 t0Var) {
    }

    @Override
    public final void k0(org.telegram.ui.Cells.t0 t0Var, String str) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.t0 t0Var, int i7) {
    }

    @Override
    public final void W(org.telegram.ui.Cells.t0 t0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void g0(org.telegram.ui.Cells.t0 t0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void v(org.telegram.ui.Cells.t0 t0Var, int i7, int i10) {
    }

    @Override
    public final void x0(org.telegram.ui.Cells.t0 t0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }
}
