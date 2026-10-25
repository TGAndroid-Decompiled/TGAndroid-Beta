package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l41 implements Utilities.Callback {
    public final int f41133a;
    public final LinkedHashSet f41134b;
    public final Runnable f41135c;

    public l41(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f41133a = i10;
        this.f41134b = linkedHashSet;
        this.f41135c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41133a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f41134b.addAll(arrayList);
                }
                this.f41135c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f41134b.addAll(tL_emojiList.document_id);
                }
                this.f41135c.run();
                return;
        }
    }
}
