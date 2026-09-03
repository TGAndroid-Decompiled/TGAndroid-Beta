package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e51 implements Utilities.Callback {
    public final int f33613a;
    public final LinkedHashSet f33614b;
    public final Runnable f33615c;

    public e51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f33613a = i10;
        this.f33614b = linkedHashSet;
        this.f33615c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33613a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f33614b.addAll(arrayList);
                }
                this.f33615c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f33614b.addAll(tL_emojiList.document_id);
                }
                this.f33615c.run();
                return;
        }
    }
}
