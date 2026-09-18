package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class js implements Runnable {
    public final int f34935a;
    public final ss f34936b;
    public final TLRPC.User f34937c;

    public js(ss ssVar, TLRPC.User user, int i10) {
        this.f34935a = i10;
        this.f34936b = ssVar;
        this.f34937c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f34935a) {
            case 0:
                ss ssVar = this.f34936b;
                TLRPC.User user = this.f34937c;
                if (user != null && ssVar.M == null && ssVar.N == null) {
                    if (user.phone == null && (str = ssVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    ssVar.f37456b.setText(user.first_name);
                    org.telegram.ui.Cells.h3 h3Var = ssVar.f37456b.f20455b;
                    h3Var.setSelection(h3Var.length());
                    ssVar.f37457c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = ssVar.getMessagesController().getUserFull(ssVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        ssVar.d.setText(tL_textWithEntities);
                    } else {
                        ssVar.d.setText("");
                    }
                }
                if (ssVar.J) {
                    ssVar.d.f20455b.requestFocus();
                    AndroidUtilities.showKeyboard(ssVar.d.f20455b);
                    return;
                }
                return;
            default:
                ss.V(this.f34936b, this.f34937c);
                return;
        }
    }
}
