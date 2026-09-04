package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class js implements Runnable {
    public final int f37836a;
    public final ss f37837b;
    public final TLRPC.User f37838c;

    public js(ss ssVar, TLRPC.User user, int i10) {
        this.f37836a = i10;
        this.f37837b = ssVar;
        this.f37838c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f37836a) {
            case 0:
                ss ssVar = this.f37837b;
                TLRPC.User user = this.f37838c;
                if (user != null && ssVar.M == null && ssVar.N == null) {
                    if (user.phone == null && (str = ssVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    ssVar.f40511b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = ssVar.f40511b.f22074b;
                    g3Var.setSelection(g3Var.length());
                    ssVar.f40512c.setText(user.last_name);
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
                    ssVar.d.f22074b.requestFocus();
                    AndroidUtilities.showKeyboard(ssVar.d.f22074b);
                    return;
                }
                return;
            default:
                ss.V(this.f37837b, this.f37838c);
                return;
        }
    }
}
