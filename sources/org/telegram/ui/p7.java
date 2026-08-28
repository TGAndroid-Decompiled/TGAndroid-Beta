package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p7 extends f7 {
    public final r7 f41350n;

    public p7(r7 r7Var) {
        super(r7Var, 3);
        this.f41350n = r7Var;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        boolean z11;
        float f10;
        j7 j7Var = (j7) q1Var.f5501a;
        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) j7Var.f39387b.getChildAt(0);
        hh.a aVar = ((l7) this.f37834e.get(i9)).d;
        if (aVar == j7Var.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i9 != this.f37834e.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        j7Var.setTag(aVar);
        r7 r7Var = this.f41350n;
        if (aVar.f10784f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f22401id = i9;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(r7Var.d.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = aVar.f10780a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = aVar.f10781b;
            String fileExtension = FileLoader.getFileExtension(aVar.f10780a);
            TLRPC.Document document = tL_message.media.document;
            document.f22386id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (fileExtension.length() <= 0) {
                fileExtension = "mp3";
            }
            document.mime_type = "audio/".concat(fileExtension);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = aVar.f10782c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (aVar.f10783e == null) {
                ?? obj = new Object();
                aVar.f10783e = obj;
                obj.f4335a = true;
                Utilities.globalQueue.postRunnable(new t1(r7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.f10780a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(r7Var.d.getCurrentAccount(), tL_message, false, false);
            aVar.f10784f = messageObject;
            messageObject.mediaExists = true;
        }
        h7Var.f(aVar.f10784f, z11);
        boolean z12 = aVar.f10783e.f4335a;
        boolean z13 = !z12;
        if (!z10) {
            if (!z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            h7Var.f24476c0 = f10;
        }
        if (h7Var.f24474b0 != z13) {
            h7Var.f24474b0 = z13;
            h7Var.invalidate();
        }
        j7Var.d = z11;
        j7Var.f39388c.setText(AndroidUtilities.formatFileSize(aVar.f10782c));
        j7Var.f39386a.a(this.f41350n.f42294f.f10793j.contains(aVar), z10);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        j7 j7Var = new j7(this, viewGroup.getContext(), 1);
        j7Var.f39389e = 3;
        o7 o7Var = new o7(this, viewGroup.getContext(), j7Var);
        o7Var.setCheckForButtonPress(true);
        j7Var.f39387b.addView(o7Var);
        return new f2.q1(j7Var);
    }
}
