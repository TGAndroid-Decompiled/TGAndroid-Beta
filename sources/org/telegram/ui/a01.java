package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class a01 implements org.telegram.messenger.c20 {
    public final int f43513a;
    public final LinkedHashSet f43514b;
    public final Runnable f43515c;

    public a01(LinkedHashSet linkedHashSet, Runnable runnable, int i7) {
        this.f43513a = i7;
        this.f43514b = linkedHashSet;
        this.f43515c = runnable;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f43513a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f43514b.addAll(arrayList);
                }
                this.f43515c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f43514b.addAll(tL_emojiList.document_id);
                }
                this.f43515c.run();
                return;
        }
    }
}
