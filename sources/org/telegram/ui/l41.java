package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l41 implements Utilities.Callback {
    public final int f40037a;
    public final LinkedHashSet f40038b;
    public final Runnable f40039c;

    public l41(LinkedHashSet linkedHashSet, Runnable runnable, int i9) {
        this.f40037a = i9;
        this.f40038b = linkedHashSet;
        this.f40039c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40037a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f40038b.addAll(arrayList);
                }
                this.f40039c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f40038b.addAll(tL_emojiList.document_id);
                }
                this.f40039c.run();
                return;
        }
    }
}
