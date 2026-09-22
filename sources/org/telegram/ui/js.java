package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class js implements Runnable {
    public final int f35002a;
    public final ss f35003b;
    public final TLRPC.User f35004c;

    public js(ss ssVar, TLRPC.User user, int i10) {
        this.f35002a = i10;
        this.f35003b = ssVar;
        this.f35004c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f35002a) {
            case 0:
                ss ssVar = this.f35003b;
                TLRPC.User user = this.f35004c;
                if (user != null && ssVar.M == null && ssVar.N == null) {
                    if (user.phone == null && (str = ssVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    ssVar.f37535b.setText(user.first_name);
                    org.telegram.ui.Cells.i3 i3Var = ssVar.f37535b.f20542b;
                    i3Var.setSelection(i3Var.length());
                    ssVar.f37536c.setText(user.last_name);
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
                    ssVar.d.f20542b.requestFocus();
                    AndroidUtilities.showKeyboard(ssVar.d.f20542b);
                    return;
                }
                return;
            default:
                ss.V(this.f35003b, this.f35004c);
                return;
        }
    }
}
