package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g41 implements Utilities.Callback {
    public final int f37184a;
    public final LinkedHashSet f37185b;
    public final Runnable f37186c;

    public g41(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f37184a = i10;
        this.f37185b = linkedHashSet;
        this.f37186c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37184a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f37185b.addAll(arrayList);
                }
                this.f37186c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f37185b.addAll(tL_emojiList.document_id);
                }
                this.f37186c.run();
                return;
        }
    }
}
