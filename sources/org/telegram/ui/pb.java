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
public final class pb implements org.telegram.ui.Cells.t0 {
    public final rb f40758a;

    public pb(rb rbVar) {
        this.f40758a = rbVar;
    }

    @Override
    public final void E1(long j3) {
        vb vbVar = this.f40758a.f41368n;
        if (j3 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            if (MessagesController.getInstance(vb.x0(vbVar)).checkCanOpenChat(bundle, vbVar)) {
                vbVar.presentFragment(new zn(bundle), true);
            }
        } else if (j3 != UserConfig.getInstance(vb.y0(vbVar)).getClientUserId()) {
            Bundle f7 = sc.v.f(j3, "user_id");
            vb.p0(vbVar, f7, j3);
            ProfileActivity profileActivity = new ProfileActivity(f7, null);
            profileActivity.N4(0);
            vbVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.n2 T0() {
        return this.f40758a.f41368n;
    }

    @Override
    public final void W0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        Object obj;
        vb vbVar = this.f40758a.f41368n;
        if (vbVar.A0) {
            return;
        }
        if (vbVar.f42802y0.containsKey(tL_chatInviteExported.link)) {
            obj = vbVar.f42802y0.get(tL_chatInviteExported.link);
        } else {
            obj = null;
        }
        if (obj == null) {
            TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
            tL_messages_getExportedChatInvite.peer = vbVar.getMessagesController().getInputPeer(-vbVar.f42777f.f20038id);
            tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
            vbVar.A0 = true;
            final boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(vbVar.getParentActivity(), 3, null);
            b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    pb.this.f40758a.f41368n.A0 = false;
                    zArr[0] = true;
                }
            });
            b2Var.q(300L);
            vbVar.getConnectionsManager().bindRequestToGuid(vbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new ai.q3(this, tL_chatInviteExported, zArr, b2Var, 4)), vb.z0(vbVar));
        } else if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
            vb.A0(vbVar, (TLRPC.TL_messages_exportedChatInvite) obj, vbVar.f42803z0);
        } else {
            org.telegram.messenger.q.q(R.string.LinkHashExpired, org.telegram.ui.Components.ad.a0(vbVar), R.raw.linkbroken, 36);
        }
    }

    @Override
    public final long a() {
        return -this.f40758a.f41368n.f42777f.f20038id;
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
    public final void o0(org.telegram.ui.Cells.w0 w0Var) {
        vb vbVar = this.f40758a.f41368n;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject.type == 22) {
            bd bdVar = new bd(a());
            bdVar.f36263l0 = vbVar;
            vbVar.presentFragment(bdVar);
            return;
        }
        PhotoViewer.t1().K2(null, vbVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().e2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), vbVar.B0);
            return;
        }
        PhotoViewer.t1().d2(messageObject, null, 0L, 0L, 0L, vbVar.B0);
    }

    @Override
    public final boolean x2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        vb vbVar = this.f40758a.f41368n;
        int i10 = vb.Q0;
        return vbVar.P0(w0Var, 0.0f, 0.0f);
    }

    @Override
    public final void F1(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void d0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void w0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void X(org.telegram.ui.Cells.w0 w0Var, int i10) {
    }

    @Override
    public final void n2(org.telegram.ui.Cells.w0 w0Var, String str) {
    }

    @Override
    public final void P1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void k0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
    }

    @Override
    public final void m1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void z2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
