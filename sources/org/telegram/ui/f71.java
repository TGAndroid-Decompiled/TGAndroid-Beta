package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class f71 implements Runnable {
    public final int f37661a;
    public final j71 f37662b;
    public final Integer f37663c;

    public f71(j71 j71Var, Integer num, int i10) {
        this.f37661a = i10;
        this.f37662b = j71Var;
        this.f37663c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f37661a;
        j71 j71Var = this.f37662b;
        switch (i10) {
            case 0:
                j71.a(j71Var, this.f37663c);
                return;
            default:
                j71Var.getClass();
                Integer num = this.f37663c;
                if (num != null) {
                    try {
                        j71Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    c61 c61Var = (c61) j71Var;
                    d61 d61Var = c61Var.S;
                    n71 n71Var = d61Var.f36667e;
                    List list = n71.Z1;
                    n71Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = c61Var.Q;
                    long j3 = ((w61) view).f43057e.documentId;
                    tL_emojiStatus.document_id = j3;
                    d61Var.f36667e.p(view, Long.valueOf(j3), ((w61) c61Var.Q).f43057e.document, c61Var.R, num);
                    if (c61Var.R == null) {
                        MediaDataController.getInstance(d61Var.f36667e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
