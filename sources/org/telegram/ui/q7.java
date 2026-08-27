package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class q7 extends g7 {

    public final s7 f41534n;

    public q7(s7 s7Var) {
        super(s7Var, 3);
        this.f41534n = s7Var;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        k7 k7Var = (k7) o1Var.f5789a;
        org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) k7Var.f39629b.getChildAt(0);
        ih.a aVar = ((m7) this.f37950e.get(i10)).d;
        boolean z10 = aVar == k7Var.getTag();
        boolean z11 = i10 != this.f37950e.size() - 1;
        k7Var.setTag(aVar);
        s7 s7Var = this.f41534n;
        if (aVar.f11480f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f22401id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(s7Var.d.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = aVar.f11476a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = aVar.f11477b;
            String fileExtension = FileLoader.getFileExtension(aVar.f11476a);
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
            document2.size = aVar.f11478c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (aVar.f11479e == null) {
                d5.c cVar = new d5.c();
                aVar.f11479e = cVar;
                cVar.f4779a = true;
                Utilities.globalQueue.postRunnable(new u1(s7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.f11476a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(s7Var.d.getCurrentAccount(), tL_message, false, false);
            aVar.f11480f = messageObject;
            messageObject.mediaExists = true;
        }
        e7Var.f(aVar.f11480f, z11);
        boolean z12 = aVar.f11479e.f4779a;
        boolean z13 = !z12;
        if (!z10) {
            e7Var.f24305c0 = !z12 ? 1.0f : 0.0f;
        }
        if (e7Var.f24303b0 != z13) {
            e7Var.f24303b0 = z13;
            e7Var.invalidate();
        }
        k7Var.d = z11;
        k7Var.f39630c.setText(AndroidUtilities.formatFileSize(aVar.f11478c));
        k7Var.f39628a.a(this.f41534n.f42534f.f11489j.contains(aVar), z10);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        k7 k7Var = new k7(this, viewGroup.getContext(), 1);
        k7Var.f39631e = 3;
        p7 p7Var = new p7(this, viewGroup.getContext(), k7Var);
        p7Var.setCheckForButtonPress(true);
        k7Var.f39629b.addView(p7Var);
        return new org.telegram.ui.Components.lk0(k7Var);
    }
}
