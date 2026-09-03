package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class fs implements Runnable {
    public final int f36904a;
    public final os f36905b;
    public final TLRPC.User f36906c;

    public fs(os osVar, TLRPC.User user, int i10) {
        this.f36904a = i10;
        this.f36905b = osVar;
        this.f36906c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f36904a) {
            case 0:
                os osVar = this.f36905b;
                TLRPC.User user = this.f36906c;
                if (user != null && osVar.J == null && osVar.K == null) {
                    if (user.phone == null && (str = osVar.I) != null) {
                        user.phone = se.b.d(str, false);
                    }
                    osVar.f39791b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = osVar.f39791b.f22957b;
                    g3Var.setSelection(g3Var.length());
                    osVar.f39792c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = osVar.getMessagesController().getUserFull(osVar.E);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        osVar.d.setText(tL_textWithEntities);
                    } else {
                        osVar.d.setText("");
                    }
                }
                if (osVar.G) {
                    osVar.d.f22957b.requestFocus();
                    AndroidUtilities.showKeyboard(osVar.d.f22957b);
                    return;
                }
                return;
            default:
                os.V(this.f36905b, this.f36906c);
                return;
        }
    }
}
