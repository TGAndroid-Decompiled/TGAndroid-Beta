package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hr implements Runnable {
    public final int f46376a;
    public final pr f46377b;
    public final TLRPC.User f46378c;

    public hr(pr prVar, TLRPC.User user, int i7) {
        this.f46376a = i7;
        this.f46377b = prVar;
        this.f46378c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f46376a) {
            case 0:
                pr prVar = this.f46377b;
                TLRPC.User user = this.f46378c;
                if (user != null && prVar.M == null && prVar.N == null) {
                    if (user.phone == null && (str = prVar.L) != null) {
                        user.phone = pf.b.d(str, false);
                    }
                    prVar.f48788b.setText(user.first_name);
                    org.telegram.ui.Cells.i3 i3Var = prVar.f48788b.d;
                    i3Var.setSelection(i3Var.length());
                    prVar.f48789c.setText(user.last_name);
                }
                TLRPC.UserFull b22 = prVar.getMessagesController().b2(prVar.H);
                if (b22 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = b22.note;
                    if (tL_textWithEntities != null) {
                        prVar.d.setText(tL_textWithEntities);
                    } else {
                        prVar.d.setText("");
                    }
                }
                if (prVar.J) {
                    prVar.d.d.requestFocus();
                    org.telegram.messenger.g0.K3(prVar.d.d);
                    return;
                }
                return;
            default:
                pr.a0(this.f46377b, this.f46378c);
                return;
        }
    }
}
