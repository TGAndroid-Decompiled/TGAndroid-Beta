package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class gs implements Runnable {
    public final int f34501a;
    public final ps f34502b;
    public final TLRPC.User f34503c;

    public gs(ps psVar, TLRPC.User user, int i10) {
        this.f34501a = i10;
        this.f34502b = psVar;
        this.f34503c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f34501a) {
            case 0:
                ps psVar = this.f34502b;
                TLRPC.User user = this.f34503c;
                if (user != null && psVar.J == null && psVar.K == null) {
                    if (user.phone == null && (str = psVar.I) != null) {
                        user.phone = se.b.d(str, false);
                    }
                    psVar.f37220b.setText(user.first_name);
                    org.telegram.ui.Cells.f3 f3Var = psVar.f37220b.f21132b;
                    f3Var.setSelection(f3Var.length());
                    psVar.f37221c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = psVar.getMessagesController().getUserFull(psVar.E);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        psVar.d.setText(tL_textWithEntities);
                    } else {
                        psVar.d.setText("");
                    }
                }
                if (psVar.G) {
                    psVar.d.f21132b.requestFocus();
                    AndroidUtilities.showKeyboard(psVar.d.f21132b);
                    return;
                }
                return;
            default:
                ps.V(this.f34502b, this.f34503c);
                return;
        }
    }
}
