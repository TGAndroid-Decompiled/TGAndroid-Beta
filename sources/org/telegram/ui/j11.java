package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class j11 implements Runnable {
    public final int f48878a;
    public final n11 f48879b;
    public final Integer f48880c;

    public j11(n11 n11Var, Integer num, int i7) {
        this.f48878a = i7;
        this.f48879b = n11Var;
        this.f48880c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f48878a;
        n11 n11Var = this.f48879b;
        switch (i7) {
            case 0:
                n11.a(n11Var, this.f48880c);
                return;
            default:
                Integer num = this.f48880c;
                if (num != null) {
                    try {
                        n11Var.Q.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    h01 h01Var = (h01) n11Var;
                    r11 r11Var = h01Var.T.f48528e;
                    List list = r11.f51397b2;
                    r11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = h01Var.R;
                    long j3 = ((b11) view).f45698e.documentId;
                    tL_emojiStatus.document_id = j3;
                    r11Var.p(view, Long.valueOf(j3), ((b11) h01Var.R).f45698e.document, h01Var.S, num);
                    if (h01Var.S == null) {
                        org.telegram.messenger.si.d0(r11Var.W).G1(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
