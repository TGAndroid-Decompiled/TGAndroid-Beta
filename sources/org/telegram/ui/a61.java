package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a61 implements Utilities.Callback {
    public final int f34056a;
    public final LinkedHashSet f34057b;
    public final Runnable f34058c;

    public a61(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f34056a = i10;
        this.f34057b = linkedHashSet;
        this.f34058c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34056a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f34057b.addAll(arrayList);
                }
                this.f34058c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f34057b.addAll(tL_emojiList.document_id);
                }
                this.f34058c.run();
                return;
        }
    }
}
