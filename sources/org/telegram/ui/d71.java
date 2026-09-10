package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class d71 implements Runnable {
    public final int f31852a;
    public final h71 f31853b;
    public final Integer f31854c;

    public d71(h71 h71Var, Integer num, int i10) {
        this.f31852a = i10;
        this.f31853b = h71Var;
        this.f31854c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f31852a;
        h71 h71Var = this.f31853b;
        switch (i10) {
            case 0:
                h71.a(h71Var, this.f31854c);
                return;
            default:
                h71Var.getClass();
                Integer num = this.f31854c;
                if (num != null) {
                    try {
                        h71Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    a61 a61Var = (a61) h71Var;
                    b61 b61Var = a61Var.S;
                    l71 l71Var = b61Var.e;
                    List list = l71.Z1;
                    l71Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = a61Var.Q;
                    long j3 = ((u61) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    b61Var.e.p(view, Long.valueOf(j3), ((u61) a61Var.Q).e.document, a61Var.R, num);
                    if (a61Var.R == null) {
                        MediaDataController.getInstance(b61Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
