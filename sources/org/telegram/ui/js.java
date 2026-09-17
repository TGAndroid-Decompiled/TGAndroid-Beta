package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class js implements Runnable {
    public final int f37837a;
    public final ss f37838b;
    public final TLRPC.User f37839c;

    public js(ss ssVar, TLRPC.User user, int i10) {
        this.f37837a = i10;
        this.f37838b = ssVar;
        this.f37839c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f37837a) {
            case 0:
                ss ssVar = this.f37838b;
                TLRPC.User user = this.f37839c;
                if (user != null && ssVar.M == null && ssVar.N == null) {
                    if (user.phone == null && (str = ssVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    ssVar.f40512b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = ssVar.f40512b.f22075b;
                    g3Var.setSelection(g3Var.length());
                    ssVar.f40513c.setText(user.last_name);
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
                    ssVar.d.f22075b.requestFocus();
                    AndroidUtilities.showKeyboard(ssVar.d.f22075b);
                    return;
                }
                return;
            default:
                ss.V(this.f37838b, this.f37839c);
                return;
        }
    }
}
