package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ir implements Runnable {
    public final int f48784a;
    public final qr f48785b;
    public final TLRPC.User f48786c;

    public ir(qr qrVar, TLRPC.User user, int i7) {
        this.f48784a = i7;
        this.f48785b = qrVar;
        this.f48786c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f48784a) {
            case 0:
                qr qrVar = this.f48785b;
                TLRPC.User user = this.f48786c;
                if (user != null && qrVar.N == null && qrVar.O == null) {
                    if (user.phone == null && (str = qrVar.M) != null) {
                        user.phone = pf.b.d(str, false);
                    }
                    qrVar.f51279b.setText(user.first_name);
                    org.telegram.ui.Cells.j3 j3Var = qrVar.f51279b.d;
                    j3Var.setSelection(j3Var.length());
                    qrVar.f51280c.setText(user.last_name);
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
                qr.a0(this.f48785b, this.f48786c);
                return;
        }
    }
}
