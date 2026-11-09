package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class k11 implements Runnable {
    public final int f47157a;
    public final o11 f47158b;
    public final Integer f47159c;

    public k11(o11 o11Var, Integer num, int i7) {
        this.f47157a = i7;
        this.f47158b = o11Var;
        this.f47159c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f47157a;
        o11 o11Var = this.f47158b;
        switch (i7) {
            case 0:
                o11.a(o11Var, this.f47159c);
                return;
            default:
                Integer num = this.f47159c;
                if (num != null) {
                    try {
                        o11Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    i01 i01Var = (i01) o11Var;
                    s11 s11Var = i01Var.S.f46808e;
                    List list = s11.f49658a2;
                    s11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = i01Var.Q;
                    long j3 = ((c11) view).f44191e.documentId;
                    tL_emojiStatus.document_id = j3;
                    s11Var.p(view, Long.valueOf(j3), ((c11) i01Var.Q).f44191e.document, i01Var.R, num);
                    if (i01Var.R == null) {
                        org.telegram.messenger.ui.b0(s11Var.V).C1(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
