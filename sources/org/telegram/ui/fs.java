package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class fs implements Runnable {
    public final int f37011a;
    public final os f37012b;
    public final TLRPC.User f37013c;

    public fs(os osVar, TLRPC.User user, int i10) {
        this.f37011a = i10;
        this.f37012b = osVar;
        this.f37013c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f37011a) {
            case 0:
                os osVar = this.f37012b;
                TLRPC.User user = this.f37013c;
                if (user != null && osVar.J == null && osVar.K == null) {
                    if (user.phone == null && (str = osVar.I) != null) {
                        user.phone = se.b.d(str, false);
                    }
                    osVar.f39826b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = osVar.f39826b.f22955b;
                    g3Var.setSelection(g3Var.length());
                    osVar.f39827c.setText(user.last_name);
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
                    osVar.d.f22955b.requestFocus();
                    AndroidUtilities.showKeyboard(osVar.d.f22955b);
                    return;
                }
                return;
            default:
                os.V(this.f37012b, this.f37013c);
                return;
        }
    }
}
