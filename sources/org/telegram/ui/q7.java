package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q7 extends g7 {
    public final s7 f39774n;

    public q7(s7 s7Var) {
        super(s7Var, 3);
        this.f39774n = s7Var;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        float f7;
        k7 k7Var = (k7) c1Var.f45766a;
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) k7Var.f37973b.getChildAt(0);
        ai.b bVar = ((m7) this.f36304e.get(i10)).d;
        if (bVar == k7Var.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != this.f36304e.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        k7Var.setTag(bVar);
        s7 s7Var = this.f39774n;
        if (bVar.f754f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f19917id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(s7Var.d.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = bVar.f750a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = bVar.f751b;
            String fileExtension = FileLoader.getFileExtension(bVar.f750a);
            TLRPC.Document document = tL_message.media.document;
            document.f19902id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (fileExtension.length() <= 0) {
                fileExtension = "mp3";
            }
            document.mime_type = "audio/".concat(fileExtension);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = bVar.f752c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (bVar.f753e == null) {
                ai.a aVar = new ai.a();
                bVar.f753e = aVar;
                aVar.f749b = true;
                Utilities.globalQueue.postRunnable(new r1(s7Var, bVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = bVar.f750a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(s7Var.d.getCurrentAccount(), tL_message, false, false);
            bVar.f754f = messageObject;
            messageObject.mediaExists = true;
        }
        i7Var.f(bVar.f754f, z11);
        boolean z12 = bVar.f753e.f749b;
        boolean z13 = !z12;
        if (!z10) {
            if (!z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            i7Var.f22142g0 = f7;
        }
        if (i7Var.f22141f0 != z13) {
            i7Var.f22141f0 = z13;
            i7Var.invalidate();
        }
        k7Var.d = z11;
        k7Var.f37974c.setText(AndroidUtilities.formatFileSize(bVar.f752c));
        k7Var.f37972a.a(this.f39774n.f40357f.f763j.contains(bVar), z10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        k7 k7Var = new k7(this, viewGroup.getContext(), 1);
        k7Var.f37975e = 3;
        p7 p7Var = new p7(this, viewGroup.getContext(), k7Var);
        p7Var.setCheckForButtonPress(true);
        k7Var.f37973b.addView(p7Var);
        return new s4.c1(k7Var);
    }
}
