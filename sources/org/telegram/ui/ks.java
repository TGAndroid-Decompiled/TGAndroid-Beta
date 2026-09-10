package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ks implements Runnable {
    public final int f34452a;
    public final ts f34453b;
    public final TLRPC.User f34454c;

    public ks(ts tsVar, TLRPC.User user, int i10) {
        this.f34452a = i10;
        this.f34453b = tsVar;
        this.f34454c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f34452a) {
            case 0:
                ts tsVar = this.f34453b;
                TLRPC.User user = this.f34454c;
                if (user != null && tsVar.M == null && tsVar.N == null) {
                    if (user.phone == null && (str = tsVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    tsVar.f37001b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = tsVar.f37001b.f19293b;
                    g3Var.setSelection(g3Var.length());
                    tsVar.f37002c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = tsVar.getMessagesController().getUserFull(tsVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        tsVar.d.setText(tL_textWithEntities);
                    } else {
                        tsVar.d.setText("");
                    }
                }
                if (tsVar.J) {
                    tsVar.d.f19293b.requestFocus();
                    AndroidUtilities.showKeyboard(tsVar.d.f19293b);
                    return;
                }
                return;
            default:
                ts.V(this.f34453b, this.f34454c);
                return;
        }
    }
}
