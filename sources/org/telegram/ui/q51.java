package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q51 implements Utilities.Callback {
    public final int f36762a;
    public final LinkedHashSet f36763b;
    public final Runnable f36764c;

    public q51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f36762a = i10;
        this.f36763b = linkedHashSet;
        this.f36764c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36762a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f36763b.addAll(arrayList);
                }
                this.f36764c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f36763b.addAll(tL_emojiList.document_id);
                }
                this.f36764c.run();
                return;
        }
    }
}
