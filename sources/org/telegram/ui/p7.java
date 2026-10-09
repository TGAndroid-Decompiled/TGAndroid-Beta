package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p7 extends f7 {
    public final r7 f40688n;

    public p7(r7 r7Var) {
        super(r7Var, 3);
        this.f40688n = r7Var;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        boolean z11;
        float f7;
        j7 j7Var = (j7) d1Var.f47658a;
        org.telegram.ui.Cells.j7 j7Var2 = (org.telegram.ui.Cells.j7) j7Var.f38841b.getChildAt(0);
        zh.a aVar = ((l7) this.f37175e.get(i10)).d;
        if (aVar == j7Var.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != this.f37175e.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        j7Var.setTag(aVar);
        r7 r7Var = this.f40688n;
        if (aVar.f54698f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f20059id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(r7Var.d.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = aVar.f54694a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = aVar.f54695b;
            String fileExtension = FileLoader.getFileExtension(aVar.f54694a);
            TLRPC.Document document = tL_message.media.document;
            document.f20044id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (fileExtension.length() <= 0) {
                fileExtension = "mp3";
            }
            document.mime_type = "audio/".concat(fileExtension);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = aVar.f54696c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (aVar.f54697e == null) {
                c3.j0 j0Var = new c3.j0();
                aVar.f54697e = j0Var;
                j0Var.f4131b = true;
                Utilities.globalQueue.postRunnable(new r1(r7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.f54694a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(r7Var.d.getCurrentAccount(), tL_message, false, false);
            aVar.f54698f = messageObject;
            messageObject.mediaExists = true;
        }
        j7Var2.f(aVar.f54698f, z11);
        boolean z12 = aVar.f54697e.f4131b;
        boolean z13 = !z12;
        if (!z10) {
            if (!z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            j7Var2.f22338g0 = f7;
        }
        if (j7Var2.f22337f0 != z13) {
            j7Var2.f22337f0 = z13;
            j7Var2.invalidate();
        }
        j7Var.d = z11;
        j7Var.f38842c.setText(AndroidUtilities.formatFileSize(aVar.f54696c));
        j7Var.f38840a.a(this.f40688n.f41292f.f54707j.contains(aVar), z10);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        j7 j7Var = new j7(this, viewGroup.getContext(), 1);
        j7Var.f38843e = 3;
        o7 o7Var = new o7(this, viewGroup.getContext(), j7Var);
        o7Var.setCheckForButtonPress(true);
        j7Var.f38841b.addView(o7Var);
        return new s4.d1(j7Var);
    }
}
