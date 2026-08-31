package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class j61 implements Runnable {
    public final int f38025a;
    public final n61 f38026b;
    public final Integer f38027c;

    public j61(n61 n61Var, Integer num, int i10) {
        this.f38025a = i10;
        this.f38026b = n61Var;
        this.f38027c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f38025a;
        n61 n61Var = this.f38026b;
        switch (i10) {
            case 0:
                n61.a(n61Var, this.f38027c);
                return;
            default:
                n61Var.getClass();
                Integer num = this.f38027c;
                if (num != null) {
                    try {
                        n61Var.M.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    g51 g51Var = (g51) n61Var;
                    h51 h51Var = g51Var.P;
                    r61 r61Var = h51Var.f37333e;
                    List list = r61.W1;
                    r61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = g51Var.N;
                    long j10 = ((a61) view).f35040e.documentId;
                    tL_emojiStatus.document_id = j10;
                    h51Var.f37333e.p(view, Long.valueOf(j10), ((a61) g51Var.N).f35040e.document, g51Var.O, num);
                    if (g51Var.O == null) {
                        MediaDataController.getInstance(h51Var.f37333e.S).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
