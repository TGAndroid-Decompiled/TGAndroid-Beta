package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class dr implements Runnable {
    public final int f44801a;
    public final lr f44802b;
    public final TLRPC.User f44803c;

    public dr(lr lrVar, TLRPC.User user, int i3) {
        this.f44801a = i3;
        this.f44802b = lrVar;
        this.f44803c = user;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f44801a) {
            case 0:
                lr lrVar = this.f44802b;
                TLRPC.User user = this.f44803c;
                if (user != null && lrVar.N == null && lrVar.O == null) {
                    if (user.phone == null && (str = lrVar.M) != null) {
                        user.phone = mf.b.d(str, false);
                    }
                    lrVar.f47416b.setText(user.first_name);
                    org.telegram.ui.Cells.i3 i3Var = lrVar.f47416b.d;
                    i3Var.setSelection(i3Var.length());
                    lrVar.f47417c.setText(user.last_name);
                }
                TLRPC.UserFull b22 = lrVar.getMessagesController().b2(lrVar.I);
                if (b22 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = b22.note;
                    if (tL_textWithEntities != null) {
                        lrVar.d.setText(tL_textWithEntities);
                    } else {
                        lrVar.d.setText("");
                    }
                }
                if (lrVar.K) {
                    lrVar.d.d.requestFocus();
                    org.telegram.messenger.g0.K3(lrVar.d.d);
                    return;
                }
                return;
            default:
                lr.a0(this.f44802b, this.f44803c);
                return;
        }
    }
}
