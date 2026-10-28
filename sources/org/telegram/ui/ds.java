package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ds implements Runnable {
    public final int f38670a;
    public final ls f38671b;
    public final TLRPC.User f38672c;

    public ds(ls lsVar, TLRPC.User user, int i10) {
        this.f38670a = i10;
        this.f38671b = lsVar;
        this.f38672c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38670a) {
            case 0:
                ls lsVar = this.f38671b;
                TLRPC.User user = this.f38672c;
                if (user != null && lsVar.M == null && lsVar.N == null) {
                    if (user.phone == null && (str = lsVar.L) != null) {
                        user.phone = kf.b.d(str, false);
                    }
                    lsVar.f41248b.setText(user.first_name);
                    org.telegram.ui.Cells.e3 e3Var = lsVar.f41248b.d;
                    e3Var.setSelection(e3Var.length());
                    lsVar.f41249c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = lsVar.getMessagesController().getUserFull(lsVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        lsVar.d.setText(tL_textWithEntities);
                    } else {
                        lsVar.d.setText("");
                    }
                }
                if (lsVar.J) {
                    lsVar.d.d.requestFocus();
                    AndroidUtilities.showKeyboard(lsVar.d.d);
                    return;
                }
                return;
            default:
                ls.W(this.f38671b, this.f38672c);
                return;
        }
    }
}
