package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class p51 implements Runnable {
    public final int f40076a;
    public final t51 f40077b;
    public final Integer f40078c;

    public p51(t51 t51Var, Integer num, int i10) {
        this.f40076a = i10;
        this.f40077b = t51Var;
        this.f40078c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f40076a;
        t51 t51Var = this.f40077b;
        switch (i10) {
            case 0:
                t51.a(t51Var, this.f40078c);
                return;
            default:
                t51Var.getClass();
                Integer num = this.f40078c;
                if (num != null) {
                    try {
                        t51Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    m41 m41Var = (m41) t51Var;
                    n41 n41Var = m41Var.S;
                    x51 x51Var = n41Var.e;
                    List list = x51.Z1;
                    x51Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = m41Var.Q;
                    long j10 = ((g51) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    n41Var.e.p(view, Long.valueOf(j10), ((g51) m41Var.Q).e.document, m41Var.R, num);
                    if (m41Var.R == null) {
                        MediaDataController.getInstance(n41Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
