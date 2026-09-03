package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class o61 implements Runnable {
    public final int f36663a;
    public final t61 f36664b;
    public final Integer f36665c;

    public o61(t61 t61Var, Integer num, int i10) {
        this.f36663a = i10;
        this.f36664b = t61Var;
        this.f36665c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f36663a;
        t61 t61Var = this.f36664b;
        switch (i10) {
            case 0:
                t61.a(t61Var, this.f36665c);
                return;
            default:
                t61Var.getClass();
                Integer num = this.f36665c;
                if (num != null) {
                    try {
                        t61Var.M.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    l51 l51Var = (l51) t61Var;
                    m51 m51Var = l51Var.P;
                    x61 x61Var = m51Var.e;
                    List list = x61.W1;
                    x61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = l51Var.N;
                    long j10 = ((f61) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    m51Var.e.p(view, Long.valueOf(j10), ((f61) l51Var.N).e.document, l51Var.O, num);
                    if (l51Var.O == null) {
                        MediaDataController.getInstance(m51Var.e.S).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
