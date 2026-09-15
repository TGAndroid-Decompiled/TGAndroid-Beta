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
    public final qb f36177a;

    public ob(qb qbVar) {
        this.f36177a = qbVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.n2 O0() {
        return this.f36177a.f36834n;
    }

    @Override
    public final void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        Object obj;
        ub ubVar = this.f36177a.f36834n;
        if (ubVar.A0) {
            return;
        }
        if (ubVar.f37970y0.containsKey(tL_chatInviteExported.link)) {
            obj = ubVar.f37970y0.get(tL_chatInviteExported.link);
        } else {
            obj = null;
        }
        if (obj == null) {
            TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
            tL_messages_getExportedChatInvite.peer = ubVar.getMessagesController().getInputPeer(-ubVar.f37945f.f18112id);
            tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
            ubVar.A0 = true;
            final boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ubVar.getParentActivity(), 3, null);
            b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    ob.this.f36177a.f36834n.A0 = false;
                    zArr[0] = true;
                }
            });
            b2Var.q(300L);
            ubVar.getConnectionsManager().bindRequestToGuid(ubVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new ai.p3(this, tL_chatInviteExported, zArr, b2Var, 4)), ub.z0(ubVar));
        } else if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
            ub.A0(ubVar, (TLRPC.TL_messages_exportedChatInvite) obj, ubVar.f37971z0);
        } else {
            org.telegram.messenger.w1.o(R.string.LinkHashExpired, org.telegram.ui.Components.vc.a0(ubVar), R.raw.linkbroken, 36);
        }
    }

    @Override
    public final long a() {
        return -this.f36177a.f36834n.f37945f.f18112id;
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
    public final void k0(org.telegram.ui.Cells.w0 w0Var) {
        ub ubVar = this.f36177a.f36834n;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject.type == 22) {
            ad adVar = new ad(a());
            adVar.f31768l0 = ubVar;
            ubVar.presentFragment(adVar);
            return;
        }
        PhotoViewer.t1().K2(null, ubVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), ubVar.B0);
            return;
        }
        PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, ubVar.B0);
    }

    @Override
    public final boolean r2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        ub ubVar = this.f36177a.f36834n;
        int i10 = ub.Q0;
        return ubVar.P0(w0Var, 0.0f, 0.0f);
    }

    @Override
    public final void x1(long j3) {
        ub ubVar = this.f36177a.f36834n;
        if (j3 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            if (MessagesController.getInstance(ub.x0(ubVar)).checkCanOpenChat(bundle, ubVar)) {
                ubVar.presentFragment(new bo(bundle), true);
            }
        } else if (j3 != UserConfig.getInstance(ub.y0(ubVar)).getClientUserId()) {
            Bundle e = w.f.e(j3, "user_id");
            ub.p0(ubVar, e, j3);
            ProfileActivity profileActivity = new ProfileActivity(e, null);
            profileActivity.N4(0);
            ubVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void Z(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void r0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void y1(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void U(org.telegram.ui.Cells.w0 w0Var, int i10) {
    }

    @Override
    public final void h2(org.telegram.ui.Cells.w0 w0Var, String str) {
    }

    @Override
    public final void J1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
    }

    @Override
    public final void g1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void u2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
