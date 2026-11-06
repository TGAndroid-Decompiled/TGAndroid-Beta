package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q7 extends g7 {
    public final t7 f49103n;

    public q7(t7 t7Var) {
        super(t7Var, 3);
        this.f49103n = t7Var;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        boolean z10;
        float f10;
        k7 k7Var = (k7) d1Var.f56927a;
        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) k7Var.f47109b.getChildAt(0);
        ci.b bVar = ((m7) this.f45504e.get(i7)).d;
        if (bVar == k7Var.getTag()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i7 != this.f45504e.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        k7Var.setTag(bVar);
        t7 t7Var = this.f49103n;
        if (bVar.f6421f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f26973id = i7;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long e10 = org.telegram.messenger.p10.i(t7Var.f49939e.getCurrentAccount()).e();
            tL_peerUser.user_id = e10;
            peer.user_id = e10;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = bVar.f6417a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = bVar.f6418b;
            String D = org.telegram.messenger.w7.D(bVar.f6417a);
            TLRPC.Document document = tL_message.media.document;
            document.f26958id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (D.length() <= 0) {
                D = "mp3";
            }
            document.mime_type = "audio/".concat(D);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = bVar.f6419c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (bVar.f6420e == null) {
                ?? obj = new Object();
                bVar.f6420e = obj;
                obj.f6416a = true;
                Utilities.f21333e.c(new o1(t7Var, bVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = bVar.f6417a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(t7Var.f49939e.getCurrentAccount(), tL_message, false, false);
            bVar.f6421f = ijVar;
            ijVar.f23286x0 = true;
        }
        g7Var.f(bVar.f6421f, z10);
        boolean z11 = bVar.f6420e.f6416a;
        boolean z12 = !z11;
        if (!z9) {
            if (!z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            g7Var.f29186g0 = f10;
        }
        if (g7Var.f29185f0 != z12) {
            g7Var.f29185f0 = z12;
            g7Var.invalidate();
        }
        k7Var.d = z10;
        k7Var.f47110c.setText(org.telegram.messenger.g0.i0(bVar.f6419c, false, false));
        k7Var.f47108a.a(this.f49103n.h.f6430j.contains(bVar), z9);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        k7 k7Var = new k7(this, viewGroup.getContext(), 1);
        k7Var.f47111e = 3;
        p7 p7Var = new p7(this, viewGroup.getContext(), k7Var);
        p7Var.setCheckForButtonPress(true);
        k7Var.f47109b.addView(p7Var);
        return new v4.d1(k7Var);
    }
}
