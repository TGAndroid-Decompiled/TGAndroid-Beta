package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class gs implements Runnable {
    public final int f38156a;
    public final ps f38157b;
    public final TLRPC.User f38158c;

    public gs(ps psVar, TLRPC.User user, int i10) {
        this.f38156a = i10;
        this.f38157b = psVar;
        this.f38158c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38156a) {
            case 0:
                ps psVar = this.f38157b;
                TLRPC.User user = this.f38158c;
                if (user != null && psVar.M == null && psVar.N == null) {
                    if (user.phone == null && (str = psVar.L) != null) {
                        user.phone = hf.b.d(str, false);
                    }
                    psVar.f40944b.setText(user.first_name);
                    org.telegram.ui.Cells.h3 h3Var = psVar.f40944b.f22289b;
                    h3Var.setSelection(h3Var.length());
                    psVar.f40945c.setText(user.last_name);
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
                    psVar.d.f22289b.requestFocus();
                    AndroidUtilities.showKeyboard(psVar.d.f22289b);
                    return;
                }
                return;
            default:
                ps.V(this.f38157b, this.f38158c);
                return;
        }
    }
}
