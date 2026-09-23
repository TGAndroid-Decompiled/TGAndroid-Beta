package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class es implements Runnable {
    public final int f33012a;
    public final ns f33013b;
    public final TLRPC.User f33014c;

    public es(ns nsVar, TLRPC.User user, int i10) {
        this.f33012a = i10;
        this.f33013b = nsVar;
        this.f33014c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f33012a) {
            case 0:
                ns nsVar = this.f33013b;
                TLRPC.User user = this.f33014c;
                if (user != null && nsVar.M == null && nsVar.N == null) {
                    if (user.phone == null && (str = nsVar.L) != null) {
                        user.phone = gf.b.d(str, false);
                    }
                    nsVar.f35587b.setText(user.first_name);
                    org.telegram.ui.Cells.g3 g3Var = nsVar.f35587b.f20177b;
                    g3Var.setSelection(g3Var.length());
                    nsVar.f35588c.setText(user.last_name);
                }
                TLRPC.UserFull userFull = nsVar.getMessagesController().getUserFull(nsVar.H);
                if (userFull != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
                    if (tL_textWithEntities != null) {
                        nsVar.d.setText(tL_textWithEntities);
                    } else {
                        nsVar.d.setText("");
                    }
                }
                if (nsVar.J) {
                    nsVar.d.f20177b.requestFocus();
                    AndroidUtilities.showKeyboard(nsVar.d.f20177b);
                    return;
                }
                return;
            default:
                ns.V(this.f33013b, this.f33014c);
                return;
        }
    }
}
