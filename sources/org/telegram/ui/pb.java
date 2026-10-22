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
    public final rb f40177a;

    public pb(rb rbVar) {
        this.f40177a = rbVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.n2 L0() {
        return this.f40177a.f41114n;
    }

    @Override
    public final void N0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        Object obj;
        vb vbVar = this.f40177a.f41114n;
        if (vbVar.A0) {
            return;
        }
        if (vbVar.f42196y0.containsKey(tL_chatInviteExported.link)) {
            obj = vbVar.f42196y0.get(tL_chatInviteExported.link);
        } else {
            obj = null;
        }
        if (obj == null) {
            TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
            tL_messages_getExportedChatInvite.peer = vbVar.getMessagesController().getInputPeer(-vbVar.f42171f.f20279id);
            tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
            vbVar.A0 = true;
            final boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(vbVar.getParentActivity(), 3, null);
            b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    pb.this.f40177a.f41114n.A0 = false;
                    zArr[0] = true;
                }
            });
            b2Var.r(300L);
            vbVar.getConnectionsManager().bindRequestToGuid(vbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new ai.k2(this, tL_chatInviteExported, zArr, b2Var, 9)), vb.z0(vbVar));
        } else if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
            vb.A0(vbVar, (TLRPC.TL_messages_exportedChatInvite) obj, vbVar.f42197z0);
        } else {
            org.telegram.messenger.g0.q(R.string.LinkHashExpired, org.telegram.ui.Components.xc.a0(vbVar), R.raw.linkbroken, 36);
        }
    }

    @Override
    public final long a() {
        return -this.f40177a.f41114n.f42171f.f20279id;
    }

    @Override
    public final long d() {
        return 0L;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean h2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        vb vbVar = this.f40177a.f41114n;
        int i10 = vb.Q0;
        return vbVar.P0(w0Var, 0.0f, 0.0f);
    }

    @Override
    public final void k0(org.telegram.ui.Cells.w0 w0Var) {
        vb vbVar = this.f40177a.f41114n;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject.type == 22) {
            bd bdVar = new bd(a());
            bdVar.f35591l0 = vbVar;
            vbVar.presentFragment(bdVar);
            return;
        }
        PhotoViewer.u1().M2(null, vbVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize != null) {
            PhotoViewer.u1().f2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), vbVar.B0);
            return;
        }
        PhotoViewer.u1().h2(messageObject, null, 0L, 0L, 0L, vbVar.B0);
    }

    @Override
    public final void s1(long j10) {
        vb vbVar = this.f40177a.f41114n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            if (MessagesController.getInstance(vb.x0(vbVar)).checkCanOpenChat(bundle, vbVar)) {
                vbVar.presentFragment(new qn(bundle), true);
            }
        } else if (j10 != UserConfig.getInstance(vb.y0(vbVar)).getClientUserId()) {
            Bundle b10 = zf.d0.b(j10, "user_id");
            vb.p0(vbVar, b10, j10);
            ProfileActivity profileActivity = new ProfileActivity(b10, null);
            profileActivity.N4(0);
            vbVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void b0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void r0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void t1(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void X(org.telegram.ui.Cells.w0 w0Var, int i10) {
    }

    @Override
    public final void X1(org.telegram.ui.Cells.w0 w0Var, String str) {
    }

    @Override
    public final void C1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void c1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
    }

    @Override
    public final void k2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
