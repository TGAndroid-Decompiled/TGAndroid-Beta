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
public final class mb implements org.telegram.ui.Cells.t0 {
    public final ob f36258a;

    public mb(ob obVar) {
        this.f36258a = obVar;
    }

    @Override
    public final void A1(long j10) {
        sb sbVar = this.f36258a.f36864n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            if (MessagesController.getInstance(sb.x0(sbVar)).checkCanOpenChat(bundle, sbVar)) {
                sbVar.presentFragment(new xn(bundle), true);
            }
        } else if (j10 != UserConfig.getInstance(sb.y0(sbVar)).getClientUserId()) {
            Bundle g10 = kh.a2.g(j10, "user_id");
            sb.p0(sbVar, g10, j10);
            ProfileActivity profileActivity = new ProfileActivity(g10, null);
            profileActivity.N4(0);
            sbVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.p2 Q0() {
        return this.f36258a.f36864n;
    }

    @Override
    public final void S0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        Object obj;
        sb sbVar = this.f36258a.f36864n;
        if (sbVar.B0) {
            return;
        }
        if (sbVar.f38284z0.containsKey(tL_chatInviteExported.link)) {
            obj = sbVar.f38284z0.get(tL_chatInviteExported.link);
        } else {
            obj = null;
        }
        if (obj == null) {
            TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
            tL_messages_getExportedChatInvite.peer = sbVar.getMessagesController().getInputPeer(-sbVar.f38273s.f19184id);
            tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
            sbVar.B0 = true;
            final boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(sbVar.getParentActivity(), 3, null);
            d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    mb.this.f36258a.f36864n.B0 = false;
                    zArr[0] = true;
                }
            });
            d2Var.q(300L);
            sbVar.getConnectionsManager().bindRequestToGuid(sbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new kh.b1(this, tL_chatInviteExported, zArr, d2Var)), sb.z0(sbVar));
        } else if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
            sb.A0(sbVar, (TLRPC.TL_messages_exportedChatInvite) obj, sbVar.A0);
        } else {
            kh.a2.v(R.string.LinkHashExpired, org.telegram.ui.Components.qc.a0(sbVar), R.raw.linkbroken, 36);
        }
    }

    @Override
    public final long a() {
        return -this.f36258a.f36864n.f38273s.f19184id;
    }

    @Override
    public final long b() {
        return 0L;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void m0(org.telegram.ui.Cells.v0 v0Var) {
        sb sbVar = this.f36258a.f36864n;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject.type == 22) {
            bd bdVar = new bd(a());
            bdVar.f32922i0 = sbVar;
            sbVar.presentFragment(bdVar);
            return;
        }
        PhotoViewer.t1().K2(null, sbVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), sbVar.C0);
            return;
        }
        PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, sbVar.C0);
    }

    @Override
    public final boolean u2(org.telegram.ui.Cells.v0 v0Var, float f10, float f11) {
        sb sbVar = this.f36258a.f36864n;
        int i10 = sb.U0;
        return sbVar.P0(v0Var, 0.0f, 0.0f);
    }

    @Override
    public final void B1(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override
    public final void c0(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override
    public final void t0(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override
    public final void J(org.telegram.ui.Cells.v0 v0Var, int i10) {
    }

    @Override
    public final void l2(org.telegram.ui.Cells.v0 v0Var, String str) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void i1(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void j0(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
    }

    @Override
    public final void x2(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }
}
