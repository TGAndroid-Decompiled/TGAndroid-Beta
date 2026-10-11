package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class gs implements Runnable {
    public final int f38190a;
    public final ps f38191b;
    public final TLRPC.User f38192c;

    public gs(ps psVar, TLRPC.User user, int i10) {
        this.f38190a = i10;
        this.f38191b = psVar;
        this.f38192c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38190a) {
            case 0:
                ps psVar = this.f38191b;
                TLRPC.User user = this.f38192c;
                if (user != null && psVar.M == null && psVar.N == null) {
                    if (user.phone == null && (str = psVar.L) != null) {
                        user.phone = hf.b.d(str, false);
                    }
                    psVar.f40978b.setText(user.first_name);
                    org.telegram.ui.Cells.h3 h3Var = psVar.f40978b.f22325b;
                    h3Var.setSelection(h3Var.length());
                    psVar.f40979c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = psVar.getMessagesController().getUserFull(psVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        psVar.d.setText(tL_textWithEntities);
                    } else {
                        psVar.d.setText("");
                    }
                }
                if (psVar.J) {
                    psVar.d.f22325b.requestFocus();
                    AndroidUtilities.showKeyboard(psVar.d.f22325b);
                    return;
                }
                return;
            default:
                ps.V(this.f38191b, this.f38192c);
                return;
        }
    }
}
