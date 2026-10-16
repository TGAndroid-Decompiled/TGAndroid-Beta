package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a61 implements Utilities.Callback {
    public final int f33759a;
    public final LinkedHashSet f33760b;
    public final Runnable f33761c;

    public a61(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f33759a = i10;
        this.f33760b = linkedHashSet;
        this.f33761c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33759a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f33760b.addAll(arrayList);
                }
                this.f33761c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f33760b.addAll(tL_emojiList.document_id);
                }
                this.f33761c.run();
                return;
        }
    }
}
