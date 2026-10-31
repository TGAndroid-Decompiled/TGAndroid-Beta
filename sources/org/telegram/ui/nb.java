package org.telegram.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class nb implements org.telegram.ui.Cells.q0 {
    public final pb f39893a;

    public nb(pb pbVar) {
        this.f39893a = pbVar;
    }

    @Override
    public final void E0(long j10) {
        sb sbVar = this.f39893a.f40563n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            if (org.telegram.messenger.vp.r1(sb.B0(sbVar)).E(bundle, sbVar, null, null)) {
                sbVar.presentFragment(new un(bundle), true);
            }
        } else if (j10 != org.telegram.messenger.d20.i(sb.C0(sbVar)).e()) {
            Bundle k10 = org.telegram.ui.Cells.f1.k(j10, "user_id");
            sb.t0(sbVar, k10, j10);
            ProfileActivity profileActivity = new ProfileActivity(k10, null);
            profileActivity.f5(0);
            sbVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void F(org.telegram.ui.Cells.s0 s0Var) {
        sb sbVar = this.f39893a.f40563n;
        org.telegram.messenger.jj messageObject = s0Var.getMessageObject();
        if (messageObject.D == 22) {
            zc zcVar = new zc(a());
            zcVar.f44101l0 = sbVar;
            sbVar.presentFragment(zcVar);
            return;
        }
        PhotoViewer.v1().N2(null, sbVar, null);
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(messageObject.f16348n0, 640, false, null, false);
        if (w9 != null) {
            PhotoViewer.v1().g2(w9.location, org.telegram.messenger.ic.i(w9, messageObject.f16337k.action.photo), sbVar.B0);
            return;
        }
        PhotoViewer.v1().i2(messageObject, null, 0L, 0L, 0L, sbVar.B0);
    }

    @Override
    public final long a() {
        return -this.f39893a.f40563n.f41433f.f19793id;
    }

    @Override
    public final long b() {
        return 0L;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final org.telegram.ui.ActionBar.k2 h0() {
        return this.f39893a.f40563n;
    }

    @Override
    public final boolean i1(org.telegram.ui.Cells.s0 s0Var, float f7, float f10) {
        sb sbVar = this.f39893a.f40563n;
        int i10 = sb.Q0;
        return sbVar.T0(s0Var, 0.0f, 0.0f);
    }

    @Override
    public final void k0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        Object obj;
        sb sbVar = this.f39893a.f40563n;
        if (sbVar.A0) {
            return;
        }
        if (sbVar.f41458y0.containsKey(tL_chatInviteExported.link)) {
            obj = sbVar.f41458y0.get(tL_chatInviteExported.link);
        } else {
            obj = null;
        }
        if (obj == null) {
            TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
            tL_messages_getExportedChatInvite.peer = sbVar.getMessagesController().i1(-sbVar.f41433f.f19793id);
            tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
            sbVar.A0 = true;
            final boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, sbVar.getParentActivity(), null);
            x1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    nb.this.f39893a.f40563n.A0 = false;
                    zArr[0] = true;
                }
            });
            x1Var.r(300L);
            sbVar.getConnectionsManager().bindRequestToGuid(sbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new mb(this, tL_chatInviteExported, zArr, x1Var, 0)), sb.D0(sbVar));
        } else if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
            sb.E0(sbVar, (TLRPC.TL_messages_exportedChatInvite) obj, sbVar.f41459z0);
        } else {
            org.telegram.messenger.m5.n(null, 2131748923, org.telegram.ui.Components.cc.a0(sbVar), 2131624078, 36);
        }
    }

    @Override
    public final void G0(org.telegram.ui.Cells.s0 s0Var) {
    }

    @Override
    public final void I(org.telegram.ui.Cells.s0 s0Var) {
    }

    @Override
    public final void w(org.telegram.ui.Cells.s0 s0Var) {
    }

    @Override
    public final void e1(org.telegram.ui.Cells.s0 s0Var, String str) {
    }

    @Override
    public final void r(org.telegram.ui.Cells.s0 s0Var, int i10) {
    }

    @Override
    public final void E(org.telegram.ui.Cells.s0 s0Var, int i10, int i11) {
    }

    @Override
    public final void R0(org.telegram.ui.Cells.s0 s0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void t0(org.telegram.ui.Cells.s0 s0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.s0 s0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
