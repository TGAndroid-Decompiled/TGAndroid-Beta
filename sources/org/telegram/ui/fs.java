package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fs implements Runnable {
    public final int f37338a;
    public final ns f37339b;
    public final TLRPC.User f37340c;

    public fs(ns nsVar, TLRPC.User user, int i10) {
        this.f37338a = i10;
        this.f37339b = nsVar;
        this.f37340c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f37338a) {
            case 0:
                ns nsVar = this.f37339b;
                TLRPC.User user = this.f37340c;
                if (user != null && nsVar.M == null && nsVar.N == null) {
                    if (user.phone == null && (str = nsVar.L) != null) {
                        user.phone = af.b.d(str, false);
                    }
                    nsVar.f40036b.setText(user.first_name);
                    org.telegram.ui.Cells.k3 k3Var = nsVar.f40036b.d;
                    k3Var.setSelection(k3Var.length());
                    nsVar.f40037c.setText(user.last_name);
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
                ns.Z(this.f37339b, this.f37340c);
                return;
        }
    }
}
