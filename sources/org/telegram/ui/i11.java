package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class i11 implements Runnable {
    public final int f46548a;
    public final m11 f46549b;
    public final Integer f46550c;

    public i11(m11 m11Var, Integer num, int i7) {
        this.f46548a = i7;
        this.f46549b = m11Var;
        this.f46550c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f46548a;
        m11 m11Var = this.f46549b;
        switch (i7) {
            case 0:
                m11.a(m11Var, this.f46550c);
                return;
            default:
                Integer num = this.f46550c;
                if (num != null) {
                    try {
                        m11Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    g01 g01Var = (g01) m11Var;
                    q11 q11Var = g01Var.S.f46179e;
                    List list = q11.f49012a2;
                    q11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = g01Var.Q;
                    long j3 = ((a11) view).f43532e.documentId;
                    tL_emojiStatus.document_id = j3;
                    q11Var.p(view, Long.valueOf(j3), ((a11) g01Var.Q).f43532e.document, g01Var.R, num);
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
