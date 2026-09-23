package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class i51 implements Utilities.Callback {
    public final int f34030a;
    public final LinkedHashSet f34031b;
    public final Runnable f34032c;

    public i51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f34030a = i10;
        this.f34031b = linkedHashSet;
        this.f34032c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34030a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f34031b.addAll(arrayList);
                }
                this.f34032c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f34031b.addAll(tL_emojiList.document_id);
                }
                this.f34032c.run();
                return;
        }
    }
}
