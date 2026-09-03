package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e51 implements Utilities.Callback {
    public final int f36372a;
    public final LinkedHashSet f36373b;
    public final Runnable f36374c;

    public e51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f36372a = i10;
        this.f36373b = linkedHashSet;
        this.f36374c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36372a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f36373b.addAll(arrayList);
                }
                this.f36374c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f36373b.addAll(tL_emojiList.document_id);
                }
                this.f36374c.run();
                return;
        }
    }
}
