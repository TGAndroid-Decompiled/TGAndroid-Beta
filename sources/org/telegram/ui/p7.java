package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p7 extends f7 {
    public final s7 f50778n;

    public p7(s7 s7Var) {
        super(s7Var, 3);
        this.f50778n = s7Var;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        float f10;
        j7 j7Var = (j7) f1Var.f59122a;
        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) j7Var.f48890b.getChildAt(0);
        ei.b bVar = ((l7) this.f47154e.get(i7)).d;
        if (bVar == j7Var.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i7 != this.f47154e.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        j7Var.setTag(bVar);
        s7 s7Var = this.f50778n;
        if (bVar.f10970f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f28426id = i7;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long e10 = org.telegram.messenger.j10.i(s7Var.f51920e.getCurrentAccount()).e();
            tL_peerUser.user_id = e10;
            peer.user_id = e10;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = bVar.f10966a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = bVar.f10967b;
            String D = org.telegram.messenger.w7.D(bVar.f10966a);
            TLRPC.Document document = tL_message.media.document;
            document.f28411id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (D.length() <= 0) {
                D = "mp3";
            }
            document.mime_type = "audio/".concat(D);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = bVar.f10968c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (bVar.f10969e == null) {
                ?? obj = new Object();
                bVar.f10969e = obj;
                obj.f10965a = true;
                Utilities.f22782e.c(new o1(s7Var, bVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = bVar.f10966a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(s7Var.f51920e.getCurrentAccount(), tL_message, false, false);
            bVar.f10970f = fjVar;
            fjVar.f24027z0 = true;
        }
        g7Var.f(bVar.f10970f, z11);
        boolean z12 = bVar.f10969e.f10965a;
        boolean z13 = !z12;
        if (!z10) {
            if (!z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            g7Var.f30698h0 = f10;
        }
        if (g7Var.f30697g0 != z13) {
            g7Var.f30697g0 = z13;
            g7Var.invalidate();
        }
        j7Var.d = z11;
        j7Var.f48891c.setText(org.telegram.messenger.g0.i0(bVar.f10968c, false, false));
        j7Var.f48889a.a(this.f50778n.h.f10979j.contains(bVar), z10);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        j7 j7Var = new j7(this, viewGroup.getContext(), 1);
        j7Var.f48892e = 3;
        o7 o7Var = new o7(this, viewGroup.getContext(), j7Var);
        o7Var.setCheckForButtonPress(true);
        j7Var.f48890b.addView(o7Var);
        return new v4.f1(j7Var);
    }
}
