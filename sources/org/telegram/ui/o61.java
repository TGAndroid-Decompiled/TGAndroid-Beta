package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class o61 implements Runnable {
    public final int f39549a;
    public final s61 f39550b;
    public final Integer f39551c;

    public o61(s61 s61Var, Integer num, int i10) {
        this.f39549a = i10;
        this.f39550b = s61Var;
        this.f39551c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f39549a;
        s61 s61Var = this.f39550b;
        switch (i10) {
            case 0:
                s61.a(s61Var, this.f39551c);
                return;
            default:
                s61Var.getClass();
                Integer num = this.f39551c;
                if (num != null) {
                    try {
                        s61Var.M.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    l51 l51Var = (l51) s61Var;
                    m51 m51Var = l51Var.P;
                    w61 w61Var = m51Var.f38860e;
                    List list = w61.W1;
                    w61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = l51Var.N;
                    long j10 = ((f61) view).f36680e.documentId;
                    tL_emojiStatus.document_id = j10;
                    m51Var.f38860e.p(view, Long.valueOf(j10), ((f61) l51Var.N).f36680e.document, l51Var.O, num);
                    if (l51Var.O == null) {
                        MediaDataController.getInstance(m51Var.f38860e.S).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
