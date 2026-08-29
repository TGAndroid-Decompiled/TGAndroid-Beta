package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n41 implements Utilities.Callback {
    public final int f40709a;
    public final LinkedHashSet f40710b;
    public final Runnable f40711c;

    public n41(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f40709a = i10;
        this.f40710b = linkedHashSet;
        this.f40711c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40709a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f40710b.addAll(arrayList);
                }
                this.f40711c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f40710b.addAll(tL_emojiList.document_id);
                }
                this.f40711c.run();
                return;
        }
    }
}
