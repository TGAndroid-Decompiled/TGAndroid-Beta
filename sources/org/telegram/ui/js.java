package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class js implements Runnable {
    public final int f34964a;
    public final ss f34965b;
    public final TLRPC.User f34966c;

    public js(ss ssVar, TLRPC.User user, int i10) {
        this.f34964a = i10;
        this.f34965b = ssVar;
        this.f34966c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f34964a) {
            case 0:
                ss ssVar = this.f34965b;
                TLRPC.User user = this.f34966c;
                if (user != null && ssVar.M == null && ssVar.N == null) {
                    if (user.phone == null && (str = ssVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    ssVar.f37438b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = ssVar.f37438b.f20229b;
                    g3Var.setSelection(g3Var.length());
                    ssVar.f37439c.setText(user.last_name);
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
                    ssVar.d.f20229b.requestFocus();
                    AndroidUtilities.showKeyboard(ssVar.d.f20229b);
                    return;
                }
                return;
            default:
                ss.V(this.f34965b, this.f34966c);
                return;
        }
    }
}
