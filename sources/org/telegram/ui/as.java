package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

public final class as implements Runnable {

    public final int f36629a;

    public final js f36630b;

    public final TLRPC.User f36631c;

    public as(js jsVar, TLRPC.User user, int i10) {
        this.f36629a = i10;
        this.f36630b = jsVar;
        this.f36631c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f36629a) {
            case 0:
                js jsVar = this.f36630b;
                TLRPC.User user = this.f36631c;
                if (user != null && jsVar.I == null && jsVar.J == null) {
                    if (user.phone == null && (str = jsVar.H) != null) {
                        user.phone = oe.b.d(str, false);
                    }
                    jsVar.f39484b.setText(user.first_name);
                    org.telegram.ui.Cells.e3 e3Var = jsVar.f39484b.f24370b;
                    e3Var.setSelection(e3Var.length());
                    jsVar.f39485c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = jsVar.getMessagesController().getUserFull(jsVar.D);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        jsVar.d.setText(tL_textWithEntities);
                    } else {
                        jsVar.d.setText("");
                    }
                }
                if (jsVar.F) {
                    jsVar.d.f24370b.requestFocus();
                    AndroidUtilities.showKeyboard(jsVar.d.f24370b);
                }
                break;
            default:
                js.V(this.f36630b, this.f36631c);
                break;
        }
    }
}
