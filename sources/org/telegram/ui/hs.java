package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class hs implements Runnable {
    public final int f38393a;
    public final qs f38394b;
    public final TLRPC.User f38395c;

    public hs(qs qsVar, TLRPC.User user, int i10) {
        this.f38393a = i10;
        this.f38394b = qsVar;
        this.f38395c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38393a) {
            case 0:
                qs qsVar = this.f38394b;
                TLRPC.User user = this.f38395c;
                if (user != null && qsVar.M == null && qsVar.N == null) {
                    if (user.phone == null && (str = qsVar.L) != null) {
                        user.phone = hf.b.d(str, false);
                    }
                    qsVar.f41171b.setText(user.first_name);
                    org.telegram.ui.Cells.h3 h3Var = qsVar.f41171b.f22297b;
                    h3Var.setSelection(h3Var.length());
                    qsVar.f41172c.setText(user.last_name);
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
                    qsVar.d.f22297b.requestFocus();
                    AndroidUtilities.showKeyboard(qsVar.d.f22297b);
                    return;
                }
                return;
            default:
                qs.V(this.f38394b, this.f38395c);
                return;
        }
    }
}
