package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ks implements Runnable {
    public final int f39570a;
    public final ts f39571b;
    public final TLRPC.User f39572c;

    public ks(ts tsVar, TLRPC.User user, int i10) {
        this.f39570a = i10;
        this.f39571b = tsVar;
        this.f39572c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f39570a) {
            case 0:
                ts tsVar = this.f39571b;
                TLRPC.User user = this.f39572c;
                if (user != null && tsVar.M == null && tsVar.N == null) {
                    if (user.phone == null && (str = tsVar.L) != null) {
                        user.phone = hf.b.d(str, false);
                    }
                    tsVar.f42276b.setText(user.first_name);
                    org.telegram.ui.Cells.h3 h3Var = tsVar.f42276b.f22081b;
                    h3Var.setSelection(h3Var.length());
                    tsVar.f42277c.setText(user.last_name);
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
                    tsVar.d.f22081b.requestFocus();
                    AndroidUtilities.showKeyboard(tsVar.d.f22081b);
                    return;
                }
                return;
            default:
                ts.V(this.f39571b, this.f39572c);
                return;
        }
    }
}
