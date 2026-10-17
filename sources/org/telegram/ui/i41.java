package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class i41 implements Utilities.Callback {
    public final int f37738a;
    public final LinkedHashSet f37739b;
    public final Runnable f37740c;

    public i41(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f37738a = i10;
        this.f37739b = linkedHashSet;
        this.f37740c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37738a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f37739b.addAll(arrayList);
                }
                this.f37740c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f37739b.addAll(tL_emojiList.document_id);
                }
                this.f37740c.run();
                return;
        }
    }
}
