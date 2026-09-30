package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j51 implements Utilities.Callback {
    public final int f34647a;
    public final LinkedHashSet f34648b;
    public final Runnable f34649c;

    public j51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f34647a = i10;
        this.f34648b = linkedHashSet;
        this.f34649c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34647a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f34648b.addAll(arrayList);
                }
                this.f34649c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f34648b.addAll(tL_emojiList.document_id);
                }
                this.f34649c.run();
                return;
        }
    }
}
