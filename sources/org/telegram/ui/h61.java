package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class h61 implements Runnable {
    public final int f34771a;
    public final m61 f34772b;
    public final Integer f34773c;

    public h61(m61 m61Var, Integer num, int i10) {
        this.f34771a = i10;
        this.f34772b = m61Var;
        this.f34773c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f34771a;
        m61 m61Var = this.f34772b;
        switch (i10) {
            case 0:
                m61.a(m61Var, this.f34773c);
                return;
            default:
                m61Var.getClass();
                Integer num = this.f34773c;
                if (num != null) {
                    try {
                        m61Var.M.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    e51 e51Var = (e51) m61Var;
                    f51 f51Var = e51Var.P;
                    q61 q61Var = f51Var.e;
                    List list = q61.W1;
                    q61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = e51Var.N;
                    long j10 = ((y51) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    f51Var.e.p(view, Long.valueOf(j10), ((y51) e51Var.N).e.document, e51Var.O, num);
                    if (e51Var.O == null) {
                        MediaDataController.getInstance(f51Var.e.S).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
