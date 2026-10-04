package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class hs implements Runnable {
    public final int f37163a;
    public final qs f37164b;
    public final TLRPC.User f37165c;

    public hs(qs qsVar, TLRPC.User user, int i10) {
        this.f37163a = i10;
        this.f37164b = qsVar;
        this.f37165c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f37163a) {
            case 0:
                qs qsVar = this.f37164b;
                TLRPC.User user = this.f37165c;
                if (user != null && qsVar.M == null && qsVar.N == null) {
                    if (user.phone == null && (str = qsVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    qsVar.f39804b.setText(user.first_name);
                    org.telegram.ui.Cells.h3 h3Var = qsVar.f39804b.f22307b;
                    h3Var.setSelection(h3Var.length());
                    qsVar.f39805c.setText(user.last_name);
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
                    qsVar.d.f22307b.requestFocus();
                    AndroidUtilities.showKeyboard(qsVar.d.f22307b);
                    return;
                }
                return;
            default:
                qs.T(this.f37164b, this.f37165c);
                return;
        }
    }
}
