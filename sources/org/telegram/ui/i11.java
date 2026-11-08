package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class i11 implements Runnable {
    public final int f46547a;
    public final m11 f46548b;
    public final Integer f46549c;

    public i11(m11 m11Var, Integer num, int i7) {
        this.f46547a = i7;
        this.f46548b = m11Var;
        this.f46549c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f46547a;
        m11 m11Var = this.f46548b;
        switch (i7) {
            case 0:
                m11.a(m11Var, this.f46549c);
                return;
            default:
                Integer num = this.f46549c;
                if (num != null) {
                    try {
                        m11Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    g01 g01Var = (g01) m11Var;
                    q11 q11Var = g01Var.S.f46181e;
                    List list = q11.f49015a2;
                    q11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = g01Var.Q;
                    long j3 = ((a11) view).f43535e.documentId;
                    tL_emojiStatus.document_id = j3;
                    q11Var.p(view, Long.valueOf(j3), ((a11) g01Var.Q).f43535e.document, g01Var.R, num);
                    if (g01Var.R == null) {
                        org.telegram.messenger.ui.b0(q11Var.V).C1(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
