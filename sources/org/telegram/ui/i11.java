package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class i11 implements Runnable {
    public final int f46549a;
    public final m11 f46550b;
    public final Integer f46551c;

    public i11(m11 m11Var, Integer num, int i7) {
        this.f46549a = i7;
        this.f46550b = m11Var;
        this.f46551c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f46549a;
        m11 m11Var = this.f46550b;
        switch (i7) {
            case 0:
                m11.a(m11Var, this.f46551c);
                return;
            default:
                Integer num = this.f46551c;
                if (num != null) {
                    try {
                        m11Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    g01 g01Var = (g01) m11Var;
                    q11 q11Var = g01Var.S.f46180e;
                    List list = q11.f49013a2;
                    q11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = g01Var.Q;
                    long j3 = ((a11) view).f43533e.documentId;
                    tL_emojiStatus.document_id = j3;
                    q11Var.p(view, Long.valueOf(j3), ((a11) g01Var.Q).f43533e.document, g01Var.R, num);
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
