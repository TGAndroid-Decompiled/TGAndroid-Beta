package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class d01 implements org.telegram.messenger.x10 {
    public final int f46845a;
    public final LinkedHashSet f46846b;
    public final Runnable f46847c;

    public d01(LinkedHashSet linkedHashSet, Runnable runnable, int i7) {
        this.f46845a = i7;
        this.f46846b = linkedHashSet;
        this.f46847c = runnable;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f46845a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f46846b.addAll(arrayList);
                }
                this.f46847c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f46846b.addAll(tL_emojiList.document_id);
                }
                this.f46847c.run();
                return;
        }
    }
}
