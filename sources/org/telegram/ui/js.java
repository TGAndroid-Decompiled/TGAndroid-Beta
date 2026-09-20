package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class js implements Runnable {
    public final int f34980a;
    public final ss f34981b;
    public final TLRPC.User f34982c;

    public js(ss ssVar, TLRPC.User user, int i10) {
        this.f34980a = i10;
        this.f34981b = ssVar;
        this.f34982c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f34980a) {
            case 0:
                ss ssVar = this.f34981b;
                TLRPC.User user = this.f34982c;
                if (user != null && ssVar.M == null && ssVar.N == null) {
                    if (user.phone == null && (str = ssVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    ssVar.f37511b.setText(user.first_name);
                    org.telegram.ui.Cells.i3 i3Var = ssVar.f37511b.f20527b;
                    i3Var.setSelection(i3Var.length());
                    ssVar.f37512c.setText(user.last_name);
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
                    ssVar.d.f20527b.requestFocus();
                    AndroidUtilities.showKeyboard(ssVar.d.f20527b);
                    return;
                }
                return;
            default:
                ss.V(this.f34981b, this.f34982c);
                return;
        }
    }
}
