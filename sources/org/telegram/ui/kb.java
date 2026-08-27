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

public final class kb implements org.telegram.ui.Cells.t0 {

    public final mb f39685a;

    public kb(mb mbVar) {
        this.f39685a = mbVar;
    }

    @Override
    public final void K(org.telegram.ui.Cells.v0 v0Var) {
        qb qbVar = this.f39685a.f40428n;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject.type == 22) {
            xc xcVar = new xc(a());
            xcVar.f44392h0 = qbVar;
            qbVar.presentFragment(xcVar);
            return;
        }
        PhotoViewer.t1().K2(null, qbVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize == null) {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, qbVar.B0);
        } else {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), qbVar.B0);
        }
    }

    @Override
    public final long a() {
        return -this.f39685a.f40428n.f41614s.f22380id;
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
    public final boolean g2(org.telegram.ui.Cells.v0 v0Var, float f10, float f11) {
        qb qbVar = this.f39685a.f40428n;
        int i10 = qb.T0;
        return qbVar.P0(v0Var, 0.0f, 0.0f);
    }

    @Override
    public final void p1(long j10) {
        qb qbVar = this.f39685a.f40428n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            if (MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) qbVar).currentAccount).checkCanOpenChat(bundle, qbVar)) {
                qbVar.presentFragment(new rn(bundle), true);
                return;
            }
            return;
        }
        if (j10 != UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) qbVar).currentAccount).getClientUserId()) {
            Bundle bundleH = com.google.android.recaptcha.internal.a.h(j10, "user_id");
            qb.p0(qbVar, bundleH, j10);
            ProfileActivity profileActivity = new ProfileActivity(bundleH, null);
            profileActivity.N4(0);
            qbVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.n2 y0() {
        return this.f39685a.f40428n;
    }

    @Override
    public final void z0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        qb qbVar = this.f39685a.f40428n;
        if (qbVar.A0) {
            return;
        }
        Object obj = qbVar.f41624y0.containsKey(tL_chatInviteExported.link) ? qbVar.f41624y0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                qb.A0(qbVar, (TLRPC.TL_messages_exportedChatInvite) obj, qbVar.f41625z0);
                return;
            } else {
                org.telegram.messenger.y1.q(R.string.LinkHashExpired, org.telegram.ui.Components.mc.a0(qbVar), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = qbVar.getMessagesController().getInputPeer(-qbVar.f41614s.f22380id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        qbVar.A0 = true;
        final boolean[] zArr = new boolean[1];
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(qbVar.getParentActivity(), 3, null);
        b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                this.f39328a.f39685a.f40428n.A0 = false;
                zArr[0] = true;
            }
        });
        b2Var.q(300L);
        qbVar.getConnectionsManager().bindRequestToGuid(qbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new gh.f1(this, tL_chatInviteExported, zArr, b2Var)), ((org.telegram.ui.ActionBar.n2) qbVar).classGuid);
    }

    @Override
    public final void I(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override
    public final void S(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override
    public final void q1(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override
    public final void C(org.telegram.ui.Cells.v0 v0Var, int i10) {
    }

    @Override
    public final void T1(org.telegram.ui.Cells.v0 v0Var, String str) {
    }

    @Override
    public final void A1(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void J(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void j2(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }
}
