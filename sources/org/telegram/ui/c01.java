package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class c01 implements org.telegram.messenger.x10 {
    public final int f46349a;
    public final LinkedHashSet f46350b;
    public final Runnable f46351c;

    public c01(LinkedHashSet linkedHashSet, Runnable runnable, int i7) {
        this.f46349a = i7;
        this.f46350b = linkedHashSet;
        this.f46351c = runnable;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f46349a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f46350b.addAll(arrayList);
                }
                this.f46351c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f46350b.addAll(tL_emojiList.document_id);
                }
                this.f46351c.run();
                return;
        }
    }
}
