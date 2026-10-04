package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class hs implements Runnable {
    public final int f37162a;
    public final qs f37163b;
    public final TLRPC.User f37164c;

    public hs(qs qsVar, TLRPC.User user, int i10) {
        this.f37162a = i10;
        this.f37163b = qsVar;
        this.f37164c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f37162a) {
            case 0:
                qs qsVar = this.f37163b;
                TLRPC.User user = this.f37164c;
                if (user != null && qsVar.M == null && qsVar.N == null) {
                    if (user.phone == null && (str = qsVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    qsVar.f39803b.setText(user.first_name);
                    org.telegram.ui.Cells.h3 h3Var = qsVar.f39803b.f22306b;
                    h3Var.setSelection(h3Var.length());
                    qsVar.f39804c.setText(user.last_name);
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
                    qsVar.d.f22306b.requestFocus();
                    AndroidUtilities.showKeyboard(qsVar.d.f22306b);
                    return;
                }
                return;
            default:
                qs.T(this.f37163b, this.f37164c);
                return;
        }
    }
}
