package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class hs implements Runnable {
    public final int f37169a;
    public final qs f37170b;
    public final TLRPC.User f37171c;

    public hs(qs qsVar, TLRPC.User user, int i10) {
        this.f37169a = i10;
        this.f37170b = qsVar;
        this.f37171c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f37169a) {
            case 0:
                qs qsVar = this.f37170b;
                TLRPC.User user = this.f37171c;
                if (user != null && qsVar.M == null && qsVar.N == null) {
                    if (user.phone == null && (str = qsVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    qsVar.f39870b.setText(user.first_name);
                    org.telegram.ui.Cells.h3 h3Var = qsVar.f39870b.f22315b;
                    h3Var.setSelection(h3Var.length());
                    qsVar.f39871c.setText(user.last_name);
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
                    qsVar.d.f22315b.requestFocus();
                    AndroidUtilities.showKeyboard(qsVar.d.f22315b);
                    return;
                }
                return;
            default:
                qs.T(this.f37170b, this.f37171c);
                return;
        }
    }
}
