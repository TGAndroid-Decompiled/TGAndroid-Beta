package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o7 extends e7 {
    public final q7 f40468n;

    public o7(q7 q7Var) {
        super(q7Var, 3);
        this.f40468n = q7Var;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        boolean z11;
        float f7;
        i7 i7Var = (i7) d1Var.f47782a;
        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) i7Var.f38632b.getChildAt(0);
        zh.a aVar = ((k7) this.f36962e.get(i10)).d;
        if (aVar == i7Var.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != this.f36962e.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        i7Var.setTag(aVar);
        q7 q7Var = this.f40468n;
        if (aVar.f54819f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f20089id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(q7Var.d.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = aVar.f54815a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = aVar.f54816b;
            String fileExtension = FileLoader.getFileExtension(aVar.f54815a);
            TLRPC.Document document = tL_message.media.document;
            document.f20074id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (fileExtension.length() <= 0) {
                fileExtension = "mp3";
            }
            document.mime_type = "audio/".concat(fileExtension);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = aVar.f54817c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (aVar.f54818e == null) {
                c3.j0 j0Var = new c3.j0();
                aVar.f54818e = j0Var;
                j0Var.f4131b = true;
                Utilities.globalQueue.postRunnable(new q1(q7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.f54815a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(q7Var.d.getCurrentAccount(), tL_message, false, false);
            aVar.f54819f = messageObject;
            messageObject.mediaExists = true;
        }
        j7Var.f(aVar.f54819f, z11);
        boolean z12 = aVar.f54818e.f4131b;
        boolean z13 = !z12;
        if (!z10) {
            if (!z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            j7Var.f22366g0 = f7;
        }
        if (j7Var.f22365f0 != z13) {
            j7Var.f22365f0 = z13;
            j7Var.invalidate();
        }
        i7Var.d = z11;
        i7Var.f38633c.setText(AndroidUtilities.formatFileSize(aVar.f54817c));
        i7Var.f38631a.a(this.f40468n.f41090f.f54828j.contains(aVar), z10);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        i7 i7Var = new i7(this, viewGroup.getContext(), 1);
        i7Var.f38634e = 3;
        n7 n7Var = new n7(this, viewGroup.getContext(), i7Var);
        n7Var.setCheckForButtonPress(true);
        i7Var.f38632b.addView(n7Var);
        return new s4.d1(i7Var);
    }
}
