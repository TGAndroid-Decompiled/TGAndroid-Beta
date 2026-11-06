package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fr implements Runnable {
    public final int f45697a;
    public final nr f45698b;
    public final TLRPC.User f45699c;

    public fr(nr nrVar, TLRPC.User user, int i7) {
        this.f45697a = i7;
        this.f45698b = nrVar;
        this.f45699c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f45697a) {
            case 0:
                nr nrVar = this.f45698b;
                TLRPC.User user = this.f45699c;
                if (user != null && nrVar.M == null && nrVar.N == null) {
                    if (user.phone == null && (str = nrVar.L) != null) {
                        user.phone = pf.b.d(str, false);
                    }
                    nrVar.f48118b.setText(user.first_name);
                    org.telegram.ui.Cells.i3 i3Var = nrVar.f48118b.d;
                    i3Var.setSelection(i3Var.length());
                    nrVar.f48119c.setText(user.last_name);
                }
                TLRPC.UserFull b22 = nrVar.getMessagesController().b2(nrVar.H);
                if (b22 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = b22.note;
                    if (tL_textWithEntities != null) {
                        nrVar.d.setText(tL_textWithEntities);
                    } else {
                        nrVar.d.setText("");
                    }
                }
                if (nrVar.J) {
                    nrVar.d.d.requestFocus();
                    org.telegram.messenger.g0.K3(nrVar.d.d);
                    return;
                }
                return;
            default:
                nr.a0(this.f45698b, this.f45699c);
                return;
        }
    }
}
