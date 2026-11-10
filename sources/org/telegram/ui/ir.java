package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ir implements Runnable {
    public final int f46723a;
    public final qr f46724b;
    public final TLRPC.User f46725c;

    public ir(qr qrVar, TLRPC.User user, int i7) {
        this.f46723a = i7;
        this.f46724b = qrVar;
        this.f46725c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f46723a) {
            case 0:
                qr qrVar = this.f46724b;
                TLRPC.User user = this.f46725c;
                if (user != null && qrVar.M == null && qrVar.N == null) {
                    if (user.phone == null && (str = qrVar.L) != null) {
                        user.phone = pf.b.d(str, false);
                    }
                    qrVar.f49133b.setText(user.first_name);
                    org.telegram.ui.Cells.i3 i3Var = qrVar.f49133b.d;
                    i3Var.setSelection(i3Var.length());
                    qrVar.f49134c.setText(user.last_name);
                }
                TLRPC.UserFull b22 = qrVar.getMessagesController().b2(qrVar.H);
                if (b22 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = b22.note;
                    if (tL_textWithEntities != null) {
                        qrVar.d.setText(tL_textWithEntities);
                    } else {
                        qrVar.d.setText("");
                    }
                }
                if (qrVar.J) {
                    qrVar.d.d.requestFocus();
                    org.telegram.messenger.g0.K3(qrVar.d.d);
                    return;
                }
                return;
            default:
                qr.a0(this.f46724b, this.f46725c);
                return;
        }
    }
}
