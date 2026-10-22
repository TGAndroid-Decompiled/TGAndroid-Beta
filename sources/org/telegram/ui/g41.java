package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g41 implements Utilities.Callback {
    public final int f37187a;
    public final LinkedHashSet f37188b;
    public final Runnable f37189c;

    public g41(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f37187a = i10;
        this.f37188b = linkedHashSet;
        this.f37189c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37187a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f37188b.addAll(arrayList);
                }
                this.f37189c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f37188b.addAll(tL_emojiList.document_id);
                }
                this.f37189c.run();
                return;
        }
    }
}
