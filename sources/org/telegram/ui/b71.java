package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class b71 implements Runnable {
    public final int f32291a;
    public final f71 f32292b;
    public final Integer f32293c;

    public b71(f71 f71Var, Integer num, int i10) {
        this.f32291a = i10;
        this.f32292b = f71Var;
        this.f32293c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f32291a;
        f71 f71Var = this.f32292b;
        switch (i10) {
            case 0:
                f71.a(f71Var, this.f32293c);
                return;
            default:
                f71Var.getClass();
                Integer num = this.f32293c;
                if (num != null) {
                    try {
                        f71Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    y51 y51Var = (y51) f71Var;
                    z51 z51Var = y51Var.S;
                    j71 j71Var = z51Var.e;
                    List list = j71.Z1;
                    j71Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = y51Var.Q;
                    long j3 = ((s61) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    z51Var.e.p(view, Long.valueOf(j3), ((s61) y51Var.Q).e.document, y51Var.R, num);
                    if (y51Var.R == null) {
                        MediaDataController.getInstance(z51Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
