package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ns implements Runnable {
    public final int f38787a;
    public final ws f38788b;
    public final TLRPC.User f38789c;

    public ns(ws wsVar, TLRPC.User user, int i10) {
        this.f38787a = i10;
        this.f38788b = wsVar;
        this.f38789c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38787a) {
            case 0:
                ws wsVar = this.f38788b;
                TLRPC.User user = this.f38789c;
                if (user != null && wsVar.M == null && wsVar.N == null) {
                    if (user.phone == null && (str = wsVar.L) != null) {
                        user.phone = jf.b.d(str, false);
                    }
                    wsVar.f41641b.setText(user.first_name);
                    org.telegram.ui.Cells.h3 h3Var = wsVar.f41641b.f21368b;
                    h3Var.setSelection(h3Var.length());
                    wsVar.f41642c.setText(user.last_name);
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
                    wsVar.d.f21368b.requestFocus();
                    AndroidUtilities.showKeyboard(wsVar.d.f21368b);
                    return;
                }
                return;
            default:
                ws.V(this.f38788b, this.f38789c);
                return;
        }
    }
}
