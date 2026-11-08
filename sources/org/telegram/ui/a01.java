package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class a01 implements org.telegram.messenger.c20 {
    public final int f43516a;
    public final LinkedHashSet f43517b;
    public final Runnable f43518c;

    public a01(LinkedHashSet linkedHashSet, Runnable runnable, int i7) {
        this.f43516a = i7;
        this.f43517b = linkedHashSet;
        this.f43518c = runnable;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f43516a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f43517b.addAll(arrayList);
                }
                this.f43518c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f43517b.addAll(tL_emojiList.document_id);
                }
                this.f43518c.run();
                return;
        }
    }
}
