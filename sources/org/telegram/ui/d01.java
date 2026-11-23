package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class d01 implements org.telegram.messenger.y10 {
    public final int f46848a;
    public final LinkedHashSet f46849b;
    public final Runnable f46850c;

    public d01(LinkedHashSet linkedHashSet, Runnable runnable, int i7) {
        this.f46848a = i7;
        this.f46849b = linkedHashSet;
        this.f46850c = runnable;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f46848a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f46849b.addAll(arrayList);
                }
                this.f46850c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f46849b.addAll(tL_emojiList.document_id);
                }
                this.f46850c.run();
                return;
        }
    }
}
