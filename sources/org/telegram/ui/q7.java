package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q7 extends g7 {
    public final t7 f50476n;

    public q7(t7 t7Var) {
        super(t7Var, 3);
        this.f50476n = t7Var;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        boolean z11;
        float f10;
        k7 k7Var = (k7) e1Var.f58535a;
        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) k7Var.f48559b.getChildAt(0);
        ei.b bVar = ((m7) this.f47004e.get(i7)).d;
        if (bVar == k7Var.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i7 != this.f47004e.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        k7Var.setTag(bVar);
        t7 t7Var = this.f50476n;
        if (bVar.f10650f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f28072id = i7;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long e10 = org.telegram.messenger.m10.i(t7Var.f51400e.getCurrentAccount()).e();
            tL_peerUser.user_id = e10;
            peer.user_id = e10;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = bVar.f10646a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = bVar.f10647b;
            String D = org.telegram.messenger.w7.D(bVar.f10646a);
            TLRPC.Document document = tL_message.media.document;
            document.f28057id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (D.length() <= 0) {
                D = "mp3";
            }
            document.mime_type = "audio/".concat(D);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = bVar.f10648c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (bVar.f10649e == null) {
                ?? obj = new Object();
                bVar.f10649e = obj;
                obj.f10645a = true;
                Utilities.f22416e.c(new o1(t7Var, bVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = bVar.f10646a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(t7Var.f51400e.getCurrentAccount(), tL_message, false, false);
            bVar.f10650f = gjVar;
            gjVar.f23878z0 = true;
        }
        f7Var.f(bVar.f10650f, z11);
        boolean z12 = bVar.f10649e.f10645a;
        boolean z13 = !z12;
        if (!z10) {
            if (!z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            f7Var.f30283h0 = f10;
        }
        if (f7Var.f30282g0 != z13) {
            f7Var.f30282g0 = z13;
            f7Var.invalidate();
        }
        k7Var.d = z11;
        k7Var.f48560c.setText(org.telegram.messenger.g0.i0(bVar.f10648c, false, false));
        k7Var.f48558a.a(this.f50476n.h.f10659j.contains(bVar), z10);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        k7 k7Var = new k7(this, viewGroup.getContext(), 1);
        k7Var.f48561e = 3;
        p7 p7Var = new p7(this, viewGroup.getContext(), k7Var);
        p7Var.setCheckForButtonPress(true);
        k7Var.f48559b.addView(p7Var);
        return new v4.e1(k7Var);
    }
}
