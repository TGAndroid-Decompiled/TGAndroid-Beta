package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class q11 implements org.telegram.messenger.r20 {
    public final int f40655a;
    public final LinkedHashSet f40656b;
    public final Runnable f40657c;

    public q11(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f40655a = i10;
        this.f40656b = linkedHashSet;
        this.f40657c = runnable;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f40655a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f40656b.addAll(arrayList);
                }
                this.f40657c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f40656b.addAll(tL_emojiList.document_id);
                }
                this.f40657c.run();
                return;
        }
    }
}
