package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m51 implements Utilities.Callback {
    public final int f38423a;
    public final LinkedHashSet f38424b;
    public final Runnable f38425c;

    public m51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f38423a = i10;
        this.f38424b = linkedHashSet;
        this.f38425c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38423a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f38424b.addAll(arrayList);
                }
                this.f38425c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f38424b.addAll(tL_emojiList.document_id);
                }
                this.f38425c.run();
                return;
        }
    }
}
