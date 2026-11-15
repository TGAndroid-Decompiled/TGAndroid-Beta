package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hr implements Runnable {
    public final int f47813a;
    public final pr f47814b;
    public final TLRPC.User f47815c;

    public hr(pr prVar, TLRPC.User user, int i7) {
        this.f47813a = i7;
        this.f47814b = prVar;
        this.f47815c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f47813a) {
            case 0:
                pr prVar = this.f47814b;
                TLRPC.User user = this.f47815c;
                if (user != null && prVar.N == null && prVar.O == null) {
                    if (user.phone == null && (str = prVar.M) != null) {
                        user.phone = pf.b.d(str, false);
                    }
                    prVar.f50346b.setText(user.first_name);
                    org.telegram.ui.Cells.i3 i3Var = prVar.f50346b.d;
                    i3Var.setSelection(i3Var.length());
                    prVar.f50347c.setText(user.last_name);
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
                pr.a0(this.f47814b, this.f47815c);
                return;
        }
    }
}
