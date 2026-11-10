package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class e01 implements org.telegram.messenger.c20 {
    public final int f45087a;
    public final LinkedHashSet f45088b;
    public final Runnable f45089c;

    public e01(LinkedHashSet linkedHashSet, Runnable runnable, int i7) {
        this.f45087a = i7;
        this.f45088b = linkedHashSet;
        this.f45089c = runnable;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f45087a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f45088b.addAll(arrayList);
                }
                this.f45089c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f45088b.addAll(tL_emojiList.document_id);
                }
                this.f45089c.run();
                return;
        }
    }
}
