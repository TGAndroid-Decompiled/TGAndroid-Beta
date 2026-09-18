package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ls implements Runnable {
    public final int f35619a;
    public final us f35620b;
    public final TLRPC.User f35621c;

    public ls(us usVar, TLRPC.User user, int i10) {
        this.f35619a = i10;
        this.f35620b = usVar;
        this.f35621c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f35619a) {
            case 0:
                us usVar = this.f35620b;
                TLRPC.User user = this.f35621c;
                if (user != null && usVar.M == null && usVar.N == null) {
                    if (user.phone == null && (str = usVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    usVar.f38187b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = usVar.f38187b.f20240b;
                    g3Var.setSelection(g3Var.length());
                    usVar.f38188c.setText(user.last_name);
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
                    usVar.d.f20240b.requestFocus();
                    AndroidUtilities.showKeyboard(usVar.d.f20240b);
                    return;
                }
                return;
            default:
                us.V(this.f35620b, this.f35621c);
                return;
        }
    }
}
