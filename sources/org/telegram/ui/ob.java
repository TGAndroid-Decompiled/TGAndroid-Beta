package org.telegram.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ob implements org.telegram.ui.Cells.t0 {
    public final qb f36746a;

    public ob(qb qbVar) {
        this.f36746a = qbVar;
    }

    @Override
    public final void C1(long j10) {
        ub ubVar = this.f36746a.f37374n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            if (MessagesController.getInstance(ub.x0(ubVar)).checkCanOpenChat(bundle, ubVar)) {
                ubVar.presentFragment(new zn(bundle), true);
            }
        } else if (j10 != UserConfig.getInstance(ub.y0(ubVar)).getClientUserId()) {
            Bundle g10 = kf.k0.g(j10, "user_id");
            ub.p0(ubVar, g10, j10);
            ProfileActivity profileActivity = new ProfileActivity(g10, null);
            profileActivity.N4(0);
            ubVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.p2 T0() {
        return this.f36746a.f37374n;
    }

    @Override
    public final void V0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        Object obj;
        ub ubVar = this.f36746a.f37374n;
        if (ubVar.B0) {
            return;
        }
        if (ubVar.f38763z0.containsKey(tL_chatInviteExported.link)) {
            obj = ubVar.f38763z0.get(tL_chatInviteExported.link);
        } else {
            obj = null;
        }
        if (obj == null) {
            TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
            tL_messages_getExportedChatInvite.peer = ubVar.getMessagesController().getInputPeer(-ubVar.f38752s.f19159id);
            tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
            ubVar.B0 = true;
            final boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ubVar.getParentActivity(), 3, null);
            d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    ob.this.f36746a.f37374n.B0 = false;
                    zArr[0] = true;
                }
            });
            d2Var.q(300L);
            ubVar.getConnectionsManager().bindRequestToGuid(ubVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new kh.b1(this, tL_chatInviteExported, zArr, d2Var)), ub.z0(ubVar));
        } else if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
            ub.A0(ubVar, (TLRPC.TL_messages_exportedChatInvite) obj, ubVar.A0);
        } else {
            kf.k0.v(R.string.LinkHashExpired, org.telegram.ui.Components.qc.a0(ubVar), R.raw.linkbroken, 36);
        }
    }

    @Override
    public final long a() {
        return -this.f36746a.f37374n.f38752s.f19159id;
    }

    @Override
    public final long d() {
        return 0L;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final void o0(org.telegram.ui.Cells.v0 v0Var) {
        ub ubVar = this.f36746a.f37374n;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject.type == 22) {
            dd ddVar = new dd(a());
            ddVar.f33428i0 = ubVar;
            ubVar.presentFragment(ddVar);
            return;
        }
        PhotoViewer.t1().K2(null, ubVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), ubVar.C0);
            return;
        }
        PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, ubVar.C0);
    }

    @Override
    public final boolean w2(org.telegram.ui.Cells.v0 v0Var, float f10, float f11) {
        ub ubVar = this.f36746a.f37374n;
        int i10 = ub.U0;
        return ubVar.P0(v0Var, 0.0f, 0.0f);
    }

    @Override
    public final void D1(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override
    public final void b0(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override
    public final void w0(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override
    public final void V(org.telegram.ui.Cells.v0 v0Var, int i10) {
    }

    @Override
    public final void m2(org.telegram.ui.Cells.v0 v0Var, String str) {
    }

    @Override
    public final void N1(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void j0(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
    }

    @Override
    public final void l1(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void y2(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }
}
