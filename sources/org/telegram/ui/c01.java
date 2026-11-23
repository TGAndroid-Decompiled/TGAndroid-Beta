package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class c01 implements org.telegram.messenger.y10 {
    public final int f46368a;
    public final LinkedHashSet f46369b;
    public final Runnable f46370c;

    public c01(LinkedHashSet linkedHashSet, Runnable runnable, int i7) {
        this.f46368a = i7;
        this.f46369b = linkedHashSet;
        this.f46370c = runnable;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f46368a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f46369b.addAll(arrayList);
                }
                this.f46370c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f46369b.addAll(tL_emojiList.document_id);
                }
                this.f46370c.run();
                return;
        }
    }
}
