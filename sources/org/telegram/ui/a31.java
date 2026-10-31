package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class a31 implements Runnable {
    public final int f35540a;
    public final e31 f35541b;
    public final Integer f35542c;

    public a31(e31 e31Var, Integer num, int i10) {
        this.f35540a = i10;
        this.f35541b = e31Var;
        this.f35542c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f35540a;
        e31 e31Var = this.f35541b;
        switch (i10) {
            case 0:
                e31.a(e31Var, this.f35542c);
                return;
            default:
                Integer num = this.f35542c;
                if (num != null) {
                    try {
                        e31Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    y11 y11Var = (y11) e31Var;
                    i31 i31Var = y11Var.S.e;
                    List list = i31.a2;
                    i31Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = y11Var.Q;
                    long j10 = ((s21) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    i31Var.p(view, Long.valueOf(j10), ((s21) y11Var.Q).e.document, y11Var.R, num);
                    if (y11Var.R == null) {
                        org.telegram.messenger.ui.b0(i31Var.V).C1(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
