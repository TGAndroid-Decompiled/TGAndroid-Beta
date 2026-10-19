package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g41 implements Utilities.Callback {
    public final int f37183a;
    public final LinkedHashSet f37184b;
    public final Runnable f37185c;

    public g41(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f37183a = i10;
        this.f37184b = linkedHashSet;
        this.f37185c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37183a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f37184b.addAll(arrayList);
                }
                this.f37185c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f37184b.addAll(tL_emojiList.document_id);
                }
                this.f37185c.run();
                return;
        }
    }
}
