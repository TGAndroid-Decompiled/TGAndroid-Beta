package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class k51 implements Utilities.Callback {
    public final int f37851a;
    public final LinkedHashSet f37852b;
    public final Runnable f37853c;

    public k51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f37851a = i10;
        this.f37852b = linkedHashSet;
        this.f37853c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37851a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f37852b.addAll(arrayList);
                }
                this.f37853c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f37852b.addAll(tL_emojiList.document_id);
                }
                this.f37853c.run();
                return;
        }
    }
}
