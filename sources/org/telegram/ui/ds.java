package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ds implements Runnable {
    public final int f33174a;
    public final ms f33175b;
    public final TLRPC.User f33176c;

    public ds(ms msVar, TLRPC.User user, int i10) {
        this.f33174a = i10;
        this.f33175b = msVar;
        this.f33176c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f33174a) {
            case 0:
                ms msVar = this.f33175b;
                TLRPC.User user = this.f33176c;
                if (user != null && msVar.M == null && msVar.N == null) {
                    if (user.phone == null && (str = msVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    msVar.f35657b.setText(user.first_name);
                    org.telegram.ui.Cells.h3 h3Var = msVar.f35657b.f20493b;
                    h3Var.setSelection(h3Var.length());
                    msVar.f35658c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = msVar.getMessagesController().getUserFull(msVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        msVar.d.setText(tL_textWithEntities);
                    } else {
                        msVar.d.setText("");
                    }
                }
                if (msVar.J) {
                    msVar.d.f20493b.requestFocus();
                    AndroidUtilities.showKeyboard(msVar.d.f20493b);
                    return;
                }
                return;
            default:
                ms.V(this.f33175b, this.f33176c);
                return;
        }
    }
}
