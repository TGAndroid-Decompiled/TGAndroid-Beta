package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p51 implements Utilities.Callback {
    public final int f36439a;
    public final LinkedHashSet f36440b;
    public final Runnable f36441c;

    public p51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f36439a = i10;
        this.f36440b = linkedHashSet;
        this.f36441c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36439a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f36440b.addAll(arrayList);
                }
                this.f36441c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f36440b.addAll(tL_emojiList.document_id);
                }
                this.f36441c.run();
                return;
        }
    }
}
