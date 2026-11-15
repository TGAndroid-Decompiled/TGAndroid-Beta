package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hr implements Runnable {
    public final int f47803a;
    public final pr f47804b;
    public final TLRPC.User f47805c;

    public hr(pr prVar, TLRPC.User user, int i7) {
        this.f47803a = i7;
        this.f47804b = prVar;
        this.f47805c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f47803a) {
            case 0:
                pr prVar = this.f47804b;
                TLRPC.User user = this.f47805c;
                if (user != null && prVar.N == null && prVar.O == null) {
                    if (user.phone == null && (str = prVar.M) != null) {
                        user.phone = pf.b.d(str, false);
                    }
                    prVar.f50337b.setText(user.first_name);
                    org.telegram.ui.Cells.i3 i3Var = prVar.f50337b.d;
                    i3Var.setSelection(i3Var.length());
                    prVar.f50338c.setText(user.last_name);
                }
                TLRPC.UserFull b22 = prVar.getMessagesController().b2(prVar.I);
                if (b22 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = b22.note;
                    if (tL_textWithEntities != null) {
                        prVar.d.setText(tL_textWithEntities);
                    } else {
                        prVar.d.setText("");
                    }
                }
                if (prVar.K) {
                    prVar.d.d.requestFocus();
                    org.telegram.messenger.g0.J3(prVar.d.d);
                    return;
                }
                return;
            default:
                pr.a0(this.f47804b, this.f47805c);
                return;
        }
    }
}
