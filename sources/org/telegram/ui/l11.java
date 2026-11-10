package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class l11 implements Runnable {
    public final int f47486a;
    public final p11 f47487b;
    public final Integer f47488c;

    public l11(p11 p11Var, Integer num, int i7) {
        this.f47486a = i7;
        this.f47487b = p11Var;
        this.f47488c = num;
    }

    @Override
    public final void run() {
        int i7 = this.f47486a;
        p11 p11Var = this.f47487b;
        switch (i7) {
            case 0:
                p11.a(p11Var, this.f47488c);
                return;
            default:
                Integer num = this.f47488c;
                if (num != null) {
                    try {
                        p11Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    j01 j01Var = (j01) p11Var;
                    t11 t11Var = j01Var.S.f47131e;
                    List list = t11.f50014a2;
                    t11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = j01Var.Q;
                    long j3 = ((d11) view).f44874e.documentId;
                    tL_emojiStatus.document_id = j3;
                    t11Var.p(view, Long.valueOf(j3), ((d11) j01Var.Q).f44874e.document, j01Var.R, num);
                    if (j01Var.R == null) {
                        org.telegram.messenger.ui.b0(t11Var.V).C1(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
