package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q7 extends g7 {
    public final t7 f40704n;

    public q7(t7 t7Var) {
        super(t7Var, 3);
        this.f40704n = t7Var;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        float f7;
        k7 k7Var = (k7) c1Var.f47909a;
        org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) k7Var.f38661b.getChildAt(0);
        sh.a aVar = ((m7) this.e.get(i10)).d;
        if (aVar == k7Var.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != this.e.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        k7Var.setTag(aVar);
        t7 t7Var = this.f40704n;
        if (aVar.f48506f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f19815id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long e = org.telegram.messenger.e20.i(t7Var.e.getCurrentAccount()).e();
            tL_peerUser.user_id = e;
            peer.user_id = e;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = aVar.f48503a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = aVar.f48504b;
            String D = org.telegram.messenger.b8.D(aVar.f48503a);
            TLRPC.Document document = tL_message.media.document;
            document.f19800id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (D.length() <= 0) {
                D = "mp3";
            }
            document.mime_type = "audio/".concat(D);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = aVar.f48505c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (aVar.e == null) {
                ?? obj = new Object();
                aVar.e = obj;
                obj.f3684a = true;
                Utilities.e.c(new p1(t7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.f48503a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            org.telegram.messenger.kj kjVar = new org.telegram.messenger.kj(t7Var.e.getCurrentAccount(), tL_message, false, false);
            aVar.f48506f = kjVar;
            kjVar.f16740x0 = true;
        }
        k7Var2.f(aVar.f48506f, z11);
        boolean z12 = aVar.e.f3684a;
        boolean z13 = !z12;
        if (!z10) {
            if (!z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            k7Var2.f22166g0 = f7;
        }
        if (k7Var2.f22165f0 != z13) {
            k7Var2.f22165f0 = z13;
            k7Var2.invalidate();
        }
        k7Var.d = z11;
        k7Var.f38662c.setText(org.telegram.messenger.i0.i0(aVar.f48505c, false, false));
        k7Var.f38660a.a(this.f40704n.h.f48514j.contains(aVar), z10);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        k7 k7Var = new k7(this, viewGroup.getContext(), 1);
        k7Var.e = 3;
        p7 p7Var = new p7(this, viewGroup.getContext(), k7Var);
        p7Var.setCheckForButtonPress(true);
        k7Var.f38661b.addView(p7Var);
        return new s4.c1(k7Var);
    }
}
