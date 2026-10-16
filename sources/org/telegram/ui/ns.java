package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ns implements Runnable {
    public final int f38467a;
    public final ws f38468b;
    public final TLRPC.User f38469c;

    public ns(ws wsVar, TLRPC.User user, int i10) {
        this.f38467a = i10;
        this.f38468b = wsVar;
        this.f38469c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38467a) {
            case 0:
                ws wsVar = this.f38468b;
                TLRPC.User user = this.f38469c;
                if (user != null && wsVar.M == null && wsVar.N == null) {
                    if (user.phone == null && (str = wsVar.L) != null) {
                        user.phone = jf.b.d(str, false);
                    }
                    wsVar.f41347b.setText(user.first_name);
                    org.telegram.ui.Cells.h3 h3Var = wsVar.f41347b.f21083b;
                    h3Var.setSelection(h3Var.length());
                    wsVar.f41348c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = wsVar.getMessagesController().getUserFull(wsVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        wsVar.d.setText(tL_textWithEntities);
                    } else {
                        wsVar.d.setText("");
                    }
                }
                if (wsVar.J) {
                    wsVar.d.f21083b.requestFocus();
                    AndroidUtilities.showKeyboard(wsVar.d.f21083b);
                    return;
                }
                return;
            default:
                ws.V(this.f38468b, this.f38469c);
                return;
        }
    }
}
