package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g41 implements Utilities.Callback {
    public final int f37188a;
    public final LinkedHashSet f37189b;
    public final Runnable f37190c;

    public g41(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f37188a = i10;
        this.f37189b = linkedHashSet;
        this.f37190c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37188a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f37189b.addAll(arrayList);
                }
                this.f37190c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f37189b.addAll(tL_emojiList.document_id);
                }
                this.f37190c.run();
                return;
        }
    }
}
