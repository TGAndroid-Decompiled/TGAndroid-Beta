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
public final class ib implements org.telegram.ui.Cells.t0 {
    public final kb f39195a;

    public ib(kb kbVar) {
        this.f39195a = kbVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.o2 O0() {
        return this.f39195a.f39829n;
    }

    @Override
    public final void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        Object obj;
        ob obVar = this.f39195a.f39829n;
        if (obVar.A0) {
            return;
        }
        if (obVar.f41076y0.containsKey(tL_chatInviteExported.link)) {
            obj = obVar.f41076y0.get(tL_chatInviteExported.link);
        } else {
            obj = null;
        }
        if (obj == null) {
            TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
            tL_messages_getExportedChatInvite.peer = obVar.getMessagesController().getInputPeer(-obVar.f41066s.f22392id);
            tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
            obVar.A0 = true;
            final boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(obVar.getParentActivity(), 3, null);
            c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    ib.this.f39195a.f39829n.A0 = false;
                    zArr[0] = true;
                }
            });
            c2Var.q(300L);
            obVar.getConnectionsManager().bindRequestToGuid(obVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new ih.c1(this, tL_chatInviteExported, zArr, c2Var)), ob.z0(obVar));
        } else if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
            ob.A0(obVar, (TLRPC.TL_messages_exportedChatInvite) obj, obVar.f41077z0);
        } else {
            j7.l1.v(R.string.LinkHashExpired, org.telegram.ui.Components.tc.a0(obVar), R.raw.linkbroken, 36);
        }
    }

    @Override
    public final long a() {
        return -this.f39195a.f39829n.f41066s.f22392id;
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
    public final void i0(org.telegram.ui.Cells.v0 v0Var) {
        ob obVar = this.f39195a.f39829n;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject.type == 22) {
            vc vcVar = new vc(a());
            vcVar.f43514h0 = obVar;
            obVar.presentFragment(vcVar);
            return;
        }
        PhotoViewer.t1().K2(null, obVar, null);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), obVar.B0);
            return;
        }
        PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, obVar.B0);
    }

    @Override
    public final boolean r2(org.telegram.ui.Cells.v0 v0Var, float f9, float f10) {
        ob obVar = this.f39195a.f39829n;
        int i10 = ob.T0;
        return obVar.P0(v0Var, 0.0f, 0.0f);
    }

    @Override
    public final void x1(long j10) {
        ob obVar = this.f39195a.f39829n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            if (MessagesController.getInstance(ob.x0(obVar)).checkCanOpenChat(bundle, obVar)) {
                obVar.presentFragment(new tn(bundle), true);
            }
        } else if (j10 != UserConfig.getInstance(ob.y0(obVar)).getClientUserId()) {
            Bundle g10 = j7.l1.g(j10, "user_id");
            ob.p0(obVar, g10, j10);
            ProfileActivity profileActivity = new ProfileActivity(g10, null);
            profileActivity.N4(0);
            obVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void W(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override
    public final void q0(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override
    public final void y1(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override
    public final void J(org.telegram.ui.Cells.v0 v0Var, int i10) {
    }

    @Override
    public final void h2(org.telegram.ui.Cells.v0 v0Var, String str) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void b0(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
    }

    @Override
    public final void g1(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void t2(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }
}
