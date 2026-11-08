package org.telegram.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class hb implements org.telegram.ui.Cells.q0 {
    public final jb f46318a;

    public hb(jb jbVar) {
        this.f46318a = jbVar;
    }

    @Override
    public final void E(long j3) {
        mb mbVar = this.f46318a.f46918n;
        if (j3 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            if (org.telegram.messenger.qp.s1(mb.C0(mbVar)).E(bundle, mbVar, null, null)) {
                mbVar.presentFragment(new an(bundle), true);
            }
        } else if (j3 != org.telegram.messenger.p10.i(mb.D0(mbVar)).e()) {
            Bundle j10 = a8.p0.j(j3, "user_id");
            mb.u0(mbVar, j10, j3);
            ProfileActivity profileActivity = new ProfileActivity(j10, null);
            profileActivity.g5(0);
            mbVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final long a() {
        return -this.f46318a.f46918n.f47748f.f26956id;
    }

    @Override
    public final long b() {
        return 0L;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void q(org.telegram.ui.Cells.t0 t0Var) {
        mb mbVar = this.f46318a.f46918n;
        org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
        if (messageObject.D == 22) {
            rc rcVar = new rc(a());
            rcVar.f49449l0 = mbVar;
            mbVar.presentFragment(rcVar);
            return;
        }
        PhotoViewer.p1().H2(null, mbVar, null);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(messageObject.f23273n0, 640, false, null, false);
        if (w10 != null) {
            PhotoViewer.p1().b2(w10.location, org.telegram.messenger.hc.i(w10, messageObject.f23262k.action.photo), mbVar.B0);
            return;
        }
        PhotoViewer.p1().d2(messageObject, null, 0L, 0L, 0L, mbVar.B0);
    }

    @Override
    public final boolean r0(org.telegram.ui.Cells.t0 t0Var, float f10, float f11) {
        mb mbVar = this.f46318a.f46918n;
        int i7 = mb.Q0;
        return mbVar.U0(t0Var, 0.0f, 0.0f);
    }

    @Override
    public final org.telegram.ui.ActionBar.f2 t() {
        return this.f46318a.f46918n;
    }

    @Override
    public final void w(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        Object obj;
        mb mbVar = this.f46318a.f46918n;
        if (mbVar.A0) {
            return;
        }
        if (mbVar.f47773y0.containsKey(tL_chatInviteExported.link)) {
            obj = mbVar.f47773y0.get(tL_chatInviteExported.link);
        } else {
            obj = null;
        }
        if (obj == null) {
            TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
            tL_messages_getExportedChatInvite.peer = mbVar.getMessagesController().j1(-mbVar.f47748f.f26956id);
            tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
            mbVar.A0 = true;
            final boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, mbVar.getParentActivity(), null);
            u1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    hb.this.f46318a.f46918n.A0 = false;
                    zArr[0] = true;
                }
            });
            u1Var.r(300L);
            mbVar.getConnectionsManager().bindRequestToGuid(mbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new bi.g2(this, tL_chatInviteExported, zArr, u1Var, 9)), mb.E0(mbVar));
        } else if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
            mb.F0(mbVar, (TLRPC.TL_messages_exportedChatInvite) obj, mbVar.f47774z0);
        } else {
            org.telegram.messenger.k5.o(null, 2131748914, org.telegram.ui.Components.hc.a0(mbVar), 2131624079, 36);
        }
    }

    @Override
    public final void F(org.telegram.ui.Cells.t0 t0Var) {
    }

    @Override
    public final void l(org.telegram.ui.Cells.t0 t0Var) {
    }

    @Override
    public final void s(org.telegram.ui.Cells.t0 t0Var) {
    }

    @Override
    public final void c0(org.telegram.ui.Cells.t0 t0Var, String str) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.t0 t0Var, int i7) {
    }

    @Override
    public final void D(org.telegram.ui.Cells.t0 t0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void W(org.telegram.ui.Cells.t0 t0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.t0 t0Var, int i7, int i10) {
    }

    @Override
    public final void t0(org.telegram.ui.Cells.t0 t0Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }
}
