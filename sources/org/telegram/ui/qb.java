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
public final class qb implements org.telegram.ui.Cells.s0 {
    public final sb f42799a;

    public qb(sb sbVar) {
        this.f42799a = sbVar;
    }

    @Override
    public final boolean M0(org.telegram.ui.Cells.v0 v0Var, float f7, float f10) {
        wb wbVar = this.f42799a.f43444n;
        int i10 = wb.Q0;
        return wbVar.Q0(v0Var, 0.0f, 0.0f);
    }

    @Override
    public final long a() {
        return -this.f42799a.f43444n.f45068f.f22027id;
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
    public final void i0(long j10) {
        wb wbVar = this.f42799a.f43444n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            if (MessagesController.getInstance(wb.y0(wbVar)).checkCanOpenChat(bundle, wbVar)) {
                wbVar.presentFragment(new un(bundle), true);
            }
        } else if (j10 != UserConfig.getInstance(wb.z0(wbVar)).getClientUserId()) {
            Bundle h = a1.g.h(j10, "user_id");
            wb.q0(wbVar, h, j10);
            ProfileActivity profileActivity = new ProfileActivity(h, null);
            profileActivity.X4(0);
            wbVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void k(org.telegram.ui.Cells.v0 v0Var) {
        wb wbVar = this.f42799a.f43444n;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject.type == 22) {
            bd bdVar = new bd(a());
            bdVar.f38050l0 = wbVar;
            wbVar.presentFragment(bdVar);
            return;
        }
        PhotoViewer.u1().M2(null, wbVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize != null) {
            PhotoViewer.u1().f2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), wbVar.B0);
            return;
        }
        PhotoViewer.u1().h2(messageObject, null, 0L, 0L, 0L, wbVar.B0);
    }

    @Override
    public final org.telegram.ui.ActionBar.r2 y() {
        return this.f42799a.f43444n;
    }

    @Override
    public final void z(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        Object obj;
        wb wbVar = this.f42799a.f43444n;
        if (wbVar.A0) {
            return;
        }
        if (wbVar.f45093y0.containsKey(tL_chatInviteExported.link)) {
            obj = wbVar.f45093y0.get(tL_chatInviteExported.link);
        } else {
            obj = null;
        }
        if (obj == null) {
            TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
            tL_messages_getExportedChatInvite.peer = wbVar.getMessagesController().getInputPeer(-wbVar.f45068f.f22027id);
            tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
            wbVar.A0 = true;
            final boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(wbVar.getParentActivity(), 3, null);
            e2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    qb.this.f42799a.f43444n.A0 = false;
                    zArr[0] = true;
                }
            });
            e2Var.r(300L);
            wbVar.getConnectionsManager().bindRequestToGuid(wbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new bi.i2(this, tL_chatInviteExported, zArr, e2Var, 9)), wb.A0(wbVar));
        } else if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
            wb.B0(wbVar, (TLRPC.TL_messages_exportedChatInvite) obj, wbVar.f45094z0);
        } else {
            org.telegram.messenger.t.q(R.string.LinkHashExpired, org.telegram.ui.Components.wc.b0(wbVar), R.raw.linkbroken, 36);
        }
    }

    @Override
    public final void f(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override
    public final void l0(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override
    public final void t(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override
    public final void H0(org.telegram.ui.Cells.v0 v0Var, String str) {
    }

    @Override
    public final void e(org.telegram.ui.Cells.v0 v0Var, int i10) {
    }

    @Override
    public final void G(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void g(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
    }

    @Override
    public final void v0(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void P0(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
