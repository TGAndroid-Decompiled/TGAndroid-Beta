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
public final class qb implements org.telegram.ui.Cells.t0 {
    public final sb f36008a;

    public qb(sb sbVar) {
        this.f36008a = sbVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.p2 O0() {
        return this.f36008a.f36638n;
    }

    @Override
    public final void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        Object obj;
        wb wbVar = this.f36008a.f36638n;
        if (wbVar.E0) {
            return;
        }
        if (wbVar.C0.containsKey(tL_chatInviteExported.link)) {
            obj = wbVar.C0.get(tL_chatInviteExported.link);
        } else {
            obj = null;
        }
        if (obj == null) {
            TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
            tL_messages_getExportedChatInvite.peer = wbVar.getMessagesController().getInputPeer(-wbVar.f37812s.f17195id);
            tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
            wbVar.E0 = true;
            final boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(wbVar.getParentActivity(), 3, null);
            d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    qb.this.f36008a.f36638n.E0 = false;
                    zArr[0] = true;
                }
            });
            d2Var.q(300L);
            wbVar.getConnectionsManager().bindRequestToGuid(wbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new bi.l9(this, tL_chatInviteExported, zArr, d2Var, 3)), wb.z0(wbVar));
        } else if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
            wb.A0(wbVar, (TLRPC.TL_messages_exportedChatInvite) obj, wbVar.D0);
        } else {
            org.telegram.messenger.a2.o(R.string.LinkHashExpired, org.telegram.ui.Components.wc.a0(wbVar), R.raw.linkbroken, 36);
        }
    }

    @Override
    public final long a() {
        return -this.f36008a.f36638n.f37812s.f17195id;
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
        wb wbVar = this.f36008a.f36638n;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject.type == 22) {
            cd cdVar = new cd(a());
            cdVar.f31623l0 = wbVar;
            wbVar.presentFragment(cdVar);
            return;
        }
        PhotoViewer.t1().K2(null, wbVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), wbVar.F0);
            return;
        }
        PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, wbVar.F0);
    }

    @Override
    public final boolean p2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        wb wbVar = this.f36008a.f36638n;
        int i10 = wb.X0;
        return wbVar.P0(w0Var, 0.0f, 0.0f);
    }

    @Override
    public final void w1(long j3) {
        wb wbVar = this.f36008a.f36638n;
        if (j3 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            if (MessagesController.getInstance(wb.x0(wbVar)).checkCanOpenChat(bundle, wbVar)) {
                wbVar.presentFragment(new eo(bundle), true);
            }
        } else if (j3 != UserConfig.getInstance(wb.y0(wbVar)).getClientUserId()) {
            Bundle e = w.f.e(j3, "user_id");
            wb.p0(wbVar, e, j3);
            ProfileActivity profileActivity = new ProfileActivity(e, null);
            profileActivity.N4(0);
            wbVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void a0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void r0(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void x1(org.telegram.ui.Cells.w0 w0Var) {
    }

    @Override
    public final void V(org.telegram.ui.Cells.w0 w0Var, int i10) {
    }

    @Override
    public final void f2(org.telegram.ui.Cells.w0 w0Var, String str) {
    }

    @Override
    public final void H1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void f1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
    }

    @Override
    public final void s2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
