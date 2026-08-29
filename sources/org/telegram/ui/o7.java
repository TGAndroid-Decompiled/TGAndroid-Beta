package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o7 extends e7 {
    public final q7 f40993n;

    public o7(q7 q7Var) {
        super(q7Var, 3);
        this.f40993n = q7Var;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        boolean z11;
        float f9;
        i7 i7Var = (i7) n1Var.f6432a;
        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) i7Var.f39137b.getChildAt(0);
        kh.a aVar = ((k7) this.f37378e.get(i10)).d;
        if (aVar == i7Var.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != this.f37378e.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        i7Var.setTag(aVar);
        q7 q7Var = this.f40993n;
        if (aVar.f13893f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f22413id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(q7Var.d.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = aVar.f13889a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = aVar.f13890b;
            String fileExtension = FileLoader.getFileExtension(aVar.f13889a);
            TLRPC.Document document = tL_message.media.document;
            document.f22398id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (fileExtension.length() <= 0) {
                fileExtension = "mp3";
            }
            document.mime_type = "audio/".concat(fileExtension);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = aVar.f13891c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (aVar.f13892e == null) {
                ?? obj = new Object();
                aVar.f13892e = obj;
                obj.f6575a = true;
                Utilities.globalQueue.postRunnable(new u1(q7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.f13889a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(q7Var.d.getCurrentAccount(), tL_message, false, false);
            aVar.f13893f = messageObject;
            messageObject.mediaExists = true;
        }
        f7Var.f(aVar.f13893f, z11);
        boolean z12 = aVar.f13892e.f6575a;
        boolean z13 = !z12;
        if (!z10) {
            if (!z12) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            f7Var.f24356c0 = f9;
        }
        if (f7Var.f24354b0 != z13) {
            f7Var.f24354b0 = z13;
            f7Var.invalidate();
        }
        i7Var.d = z11;
        i7Var.f39138c.setText(AndroidUtilities.formatFileSize(aVar.f13891c));
        i7Var.f39136a.a(this.f40993n.f41551f.f13902j.contains(aVar), z10);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        i7 i7Var = new i7(this, viewGroup.getContext(), 1);
        i7Var.f39139e = 3;
        n7 n7Var = new n7(this, viewGroup.getContext(), i7Var);
        n7Var.setCheckForButtonPress(true);
        i7Var.f39137b.addView(n7Var);
        return new f2.n1(i7Var);
    }
}
