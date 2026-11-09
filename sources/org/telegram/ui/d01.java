package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class d01 implements org.telegram.messenger.c20 {
    public final int f44789a;
    public final LinkedHashSet f44790b;
    public final Runnable f44791c;

    public d01(LinkedHashSet linkedHashSet, Runnable runnable, int i7) {
        this.f44789a = i7;
        this.f44790b = linkedHashSet;
        this.f44791c = runnable;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f44789a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f44790b.addAll(arrayList);
                }
                this.f44791c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f44790b.addAll(tL_emojiList.document_id);
                }
                this.f44791c.run();
                return;
        }
    }
}
