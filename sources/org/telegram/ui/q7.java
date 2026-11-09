package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q7 extends g7 {
    public final t7 f48941n;

    public q7(t7 t7Var) {
        super(t7Var, 3);
        this.f48941n = t7Var;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        boolean z10;
        float f10;
        k7 k7Var = (k7) d1Var.f57056a;
        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) k7Var.f47216b.getChildAt(0);
        ci.b bVar = ((m7) this.f45604e.get(i7)).d;
        if (bVar == k7Var.getTag()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i7 != this.f45604e.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        k7Var.setTag(bVar);
        t7 t7Var = this.f48941n;
        if (bVar.f6419f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f26977id = i7;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long e10 = org.telegram.messenger.p10.i(t7Var.f50101e.getCurrentAccount()).e();
            tL_peerUser.user_id = e10;
            peer.user_id = e10;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = bVar.f6415a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = bVar.f6416b;
            String D = org.telegram.messenger.w7.D(bVar.f6415a);
            TLRPC.Document document = tL_message.media.document;
            document.f26962id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (D.length() <= 0) {
                D = "mp3";
            }
            document.mime_type = "audio/".concat(D);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = bVar.f6417c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (bVar.f6418e == null) {
                ?? obj = new Object();
                bVar.f6418e = obj;
                obj.f6414a = true;
                Utilities.f21336e.c(new o1(t7Var, bVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = bVar.f6415a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(t7Var.f50101e.getCurrentAccount(), tL_message, false, false);
            bVar.f6419f = ijVar;
            ijVar.f23311x0 = true;
        }
        g7Var.f(bVar.f6419f, z10);
        boolean z11 = bVar.f6418e.f6414a;
        boolean z12 = !z11;
        if (!z9) {
            if (!z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            g7Var.f29194g0 = f10;
        }
        if (g7Var.f29193f0 != z12) {
            g7Var.f29193f0 = z12;
            g7Var.invalidate();
        }
        k7Var.d = z10;
        k7Var.f47217c.setText(org.telegram.messenger.g0.i0(bVar.f6417c, false, false));
        k7Var.f47215a.a(this.f48941n.h.f6428j.contains(bVar), z9);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        k7 k7Var = new k7(this, viewGroup.getContext(), 1);
        k7Var.f47218e = 3;
        p7 p7Var = new p7(this, viewGroup.getContext(), k7Var);
        p7Var.setCheckForButtonPress(true);
        k7Var.f47216b.addView(p7Var);
        return new v4.d1(k7Var);
    }
}
