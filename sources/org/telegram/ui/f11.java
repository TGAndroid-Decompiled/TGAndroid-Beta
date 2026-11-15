package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class f11 implements Runnable {
    public final int f46951a;
    public final j11 f46952b;
    public final Integer f46953c;

    public f11(j11 j11Var, Integer num, int i7) {
        this.f46951a = i7;
        this.f46952b = j11Var;
        this.f46953c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f46951a;
        j11 j11Var = this.f46952b;
        switch (i7) {
            case 0:
                j11.a(j11Var, this.f46953c);
                return;
            default:
                Integer num = this.f46953c;
                if (num != null) {
                    try {
                        j11Var.Q.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    d01 d01Var = (d01) j11Var;
                    n11 n11Var = d01Var.T.f46509e;
                    List list = n11.f49360b2;
                    n11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = d01Var.R;
                    long j3 = ((x01) view).f53056e.documentId;
                    tL_emojiStatus.document_id = j3;
                    n11Var.p(view, Long.valueOf(j3), ((x01) d01Var.R).f53056e.document, d01Var.S, num);
                    if (d01Var.S == null) {
                        org.telegram.messenger.si.b0(n11Var.W).C1(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
