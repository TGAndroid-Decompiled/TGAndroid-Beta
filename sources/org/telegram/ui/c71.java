package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class c71 implements Runnable {
    public final int f36617a;
    public final g71 f36618b;
    public final Integer f36619c;

    public c71(g71 g71Var, Integer num, int i10) {
        this.f36617a = i10;
        this.f36618b = g71Var;
        this.f36619c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f36617a;
        g71 g71Var = this.f36618b;
        switch (i10) {
            case 0:
                g71.a(g71Var, this.f36619c);
                return;
            default:
                g71Var.getClass();
                Integer num = this.f36619c;
                if (num != null) {
                    try {
                        g71Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    z51 z51Var = (z51) g71Var;
                    a61 a61Var = z51Var.S;
                    k71 k71Var = a61Var.f35899e;
                    List list = k71.Z1;
                    k71Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = z51Var.Q;
                    long j3 = ((t61) view).f41917e.documentId;
                    tL_emojiStatus.document_id = j3;
                    a61Var.f35899e.p(view, Long.valueOf(j3), ((t61) z51Var.Q).f41917e.document, z51Var.R, num);
                    if (z51Var.R == null) {
                        MediaDataController.getInstance(a61Var.f35899e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
