package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class hs implements Runnable {
    public final int f38439a;
    public final qs f38440b;
    public final TLRPC.User f38441c;

    public hs(qs qsVar, TLRPC.User user, int i10) {
        this.f38439a = i10;
        this.f38440b = qsVar;
        this.f38441c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38439a) {
            case 0:
                qs qsVar = this.f38440b;
                TLRPC.User user = this.f38441c;
                if (user != null && qsVar.M == null && qsVar.N == null) {
                    if (user.phone == null && (str = qsVar.L) != null) {
                        user.phone = hf.b.d(str, false);
                    }
                    qsVar.f41217b.setText(user.first_name);
                    org.telegram.ui.Cells.h3 h3Var = qsVar.f41217b.f22301b;
                    h3Var.setSelection(h3Var.length());
                    qsVar.f41218c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = qsVar.getMessagesController().getUserFull(qsVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        qsVar.d.setText(tL_textWithEntities);
                    } else {
                        qsVar.d.setText("");
                    }
                }
                if (qsVar.J) {
                    qsVar.d.f22301b.requestFocus();
                    AndroidUtilities.showKeyboard(qsVar.d.f22301b);
                    return;
                }
                return;
            default:
                qs.V(this.f38440b, this.f38441c);
                return;
        }
    }
}
