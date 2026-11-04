package org.telegram.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class fb implements org.telegram.ui.Cells.q0 {
    public final hb f45231a;

    public fb(hb hbVar) {
        this.f45231a = hbVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.d2 E() {
        return this.f45231a.f45891n;
    }

    @Override
    public final void F(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        Object obj;
        kb kbVar = this.f45231a.f45891n;
        if (kbVar.B0) {
            return;
        }
        if (kbVar.f46891z0.containsKey(tL_chatInviteExported.link)) {
            obj = kbVar.f46891z0.get(tL_chatInviteExported.link);
        } else {
            obj = null;
        }
        if (obj == null) {
            TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
            tL_messages_getExportedChatInvite.peer = kbVar.getMessagesController().j1(-kbVar.f46865f.f27001id);
            tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
            kbVar.B0 = true;
            final boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, kbVar.getParentActivity(), null);
            s1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    fb.this.f45231a.f45891n.B0 = false;
                    zArr[0] = true;
                }
            });
            s1Var.r(300L);
            kbVar.getConnectionsManager().bindRequestToGuid(kbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new ai.q1(this, tL_chatInviteExported, zArr, s1Var)), kb.E0(kbVar));
        } else if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
            kb.F0(kbVar, (TLRPC.TL_messages_exportedChatInvite) obj, kbVar.A0);
        } else {
            org.telegram.messenger.k5.o(null, 2131748921, org.telegram.ui.Components.fc.a0(kbVar), 2131624079, 36);
        }
    }

    @Override
    public final void W(long j10) {
        kb kbVar = this.f45231a.f45891n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            if (org.telegram.messenger.hp.s1(kb.C0(kbVar)).E(bundle, kbVar, null, null)) {
                kbVar.presentFragment(new wm(bundle), true);
            }
        } else if (j10 != org.telegram.messenger.h10.i(kb.D0(kbVar)).e()) {
            Bundle j11 = a1.g.j(j10, "user_id");
            kb.u0(kbVar, j11, j10);
            ProfileActivity profileActivity = new ProfileActivity(j11, null);
            profileActivity.g5(0);
            kbVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final long a() {
        return -this.f45231a.f45891n.f46865f.f27001id;
    }

    @Override
    public final long b() {
        return 0L;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean r0(org.telegram.ui.Cells.t0 t0Var, float f10, float f11) {
        kb kbVar = this.f45231a.f45891n;
        int i3 = kb.R0;
        return kbVar.U0(t0Var, 0.0f, 0.0f);
    }

    @Override
    public final void u(org.telegram.ui.Cells.t0 t0Var) {
        kb kbVar = this.f45231a.f45891n;
        org.telegram.messenger.zi messageObject = t0Var.getMessageObject();
        if (messageObject.D == 22) {
            pc pcVar = new pc(a());
            pcVar.m0 = kbVar;
            kbVar.presentFragment(pcVar);
            return;
        }
        PhotoViewer.v1().N2(null, kbVar, null);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(messageObject.f26878n0, 640, false, null, false);
        if (w10 != null) {
            PhotoViewer.v1().g2(w10.location, org.telegram.messenger.ac.i(w10, messageObject.f26868k.action.photo), kbVar.C0);
            return;
        }
        PhotoViewer.v1().i2(messageObject, null, 0L, 0L, 0L, kbVar.C0);
    }

    @Override
    public final void c0(org.telegram.ui.Cells.t0 t0Var) {
    }

    @Override
    public final void r(org.telegram.ui.Cells.t0 t0Var) {
    }

    @Override
    public final void x(org.telegram.ui.Cells.t0 t0Var) {
    }

    @Override
    public final void h(org.telegram.ui.Cells.t0 t0Var, int i3) {
    }

    @Override
    public final void q0(org.telegram.ui.Cells.t0 t0Var, String str) {
    }

    @Override
    public final void M(org.telegram.ui.Cells.t0 t0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void g0(org.telegram.ui.Cells.t0 t0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void t(org.telegram.ui.Cells.t0 t0Var, int i3, int i10) {
    }

    @Override
    public final void v0(org.telegram.ui.Cells.t0 t0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }
}
