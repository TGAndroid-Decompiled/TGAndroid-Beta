package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class gs implements Runnable {
    public final int f34032a;
    public final ps f34033b;
    public final TLRPC.User f34034c;

    public gs(ps psVar, TLRPC.User user, int i10) {
        this.f34032a = i10;
        this.f34033b = psVar;
        this.f34034c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f34032a) {
            case 0:
                ps psVar = this.f34033b;
                TLRPC.User user = this.f34034c;
                if (user != null && psVar.M == null && psVar.N == null) {
                    if (user.phone == null && (str = psVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    psVar.f36531b.setText(user.first_name);
                    org.telegram.ui.Cells.h3 h3Var = psVar.f36531b.f20493b;
                    h3Var.setSelection(h3Var.length());
                    psVar.f36532c.setText(user.last_name);
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
                    psVar.d.f20493b.requestFocus();
                    AndroidUtilities.showKeyboard(psVar.d.f20493b);
                    return;
                }
                return;
            default:
                ps.V(this.f34033b, this.f34034c);
                return;
        }
    }
}
