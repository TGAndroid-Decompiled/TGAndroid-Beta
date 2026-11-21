package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class k11 implements Runnable {
    public final int f49169a;
    public final o11 f49170b;
    public final Integer f49171c;

    public k11(o11 o11Var, Integer num, int i7) {
        this.f49169a = i7;
        this.f49170b = o11Var;
        this.f49171c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f49169a;
        o11 o11Var = this.f49170b;
        switch (i7) {
            case 0:
                o11.a(o11Var, this.f49171c);
                return;
            default:
                Integer num = this.f49171c;
                if (num != null) {
                    try {
                        o11Var.Q.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    i01 i01Var = (i01) o11Var;
                    s11 s11Var = i01Var.T.f48857e;
                    List list = s11.f51815b2;
                    s11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = i01Var.R;
                    long j3 = ((c11) view).f46381e.documentId;
                    tL_emojiStatus.document_id = j3;
                    s11Var.p(view, Long.valueOf(j3), ((c11) i01Var.R).f46381e.document, i01Var.S, num);
                    if (i01Var.S == null) {
                        org.telegram.messenger.ri.d0(s11Var.W).G1(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
