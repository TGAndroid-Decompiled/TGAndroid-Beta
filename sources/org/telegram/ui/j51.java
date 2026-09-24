package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j51 implements Utilities.Callback {
    public final int f34631a;
    public final LinkedHashSet f34632b;
    public final Runnable f34633c;

    public j51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f34631a = i10;
        this.f34632b = linkedHashSet;
        this.f34633c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34631a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f34632b.addAll(arrayList);
                }
                this.f34633c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f34632b.addAll(tL_emojiList.document_id);
                }
                this.f34633c.run();
                return;
        }
    }
}
