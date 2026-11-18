package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class c01 implements org.telegram.messenger.x10 {
    public final int f46358a;
    public final LinkedHashSet f46359b;
    public final Runnable f46360c;

    public c01(LinkedHashSet linkedHashSet, Runnable runnable, int i7) {
        this.f46358a = i7;
        this.f46359b = linkedHashSet;
        this.f46360c = runnable;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f46358a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f46359b.addAll(arrayList);
                }
                this.f46360c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f46359b.addAll(tL_emojiList.document_id);
                }
                this.f46360c.run();
                return;
        }
    }
}
