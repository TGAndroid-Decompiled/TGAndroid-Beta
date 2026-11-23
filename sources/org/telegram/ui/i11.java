package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class i11 implements Runnable {
    public final int f48689a;
    public final m11 f48690b;
    public final Integer f48691c;

    public i11(m11 m11Var, Integer num, int i7) {
        this.f48689a = i7;
        this.f48690b = m11Var;
        this.f48691c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f48689a;
        m11 m11Var = this.f48690b;
        switch (i7) {
            case 0:
                m11.a(m11Var, this.f48691c);
                return;
            default:
                Integer num = this.f48691c;
                if (num != null) {
                    try {
                        m11Var.Q.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    g01 g01Var = (g01) m11Var;
                    q11 q11Var = g01Var.T.f48393e;
                    List list = q11.f51222b2;
                    q11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = g01Var.R;
                    long j3 = ((a11) view).f45549e.documentId;
                    tL_emojiStatus.document_id = j3;
                    q11Var.p(view, Long.valueOf(j3), ((a11) g01Var.R).f45549e.document, g01Var.S, num);
                    if (g01Var.S == null) {
                        org.telegram.messenger.ri.d0(q11Var.W).G1(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
