package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class k41 implements Utilities.Callback {
    public final int f38812a;
    public final LinkedHashSet f38813b;
    public final Runnable f38814c;

    public k41(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f38812a = i10;
        this.f38813b = linkedHashSet;
        this.f38814c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38812a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f38813b.addAll(arrayList);
                }
                this.f38814c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f38813b.addAll(tL_emojiList.document_id);
                }
                this.f38814c.run();
                return;
        }
    }
}
