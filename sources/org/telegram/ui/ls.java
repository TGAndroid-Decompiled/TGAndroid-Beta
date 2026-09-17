package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ls implements Runnable {
    public final int f35614a;
    public final us f35615b;
    public final TLRPC.User f35616c;

    public ls(us usVar, TLRPC.User user, int i10) {
        this.f35614a = i10;
        this.f35615b = usVar;
        this.f35616c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f35614a) {
            case 0:
                us usVar = this.f35615b;
                TLRPC.User user = this.f35616c;
                if (user != null && usVar.M == null && usVar.N == null) {
                    if (user.phone == null && (str = usVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    usVar.f38182b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = usVar.f38182b.f20239b;
                    g3Var.setSelection(g3Var.length());
                    usVar.f38183c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = usVar.getMessagesController().getUserFull(usVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        usVar.d.setText(tL_textWithEntities);
                    } else {
                        usVar.d.setText("");
                    }
                }
                if (usVar.J) {
                    usVar.d.f20239b.requestFocus();
                    AndroidUtilities.showKeyboard(usVar.d.f20239b);
                    return;
                }
                return;
            default:
                us.V(this.f35615b, this.f35616c);
                return;
        }
    }
}
