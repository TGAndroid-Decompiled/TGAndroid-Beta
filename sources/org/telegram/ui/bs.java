package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class bs implements Runnable {
    public final int f38153a;
    public final js f38154b;
    public final TLRPC.User f38155c;

    public bs(js jsVar, TLRPC.User user, int i10) {
        this.f38153a = i10;
        this.f38154b = jsVar;
        this.f38155c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38153a) {
            case 0:
                js jsVar = this.f38154b;
                TLRPC.User user = this.f38155c;
                if (user != null && jsVar.M == null && jsVar.N == null) {
                    if (user.phone == null && (str = jsVar.L) != null) {
                        user.phone = kf.b.d(str, false);
                    }
                    jsVar.f40733b.setText(user.first_name);
                    org.telegram.ui.Cells.e3 e3Var = jsVar.f40733b.d;
                    e3Var.setSelection(e3Var.length());
                    jsVar.f40734c.setText(user.last_name);
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
                js.W(this.f38154b, this.f38155c);
                return;
        }
    }
}
