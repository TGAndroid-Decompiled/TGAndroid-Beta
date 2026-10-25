package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class bs implements Runnable {
    public final int f38150a;
    public final js f38151b;
    public final TLRPC.User f38152c;

    public bs(js jsVar, TLRPC.User user, int i10) {
        this.f38150a = i10;
        this.f38151b = jsVar;
        this.f38152c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38150a) {
            case 0:
                js jsVar = this.f38151b;
                TLRPC.User user = this.f38152c;
                if (user != null && jsVar.M == null && jsVar.N == null) {
                    if (user.phone == null && (str = jsVar.L) != null) {
                        user.phone = kf.b.d(str, false);
                    }
                    jsVar.f40730b.setText(user.first_name);
                    org.telegram.ui.Cells.e3 e3Var = jsVar.f40730b.d;
                    e3Var.setSelection(e3Var.length());
                    jsVar.f40731c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = jsVar.getMessagesController().getUserFull(jsVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        jsVar.d.setText(tL_textWithEntities);
                    } else {
                        jsVar.d.setText("");
                    }
                }
                if (jsVar.J) {
                    jsVar.d.d.requestFocus();
                    AndroidUtilities.showKeyboard(jsVar.d.d);
                    return;
                }
                return;
            default:
                js.W(this.f38151b, this.f38152c);
                return;
        }
    }
}
