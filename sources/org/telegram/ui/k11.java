package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class k11 implements Runnable {
    public final int f49173a;
    public final o11 f49174b;
    public final Integer f49175c;

    public k11(o11 o11Var, Integer num, int i7) {
        this.f49173a = i7;
        this.f49174b = o11Var;
        this.f49175c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f49173a;
        o11 o11Var = this.f49174b;
        switch (i7) {
            case 0:
                o11.a(o11Var, this.f49175c);
                return;
            default:
                Integer num = this.f49175c;
                if (num != null) {
                    try {
                        o11Var.Q.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    i01 i01Var = (i01) o11Var;
                    s11 s11Var = i01Var.T.f48861e;
                    List list = s11.f51819b2;
                    s11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = i01Var.R;
                    long j3 = ((c11) view).f46384e.documentId;
                    tL_emojiStatus.document_id = j3;
                    s11Var.p(view, Long.valueOf(j3), ((c11) i01Var.R).f46384e.document, i01Var.S, num);
                    if (i01Var.S == null) {
                        org.telegram.messenger.si.d0(s11Var.W).G1(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
