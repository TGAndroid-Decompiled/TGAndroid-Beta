package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class es implements Runnable {
    public final int f34078a;
    public final ns f34079b;
    public final TLRPC.User f34080c;

    public es(ns nsVar, TLRPC.User user, int i10) {
        this.f34078a = i10;
        this.f34079b = nsVar;
        this.f34080c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f34078a) {
            case 0:
                ns nsVar = this.f34079b;
                TLRPC.User user = this.f34080c;
                if (user != null && nsVar.J == null && nsVar.K == null) {
                    if (user.phone == null && (str = nsVar.I) != null) {
                        user.phone = se.b.d(str, false);
                    }
                    nsVar.f36716b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = nsVar.f36716b.f21199b;
                    g3Var.setSelection(g3Var.length());
                    nsVar.f36717c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = nsVar.getMessagesController().getUserFull(nsVar.E);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        nsVar.d.setText(tL_textWithEntities);
                    } else {
                        nsVar.d.setText("");
                    }
                }
                if (nsVar.G) {
                    nsVar.d.f21199b.requestFocus();
                    AndroidUtilities.showKeyboard(nsVar.d.f21199b);
                    return;
                }
                return;
            default:
                ns.V(this.f34079b, this.f34080c);
                return;
        }
    }
}
