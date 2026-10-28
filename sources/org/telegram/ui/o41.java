package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o41 implements Utilities.Callback {
    public final int f41968a;
    public final LinkedHashSet f41969b;
    public final Runnable f41970c;

    public o41(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f41968a = i10;
        this.f41969b = linkedHashSet;
        this.f41970c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41968a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f41969b.addAll(arrayList);
                }
                this.f41970c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f41969b.addAll(tL_emojiList.document_id);
                }
                this.f41970c.run();
                return;
        }
    }
}
