package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class i41 implements Utilities.Callback {
    public final int f37752a;
    public final LinkedHashSet f37753b;
    public final Runnable f37754c;

    public i41(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f37752a = i10;
        this.f37753b = linkedHashSet;
        this.f37754c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37752a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f37753b.addAll(arrayList);
                }
                this.f37754c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f37753b.addAll(tL_emojiList.document_id);
                }
                this.f37754c.run();
                return;
        }
    }
}
