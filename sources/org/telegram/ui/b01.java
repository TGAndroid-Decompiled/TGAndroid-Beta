package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class b01 implements org.telegram.messenger.w10 {
    public final int f45872a;
    public final LinkedHashSet f45873b;
    public final Runnable f45874c;

    public b01(LinkedHashSet linkedHashSet, Runnable runnable, int i7) {
        this.f45872a = i7;
        this.f45873b = linkedHashSet;
        this.f45874c = runnable;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f45872a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f45873b.addAll(arrayList);
                }
                this.f45874c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f45873b.addAll(tL_emojiList.document_id);
                }
                this.f45874c.run();
                return;
        }
    }
}
