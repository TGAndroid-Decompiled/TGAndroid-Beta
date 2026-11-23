package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ir implements Runnable {
    public final int f48810a;
    public final qr f48811b;
    public final TLRPC.User f48812c;

    public ir(qr qrVar, TLRPC.User user, int i7) {
        this.f48810a = i7;
        this.f48811b = qrVar;
        this.f48812c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f48810a) {
            case 0:
                qr qrVar = this.f48811b;
                TLRPC.User user = this.f48812c;
                if (user != null && qrVar.N == null && qrVar.O == null) {
                    if (user.phone == null && (str = qrVar.M) != null) {
                        user.phone = pf.b.d(str, false);
                    }
                    qrVar.f51337b.setText(user.first_name);
                    org.telegram.ui.Cells.j3 j3Var = qrVar.f51337b.d;
                    j3Var.setSelection(j3Var.length());
                    qrVar.f51338c.setText(user.last_name);
                }
                TLRPC.UserFull d2 = qrVar.getMessagesController().d2(qrVar.I);
                if (d2 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = d2.note;
                    if (tL_textWithEntities != null) {
                        qrVar.d.setText(tL_textWithEntities);
                    } else {
                        qrVar.d.setText("");
                    }
                }
                if (qrVar.K) {
                    qrVar.d.d.requestFocus();
                    org.telegram.messenger.g0.I3(qrVar.d.d);
                    return;
                }
                return;
            default:
                qr.a0(this.f48811b, this.f48812c);
                return;
        }
    }
}
