package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q51 implements Utilities.Callback {
    public final int f36694a;
    public final LinkedHashSet f36695b;
    public final Runnable f36696c;

    public q51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f36694a = i10;
        this.f36695b = linkedHashSet;
        this.f36696c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36694a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f36695b.addAll(arrayList);
                }
                this.f36696c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f36695b.addAll(tL_emojiList.document_id);
                }
                this.f36696c.run();
                return;
        }
    }
}
