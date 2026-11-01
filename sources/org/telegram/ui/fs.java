package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fs implements Runnable {
    public final int f37212a;
    public final ns f37213b;
    public final TLRPC.User f37214c;

    public fs(ns nsVar, TLRPC.User user, int i10) {
        this.f37212a = i10;
        this.f37213b = nsVar;
        this.f37214c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f37212a) {
            case 0:
                ns nsVar = this.f37213b;
                TLRPC.User user = this.f37214c;
                if (user != null && nsVar.M == null && nsVar.N == null) {
                    if (user.phone == null && (str = nsVar.L) != null) {
                        user.phone = af.b.d(str, false);
                    }
                    nsVar.f39963b.setText(user.first_name);
                    org.telegram.ui.Cells.k3 k3Var = nsVar.f39963b.d;
                    k3Var.setSelection(k3Var.length());
                    nsVar.f39964c.setText(user.last_name);
                }
                TLRPC.UserFull a2 = nsVar.getMessagesController().a2(nsVar.H);
                if (a2 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = a2.note;
                    if (tL_textWithEntities != null) {
                        nsVar.d.setText(tL_textWithEntities);
                    } else {
                        nsVar.d.setText("");
                    }
                }
                if (nsVar.J) {
                    nsVar.d.d.requestFocus();
                    org.telegram.messenger.i0.J3(nsVar.d.d);
                    return;
                }
                return;
            default:
                ns.a0(this.f37213b, this.f37214c);
                return;
        }
    }
}
