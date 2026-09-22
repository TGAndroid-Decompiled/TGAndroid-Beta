package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class js implements Runnable {
    public final int f34977a;
    public final ss f34978b;
    public final TLRPC.User f34979c;

    public js(ss ssVar, TLRPC.User user, int i10) {
        this.f34977a = i10;
        this.f34978b = ssVar;
        this.f34979c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f34977a) {
            case 0:
                ss ssVar = this.f34978b;
                TLRPC.User user = this.f34979c;
                if (user != null && ssVar.M == null && ssVar.N == null) {
                    if (user.phone == null && (str = ssVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    ssVar.f37447b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = ssVar.f37447b.f20190b;
                    g3Var.setSelection(g3Var.length());
                    ssVar.f37448c.setText(user.last_name);
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
                    ssVar.d.f20190b.requestFocus();
                    AndroidUtilities.showKeyboard(ssVar.d.f20190b);
                    return;
                }
                return;
            default:
                ss.V(this.f34978b, this.f34979c);
                return;
        }
    }
}
