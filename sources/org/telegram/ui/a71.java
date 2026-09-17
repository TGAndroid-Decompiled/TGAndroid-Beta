package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class a71 implements Runnable {
    public final int f31753a;
    public final e71 f31754b;
    public final Integer f31755c;

    public a71(e71 e71Var, Integer num, int i10) {
        this.f31753a = i10;
        this.f31754b = e71Var;
        this.f31755c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f31753a;
        e71 e71Var = this.f31754b;
        switch (i10) {
            case 0:
                e71.a(e71Var, this.f31755c);
                return;
            default:
                e71Var.getClass();
                Integer num = this.f31755c;
                if (num != null) {
                    try {
                        e71Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    x51 x51Var = (x51) e71Var;
                    y51 y51Var = x51Var.S;
                    i71 i71Var = y51Var.e;
                    List list = i71.Z1;
                    i71Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = x51Var.Q;
                    long j3 = ((r61) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    y51Var.e.p(view, Long.valueOf(j3), ((r61) x51Var.Q).e.document, x51Var.R, num);
                    if (x51Var.R == null) {
                        MediaDataController.getInstance(y51Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
