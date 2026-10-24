package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j41 implements Utilities.Callback {
    public final int f38454a;
    public final LinkedHashSet f38455b;
    public final Runnable f38456c;

    public j41(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f38454a = i10;
        this.f38455b = linkedHashSet;
        this.f38456c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38454a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f38455b.addAll(arrayList);
                }
                this.f38456c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f38455b.addAll(tL_emojiList.document_id);
                }
                this.f38456c.run();
                return;
        }
    }
}
