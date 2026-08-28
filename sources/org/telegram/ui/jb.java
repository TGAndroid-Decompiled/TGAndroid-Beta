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
public final class jb implements org.telegram.ui.Cells.t0 {
    public final lb f39430a;

    public jb(lb lbVar) {
        this.f39430a = lbVar;
    }

    @Override
    public final void C0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        Object obj;
        pb pbVar = this.f39430a.f40103n;
        if (pbVar.A0) {
            return;
        }
        if (pbVar.f41428y0.containsKey(tL_chatInviteExported.link)) {
            obj = pbVar.f41428y0.get(tL_chatInviteExported.link);
        } else {
            obj = null;
        }
        if (obj == null) {
            TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
            tL_messages_getExportedChatInvite.peer = pbVar.getMessagesController().getInputPeer(-pbVar.f41418s.f22380id);
            tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
            pbVar.A0 = true;
            final boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(pbVar.getParentActivity(), 3, null);
            c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    jb.this.f39430a.f40103n.A0 = false;
                    zArr[0] = true;
                }
            });
            c2Var.q(300L);
            pbVar.getConnectionsManager().bindRequestToGuid(pbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new fh.h1(this, tL_chatInviteExported, zArr, c2Var)), pb.y0(pbVar));
        } else if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
            pb.z0(pbVar, (TLRPC.TL_messages_exportedChatInvite) obj, pbVar.f41429z0);
        } else {
            org.telegram.messenger.l0.p(R.string.LinkHashExpired, org.telegram.ui.Components.oc.a0(pbVar), R.raw.linkbroken, 36);
        }
    }

    @Override
    public final void O(org.telegram.ui.Cells.w0 w0Var) {
        pb pbVar = this.f39430a.f40103n;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject.type == 22) {
            xc xcVar = new xc(a());
            xcVar.f44472h0 = pbVar;
            pbVar.presentFragment(xcVar);
            return;
        }
        PhotoViewer.t1().K2(null, pbVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), pbVar.B0);
            return;
        }
        PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, pbVar.B0);
    }

    @Override
    public final boolean Z1(org.telegram.ui.Cells.w0 w0Var, float f10, float f11) {
        pb pbVar = this.f39430a.f40103n;
        int i9 = pb.T0;
        return pbVar.P0(w0Var, 0.0f, 0.0f);
    }

    @Override
    public final long a() {
        return -this.f39430a.f40103n.f41418s.f22380id;
    }

    @Override
    public final long b() {
        return 0L;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final void o1(long j10) {
        pb pbVar = this.f39430a.f40103n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            if (MessagesController.getInstance(pb.w0(pbVar)).checkCanOpenChat(bundle, pbVar)) {
                pbVar.presentFragment(new qn(bundle), true);
            }
        } else if (j10 != UserConfig.getInstance(pb.x0(pbVar)).getClientUserId()) {
            Bundle g10 = e2.c.g(j10, "user_id");
            pb.o0(pbVar, g10, j10);
            ProfileActivity profileActivity = new ProfileActivity(g10, null);
            profileActivity.N4(0);
            pbVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.o2 y0() {
        return this.f39430a.f40103n;
    }

    @Override
    public final void I(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void c0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void p1(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void E(org.telegram.ui.Cells.w0 w0Var, int i9) {
    }

    @Override
    public final void N1(org.telegram.ui.Cells.w0 w0Var, String str) {
    }

    @Override
    public final void L(org.telegram.ui.Cells.w0 w0Var, int i9, int i10) {
    }

    @Override
    public final void V0(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void v1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void a2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }
}
