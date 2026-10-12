package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class j71 implements Runnable {
    public final int f37299a;
    public final n71 f37300b;
    public final Integer f37301c;

    public j71(n71 n71Var, Integer num, int i10) {
        this.f37299a = i10;
        this.f37300b = n71Var;
        this.f37301c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f37299a;
        n71 n71Var = this.f37300b;
        switch (i10) {
            case 0:
                n71.a(n71Var, this.f37301c);
                return;
            default:
                n71Var.getClass();
                Integer num = this.f37301c;
                if (num != null) {
                    try {
                        n71Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    g61 g61Var = (g61) n71Var;
                    h61 h61Var = g61Var.S;
                    r71 r71Var = h61Var.e;
                    List list = r71.Z1;
                    r71Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = g61Var.Q;
                    long j10 = ((a71) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    h61Var.e.p(view, Long.valueOf(j10), ((a71) g61Var.Q).e.document, g61Var.R, num);
                    if (g61Var.R == null) {
                        MediaDataController.getInstance(h61Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
